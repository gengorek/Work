package tictactoe;

public class GameBoard {
    char[][] boardSize;
    //z czego składa się GameBoard?jakie ma mieć pole, w którym przechowamy postawione znaki?
    void boardSize(int size){
        boardSize = new char[size][size];
    }

}
