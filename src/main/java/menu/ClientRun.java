package menu;

import model.Client;
import repository.ClientDao;

import java.util.Scanner;

public class ClientRun {

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







            //Client client1 = Client.get(addclient);
            //System.out.println("1. type first name: ");



            /*Client client = new Client(
                    "Annika", "Test", "annika@test.ee");

            ClientDao clientDao = new ClientDao();
            clientDao.createClient(client);*/
        }
}
