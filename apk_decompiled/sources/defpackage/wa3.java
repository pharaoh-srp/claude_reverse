package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class wa3 extends vp4 {
    public String E;
    public String F;
    public String G;
    public nf0 H;
    public /* synthetic */ Object I;
    public final /* synthetic */ xa3 J;
    public int K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wa3(xa3 xa3Var, vp4 vp4Var) {
        super(vp4Var);
        this.J = xa3Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.I = obj;
        this.K |= Integer.MIN_VALUE;
        return this.J.e(null, null, this);
    }
}
