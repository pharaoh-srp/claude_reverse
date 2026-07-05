package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class va3 extends vp4 {
    public String E;
    public bz7 F;
    public bz7 G;
    public pz7 H;
    public nf0 I;
    public /* synthetic */ Object J;
    public final /* synthetic */ xa3 K;
    public int L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public va3(xa3 xa3Var, vp4 vp4Var) {
        super(vp4Var);
        this.K = xa3Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.J = obj;
        this.L |= Integer.MIN_VALUE;
        return this.K.b(null, null, null, null, this);
    }
}
