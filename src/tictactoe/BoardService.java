package tictactoe;

public class BoardService {
    GameBoard gameBoard;

    void mark(Coordinates coordinates, char currentMark) {
        //wiemy, że koordynaty są poprawne chcemy pod nie wstawić znak
//        gameBoard.boardSize[coordinates.coordinatesHolder[0]][coordinates.coordinatesHolder[1]] = currentMark;
    }

    boolean isWin(char currentMark) {
        //metoda ma sprawdzać czy istnieje jakiś układ wygrywający dla danego znaku

        // Sprawdzenie czy w rzedzie sa 3 te same pola.
        int column = 0;
        int row;
        boolean flag;
        boolean winCheck;
        do{
            row = 0;
            do {
                if (gameBoard.boardSize[column][row] == 'O' || gameBoard.boardSize[column][row] == 'x' ){
                    winCheck = true;
                    flag = true;
                }else{
                    winCheck = false;
                    flag = false;
                }
                row++;
            }while(row < gameBoard.boardSize[column].length && flag);
            column++;
        }while(column < (gameBoard.boardSize.length - 1) && !flag);
        if (winCheck) {
            return true;
        }
        flag = true;
        column = 0;
        row = 0;
        do{
            do {
                if (gameBoard.boardSize[column][row] == 'O' || gameBoard.boardSize[column][row] == 'x' ){
                    winCheck = true;
                }else{
                    winCheck = false;
                    flag = false;
                }
                column++;
            }while(row < gameBoard.boardSize.length || flag);
            row++;
        }while(column < gameBoard.boardSize[row].length);
        if (winCheck) {
            return true;
        }
        return false;
    }

    void create(int size) {
        gameBoard = new GameBoard();
        gameBoard.boardSize(size);
    }

    public void emptyBoard() {
        for (int rows = 0; rows < gameBoard.boardSize.length; rows++) {
            for (int columns = 0; columns < gameBoard.boardSize[rows].length; columns++) {
                gameBoard.boardSize[rows][columns] = ' ';
            }
        }
    }

    public boolean isAvailable(int coordinatesColumns, int coordinatesRows) {
        return gameBoard.boardSize[coordinatesColumns][coordinatesRows] != ' ' ? true:false;
    }
}
