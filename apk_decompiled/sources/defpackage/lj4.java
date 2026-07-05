package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class lj4 implements lp7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ uj4 F;

    public /* synthetic */ lj4(uj4 uj4Var, int i) {
        this.E = i;
        this.F = uj4Var;
    }

    @Override // defpackage.lp7
    public final Object g(Object obj, tp4 tp4Var) {
        int i = this.E;
        iei ieiVar = iei.a;
        uj4 uj4Var = this.F;
        switch (i) {
            case 0:
                if (((di4) obj) == null) {
                    uj4Var.b.g.m(null);
                }
                break;
            default:
                uj4Var.g.m((String) obj);
                break;
        }
        return ieiVar;
    }
}
