package com.rockbitegames.sandship.services.impl;

import com.rockbitegames.sandship.model.Warehouse;
import com.rockbitegames.sandship.services.CrudService;
import com.rockbitegames.sandship.services.WarehouseService;

import java.util.LinkedList;
import java.util.List;

public class WarehouseServiceImpl implements WarehouseService {
    //Insertion an Deletion methods are faster in LinkedList than in ArrayList
    private List<Warehouse> warehouses = new LinkedList<>();

    @Override
    public List<Warehouse> findAll() {
        return warehouses;
    }

    @Override
    public Warehouse findById(Long aLong) {
        for (Warehouse warehouse: warehouses){
            if (warehouse.getId().equals(aLong)){
                return warehouse;
            }else {
                throw new RuntimeException("the id value doesn't match");
            }
        }
        return null;
    }

    @Override
    public Warehouse save(Warehouse object) {
        warehouses.add(object);
        return object;
    }

    @Override
    public void delete(Warehouse object) {
        for (Warehouse player: warehouses){
            if (object.equals(player)){
                warehouses.remove(object);
            }
        }
    }

    @Override
    public void deleteById(Long aLong) {
        for (Warehouse player: warehouses){
            if (player.getId().equals(aLong)){
                warehouses.remove(aLong.intValue());
            }
        }
    }

    @Override
    public int getQuantityOfMaterials(Warehouse warehouse) {
        return warehouse.getMaterials().size();
    }
}
