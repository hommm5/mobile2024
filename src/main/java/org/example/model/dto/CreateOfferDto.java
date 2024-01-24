package org.example.model.dto;

import org.example.model.entity.enums.EngineEnum;
import org.example.model.entity.enums.TransmissionEnum;

import java.math.BigDecimal;

public record CreateOfferDto(String description,
                             Long modelId,
                             EngineEnum engine,
                             TransmissionEnum transmission,
                             String ImgUrl,
                             Long mileage,
                             BigDecimal price,
                             Integer year) {
}
