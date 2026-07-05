package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class vu1 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ v4g F;
    public final /* synthetic */ l45 G;
    public final /* synthetic */ zy7 H;

    public /* synthetic */ vu1(l45 l45Var, zy7 zy7Var, v4g v4gVar) {
        this.E = 0;
        this.F = v4gVar;
        this.H = zy7Var;
        this.G = l45Var;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        b5g b5gVar = b5g.E;
        tp4 tp4Var = null;
        iei ieiVar = iei.a;
        zy7 zy7Var = this.H;
        l45 l45Var = this.G;
        v4g v4gVar = this.F;
        switch (i) {
            case 0:
                int iOrdinal = v4gVar.c().ordinal();
                if (iOrdinal == 1) {
                    zy7Var.a();
                } else if (iOrdinal == 2) {
                    gb9.D(l45Var, null, null, new my0(v4gVar, tp4Var, 4), 3);
                } else {
                    gb9.D(l45Var, null, null, new my0(v4gVar, tp4Var, 5), 3);
                }
                break;
            case 1:
                if (((Boolean) v4gVar.c.invoke(b5gVar)).booleanValue()) {
                    gb9.D(l45Var, null, null, new my0(v4gVar, tp4Var, 8), 3).D0(new xu1(v4gVar, zy7Var, 1));
                }
                break;
            case 2:
                if (((Boolean) v4gVar.c.invoke(b5gVar)).booleanValue()) {
                    gb9.D(l45Var, null, null, new my0(v4gVar, tp4Var, 10), 3).D0(new xu1(v4gVar, zy7Var, 2));
                }
                break;
            case 3:
                if (v4gVar.c() == b5g.F && v4gVar.d()) {
                    gb9.D(l45Var, null, null, new my0(v4gVar, tp4Var, 11), 3);
                } else {
                    gb9.D(l45Var, null, null, new my0(v4gVar, tp4Var, 12), 3).D0(new kw0(12, zy7Var));
                }
                break;
            default:
                x44.n(l45Var, zy7Var, v4gVar);
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ vu1(v4g v4gVar, l45 l45Var, zy7 zy7Var, int i) {
        this.E = i;
        this.F = v4gVar;
        this.G = l45Var;
        this.H = zy7Var;
    }
}
