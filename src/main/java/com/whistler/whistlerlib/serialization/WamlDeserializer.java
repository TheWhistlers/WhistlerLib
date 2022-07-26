package com.whistler.whistlerlib.serialization;

import com.whistler.whistlerlib.util.WamlObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class WamlDeserializer {
    @Nullable
    public static <@Nullable T> T deserializeFromInstance(WamlObject instance) {
        @Nullable T result = (T) new Object();
        Class clazz = result.getClass();
        ArrayList<String> statements = instance.getStoredStatements();
        Field[] fields = clazz.getDeclaredFields();
        for (String statement : statements) {
            String[] splited = statement.split("=");
            for (Field field : fields) {
                field.setAccessible(true);
                String value = splited[1];
                System.out.println(field.getName());
            }

        }
        return null;
    }
}
