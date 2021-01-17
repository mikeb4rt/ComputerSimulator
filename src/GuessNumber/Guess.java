package GuessNumber;

import java.util.ArrayList;
import java.util.Scanner;

public class Guess {

    final int genNumber = (int) (Math.random() * 99) + 1;
    private int userNumber;
    private int tryes = 5;
    private static int money = 20;
    boolean exit = false;

    //Getters
    public int getGenNumber(){
        return this.genNumber;
    }
    public int getTryes(){
        return this.tryes;
    }
    public int getMoney(){
        return money;
    }
    public int getUserNumber(){
        return Integer.parseInt(String.valueOf(this.userNumber));
    }

    //Setters
    public void setuserNumber() {
        System.out.print("Introduzca un numero: ");
        Scanner user = new Scanner(System.in);
        this.userNumber = user.nextInt();
    }

    public void sumMoney(int num){
        money += num;
    }


    //Methods

    //Este metodo comprueba si el numero que ha introducido el usuario es el mismo que el que ha generado el programa aleatoriamente
    public boolean guess(){
        return this.userNumber == this.genNumber;
    }

    //Este metodo es el que controla el funcionamiento del juego
    public boolean check(){
        //Si la maquina tiene dinero suficiente para pagar en caso de que se hacierte el numero seguira adelante con el juego
        if (money > 5) {
            //Creamos un ArrayList en la que se almacenaran los numeros introducidos por el usuario
            ArrayList<Integer> introducednumbers = new ArrayList<>();
            //Sumamos el dinero que paga el usuario por jugar
            sumMoney(1);
                do {
                        //Pedimos al usuario que introduzca un numero
                        this.setuserNumber();
                        this.tryes --;
                        //Añadimos el numero que ha introducido el usuario al array
                        introducednumbers.add(userNumber);
                        //Comprovamos que el usuario haya acertado el numero
                        if (this.guess()) {
                            System.out.println("Numero acertado");
                            System.out.println("Numero a acertar " + this.getGenNumber());
                            System.out.println("Numero a introducido " + this.getUserNumber());
                            this.sumMoney(-5);
                            System.out.println(this.getMoney());
                            exit = true;
                            return true;
                        //Si no lo ha acertado le decimos si el numero es mas alto o mas bajo al que ha introducido el usuario
                        } else {
                            if (this.getGenNumber() < this.getUserNumber()) {
                                System.out.println("El numero a acertar es menor a " + this.getUserNumber() + " intentelo de nuevo");
                            } else
                                System.out.println("El numero a acertar es mayor a " + this.getUserNumber() + " intentelo de nuevo");
                        }
                        //Imprimimos por pantalla los numeros que ha introducido el usuario
                        System.out.print("Numeros introducidos: ");
                         for (int introducednumber : introducednumbers) {
                            System.out.print(introducednumber + ", ");
                         }
                }while ((!this.guess()) && (this.getTryes() > 0));
        }else{
            System.out.println("Maquina sin dinero");
            exit = true;
        }
        return false;
    }

    //Este metodo hara de menu principal del programa
    public void slot() {
        while (!exit){
            //Comprobamos si se acierta el numero y generamos un menu
            if(!this.check()){
                System.out.println("Quiere 1 intento mas?");
                System.out.println("1 --> SI");
                System.out.println("Otro numero --> NO");
                Scanner again = new Scanner(System.in);
                int repeat = again.nextInt();
                if (repeat == 1){
                    this.sumMoney(1);
                    System.out.println("tiene un intento mas");
                }else  {
                    System.out.println("Hasta la proxima");
                    System.out.println(this.getMoney());
                    exit = true;
                }
            }
        }
    }
}
