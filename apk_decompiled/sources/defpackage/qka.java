package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class qka implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ zeh F;

    public /* synthetic */ qka(zeh zehVar, int i) {
        this.E = i;
        this.F = zehVar;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        zeh zehVar = this.F;
        switch (i) {
            case 0:
                zehVar.a(((fcc) obj).a, unb.M);
                break;
            case 1:
                z7d z7dVar = (z7d) obj;
                zehVar.e(hvj.r(z7dVar, false));
                z7dVar.a();
                break;
            default:
                z7d z7dVar2 = (z7d) obj;
                zehVar.e(hvj.p(z7dVar2));
                z7dVar2.a();
                break;
        }
        return ieiVar;
    }
}
