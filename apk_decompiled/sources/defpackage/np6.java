package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class np6 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public rp6 F;
    public int G;
    public /* synthetic */ Object H;
    public final /* synthetic */ rp6 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ np6(rp6 rp6Var, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.I = rp6Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        rp6 rp6Var = this.I;
        switch (i) {
            case 0:
                np6 np6Var = new np6(rp6Var, tp4Var, 0);
                np6Var.H = obj;
                return np6Var;
            default:
                np6 np6Var2 = new np6(rp6Var, tp4Var, 1);
                np6Var2.H = obj;
                return np6Var2;
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                return ((np6) create((t45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            default:
                return ((np6) create((String) obj, (tp4) obj2)).invokeSuspend(ieiVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00bb, code lost:
    
        if (r11 == r3) goto L35;
     */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.np6.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
