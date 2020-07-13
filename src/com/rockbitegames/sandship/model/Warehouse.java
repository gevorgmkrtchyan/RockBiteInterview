package com.rockbitegames.sandship.model;

import java.util.List;

public class Warehouse extends BaseEntity {
    private String name;
    private List<Material> materials;

    public Warehouse(Long id, String name, List<Material> materials) {
        super(id);
        this.name = name;
        this.materials = materials;
    }

    public List<Material> getMaterials() {
        return materials;
    }

    public void setMaterials(List<Material> materials) {
        this.materials = materials;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
