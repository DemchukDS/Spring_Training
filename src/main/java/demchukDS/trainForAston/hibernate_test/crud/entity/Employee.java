package demchukDS.trainForAston.hibernate_test.crud.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "employees", schema = "spring_train")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id")
    private String empId;

    @Column(name = "name")
    private String empFirstName;

    @Column(name = "surname")
    private String empSecondName;

    @Column(name = "department")
    private String empDepartment;

    @Column(name = "salary")
    private int empSalary;

    public Employee() {
    }

    public Employee(String empName, String empSecondName, String empDepartment, int empSalary) {
        this.empFirstName = empName;
        this.empSecondName = empSecondName;
        this.empDepartment = empDepartment;
        this.empSalary = empSalary;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empFirstName;
    }

    public void setEmpName(String empName) {
        this.empFirstName = empName;
    }

    public String getEmpSecondName() {
        return empSecondName;
    }

    public void setEmpSecondName(String empSecondName) {
        this.empSecondName = empSecondName;
    }

    public String getEmpDepartment() {
        return empDepartment;
    }

    public void setEmpDepartment(String empDepartment) {
        this.empDepartment = empDepartment;
    }

    public int getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(int empSalary) {
        this.empSalary = empSalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId='" + empId + '\'' +
                ", empName='" + empFirstName + '\'' +
                ", empSurname='" + empSecondName + '\'' +
                ", empDepartment='" + empDepartment + '\'' +
                ", empSalary=" + empSalary +
                '}';
    }
}
