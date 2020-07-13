package com.rockbitegames.sandship.services;

import com.rockbitegames.sandship.model.Material;
import com.rockbitegames.sandship.model.Warehouse;

public interface MaterialService extends CrudService<Material, Long> {
    //the exception will thrown if...

    void moveTheMaterialFromOneWarehouseToAnother(Warehouse w1, Warehouse w2);
}
