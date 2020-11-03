package menu;

import model.Client;
import repository.ClientDao;
import java.util.Scanner;

public class ClientMain {

    public static void main(String[] args) {
        Client newClient = new Client();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give first name: ");
        newClient.setFirstName(scanner.nextLine());

        System.out.println("Give last name: ");
        newClient.setLastName(scanner.nextLine());

        System.out.println("Give email: ");
        newClient.setEmail(scanner.nextLine());

        //System.out.println(newClient.getFirstName());

        ClientDao clientDao = new ClientDao();
        clientDao.createClient(newClient);

    }
}