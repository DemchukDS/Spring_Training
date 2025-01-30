package demchukDS.trainForAston.hibernate_test.relationships.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "details", schema = "spring_train")
public class Detail {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id")
    private String detailId;

    @Column(name = "city")
    private String detailCity;

    @Column(name = "phone_number")
    private String detailPhoneNumber;

    @Column(name = "email")
    private String detailEmail;

    @OneToOne (mappedBy = "empDetail", cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    private Employee employee;

    public Detail() {
    }

    public Detail(String detailCity, String detailPhoneNumber, String detailEmail) {
        this.detailCity = detailCity;
        this.detailPhoneNumber = detailPhoneNumber;
        this.detailEmail = detailEmail;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public String getDetailCity() {
        return detailCity;
    }

    public void setDetailCity(String detailCity) {
        this.detailCity = detailCity;
    }

    public String getDetailPhoneNumber() {
        return detailPhoneNumber;
    }

    public void setDetailPhoneNumber(String detailPhoneNumber) {
        this.detailPhoneNumber = detailPhoneNumber;
    }

    public String getDetailEmail() {
        return detailEmail;
    }

    public void setDetailEmail(String detailEmail) {
        this.detailEmail = detailEmail;
    }

    public String getDetailId() {
        return detailId;
    }

    public void setDetailId(String detailId) {
        this.detailId = detailId;
    }

    @Override
    public String toString() {
        return "Detail{" +
                "detailId=" + detailId +
                ", detailCity='" + detailCity + '\'' +
                ", detailPhoneNumber='" + detailPhoneNumber + '\'' +
                ", detailEmail='" + detailEmail + '\'' +
                '}';
    }
}
