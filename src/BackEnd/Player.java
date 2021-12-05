package BackEnd;

public class Player {
    private String name;
    private String easyLevel;
    private String mediumLevel;
    private String hardLevel;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getEasyLevel(){
        return easyLevel;
    }

    public void setEasyLevel(String level){
        easyLevel = level;
    }

    public String getMediumLevel(){
        return mediumLevel;
    }

    public void setMediumLevel(String level){
        mediumLevel = level;
    }

    public String getHardLevel(){
        return hardLevel;
    }

    public void setHardLevel(String level){
        hardLevel = level;
    }
}
