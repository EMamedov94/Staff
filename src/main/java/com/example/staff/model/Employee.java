package com.example.staff.model;

import com.example.staff.enums.PositionEnum;
import com.example.staff.enums.StatusEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "employees")
@NoArgsConstructor
@Getter
@Setter
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstname;
    private String lastname;
    private String phoneNumber;
    @Enumerated(value = EnumType.STRING)
    private PositionEnum position;
    @Enumerated(value = EnumType.STRING)
    private StatusEnum status;
}
