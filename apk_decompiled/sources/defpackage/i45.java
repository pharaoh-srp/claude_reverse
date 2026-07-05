package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class i45 extends Thread {
    public static final /* synthetic */ AtomicIntegerFieldUpdater M = AtomicIntegerFieldUpdater.newUpdater(i45.class, "workerCtl$volatile");
    public final ngj E;
    public final dae F;
    public j45 G;
    public long H;
    public long I;
    public int J;
    public boolean K;
    public final /* synthetic */ k45 L;
    private volatile int indexInArray;
    private volatile Object nextParkedWorker;
    private volatile /* synthetic */ int workerCtl$volatile;

    public i45(k45 k45Var, int i) {
        this.L = k45Var;
        setDaemon(true);
        setContextClassLoader(k45.class.getClassLoader());
        this.E = new ngj();
        this.F = new dae();
        this.G = j45.H;
        this.nextParkedWorker = k45.O;
        int iNanoTime = (int) System.nanoTime();
        this.J = iNanoTime == 0 ? 42 : iNanoTime;
        f(i);
    }

    public final b5h a(boolean z) {
        b5h b5hVarE;
        b5h b5hVarE2;
        long j;
        j45 j45Var = this.G;
        k45 k45Var = this.L;
        ngj ngjVar = this.E;
        j45 j45Var2 = j45.E;
        if (j45Var != j45Var2) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = k45.M;
            do {
                j = atomicLongFieldUpdater.get(k45Var);
                if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                    b5h b5hVarG = ngjVar.g();
                    return (b5hVarG == null && (b5hVarG = (b5h) k45Var.J.d()) == null) ? i(1) : b5hVarG;
                }
            } while (!k45.M.compareAndSet(k45Var, j, j - 4398046511104L));
            this.G = j45Var2;
        }
        if (z) {
            boolean z2 = d(k45Var.E * 2) == 0;
            if (z2 && (b5hVarE2 = e()) != null) {
                return b5hVarE2;
            }
            b5h b5hVarE3 = ngjVar.e();
            if (b5hVarE3 != null) {
                return b5hVarE3;
            }
            if (!z2 && (b5hVarE = e()) != null) {
                return b5hVarE;
            }
        } else {
            b5h b5hVarE4 = e();
            if (b5hVarE4 != null) {
                return b5hVarE4;
            }
        }
        return i(3);
    }

    public final int b() {
        return this.indexInArray;
    }

    public final Object c() {
        return this.nextParkedWorker;
    }

    public final int d(int i) {
        int i2 = this.J;
        int i3 = i2 ^ (i2 << 13);
        int i4 = i3 ^ (i3 >> 17);
        int i5 = i4 ^ (i4 << 5);
        this.J = i5;
        int i6 = i - 1;
        return (i6 & i) == 0 ? i6 & i5 : (Integer.MAX_VALUE & i5) % i;
    }

    public final b5h e() {
        int iD = d(2);
        k45 k45Var = this.L;
        s78 s78Var = k45Var.J;
        s78 s78Var2 = k45Var.I;
        if (iD == 0) {
            b5h b5hVar = (b5h) s78Var2.d();
            return b5hVar != null ? b5hVar : (b5h) s78Var.d();
        }
        b5h b5hVar2 = (b5h) s78Var.d();
        return b5hVar2 != null ? b5hVar2 : (b5h) s78Var2.d();
    }

    public final void f(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.L.H);
        sb.append("-worker-");
        sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
        setName(sb.toString());
        this.indexInArray = i;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(j45 j45Var) {
        j45 j45Var2 = this.G;
        boolean z = j45Var2 == j45.E;
        if (z) {
            k45.M.addAndGet(this.L, 4398046511104L);
        }
        if (j45Var2 != j45Var) {
            this.G = j45Var;
        }
        return z;
    }

    public final b5h i(int i) {
        b5h b5hVarH;
        long jI;
        AtomicLongFieldUpdater atomicLongFieldUpdater = k45.M;
        k45 k45Var = this.L;
        int i2 = (int) (atomicLongFieldUpdater.get(k45Var) & 2097151);
        if (i2 < 2) {
            return null;
        }
        int iD = d(i2);
        long jMin = Long.MAX_VALUE;
        for (int i3 = 0; i3 < i2; i3++) {
            iD++;
            if (iD > i2) {
                iD = 1;
            }
            i45 i45Var = (i45) k45Var.K.b(iD);
            if (i45Var != null && i45Var != this) {
                ngj ngjVar = i45Var.E;
                ngjVar.getClass();
                if (i == 3) {
                    b5hVarH = ngjVar.f();
                } else {
                    boolean z = i == 1;
                    int i4 = ngj.d.get(ngjVar);
                    int i5 = ngj.c.get(ngjVar);
                    while (i4 != i5 && (!z || ngj.e.get(ngjVar) != 0)) {
                        int i6 = i4 + 1;
                        b5hVarH = ngjVar.h(i4, z);
                        if (b5hVarH != null) {
                            break;
                        }
                        i4 = i6;
                    }
                    b5hVarH = null;
                }
                dae daeVar = this.F;
                if (b5hVarH != null) {
                    daeVar.E = b5hVarH;
                    jI = -1;
                } else {
                    jI = ngjVar.i(i, daeVar);
                }
                if (jI == -1) {
                    b5h b5hVar = (b5h) daeVar.E;
                    daeVar.E = null;
                    return b5hVar;
                }
                if (jI > 0) {
                    jMin = Math.min(jMin, jI);
                }
            }
        }
        if (jMin == Long.MAX_VALUE) {
            jMin = 0;
        }
        this.I = jMin;
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0004, code lost:
    
        continue;
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instruction units count: 415
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i45.run():void");
    }
}
