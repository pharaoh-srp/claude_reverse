package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class trh implements rz7 {
    public final /* synthetic */ h19 E;
    public final /* synthetic */ wrh F;
    public final /* synthetic */ boolean G;
    public final /* synthetic */ vue H;
    public final /* synthetic */ zy7 I;

    public trh(h19 h19Var, wrh wrhVar, boolean z, vue vueVar, zy7 zy7Var) {
        this.E = h19Var;
        this.F = wrhVar;
        this.G = z;
        this.H = vueVar;
        this.I = zy7Var;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ((Number) obj3).intValue();
        e18 e18Var = (e18) ((ld4) obj2);
        e18Var.a0(-1525724089);
        Object objN = e18Var.N();
        if (objN == jd4.a) {
            objN = vb7.f(e18Var);
        }
        zub zubVar = (zub) objN;
        iqb iqbVarB = d19.a(fqb.E, zubVar, this.E).B(new s6i(this.F, zubVar, null, this.G, this.H, this.I));
        e18Var.p(false);
        return iqbVarB;
    }
}
