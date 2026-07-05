package defpackage;

import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes3.dex */
public final class u1 extends ijk {
    public static final Unsafe e;
    public static final long f;
    public static final long g;
    public static final long h;
    public static final long i;
    public static final long j;

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged(new t1());
            }
            try {
                g = unsafe.objectFieldOffset(w1.class.getDeclaredField("G"));
                f = unsafe.objectFieldOffset(w1.class.getDeclaredField("F"));
                h = unsafe.objectFieldOffset(w1.class.getDeclaredField("E"));
                i = unsafe.objectFieldOffset(v1.class.getDeclaredField("a"));
                j = unsafe.objectFieldOffset(v1.class.getDeclaredField("b"));
                e = unsafe;
            } catch (NoSuchFieldException e2) {
                xh6.h(e2);
            }
        } catch (PrivilegedActionException e3) {
            xh6.f("Could not initialize intrinsics", e3.getCause());
        }
    }

    @Override // defpackage.ijk
    public final boolean b(w1 w1Var, k1 k1Var, k1 k1Var2) {
        return r1.a(e, w1Var, f, k1Var, k1Var2);
    }

    @Override // defpackage.ijk
    public final boolean c(w1 w1Var, Object obj, Object obj2) {
        return s1.a(e, w1Var, h, obj, obj2);
    }

    @Override // defpackage.ijk
    public final boolean d(w1 w1Var, v1 v1Var, v1 v1Var2) {
        return q1.a(e, w1Var, g, v1Var, v1Var2);
    }

    @Override // defpackage.ijk
    public final k1 g(w1 w1Var) {
        k1 k1Var;
        k1 k1Var2 = k1.d;
        do {
            k1Var = w1Var.F;
            if (k1Var2 == k1Var) {
                break;
            }
        } while (!b(w1Var, k1Var, k1Var2));
        return k1Var;
    }

    @Override // defpackage.ijk
    public final v1 h(w1 w1Var) {
        v1 v1Var;
        v1 v1Var2 = v1.c;
        do {
            v1Var = w1Var.G;
            if (v1Var2 == v1Var) {
                break;
            }
        } while (!d(w1Var, v1Var, v1Var2));
        return v1Var;
    }

    @Override // defpackage.ijk
    public final void i(v1 v1Var, v1 v1Var2) {
        e.putObject(v1Var, j, v1Var2);
    }

    @Override // defpackage.ijk
    public final void j(v1 v1Var, Thread thread) {
        e.putObject(v1Var, i, thread);
    }
}
