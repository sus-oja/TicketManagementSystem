package menu;

import model.Shows;
import org.hibernate.Session;
import repository.ShowsDao;
import util.DBUtil;

import java.util.List;

public class RunningShow {
  /*  private static Object ShowsDao;

    public static void main(String[] args){
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

        Shows shows4 = new Shows("Once", "ohn Carney mängufilmil põhinev muusikal “Once” " +
                "(“Ükskord”) on isemoodi lugu üksindusest, kirest ja lootustest. Samuti muusika rollist meie elus.",
                "2 tundi ja 20 minutit", "Muusikal", "Taago Tubin");

        Shows shows5 = new Shows("Etturid", "„Etturid” on lugu kolme noore mehe – Agu, Heiki ja " +
                "Valduri – võitlusest iseendaks jäämise nimel, samal ajal kui ümbritsev tegelikkus seda üha vähem " +
                "võimaldab. Ideaalide kuhtumise ja purunemise lugu, mis sunnib paratamatult küsima: kuidas käituksime " +
                "ise, kui satuksime samasugustesse oludesse?", "2 tundi ja 20 minutit", "Põnevusdraama",
                "Taago Tubin");

        ShowsDao showsDao = new ShowsDao();
        showsDao.createShows((Shows) ShowsDao);


        System.out.println(((Shows) ShowsDao).getTitle());
    }*/
  public static void main(String[] args) {
      List<Shows> allTheatre = ShowsDao.getShows();

      for(Shows theatre : allTheatre) {
          if(theatre.getTitle().equals("Emadepäev")) {
              System.out.println("Your selected show");
          }else{
              System.out.println(theatre.getTitle()+theatre.getDescription());
          }
      }
  }
}
