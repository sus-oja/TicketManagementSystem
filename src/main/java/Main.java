<<<<<<< HEAD
import menu.*;
=======
import menu.LocationMain;
import menu.ScheduleMain;
import menu.ShowMain;
import menu.TicketMain;

import java.time.LocalDateTime;
>>>>>>> c9666d13df0f8ed2fed87db6dd14eaf901369f45

public class Main {
    public static void main(String[] args) {

<<<<<<< HEAD
    // comment out suitable method for run.

        ClientMain.saveClient ();

        RunningShow.createShow();

        LocationMain.saveLocation();

        //TicketMain.createTicket(); ----> jookseb, kui võtta meetodist ära sisu( String[] args) aga siis küsib kõigepealt Client parameetreid ja protsess läheb edasi.

        //ScheduleMain.createSchedule();


=======
        /*LocationMain.enterLocations();
        ShowMain.enterShows();

        LocalDateTime showTime = LocalDateTime.of(2020, 11, 30, 19, 00);
        ScheduleMain.createScheduleEntry(showTime, 1, 1);*/

        TicketMain.purchaseTickets();
>>>>>>> c9666d13df0f8ed2fed87db6dd14eaf901369f45
    }
}