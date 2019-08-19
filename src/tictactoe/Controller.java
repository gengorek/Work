package tictactoe;


import java.util.Scanner;

public class Controller {//klasa która jest "mózgiem" całej gry
    Screen screen;
    BoardService boardService;
    int size = 3;

    void play() {
        screen = new Screen();//tworzymy obiket klasy Screen
        screen.welcomeInfo();//wyświetlamy info powitalne
        char cross = 'X';//uprośćmy to bez Playera, gdyż wczytanie tablicy charów jest dość problematyczne :)
        char circle = 'O';//w zamian za to mamy zienne trzymające symbole

        boardService = new BoardService();
        boardService.create(size);//musimy stworzyć planszę zadanaego rozmiaru
        boardService.emptyBoard();
        screen.printBoard(boardService.gameBoard);//drukujemy graczom planszę, co przekazać metodzie?

        char currentMark;//deklarujemy zmienną, w której będziemy trzymali aktualny znak w grze
        boolean win;//tworzymy flagę do trzymania informacji czy jest wygrana

        int rounds = 0;//zmienna do trzymania aktualnej rundy
        do {
            currentMark = rounds % 2 == 0 ? cross : circle;//do aktualnego znaku przypisujemy znak w zależności od parzystości rundy
            screen.currentPlayerInfo(currentMark);//wyświetlamy info o tym kto wykonuje ruch
            Coordinates coordinates = getValidCoordinates();//pobieramy koordynaty, ale chcemy mieć pewność, że będą one poprawne
            boardService.mark(coordinates, currentMark);//mając poprawne koordynaty zaznaczamy na planszy znak
            screen.printBoard(boardService.gameBoard);//drukujemy planszę
            win = boardService.isWin(currentMark);//sprawdzamy czy po postawieniu znaku gracz wygrał
            rounds++;//zwiększamy rundy
        } while (rounds < size && !win);//sprawdzamy czy grać dalej, rounds < od ilu?

        manageEndGame(currentMark, win);//zadanie do wyświetlenia wyników oddelegujemy sobie do metody
    }

    Coordinates getValidCoordinates() {
        //chcemy tutaj wczytać koordynaty i zwrócić poprawne, co to znaczy poprawne?
        //jeśli wychodzimy poza plansze odpowiedni komunikat
        //jeśli pole jest zajęte (kto to wie?) również komunikat
        //zczytujemy koordynaty dopóki nie są poprawne
        int coordinatesRows;
        int coordinatesColumns;
        Coordinates coordinates = new Coordinates();
        boolean allOK = false;

        do {
            coordinatesRows = new Scanner(System.in).nextInt();
            coordinatesColumns = new Scanner(System.in).nextInt();

            coordinatesRows--;
            coordinatesColumns--;

            if (coordinatesRows > (size - 1) || coordinatesColumns > (size - 1)) {
                screen.coordinatesOutOfRange();
                continue;
            } else if (boardService.isAvailable(coordinatesColumns, coordinatesRows)){
                screen.fieldTaken();
                continue;
            } else {
                allOK = true;
            }
        }while (!allOK);

        return null;//coordinates.coordinatesHolder;
                                                                                                                         // I have stuck on saving coordinates to variable
    }

    void manageEndGame(char currentMark, boolean win) {
        if (win) {
            screen.winInfo(currentMark);//jeśli ktoś wygrał wypisujemy symbol, który wygrał
        } else {
            screen.drawInfo();//w przypadku remisu wyświetlamy odpowiednie info
        }
    }
}
