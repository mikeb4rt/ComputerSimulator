package Cine;

public class Person {
    private int age;
    private int money;

    public Person(){
        this.age = (int) (Math.random() * 99) +1;
        this.money = (int) (Math.random() * 100);
    }

    //Getters
    public int getAge(){
        return this.age;
    }
    public int getMoney(){
        return this.money;
    }

}
