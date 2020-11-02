package repository;

import model.Shows;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.DBUtil;

public class ShowsDao {

    public void createShows(Shows shows) {
        Transaction transaction = null;

        try {
            Session session = DBUtil.getSessionFactory().openSession();

            transaction = session.beginTransaction();
            session.save(shows);
            transaction.commit();
            session.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());

            if (transaction != null) {
                transaction.rollback();
            }
        }
    }


}