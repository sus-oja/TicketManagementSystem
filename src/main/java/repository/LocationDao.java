package repository;

import model.Location;
import model.Ticket;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.DBUtil;

public class LocationDao {

    public void createLocation(Location location) {
        Transaction transaction = null;
        Session session = DBUtil.getSessionFactory().openSession();

        try {
            transaction = session.beginTransaction();
            session.save(location);

            transaction.commit();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());

            if (transaction != null) {
                transaction.rollback();
            }
        }
        session.close();
    }

    public void removeLocation(Location location) {
        Transaction transaction = null;
        Session session = DBUtil.getSessionFactory().openSession();

        try {
            transaction = session.beginTransaction();
            session.delete(location);

            transaction.commit();
            System.out.println("The location has been successfully removed.");

        } catch (Exception ex) {
            System.out.println(ex.getMessage());

            if (transaction != null) {
                transaction.rollback();
            }
        }
        session.close();
    }
}
