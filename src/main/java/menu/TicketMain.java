package menu;

import model.Client;
import repository.TicketDao;

import java.util.Scanner;

public class TicketMain {

<<<<<<< HEAD
    public static void createTicket(String[] args) {
=======
    public static void purchaseTickets() {
>>>>>>> c9666d13df0f8ed2fed87db6dd14eaf901369f45

        Scanner scan = new Scanner(System.in);
        TicketDao ticketDao = new TicketDao();

        System.out.println("WELCOME TO UGALA! \nWhich show would you like to see?");

        ScheduleMain.printSchedule();

        System.out.println("Please enter show's ID number from the schedule: ");
        long scheduleId = scan.nextInt();

        System.out.println("How many tickets would you like to purchase? Enter number of tickets here: ");
        int numberOfTickets = scan.nextInt();

        System.out.println("Checking availability...");
        if(!ScheduleMain.checkAvailability(scheduleId, numberOfTickets)) {
            return;
        }


        int typeOfTicket = scan.nextInt();
        double price = 0;

        while (price == 0) {
            if (typeOfTicket == 1) {
                price = 17.00;
            } else if (typeOfTicket == 2) {
                price = 15.00;
            } else if (typeOfTicket == 3) {
                price = 10.00;
            } else {
                System.out.println("Please enter the right code (1-3): ");
                typeOfTicket = scan.nextInt();
            }
        }

<<<<<<< HEAD
//creating the tickets
            Client client = ClientMain.saveClient();

        while (numberOfTickets > 0) {

            Ticket ticket1 = new Ticket();
            ticket1.setTicketPrice(ticket.getTicketPrice());

            ticket1.setClient(client);
=======

        Client client = ClientMain.saveClient();
        while (numberOfTickets > 0) {
            ticketDao.createTicket(price, scheduleId, client);
            numberOfTickets--;
        }
>>>>>>> c9666d13df0f8ed2fed87db6dd14eaf901369f45

        System.out.println("Thank you, " + client.getFirstName() + ", for your purchase. We hope you enjoy the show!");


    }
}
