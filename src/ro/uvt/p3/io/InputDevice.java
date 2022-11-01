package ro.uvt.p3.io;

import ro.uvt.p3.Apple;
import ro.uvt.p3.Banana;
import ro.uvt.p3.Color;
import ro.uvt.p3.Fruit;

public class InputDevice {

    public String nextLine(){

        return "The quick brown fox jumps over the lazy dog.";
    }

    public Fruit[] readFruit()
    {
        Fruit[]fruits = new Fruit[4];
        fruits[0] = new Apple(Color.RED, 150, 40, 70);
        fruits[1] = new Apple(Color.GREEN, 110, 20, 80);
        fruits[2] = new Apple(Color.YELLOW, 90, 20, 90);
        fruits[3] = new Banana(190, 100, 75);
        return fruits;
    }

}
