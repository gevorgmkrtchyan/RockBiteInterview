package com.rockbitegames.sandship.services.impl;

import com.rockbitegames.sandship.model.Material;
import com.rockbitegames.sandship.model.Warehouse;
import com.rockbitegames.sandship.services.MaterialService;

import java.util.LinkedList;
import java.util.List;

public class MaterialServiceImpl implements MaterialService {
    //Insertion an Deletion methods are faster in LinkedList than in ArrayList

    private List<Material> materials = new LinkedList<>();
    @Override
    public void moveTheMaterialFromOneWarehouseToAnother(Warehouse w1, Warehouse w2) {
        //not implemented
        //need to check max capacities for allowing
    }

    @Override
    public List<Material> findAll() {
        return materials;
    }

    @Override
    public Material findById(Long aLong) {
        for (Material material: materials){
            if (material.getId().equals(aLong)){
                return material;
            }else {
                throw new RuntimeException("the id value doesn't match");
            }
        }
        return null;
    }

    @Override
    public Material save(Material object) {
        materials.add(object);
        return object;
    }

    @Override
    public void delete(Material object) {
        for (Material material: materials){
            if (object.equals(material)){
                materials.remove(object);
            }
        }
    }

    @Override
    public void deleteById(Long aLong) {
        for (Material material: materials){
            if (material.getId().equals(aLong)){
                materials.remove(aLong.intValue());
            }
        }
    }
}
