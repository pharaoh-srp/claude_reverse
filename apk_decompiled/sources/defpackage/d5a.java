package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class d5a extends e45 implements gw5 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater M = AtomicIntegerFieldUpdater.newUpdater(d5a.class, "runningWorkers$volatile");
    public final /* synthetic */ gw5 G;
    public final e45 H;
    public final int I;
    public final String J;
    public final ifa K;
    public final Object L;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX WARN: Multi-variable type inference failed */
    public d5a(e45 e45Var, int i, String str) {
        gw5 gw5Var = e45Var instanceof gw5 ? (gw5) e45Var : null;
        this.G = gw5Var == null ? er5.a : gw5Var;
        this.H = e45Var;
        this.I = i;
        this.J = str;
        this.K = new ifa();
        this.L = new Object();
    }

    @Override // defpackage.e45
    public final void O0(c45 c45Var, Runnable runnable) {
        Runnable runnableS0;
        this.K.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = M;
        if (atomicIntegerFieldUpdater.get(this) >= this.I || !T0() || (runnableS0 = S0()) == null) {
            return;
        }
        try {
            a86.b(this.H, this, new c5a(this, 0, runnableS0));
        } catch (Throwable th) {
            atomicIntegerFieldUpdater.decrementAndGet(this);
            throw th;
        }
    }

    @Override // defpackage.gw5
    public final y86 P(long j, Runnable runnable, c45 c45Var) {
        return this.G.P(j, runnable, c45Var);
    }

    @Override // defpackage.e45
    public final void P0(c45 c45Var, Runnable runnable) {
        Runnable runnableS0;
        this.K.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = M;
        if (atomicIntegerFieldUpdater.get(this) >= this.I || !T0() || (runnableS0 = S0()) == null) {
            return;
        }
        try {
            this.H.P0(this, new c5a(this, 0, runnableS0));
        } catch (Throwable th) {
            atomicIntegerFieldUpdater.decrementAndGet(this);
            throw th;
        }
    }

    @Override // defpackage.e45
    public final e45 R0(int i, String str) {
        eve.o(i);
        return i >= this.I ? str != null ? new xxb(this, str) : this : super.R0(i, str);
    }

    public final Runnable S0() {
        while (true) {
            Runnable runnable = (Runnable) this.K.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.L) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = M;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.K.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    public final boolean T0() {
        synchronized (this.L) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = M;
            if (atomicIntegerFieldUpdater.get(this) >= this.I) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }

    @Override // defpackage.gw5
    public final void l0(long j, ua2 ua2Var) {
        this.G.l0(j, ua2Var);
    }

    @Override // defpackage.e45
    public final String toString() {
        String str = this.J;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.H);
        sb.append(".limitedParallelism(");
        return vb7.r(sb, this.I, ')');
    }
}
