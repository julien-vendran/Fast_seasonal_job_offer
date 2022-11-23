package com.polytech.offer.repository;

import com.polytech.offer.entity.OfferEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface OfferRepository extends CrudRepository<OfferEntity, Long> {
}
