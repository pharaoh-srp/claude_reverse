package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class qfh implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ vfh F;

    public /* synthetic */ qfh(vfh vfhVar, int i) {
        this.E = i;
        this.F = vfhVar;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        iei ieiVar = iei.a;
        vfh vfhVar = this.F;
        switch (i) {
            case 0:
                yfd.T(vfhVar);
                return ieiVar;
            case 1:
                return Boolean.valueOf(vfhVar.s1(vfhVar.Y.b()));
            case 2:
                return vfhVar.U.a.d().G.toString();
            default:
                if (vfhVar.k0 != null) {
                    ((fx5) vfhVar.w1()).b();
                } else {
                    vfhVar.x1(true);
                }
                return ieiVar;
        }
    }
}
