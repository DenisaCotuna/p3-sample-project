package ro.uvt.p3;

import ro.uvt.p3.io.InputDevice;
import ro.uvt.p3.io.OutputDevice;

public class Application {
    private InputDevice id;
    private OutputDevice od;

    public Application(InputDevice id, OutputDevice od) {
        this.id = id;
        this.od = od;
    }

    public int computeWeight(Fruit[] fruits)
    {
        int sum = 0;
        for(Fruit f:fruits)
            sum += f.getWeight();
        return sum;
    }

    public int computeSugarContent(Fruit[] fruits)
    {
        int sum = 0;
        for(Fruit f:fruits)
            sum += f.getSugar();
        return sum;
    }

    public void run(){

    }
}
