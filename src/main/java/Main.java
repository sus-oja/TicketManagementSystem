import repository.ShowsDao;
import model.Shows;

public class Main {
    public static void main(String[] args) {
        Shows shows = new Shows(
                "Emadepäev", "“Emadepäev” heitlik, paiguti naerma " +
                "ja paiguti hulluks ajav lavastus täis kraaklemist, rõõmu, nuttu, " +
                "armastust, ürgvarajasi hommikuid ja hirmhiliseid õhtuid, kõikjal " +
                "vedelevaid mänguasju, pähekulunud lastelaule, ebaõnnestunud " +
                "sünnipäevatorte ning lõputuid muusikakooliaktuseid.",
                "2 hours", "Comedy", "Liis Aedmaa");
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

