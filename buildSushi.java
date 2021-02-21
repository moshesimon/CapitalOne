abstract class buildSushi {
    protected Sushi sushi;

    public void createNewSushi(){
        sushi = new Sushi();
    }

    public Sushi getSushi(){
        return sushi;
    } 

    public abstract void buildName();
    public abstract void buildFish();
    public abstract void buildVeg();
    public abstract void buildSauce();
}
