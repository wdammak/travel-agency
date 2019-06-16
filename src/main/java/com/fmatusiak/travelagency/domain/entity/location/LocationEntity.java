package com.fmatusiak.travelagency.domain.entity.location;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "LOCATION")
public class LocationEntity {

    @Id
    @Column(name = "id", unique = true)
    @GeneratedValue
    private int id;

    @JoinColumn(name = "id_location_data", referencedColumnName = "id")
    @OneToOne(mappedBy = "locationEntity")
    private LocationDataEntity locationDataEntity;

    @JoinColumn(name = "id_location_address", referencedColumnName = "id")
    @OneToOne(mappedBy = "locationEntity", targetEntity = LocationAddressEntity.class)
    private LocationAddressEntity locationAddressEntity;
}