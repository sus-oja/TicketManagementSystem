import services.*;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

    // Separated functionalities to enter data of Client, Show, Location

        //LocationMain.enterLocations();

        //ClientMain.enterClient();

    //  Functionalities to enter Show and time of occurrence

        //ShowMain.enterShows();

       /* LocalDateTime showTime = LocalDateTime.of(2020, 12, 12, 19, 00);
        ScheduleMain.createScheduleEntry(showTime, 1, 19);*/


    // the full process of buying a ticket with creating the show and a client.


        TicketMain.purchaseTickets();

    }
}