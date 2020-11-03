package menu;

import model.Location;
import model.Schedule;
import model.Shows;
import org.hibernate.Session;
import repository.LocationDao;
import repository.ScheduleDao;
import repository.ShowsDao;
import util.DBUtil;

import java.sql.Date;
import java.util.List;

public class RunningShow {

    public static void main(String[] args) {
        Shows shows1 = new Shows("Emadepäev", "“Emadepäev” heitlik, paiguti naerma " +
                "ja paiguti hulluks ajav lavastus täis kraaklemist, rõõmu, nuttu, " +
                "armastust, ürgvarajasi hommikuid ja hirmhiliseid õhtuid, kõikjal " +
                "vedelevaid mänguasju, pähekulunud lastelaule, ebaõnnestunud " +
                "sünnipäevatorte ning lõputuid muusikakooliaktuseid.",
                120, "Komöödia", "Liis Aedmaa");

        Shows shows2 = new Shows("Sorri, ei saa aidata", "Etendus räägib keskikka " +
                "jõudnud mehe ummikaastatest. See on lugu kaduvast mehelikkusest, tugevast ja " +
                "tahtejõulisest naiselikkusest, isekusest ja andestamise raskusest, millesse on " +
                "põimitud vabastavat nalja ja huumorit.", 175, "Komöödia",
                "Tanel Ingi");

        Shows shows3 = new Shows("Peer Gynt", "Lavastuses „Peer Gynt” on norra " +
                "muinasjutumaailm ja Ibseni pillav fantaasia ühendatud tänapäeva folklooriga. " +
                "Sellest kooslusest sünnib sürrealistlik kabaree. Peer Gynt on meie aja kangelane. " +
                "Ta on noor, ilus ja andekas! Küsimusele: „Olla või mitte olla?“ " +
                "vastab Peer Gynt: „Olla ise!“", 120, "Drama", "Karl Laumets");

        Shows shows4 = new Shows("Once", "ohn Carney mängufilmil põhinev muusikal “Once” " +
                "(“Ükskord”) on isemoodi lugu üksindusest, kirest ja lootustest. Samuti muusika rollist meie elus.",
                140, "Muusikal", "Taago Tubin");

        Shows shows5 = new Shows("Etturid", "„Etturid” on lugu kolme noore mehe – Agu, Heiki ja " +
                "Valduri – võitlusest iseendaks jäämise nimel, samal ajal kui ümbritsev tegelikkus seda üha vähem " +
                "võimaldab. Ideaalide kuhtumise ja purunemise lugu, mis sunnib paratamatult küsima: kuidas käituksime " +
                "ise, kui satuksime samasugustesse oludesse?", 140, "Põnevusdraama",
                "Taago Tubin");

        ShowsDao showsDao = new ShowsDao();
        showsDao.createShows(shows1);


// siit peaks toimuma ostetava pileti ja schedule ühendamine aga millegipärast ei toimi. Tõstsin eraldi klassi ScheduleMain.
    /*    createSchedule();
    }

    public static void createSchedule(){

        Schedule schedule = new Schedule(new Date(2020,10,1));

        LocationDao locationDao = new LocationDao();
        Location location = locationDao.getLocation(2); //andmebaasist IDga küsitud
        schedule.setLocation(location);

        ShowsDao showsDao = new ShowsDao();
        Shows show = showsDao.getShow(2);
        schedule.setShow(show);

        ScheduleDao scheduleDao = new ScheduleDao();
        scheduleDao.createSchedule(schedule);

        System.out.println(schedule.getStartTime());

    }*/
    }
}
