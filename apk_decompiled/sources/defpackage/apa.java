package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class apa extends xzg implements pz7 {
    public jj E;
    public of0 F;
    public int G;
    public final /* synthetic */ bpa H;
    public final /* synthetic */ String I;
    public final /* synthetic */ String J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public apa(bpa bpaVar, String str, String str2, tp4 tp4Var) {
        super(2, tp4Var);
        this.H = bpaVar;
        this.I = str;
        this.J = str2;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        return new apa(this.H, this.I, this.J, tp4Var);
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        return ((apa) create((l45) obj, (tp4) obj2)).invokeSuspend(iei.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ef A[PHI: r1 r5
      0x00ef: PHI (r1v9 jj) = (r1v8 jj), (r1v23 jj) binds: [B:34:0x00eb, B:12:0x002c] A[DONT_GENERATE, DONT_INLINE]
      0x00ef: PHI (r5v3 java.lang.Object) = (r5v2 java.lang.Object), (r5v9 java.lang.Object) binds: [B:34:0x00eb, B:12:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01c9  */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 526
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.apa.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
