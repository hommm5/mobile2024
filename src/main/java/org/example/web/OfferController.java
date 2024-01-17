package org.example.web;

import org.example.model.dto.CreateOfferDto;
import org.example.service.OfferService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.UUID;

@Controller
@RequestMapping("/offers")
public class OfferController {

    private final OfferService offerService;

    public OfferController(OfferService offerService) {
        this.offerService = offerService;
    }

    @GetMapping("/all")
    public String getAllOffers (){
        return "offers";
    }

    @GetMapping("/add")
    public String addAllOffers (){
        return "offer-add";
    }

    @PostMapping("add")
    public String addOffer(CreateOfferDto createOfferDto){
        offerService.createOffer(createOfferDto);

        return "/";
    }
    @GetMapping("/{uuid}/details")
    public String getDetails(@PathVariable("uuid") UUID uuid){
        return "details";
    }
}
