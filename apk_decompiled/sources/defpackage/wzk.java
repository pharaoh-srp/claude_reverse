package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wzk implements Runnable {
    public final /* synthetic */ long E;
    public final /* synthetic */ yzk F;

    public wzk(yzk yzkVar, long j) {
        this.E = j;
        this.F = yzkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yzk yzkVar = this.F;
        yzkVar.K0();
        e5e e5eVar = yzkVar.J;
        yzkVar.R0();
        ygk ygkVar = yzkVar.b0().R;
        long j = this.E;
        ygkVar.c("Activity resumed, time", Long.valueOf(j));
        umk umkVar = (umk) yzkVar.E;
        boolean zX0 = umkVar.K.X0(null, zvj.M0);
        vqj vqjVar = umkVar.K;
        if (zX0) {
            if (vqjVar.a1() || yzkVar.H) {
                ((yzk) e5eVar.H).K0();
                ((uuk) e5eVar.G).a();
                e5eVar.E = j;
                e5eVar.F = j;
            }
        } else if (vqjVar.a1() || yzkVar.I0().X.b()) {
            ((yzk) e5eVar.H).K0();
            ((uuk) e5eVar.G).a();
            e5eVar.E = j;
            e5eVar.F = j;
        }
        cbf cbfVar = yzkVar.K;
        yzk yzkVar2 = (yzk) cbfVar.G;
        yzkVar2.K0();
        d0l d0lVar = (d0l) cbfVar.F;
        if (d0lVar != null) {
            yzkVar2.G.removeCallbacks(d0lVar);
        }
        yzkVar2.I0().X.a(false);
        yzkVar2.K0();
        yzkVar2.H = false;
        if (((umk) yzkVar2.E).K.X0(null, zvj.J0) && yzkVar2.L0().Q) {
            yzkVar2.b0().R.b("Retrying trigger URI registration in foreground");
            yzkVar2.L0().l1();
        }
        bnh bnhVar = yzkVar.I;
        yzk yzkVar3 = (yzk) bnhVar.F;
        umk umkVar2 = (umk) yzkVar3.E;
        yzkVar3.K0();
        if (umkVar2.e()) {
            umkVar2.R.getClass();
            bnhVar.f(System.currentTimeMillis());
        }
    }
}
