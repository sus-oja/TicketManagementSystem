package menu;

import model.Location;
import model.Schedule;
import model.Shows;
import repository.LocationDao;
import repository.ScheduleDao;
import repository.ShowsDao;

import java.sql.Date;

public class ScheduleMain {
    public static void createSchedule(){

// kuidagi teistmoodi tuleb kuupäeva sisestus teha.

        Schedule schedule = new Schedule(new Date(2020,10,1));

        LocationDao locationDao = new LocationDao();
        Location location = locationDao.getLocation(2); //andmebaasist IDga küsitud
        schedule.setLocation(location);

        ShowsDao showsDao = new ShowsDao();
        Shows show = showsDao.getShow(2);
        schedule.setShow(show);

        ScheduleDao scheduleDao = new ScheduleDao();
        scheduleDao.createSchedule(schedule);

        System.out.println(schedule.getStartTime());


    } //psvm
} //ScheduleMain class
