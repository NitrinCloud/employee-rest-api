package de.dataport.spring.employee.rest.api.repository;

import de.dataport.spring.employee.rest.api.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {
}
