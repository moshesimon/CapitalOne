class BuildCaliforniaRoll extends BuildSushiImplementation{

    @Override
    public void buildName(){
        sushi.setName("Californian Roll");
    }

    @Override
    public void buildFish(){
        sushi.setFish("Crab");
    }

    @Override
    public void buildVeg(){
        sushi.setVeg("Cucumber + Avacado");
    }

    @Override
    public void buildSauce(){
        sushi.setSauce("Mild Chili + Soy");
    }
}
