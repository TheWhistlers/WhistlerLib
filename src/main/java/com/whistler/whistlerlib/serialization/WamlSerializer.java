package com.whistler.whistlerlib.serialization;

import com.whistler.whistlerlib.util.WamlObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.lang.reflect.Field;

public class WamlSerializer{
    @Nullable
    public static <T> WamlObject serializeFromInstance(@NotNull T instance) {
        Class clazz = instance.getClass();
        WamlObject result = WamlObject.NULL;
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            Object value;
            try {
                value = field.get(instance);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
            result.addStatement(field.getName() + "=" + value.toString());
        }
        return result;
    }
}
