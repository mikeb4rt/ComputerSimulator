package Bingo;

public class Main {
    public static void main(String[] args) {

        long startime=System.currentTimeMillis();

        Player player1 = new Player("Juande");
        Player player2 = new Player("Ana");
        bingo bingo = new bingo(player1,player2);

        boolean finish = false;

        while (!finish){
            int random = (int) (Math.random() * bingo.getDrum().size());
            int pellet = bingo.getDrum().get(random);
            player1.crossOutNum(pellet,player1.getCardboard());
            player2.crossOutNum(pellet,player2.getCardboard());

            bingo.getDrum().remove((Integer) pellet);

            if (bingo.win(player1) && bingo.win(player2)){
                System.out.println("Draw");
                finish = true;
            }else if(bingo.win(player1)){
                System.out.println(player1.getName() + " wins");
                finish = true;
            }else if (bingo.win(player2)){
                System.out.println(player2.getName() + " wins");
                finish = true;
            }
        }
        long stoptime = System.currentTimeMillis();
        System.out.println("Tiempo de ejecucion: " + (double)(stoptime-startime)+"ms");
    }
}