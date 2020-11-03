package repository;

import model.Shows;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.DBUtil;

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
}