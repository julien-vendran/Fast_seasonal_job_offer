package com.polytech.offer.services;

import com.polytech.offer.entity.OfferEntity;
import com.polytech.offer.repository.OfferRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OfferService {

    @Autowired
    private OfferRepository offerRepository;

    public Iterable<OfferEntity> getAll(){
        return offerRepository.findAll();
    }

    public Optional<OfferEntity> getById(Long offerId){
        return offerRepository.findById(offerId);
    }

    public OfferEntity createOffer(OfferEntity offerEntity){
        return offerRepository.save(offerEntity);
    }

    public OfferEntity modify(OfferEntity offerEntity){
        if (offerRepository.existsById(offerEntity.getIdOffer())){
            offerRepository.delete(offerEntity);
        }
        return offerRepository.save(offerEntity);
    }

    public void delete(Long offerId){
        offerRepository.deleteById(offerId);
    }


}
