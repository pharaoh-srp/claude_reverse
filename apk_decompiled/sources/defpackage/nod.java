package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class nod implements pz7 {
    public final /* synthetic */ int E = 0;
    public final /* synthetic */ zy7 F;
    public final /* synthetic */ lod G;

    public /* synthetic */ nod(zy7 zy7Var, lod lodVar) {
        this.F = zy7Var;
        this.G = lodVar;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        lod lodVar = this.G;
        zy7 zy7Var = this.F;
        ld4 ld4Var = (ld4) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    boolean zF = e18Var.f(lodVar) | e18Var.f(zy7Var);
                    Object objN = e18Var.N();
                    if (zF || objN == jd4.a) {
                        objN = new aac(lodVar, 12, zy7Var);
                        e18Var.k0(objN);
                    }
                    dgj.b((zy7) objN, null, null, MTTypesetterKt.kLineSkipLimitMultiplier, e18Var, 0, 14);
                }
                break;
            default:
                e18 e18Var2 = (e18) ld4Var;
                if (!e18Var2.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var2.T();
                } else {
                    qik.k(zy7Var, null, lodVar, e18Var2, 0);
                }
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ nod(lod lodVar, zy7 zy7Var) {
        this.G = lodVar;
        this.F = zy7Var;
    }
}
