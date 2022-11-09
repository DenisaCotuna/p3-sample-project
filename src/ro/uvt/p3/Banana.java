package ro.uvt.p3;

public class Banana extends Fruit implements Peelable{
    boolean peel = true;
    public boolean hasPeel()
    {
        return peel;
    }
    public void  peelOff()
    {
        peel = false;
    }
    public Banana (int w, int s, int h2o)
    {
        super(Color.YELLOW, w, s, h2o);
    }
}
