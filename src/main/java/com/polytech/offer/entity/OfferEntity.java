package com.polytech.offer.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@RequiredArgsConstructor
@AllArgsConstructor
@Setter
@Table(name = "offer")
public class OfferEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long idOffer;

    @Column(name = "title",length=100, nullable = false)
    private String title;

    @Column(name = "description",length=1000, nullable = false)
    private String description;

    @Column(name = "publishday", nullable = false)
    private Date publishDay;

    @Column(name = "jobStartingdate", nullable = false)
    private Date jobStartingDate;

    @Column(name = "location", length=100, nullable = false)
    private String location;

    @Column(name = "jobnumber", nullable = false)
    private Integer jobNumber;

    @Column(name = "salary", nullable = false)
    private Double salary;

    @Column(name = "advantages", length=500, nullable = false)
    private String advantages;

    @Column(name = "job",length=100, nullable = false)
    private String job;

    @Column(name = "zone",length=100, nullable = false)
    private String zone;
}
