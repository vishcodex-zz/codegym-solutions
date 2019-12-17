package com.codegym.task.task22.task2213;

public class GamePieceFactory {
    int x;
    int y;
    int m;
    public static GamePiece createRandomGamePiece(int x, int y)
    {
        return new GamePiece(x,y);
    }
}
