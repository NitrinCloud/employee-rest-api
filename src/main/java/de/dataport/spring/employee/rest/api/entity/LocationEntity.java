package de.dataport.spring.employee.rest.api.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "locations")
public class LocationEntity {

    @Id
    @Getter
    @Column(nullable = false, updatable = false)
    private String locationId;

    @Getter
    @Setter
    private String street;

    @Getter
    @Setter
    private String city;

    public LocationEntity(String locationId, String street, String city) {
        this.locationId = locationId;
        this.street = street;
        this.city = city;
    }

    public LocationEntity() {

    }
}
