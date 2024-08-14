package top.anyel.relations.models;

import jakarta.persistence.*;
import lombok.Data;
import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "employeesAppd")
@Data
public class EmployeeAppd {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer employeeIdAppd;

    @ManyToOne
    @JoinColumn(name = "department_idAppd")
    @JsonBackReference
    private DepartmentAppd departmentAppd;

    private String firstnameAppd;
    private String lastnameAppd;
}
