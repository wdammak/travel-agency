package com.fmatusiak.travelagency.domain.entity.flight;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "FLIGHTS_PRICES_DETAILS_PER_ADULTS")
public class FlightPriceDetailPerAdultEntity {

    @Id
    @Column(name = "id", unique = true)
    @GeneratedValue
    int id;

    @Column(name = "travelClass")
    String travelClass;

    @Column(name = "availabilityTickets")
    int availability;

    @OneToOne
    private FlightEntity flightEntity;
}