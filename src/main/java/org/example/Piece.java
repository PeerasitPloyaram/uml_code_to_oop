package org.example;

public class Piece {
    private Square location = new Square("1");

    public void setLocation(int newLoc){
        location.setName(Integer.toString(newLoc));
    }

    public String getLocation(){
        return location.getLocation();
    }
}
