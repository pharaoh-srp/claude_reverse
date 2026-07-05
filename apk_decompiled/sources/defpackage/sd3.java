package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class sd3 extends vp4 {
    public String E;
    public nf0 F;
    public nf0 G;
    public boolean H;
    public /* synthetic */ Object I;
    public final /* synthetic */ vd3 J;
    public int K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sd3(vd3 vd3Var, vp4 vp4Var) {
        super(vp4Var);
        this.J = vd3Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.I = obj;
        this.K |= Integer.MIN_VALUE;
        return this.J.u(this, null, false);
    }
}
