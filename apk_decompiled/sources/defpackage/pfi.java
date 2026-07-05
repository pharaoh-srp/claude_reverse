package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public abstract class pfi {
    public static final Unsafe UNSAFE = getUnsafe();
    public static final boolean SUPPORTS_GET_AND_SET_REF = hasGetAndSetSupport();
    public static final boolean SUPPORTS_GET_AND_ADD_LONG = hasGetAndAddLongSupport();

    public static long fieldOffset(Class cls, String str) {
        try {
            return UNSAFE.objectFieldOffset(cls.getDeclaredField(str));
        } catch (NoSuchFieldException e) {
            xh6.h(e);
            return 0L;
        }
    }

    private static Unsafe getUnsafe() {
        try {
            try {
                Field declaredField = Unsafe.class.getDeclaredField("theUnsafe");
                declaredField.setAccessible(true);
                return (Unsafe) declaredField.get(null);
            } catch (Exception e) {
                xh6.h(e);
                return null;
            }
        } catch (Exception unused) {
            Constructor declaredConstructor = Unsafe.class.getDeclaredConstructor(null);
            declaredConstructor.setAccessible(true);
            return (Unsafe) declaredConstructor.newInstance(null);
        }
    }

    private static boolean hasGetAndAddLongSupport() {
        try {
            Class cls = Long.TYPE;
            Unsafe.class.getMethod("getAndAddLong", Object.class, cls, cls);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    private static boolean hasGetAndSetSupport() {
        try {
            Unsafe.class.getMethod("getAndSetObject", Object.class, Long.TYPE, Object.class);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
