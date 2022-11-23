package com.polytech.offer.entity;

import com.polytech.offer.models.JSJoinOfferId;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Getter
@RequiredArgsConstructor
@AllArgsConstructor
@Setter
@Table(name = "jobseekerjoinoffer")
@IdClass(JSJoinOfferId.class)
public class JobSeekerJoinEntity {

    @Id
    private Long jsId;

    @Id
    private Long offerId;
}
