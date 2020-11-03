package menu;

import model.Client;
import model.Location;
import model.Schedule;
import model.Shows;
import repository.ClientDao;
import repository.LocationDao;
import repository.ScheduleDao;
import repository.ShowsDao;

import java.sql.Date;

public class ScheduleMain {
    public static void createSchedule(int locationId, int showId, int clientId){


        Schedule schedule = new Schedule(new Date(2020,10,1));

        LocationDao locationDao = new LocationDao();
        Location location = locationDao.getLocation(locationId); //andmebaasist IDga küsitud
        schedule.setLocation(location);

        ShowsDao showsDao = new ShowsDao();
        Shows show = showsDao.getShow(showId);
        schedule.setShow(show);

        ClientDao clientDao = new ClientDao();
        Client client = clientDao.getClient(clientId);
        schedule.setClient(client);

        ScheduleDao scheduleDao = new ScheduleDao();
        scheduleDao.createSchedule(schedule);

        System.out.println(schedule.getStartTime());


    } //psvm
} //ScheduleMain class


