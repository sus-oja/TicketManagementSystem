package menu;

import model.Location;
import repository.LocationDao;

public class LocationMain {

<<<<<<< HEAD
    public static void saveLocation() {
=======
    public static void enterLocations() {
>>>>>>> c9666d13df0f8ed2fed87db6dd14eaf901369f45

        Location grandAuditorium = new Location("The Grand Auditorium", 540);
        Location smallAuditorium = new Location("The Small Auditorium", 155);
        Location chamberHall = new Location("The Chamber Hall", 60);
        Location cellarHall = new Location("The Cellar Hall", 145);

        LocationDao locationDao = new LocationDao();

        locationDao.createLocation(grandAuditorium);
        locationDao.createLocation(smallAuditorium);
        locationDao.createLocation(chamberHall);
        locationDao.createLocation(cellarHall);

    }

}
