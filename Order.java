public class Order {
    BuildSushi buildSushi;
    
    public void setSushiBuilder(BuildSushi typeOfSush){
        buildSushi = typeOfSush;
    }

    public void constructSushi(){
        buildSushi.createNewSushi();
        buildSushi.buildName();
        buildSushi.buildFish();
        buildSushi.buildVeg();
        buildSushi.buildSauce();
    }
    
    public Sushi getSushi(){
        return buildSushi.getSushi();
    }
}
