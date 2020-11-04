iimport java.time.LocalDateTime;
import menu.*;

public class Main {
    public static void main(String[] args) {

        /*LocationMain.enterLocations();
        ShowMain.enterShows();

        LocalDateTime showTime = LocalDateTime.of(2020, 11, 30, 19, 00);
        ScheduleMain.createScheduleEntry(showTime, 1, 1);*/

        TicketMain.purchaseTickets();

    }

    public static void separatedActions(){
    // comment out suitable method for run.

        ClientMain.saveClient ();

        RunningShow.createShow();

        LocationMain.saveLocation();

        //TicketMain.createTicket(); ----> jookseb, kui võtta meetodist ära sisu( String[] args) aga siis küsib kõigepealt Client parameetreid ja protsess läheb edasi.

        //ScheduleMain.createSchedule();


    }
}