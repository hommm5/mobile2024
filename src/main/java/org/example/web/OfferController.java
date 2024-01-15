package org.example.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/offers")
public class OfferController {

    @GetMapping("/all")
    public String getAllOffers (){
        return "offers";
    }

    @GetMapping("/add")
    public String addAllOffers (){
        return "offer-add";
    }

    @GetMapping("/{id}/details")
    public String getDetails(@PathVariable("id")String uuid){
        return "details";
    }
}
