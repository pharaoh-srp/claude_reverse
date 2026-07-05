package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ni5 extends vp4 {
    public String E;
    public /* synthetic */ Object F;
    public final /* synthetic */ bj5 G;
    public int H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ni5(bj5 bj5Var, vp4 vp4Var) {
        super(vp4Var);
        this.G = bj5Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return this.G.m(null, this);
    }
}
