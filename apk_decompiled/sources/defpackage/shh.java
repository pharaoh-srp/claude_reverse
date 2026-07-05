package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class shh extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public final /* synthetic */ zhh G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ shh(zhh zhhVar, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = zhhVar;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        zhh zhhVar = this.G;
        switch (i) {
            case 0:
                shh shhVar = new shh(zhhVar, tp4Var, 0);
                long j = ((fcc) obj).a;
                return shhVar;
            case 1:
                return new shh(zhhVar, tp4Var, 1);
            case 2:
                return new shh(zhhVar, tp4Var, 2);
            default:
                return new shh(zhhVar, tp4Var, 3);
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                long j = ((fcc) obj).a;
                break;
        }
        return ((shh) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:181:0x0348, code lost:
    
        if (r0 == r9) goto L182;
     */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r44) {
        /*
            Method dump skipped, instruction units count: 1200
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.shh.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
