package Clazzes;

public class Software {

    final private String sName;
    private String sVersion;
    private int sSpaceRequirements;
    private int sRamRequirements;

    //Constructor
    public Software(String name, String version, int space, int RAM){
        this.sName = name;
        this.setVersion(version);
        this.setSpace(space);
        this.setRAM(RAM);
    }

    //Getters

    public String getsName(){
        return this.sName;
    }

    public String getsVersion(){
        return this.sVersion;
    }

    public int getsSpaceRequirements(){
        return this.sSpaceRequirements;
    }

    public int getsRamRequirements(){
        return this.sRamRequirements;
    }

    //Setters

    public void setVersion(String version){
        this.sVersion = version;
    }

    public void setSpace(int space){
        this.sSpaceRequirements = space;
    }

    public void setRAM(int RAM){
        this.sRamRequirements = RAM;
    }
}
