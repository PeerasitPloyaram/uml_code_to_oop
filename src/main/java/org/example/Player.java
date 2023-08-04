package org.example;

public class Player {
    private String name;
    private int takeTurn = 1;
    private Die dice = new Die();
    private Board board = new Board();
    private Piece piece = new Piece();

    private int fv;
    private int oldLoc;
    private int newLoc;

    public Player(String name){
        this.name = name;
    }

    public int getTakeTurn() {
        return this.takeTurn;
    }

    public void setTakeTurn(int takeTurn) {
        this.takeTurn = takeTurn;
    }

    public void roll(){
        dice.roll();
        this.fv = dice.getFaceValue();
    }

    public String getName(){
        return this.name;
    }

    public int getFv(){
        return this.fv;
    }

    public int getOldLoc(){
        return this.oldLoc;
    }
    public void setOldLoc(int loc){
        this.oldLoc = loc;
    }

    public int getNewLoc(){
        return this.newLoc;
    }
    public void setNewLoc(int loc){
        this.newLoc = loc;
    }

}
