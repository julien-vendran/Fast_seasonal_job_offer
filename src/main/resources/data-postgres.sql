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

DROP TABLE IF EXISTS jobseeker;
CREATE TABLE jobseeker
(
    id        serial PRIMARY KEY,
    lastname  VARCHAR(100),
    firstname VARCHAR(100),
    city      VARCHAR(100),
    job       VARCHAR(100),
    phone     VARCHAR(20),
    email     VARCHAR(100)
);

DROP TABLE IF EXISTS recruiter;
CREATE TABLE recruiter
(
    id          serial PRIMARY KEY,
    lastname    VARCHAR(100),
    firstname   VARCHAR(100),
    companyName VARCHAR(100),
    city        VARCHAR(100),
    job         VARCHAR(100),
    phone       VARCHAR(20),
    email       VARCHAR(100)
);

DROP TABLE IF EXISTS grade;
CREATE TABLE grade
(
    FOREIGN KEY (idRecruiter) REFERENCES recruiter(id),
    FOREIGN KEY (idJobseeker) REFERENCES jobseeker(id),
    mark       FLOAT,
    comment    VARCHAR(200),
    PRIMARY KEY (idRecruiter, idJobseeker)
);


CREATE SEQUENCE hibernate_sequence START 1;