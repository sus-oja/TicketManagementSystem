package repository;

import model.Ticket;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
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

    public void getTicket(long ticketId) {

        try {
            Session session = DBUtil.getSessionFactory().openSession();
            Ticket ticket = session.find(Ticket.class, ticketId);
            //session.close();
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Unable to find the location you are looking for.");
        }
    }

    public List<Ticket> getTickets() {
        Session session = DBUtil.getSessionFactory().openSession();
        return session.createQuery("from Ticket", Ticket.class).list();
    }
//In JPQL (or HQL), you must use the Java class name and property names of the mapped @Entity instead of the actual table name and column names. So the JPQL (or HQL) should be:
    public List<Ticket> getTickets(long scheduleId) {
        Session session = DBUtil.getSessionFactory().openSession();
        Query query = session.createQuery("FROM Ticket WHERE schedule_id = :schId", Ticket.class);
        query.setParameter("schId", "'"+scheduleId+"'");
        return query.list();
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
