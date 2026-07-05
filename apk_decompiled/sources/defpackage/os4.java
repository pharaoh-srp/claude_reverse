package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class os4 extends vp4 {
    public String E;
    public Object F;
    public boolean G;
    public boolean H;
    public /* synthetic */ Object I;
    public final /* synthetic */ rs4 J;
    public int K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public os4(rs4 rs4Var, vp4 vp4Var) {
        super(vp4Var);
        this.J = rs4Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.I = obj;
        this.K |= Integer.MIN_VALUE;
        return this.J.c(null, false, false, this);
    }
}
