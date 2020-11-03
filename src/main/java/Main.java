import menu.*;

public class Main {
    public static void main(String[] args) {

    // comment out suitable method for run.

        ClientMain.saveClient ();

        RunningShow.createShow();

        LocationMain.saveLocation();

        //TicketMain.createTicket(); ----> jookseb, kui võtta meetodist ära sisu( String[] args) aga siis küsib kõigepealt Client parameetreid ja protsess läheb edasi.

        //ScheduleMain.createSchedule();


    }
}