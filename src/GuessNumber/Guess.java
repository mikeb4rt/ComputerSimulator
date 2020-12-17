package GuessNumber;

import java.util.Arrays;
import java.util.Scanner;

public class Guess {

    final int genNumber = (int) (Math.random() * 99) + 1;
    private int userNumber;
    private int tryes = 5;
    private static int money = 20;
    boolean salir = false;

    //Setters
    public void setuserNumber() {
        System.out.print("Introduzca un numero: ");
        Scanner user = new Scanner(System.in);
        this.userNumber = user.nextInt();
    }

    public void PagaTryes(){
        this.tryes +=1;
    }

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

    //Methods
    public void reduceTryes(){
        this.tryes -= 1;
    }

    public void sumMoney(int num){
        money += num;
    }

    public boolean check(){
        if (money > 0) {
        int[] introducednumbers = new int [5];
        int i = 0;
        sumMoney(1);
            do {
                    this.setuserNumber();
                    this.reduceTryes();
                    introducednumbers[i] = userNumber;
                    System.out.println(this.getGenNumber());
                    if (this.guess()) {
                        System.out.println("Numero acertado");
                        System.out.println("Numero a acertar " + this.getGenNumber());
                        System.out.println("Numero a introducido " + this.getUserNumber());
                        this.sumMoney(-5);
                        System.out.println(this.getMoney());
                        salir = true;
                        for (int introducednumber : introducednumbers) {
                            System.out.print(introducednumber + ", ");
                        }
                        return true;
                    } else {
                        if (this.getGenNumber() < this.getUserNumber()) {
                            System.out.println("El numero a acertar es menor a " + this.getUserNumber() + " intentelo de nuevo");
                        } else
                            System.out.println("El numero a acertar es mayor a " + this.getUserNumber() + " intentelo de nuevo");
                    }
                    i++;
            }while ((!this.guess()) && (this.getTryes() > 0)) ;
                System.out.print("Numeros introducidos: ");
                for (int introducednumber : introducednumbers) {
                    System.out.print(introducednumber + ", ");
                }
        }else System.out.println("Maquina sin dinero");
            return false;
    }

    public boolean guess(){
        return this.userNumber == this.genNumber;
    }

    public void tragaperras() {
        while (!salir){
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
                    salir = true;
                }
            }
        }
    }
}
