package demchukDS.trainForAston.hibernate_test.crud;

import demchukDS.trainForAston.hibernate_test.crud.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ObjectGetterFromDatabaseByID {
    public static void main(String[] args) {
        SessionFactory sf = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        Session session = sf.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();

            Employee emp = session.get(Employee.class, "d002a93a-73bf-4f13-a367-ed6159803102");
            System.out.println(emp);

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
