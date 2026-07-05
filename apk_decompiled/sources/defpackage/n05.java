package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class n05 extends xzg implements pz7 {
    public of0 E;
    public p05 F;
    public String G;
    public int H;
    public int I;
    public final /* synthetic */ boolean J;
    public final /* synthetic */ p05 K;
    public final /* synthetic */ String L;
    public final /* synthetic */ int M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n05(boolean z, p05 p05Var, String str, int i, tp4 tp4Var) {
        super(2, tp4Var);
        this.J = z;
        this.K = p05Var;
        this.L = str;
        this.M = i;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        return new n05(this.J, this.K, this.L, this.M, tp4Var);
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        return ((n05) create((l45) obj, (tp4) obj2)).invokeSuspend(iei.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0041, code lost:
    
        if (r11 == r9) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0051, code lost:
    
        if (r11 == r9) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bf  */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n05.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
