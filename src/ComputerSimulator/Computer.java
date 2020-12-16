package ComputerSimulator;

public class Computer {

    private String name;
    final private int ramMemory;
    private int avalibleramMemory;
    final private int hardDisk;
    private int avaliblespace;
    private OperatingSystem operatingsystem;

    //Constructor
    public Computer(String name, int RAM, int disk){
        this.setName(name);
        this.ramMemory = RAM;
        this.avalibleramMemory = RAM;
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

    public int getAvaliblRAMespace(){
        return this.avalibleramMemory;
    }

    public OperatingSystem getOperatingsystem(){
        return this.operatingsystem;
    }

    //Setters
    public void setName(String name){
        this.name = name;
    }
    public void setAvaliblespace(int avaliblespace){this.avaliblespace = avaliblespace;}

    //Methods

    public void installOS(OperatingSystem op){
        if ((op.getSpaceRequirements() <= this.avaliblespace) && op.getRamRequirement() < this.ramMemory){
            this.operatingsystem = op;
            this.avaliblespace -= op.getSpaceRequirements();
            this.avalibleramMemory -= op.getRamRequirement();
            System.out.println("OP instalado");
        }else{
            System.out.println("Espacio insuficiente");
        }
    }

    public void uninstallOP(){
        this.operatingsystem = null;
        this.avaliblespace=this.getHardDisk();
        this.avalibleramMemory=this.getRamMemory();
    }
}
