package defpackage;

import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes3.dex */
public final class f1k extends ppk {
    public static final Unsafe b;
    public static final long c;
    public static final long d;
    public static final long e;
    public static final long f;
    public static final long g;

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged(new u1k());
            }
            try {
                d = unsafe.objectFieldOffset(j1k.class.getDeclaredField("G"));
                c = unsafe.objectFieldOffset(j1k.class.getDeclaredField("F"));
                e = unsafe.objectFieldOffset(j1k.class.getDeclaredField("E"));
                f = unsafe.objectFieldOffset(g1k.class.getDeclaredField("a"));
                g = unsafe.objectFieldOffset(g1k.class.getDeclaredField("b"));
                b = unsafe;
            } catch (NoSuchFieldException e2) {
                xh6.h(e2);
            }
        } catch (PrivilegedActionException e3) {
            xh6.f("Could not initialize intrinsics", e3.getCause());
        }
    }

    @Override // defpackage.ppk
    public final z0k g(l4k l4kVar) {
        z0k z0kVar;
        z0k z0kVar2 = z0k.d;
        do {
            z0kVar = l4kVar.F;
            if (z0kVar2 == z0kVar) {
                break;
            }
        } while (!k(l4kVar, z0kVar, z0kVar2));
        return z0kVar;
    }

    @Override // defpackage.ppk
    public final g1k h(l4k l4kVar) {
        g1k g1kVar;
        g1k g1kVar2 = g1k.c;
        do {
            g1kVar = l4kVar.G;
            if (g1kVar2 == g1kVar) {
                break;
            }
        } while (!m(l4kVar, g1kVar, g1kVar2));
        return g1kVar;
    }

    @Override // defpackage.ppk
    public final void i(g1k g1kVar, g1k g1kVar2) {
        b.putObject(g1kVar, g, g1kVar2);
    }

    @Override // defpackage.ppk
    public final void j(g1k g1kVar, Thread thread) {
        b.putObject(g1kVar, f, thread);
    }

    @Override // defpackage.ppk
    public final boolean k(l4k l4kVar, z0k z0kVar, z0k z0kVar2) {
        return q1k.a(b, l4kVar, c, z0kVar, z0kVar2);
    }

    @Override // defpackage.ppk
    public final boolean l(j1k j1kVar, Object obj, Object obj2) {
        return q1k.a(b, j1kVar, e, obj, obj2);
    }

    @Override // defpackage.ppk
    public final boolean m(j1k j1kVar, g1k g1kVar, g1k g1kVar2) {
        return q1k.a(b, j1kVar, d, g1kVar, g1kVar2);
    }
}
