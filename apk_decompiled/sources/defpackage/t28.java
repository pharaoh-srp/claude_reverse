package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class t28 {
    public final b3 a;
    public final Object b;
    public final b3 c;
    public final s28 d;
    public final Method e;

    public t28(b3 b3Var, Object obj, b3 b3Var2, s28 s28Var, Class cls) {
        if (b3Var == null) {
            sz6.p("Null containingTypeDefaultInstance");
            throw null;
        }
        if (s28Var.F == bfj.J && b3Var2 == null) {
            sz6.p("Null messageDefaultInstance");
            throw null;
        }
        this.a = b3Var;
        this.b = obj;
        this.c = b3Var2;
        this.d = s28Var;
        if (!l89.class.isAssignableFrom(cls)) {
            this.e = null;
            return;
        }
        try {
            this.e = cls.getMethod("valueOf", Integer.TYPE);
        } catch (NoSuchMethodException e) {
            String name = cls.getName();
            xh6.f(kgh.q(new StringBuilder(name.length() + 52), "Generated message class \"", name, "\" missing method \"valueOf\"."), e);
            throw null;
        }
    }

    public final Object a(Object obj) {
        if (this.d.F.E != ffj.M) {
            return obj;
        }
        try {
            return this.e.invoke(null, (Integer) obj);
        } catch (IllegalAccessException e) {
            xh6.f("Couldn't use Java reflection to implement protocol message reflection.", e);
            return null;
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            xh6.f("Unexpected exception thrown by generated accessor method.", cause);
            return null;
        }
    }

    public final Object b(Object obj) {
        return this.d.F.E == ffj.M ? Integer.valueOf(((l89) obj).a()) : obj;
    }
}
