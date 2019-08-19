package tictactoe;

public class Screen {
    public void welcomeInfo() {
        //przywitanie
        System.out.println("Hello, you are going to play Tic Tac Toe game! \nYour board is empty");
    }

    public void printBoard(GameBoard board) {
        //wyświetlenie planszy w stylu:
        //[ ][ ][ ]
        //[X][ ][ ]
        //[O][ ][ ]
        for (int row = 0; row < board.boardSize.length; row++) {
            for (int column = 0; column < board.boardSize[row].length; column++) {
                System.out.print("[" + board.boardSize[row][column] + "]");
            }
            System.out.println();
        }
    }

    public void currentPlayerInfo(char currentMark) {
        //komunikat czyj ruch
        System.out.printf("Is time for %c to play\nType in your coordinates.\n",  currentMark );
    }

    public void winInfo(char currentMark) {
        //pokazujemy który zawodnik wygrał
        System.out.printf("The winner is %c", currentMark);
    }

    public void drawInfo() {
        //info o remisie
        System.out.println("No winner :(");
    }

    public void coordinatesOutOfRange() {
        System.out.println("Coordnates out of range, type again.");
    }

    public void fieldTaken() {
        System.out.println("Field already taken, type again.");
    }
}
