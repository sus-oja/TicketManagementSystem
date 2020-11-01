import model.Client;
import repository.ClientDao;

public class Main {

    public static void main(String[] args) {

        Client client = new Client(
                "Annika", "Test", "annika@test.ee");

        ClientDao clientDao = new ClientDao();
        clientDao.createClient(client);


    }
}
