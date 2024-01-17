package org.example.model.dto;

import java.math.BigDecimal;

public record CreateOfferDto(String model, BigDecimal price, String engine, String transmission, int year, long mileage) {
}
