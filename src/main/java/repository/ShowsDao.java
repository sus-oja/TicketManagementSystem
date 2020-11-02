package repository;

import model.Shows;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.DBUtil;

import java.util.List;

public class ShowsDao {


    public void createShows(Shows shows) {

        Session session = DBUtil.getSessionFactory().openSession();

        Transaction transaction = null;

        try {

            transaction = session.beginTransaction();
            session.save(shows);
            transaction.commit();

        } catch (Exception ex) {
            System.out.println(ex.getMessage());

            if (transaction != null) {
                transaction.rollback();
            }
        }
        session.close();
    }
    /*public static List<Shows> getShows() {
        return session.createQuery("from Shows", Shows.class).list();
    }

    public void updateShows(Shows savedShows) {
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();
            session.update(savedShows);
            transaction.commit();
        } catch (Exception ex) {
            ex.printStackTrace();

            if (transaction != null) {
                transaction.rollback();
            }
        }
    }
    public void deleteShows(Shows savedShows) {
        Transaction transaction = null;

        try{
            transaction = session.beginTransaction();
            session.delete(savedShows);
            transaction.commit();

        } catch (Exception ex) {
            ex.printStackTrace();
            if (transaction != null) {
                transaction.rollback();
            }
        }
    }*/
}