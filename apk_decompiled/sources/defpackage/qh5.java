package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qh5 extends xzg implements bz7 {
    public final /* synthetic */ int E = 0;
    public int F;
    public final /* synthetic */ boolean G;
    public Object H;
    public final /* synthetic */ Object I;
    public final /* synthetic */ Object J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qh5(kq4 kq4Var, String str, bj5 bj5Var, boolean z, tp4 tp4Var) {
        super(1, tp4Var);
        this.H = kq4Var;
        this.I = str;
        this.J = bj5Var;
        this.G = z;
    }

    @Override // defpackage.vd1
    public final tp4 create(tp4 tp4Var) {
        int i = this.E;
        Object obj = this.J;
        Object obj2 = this.I;
        switch (i) {
            case 0:
                return new qh5((bi5) obj2, (rh5) obj, this.G, tp4Var);
            default:
                return new qh5((kq4) this.H, (String) obj2, (bj5) obj, this.G, tp4Var);
        }
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        tp4 tp4Var = (tp4) obj;
        switch (i) {
        }
        return ((qh5) create(tp4Var)).invokeSuspend(ieiVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0075, code lost:
    
        if (r0.b(r14, r13) == r5) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0090, code lost:
    
        if (r13 == r5) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0078  */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qh5.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qh5(bi5 bi5Var, rh5 rh5Var, boolean z, tp4 tp4Var) {
        super(1, tp4Var);
        this.I = bi5Var;
        this.J = rh5Var;
        this.G = z;
    }
}
