package repository;

import model.Ticket;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.DBUtil;

public class TicketDao {

    public void createTicket(Ticket ticket) {
        Transaction transaction = null;
        Session session = DBUtil.getSessionFactory().openSession();

        try {
            transaction = session.beginTransaction();
            session.save(ticket);

            transaction.commit();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());

            if (transaction != null) {
                transaction.rollback();
            }
        }
    }

   /* public void deleteTicket(Ticket ticket) {
        Transaction transaction = null;
        Session session = DBUtil.getSessionFactory().openSession();

        try {
            transaction = session.beginTransaction();
            session.delete(ticket);

            transaction.commit();
            System.out.println("Your reservation has been successfully cancelled.");

        } catch (Exception ex) {
            System.out.println(ex.getMessage());

            if (transaction != null) {
                transaction.rollback();
            }
        }
    }*/
}
