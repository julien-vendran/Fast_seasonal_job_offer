DROP DATABASE IF EXISTS fast_seasonal;
CREATE DATABASE fast_seasonal;

DROP TABLE IF EXISTS offer;
CREATE TABLE offer
(
    idOffer serial PRIMARY KEY,
    title  VARCHAR(100),
    description VARCHAR(1000),
    publishDay DATE,
    jobStartingDate DATE,
    location VARCHAR(100),
    jobnumber INTEGER,
    salary FLOAT,
    advantages VARCHAR(500),
    job VARCHAR(100),
    zones VARCHAR(100),
    author VARCHAR(50),
    keywords VARCHAR(100)
);

DROP TABLE IF EXISTS JOBSEEKERJOINOFFER;
CREATE TABLE JOBSEEKERJOINOFFER
(
    foreign key jsId references recruiter(id),
    foreign key offerId references offer(idOffer),
    primary key (jsId,offerId)

);

CREATE SEQUENCE hibernate_sequence START 1;