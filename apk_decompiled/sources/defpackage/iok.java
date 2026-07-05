package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class iok implements Runnable {
    public final /* synthetic */ int E;
    public final /* synthetic */ u1l F;
    public final /* synthetic */ mnk G;

    public /* synthetic */ iok(mnk mnkVar, u1l u1lVar, int i) {
        this.E = i;
        this.F = u1lVar;
        this.G = mnkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.E;
        u1l u1lVar = this.F;
        mnk mnkVar = this.G;
        switch (i) {
            case 0:
                o0l o0lVar = mnkVar.i;
                o0lVar.Z();
                o0lVar.O().K0();
                o0lVar.a0();
                dgj.v(u1lVar);
                String str = u1lVar.E;
                dgj.s(str);
                if (o0lVar.N().X0(null, zvj.f1)) {
                    int i2 = 0;
                    if (o0lVar.N().X0(null, zvj.i0)) {
                        o0lVar.zzb().getClass();
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        int iR0 = o0lVar.N().R0(null, zvj.U);
                        o0lVar.N();
                        long jLongValue = jCurrentTimeMillis - ((Long) zvj.e.a(null)).longValue();
                        while (i2 < iR0 && o0lVar.w(jLongValue, null)) {
                            i2++;
                        }
                    } else {
                        o0lVar.N();
                        long jIntValue = ((Integer) zvj.l.a(null)).intValue();
                        while (i2 < jIntValue && o0lVar.w(0L, str)) {
                            i2++;
                        }
                    }
                    if (o0lVar.N().X0(null, zvj.j0)) {
                        o0lVar.A();
                    }
                    break;
                }
                break;
            default:
                o0l o0lVar2 = mnkVar.i;
                o0lVar2.Z();
                o0lVar2.Q(u1lVar);
                break;
        }
    }
}
