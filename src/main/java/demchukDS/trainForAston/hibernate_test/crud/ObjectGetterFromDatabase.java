package demchukDS.trainForAston.hibernate_test.crud;

import demchukDS.trainForAston.hibernate_test.crud.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class ObjectGetterFromDatabase {
    public static void main(String[] args) {
        SessionFactory sf = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        Session session = sf.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();

            List<Employee> employees = session.createQuery("from Employee " +
                            "where empFirstName = 'Dmitriy' " +
                            "and empSalary > 4000 ")
                    .getResultList();
            for (Employee employee : employees) {
                System.out.println(employee);
            }

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
