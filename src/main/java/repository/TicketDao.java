package repository;

import model.Ticket;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.DBUtil;

import java.util.List;

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

        session.close();
    }

    public void updateTicket(Ticket ticket) {
        Session session = DBUtil.getSessionFactory().openSession();
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();
            session.update(ticket);
            transaction.commit();
            System.out.println("The ticket has been successfully updated.");
        } catch (Exception ex) {
            ex.printStackTrace();

            if (transaction != null) {
                transaction.rollback();
            }
        }
        session.close();
    }

    /*public void bookTicket() {
        System.out.println("Which show would you like to see? Enter the ID from the schedule: ");

    }*/

    public List<Ticket> getTickets() {
        Session session = DBUtil.getSessionFactory().openSession();
        return session.createQuery("FROM tickets", Ticket.class).list();
    }

    public void deleteTicket(Ticket ticket) {
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
        session.close();
    }
}
