package com.polytech.offer.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.polytech.offer.entity.JobSeekerEntity;
import com.polytech.offer.entity.OfferEntity;
import com.polytech.offer.kafka.KafkaSenderMsg;
import com.polytech.offer.repository.OfferRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class OfferService {

    private final OfferRepository offerRepository;
    private final KafkaTemplate<String, String> kafkaTemplate;
    private final ObjectMapper objectMapper;
    private final static String KAFKA_OFFER_TOPIC_NAME = "addOffer";

    public Iterable<OfferEntity> getAll() {
        return offerRepository.findAll();
    }

    public Optional<OfferEntity> getById(Long offerId) {
        return offerRepository.findById(offerId);
    }

    public OfferEntity createOrUpdate(OfferEntity offerEntity) {
        OfferEntity savedOffer = offerRepository.save(offerEntity);
        try {
            kafkaTemplate.send(KAFKA_OFFER_TOPIC_NAME, objectMapper.writeValueAsString(savedOffer));
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        return savedOffer;
    }

    public Iterable<OfferEntity> getByAuthor(Long id){
        return offerRepository.findByAuthor(id);
    }

    public void delete(Long offerId) {
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
