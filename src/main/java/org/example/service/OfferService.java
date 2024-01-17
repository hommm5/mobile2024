package org.example.service;

import org.example.model.dto.CreateOfferDto;

import java.util.UUID;

public interface OfferService {

    UUID createOffer(CreateOfferDto createOfferDto);
}
