package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qs4 extends vp4 {
    public String E;
    public String F;
    public int G;
    public int H;
    public int I;
    public /* synthetic */ Object J;
    public final /* synthetic */ rs4 K;
    public int L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qs4(rs4 rs4Var, vp4 vp4Var) {
        super(vp4Var);
        this.K = rs4Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.J = obj;
        this.L |= Integer.MIN_VALUE;
        return this.K.d(null, this);
    }
}
