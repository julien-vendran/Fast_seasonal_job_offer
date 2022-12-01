package com.polytech.offer.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OfferModel {

    private Long idOffer;
    private String title;
    private String description;
    private Date publishDay;
    private Date jobStartingDate;
    private String city;
    private String region;
    private Integer jobNumber;
    private Double salary;
    private String advantages;
    private String job;
    private String zone;

}
