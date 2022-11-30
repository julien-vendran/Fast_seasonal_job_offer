package com.polytech.offer.services;

import com.polytech.offer.entity.OfferEntity;
import com.polytech.offer.kafka.KafkaSenderMsg;
import com.polytech.offer.repository.OfferRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class OfferService {

    private final OfferRepository offerRepository;
    private final KafkaSenderMsg msgKafka;

    public Iterable<OfferEntity> getAll(){
        return offerRepository.findAll();
    }

    public Optional<OfferEntity> getById(Long offerId){
        return offerRepository.findById(offerId);
    }

    public OfferEntity createOrUpdate(OfferEntity offerEntity){
        msgKafka.sendMsg("Offer as been registered in BD","msg_topic");
        return offerRepository.save(offerEntity);
    }

    public void delete(Long offerId){
        offerRepository.deleteById(offerId);
    }


}
