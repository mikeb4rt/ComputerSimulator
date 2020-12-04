import Clazzes.*;
public class Main {
    public static void main(String[] args) {
        Computer c1 = new Computer("ElPepe", 16, 5);
        OperatingSystem op1 = new OperatingSystem("UwUbuntu", "1.0", "nuevas", false, 35, 2);
        Software s1 = new Software("Sugar Daddy", "2.9", 22, 4);

        c1.installOS(op1);

        if (op1.installSoft(s1)){
            System.out.println("Software añadido");
        }else System.out.println("Software lleno");
    }
}
