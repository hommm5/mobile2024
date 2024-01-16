package org.example.model.entity;

import jakarta.persistence.*;
import org.example.model.entity.enums.EngineEnum;
import org.example.model.entity.enums.Transmission;

import java.math.BigDecimal;

@Entity
@Table(name = "offers")
public class OfferEntity extends  BaseEntity{

    private BigDecimal price;
    private String imgUrl;

    private long mileage;

    private int year;

    @Enumerated(EnumType.STRING)
    private EngineEnum engine;
    @Enumerated(EnumType.STRING)
    private Transmission transmission;
    private String description;
    @ManyToOne
    private ModelEntity model;

}
