package com.polytech.offer.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.polytech.offer.entity.OfferEntity;
import com.polytech.offer.services.OfferService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RequiredArgsConstructor
@RequestMapping("/api/offer")
@RestController
public class OfferController {

    private final OfferService offerService;
    private final ObjectMapper objectMapper;

    @GetMapping
    public Iterable<OfferEntity> getAll() {
        return offerService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<OfferEntity> getById(@PathVariable Long id) {
        return offerService.getById(id);
    }

    @PostMapping
    public OfferEntity createOrUpdate(@RequestBody OfferEntity offerEntity) {
        return offerService.createOrUpdate(offerEntity);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        offerService.delete(id);
    }
}
