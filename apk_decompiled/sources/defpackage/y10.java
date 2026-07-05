package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class y10 extends vp4 {
    public long E;
    public /* synthetic */ Object F;
    public final /* synthetic */ b20 G;
    public int H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y10(b20 b20Var, vp4 vp4Var) {
        super(vp4Var);
        this.G = b20Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return this.G.b(0L, null, this);
    }
}
