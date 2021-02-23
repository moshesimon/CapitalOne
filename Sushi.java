public class Sushi {// Class

    // Data Encapsulation
    private String Name = new String();
    private String Fish = new String();
    private String Veg = new String();
    private String Sauce = new String();

    // Set Methods
    public void setName(String Name){
        this.Name = Name;
    }

    public void setFish(String Fish){
        this.Fish = Fish;
    }

    public void setVeg(String Veg){
        this.Veg = Veg;
    }

    public void setSauce(String Sauce){
        this.Sauce = Sauce;
    }

    // Get Methods
    public String getName(){
        return Name;
    }

    public String getFishString(){
        return Fish;
    }

    public String getVegString(){
        return Veg;
    }

    public String getSauceString(){
        return Sauce;
    }
}