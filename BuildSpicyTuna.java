public class BuildSpicyTuna implements BuildSushi{// Inheritance (is-a)
    
    private Sushi sushi;// Data Encapsulation

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
