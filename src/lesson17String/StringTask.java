package lesson17String;

import java.util.Scanner;

public class StringTask {
    private String zdanieOdUzytkownika;

    public StringTask() {
        Scanner wczytaj = new Scanner(System.in);
        zdanieOdUzytkownika = wczytaj.nextLine();
    }

    public String getZdanieOdUzytkownika() {
        return zdanieOdUzytkownika;
    }

    public void setZdanieOdUzytkownika(String zdanieOdUzytkownika) {
        this.zdanieOdUzytkownika = zdanieOdUzytkownika;
    }


    public String[] podzielZdanie() {
        return zdanieOdUzytkownika.split(" ");
    }
}
