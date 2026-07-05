package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class e77 extends vp4 {
    public long E;
    public /* synthetic */ Object F;
    public final /* synthetic */ f77 G;
    public int H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e77(f77 f77Var, vp4 vp4Var) {
        super(vp4Var);
        this.G = f77Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return this.G.G(0L, 0L, this);
    }
}
