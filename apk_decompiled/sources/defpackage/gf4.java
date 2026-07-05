package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public abstract class gf4 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater E = AtomicReferenceFieldUpdater.newUpdater(gf4.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater F;
    public static final /* synthetic */ long G;
    public static final /* synthetic */ long H;
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    static {
        Unsafe unsafe = yf4.a;
        G = unsafe.objectFieldOffset(gf4.class.getDeclaredField("_next$volatile"));
        F = AtomicReferenceFieldUpdater.newUpdater(gf4.class, Object.class, "_prev$volatile");
        H = unsafe.objectFieldOffset(gf4.class.getDeclaredField("_prev$volatile"));
    }

    public gf4(lff lffVar) {
        this._prev$volatile = lffVar;
    }

    public final void a() {
        F.getClass();
        yf4.a.putObjectVolatile(this, H, (Object) null);
    }

    public final gf4 c() {
        gf4 gf4VarF = f();
        while (gf4VarF != null && gf4VarF.g()) {
            F.getClass();
            gf4VarF = (gf4) yf4.a.getObjectVolatile(gf4VarF, H);
        }
        return gf4VarF;
    }

    public final gf4 d() {
        Object objE = e();
        if (objE == ff4.a) {
            return null;
        }
        return (gf4) objE;
    }

    public final Object e() {
        E.getClass();
        return yf4.a.getObjectVolatile(this, G);
    }

    public final gf4 f() {
        F.getClass();
        return (gf4) yf4.a.getObjectVolatile(this, H);
    }

    public abstract boolean g();

    public final boolean h() {
        while (true) {
            E.getClass();
            Unsafe unsafe = yf4.a;
            long j = G;
            gf4 gf4Var = this;
            if (unsafe.compareAndSwapObject(gf4Var, j, (Object) null, ff4.a)) {
                return true;
            }
            if (unsafe.getObjectVolatile(gf4Var, j) != null) {
                return false;
            }
            this = gf4Var;
        }
    }

    public final void i() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Unsafe unsafe;
        Object objectVolatile;
        gf4 gf4VarD;
        if (d() == null) {
            return;
        }
        while (true) {
            gf4 gf4VarC = c();
            gf4 gf4VarD2 = d();
            gf4VarD2.getClass();
            while (gf4VarD2.g() && (gf4VarD = gf4VarD2.d()) != null) {
                gf4VarD2 = gf4VarD;
            }
            do {
                atomicReferenceFieldUpdater = F;
                atomicReferenceFieldUpdater.getClass();
                unsafe = yf4.a;
                objectVolatile = unsafe.getObjectVolatile(gf4VarD2, H);
            } while (!qy1.x(atomicReferenceFieldUpdater, gf4VarD2, objectVolatile, ((gf4) objectVolatile) == null ? null : gf4VarC));
            if (gf4VarC != null) {
                E.getClass();
                unsafe.putObjectVolatile(gf4VarC, G, gf4VarD2);
            }
            if (!gf4VarD2.g() || gf4VarD2.d() == null) {
                if (gf4VarC == null || !gf4VarC.g()) {
                    return;
                }
            }
        }
    }

    public final boolean j(lff lffVar) {
        while (true) {
            E.getClass();
            Unsafe unsafe = yf4.a;
            long j = G;
            gf4 gf4Var = this;
            lff lffVar2 = lffVar;
            if (unsafe.compareAndSwapObject(gf4Var, j, (Object) null, lffVar2)) {
                return true;
            }
            if (unsafe.getObjectVolatile(gf4Var, j) != null) {
                return false;
            }
            this = gf4Var;
            lffVar = lffVar2;
        }
    }
}
