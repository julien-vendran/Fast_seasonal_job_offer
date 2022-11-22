package com.polytech.offer.controllers;

import com.polytech.offer.entity.OfferEntity;
import com.polytech.offer.services.OfferService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.security.RolesAllowed;
import java.util.Optional;

@RequiredArgsConstructor
@RequestMapping("/api/offer")
@RestController
public class OfferController {

    private final OfferService offerService;

    @GetMapping("/else")
    public String testMethod(){
        return "No error";
    }

    @GetMapping()
    public Iterable<OfferEntity> getAll(){
        return offerService.getAll();
    }

    @GetMapping("/getById")
    public Optional<OfferEntity> getById(@RequestParam Long offerId){
        return offerService.getById(offerId);
    }
    @PostMapping("/createOrUpdate")
    public OfferEntity createOrUpdate(@RequestBody OfferEntity offerEntity){
        return offerService.createOrUpdate(offerEntity);
    }

    @DeleteMapping("/deleteById")
    public void delete(@RequestParam Long offerId){
        offerService.delete(offerId);
    }
}
