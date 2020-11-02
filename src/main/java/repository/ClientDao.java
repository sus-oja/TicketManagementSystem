package repository;

import model.Client;
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

    public Client getClient(String email) {
        Session session = DBUtil.getSessionFactory().openSession();

        try{
            Client client = session.find(Client.class, email);
            session.close();
            return client;
        }catch (Exception ex){
            session.close();
            System.out.println("Unable to find client with name: " + email);
            ex.printStackTrace();
            return null;
        }
    }
    public List<Client> getClient() {
        Session session = DBUtil.getSessionFactory().openSession();
        return session.createQuery("from Client ", Client.class).list();
    }

    public void updateClient(Client savedClient) {
        Session session = DBUtil.getSessionFactory().openSession();
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();
            session.update(savedClient);
            transaction.commit();
        } catch (Exception ex) {
            ex.printStackTrace();                    // basically System.out.println(ex.getMessage();

            if (transaction != null) {
                transaction.rollback();             // if somethings happens, then rolls back, do not give the error
            }
        }
        session.close();                 // -> activate if Session session starts inside method
    }


    public static void deleteClient(Client savedClient) {
        Session session = DBUtil.getSessionFactory().openSession();
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();
            session.delete(savedClient);
            transaction.commit();
        } catch (Exception ex) {
            ex.printStackTrace();

            if (transaction != null) {
                transaction.rollback();
            }
        }
        session.close();
    }

}
