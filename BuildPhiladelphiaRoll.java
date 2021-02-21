class BuildPhiladelphiaRoll implements BuildSushi{

    protected Sushi sushi;

    public void createNewSushi(){
        sushi = new Sushi();
    }

    public Sushi getSushi(){
        return sushi;
    }

    public void buildName(){
        sushi.setName("Philadelphia Roll");
    }
 
    public void buildFish(){
        sushi.setFish("Smoked Salmon");
    }

    public void buildVeg(){
        sushi.setVeg("Cucumber");
    }

    public void buildSauce(){
        sushi.setSauce("Cream Cheese");
    }
}
