package de.dataport.spring.employee.rest.api.controller;

import de.dataport.spring.employee.rest.api.entity.EmployeeEntity;
import de.dataport.spring.employee.rest.api.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<EmployeeEntity> getEntity(@PathVariable long id) {
        return new ResponseEntity<>(employeeService.getEmployee(id), HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<List<EmployeeEntity>> getEntities() {
        return new ResponseEntity<>(employeeService.getEmployees(), HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<EmployeeEntity> addEmployee(@RequestBody EmployeeEntity employee) {
        EmployeeEntity employeeEntity = employeeService.addEmployee(employee);
        return new ResponseEntity<>(employeeEntity, HttpStatus.CREATED);
    }

    @GetMapping("/delete/{id}")
    public HttpStatus deleteEntity(@PathVariable long id) {
        System.out.println(id);
        employeeService.deleteEmployee(id);
        return HttpStatus.OK;
    }
}