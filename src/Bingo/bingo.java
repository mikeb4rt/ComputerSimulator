package Bingo;

import java.util.ArrayList;

public class bingo {
    final private Player p1;
    final private Player p2;
    private ArrayList<Integer> drum = new ArrayList<Integer>();

    //Constructor
    public bingo (Player j1, Player j2){
        this.p1 = j1;
        this.p2 = j2;
        initDrum();
    }

    //Getters
    public ArrayList<Integer> getDrum() {
        return drum;
    }

    //Methods
    //Inicia el bombo con numeros del 1-99
    private void initDrum(){
        for (int i = 1; i <= 99; i++) {
            drum.add(i);
        }
    }

    //Comprueba cuandon un jugador hace bingo
    public boolean win(Player player){
        return player.getCardboard().size() == 0;
    }
}