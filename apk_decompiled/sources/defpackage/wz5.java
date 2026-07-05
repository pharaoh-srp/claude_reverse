package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wz5 extends jmg implements wlg {
    public final zy7 F;
    public final fdg G;
    public vz5 H = new vz5(ycg.j().g());

    public wz5(zy7 zy7Var, fdg fdgVar) {
        this.F = zy7Var;
        this.G = fdgVar;
    }

    @Override // defpackage.img
    public final kmg a() {
        return this.H;
    }

    @Override // defpackage.img
    public final void g(kmg kmgVar) {
        kmgVar.getClass();
        this.H = (vz5) kmgVar;
    }

    @Override // defpackage.wlg
    public final Object getValue() {
        bz7 bz7VarE = ycg.j().e();
        if (bz7VarE != null) {
            bz7VarE.invoke(this);
        }
        rcg rcgVarJ = ycg.j();
        return h((vz5) ycg.i(this.H, rcgVarJ), rcgVarJ, true, this.F).f;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.vz5 h(defpackage.vz5 r21, defpackage.rcg r22, boolean r23, defpackage.zy7 r24) {
        /*
            Method dump skipped, instruction units count: 411
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wz5.h(vz5, rcg, boolean, zy7):vz5");
    }

    public final vz5 i() {
        rcg rcgVarJ = ycg.j();
        return h((vz5) ycg.i(this.H, rcgVarJ), rcgVarJ, false, this.F);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DerivedState(value=");
        vz5 vz5Var = (vz5) ycg.h(this.H);
        sb.append(vz5Var.d(this, ycg.j()) ? String.valueOf(vz5Var.f) : "<Not calculated>");
        sb.append(")@");
        sb.append(hashCode());
        return sb.toString();
    }
}
