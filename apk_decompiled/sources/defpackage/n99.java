package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class n99 extends xzg implements pz7 {
    public l9e E;
    public long F;
    public int G;
    public final /* synthetic */ a80 H;
    public final /* synthetic */ a80 I;
    public final /* synthetic */ nwb J;
    public final /* synthetic */ nwb K;
    public final /* synthetic */ nwb L;
    public final /* synthetic */ fu9 M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n99(a80 a80Var, a80 a80Var2, nwb nwbVar, nwb nwbVar2, nwb nwbVar3, fu9 fu9Var, tp4 tp4Var) {
        super(2, tp4Var);
        this.H = a80Var;
        this.I = a80Var2;
        this.J = nwbVar;
        this.K = nwbVar2;
        this.L = nwbVar3;
        this.M = fu9Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        return new n99(this.H, this.I, this.J, this.K, this.L, this.M, tp4Var);
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        return ((n99) create((l45) obj, (tp4) obj2)).invokeSuspend(iei.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00f0, code lost:
    
        if (r4.g(r19, r7) == r11) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0116  */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n99.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
