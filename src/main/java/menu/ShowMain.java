package menu;

<<<<<<< HEAD:src/main/java/menu/RunningShow.java
import model.Shows;
=======
import model.Location;
import model.Schedule;
import model.Shows;
import org.hibernate.Session;
import repository.LocationDao;
import repository.ScheduleDao;
>>>>>>> c9666d13df0f8ed2fed87db6dd14eaf901369f45:src/main/java/menu/ShowMain.java
import repository.ShowsDao;

public class ShowMain {

<<<<<<< HEAD:src/main/java/menu/RunningShow.java
    public static void createShow() {
=======
    public static void enterShows() {
>>>>>>> c9666d13df0f8ed2fed87db6dd14eaf901369f45:src/main/java/menu/ShowMain.java
        Shows shows1 = new Shows("Emadepäev", "“Emadepäev” heitlik, paiguti naerma " +
                "ja paiguti hulluks ajav lavastus täis kraaklemist, rõõmu, nuttu, " +
                "armastust, ürgvarajasi hommikuid ja hirmhiliseid õhtuid, kõikjal " +
                "vedelevaid mänguasju, pähekulunud lastelaule, ebaõnnestunud " +
                "sünnipäevatorte ning lõputuid muusikakooliaktuseid.",
                "2 tundi", "Komöödia", "Liis Aedmaa");

        Shows shows2 = new Shows("Sorri, ei saa aidata", "Etendus räägib keskikka " +
                "jõudnud mehe ummikaastatest. See on lugu kaduvast mehelikkusest, tugevast ja " +
                "tahtejõulisest naiselikkusest, isekusest ja andestamise raskusest, millesse on " +
                "põimitud vabastavat nalja ja huumorit.", "2 tundi ja 15 minutit", "Komöödia",
                "Tanel Ingi");

        Shows shows3 = new Shows("Peer Gynt", "Lavastuses „Peer Gynt” on norra " +
                "muinasjutumaailm ja Ibseni pillav fantaasia ühendatud tänapäeva folklooriga. " +
                "Sellest kooslusest sünnib sürrealistlik kabaree. Peer Gynt on meie aja kangelane. " +
                "Ta on noor, ilus ja andekas! Küsimusele: „Olla või mitte olla?“ " +
                "vastab Peer Gynt: „Olla ise!“", "2 tundi", "Drama", "Karl Laumets");

        Shows shows4 = new Shows("Once", "John Carney mängufilmil põhinev muusikal “Once” " +
                "(“Ükskord”) on isemoodi lugu üksindusest, kirest ja lootustest. Samuti muusika rollist meie elus.",
                "2 tundi ja 20 minutit", "Muusikal", "Taago Tubin");

        Shows shows5 = new Shows("Etturid", "„Etturid” on lugu kolme noore mehe – Agu, Heiki ja " +
                "Valduri – võitlusest iseendaks jäämise nimel, samal ajal kui ümbritsev tegelikkus seda üha vähem " +
                "võimaldab. Ideaalide kuhtumise ja purunemise lugu, mis sunnib paratamatult küsima: kuidas käituksime " +
                "ise, kui satuksime samasugustesse oludesse?", "2 tundi ja 20 minutit", "Põnevusdraama",
                "Taago Tubin");

        ShowsDao showsDao = new ShowsDao();
        showsDao.createShows(shows1);
        showsDao.createShows(shows2);
        showsDao.createShows(shows3);
        showsDao.createShows(shows4);
        showsDao.createShows(shows5);

    }
}
