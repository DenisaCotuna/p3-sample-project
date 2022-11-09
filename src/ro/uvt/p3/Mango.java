package ro.uvt.p3;

public class Mango extends Fruit implements Peelable,SeedRemovable {
    boolean peel =  true, seed = true;

    public boolean hasPeel()
    {
        return peel;
    }
    public void  peelOff()
    {
        peel = false;
    }

    public boolean hasSeeds()
    {
        return seed;
    }
    public void removeSeeds()
    {
        seed = false;
    }
    public Mango(Color c, int w, int s, int h2o)
    {
        super(c, w, s, h2o);
    }
}
