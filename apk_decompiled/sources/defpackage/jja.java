package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class jja extends xzg implements pz7 {
    public float E;
    public float F;
    public float G;
    public int H;
    public int I;
    public final /* synthetic */ kja J;
    public final /* synthetic */ a80 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jja(kja kjaVar, a80 a80Var, tp4 tp4Var) {
        super(2, tp4Var);
        this.J = kjaVar;
        this.K = a80Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        return new jja(this.J, this.K, tp4Var);
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        ((jja) create((l45) obj, (tp4) obj2)).invokeSuspend(iei.a);
        return m45.E;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ec  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00ec -> B:32:0x00f0). Please report as a decompilation issue!!! */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jja.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
