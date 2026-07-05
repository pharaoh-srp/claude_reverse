package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a60 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ g60 F;
    public final /* synthetic */ beh G;

    public /* synthetic */ a60(g60 g60Var, beh behVar, int i) {
        this.E = i;
        this.F = g60Var;
        this.G = behVar;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        int i2 = 13;
        beh behVar = this.G;
        g60 g60Var = this.F;
        switch (i) {
            case 0:
                z50 z50Var = g60Var.f;
                d7 d7Var = new d7(4, behVar);
                dae daeVar = new dae();
                g60Var.e.d("dataBuilder", z50Var, new k6(daeVar, i2, d7Var));
                Object obj = daeVar.E;
                if (obj != null) {
                    return (aeh) obj;
                }
                x44.o0("result");
                throw null;
            case 1:
                z50 z50Var2 = g60Var.g;
                a60 a60Var = new a60(g60Var, behVar, 2);
                dae daeVar2 = new dae();
                g60Var.e.d("positioner", z50Var2, new k6(daeVar2, i2, a60Var));
                Object obj2 = daeVar2.E;
                if (obj2 != null) {
                    return (l9e) obj2;
                }
                x44.o0("result");
                throw null;
            default:
                Object objA = g60Var.c.a();
                cu9 cu9Var = (cu9) (((cu9) objA).n() ? objA : null);
                return cu9Var == null ? l9e.e : behVar.m(cu9Var).m(cu9Var.K(0L));
        }
    }
}
