package com.polytech.offer.controllers;

import com.polytech.offer.entity.OfferEntity;
import com.polytech.offer.services.OfferService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.*;

import javax.annotation.security.RolesAllowed;
import java.util.Optional;

@RequiredArgsConstructor
@RequestMapping("/api/offer")
@RestController
public class OfferController {

    @Autowired
    private OfferService offerService;

    @GetMapping("/else")
    public String testMethod(){
        return offerService.health();
    }

    @GetMapping()
    public Iterable<OfferEntity> getAll(){
        return offerService.getAll();
    }

    @GetMapping("/getById/{id}")
    public Optional<OfferEntity> getById(@PathVariable Long id){
        return offerService.getById(id);
    }
    @PostMapping("/createOrUpdate")
    public OfferEntity createOrUpdate(@RequestBody OfferEntity offerEntity){
        return offerService.createOrUpdate(offerEntity);
    }

    @DeleteMapping("/deleteById/{id}")
    public void delete(@PathVariable Long id){
        offerService.delete(id);
    }
}
