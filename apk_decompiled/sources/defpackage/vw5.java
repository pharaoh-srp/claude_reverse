package defpackage;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class vw5 implements bx5 {
    public final /* synthetic */ int E;
    public final /* synthetic */ zw5 F;
    public final /* synthetic */ Runnable G;
    public final /* synthetic */ long H;
    public final /* synthetic */ long I;
    public final /* synthetic */ TimeUnit J;

    public /* synthetic */ vw5(zw5 zw5Var, Runnable runnable, long j, long j2, TimeUnit timeUnit, int i) {
        this.E = i;
        this.F = zw5Var;
        this.G = runnable;
        this.H = j;
        this.I = j2;
        this.J = timeUnit;
    }

    @Override // defpackage.bx5
    public final ScheduledFuture a(ax5 ax5Var) {
        int i = this.E;
        Runnable runnable = this.G;
        zw5 zw5Var = this.F;
        switch (i) {
            case 0:
                return zw5Var.F.scheduleAtFixedRate(new ww5(zw5Var, runnable, ax5Var, 0), this.H, this.I, this.J);
            default:
                return zw5Var.F.scheduleWithFixedDelay(new ww5(zw5Var, runnable, ax5Var, 2), this.H, this.I, this.J);
        }
    }
}
