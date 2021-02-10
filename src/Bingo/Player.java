package Bingo;

import java.util.ArrayList;

public class Player {
    final private String name;
    public ArrayList<Integer> cardboard = new ArrayList<Integer>();

    //Contructor
    public Player(String name){
        this.name = name;
        initCardboard();
    }

    //Getters
    public String getName() {
        return name;
    }

    public ArrayList<Integer> getCardboard() {
        return cardboard;
    }

    //Methods

    //Tacha un numero
    public void crossOutNum(int pellet,ArrayList cardboard){
        if (cardboard.contains(pellet)){
            cardboard.remove((Integer) pellet);
        }
    }

    //Genera los numeros de la cartulina
    private void initCardboard(){
        while (cardboard.size() <= 10){
            int random = (int) ((Math.random() * 98) + 1);
            if (!cardboard.contains(random)){
                cardboard.add(random);
            }
        }
    }
}
