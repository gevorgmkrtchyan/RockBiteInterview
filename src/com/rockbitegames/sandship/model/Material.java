package com.rockbitegames.sandship.model;

public class Material extends BaseEntity {
    private String name;
    private String description;
    private String icon;
    private int maxCapacity;
    private MaterialType type;

    public Material(Long id, String name, String description, String icon, int maxCapacity, MaterialType type) {
        super(id);
        this.name = name;
        this.description = description;
        this.icon = icon;
        this.maxCapacity = maxCapacity;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public MaterialType getType() {
        return type;
    }

    public void setType(MaterialType type) {
        this.type = type;
    }
}
