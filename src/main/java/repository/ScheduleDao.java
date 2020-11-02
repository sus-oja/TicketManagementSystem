package repository;

import model.Location;
import model.Schedule;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.DBUtil;

public class ScheduleDao {

    public void createSchedule(Schedule schedule) {
        Transaction transaction = null;
        Session session = DBUtil.getSessionFactory().openSession();

        try {
            transaction = session.beginTransaction();
            session.save(schedule);

            transaction.commit();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());

            if (transaction != null) {
                transaction.rollback();
            }
        }
        session.close();
    }

    public void updateSchedule(Schedule schedule) {
        Session session = DBUtil.getSessionFactory().openSession();
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();
            session.update(schedule);
            transaction.commit();
            System.out.println("The schedule has been successfully updated.");

        } catch (Exception ex) {
            ex.printStackTrace();

            if (transaction != null) {
                transaction.rollback();
            }
        }
        session.close();
    }

    public void removeSchedule(Schedule schedule) {
        Transaction transaction = null;
        Session session = DBUtil.getSessionFactory().openSession();

        try {
            transaction = session.beginTransaction();
            session.delete(schedule);
            transaction.commit();
            System.out.println("The schedule has been successfully removed.");

        } catch (Exception ex) {
            System.out.println(ex.getMessage());

            if (transaction != null) {
                transaction.rollback();
            }
        }
        session.close();
    }
}