package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class v15 extends vp4 {
    public String E;
    public String F;
    public hxb G;
    public z15 H;
    public int I;
    public /* synthetic */ Object J;
    public final /* synthetic */ w15 K;
    public int L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v15(w15 w15Var, vp4 vp4Var) {
        super(vp4Var);
        this.K = w15Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.J = obj;
        this.L |= Integer.MIN_VALUE;
        return this.K.a(null, null, this);
    }
}
