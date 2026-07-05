package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class qra implements zy7 {
    public final /* synthetic */ int E = 1;
    public final /* synthetic */ int F;
    public final /* synthetic */ koc G;
    public final /* synthetic */ l45 H;
    public final /* synthetic */ Object I;
    public final /* synthetic */ Object J;

    public /* synthetic */ qra(int i, koc kocVar, pz7 pz7Var, dhg dhgVar, l45 l45Var) {
        this.F = i;
        this.G = kocVar;
        this.I = pz7Var;
        this.J = dhgVar;
        this.H = l45Var;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        iei ieiVar = iei.a;
        l45 l45Var = this.H;
        Object obj = this.J;
        Object obj2 = this.I;
        koc kocVar = this.G;
        int i2 = this.F;
        switch (i) {
            case 0:
                mra mraVar = (mra) obj2;
                mraVar.b.i(i2);
                mraVar.c.setValue(Boolean.FALSE);
                gb9.D(l45Var, null, null, new o41((x0a) obj, i2, kocVar, null), 3);
                break;
            default:
                pz7 pz7Var = (pz7) obj2;
                dhg dhgVar = (dhg) obj;
                if (i2 != ((isc) kocVar.d.G).h()) {
                    gb9.D(l45Var, null, null, new rra(kocVar, i2, null, 3), 3);
                } else {
                    pz7Var.invoke(dhgVar, Float.valueOf(1.0f));
                }
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ qra(mra mraVar, int i, l45 l45Var, x0a x0aVar, koc kocVar) {
        this.I = mraVar;
        this.F = i;
        this.H = l45Var;
        this.J = x0aVar;
        this.G = kocVar;
    }
}
