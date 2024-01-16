package org.example.model.entity;

import jakarta.persistence.*;
import org.example.model.entity.enums.ModelCategoryEnum;

@Entity
@Table(name = "models")
public class ModelEntity extends BaseEntity {

    private String name;
    @Enumerated(EnumType.STRING)
    private ModelCategoryEnum model;

    @ManyToOne
    private BrandEntity brand;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ModelCategoryEnum getModel() {
        return model;
    }

    public void setModel(ModelCategoryEnum model) {
        this.model = model;
    }

    public BrandEntity getBrand() {
        return brand;
    }

    public void setBrand(BrandEntity brand) {
        this.brand = brand;
    }
}
