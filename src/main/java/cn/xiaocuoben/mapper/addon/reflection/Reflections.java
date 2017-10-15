package cn.xiaocuoben.mapper.addon.reflection;

import cn.xiaocuoben.mapper.addon.Fn;

import java.beans.Introspector;
import java.lang.invoke.SerializedLambda;
import java.lang.reflect.Method;

/**
 * @author Frank
 */
public class Reflections {
    private Reflections() {
    }

    public static String fnToFieldName(Fn fn) {
        try {
            Method method = fn.getClass().getDeclaredMethod("writeReplace");
            method.setAccessible(Boolean.TRUE);
            SerializedLambda serializedLambda = (SerializedLambda) method.invoke(fn);
            String getter = serializedLambda.getImplMethodName();
            String fieldName = Introspector.decapitalize(getter.replace("get", ""));
            return fieldName;
        } catch (ReflectiveOperationException e) {
            throw new ReflectionOperationException(e);
        }
    }
}
