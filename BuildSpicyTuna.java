public class BuildSpicyTuna implements BuildSushi{
    protected Sushi sushi;

    public void createNewSushi(){
        sushi = new Sushi();
    }

    public Sushi getSushi(){
        return sushi;
    }

    public void buildName(){
        sushi.setName("Spicy Tuna");
    }

    public void buildFish(){
        sushi.setFish("Tuna");
    }

    public void buildVeg(){
        sushi.setVeg("Cucumber");
    }

    public void buildSauce(){
        sushi.setSauce("Spicy + Soy");
    }
}
