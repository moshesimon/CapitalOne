class BuildPhiladelphiaRoll extends BuildSushiImplementation{

    @Override
    public void buildName(){
        sushi.setName("Philadelphia Roll");
    }
    
    @Override
    public void buildFish(){
        sushi.setFish("Smoked Salmon");
    }

    @Override
    public void buildVeg(){
        sushi.setVeg("Cucumber");
    }

    @Override
    public void buildSauce(){
        sushi.setSauce("Cream Cheese");
    }
}
