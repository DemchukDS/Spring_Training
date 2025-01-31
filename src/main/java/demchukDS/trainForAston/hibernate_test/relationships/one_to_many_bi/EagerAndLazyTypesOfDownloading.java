package demchukDS.trainForAston.hibernate_test.relationships.one_to_many_bi;

import demchukDS.trainForAston.hibernate_test.relationships.one_to_many_bi.entity.Department;
import demchukDS.trainForAston.hibernate_test.relationships.one_to_many_bi.entity.Detail;
import demchukDS.trainForAston.hibernate_test.relationships.one_to_many_bi.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EagerAndLazyTypesOfDownloading {
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

            System.out.println("Get department");
            Department department = session.get(Department.class, "c0adb218-ba5f-4715-8bec-8b691a86ee2f");
            System.out.println("Show department: ");
            System.out.println(department);
            System.out.println("Download employees~!");
            department.getEmployees().get(0);
            tx.commit();

            System.out.println("Show employees: ");
            System.out.println(department.getEmployees());
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
