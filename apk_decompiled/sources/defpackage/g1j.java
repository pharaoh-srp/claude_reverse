package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class g1j extends vp4 {
    public int E;
    public /* synthetic */ Object F;
    public final /* synthetic */ i7 G;
    public int H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1j(i7 i7Var, tp4 tp4Var) {
        super(tp4Var);
        this.G = i7Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return this.G.a(0, this);
    }
}
