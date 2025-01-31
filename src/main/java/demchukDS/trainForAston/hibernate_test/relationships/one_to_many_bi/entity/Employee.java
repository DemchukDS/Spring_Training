package demchukDS.trainForAston.hibernate_test.relationships.one_to_many_bi.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "employees", schema = "spring_train")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long empId;

    @Column(name = "name")
    private String empFirstName;

    @Column(name = "surname")
    private String empSecondName;

    @Column(name = "department")
    private String empDepartment;

    @Column(name = "salary")
    private int empSalary;

    @OneToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "details_id")
    private Detail empDetail;

    @ManyToOne(cascade = {
            CascadeType.MERGE,
            CascadeType.PERSIST,
            CascadeType.REFRESH,
            CascadeType.DETACH
    })
    @JoinColumn(name = "departments_id")
    private Department department;

    public Employee() {
    }

    public Employee(String empName, String empSecondName, String empDepartment, int empSalary) {
        this.empFirstName = empName;
        this.empSecondName = empSecondName;
        this.empDepartment = empDepartment;
        this.empSalary = empSalary;
    }

    public long getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = Long.parseLong(empId);
    }

    public String getEmpFirstName() {
        return empFirstName;
    }

    public void setEmpFirstName(String empFirstName) {
        this.empFirstName = empFirstName;
    }

    public Detail getEmpDetail() {
        return empDetail;
    }

    public void setEmpDetail(Detail empDetail) {
        this.empDetail = empDetail;
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

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
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
