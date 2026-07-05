package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k0 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ u0 F;

    public /* synthetic */ k0(u0 u0Var, int i) {
        this.E = i;
        this.F = u0Var;
    }

    @Override // defpackage.zy7
    public final Object a() {
        nw5 nw5Var;
        int i = this.E;
        u0 u0Var = this.F;
        switch (i) {
            case 0:
                h19 h19Var = (h19) yb5.o(u0Var, d19.a);
                if (h19Var == null) {
                    e39.a("clickable only supports IndicationNodeFactory instances provided to LocalIndication, but Indication was provided instead. Either migrate the Indication implementation to implement IndicationNodeFactory, or use the other clickable overload that takes an Indication parameter, and explicitly pass LocalIndication.current there. The Indication instance provided here was: " + h19Var);
                }
                h19 h19Var2 = u0Var.c0;
                u0Var.c0 = h19Var;
                if (h19Var2 != null && !x44.r(h19Var, h19Var2) && ((nw5Var = u0Var.e0) != null || !u0Var.l0)) {
                    if (nw5Var != null) {
                        u0Var.q1(nw5Var);
                    }
                    u0Var.e0 = null;
                    u0Var.z1();
                }
                return iei.a;
            default:
                u0Var.a0.a();
                return Boolean.TRUE;
        }
    }
}
