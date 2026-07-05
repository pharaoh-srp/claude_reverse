package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class nce extends nai {
    public final Method D = Class.class.getMethod("isRecord", null);
    public final Method E;
    public final Method F;
    public final Method G;

    public nce() throws NoSuchMethodException {
        Method method = Class.class.getMethod("getRecordComponents", null);
        this.E = method;
        Class<?> componentType = method.getReturnType().getComponentType();
        this.F = componentType.getMethod("getName", null);
        this.G = componentType.getMethod("getType", null);
    }

    @Override // defpackage.nai
    public final Method E(Class cls, Field field) {
        try {
            return cls.getMethod(field.getName(), null);
        } catch (ReflectiveOperationException e) {
            xh6.f("Unexpected ReflectiveOperationException occurred (Gson 2.10.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
            return null;
        }
    }

    @Override // defpackage.nai
    public final Constructor F(Class cls) {
        try {
            Object[] objArr = (Object[]) this.E.invoke(cls, null);
            Class<?>[] clsArr = new Class[objArr.length];
            for (int i = 0; i < objArr.length; i++) {
                clsArr[i] = (Class) this.G.invoke(objArr[i], null);
            }
            return cls.getDeclaredConstructor(clsArr);
        } catch (ReflectiveOperationException e) {
            xh6.f("Unexpected ReflectiveOperationException occurred (Gson 2.10.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
            return null;
        }
    }

    @Override // defpackage.nai
    public final String[] G(Class cls) {
        try {
            Object[] objArr = (Object[]) this.E.invoke(cls, null);
            String[] strArr = new String[objArr.length];
            for (int i = 0; i < objArr.length; i++) {
                strArr[i] = (String) this.F.invoke(objArr[i], null);
            }
            return strArr;
        } catch (ReflectiveOperationException e) {
            xh6.f("Unexpected ReflectiveOperationException occurred (Gson 2.10.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
            return null;
        }
    }

    @Override // defpackage.nai
    public final boolean O(Class cls) {
        try {
            return ((Boolean) this.D.invoke(cls, null)).booleanValue();
        } catch (ReflectiveOperationException e) {
            xh6.f("Unexpected ReflectiveOperationException occurred (Gson 2.10.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
            return false;
        }
    }
}
