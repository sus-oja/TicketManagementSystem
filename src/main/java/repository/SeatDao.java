package repository;

import model.Seat;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.DBUtil;

public class SeatDao {

    public void createSeat(Seat seat) {
        Transaction transaction = null;
        Session session = DBUtil.getSessionFactory().openSession();

        try {
            transaction = session.beginTransaction();
            session.save(seat);

            transaction.commit();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());

            if (transaction != null) {
                transaction.rollback();
            }
        }
    }

    public void removeSeat(Seat seat) {
        Transaction transaction = null;
        Session session = DBUtil.getSessionFactory().openSession();

        try {
            transaction = session.beginTransaction();
            session.delete(seat);

            transaction.commit();
            System.out.println("The seat has been successfully removed.");

        } catch (Exception ex) {
            System.out.println(ex.getMessage());

            if (transaction != null) {
                transaction.rollback();
            }
        }
    }
}
