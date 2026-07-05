package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class sc6 extends xzg implements pz7 {
    public final /* synthetic */ int E = 0;
    public dae F;
    public dae G;
    public int H;
    public /* synthetic */ Object I;
    public final /* synthetic */ tc6 J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sc6(dae daeVar, tc6 tc6Var, tp4 tp4Var) {
        super(2, tp4Var);
        this.G = daeVar;
        this.J = tc6Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        tc6 tc6Var = this.J;
        switch (i) {
            case 0:
                sc6 sc6Var = new sc6(this.G, tc6Var, tp4Var);
                sc6Var.I = obj;
                return sc6Var;
            default:
                sc6 sc6Var2 = new sc6(tc6Var, tp4Var);
                sc6Var2.I = obj;
                return sc6Var2;
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                return ((sc6) create((bz7) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            default:
                return ((sc6) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00e7, code lost:
    
        if (defpackage.tc6.s1(r5, r8) != r4) goto L12;
     */
    /* JADX WARN: Path cross not found for [B:45:0x00ca, B:41:0x00b8], limit reached: 87 */
    /* JADX WARN: Path cross not found for [B:47:0x00ce, B:20:0x005e], limit reached: 87 */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003a A[PHI: r0 r3
      0x003a: PHI (r0v13 dae) = (r0v5 dae), (r0v17 dae) binds: [B:14:0x0037, B:37:0x00af] A[DONT_GENERATE, DONT_INLINE]
      0x003a: PHI (r3v15 l45) = (r3v13 l45), (r3v16 l45) binds: [B:14:0x0037, B:37:0x00af] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005e A[PHI: r7
      0x005e: PHI (r7v14 l45) = (r7v7 l45), (r7v10 l45), (r7v10 l45), (r7v10 l45), (r7v12 l45), (r7v15 l45) binds: [B:19:0x0056, B:46:0x00cc, B:48:0x00d9, B:42:0x00c5, B:31:0x0089, B:12:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b8 A[Catch: CancellationException -> 0x00c8, TryCatch #2 {CancellationException -> 0x00c8, blocks: (B:39:0x00b2, B:41:0x00b8, B:45:0x00ca, B:47:0x00ce), top: B:85:0x00b2 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ca A[Catch: CancellationException -> 0x00c8, TryCatch #2 {CancellationException -> 0x00c8, blocks: (B:39:0x00b2, B:41:0x00b8, B:45:0x00ca, B:47:0x00ce), top: B:85:0x00b2 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0089 -> B:20:0x005e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00c5 -> B:20:0x005e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00cc -> B:20:0x005e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x00d9 -> B:20:0x005e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x00e7 -> B:12:0x002f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:75:0x0133 -> B:76:0x0134). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:77:0x0137 -> B:78:0x0139). Please report as a decompilation issue!!! */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sc6.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sc6(tc6 tc6Var, tp4 tp4Var) {
        super(2, tp4Var);
        this.J = tc6Var;
    }
}
