package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class w64 extends xzg implements pz7 {
    public Object[] E;
    public gh2 F;
    public byte[] G;
    public int H;
    public int I;
    public int J;
    public int K;
    public /* synthetic */ Object L;
    public final /* synthetic */ kp7[] M;
    public final /* synthetic */ zy7 N;
    public final /* synthetic */ rz7 O;
    public final /* synthetic */ lp7 P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w64(tp4 tp4Var, lp7 lp7Var, zy7 zy7Var, rz7 rz7Var, kp7[] kp7VarArr) {
        super(2, tp4Var);
        this.M = kp7VarArr;
        this.N = zy7Var;
        this.O = rz7Var;
        this.P = lp7Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        w64 w64Var = new w64(tp4Var, this.P, this.N, this.O, this.M);
        w64Var.L = obj;
        return w64Var;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        return ((w64) create((l45) obj, (tp4) obj2)).invokeSuspend(iei.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0133, code lost:
    
        if (r15.invoke(r14, r7, r19) == r9) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ce A[LOOP:0: B:29:0x00ce->B:37:0x00ef, LOOP_START, PHI: r2 r14
      0x00ce: PHI (r2v4 int) = (r2v3 int), (r2v5 int) binds: [B:26:0x00c9, B:37:0x00ef] A[DONT_GENERATE, DONT_INLINE]
      0x00ce: PHI (r14v6 b19) = (r14v5 b19), (r14v10 b19) binds: [B:26:0x00c9, B:37:0x00ef] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x0133 -> B:8:0x002e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x0138 -> B:44:0x0118). Please report as a decompilation issue!!! */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w64.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
