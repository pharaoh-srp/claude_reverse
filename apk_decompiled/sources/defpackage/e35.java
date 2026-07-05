package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e35 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ g35 F;

    public /* synthetic */ e35(g35 g35Var, int i) {
        this.E = i;
        this.F = g35Var;
    }

    @Override // defpackage.zy7
    public final Object a() {
        beg begVar;
        int i = this.E;
        g35 g35Var = this.F;
        switch (i) {
            case 0:
                g35Var.b0.m(true);
                break;
            case 1:
                g35Var.b0.i(true);
                break;
            case 2:
                g35Var.b0.k();
                break;
            case 3:
                yfd.T(g35Var);
                break;
            case 4:
                g35Var.b0.v();
                break;
            case 5:
                g35Var.W.w.F.r.b(g35Var.c0.e);
                break;
            default:
                m2a m2aVar = g35Var.W;
                bt7 bt7Var = g35Var.d0;
                boolean z = g35Var.X;
                if (!m2aVar.b()) {
                    bt7.a(bt7Var);
                } else if (!z && (begVar = m2aVar.c) != null) {
                    ((fx5) begVar).b();
                }
                break;
        }
        return Boolean.TRUE;
    }
}
