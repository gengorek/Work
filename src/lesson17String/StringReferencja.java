package lesson17String;

import java.util.Scanner;

public class StringReferencja {
    public static void main(String[] args) {
        String s1 = "Ala ma kota";
        String s2 = "Ala ma kota";

        String s3 = new String("Ala ma kota");

        s1 = s1.toUpperCase();
        Integer liczba = Integer.parseInt("01011101" ,2);
        Integer liczba2 = 10;
        Integer liczba3 = 10; // do wielkosci bajta czyli 127 jest traktowane jako prymitiw, powyzej jako obiekt
        System.out.println(liczba);
        System.out.println(liczba2 == liczba3);
        liczba2 = 128;
        liczba3 = 128;
        System.out.println(liczba2 == liczba3);
        System.out.println(liczba2.equals(liczba3));


        System.out.println("Podaj zdanie: ");
        StringTask task = new StringTask();
        for (String word : task.podzielZdanie()) {
            System.out.println(word);
        }

        Customer customer;

        customer = new Customer(new Scanner(System.in).nextLine());

        System.out.println(customer.toString());
    }
}
