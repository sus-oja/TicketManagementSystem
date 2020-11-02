package menu;

import model.Client;
import model.Ticket;
import repository.ClientDao;
import repository.TicketDao;

import java.util.Scanner;

public class TicketMain {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Ticket ticket = new Ticket();
        TicketDao ticketDao = new TicketDao();

        System.out.println("WELCOME TO UGALA!");
        System.out.println("Which show would you like to see? \nPlease enter the ID from the schedule: ");
        int scheduleId = scan.nextInt();

        //Siin peaks toimuma ühendus Schedule tabeliga

        System.out.println("How many tickets would you like to purchase? Enter number of tickets here: ");
        int numberOfTickets = scan.nextInt();

        System.out.println("What type of tickets would you like to purchase?\n");
        System.out.println("1 --- ADULT");
        System.out.println("2 --- STUDENT/CHILD");
        System.out.println("3 --- ELDERLY\n");
        System.out.println("Please enter your code here: ");
        int typeOfTicket = scan.nextInt();
        //ticket.setTicketType(typeOfTicket);

        double price = 0;

        while (price == 0) {
            if (typeOfTicket == 1) {
                price = 17.00;
                ticket.setTicketPrice(price);
            } else if (typeOfTicket == 2) {
                price = 15.00;
                ticket.setTicketPrice(price);
            } else if (typeOfTicket == 3) {
                price = 10.00;
                ticket.setTicketPrice(price);
            } else {
                System.out.println("Please enter the right code (1-3): ");
                typeOfTicket = scan.nextInt();
            }
        }

        System.out.println("Checking availability...");

        //siin peaks kontrollima, kas nii palju ticket'eid on veel olemas - "numberOfAvailableSeats();"?!

        //creating the tickets
        while (numberOfTickets > 0) {
            ticketDao.createTicket(ticket);
            numberOfTickets--;
        }


      /*  See meetod läheb ClientMain'i

        Client client = new Client();
        ClientDao clientDao = new ClientDao();

        System.out.println("Please enter your first name: ");
        scan.nextLine();
        String firstName = scan.nextLine();
        client.setFirstName(firstName);

        System.out.println("Please enter your last name: ");
        String lastName = scan.nextLine();
        client.setLastName(lastName);

        System.out.println("Please enter your e-mail address: ");
        String email = scan.nextLine();
        client.setEmail(email);

        //creating the client
        clientDao.createClient(client);*/

        //System.out.println("Thank you, " + client.getFirstName() + " for your purchase. We hope you enjoy the show.");








    } //psvm
} //TicketMain class
