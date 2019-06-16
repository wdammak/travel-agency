package com.fmatusiak.travelagency.service.entity.hotel;

import com.fmatusiak.travelagency.domain.entity.hotel.HotelAddressEntity;
import com.fmatusiak.travelagency.repository.hotel.HotelAddressEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Transactional
@Service
public class HotelAddressEntityService {

    @Autowired
    private HotelAddressEntityRepository hotelAddressEntityRepository;

    public HotelAddressEntity addHotelAddress(HotelAddressEntity hotelAddressEntity) {
        return hotelAddressEntityRepository.save(hotelAddressEntity);
    }

    public Optional<HotelAddressEntity> getHotelAddressById(long id) {
        return hotelAddressEntityRepository.findById(id);
    }

    public void deleteHotelAddressById(long id) {
        hotelAddressEntityRepository.deleteById(id);
    }

}
