class BuildCaliforniaRoll implements BuildSushi{// Inheritance (is-a)

    private Sushi sushi;// Data Encapsulation

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
