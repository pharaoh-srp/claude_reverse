package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pi5 extends vp4 {
    public String E;
    public String F;
    public /* synthetic */ Object G;
    public final /* synthetic */ bj5 H;
    public int I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pi5(bj5 bj5Var, vp4 vp4Var) {
        super(vp4Var);
        this.H = bj5Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.G = obj;
        this.I |= Integer.MIN_VALUE;
        return this.H.a(null, null, null, this);
    }
}
