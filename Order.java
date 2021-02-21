public class Order {
    buildSushi buildsushi;
    
    public void setSushiBuilder(buildSushi bs){
        buildsushi = bs;
    }

    public Sushi getSushi(){
        return buildsushi.getSushi();
    }

    public void constructSushi(){
        buildsushi.createNewSushi();
        buildsushi.buildName();
        buildsushi.buildFish();
        buildsushi.buildVeg();
        buildsushi.buildSauce();
    }

}
