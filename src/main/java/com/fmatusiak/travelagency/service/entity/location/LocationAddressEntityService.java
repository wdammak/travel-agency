package com.fmatusiak.travelagency.service.entity.location;

import com.fmatusiak.travelagency.domain.entity.location.LocationAddressEntity;
import com.fmatusiak.travelagency.repository.location.LocationAddressEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Transactional
@Service
public class LocationAddressEntityService {

    @Autowired
    private LocationAddressEntityRepository locationAddressEntityRepository;

    public LocationAddressEntity addLocationAddress(LocationAddressEntity locationAddressEntity) {
        return locationAddressEntityRepository.save(locationAddressEntity);
    }

    public Optional<LocationAddressEntity> getLocationAddressById(long id) {
        return locationAddressEntityRepository.findById(id);
    }

    public void deleteLocationAddressById(long id) {
        locationAddressEntityRepository.deleteById(id);
    }

}
