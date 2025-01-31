package demchukDS.trainForAston.hibernate_test.relationships.one_to_many_uni;

import demchukDS.trainForAston.hibernate_test.relationships.one_to_many_uni.entity.Department;
import demchukDS.trainForAston.hibernate_test.relationships.one_to_many_uni.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;


public class OneToManyUniDirectionalTrain {
    public static void main(String[] args) {

        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();

        Session session = null;
        Transaction tx = null;

        try {
            session = sessionFactory.openSession();
            tx = session.beginTransaction();

//                      ***** ADD DATA *****
//            Employee employee = new Employee(
//                    "Dmitriy",
//                    "Demchuk",
//                    "IT",
//                    1200
//            );
//            Department department = new Department(
//                    "IT",
//                    800,
//                    3000
//            );
//
//            department.addToEmployeesToDepartment(employee);
//            session.persist(department);

//                      ***** GET ADD *****
//            Department department = session.get(Department.class, "61352790-8035-4a62-914f-651a9c6d512d");
//            List<Employee> employees = department.getEmployees();
//            System.out.println(employees);

//                      ***** DELETE ADD *****
//            Department department = session.get(Department.class, "61352790-8035-4a62-914f-651a9c6d512d");
//            session.remove(department);

            tx.commit();
        }
        catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        }
        finally {
            if (session != null) {
                session.close();
                sessionFactory.close();
            }
        }
    }
}
