package demchukDS.trainForAston.hibernate_test.relationships.one_to_many_bi;

import demchukDS.trainForAston.hibernate_test.relationships.one_to_many_bi.entity.Department;
import demchukDS.trainForAston.hibernate_test.relationships.one_to_many_bi.entity.Detail;
import demchukDS.trainForAston.hibernate_test.relationships.one_to_many_bi.entity.Employee;
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
            Department department = session.get(Department.class, "0aad3cc3-5951-417c-aef2-661f31d0fde6");
            Employee employee = new Employee(
                    "Alesya",
                    "Kobruseva",
                    "HR",
                    600
            );
            Detail detail = new Detail(
                    "Baranovichi",
                    "+375295555555",
                    "kobruseva_alesya@gmail.com"
            );

            employee.setEmpDetail(detail);
            detail.setEmployee(employee);
            department.addToEmployeesToDepartment(employee);

            session.persist(department);

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
