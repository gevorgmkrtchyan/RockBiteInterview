package com.rockbitegames.sandship.services;

import com.rockbitegames.sandship.model.Warehouse;

public interface WarehouseService extends CrudService<Warehouse, Long> {
    int getQuantityOfMaterials(Warehouse warehouse);
}
