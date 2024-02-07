package org.example.web;

import org.example.model.dto.CreateOfferDto;
import org.example.model.entity.enums.EngineEnum;
import org.example.model.entity.enums.TransmissionEnum;
import org.example.service.OfferService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@Controller
@RequestMapping("/offers")
public class OfferController {

    private final OfferService offerService;

    public OfferController(OfferService offerService) {
        this.offerService = offerService;
    }

    @GetMapping("/all")
    public String getAllOffers() {
        return "offers";
    }

    @ModelAttribute("transmissions")
    public TransmissionEnum[] transmissions(){
        return TransmissionEnum.values();
    }

    @GetMapping("/add")
    public String addAllOffers(Model model) {
        return "offer-add";
    }

    @PostMapping("/add")
    public String addOffer(CreateOfferDto createOfferDto) {

        offerService.createOffer(createOfferDto);

        return "/";
    }

    @GetMapping("/{uuid}/details")
    public String getDetails(@PathVariable("uuid") UUID uuid) {
        return "details";
    }
}
