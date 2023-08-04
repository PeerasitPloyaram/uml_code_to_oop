package org.example;

import java.util.Arrays;
import java.util.List;

public class Board {
    private Square[] squares = new Square[40];

    public String getSquare(int oldLoc, int fvTot){
        return squares[oldLoc].getLocation();
    }

    public void  setSquares(int Loc,int fv){
        squares[Loc].setName(Integer.toString(fv));
    }
}
