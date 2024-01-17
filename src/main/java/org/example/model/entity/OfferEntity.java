package org.example.model.entity;

import jakarta.persistence.*;
import org.example.model.entity.enums.EngineEnum;
import org.example.model.entity.enums.Transmission;
import org.hibernate.annotations.JdbcTypeCode;

import java.math.BigDecimal;
import java.sql.Types;
import java.util.UUID;

@Entity
@Table(name = "offers")
public class OfferEntity extends  BaseEntity{

    @JdbcTypeCode(Types.VARCHAR)
    private UUID uuid;
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

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public long getMileage() {
        return mileage;
    }

    public void setMileage(long mileage) {
        this.mileage = mileage;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public EngineEnum getEngine() {
        return engine;
    }

    public void setEngine(EngineEnum engine) {
        this.engine = engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ModelEntity getModel() {
        return model;
    }

    public void setModel(ModelEntity model) {
        this.model = model;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }
}
