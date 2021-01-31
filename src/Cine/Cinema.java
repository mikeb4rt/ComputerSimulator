package Cine;
import java.util.ArrayList;

public class Cinema  extends Thread{
    private String name;
    private float cost;
    private Film film;
    private int[] room = new int[72];
    private ArrayList<Integer> sits = new ArrayList<Integer>();


    public Cinema(String name, float cost, Film film){
        this.name = name;
        this.cost = cost;
        this.film = film;
        for (int i = 0; i < 72; i++) {
            this.sits.add(i);
        }
    }

    //Getters

    public String getNames() {
        return name;
    }

    public float getCost() {
        return cost;
    }


    //Setters
    public void setRoom(int pos) {
        this.room[pos] = 1;
    }

    public void setNames(String name) {
        this.name = name;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }


    //Methods
    public boolean occupied(int seat){
        return this.room[seat] == 1;
    }

    public boolean full(){
        return sits.size() == 0;
    }

    public void printRoom(){
        for (int i = 0; i < room.length; i++) {
            System.out.print("|" + this.room[i]);
            if (i % 8 == 0) {
                System.out.print("|");
                System.out.println();
            }
        }
    }
    public void sit() throws InterruptedException {
        int interacciones=0;
        while (!full()){
            Person cliente = new Person();
            if (cliente.getAge() >= this.film.getPeggy() && cliente.getMoney() >= this.getCost()){
                interacciones ++;
                System.out.println();
                System.out.println("Interacciones: " + interacciones);
                int random = (int) (Math.random() * (sits.size() - 1));
                setRoom(sits.get(random));
                sits.remove(random);
                printRoom();
                //sleep(1000);
            }else{
                interacciones ++;
                System.out.println();
                System.out.println("Cliente no cumple las restricciones");
                System.out.println("Interacciones: " + interacciones);
            }
        }
    }

    public boolean full2(){
        int total = 0;
        for (int i : room) {
            total += i;
        }
        return total == 72;
    }

    public void sit2() throws InterruptedException {
        int interacciones = 0;
        while (!full2()){
            Person cliente = new Person();
            if (cliente.getAge() >= this.film.getPeggy() && cliente.getMoney() >= this.getCost()){
                boolean occupied = false;
                while (!occupied) {
                    interacciones ++;
                    System.out.println();
                    System.out.println("Interacciones: " + interacciones);
                    int random = (int) (Math.random() * 72);
                    if (!occupied(random)) {
                        setRoom(random);
                        printRoom();
                        //sleep(1000);
                        occupied = true;
                    }else System.out.println("Asiento ocupado buscando uno disponible");
                }
            }else{
                interacciones ++;
                System.out.println();
                System.out.println("Cliente no cumple las restricciones");
                System.out.println("Interacciones: " + interacciones);
                //sleep(1000);
            }
        }
    }
}
