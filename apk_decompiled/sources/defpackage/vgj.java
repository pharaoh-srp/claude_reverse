package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class vgj implements kp7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ qr7 F;

    public /* synthetic */ vgj(qr7 qr7Var, int i) {
        this.E = i;
        this.F = qr7Var;
    }

    @Override // defpackage.kp7
    public final Object a(lp7 lp7Var, tp4 tp4Var) {
        int i = this.E;
        iei ieiVar = iei.a;
        m45 m45Var = m45.E;
        qr7 qr7Var = this.F;
        switch (i) {
            case 0:
                Object objA = qr7Var.a(new y01(lp7Var, 15), tp4Var);
                return objA == m45Var ? objA : ieiVar;
            default:
                Object objA2 = qr7Var.a(new y01(lp7Var, 16), tp4Var);
                return objA2 == m45Var ? objA2 : ieiVar;
        }
    }
}
