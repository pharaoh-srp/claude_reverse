package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public abstract class a07 extends vz6 implements gw5 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater K = AtomicReferenceFieldUpdater.newUpdater(a07.class, Object.class, "_queue$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater L;
    public static final /* synthetic */ AtomicIntegerFieldUpdater M;
    public static final /* synthetic */ long N;
    public static final /* synthetic */ long O;
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile;
    private volatile /* synthetic */ Object _queue$volatile;

    static {
        Unsafe unsafe = yf4.a;
        O = unsafe.objectFieldOffset(a07.class.getDeclaredField("_queue$volatile"));
        L = AtomicReferenceFieldUpdater.newUpdater(a07.class, Object.class, "_delayed$volatile");
        N = unsafe.objectFieldOffset(a07.class.getDeclaredField("_delayed$volatile"));
        M = AtomicIntegerFieldUpdater.newUpdater(a07.class, "_isCompleted$volatile");
    }

    @Override // defpackage.e45
    public final void O0(c45 c45Var, Runnable runnable) {
        Z0(runnable);
    }

    @Override // defpackage.vz6
    public final long V0() {
        if (W0()) {
            return 0L;
        }
        a1();
        Runnable runnableY0 = Y0();
        if (runnableY0 == null) {
            return c1();
        }
        runnableY0.run();
        return 0L;
    }

    public final void X0() {
        a07 a07Var;
        Unsafe unsafe;
        while (true) {
            K.getClass();
            Unsafe unsafe2 = yf4.a;
            long j = O;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            sqb sqbVar = b07.b;
            if (objectVolatile == null) {
                while (true) {
                    Unsafe unsafe3 = yf4.a;
                    a07 a07Var2 = this;
                    a07Var = a07Var2;
                    if (unsafe3.compareAndSwapObject(a07Var2, O, (Object) null, sqbVar)) {
                        return;
                    }
                    if (unsafe3.getObjectVolatile(a07Var, j) != null) {
                        break;
                    } else {
                        this = a07Var;
                    }
                }
            } else {
                a07Var = this;
                if (objectVolatile instanceof kfa) {
                    ((kfa) objectVolatile).c();
                    return;
                }
                if (objectVolatile == sqbVar) {
                    return;
                }
                kfa kfaVar = new kfa(8, true);
                kfaVar.a((Runnable) objectVolatile);
                do {
                    unsafe = yf4.a;
                    if (unsafe.compareAndSwapObject(a07Var, O, objectVolatile, kfaVar)) {
                        return;
                    }
                } while (unsafe.getObjectVolatile(a07Var, j) == objectVolatile);
            }
            this = a07Var;
        }
    }

    public final Runnable Y0() {
        a07 a07Var;
        Unsafe unsafe;
        while (true) {
            K.getClass();
            Unsafe unsafe2 = yf4.a;
            long j = O;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            if (objectVolatile == null) {
                return null;
            }
            if (objectVolatile instanceof kfa) {
                kfa kfaVar = (kfa) objectVolatile;
                Object objE = kfaVar.e();
                if (objE != kfa.g) {
                    return (Runnable) objE;
                }
                kfa kfaVarD = kfaVar.d();
                while (true) {
                    Unsafe unsafe3 = yf4.a;
                    a07Var = this;
                    if (!unsafe3.compareAndSwapObject(a07Var, O, objectVolatile, kfaVarD) && unsafe3.getObjectVolatile(a07Var, j) == objectVolatile) {
                        this = a07Var;
                    }
                }
            } else {
                a07Var = this;
                if (objectVolatile == b07.b) {
                    return null;
                }
                do {
                    unsafe = yf4.a;
                    if (unsafe.compareAndSwapObject(a07Var, O, objectVolatile, (Object) null)) {
                        return (Runnable) objectVolatile;
                    }
                } while (unsafe.getObjectVolatile(a07Var, j) == objectVolatile);
            }
            this = a07Var;
        }
    }

    public void Z0(Runnable runnable) {
        a1();
        if (!b1(runnable)) {
            dr5.P.Z0(runnable);
            return;
        }
        Thread threadD1 = d1();
        if (Thread.currentThread() != threadD1) {
            LockSupport.unpark(threadD1);
        }
    }

    public final void a1() {
        yz6 yz6VarB;
        L.getClass();
        zz6 zz6Var = (zz6) yf4.a.getObjectVolatile(this, N);
        if (zz6Var == null || ynh.b.get(zz6Var) == 0) {
            return;
        }
        long jNanoTime = System.nanoTime();
        do {
            synchronized (zz6Var) {
                try {
                    yz6[] yz6VarArr = zz6Var.a;
                    yz6VarB = null;
                    yz6 yz6Var = yz6VarArr != null ? yz6VarArr[0] : null;
                    if (yz6Var != null) {
                        if (jNanoTime - yz6Var.E >= 0 ? b1(yz6Var) : false) {
                            yz6VarB = zz6Var.b(0);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (yz6VarB != null);
    }

    public final boolean b1(Runnable runnable) {
        Unsafe unsafe;
        Unsafe unsafe2;
        Unsafe unsafe3;
        loop0: while (true) {
            K.getClass();
            Unsafe unsafe4 = yf4.a;
            long j = O;
            Object objectVolatile = unsafe4.getObjectVolatile(this, j);
            if (M.get(this) == 1) {
                return false;
            }
            if (objectVolatile == null) {
                do {
                    unsafe = yf4.a;
                    if (unsafe.compareAndSwapObject(this, O, (Object) null, runnable)) {
                        break loop0;
                    }
                } while (unsafe.getObjectVolatile(this, j) == null);
            } else if (objectVolatile instanceof kfa) {
                kfa kfaVar = (kfa) objectVolatile;
                int iA = kfaVar.a(runnable);
                if (iA == 0) {
                    break;
                }
                if (iA == 1) {
                    kfa kfaVarD = kfaVar.d();
                    do {
                        unsafe2 = yf4.a;
                        if (unsafe2.compareAndSwapObject(this, O, objectVolatile, kfaVarD)) {
                            break;
                        }
                    } while (unsafe2.getObjectVolatile(this, j) == objectVolatile);
                } else if (iA == 2) {
                    return false;
                }
            } else {
                if (objectVolatile == b07.b) {
                    return false;
                }
                kfa kfaVar2 = new kfa(8, true);
                kfaVar2.a((Runnable) objectVolatile);
                kfaVar2.a(runnable);
                do {
                    unsafe3 = yf4.a;
                    if (unsafe3.compareAndSwapObject(this, O, objectVolatile, kfaVar2)) {
                        break loop0;
                    }
                } while (unsafe3.getObjectVolatile(this, j) == objectVolatile);
            }
        }
        return true;
    }

    public final long c1() {
        yz6 yz6Var;
        qo0 qo0Var = this.I;
        if (((qo0Var == null || qo0Var.isEmpty()) ? Long.MAX_VALUE : 0L) != 0) {
            K.getClass();
            Unsafe unsafe = yf4.a;
            Object objectVolatile = unsafe.getObjectVolatile(this, O);
            if (objectVolatile != null) {
                if (objectVolatile instanceof kfa) {
                    long j = kfa.f.get((kfa) objectVolatile);
                    if (((int) (1073741823 & j)) != ((int) ((j & 1152921503533105152L) >> 30))) {
                        return 0L;
                    }
                } else if (objectVolatile == b07.b) {
                    return Long.MAX_VALUE;
                }
            }
            L.getClass();
            zz6 zz6Var = (zz6) unsafe.getObjectVolatile(this, N);
            if (zz6Var != null) {
                synchronized (zz6Var) {
                    yz6[] yz6VarArr = zz6Var.a;
                    yz6Var = yz6VarArr != null ? yz6VarArr[0] : null;
                }
                if (yz6Var != null) {
                    long jNanoTime = yz6Var.E - System.nanoTime();
                    if (jNanoTime >= 0) {
                        return jNanoTime;
                    }
                }
            }
            return Long.MAX_VALUE;
        }
        return 0L;
    }

    public abstract Thread d1();

    public final boolean e1() {
        qo0 qo0Var = this.I;
        if (qo0Var != null ? qo0Var.isEmpty() : true) {
            L.getClass();
            Unsafe unsafe = yf4.a;
            zz6 zz6Var = (zz6) unsafe.getObjectVolatile(this, N);
            if (zz6Var != null && ynh.b.get(zz6Var) != 0) {
                return false;
            }
            K.getClass();
            Object objectVolatile = unsafe.getObjectVolatile(this, O);
            if (objectVolatile != null) {
                if (objectVolatile instanceof kfa) {
                    long j = kfa.f.get((kfa) objectVolatile);
                    return ((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30));
                }
                if (objectVolatile == b07.b) {
                }
            }
            return true;
        }
        return false;
    }

    public void f1(long j, yz6 yz6Var) {
        dr5.P.i1(j, yz6Var);
    }

    public final void g1() {
        yz6 yz6VarB;
        long jNanoTime = System.nanoTime();
        while (true) {
            L.getClass();
            zz6 zz6Var = (zz6) yf4.a.getObjectVolatile(this, N);
            if (zz6Var == null) {
                return;
            }
            synchronized (zz6Var) {
                yz6VarB = ynh.b.get(zz6Var) > 0 ? zz6Var.b(0) : null;
            }
            if (yz6VarB == null) {
                return;
            } else {
                f1(jNanoTime, yz6VarB);
            }
        }
    }

    public final void h1() {
        K.getClass();
        Unsafe unsafe = yf4.a;
        unsafe.putObjectVolatile(this, O, (Object) null);
        L.getClass();
        unsafe.putObjectVolatile(this, N, (Object) null);
    }

    public final void i1(long j, yz6 yz6Var) {
        Thread threadD1;
        int iJ1 = j1(j, yz6Var);
        if (iJ1 == 0) {
            if (!k1(yz6Var) || Thread.currentThread() == (threadD1 = d1())) {
                return;
            }
            LockSupport.unpark(threadD1);
            return;
        }
        if (iJ1 == 1) {
            f1(j, yz6Var);
        } else {
            if (iJ1 == 2) {
                return;
            }
            sz6.j("unexpected result");
        }
    }

    public final int j1(long j, yz6 yz6Var) {
        a07 a07Var;
        Unsafe unsafe;
        if (M.get(this) == 1) {
            return 1;
        }
        L.getClass();
        Unsafe unsafe2 = yf4.a;
        long j2 = N;
        zz6 zz6Var = (zz6) unsafe2.getObjectVolatile(this, j2);
        if (zz6Var == null) {
            zz6 zz6Var2 = new zz6();
            zz6Var2.c = j;
            while (true) {
                unsafe = yf4.a;
                a07Var = this;
                if (unsafe.compareAndSwapObject(a07Var, N, (Object) null, zz6Var2) || unsafe.getObjectVolatile(a07Var, j2) != null) {
                    break;
                }
                this = a07Var;
            }
            Object objectVolatile = unsafe.getObjectVolatile(a07Var, j2);
            objectVolatile.getClass();
            zz6Var = (zz6) objectVolatile;
        } else {
            a07Var = this;
        }
        return yz6Var.c(j, zz6Var, a07Var);
    }

    public final boolean k1(yz6 yz6Var) {
        L.getClass();
        zz6 zz6Var = (zz6) yf4.a.getObjectVolatile(this, N);
        if (zz6Var != null) {
            synchronized (zz6Var) {
                yz6[] yz6VarArr = zz6Var.a;
                yz6Var = yz6VarArr != null ? yz6VarArr[0] : null;
            }
        }
        return yz6Var == yz6Var;
    }

    @Override // defpackage.gw5
    public final void l0(long j, ua2 ua2Var) {
        long j2 = j > 0 ? j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j : 0L;
        if (j2 < 4611686018427387903L) {
            long jNanoTime = System.nanoTime();
            wz6 wz6Var = new wz6(this, j2 + jNanoTime, ua2Var);
            i1(jNanoTime, wz6Var);
            ua2Var.x(new oa2(1, wz6Var));
        }
    }

    @Override // defpackage.vz6
    public void shutdown() {
        vnh.a.set(null);
        M.set(this, 1);
        X0();
        while (V0() <= 0) {
        }
        g1();
    }
}
