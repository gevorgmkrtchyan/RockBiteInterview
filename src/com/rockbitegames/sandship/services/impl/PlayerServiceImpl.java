package com.rockbitegames.sandship.services.impl;

import com.rockbitegames.sandship.model.Player;
import com.rockbitegames.sandship.services.CrudService;
import com.rockbitegames.sandship.services.PlayerService;

import java.util.LinkedList;
import java.util.List;

public class PlayerServiceImpl implements PlayerService {
    //Insertion an Deletion methods are faster in LinkedList than in ArrayList
    private List<Player> players = new LinkedList<>();

    @Override
    public List<Player> findAll() {
        return players;
    }

    @Override
    public Player findById(Long aLong) {
        for (Player player: players){
            if (player.getId().equals(aLong)){
                return player;
            }else {
                throw new RuntimeException("the id value doesn't match");
            }
        }
        return null;
    }

    @Override
    public Player save(Player object) {
        players.add(object);
        return object;
    }

    @Override
    public void delete(Player object) {
        for (Player player: players){
            if (object.equals(player)){
                players.remove(object);
            }
        }
    }

    @Override
    public void deleteById(Long aLong) {
        for (Player player: players){
            if (player.getId().equals(aLong)){
                players.remove(aLong.intValue());
            }
        }
    }
}
