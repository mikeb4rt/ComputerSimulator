package Clazzes;

public class Computer {

    private String name;
    final private int ramMemory;
    final private int hardDisk;
    private int avaliblespace;
    private OperatingSystem operatingsystem;

    //Constructor
    public Computer(String name, int RAM, int disk){
        this.setName(name);
        this.ramMemory = RAM;
        this.hardDisk = disk;
        this.avaliblespace = disk;
    }

    //Getters
    public String getName(){
        return this.name;
    }

    public int getRamMemory(){
        return this.ramMemory;
    }

    public int getHardDisk(){
        return this.hardDisk;
    }

    public int getAvaliblespace(){
        return this.avaliblespace;
    }

    public String getOperatingsystem(){
        return operatingsystem.getOsName();
    }

    //Setters
    public void setName(String name){
        this.name = name;
    }

    //Methods

    public void installOS(OperatingSystem op){
        if ((op.getSpaceRequirements() < this.avaliblespace) && op.getRamRequirement() < this.ramMemory){
            this.operatingsystem = op;
            this.avaliblespace -= op.getSpaceRequirements();
        }else{
            System.out.println("Espacio insuficiente");
        }
    }
}
