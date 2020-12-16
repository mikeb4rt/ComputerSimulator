package ComputerSimulator;



public class OperatingSystem {

    private String osName;
    private String osVersion;
    private String osArch;
    final private boolean OC;
    final private int SpaceRequirements;
    final private int RamRequirement;
    private Software[] osSoftware = new Software[3];

    //Constructor
    public OperatingSystem(String name, String version, String arch, boolean OC, int SpaceRequirements, int RamRequiremnet){
        this.setOsName(name);
        this.setOsVersion(version);
        this.setOsArch(arch);
        this.OC = OC;
        this.SpaceRequirements = SpaceRequirements;
        this.RamRequirement = RamRequiremnet;
    }

    //Getters
    public String getOsName(){
        return this.osName;
    }

    public String getOsVersion(){
        return this.osVersion;
    }

    public String getOsArch(){
        return this.osArch;
    }

    public int getSpaceRequirements(){
        return this.SpaceRequirements;
    }

    public int getRamRequirement(){
        return this.RamRequirement;
    }

    public void getSoftware(){
        for (Software software : osSoftware) {
            if (software != null)
                System.out.println(software.getsName());
        }
    }

    //Setters
    public void setOsName(String name){
        this.osName = name;
    }

    public void setOsVersion(String version){
        this.osVersion = version;
    }

    public void setOsArch(String arch){
        this.osArch = arch;
    }

    //Methods

    public boolean installSoft(Software soft, Computer pc){
        if ((pc.getAvaliblespace() >= soft.getsSpaceRequirements()) && (pc.getRamMemory() > soft.getsRamRequirements() + soft.getsRamRequirements())) {
            for (int i = 0; i < osSoftware.length; i++) {
                if (osSoftware[i]==null){
                    osSoftware[i]=soft;
                    pc.setAvaliblespace(pc.getAvaliblespace()-1);
                    return true;
                }
            }
        }
        return false;
    }

    public void uninstallSoft(Software s, Computer pc){
        for (int i = 0; i < osSoftware.length; i++) {
            if (s == osSoftware[i]){
                osSoftware[i] = null;
                pc.setAvaliblespace(pc.getAvaliblespace() + s.getsSpaceRequirements()  );
            }
        }
    }
}
