package HomeWorkCraftInCode;

public class KostkaRzut {
    public static void main(String[] args){
        System.out.println("Program wylosuje randomowe numery w zasiegu 1 do 6 doda je do siebie" +
                " i poda ile zutow bylo potrzeba");
        int rzutKostka;
        int iloscRzutow = 0;
        int dodaneRzuty = 0;
        do {
            rzutKostka = (int)(Math.random() * 6 + 1);
            System.out.println(rzutKostka);
            dodaneRzuty += rzutKostka;
            iloscRzutow++;
        }while (rzutKostka < 6);
        System.out.println("Wynik dodanych rzutow wynosi: " + dodaneRzuty +
                " Kosta zostala rzucona: " + iloscRzutow + " razy");

    }
}
