package com.polytech.offer.controllers;

import com.polytech.offer.entity.JobSeekerEntity;
import com.polytech.offer.entity.OfferEntity;
import com.polytech.offer.services.OfferService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RequiredArgsConstructor
@RequestMapping("/api/offer")
@RestController
public class OfferController {

    private final OfferService offerService;

    @GetMapping()
    public Iterable<OfferEntity> getAll(){
        return offerService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<OfferEntity> getById(@PathVariable Long id){
        return offerService.getById(id);
    }

    @GetMapping("getByAuthor/{id}")
    public Iterable<OfferEntity> getByAuthor(@PathVariable Long id){
        return offerService.getByAuthor(id);
    }
    @PostMapping()
    public OfferEntity createOrUpdate(@RequestBody OfferEntity offerEntity){
        return offerService.createOrUpdate(offerEntity);
    }

    @GetMapping("getJsByOffer/{id}")
    public Iterable<JobSeekerEntity> getJsByOffer(@PathVariable Long id){
        return offerService.getJsAssociateToOffer(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        offerService.delete(id);
    }
}
