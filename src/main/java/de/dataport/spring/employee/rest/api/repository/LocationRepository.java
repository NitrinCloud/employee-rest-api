package de.dataport.spring.employee.rest.api.repository;

import de.dataport.spring.employee.rest.api.entity.LocationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<LocationEntity, String> {
}
