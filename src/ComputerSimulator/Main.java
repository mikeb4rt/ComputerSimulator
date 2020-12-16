package ComputerSimulator;

public class Main {
    public static void main(String[] args) {
        Computer c1 = new Computer("ElPepe", 16, 5);
        OperatingSystem op1 = new OperatingSystem("UwUbuntu", "1.0", "nuevas", false, 3, 2);
        Software s1 = new Software("Sugar Daddy", "2.9", 1, 4);
        Software s2 = new Software("Queen", "2.9", 1, 4);


        System.out.println(c1.getAvaliblespace());

        c1.installOS(op1);
        System.out.println(c1.getAvaliblespace());
        if (op1.installSoft(s1,c1)){
            System.out.println("Soft instalado");
        }else System.out.println("Espacio insuficiente");

        System.out.println(c1.getAvaliblespace());

        if (op1.installSoft(s2,c1)){
            System.out.println("Soft instalado");
        }else System.out.println("Espacio insuficiente");

       /* if (op1.installSoft(s1,c1)){
            System.out.println("Soft instalado");
        }else System.out.println("Espacio insuficiente");

        System.out.println(c1.getAvaliblespace());
        op1.getSoftware();


        c1.uninstallOP();
        if (c1.getOperatingsystem()!=null){
            System.out.println(c1.getOperatingsystem().getOsName());
        }else System.out.println("No hay SO instalado");


        System.out.println("Desinstalomos Sugar daddy");
        op1.uninstallSoft(s1, c1);*/

        op1.getSoftware();
    }
}
