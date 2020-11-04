import services.*;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        //the full process of buying a ticket with creating the show and a client.

       /* LocationMain.enterLocations();
        ShowMain.enterShows();

        LocalDateTime showTime = LocalDateTime.of(2020, 11, 30, 19, 00);
        ScheduleMain.createScheduleEntry(showTime, 1, 1);*/

        //TicketMain.purchaseTickets();

    }

    public static void separatedServiceRun(){

        // separated functionalities to enter data of Client, Show, Location
        // comment out suitable method for run.

        //ClientMain.enterClient(); // midagi on valesti

        //ShowMain.enterShows();

        LocationMain.enterLocations();

    }
}