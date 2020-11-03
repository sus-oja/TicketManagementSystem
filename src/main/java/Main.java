import menu.LocationMain;
import menu.ScheduleMain;
import menu.ShowMain;
import menu.TicketMain;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        /*LocationMain.enterLocations();
        ShowMain.enterShows();

        LocalDateTime showTime = LocalDateTime.of(2020, 11, 30, 19, 00);
        ScheduleMain.createScheduleEntry(showTime, 1, 1);*/

        TicketMain.purchaseTickets();
    }
}