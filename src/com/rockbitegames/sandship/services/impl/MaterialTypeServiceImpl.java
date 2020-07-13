package com.rockbitegames.sandship.services.impl;

import com.rockbitegames.sandship.model.Material;
import com.rockbitegames.sandship.model.MaterialType;
import com.rockbitegames.sandship.services.CrudService;
import com.rockbitegames.sandship.services.MaterialTypeService;

import java.util.LinkedList;
import java.util.List;

public class MaterialTypeServiceImpl implements MaterialTypeService {
    //Insertion an Deletion methods are faster in LinkedList than in ArrayList
    private List<MaterialType> materialTypes = new LinkedList<>();
    @Override
    public List<MaterialType> findAll() {
        return materialTypes;
    }

    @Override
    public MaterialType findById(Long aLong) {
        for (MaterialType materialType: materialTypes){
            if (materialType.getId().equals(aLong)){
                return materialType;
            }else {
                throw new RuntimeException("the id value doesn't match");
            }
        }
        return null;
    }

    @Override
    public MaterialType save(MaterialType object) {
        materialTypes.add(object);
        return object;
    }

    @Override
    public void delete(MaterialType object) {
        for (MaterialType materialType: materialTypes){
            if (object.equals(materialType)){
                materialTypes.remove(object);
            }
        }
    }

    @Override
    public void deleteById(Long aLong) {
        for (MaterialType player: materialTypes){
            if (player.getId().equals(aLong)){
                materialTypes.remove(aLong.intValue());
            }
        }
    }
}
