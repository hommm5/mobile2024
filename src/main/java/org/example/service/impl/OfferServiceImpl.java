package org.example.service.impl;

import org.example.model.dto.CreateOfferDto;
import org.example.repositories.OfferRepository;
import org.example.service.OfferService;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class OfferServiceImpl implements OfferService {

    private final OfferRepository offerRepository;

    public OfferServiceImpl(OfferRepository offerRepository) {
        this.offerRepository = offerRepository;
    }

    @Override
    public UUID createOffer(CreateOfferDto createOfferDto) {
        //offerRepository.save();

        return UUID.fromString("");
    }
}
