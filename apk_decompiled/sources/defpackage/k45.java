package defpackage;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes.dex */
public final class k45 implements Executor, Closeable {
    public static final /* synthetic */ AtomicLongFieldUpdater L = AtomicLongFieldUpdater.newUpdater(k45.class, "parkedWorkersStack$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater M = AtomicLongFieldUpdater.newUpdater(k45.class, "controlState$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater N = AtomicIntegerFieldUpdater.newUpdater(k45.class, "_isTerminated$volatile");
    public static final sqb O = new sqb("NOT_IN_STACK", 1);
    public final int E;
    public final int F;
    public final long G;
    public final String H;
    public final s78 I;
    public final s78 J;
    public final wme K;
    private volatile /* synthetic */ int _isTerminated$volatile;
    private volatile /* synthetic */ long controlState$volatile;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    public k45(int i, int i2, long j, String str) {
        this.E = i;
        this.F = i2;
        this.G = j;
        this.H = str;
        if (i < 1) {
            mr9.q(grc.u("Core pool size ", i, " should be at least 1"));
            throw null;
        }
        if (i2 < i) {
            mr9.q(grc.o(i2, i, "Max pool size ", " should be greater than or equals to core pool size "));
            throw null;
        }
        if (i2 > 2097150) {
            mr9.q(grc.u("Max pool size ", i2, " should not exceed maximal supported number of threads 2097150"));
            throw null;
        }
        if (j <= 0) {
            mr9.q(grc.q(j, "Idle worker keep alive time ", " must be positive"));
            throw null;
        }
        this.I = new s78();
        this.J = new s78();
        this.K = new wme((i + 1) * 2);
        this.controlState$volatile = ((long) i) << 42;
    }

    public static /* synthetic */ void e(k45 k45Var, Runnable runnable, int i) {
        k45Var.d(runnable, false, (i & 4) == 0);
    }

    public final int c() {
        synchronized (this.K) {
            try {
                if (N.get(this) == 1) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = M;
                long j = atomicLongFieldUpdater.get(this);
                int i = (int) (j & 2097151);
                int i2 = i - ((int) ((j & 4398044413952L) >> 21));
                if (i2 < 0) {
                    i2 = 0;
                }
                if (i2 >= this.E) {
                    return 0;
                }
                if (i >= this.F) {
                    return 0;
                }
                int i3 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i3 <= 0 || this.K.b(i3) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                i45 i45Var = new i45(this, i3);
                this.K.c(i3, i45Var);
                if (i3 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i4 = i2 + 1;
                i45Var.start();
                return i4;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x006e  */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void close() throws java.lang.InterruptedException {
        /*
            r8 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = defpackage.k45.N
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r8, r1, r2)
            if (r0 != 0) goto Lb
            return
        Lb:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r1 = r0 instanceof defpackage.i45
            r3 = 0
            if (r1 == 0) goto L17
            i45 r0 = (defpackage.i45) r0
            goto L18
        L17:
            r0 = r3
        L18:
            if (r0 == 0) goto L20
            k45 r1 = r0.L
            if (r1 == r8) goto L1f
            goto L20
        L1f:
            r3 = r0
        L20:
            wme r0 = r8.K
            monitor-enter(r0)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = defpackage.k45.M     // Catch: java.lang.Throwable -> La7
            long r4 = r1.get(r8)     // Catch: java.lang.Throwable -> La7
            r6 = 2097151(0x1fffff, double:1.0361303E-317)
            long r4 = r4 & r6
            int r1 = (int) r4
            monitor-exit(r0)
            if (r2 > r1) goto L5c
            r0 = r2
        L32:
            wme r4 = r8.K
            java.lang.Object r4 = r4.b(r0)
            r4.getClass()
            i45 r4 = (defpackage.i45) r4
            if (r4 == r3) goto L57
        L3f:
            java.lang.Thread$State r5 = r4.getState()
            java.lang.Thread$State r6 = java.lang.Thread.State.TERMINATED
            if (r5 == r6) goto L50
            java.util.concurrent.locks.LockSupport.unpark(r4)
            r5 = 10000(0x2710, double:4.9407E-320)
            r4.join(r5)
            goto L3f
        L50:
            ngj r4 = r4.E
            s78 r5 = r8.J
            r4.d(r5)
        L57:
            if (r0 == r1) goto L5c
            int r0 = r0 + 1
            goto L32
        L5c:
            s78 r0 = r8.J
            r0.b()
            s78 r0 = r8.I
            r0.b()
        L66:
            if (r3 == 0) goto L6e
            b5h r0 = r3.a(r2)
            if (r0 != 0) goto L96
        L6e:
            s78 r0 = r8.I
            java.lang.Object r0 = r0.d()
            b5h r0 = (defpackage.b5h) r0
            if (r0 != 0) goto L96
            s78 r0 = r8.J
            java.lang.Object r0 = r0.d()
            b5h r0 = (defpackage.b5h) r0
            if (r0 != 0) goto L96
            if (r3 == 0) goto L89
            j45 r0 = defpackage.j45.I
            r3.h(r0)
        L89:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = defpackage.k45.L
            r1 = 0
            r0.set(r8, r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = defpackage.k45.M
            r0.set(r8, r1)
            return
        L96:
            r0.run()     // Catch: java.lang.Throwable -> L9a
            goto L66
        L9a:
            r0 = move-exception
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            java.lang.Thread$UncaughtExceptionHandler r4 = r1.getUncaughtExceptionHandler()
            r4.uncaughtException(r1, r0)
            goto L66
        La7:
            r8 = move-exception
            monitor-exit(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k45.close():void");
    }

    public final void d(Runnable runnable, boolean z, boolean z2) {
        b5h b6hVar;
        j45 j45Var;
        x9h.f.getClass();
        long jNanoTime = System.nanoTime();
        if (runnable instanceof b5h) {
            b6hVar = (b5h) runnable;
            b6hVar.E = jNanoTime;
            b6hVar.F = z;
        } else {
            b6hVar = new b6h(runnable, jNanoTime, z);
        }
        boolean z3 = b6hVar.F;
        AtomicLongFieldUpdater atomicLongFieldUpdater = M;
        long jAddAndGet = z3 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread threadCurrentThread = Thread.currentThread();
        i45 i45Var = null;
        i45 i45Var2 = threadCurrentThread instanceof i45 ? (i45) threadCurrentThread : null;
        if (i45Var2 != null && i45Var2.L == this) {
            i45Var = i45Var2;
        }
        if (i45Var != null && (j45Var = i45Var.G) != j45.I && (b6hVar.F || j45Var != j45.F)) {
            i45Var.K = true;
            b6hVar = i45Var.E.a(b6hVar, z2);
        }
        if (b6hVar != null) {
            if (!(b6hVar.F ? this.J.a(b6hVar) : this.I.a(b6hVar))) {
                throw new RejectedExecutionException(ij0.m(new StringBuilder(), this.H, " was terminated"));
            }
        }
        if (z3) {
            if (j() || i(jAddAndGet)) {
                return;
            }
            j();
            return;
        }
        if (j() || i(atomicLongFieldUpdater.get(this))) {
            return;
        }
        j();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        e(this, runnable, 6);
    }

    public final void f(i45 i45Var, int i, int i2) {
        while (true) {
            long j = L.get(this);
            int i3 = (int) (2097151 & j);
            long j2 = (2097152 + j) & (-2097152);
            if (i3 == i) {
                if (i2 == 0) {
                    Object objC = i45Var.c();
                    while (true) {
                        if (objC == O) {
                            i3 = -1;
                            break;
                        }
                        if (objC == null) {
                            i3 = 0;
                            break;
                        }
                        i45 i45Var2 = (i45) objC;
                        int iB = i45Var2.b();
                        if (iB != 0) {
                            i3 = iB;
                            break;
                        }
                        objC = i45Var2.c();
                    }
                } else {
                    i3 = i2;
                }
            }
            if (i3 >= 0) {
                k45 k45Var = this;
                if (L.compareAndSet(k45Var, j, ((long) i3) | j2)) {
                    return;
                } else {
                    this = k45Var;
                }
            }
        }
    }

    public final boolean i(long j) {
        int i = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        int i2 = this.E;
        if (i < i2) {
            int iC = c();
            if (iC == 1 && i2 > 1) {
                c();
            }
            if (iC > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean j() {
        k45 k45Var;
        sqb sqbVar;
        int iB;
        while (true) {
            long j = L.get(this);
            i45 i45Var = (i45) this.K.b((int) (2097151 & j));
            if (i45Var == null) {
                i45Var = null;
                k45Var = this;
            } else {
                long j2 = (2097152 + j) & (-2097152);
                Object objC = i45Var.c();
                while (true) {
                    sqbVar = O;
                    if (objC == sqbVar) {
                        iB = -1;
                        break;
                    }
                    if (objC == null) {
                        iB = 0;
                        break;
                    }
                    i45 i45Var2 = (i45) objC;
                    iB = i45Var2.b();
                    if (iB != 0) {
                        break;
                    }
                    objC = i45Var2.c();
                    j = j;
                }
                if (iB >= 0) {
                    k45 k45Var2 = this;
                    boolean zCompareAndSet = L.compareAndSet(k45Var2, j, ((long) iB) | j2);
                    k45Var = k45Var2;
                    if (zCompareAndSet) {
                        i45Var.g(sqbVar);
                    }
                    this = k45Var;
                } else {
                    continue;
                }
            }
            if (i45Var == null) {
                return false;
            }
            if (i45.M.compareAndSet(i45Var, -1, 0)) {
                LockSupport.unpark(i45Var);
                return true;
            }
            this = k45Var;
        }
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        wme wmeVar = this.K;
        int iA = wmeVar.a();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < iA; i6++) {
            i45 i45Var = (i45) wmeVar.b(i6);
            if (i45Var != null) {
                int iC = i45Var.E.c();
                int iOrdinal = i45Var.G.ordinal();
                if (iOrdinal == 0) {
                    i++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(iC);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (iOrdinal == 1) {
                    i2++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(iC);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (iOrdinal == 2) {
                    i3++;
                } else if (iOrdinal == 3) {
                    i4++;
                    if (iC > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(iC);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else {
                    if (iOrdinal != 4) {
                        mr9.b();
                        return null;
                    }
                    i5++;
                }
            }
        }
        long j = M.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.H);
        sb4.append('@');
        sb4.append(xn5.d0(this));
        sb4.append("[Pool Size {core = ");
        int i7 = this.E;
        sb4.append(i7);
        sb4.append(", max = ");
        qy1.k(this.F, i, "}, Worker States {CPU = ", ", blocking = ", sb4);
        qy1.k(i2, i3, ", parked = ", ", dormant = ", sb4);
        qy1.k(i4, i5, ", terminated = ", "}, running workers queues = ", sb4);
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.I.c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.J.c());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i7 - ((int) ((j & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }
}
