public class BuildSpicyTuna extends BuildSushiImplementation{

    @Override
    public void buildName(){
        sushi.setName("Spicy Tuna");
    }

    @Override
    public void buildFish(){
        sushi.setFish("Tuna");
    }

    @Override
    public void buildVeg(){
        sushi.setVeg("Cucumber");
    }

    @Override
    public void buildSauce(){
        sushi.setSauce("Spicy + Soy");
    }
}
