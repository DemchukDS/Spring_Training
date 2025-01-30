package demchukDS.trainForAston.hibernate_test.relationships;

import demchukDS.trainForAston.hibernate_test.relationships.entity.Department;
import demchukDS.trainForAston.hibernate_test.relationships.entity.Detail;
import demchukDS.trainForAston.hibernate_test.relationships.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToManyBiDirectionalTrain {
    public static void main(String[] args) {

        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();

        Session session = null;
        Transaction tx = null;

        try {
            session = sessionFactory.openSession();
            tx = session.beginTransaction();

//                      ***** ADD DATE *****
//            Department department = new Department(
//                    "IT",
//                    500,
//                    1200
//            );
//            Employee employee = new Employee(
//                    "Dmitriy",
//                    "Demchuk",
//                    "IT",
//                    1000
//            );
//            Detail detail = new Detail(
//                    "Minsk",
//                    "+375291111111",
//                    "demchuk.dima@gmail.com"
//            );
//
//            employee.setEmpDetail(detail);
//            detail.setEmployee(employee);
//            department.addToEmployeesToDepartment(employee);
//
//            session.persist(department);

//                      ***** GET DATE *****
//            Department dep = session.get(Department.class, "992e6b1e-2f2d-43b4-ac41-1f102514dde1");
//
//            Employee employee = new Employee(
//                    "Vladislav",
//                    "Kobrusev",
//                    "IT",
//                    1200
//            );
//            Detail detail = new Detail(
//                    "Baranovichi",
//                    "+375293333333",
//                    "vlad.kobrusev@gmail.com"
//            );
//
//            employee.setEmpDetail(detail);
//            detail.setEmployee(employee);
//            dep.addToEmployeesToDepartment(employee);

//                      ***** DELETE DATA *****
//            Employee employee1 = session.get(Employee.class, "52a1bfce-db18-45f8-8060-1c95421443ff");
//            employee1.setDepartment(null);
//            Employee employee2 = session.get(Employee.class, "09ea1d10-9a6c-4db2-b1fd-d40f069d9271");
//            employee2.setDepartment(null);
//            Department department = session.get(Department.class, "992e6b1e-2f2d-43b4-ac41-1f102514dde1");
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
