import repository.ShowsDao;
import model.Shows;

public class Main {
    public static void main(String[] args) {
        Shows shows = new Shows(
                "Beauty and the Beast", "bubbly and entertaining",
                "2 hours and 30 minutes", "Musical", "John Johnson");
        ShowsDao showsDao = new ShowsDao();
        showsDao.createShows(shows);


        System.out.println(shows.getTitle());
    }
//Airika main test
/*
import model.Client;
import repository.ClientDao;


    public class createClient {

        public static void main(String[] args) {

            Client client = new Client(
                    "Annika", "Test", "annika@test.ee");

            ClientDao clientDao = new ClientDao();
            clientDao.createClient(client);
        }
    }*/
}

