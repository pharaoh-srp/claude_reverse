package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class j11 extends vp4 {
    public i11 E;
    public /* synthetic */ Object F;
    public final /* synthetic */ fj0 G;
    public int H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j11(fj0 fj0Var, vp4 vp4Var) {
        super(vp4Var);
        this.G = fj0Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return this.G.H(null, null, null, this);
    }
}
