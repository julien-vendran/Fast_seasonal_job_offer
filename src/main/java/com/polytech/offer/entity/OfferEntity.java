package com.polytech.offer.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL;

@Entity
@Getter
@RequiredArgsConstructor
@AllArgsConstructor
@Setter
@Table(name = "offer")
@JsonInclude(NON_NULL)
public class OfferEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "title", length = 100, nullable = false)
    private String title;

    @Column(name = "description", length = 1000, nullable = false)
    private String description;

    @Column(name = "publish_day")
    private Date publishDay;

    @Column(name = "job_starting_date")
    private Date jobStartingDate;

    @Column(name = "city", length = 100, nullable = false)
    private String city;

    @Column(name = "region", length = 100, nullable = false)
    private String region;

    @Column(name = "job_number")
    private Integer jobNumber;

    @Column(name = "salary", nullable = false)
    private Double salary;

    @Column(name = "advantages", length = 500, nullable = false)
    private String advantages;

    @Column(name = "job", length = 100, nullable = false)
    private String job;

    @Column(name = "zones", length = 100, nullable = false)
    private String zones;

    @Column(name = "author", length = 100, nullable = false)
    private String author;

    @Column(name = "keywords", length = 500, nullable = false)
    private String keywords;
}

