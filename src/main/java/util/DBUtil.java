package util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import java.util.Properties;

public class DBUtil {
    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory() {
        try{
            Configuration configuration = new Configuration();
            Properties properties = new Properties();

            properties.put(Environment.DRIVER, "com.mysql.jdbc.Driver");
            properties.put(Environment.URL, "jdbc:mysql://localhost:3306/users?createDatabaseIfNotExist=true&serverTimezone=UTC");
            properties.put(Environment.USER, "root");
            properties.put(Environment.PASS, "5iiruViiruline.");
            properties.put(Environment.SHOW_SQL, "true");
            properties.put(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect");
            properties.put(Environment.HBM2DDL_AUTO, "create-drop");
            properties.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");

            configuration.setProperties(properties);

            ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().
                    applySettings(configuration.getProperties()).build();

            sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return sessionFactory;
    }
}
