package demchukDS.trainForAston.hibernate_test.relationships.one_to_one_uni;

import demchukDS.trainForAston.hibernate_test.relationships.one_to_one_uni.entity.Detail;
import demchukDS.trainForAston.hibernate_test.relationships.one_to_one_uni.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToOneUniDirectionalTrain {
    public static void main(String[] args) {

        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();

        Session session = sessionFactory.openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();

//            ***** ADD DATA *****
//            Employee employee = new Employee(
//                    "Vladislav",
//                    "Kobrusev",
//                    "IT",
//                    3800
//            );
//            Detail detail = new Detail(
//                    "Baranovichi",
//                    "+375292222222",
//                    "kobrusev_va@gmail.com"
//            );
//            employee.setEmpDetail(detail);
//            session.save(employee);

//            ***** GET DATA *****
//            Employee employee = session.get(Employee.class, "3d63a0c9-081c-4947-a15b-5e6cd87d500c");
//            System.out.println(employee.getEmpDetail());

//            ***** DELETE DATA*****
//            Employee employee = session.get(Employee.class, "3d63a0c9-081c-4947-a15b-5e6cd87d500c");
//            session.remove(employee);

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
