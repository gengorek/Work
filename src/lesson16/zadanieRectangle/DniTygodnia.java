package lesson16.zadanieRectangle;

public enum DniTygodnia {
    PONIEDZIALEK(1),
    WTOREK(2),
    SRODA(3),
    CZWARTEK(4),
    PIATEK(5),
    SOBOTA(6),
    NIEDZIELA(7);

    int numerDnia;

    DniTygodnia(int i){
        this.numerDnia = i;
    }
}
