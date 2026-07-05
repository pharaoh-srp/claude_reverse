package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class b29 {
    public final wwb a = new wwb(0, new z19[16]);
    public final lsc b = mpk.P(Boolean.FALSE);
    public long c = Long.MIN_VALUE;
    public final lsc d = mpk.P(Boolean.TRUE);

    public final void a(int i, ld4 ld4Var) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-318043801);
        int i2 = (e18Var.h(this) ? 4 : 2) | i;
        if (e18Var.Q(i2 & 1, (i2 & 3) != 2)) {
            Object objN = e18Var.N();
            tp4 tp4Var = null;
            lz1 lz1Var = jd4.a;
            if (objN == lz1Var) {
                objN = mpk.P(null);
                e18Var.k0(objN);
            }
            nwb nwbVar = (nwb) objN;
            if (((Boolean) this.d.getValue()).booleanValue() || ((Boolean) this.b.getValue()).booleanValue()) {
                e18Var.a0(-144841960);
                boolean zH = e18Var.h(this);
                Object objN2 = e18Var.N();
                if (zH || objN2 == lz1Var) {
                    objN2 = new zw(nwbVar, this, tp4Var, 16);
                    e18Var.k0(objN2);
                }
                fd9.i(e18Var, (pz7) objN2, this);
                e18Var.p(false);
            } else {
                e18Var.a0(-143455237);
                e18Var.p(false);
            }
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new a21(this, i, 12);
        }
    }
}
