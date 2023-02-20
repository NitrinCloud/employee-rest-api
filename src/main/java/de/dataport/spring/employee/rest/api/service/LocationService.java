package de.dataport.spring.employee.rest.api.service;

import de.dataport.spring.employee.rest.api.entity.EmployeeEntity;
import de.dataport.spring.employee.rest.api.entity.LocationEntity;
import de.dataport.spring.employee.rest.api.repository.EmployeeRepository;
import de.dataport.spring.employee.rest.api.repository.LocationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationService {

    private final LocationRepository locationRepository;

    public LocationService(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }

    public LocationEntity addLocation(LocationEntity location) {
        return locationRepository.save(location);
    }

    public LocationEntity getLocation(String id) {
        return locationRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("No location with id " + id + " found"));
    }

    public List<LocationEntity> getLocations() {
        return locationRepository.findAll();
    }

    public void deleteLocation(String id) {
        locationRepository.deleteById(id);
    }
}
