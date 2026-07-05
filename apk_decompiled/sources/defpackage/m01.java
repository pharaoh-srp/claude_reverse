package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class m01 extends vp4 {
    public k20 E;
    public /* synthetic */ Object F;
    public final /* synthetic */ n01 G;
    public int H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m01(n01 n01Var, vp4 vp4Var) {
        super(vp4Var);
        this.G = n01Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return this.G.d(null, this);
    }
}
