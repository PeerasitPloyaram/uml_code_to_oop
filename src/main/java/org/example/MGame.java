package org.example;

import java.util.List;

public class MGame {
    private int roundCat = 0;
    private int N = 3;
    private Board board;
    private Player[] players = new Player[N];
    private Die dice = new Die();

    private void initPlayer(){
        for (int i = 0; i < N; i++){
            players[i] = new Player("Player " + i);
        }
    }

    private void playRound(){
        for (int i = 0; i < N; i++){
            if (players[i].getTakeTurn() == 1){
                Player player = players[i];
                dice.roll();
                int roll = dice.getFaceValue();
                System.out.println(player.getName() + " roll:" + roll);
                player.setNewLoc(roll);

            }
        }

    }

    public void playGame(){
        initPlayer();
        while (roundCat < N){
            System.out.println("===== Round"+ roundCat+ " =====");
            playRound();
            roundCat += 1;
        }
    }
}
