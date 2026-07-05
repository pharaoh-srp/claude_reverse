package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class d0l implements Runnable {
    public final long E;
    public final long F;
    public final /* synthetic */ cbf G;

    public d0l(cbf cbfVar, long j, long j2) {
        this.G = cbfVar;
        this.E = j;
        this.F = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        wlk wlkVarO = ((yzk) this.G.G).O();
        k51 k51Var = new k51(23);
        k51Var.F = this;
        wlkVarO.T0(k51Var);
    }
}
