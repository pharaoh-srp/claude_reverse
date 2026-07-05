package defpackage;

import androidx.fragment.app.Fragment$InstantiationException;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public final class lx7 {
    public static final w6g b = new w6g(0);
    public final /* synthetic */ rx7 a;

    public lx7(rx7 rx7Var) {
        this.a = rx7Var;
    }

    public static Class b(String str, ClassLoader classLoader) throws ClassNotFoundException {
        w6g w6gVar = b;
        w6g w6gVar2 = (w6g) w6gVar.get(classLoader);
        if (w6gVar2 == null) {
            w6gVar2 = new w6g(0);
            w6gVar.put(classLoader, w6gVar2);
        }
        Class cls = (Class) w6gVar2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        w6gVar2.put(str, cls2);
        return cls2;
    }

    public static Class c(String str, ClassLoader classLoader) {
        try {
            return b(str, classLoader);
        } catch (ClassCastException e) {
            throw new Fragment$InstantiationException(ij0.j("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e);
        } catch (ClassNotFoundException e2) {
            throw new Fragment$InstantiationException(ij0.j("Unable to instantiate fragment ", str, ": make sure class name exists"), e2);
        }
    }

    public final cx7 a(String str) {
        try {
            return (cx7) c(str, this.a.w.N.getClassLoader()).getConstructor(null).newInstance(null);
        } catch (IllegalAccessException e) {
            throw new Fragment$InstantiationException(ij0.j("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e);
        } catch (InstantiationException e2) {
            throw new Fragment$InstantiationException(ij0.j("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
        } catch (NoSuchMethodException e3) {
            throw new Fragment$InstantiationException(ij0.j("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e3);
        } catch (InvocationTargetException e4) {
            throw new Fragment$InstantiationException(ij0.j("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e4);
        }
    }
}
