package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class z76 extends c86 implements n45, tp4 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater L = AtomicReferenceFieldUpdater.newUpdater(z76.class, Object.class, "_reusableCancellableContinuation$volatile");
    public static final /* synthetic */ long M = yf4.a.objectFieldOffset(z76.class.getDeclaredField("_reusableCancellableContinuation$volatile"));
    public final e45 H;
    public final vp4 I;
    public Object J;
    public final Object K;
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    public z76(e45 e45Var, vp4 vp4Var) {
        super(-1);
        this.H = e45Var;
        this.I = vp4Var;
        this.J = a86.a;
        this.K = qnh.b(vp4Var.getContext());
    }

    @Override // defpackage.c86
    public final tp4 c() {
        return this;
    }

    @Override // defpackage.c86
    public final Object g() {
        Object obj = this.J;
        this.J = a86.a;
        return obj;
    }

    @Override // defpackage.n45
    public final n45 getCallerFrame() {
        return this.I;
    }

    @Override // defpackage.tp4
    public final c45 getContext() {
        return this.I.getContext();
    }

    public final void i() {
        do {
            L.getClass();
        } while (yf4.a.getObjectVolatile(this, M) == a86.b);
    }

    public final ua2 j() {
        z76 z76Var;
        while (true) {
            L.getClass();
            Unsafe unsafe = yf4.a;
            long j = M;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            sqb sqbVar = a86.b;
            if (objectVolatile == null) {
                unsafe.putObjectVolatile(this, j, sqbVar);
                return null;
            }
            if (objectVolatile instanceof ua2) {
                while (true) {
                    Unsafe unsafe2 = yf4.a;
                    z76Var = this;
                    if (unsafe2.compareAndSwapObject(z76Var, M, objectVolatile, sqbVar)) {
                        return (ua2) objectVolatile;
                    }
                    if (unsafe2.getObjectVolatile(z76Var, j) != objectVolatile) {
                        break;
                    }
                    this = z76Var;
                }
            } else {
                z76Var = this;
                if (objectVolatile != sqbVar && !(objectVolatile instanceof Throwable)) {
                    sz6.j(ij0.B("Inconsistent state ", objectVolatile));
                    return null;
                }
            }
            this = z76Var;
        }
    }

    public final ua2 k() {
        L.getClass();
        Object objectVolatile = yf4.a.getObjectVolatile(this, M);
        if (objectVolatile instanceof ua2) {
            return (ua2) objectVolatile;
        }
        return null;
    }

    public final boolean l() {
        L.getClass();
        return yf4.a.getObjectVolatile(this, M) != null;
    }

    public final boolean m(Throwable th) {
        z76 z76Var;
        Throwable th2;
        Unsafe unsafe;
        while (true) {
            L.getClass();
            Unsafe unsafe2 = yf4.a;
            long j = M;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            sqb sqbVar = a86.b;
            if (x44.r(objectVolatile, sqbVar)) {
                while (true) {
                    Unsafe unsafe3 = yf4.a;
                    z76 z76Var2 = this;
                    th2 = th;
                    z76Var = z76Var2;
                    if (unsafe3.compareAndSwapObject(z76Var2, M, sqbVar, th2)) {
                        return true;
                    }
                    if (unsafe3.getObjectVolatile(z76Var, j) != sqbVar) {
                        break;
                    }
                    this = z76Var;
                    th = th2;
                }
            } else {
                z76Var = this;
                th2 = th;
                if (objectVolatile instanceof Throwable) {
                    return true;
                }
                do {
                    unsafe = yf4.a;
                    if (unsafe.compareAndSwapObject(z76Var, M, objectVolatile, (Object) null)) {
                        return false;
                    }
                } while (unsafe.getObjectVolatile(z76Var, j) == objectVolatile);
            }
            this = z76Var;
            th = th2;
        }
    }

    public final Throwable n(ua2 ua2Var) {
        Unsafe unsafe;
        z76 z76Var;
        ua2 ua2Var2;
        while (true) {
            L.getClass();
            Unsafe unsafe2 = yf4.a;
            long j = M;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            sqb sqbVar = a86.b;
            if (objectVolatile != sqbVar) {
                z76 z76Var2 = this;
                if (!(objectVolatile instanceof Throwable)) {
                    sz6.j(ij0.B("Inconsistent state ", objectVolatile));
                    return null;
                }
                do {
                    unsafe = yf4.a;
                    if (unsafe.compareAndSwapObject(z76Var2, M, objectVolatile, (Object) null)) {
                        return (Throwable) objectVolatile;
                    }
                } while (unsafe.getObjectVolatile(z76Var2, j) == objectVolatile);
                sz6.p("Failed requirement.");
                return null;
            }
            while (true) {
                Unsafe unsafe3 = yf4.a;
                z76Var = this;
                ua2Var2 = ua2Var;
                if (unsafe3.compareAndSwapObject(z76Var, M, sqbVar, ua2Var2)) {
                    return null;
                }
                if (unsafe3.getObjectVolatile(z76Var, j) != sqbVar) {
                    break;
                }
                this = z76Var;
                ua2Var = ua2Var2;
            }
            this = z76Var;
            ua2Var = ua2Var2;
        }
    }

    @Override // defpackage.tp4
    public final void resumeWith(Object obj) {
        Throwable thA = jre.a(obj);
        Object e94Var = thA == null ? obj : new e94(thA, false);
        vp4 vp4Var = this.I;
        c45 context = vp4Var.getContext();
        e45 e45Var = this.H;
        if (a86.c(e45Var, context)) {
            this.J = e94Var;
            this.G = 0;
            a86.b(e45Var, vp4Var.getContext(), this);
            return;
        }
        vz6 vz6VarA = vnh.a();
        if (vz6VarA.G >= 4294967296L) {
            this.J = e94Var;
            this.G = 0;
            vz6VarA.T0(this);
            return;
        }
        vz6VarA.U0(true);
        try {
            c45 context2 = vp4Var.getContext();
            Object objC = qnh.c(context2, this.K);
            try {
                vp4Var.resumeWith(obj);
                while (vz6VarA.W0()) {
                }
            } finally {
                qnh.a(context2, objC);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.H + ", " + xn5.v0(this.I) + ']';
    }
}
