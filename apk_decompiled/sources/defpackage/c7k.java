package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class c7k implements Runnable {
    public final /* synthetic */ int E;
    public final /* synthetic */ long F;
    public final /* synthetic */ afk G;

    public /* synthetic */ c7k(afk afkVar, long j, int i) {
        this.E = i;
        this.F = j;
        this.G = afkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.E;
        long j = this.F;
        afk afkVar = this.G;
        switch (i) {
            case 0:
                ((xoj) afkVar).S0(j);
                break;
            case 1:
                vxk vxkVar = (vxk) afkVar;
                ((umk) vxkVar.E).h().O0(j);
                vxkVar.I = null;
                break;
            default:
                yzk yzkVar = (yzk) afkVar;
                yzkVar.K0();
                yzkVar.R0();
                ygk ygkVar = yzkVar.b0().R;
                long j2 = this.F;
                ygkVar.c("Activity paused, time", Long.valueOf(j2));
                cbf cbfVar = yzkVar.K;
                yzk yzkVar2 = (yzk) cbfVar.G;
                ((umk) yzkVar2.E).R.getClass();
                d0l d0lVar = new d0l(cbfVar, System.currentTimeMillis(), j2);
                cbfVar.F = d0lVar;
                yzkVar2.G.postDelayed(d0lVar, 2000L);
                if (((umk) yzkVar.E).K.a1()) {
                    ((uuk) yzkVar.J.G).a();
                }
                break;
        }
    }
}
