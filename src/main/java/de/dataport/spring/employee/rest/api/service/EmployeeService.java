package de.dataport.spring.employee.rest.api.service;

import de.dataport.spring.employee.rest.api.entity.EmployeeEntity;
import de.dataport.spring.employee.rest.api.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public EmployeeEntity addEmployee(EmployeeEntity employee) {
        return employeeRepository.save(employee);
    }

    public EmployeeEntity getEmployee(long id) {
        return employeeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("No employee with id " + id + " found"));
    }

    public List<EmployeeEntity> getEmployees() {
        return employeeRepository.findAll();
    }

    public void deleteEmployee(long id) {
        employeeRepository.deleteById(id);
    }
}
