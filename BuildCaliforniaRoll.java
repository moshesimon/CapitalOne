class BuildCaliforniaRoll implements BuildSushi{

    private Sushi sushi;

    public void createNewSushi(){
        sushi = new Sushi();
    }

    public Sushi getSushi(){
        return sushi;
    }

    public void buildName(){
        sushi.setName("Californian Roll");
    }

    public void buildFish(){
        sushi.setFish("Crab");
    }

    public void buildVeg(){
        sushi.setVeg("Cucumber + Avacado");
    }

    public void buildSauce(){
        sushi.setSauce("Mild Chili + Soy");
    }
}
