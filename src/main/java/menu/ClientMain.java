package menu;

import model.Client;
import model.Schedule;
import repository.ClientDao;
import repository.ScheduleDao;

import java.util.List;
import java.util.Scanner;

public class ClientMain {

    public static void main(String[] args) {
    }

    //public static void saveClient(String[] args) {
    public static void saveClient() {
        Client newClient = new Client();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give first name: ");
        newClient.setFirstName(scanner.nextLine());

        System.out.println("Give last name: ");
        newClient.setLastName(scanner.nextLine());

        System.out.println("Give email: ");
        newClient.setEmail(scanner.nextLine());

        ClientDao clientDao = new ClientDao();
        clientDao.createClient(newClient);



       System.out.println("The new client is: " + newClient.getFirstName() + " " + newClient.getLastName() + ", " + newClient.getEmail());

    }
}