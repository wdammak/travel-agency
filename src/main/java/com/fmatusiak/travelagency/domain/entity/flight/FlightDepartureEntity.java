package com.fmatusiak.travelagency.domain.entity.flight;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "FLIGHTS_DEPARTURES")
public class FlightDepartureEntity {

    @Id
    @Column(name = "id", unique = true)
    @GeneratedValue
    int id;

    @Column(name = "iataCode")
    String iataCode;

    @Column(name = "at")
    String at;

    @OneToOne
    private FlightEntity flightEntity;
}