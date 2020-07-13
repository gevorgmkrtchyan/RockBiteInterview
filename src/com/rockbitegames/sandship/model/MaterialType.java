package com.rockbitegames.sandship.model;

import java.util.List;

public class MaterialType extends BaseEntity{
    private String name;
    private String icon;
    private int maxCapacity;
    private List<Material> materials;

    public MaterialType(Long id, String name, String icon, int maxCapacity, List<Material> materials) {
        super(id);
        this.name = name;
        this.icon = icon;
        this.maxCapacity = maxCapacity;
        this.materials = materials;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public List<Material> getMaterials() {
        return materials;
    }

    public void setMaterials(List<Material> materials) {
        this.materials = materials;
    }
}
