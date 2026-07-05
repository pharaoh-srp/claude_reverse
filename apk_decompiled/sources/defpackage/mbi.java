package defpackage;

import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public final class mbi extends lbi {
    @Override // defpackage.lbi
    public final Typeface p(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.j, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.p.invoke(null, objNewInstance, "sans-serif", -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e) {
            xh6.h(e);
            return null;
        }
    }

    @Override // defpackage.lbi
    public final Method t(Class cls) throws NoSuchMethodException {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, String.class, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
