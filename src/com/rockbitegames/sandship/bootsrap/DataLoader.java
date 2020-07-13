package com.rockbitegames.sandship.bootsrap;

import com.rockbitegames.sandship.model.Material;
import com.rockbitegames.sandship.model.MaterialType;
import com.rockbitegames.sandship.model.Player;
import com.rockbitegames.sandship.model.Warehouse;
import com.rockbitegames.sandship.services.MaterialService;
import com.rockbitegames.sandship.services.MaterialTypeService;
import com.rockbitegames.sandship.services.PlayerService;
import com.rockbitegames.sandship.services.WarehouseService;
import com.rockbitegames.sandship.services.impl.MaterialServiceImpl;
import com.rockbitegames.sandship.services.impl.MaterialTypeServiceImpl;
import com.rockbitegames.sandship.services.impl.PlayerServiceImpl;
import com.rockbitegames.sandship.services.impl.WarehouseServiceImpl;

import java.util.LinkedList;
import java.util.List;

public class DataLoader {
    private  PlayerService playerService;
    private  MaterialService materialService;
    private  MaterialTypeService materialTypeService;
    private  WarehouseService warehouseService;

    public DataLoader(PlayerService playerService, MaterialService materialService, MaterialTypeService materialTypeService, WarehouseService warehouseService) {
        this.playerService = playerService;
        this.materialService = materialService;
        this.materialTypeService = materialTypeService;
        this.warehouseService = warehouseService;
    }
    public void loadData(){
        //Player
        Player p1 = playerService.save(new Player.PlayerBuilder("1gev1",warehouseService.findAll())
        .setFirstName("Gevorg")
        .setLastName("Mkrtchyan")
        .build());
        //Types
        MaterialType materialType1 = materialTypeService.save(new MaterialType(1L,"Iron","some icon",500,materialService.findAll()));
        MaterialType materialType2 = materialTypeService.save( new MaterialType(2L,"Plastic","some icon",200,materialService.findAll()));
        MaterialType materialType3 = materialTypeService.save( new MaterialType(3L,"Plastic","some icon",400,materialService.findAll()));

        //Materials
        Material material1 = materialService.save(new Material(1L,"key","this is an iron key","some icon",
                5,materialType1));
        Material material2 = materialService.save(new Material(2L,"hummer","this is an iron hummer","some icon",
                15,materialType1));
        Material material3 =materialService.save( new Material(3L,"bottle","this is an plastic bottle","some icon",
                12,materialType2));
        Material material4 = materialService.save(new Material(3L,"keyboard","this is an plastic keyboard","some icon",
                12,materialType2));



        //Warehouse
        Warehouse warehouse1 = warehouseService.save(new Warehouse(1L,"firs_warehouse",materialService.findAll()));
    }

    public static void main(String[] args) {

    }
}
