package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ay extends xzg implements sz7 {
    public int E;
    public /* synthetic */ qy F;
    public /* synthetic */ vq5 G;
    public /* synthetic */ Object H;
    public final /* synthetic */ ry I;
    public final /* synthetic */ float J;
    public final /* synthetic */ mb0 K;
    public final /* synthetic */ aae L;
    public final /* synthetic */ zn5 M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ay(ry ryVar, float f, mb0 mb0Var, aae aaeVar, zn5 zn5Var, tp4 tp4Var) {
        super(4, tp4Var);
        this.I = ryVar;
        this.J = f;
        this.K = mb0Var;
        this.L = aaeVar;
        this.M = zn5Var;
    }

    @Override // defpackage.sz7
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        aae aaeVar = this.L;
        zn5 zn5Var = this.M;
        ay ayVar = new ay(this.I, this.J, this.K, aaeVar, zn5Var, (tp4) obj4);
        ayVar.F = (qy) obj;
        ayVar.G = (vq5) obj2;
        ayVar.H = obj3;
        return ayVar.invokeSuspend(iei.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x009e, code lost:
    
        if (defpackage.mpk.n(r1, r5, false, r3, r16) == r15) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b2, code lost:
    
        if (defpackage.fy.b(r16.I, r13, r0, r3, r9, r16.K, r16) == r15) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c8, code lost:
    
        if (defpackage.fy.b(r16.I, r14, r0, r3, r9, r16.K, r16) == r15) goto L42;
     */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ay.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
