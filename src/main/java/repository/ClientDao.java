package repository;

import model.Client;
import model.Location;
import org.hibernate.query.Query;
import util.DBUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;


public class ClientDao {

    public void createClient(Client client) {
        Session session = DBUtil.getSessionFactory().openSession();
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();
            session.save(client);
            transaction.commit();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());

            if (transaction != null) {
                transaction.rollback();
            }
        }
        session.close();
    }
    public void updateClient(Client client) {
        Session session = DBUtil.getSessionFactory().openSession();
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();
            session.update(client);
            transaction.commit();
            System.out.println("The client has been successfully updated.");
        } catch (Exception ex) {
            ex.printStackTrace();

            if (transaction != null) {
                transaction.rollback();
            }
        }
        session.close();
    }

    public Client getClient(long clientId) {
        Session session = DBUtil.getSessionFactory().openSession();

        try {
            //return session.find(Client.class, clientId);
            Client client = session.find(Client.class, clientId);
            return client;
        } catch (Exception ex) {
            System.out.println("Unable to find the client you are looking for.");
            ex.printStackTrace();
            return null;
        }
    }

   /* public List<Client> getClients() {
        Session session = DBUtil.getSessionFactory().openSession();
        return session.createQuery("from Client", Client.class).list();
    }
    //In JPQL (or HQL), you must use the Java class name and property names of the mapped @Entity instead of the actual table name and column names.
    public List<Client> getClients(int ticketId) {
        Session session = DBUtil.getSessionFactory().openSession();
        Query query = session.createQuery("FROM Client WHERE ticket_id = :ticId", Client.class); //or ticket
        query.setParameter("ticId", "'"+ticketId+"'");
        return query.list();
    }*/

    public void deleteClient(Client client) {
        Transaction transaction = null;
        Session session = DBUtil.getSessionFactory().openSession();

        try {
            transaction = session.beginTransaction();
            session.delete(client);

            transaction.commit();
            System.out.println("Your client has been successfully deleted from database.");

        } catch (Exception ex) {
            System.out.println(ex.getMessage());

            if (transaction != null) {
                transaction.rollback();
            }
        }
        session.close();
    }

}
