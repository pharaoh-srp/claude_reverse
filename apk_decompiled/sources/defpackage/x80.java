package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class x80 extends ts9 implements pz7 {
    public final /* synthetic */ a6i F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ bz7 H;
    public final /* synthetic */ i90 I;
    public final /* synthetic */ kdg J;
    public final /* synthetic */ ta4 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x80(a6i a6iVar, Object obj, bz7 bz7Var, i90 i90Var, kdg kdgVar, ta4 ta4Var) {
        super(2);
        this.F = a6iVar;
        this.G = obj;
        this.H = bz7Var;
        this.I = i90Var;
        this.J = kdgVar;
        this.K = ta4Var;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        ld4 ld4Var = (ld4) obj;
        int iIntValue = ((Number) obj2).intValue();
        int i = 1;
        e18 e18Var = (e18) ld4Var;
        if (e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
            Object objN = e18Var.N();
            bz7 bz7Var = this.H;
            i90 i90Var = this.I;
            lz1 lz1Var = jd4.a;
            if (objN == lz1Var) {
                objN = (po4) bz7Var.invoke(i90Var);
                e18Var.k0(objN);
            }
            po4 po4Var = (po4) objN;
            a6i a6iVar = this.F;
            t5i t5iVarF = a6iVar.f();
            lsc lscVar = a6iVar.d;
            Object objC = t5iVarF.c();
            Object obj3 = this.G;
            boolean zG = e18Var.g(x44.r(objC, obj3));
            Object objN2 = e18Var.N();
            if (zG || objN2 == lz1Var) {
                objN2 = x44.r(a6iVar.f().c(), obj3) ? d77.b : ((po4) bz7Var.invoke(i90Var)).b;
                e18Var.k0(objN2);
            }
            d77 d77Var = (d77) objN2;
            Object objN3 = e18Var.N();
            if (objN3 == lz1Var) {
                objN3 = new d90(x44.r(obj3, lscVar.getValue()));
                e18Var.k0(objN3);
            }
            d90 d90Var = (d90) objN3;
            wp6 wp6Var = po4Var.a;
            boolean zH = e18Var.h(po4Var);
            Object objN4 = e18Var.N();
            if (zH || objN4 == lz1Var) {
                objN4 = new n3g(i, po4Var);
                e18Var.k0(objN4);
            }
            iqb iqbVarH0 = fd9.h0(fqb.E, (rz7) objN4);
            d90Var.E.setValue(Boolean.valueOf(x44.r(obj3, lscVar.getValue())));
            iqb iqbVarB = iqbVarH0.B(d90Var);
            boolean zH2 = e18Var.h(obj3);
            Object objN5 = e18Var.N();
            if (zH2 || objN5 == lz1Var) {
                objN5 = new e0(6, obj3);
                e18Var.k0(objN5);
            }
            bz7 bz7Var2 = (bz7) objN5;
            boolean zF = e18Var.f(d77Var);
            Object objN6 = e18Var.N();
            if (zF || objN6 == lz1Var) {
                objN6 = new z0(i, d77Var);
                e18Var.k0(objN6);
            }
            wd6.G(a6iVar, bz7Var2, iqbVarB, wp6Var, d77Var, (pz7) objN6, fd9.q0(-143346359, new w80(this.J, obj3, i90Var, this.K), e18Var), e18Var, 12582912);
        } else {
            e18Var.T();
        }
        return iei.a;
    }
}
