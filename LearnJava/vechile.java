public class vechile {
    private String name = "vechile";
    public String startengine(){
        return "Engine is starting";
    }
    public String stopengine(){
        return "Engine is stopping";
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}