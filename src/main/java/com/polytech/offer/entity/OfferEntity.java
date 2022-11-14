package com.polytech.offer.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "OFFER")
public class OfferEntity {

    @Id
    private Long idOffer;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "publishDay")
    private Date publishDay;

    @Column(name = "jobStartingDate")
    private Date jobStartingDate;

    @Column(name = "location")
    private String location;

    @Column(name = "jobNumber")
    private Integer jobNumber;

    @Column(name = "salary")
    private Double salary;

    @Column(name = "advantages")
    private String advantages;

    @Column(name = "job")
    private String job;

    @Column(name = "zone")
    private String zone;
}
