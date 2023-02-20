package de.dataport.spring.employee.rest.api.controller;

import de.dataport.spring.employee.rest.api.entity.LocationEntity;
import de.dataport.spring.employee.rest.api.service.LocationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/location")
public class LocationController {

    private final LocationService locationService;

    public LocationController(LocationService locationService) {
        this.locationService = locationService;
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<LocationEntity> getEntity(@PathVariable String id) {
        return new ResponseEntity<>(locationService.getLocation(id), HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<List<LocationEntity>> getEntities() {
        return new ResponseEntity<>(locationService.getLocations(), HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<LocationEntity> addEmployee(@RequestBody LocationEntity employee) {
        LocationEntity locationEntity = locationService.addLocation(employee);
        return new ResponseEntity<>(locationEntity, HttpStatus.CREATED);
    }

    @GetMapping("/delete/{id}")
    public HttpStatus deleteEntity(@PathVariable String id) {
        locationService.deleteLocation(id);
        return HttpStatus.OK;
    }
}