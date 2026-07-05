package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public abstract class pti {
    public final bp0 a;
    public final bp0 b;
    public final bp0 c;

    public pti(bp0 bp0Var, bp0 bp0Var2, bp0 bp0Var3) {
        this.a = bp0Var;
        this.b = bp0Var2;
        this.c = bp0Var3;
    }

    public abstract qti a();

    public final Class b(Class cls) throws ClassNotFoundException {
        String name = cls.getName();
        bp0 bp0Var = this.c;
        Class cls2 = (Class) bp0Var.get(name);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(kgh.p(cls.getPackage().getName(), ".", cls.getSimpleName(), "Parcelizer"), false, cls.getClassLoader());
        bp0Var.put(cls.getName(), cls3);
        return cls3;
    }

    public final Method c(String str) throws NoSuchMethodException {
        bp0 bp0Var = this.a;
        Method method = (Method) bp0Var.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, pti.class.getClassLoader()).getDeclaredMethod("read", pti.class);
        bp0Var.put(str, declaredMethod);
        return declaredMethod;
    }

    public final Method d(Class cls) throws NoSuchMethodException, ClassNotFoundException {
        String name = cls.getName();
        bp0 bp0Var = this.b;
        Method method = (Method) bp0Var.get(name);
        if (method != null) {
            return method;
        }
        Class clsB = b(cls);
        System.currentTimeMillis();
        Method declaredMethod = clsB.getDeclaredMethod("write", cls, pti.class);
        bp0Var.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public abstract boolean e(int i);

    public final Parcelable f(Parcelable parcelable, int i) {
        if (!e(i)) {
            return parcelable;
        }
        return ((qti) this).e.readParcelable(qti.class.getClassLoader());
    }

    public final rti g() {
        String string = ((qti) this).e.readString();
        if (string == null) {
            return null;
        }
        try {
            return (rti) c(string).invoke(null, a());
        } catch (ClassNotFoundException e) {
            xh6.f("VersionedParcel encountered ClassNotFoundException", e);
            return null;
        } catch (IllegalAccessException e2) {
            xh6.f("VersionedParcel encountered IllegalAccessException", e2);
            return null;
        } catch (NoSuchMethodException e3) {
            xh6.f("VersionedParcel encountered NoSuchMethodException", e3);
            return null;
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            xh6.f("VersionedParcel encountered InvocationTargetException", e4);
            return null;
        }
    }

    public abstract void h(int i);

    public final void i(rti rtiVar) {
        if (rtiVar == null) {
            ((qti) this).e.writeString(null);
            return;
        }
        try {
            ((qti) this).e.writeString(b(rtiVar.getClass()).getName());
            qti qtiVarA = a();
            try {
                d(rtiVar.getClass()).invoke(null, rtiVar, qtiVarA);
                Parcel parcel = qtiVarA.e;
                int i = qtiVarA.i;
                if (i >= 0) {
                    int i2 = qtiVarA.d.get(i);
                    int iDataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i2);
                    parcel.writeInt(iDataPosition - i2);
                    parcel.setDataPosition(iDataPosition);
                }
            } catch (ClassNotFoundException e) {
                xh6.f("VersionedParcel encountered ClassNotFoundException", e);
            } catch (IllegalAccessException e2) {
                xh6.f("VersionedParcel encountered IllegalAccessException", e2);
            } catch (NoSuchMethodException e3) {
                xh6.f("VersionedParcel encountered NoSuchMethodException", e3);
            } catch (InvocationTargetException e4) {
                if (e4.getCause() instanceof RuntimeException) {
                    throw ((RuntimeException) e4.getCause());
                }
                xh6.f("VersionedParcel encountered InvocationTargetException", e4);
            }
        } catch (ClassNotFoundException e5) {
            xh6.f(rtiVar.getClass().getSimpleName().concat(" does not have a Parcelizer"), e5);
        }
    }
}
