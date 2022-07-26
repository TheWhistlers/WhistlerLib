package com.whistler.whistlerlib;

import com.whistler.whistlerlib.serialization.WamlDeserializer;
import com.whistler.whistlerlib.serialization.WamlSerializer;
import com.whistler.whistlerlib.util.WamlObject;

public class Main {
    public static void main(String[] args)  {
        Tester a = new Tester();
        WamlObject object = WamlSerializer.serializeFromInstance(a);
        object.print();
        a = WamlDeserializer.deserializeFromInstance(object);
    }
}
class Tester{
    private String name = "Maven";
    private int age = 12;
    private float Height = 121.3f;
}
