package ro.uvt.p3.io;

import ro.uvt.p3.Fruit;

public class OutputDevice {
    public void writeMessage(Object msg)
    {
        System.out.println(msg);
    }
    public static void printFruits(Fruit[] fruits)
    {
        for(Fruit f:fruits)
            System.out.println(f);
    }

}
