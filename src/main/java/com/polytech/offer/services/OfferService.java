package com.polytech.offer.services;

import com.polytech.offer.models.OfferModel;
import com.polytech.offer.repository.OfferRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OfferService {

    @Autowired
    private OfferRepository offerRepository;

    public List<OfferModel> getAll(){
        return new ArrayList<>();
    }

    public OfferModel getById(Long offerId){
        return new OfferModel();
    }

    public OfferModel createOffer(OfferModel offerModel){
        return new OfferModel();
    }

    public OfferModel modify(OfferModel offerModel){
        return new OfferModel();
    }

    public void delete(Long offerId){

    }


}
