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

    @GetMapping("")
    public Iterable<OfferEntity> getAll(){
        return offerService.getAll();
    }

    @GetMapping("/getById")
    public Optional<OfferEntity> getById(@RequestParam String offerId){
        return offerService.getById(Long.getLong(offerId));
    }
    @PostMapping("/createOrUpdate")
    public OfferEntity createOrUpdate(@RequestBody OfferEntity offerEntity){
        return offerService.createOrUpdate(offerEntity);
    }

    @DeleteMapping("/deleteById")
    public void delete(@RequestParam String offerId){
        offerService.delete(Long.getLong(offerId));
    }
}
