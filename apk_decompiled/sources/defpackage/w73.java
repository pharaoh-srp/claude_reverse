package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class w73 extends xzg implements bz7 {
    public final /* synthetic */ int E;
    public int F;
    public final /* synthetic */ Object G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w73(Object obj, tp4 tp4Var, int i) {
        super(1, tp4Var);
        this.E = i;
        this.G = obj;
    }

    @Override // defpackage.vd1
    public final tp4 create(tp4 tp4Var) {
        int i = this.E;
        Object obj = this.G;
        switch (i) {
            case 0:
                return new w73((t53) obj, tp4Var, 0);
            case 1:
                return new w73((b78) obj, tp4Var, 1);
            case 2:
                return new w73((g78) obj, tp4Var, 2);
            case 3:
                return new w73((kfh) obj, tp4Var, 3);
            default:
                return new w73((q0i) obj, tp4Var, 4);
        }
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        tp4 tp4Var = (tp4) obj;
        switch (i) {
        }
        return ((w73) create(tp4Var)).invokeSuspend(ieiVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x011a, code lost:
    
        if (r9 == r4) goto L55;
     */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w73.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
