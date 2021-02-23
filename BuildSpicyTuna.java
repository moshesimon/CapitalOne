public class BuildSpicyTuna extends BuildTuna {// Inheritance (is-a)

    @Override
    public void buildName(){
        getSushi().setName("Spicy Tuna");
    }

    @Override
    public void buildSauce(){
        getSushi().setSauce("Spicy + Soy");
    }
}
