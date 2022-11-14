package com.polytech.offer.controllers;

import com.polytech.offer.models.OfferModel;
import com.polytech.offer.services.OfferService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/offer")
@RestController
public class OfferController {

    @Autowired
    private OfferService offerService;

    @GetMapping("/getAll")
    public List<OfferModel> getAllOffer(){
        return offerService.getAll();
    }

    @GetMapping("/getById")
    public OfferModel getOfferById(@RequestParam Long offerId){
        return offerService.getById(offerId);
    }
    @PostMapping("/create")
    public OfferModel createOffer(@RequestBody OfferModel offerModel){
        return offerService.createOffer(offerModel);
    }

    @PutMapping("/modify")
    public OfferModel modifyOffer(@RequestBody OfferModel offerModel){
        return offerService.modify(offerModel);
    }

    @DeleteMapping("/deleteById")
    public void deleteOffer(@RequestParam Long offerId){
        offerService.delete(offerId);
    }
}
