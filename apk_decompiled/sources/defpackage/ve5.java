package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ve5 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public x4i F;
    public int G;
    public /* synthetic */ Object H;
    public final /* synthetic */ boolean I;
    public final /* synthetic */ boolean J;
    public final /* synthetic */ cve K;
    public final /* synthetic */ bz7 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ve5(boolean z, boolean z2, cve cveVar, tp4 tp4Var, bz7 bz7Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.I = z;
        this.J = z2;
        this.K = cveVar;
        this.L = bz7Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        switch (this.E) {
            case 0:
                ve5 ve5Var = new ve5(this.I, this.J, this.K, tp4Var, this.L, 0);
                ve5Var.H = obj;
                return ve5Var;
            default:
                ve5 ve5Var2 = new ve5(this.I, this.J, this.K, tp4Var, this.L, 1);
                ve5Var2.H = obj;
                return ve5Var2;
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        y4i y4iVar = (y4i) obj;
        tp4 tp4Var = (tp4) obj2;
        switch (i) {
        }
        return ((ve5) create(y4iVar, tp4Var)).invokeSuspend(ieiVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ve5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
