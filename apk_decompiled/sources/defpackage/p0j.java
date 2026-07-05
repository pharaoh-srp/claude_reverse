package defpackage;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class p0j implements Runnable {
    public final k99 E;
    public final o0j F;
    public final k0j G;
    public final ScheduledExecutorService H;
    public final long I;
    public volatile sxe J;

    public p0j(k99 k99Var, o0j o0jVar, k0j k0jVar, ScheduledExecutorService scheduledExecutorService, long j) {
        k99Var.getClass();
        k0jVar.getClass();
        scheduledExecutorService.getClass();
        this.E = k99Var;
        this.F = o0jVar;
        this.G = k0jVar;
        this.H = scheduledExecutorService;
        this.I = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Double dA;
        sxe sxeVar = this.J;
        if ((sxeVar != null ? sxeVar.o : 0) == 2 && (dA = this.F.a()) != null) {
            this.G.l(dA.doubleValue());
        }
        v40.N(this.H, "Vitals monitoring", this.I, this.E.t(), this);
    }
}
