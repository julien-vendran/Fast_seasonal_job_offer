package com.polytech.offer.controllers;

import com.polytech.offer.entity.OfferEntity;
import com.polytech.offer.services.OfferService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RequiredArgsConstructor
@RequestMapping("/offer")
@RestController
public class OfferController {

    @Autowired
    private OfferService offerService;

    @GetMapping("/getAll")
    public Iterable<OfferEntity> getAllOffer(){
        return offerService.getAll();
    }

    @GetMapping("/getById")
    public Optional<OfferEntity> getOfferById(@RequestParam String offerId){
        return offerService.getById(Long.getLong(offerId));
    }
    @PostMapping("/create")
    public OfferEntity createOffer(@RequestBody OfferEntity offerEntity){
        return offerService.createOffer(offerEntity);
    }

    @PutMapping("/modify")
    public OfferEntity modifyOffer(@RequestBody OfferEntity offerEntity){
        return offerService.modify(offerEntity);
    }

    @DeleteMapping("/deleteById")
    public void deleteOffer(@RequestParam String offerId){
        offerService.delete(Long.getLong(offerId));
    }
}
