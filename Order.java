public class Order {// Class
   
    private BuildSushi buildSushi;// Composition (has-a)
    
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
    
    public Sushi getSushi(){// Encapsulation
        return buildSushi.getSushi();
    }
}
