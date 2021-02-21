public class BuildSushiImplementation implements BuildSushi{
    protected Sushi sushi;
    
    public void createNewSushi(){
        sushi = new Sushi();
    }

    public Sushi getSushi(){
        return sushi;
    } 

    public void buildName(){}
    public void buildFish(){}
    public void buildVeg(){}
    public void buildSauce(){}
    
}
