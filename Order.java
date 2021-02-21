public class Order {
    BuildSushi buildSushi;
    
    public void setSushiBuilder(BuildSushi bs){
        buildSushi = bs;
    }

    public Sushi getSushi(){
        return buildSushi.getSushi();
    }

    public void constructSushi(){
        buildSushi.createNewSushi();
        buildSushi.buildName();
        buildSushi.buildFish();
        buildSushi.buildVeg();
        buildSushi.buildSauce();
    }

}
