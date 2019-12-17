package com.codegym.task.task22.task2213;

public class Tetris {
    static Tetris game;
    private Field field;
    private GamePiece gamePiece;
    public static void main(String[] args) {
        game = new Tetris();
        game.run();
    }

    public Field getField() {
        return field;
    }

    public void setField(Field field) {
        this.field = field;
    }

    public GamePiece getGamePiece() {
        return gamePiece;
    }

    public void setGamePiece(GamePiece gamePiece) {
        this.gamePiece = gamePiece;
    }

    public void run(){

    }

    public void step(){

    }
}
