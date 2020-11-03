package menu;

import model.*;
import repository.*;

import java.sql.Date;
import java.time.LocalDateTime;
import java.util.List;

public class ScheduleMain {
    public static void main (String[] args){
        // createScheduleEntry();
    }
    public static void createSchedule(LocalDateTime starTime, int locationId, int showId){


        //Schedule schedule = new Schedule(new Date(2020,10,1));
        Schedule schedule = new Schedule(starTime);

        LocationDao locationDao = new LocationDao();
        Location location = locationDao.getLocation(locationId);
        schedule.setLocation(location);

        ShowsDao showsDao = new ShowsDao();
        Shows show = showsDao.getShow(showId);
        schedule.setShow(show);

        ScheduleDao scheduleDao = new ScheduleDao();
        scheduleDao.createSchedule(schedule);

        System.out.println(schedule.getStartTime());
    }
    //createSchedule

    public static void printSchedule() {
        ScheduleDao scheduleDao = new ScheduleDao();
        List<Schedule> schedules = scheduleDao.getSchedules();

        if(schedules.isEmpty()) {
            System.out.println("No upcoming shows at the moment");
        } else {
            for (Schedule s : schedules) {
                System.out.println(s.getScheduleId() + "\t" + String.format("%-24s", s.getShow().getTitle()) + String.format("%-20s", s.getStartTime()) + String.format("%-22s", s.getLocation().getLocationName()));
            }
        }
    }

//calculation of available seats per show

    public static void checkAvailability(long scheduleId) {
        ScheduleDao scheduleDao = new ScheduleDao();
        List<Schedule> schedules = scheduleDao.getSchedules();

        int indexOfShow = 0;

        for (Schedule s : schedules) {
            if (schedules.contains(scheduleId)) {
                indexOfShow = (int) scheduleId;
                break;
            }
        }

        Schedule sch = schedules.get(indexOfShow);
        Location loc = sch.getLocation();
        int max = loc.getMaxSeats();

        TicketDao ticketDao = new TicketDao();
        List<Ticket> tickets = ticketDao.getTickets(scheduleId);
        int soldTickets = tickets.size();
        if (soldTickets == max )
            System.out.println("Sorry, we are sold out!");
        //lisa siia ELSE, mis võrdleb ostetavat kogust alles jäänud istmetega
    }
} //ScheduleMain class


