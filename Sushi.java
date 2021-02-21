public class Sushi {

    private String Name = new String();
    private String Fish = new String();
    private String Veg = new String();
    private String Source = new String();

    public void setName(String Name){
        this.Name = Name;
    }

    public void setFish(String Fish){
        this.Fish = Fish;
    }

    public void setVeg(String Veg){
        this.Veg = Veg;
    }

    public void setSource(String Source){
        this.Source = Source;
    }

    public String getName(){
        return Name;
    }

    public String getFishString(){
        return Fish;
    }

    public String getVegString(){
        return Veg;
    }

    public String getSourceString(){
        return Source;
    }
}
