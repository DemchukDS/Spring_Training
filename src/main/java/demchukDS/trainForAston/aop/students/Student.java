package demchukDS.trainForAston.aop.students;

import java.util.Date;

public class Student {
    private String name;
    private String surname;
    private Date birthDate;
    private double averageGrade;
    private int course;

    public Student(String name, String surname, Date birthDate, double averageGrade, int course) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.averageGrade = averageGrade;
        this.course = course;
    }

    public Student() {
        System.out.println("Student data not entered");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthDate=" + birthDate +
                ", averageGrade=" + averageGrade +
                ", course=" + course +
                '}';
    }
}
