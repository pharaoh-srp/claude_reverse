package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class l9j extends xzg implements pz7 {
    public of0 E;
    public int F;
    public int G;
    public final /* synthetic */ m9j H;
    public final /* synthetic */ String I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l9j(m9j m9jVar, String str, tp4 tp4Var) {
        super(2, tp4Var);
        this.H = m9jVar;
        this.I = str;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        return new l9j(this.H, this.I, tp4Var);
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        return ((l9j) create((l45) obj, (tp4) obj2)).invokeSuspend(iei.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x006c, code lost:
    
        if (r1.b(r18, defpackage.p9j.a) == r6) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d5, code lost:
    
        if (r3.b(r18, r8) == r6) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d9, code lost:
    
        r0 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00fd, code lost:
    
        if (r3.b(r18, r8) == r6) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x017a, code lost:
    
        if (r8.b(r18, r9) == r6) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0185  */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 470
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l9j.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
