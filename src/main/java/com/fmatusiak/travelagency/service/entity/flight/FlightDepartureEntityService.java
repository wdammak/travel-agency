package com.fmatusiak.travelagency.service.entity.flight;

import com.fmatusiak.travelagency.domain.entity.flight.FlightDepartureEntity;
import com.fmatusiak.travelagency.repository.flight.FlightDepartureEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Transactional
@Service
public class FlightDepartureEntityService {

    @Autowired
    private FlightDepartureEntityRepository flightDepartureEntityRepository;

    public FlightDepartureEntity addFlightDeparture(FlightDepartureEntity flightDepartureEntity) {
        return flightDepartureEntityRepository.save(flightDepartureEntity);
    }

    public Optional<FlightDepartureEntity> getFlightDepartureById(long id) {
        return flightDepartureEntityRepository.findById(id);
    }

    public void removeFlightDepartureById(long id) {
        flightDepartureEntityRepository.deleteById(id);
    }

}
