package com.fmatusiak.travelagency.domain.amadeus.flight;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class FlightArrival {
    String iataCode;
    String at;
}
