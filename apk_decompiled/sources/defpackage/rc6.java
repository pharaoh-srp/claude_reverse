package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class rc6 extends vp4 {
    public cc6 E;
    public /* synthetic */ Object F;
    public final /* synthetic */ tc6 G;
    public int H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rc6(tc6 tc6Var, vp4 vp4Var) {
        super(vp4Var);
        this.G = tc6Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return tc6.u1(this.G, null, this);
    }
}
