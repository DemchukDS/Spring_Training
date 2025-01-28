package demchukDS.trainForAston.hibernate_test.crud;

import demchukDS.trainForAston.hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ObjectSaverInDatabase {
    public static void main(String[] args) {
        SessionFactory sf = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        Session session = sf.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();

            Employee emp = new Employee(
                    "Alesya",
                    "Kobruseva",
                    "Sales",
                    400
            );
            session.save(emp);

            tx.commit();
        }
        catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        }
        finally {
            if (session.isOpen()) {
                session.close();
                sf.close();
            }
        }
    }
}
