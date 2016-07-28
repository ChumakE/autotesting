package test;

import kernel.core.logger.entity.HibernateUtil;
import kernel.core.logger.entity.Step;
import org.hibernate.Session;

/**
 * Created by user on 27.07.2016.
 */
public class HibernateTest {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Step step = new Step();
        step.setDescription("TestStep");
//        step.setId(1L);
        session.save(step);
        session.getTransaction().commit();
        HibernateUtil.shutdown();
    }
    }
