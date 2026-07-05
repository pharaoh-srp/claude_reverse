package defpackage;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class w5f {
    public static final List a = x44.X(Application.class, k5f.class);
    public static final List b = x44.W(k5f.class);

    public static final Constructor a(Class cls, List list) {
        list.getClass();
        Constructor<?>[] constructors = cls.getConstructors();
        constructors.getClass();
        for (Constructor<?> constructor : constructors) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            parameterTypes.getClass();
            List listY0 = mp0.Y0(parameterTypes);
            if (list.equals(listY0)) {
                return constructor;
            }
            if (list.size() == listY0.size() && listY0.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    public static final vxi b(Class cls, Constructor constructor, Object... objArr) {
        try {
            return (vxi) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e) {
            xh6.f(grc.s(cls, "Failed to access "), e);
            return null;
        } catch (InstantiationException e2) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e2);
        } catch (InvocationTargetException e3) {
            xh6.f(grc.s(cls, "An exception happened in constructor of "), e3.getCause());
            return null;
        }
    }
}
