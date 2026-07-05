package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ugf implements rz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ h19 F;
    public final /* synthetic */ boolean G;
    public final /* synthetic */ boolean H;
    public final /* synthetic */ vue I;
    public final /* synthetic */ qz7 J;

    public /* synthetic */ ugf(h19 h19Var, boolean z, boolean z2, vue vueVar, qz7 qz7Var, int i) {
        this.E = i;
        this.F = h19Var;
        this.G = z;
        this.H = z2;
        this.I = vueVar;
        this.J = qz7Var;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.E;
        qz7 qz7Var = this.J;
        h19 h19Var = this.F;
        fqb fqbVar = fqb.E;
        lz1 lz1Var = jd4.a;
        switch (i) {
            case 0:
                ((Number) obj3).intValue();
                e18 e18Var = (e18) ((ld4) obj2);
                e18Var.a0(-1525724089);
                Object objN = e18Var.N();
                if (objN == lz1Var) {
                    objN = vb7.f(e18Var);
                }
                zub zubVar = (zub) objN;
                iqb iqbVarB = d19.a(fqbVar, zubVar, h19Var).B(new sgf(this.G, zubVar, null, false, this.H, this.I, (zy7) qz7Var));
                e18Var.p(false);
                return iqbVarB;
            default:
                ((Number) obj3).intValue();
                e18 e18Var2 = (e18) ((ld4) obj2);
                e18Var2.a0(-1525724089);
                Object objN2 = e18Var2.N();
                if (objN2 == lz1Var) {
                    objN2 = vb7.f(e18Var2);
                }
                zub zubVar2 = (zub) objN2;
                iqb iqbVarB2 = d19.a(fqbVar, zubVar2, h19Var).B(new srh(this.G, zubVar2, null, false, this.H, this.I, (bz7) qz7Var));
                e18Var2.p(false);
                return iqbVarB2;
        }
    }
}
