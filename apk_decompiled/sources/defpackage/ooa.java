package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ooa extends xzg implements pz7 {
    public jj E;
    public of0 F;
    public int G;
    public final /* synthetic */ poa H;
    public final /* synthetic */ String I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ooa(poa poaVar, String str, tp4 tp4Var) {
        super(2, tp4Var);
        this.H = poaVar;
        this.I = str;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        return new ooa(this.H, this.I, tp4Var);
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        return ((ooa) create((l45) obj, (tp4) obj2)).invokeSuspend(iei.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x009d, code lost:
    
        if (r1.b(r22, defpackage.qoa.a) == r12) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x010d A[PHI: r1 r4
      0x010d: PHI (r1v11 jj) = (r1v10 jj), (r1v29 jj) binds: [B:35:0x0109, B:12:0x002c] A[DONT_GENERATE, DONT_INLINE]
      0x010d: PHI (r4v3 java.lang.Object) = (r4v2 java.lang.Object), (r4v8 java.lang.Object) binds: [B:35:0x0109, B:12:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01e7  */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 790
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ooa.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
