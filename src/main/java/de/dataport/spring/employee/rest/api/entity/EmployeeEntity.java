package de.dataport.spring.employee.rest.api.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "employees")
public class EmployeeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    @Getter
    private Long id;

    @Getter
    @Setter
    private String surname;

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private String locationId;

    public EmployeeEntity(String surname, String name, String locationId) {
        this.surname = surname;
        this.name = name;
        this.locationId = locationId;
    }

    public EmployeeEntity() {

    }
}
