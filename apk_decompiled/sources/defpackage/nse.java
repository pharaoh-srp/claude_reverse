package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nse implements ka6 {
    public final /* synthetic */ int E;
    public final /* synthetic */ rse F;

    public /* synthetic */ nse(rse rseVar, int i) {
        this.E = i;
        this.F = rseVar;
    }

    @Override // defpackage.ka6
    public final double a(double d) {
        int i = this.E;
        rse rseVar = this.F;
        switch (i) {
            case 0:
                return wd6.c0(rseVar.k.a(d), rseVar.e, rseVar.f);
            default:
                return rseVar.n.a(wd6.c0(d, rseVar.e, rseVar.f));
        }
    }
}
