package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class n3g extends ts9 implements rz7 {
    public final /* synthetic */ int F;
    public final /* synthetic */ Object G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n3g(int i, Object obj) {
        super(3);
        this.F = i;
        this.G = obj;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.F;
        Object obj4 = this.G;
        switch (i) {
            case 0:
                mma mmaVar = (mma) obj;
                ((Number) obj3).intValue();
                e18 e18Var = (e18) ((ld4) obj2);
                Object objN = e18Var.N();
                lz1 lz1Var = jd4.a;
                if (objN == lz1Var) {
                    objN = fd9.O(im6.E, e18Var);
                    e18Var.k0(objN);
                }
                l45 l45Var = (l45) objN;
                Object objN2 = e18Var.N();
                if (objN2 == lz1Var) {
                    objN2 = new k3g(mmaVar, l45Var);
                    e18Var.k0(objN2);
                }
                k3g k3gVar = (k3g) objN2;
                ((ta4) obj4).i(k3gVar, new p3g(k3gVar), e18Var, 6);
                return iei.a;
            default:
                c3d c3dVarU = ((h5b) obj2).u(((rl4) obj3).a);
                return ((q5b) obj).U(c3dVarU.E, c3dVarU.F, nm6.E, new j40(c3dVarU, 3, (po4) obj4));
        }
    }
}
