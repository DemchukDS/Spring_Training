package demchukDS.trainForAston.hibernate_test.relationships.one_to_one_bi;

import demchukDS.trainForAston.hibernate_test.relationships.one_to_one_bi.entity.Detail;
import demchukDS.trainForAston.hibernate_test.relationships.one_to_one_bi.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToOneBiDirectionalTrain {
    public static void main(String[] args) {

        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();

        Session session = null;
        Transaction tx = null;

        try {
            session = sessionFactory.openSession();
            tx = session.beginTransaction();

//            **** ADD DATA *****
//            Employee employee = new Employee(
//                    "Viktoria",
//                    "Demchuk",
//                    "ProjectCoordinators",
//                    600
//            );
//            Detail detail = new Detail(
//                    "Minsk",
//                    "+375294444444",
//                    "demchuk.va@gmail.com"
//            );
//
//            employee.setEmpDetail(detail);
//            detail.setEmployee(employee);
//            session.persist(detail);

//            ***** GET DATA *****
//            Detail detail = session.get(Detail.class, "983b402b-14e2-4a75-9b99-9ff72a367d2c");
//            System.out.println(detail.getEmployee());

//            ***** DELETE DATA *****
//            Detail detail = session.get(Detail.class, "983b402b-14e2-4a75-9b99-9ff72a367d2c");
//            session.remove(detail.getEmployee());

            tx.commit();
        }
        catch (Exception e) {
            if (tx.isActive()) {
                tx.rollback();
            }
            e.printStackTrace();
        }
        finally {
            if (session.isOpen()) {
                session.close();
                sessionFactory.close();
            }
        }
    }
}
