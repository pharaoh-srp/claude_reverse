package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class o43 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public final /* synthetic */ lf9 G;
    public final /* synthetic */ t53 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o43(lf9 lf9Var, t53 t53Var, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = lf9Var;
        this.H = t53Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        t53 t53Var = this.H;
        lf9 lf9Var = this.G;
        switch (i) {
            case 0:
                return new o43(lf9Var, t53Var, tp4Var, 0);
            case 1:
                return new o43(lf9Var, t53Var, tp4Var, 1);
            default:
                return new o43(lf9Var, t53Var, tp4Var, 2);
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        l45 l45Var = (l45) obj;
        tp4 tp4Var = (tp4) obj2;
        switch (i) {
        }
        return ((o43) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x003c, code lost:
    
        if (r14 == r6) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b2, code lost:
    
        if (r14 == r6) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0148, code lost:
    
        if (r14 == r6) goto L99;
     */
    /* JADX WARN: Removed duplicated region for block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004b A[PHI: r14
      0x004b: PHI (r14v26 java.lang.Object) = (r14v23 java.lang.Object), (r14v0 java.lang.Object) binds: [B:21:0x0048, B:12:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00cc A[Catch: all -> 0x009c, TryCatch #0 {all -> 0x009c, blocks: (B:44:0x0098, B:63:0x00da, B:47:0x009f, B:60:0x00cc, B:57:0x00c1), top: B:101:0x0083 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00da A[Catch: all -> 0x009c, PHI: r14
      0x00da: PHI (r14v17 java.lang.Object) = (r14v16 java.lang.Object), (r14v0 java.lang.Object) binds: [B:61:0x00d7, B:44:0x0098] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {all -> 0x009c, blocks: (B:44:0x0098, B:63:0x00da, B:47:0x009f, B:60:0x00cc, B:57:0x00c1), top: B:101:0x0083 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0165  */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o43.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
