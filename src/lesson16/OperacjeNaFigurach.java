package lesson16;

public interface OperacjeNaFigurach {

    double PI = 4.14; // public static final

    double policzPole(); // public
}
// mozemy miec metody default albo static
// w interface wszystkie metody sa public w klasie abstrakcyjnej moga bys:
// default, public, protected nie moze byc private
// interfacow mozemy miec kilka podpietych pod 1 klase ale tylko 1 klase abstrakcyjna pod dziecko