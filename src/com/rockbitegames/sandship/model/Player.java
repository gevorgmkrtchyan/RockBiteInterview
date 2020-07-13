package com.rockbitegames.sandship.model;

import java.util.List;


//with Builder design pattern
public class Player extends BaseEntity{
    private final String firstName;
    private final String lastName;
    private final String nickName;
    private final List<Warehouse> warehouses;

    private Player(Long id, String firstName, String lastName, String nickName, List<Warehouse> warehouses) {
        super(id);
        this.firstName = firstName;
        this.lastName = lastName;
        this.nickName = nickName;
        this.warehouses = warehouses;
    }
    public static class PlayerBuilder{
        private  String firstName;
        private  String lastName;
        private  String nickName;
        private  List<Warehouse> warehouses;

        public PlayerBuilder(String nickName, List<Warehouse> warehouses) {

            this.nickName = nickName;
            this.warehouses = warehouses;
        }

        public PlayerBuilder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public PlayerBuilder  setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }
        public Player build(){
            return new Player(1L,firstName,lastName,nickName,warehouses);
        }
    }

}
