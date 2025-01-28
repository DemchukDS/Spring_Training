package demchukDS.trainForAston.hibernate_test.crud;

import demchukDS.trainForAston.hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ObjectCreatorFromDatabase {
    public static void main(String[] args) {
        SessionFactory sf = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        Session session = sf.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();

            session.createMutationQuery("update Employee " +
                            "set empSalary = 1000 " +
                            "where empFirstName = 'Victoria' " +
                            "and empSecondName = 'Demchuk'")
                    .executeUpdate();

            tx.commit();
        }
        catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        }
        finally {
            if (sf.isOpen()) {
                sf.close();
            }
        }
    }
}
