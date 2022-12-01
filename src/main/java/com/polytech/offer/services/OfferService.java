package com.polytech.offer.services;

import com.polytech.offer.entity.JobSeekerEntity;
import com.polytech.offer.entity.OfferEntity;
import com.polytech.offer.kafka.KafkaSenderMsg;
import com.polytech.offer.repository.OfferRepository;
import lombok.RequiredArgsConstructor;
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

    public Iterable<OfferEntity> getByAuthor(Long id){
        return offerRepository.findByAuthor(id);
    }

    public void delete(Long offerId){
        offerRepository.deleteById(offerId);
    }

    public Iterable<JobSeekerEntity> getJsAssociateToOffer(Long id){
        Iterable<JobSeekerEntity> jsList = null;
        if(getById(id).isPresent()){
            Optional<OfferEntity> offerEntity = getById(id);
            jsList=offerEntity.get().getJobSeekers().stream().toList();
        }
        return jsList;
    }
}
