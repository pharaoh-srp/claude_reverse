package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ni1 extends vp4 {
    public hxb E;
    public /* synthetic */ Object F;
    public final /* synthetic */ pi1 G;
    public int H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ni1(pi1 pi1Var, vp4 vp4Var) {
        super(vp4Var);
        this.G = pi1Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return this.G.e(this);
    }
}
