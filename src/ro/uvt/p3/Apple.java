package ro.uvt.p3;

public class Apple extends Fruit implements SeedRemovable{
    boolean seed = true;
    public boolean hasSeeds()
    {
        return seed;
    }
    public void removeSeeds()
    {
        seed = false;
    }
    public Apple(Color c, int w, int s, int h2o)
    {
        super(c, w, s, h2o);
    }
}
