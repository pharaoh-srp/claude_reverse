package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hi7 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public final /* synthetic */ ii7 G;
    public final /* synthetic */ int H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hi7(ii7 ii7Var, int i, tp4 tp4Var, int i2) {
        super(2, tp4Var);
        this.E = i2;
        this.G = ii7Var;
        this.H = i;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        int i2 = this.H;
        ii7 ii7Var = this.G;
        switch (i) {
            case 0:
                return new hi7(ii7Var, i2, tp4Var, 0);
            case 1:
                return new hi7(ii7Var, i2, tp4Var, 1);
            default:
                return new hi7(ii7Var, i2, tp4Var, 2);
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        l45 l45Var = (l45) obj;
        tp4 tp4Var = (tp4) obj2;
        switch (i) {
        }
        return ((hi7) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0147  */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 668
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hi7.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
