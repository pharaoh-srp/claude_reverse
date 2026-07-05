package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pfh implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ vfh F;

    public /* synthetic */ pfh(vfh vfhVar, int i) {
        this.E = i;
        this.F = vfhVar;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        ykh ykhVar = ykh.G;
        iei ieiVar = iei.a;
        tp4 tp4Var = null;
        vfh vfhVar = this.F;
        switch (i) {
            case 0:
                gb9.D(vfhVar.d1(), null, null, new tfh(vfhVar, tp4Var, 1), 3);
                break;
            case 1:
                vfhVar.g0 = (sbj) yb5.o(vfhVar, ve4.v);
                vfhVar.W.d = vfhVar.v1();
                if (vfhVar.v1() && vfhVar.h0 == null) {
                    vfhVar.h0 = gb9.D(vfhVar.d1(), null, null, new fj(vfhVar, tp4Var, 24), 3);
                } else if (!vfhVar.v1()) {
                    fkg fkgVar = vfhVar.h0;
                    if (fkgVar != null) {
                        fkgVar.d(null);
                    }
                    vfhVar.h0 = null;
                }
                return ieiVar;
            case 2:
                yfd.T(vfhVar);
                return ieiVar;
            case 3:
                return e6e.a(vfhVar);
            case 4:
                return e6e.a(vfhVar) != null ? nfh.b : nfh.a;
            case 5:
                gb9.D(vfhVar.d1(), null, null, new tfh(vfhVar, tp4Var, 2), 3);
                break;
            case 6:
                if (vfhVar.v1()) {
                    ((fx5) vfhVar.w1()).b();
                } else {
                    pt7 pt7Var = vfhVar.c0;
                    if (pt7Var.R) {
                        pt7Var.Z.w1(7);
                    }
                }
                return Boolean.TRUE;
            case 7:
                if (!vfhVar.v1()) {
                    pt7 pt7Var2 = vfhVar.c0;
                    if (pt7Var2.R) {
                        pt7Var2.Z.w1(7);
                    }
                }
                vfhVar.W.E(ykhVar);
                break;
            case 8:
                gb9.D(vfhVar.d1(), null, null, new tfh(vfhVar, tp4Var, 0), 3);
                break;
            default:
                vfhVar.W.E(ykhVar);
                return ieiVar;
        }
        return Boolean.TRUE;
    }
}
