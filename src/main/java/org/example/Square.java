package org.example;

public class Square {
    private String name;

    public Square(String name){
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getLocation(){
        return this.name;
    }
}
