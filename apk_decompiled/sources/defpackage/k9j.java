package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class k9j extends xzg implements pz7 {
    public of0 E;
    public int F;
    public int G;
    public final /* synthetic */ m9j H;
    public final /* synthetic */ String I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k9j(m9j m9jVar, String str, tp4 tp4Var) {
        super(2, tp4Var);
        this.H = m9jVar;
        this.I = str;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        return new k9j(this.H, this.I, tp4Var);
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        return ((k9j) create((l45) obj, (tp4) obj2)).invokeSuspend(iei.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0081, code lost:
    
        if (r3.b(r25, defpackage.p9j.a) == r14) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00de, code lost:
    
        if (r3.b(r25, r1) == r14) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e2, code lost:
    
        r0 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0161, code lost:
    
        if (r3.b(r25, r9) == r14) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x016e  */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            Method dump skipped, instruction units count: 423
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k9j.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
