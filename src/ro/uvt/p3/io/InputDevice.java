package ro.uvt.p3.io;

import ro.uvt.p3.*;

public class InputDevice {

    public String nextLine(){

        return "The quick brown fox jumps over the lazy dog.";
    }

    public Fruit[] readFruit()
    {
        Fruit[]fruits = new Fruit[5];
        fruits[0] = new Apple(Color.RED, 150, 40, 70);
        fruits[1] = new Apple(Color.GREEN, 110, 20, 80);
        fruits[2] = new Apple(Color.YELLOW, 190, 20, 90);
        fruits[3] = new Banana(190, 100, 75);
        fruits[4] = new Mango(Color.ORANGE, 220, 50, 100);
        return fruits;
    }

}
