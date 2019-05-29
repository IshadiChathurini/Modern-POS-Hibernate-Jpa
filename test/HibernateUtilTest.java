import lk.ijse.pos.db.HibernateUtil;
import lk.ijse.pos.entity.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class HibernateUtilTest {

    public static void main(String[] args) {

        EntityManager entityManager = HibernateUtil.buildEntityManager();

        entityManager.getTransaction().begin();

        Customer c001 = entityManager.find(Customer.class, "C001");

        System.out.println(c001);

        entityManager.close();

    }

}
