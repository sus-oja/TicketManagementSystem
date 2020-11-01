package util;

import model.Shows;
import model.Client;
import model.Location;
import model.Schedule;
import model.Seat;
import model.Ticket;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;
import org.apache.commons.configuration.PropertiesConfiguration;

import java.util.Properties;

public class DBUtil {
    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory() {
        try{
            // to manage credentials etc in a separate file
            PropertiesConfiguration applicationProperties = new PropertiesConfiguration();
            applicationProperties.load("application.properties");

            Configuration configuration = new Configuration();
            Properties properties = new Properties();

            properties.put(Environment.DRIVER, "com.mysql.jdbc.Driver");
            properties.put(Environment.URL, "jdbc:mysql://localhost:3306/theatre?createDatabaseIfNotExist=true&serverTimezone=UTC");

            // all 3 database logins are here
            // just comment out own to make a connection

            //Airika user
            properties.put(Environment.USER, applicationProperties.getString("dbUsernameAir"));
            properties.put(Environment.PASS, applicationProperties.getString("dbPasswordAir"));
            properties.put(Environment.DIALECT, applicationProperties.getString("dbDialectAir"));
            //Kristiina user
            /*properties.put(Environment.USER, applicationProperties.getString("dbUsernameKri"));
            properties.put(Environment.PASS, applicationProperties.getString("dbPasswordKri"));
            properties.put(Environment.DIALECT, applicationProperties.getString("dbDialectKri"));*/
            //Susanna user
            /*properties.put(Environment.USER, applicationProperties.getString("dbUsernameSus"));
            properties.put(Environment.PASS, applicationProperties.getString("dbPasswordSus"));
            properties.put(Environment.DIALECT, applicationProperties.getString("dbDialectSus"));*/

            properties.put(Environment.SHOW_SQL, "true");
            properties.put(Environment.HBM2DDL_AUTO, "update");             // this one should use carefully "create-drop" will do full data restart. Best even to comment out.
            properties.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");


            configuration.setProperties(properties);

            //all entities need to be registered
            configuration.addAnnotatedClass(Shows.class);
            configuration.addAnnotatedClass(Client.class);
            configuration.addAnnotatedClass(Location.class);
            configuration.addAnnotatedClass(Schedule.class);
            configuration.addAnnotatedClass(Seat.class);
            configuration.addAnnotatedClass(Ticket.class);

            ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().
                    applySettings(configuration.getProperties()).build();

            sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return sessionFactory;
    }

}
