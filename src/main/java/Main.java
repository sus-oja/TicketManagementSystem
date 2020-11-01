import Dao.ShowsDao;
import Model.Shows;

public class Main {
    public static void main(String[] args) {
        Shows shows = new Shows("Beauty and the Beast", "bubbly and entertaining", "2 hours and 30 minutes", "Musical", "John Johnson");
        ShowsDao showsDao = new ShowsDao();
        showsDao.createShows(shows);


        System.out.println(shows.getTitle());
    }
}
