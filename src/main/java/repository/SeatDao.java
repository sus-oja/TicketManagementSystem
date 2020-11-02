package repository;

import model.Location;
import model.Seat;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.DBUtil;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

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
        session.close();
    }

    public void updateSeat(Seat seat) {
        Session session = DBUtil.getSessionFactory().openSession();
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();
            session.update(seat);
            transaction.commit();
            System.out.println("The seat has been successfully updated.");

        } catch (Exception ex) {
            ex.printStackTrace();

            if (transaction != null) {
                transaction.rollback();
            }
        }
        session.close();
    }

   /* public List<Seat> getNumberOfAvailableSeats(Seat seat) {
        Session session = DBUtil.getSessionFactory().openSession();
        return session.createQuery("FROM seats", Seat.class).list();
    }*/

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
        session.close();
    }
}
