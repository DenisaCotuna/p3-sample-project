package ro.uvt.p3;

public abstract class Fruit {
    private int weight;
    private int sugar;
    private int water;
    private Color color;

    public Fruit(Color c, int w, int s, int h2o)
    {
        this.color = c;
        this.weight = w;
        this.sugar = s;
        this.water = h2o;
    }
}
