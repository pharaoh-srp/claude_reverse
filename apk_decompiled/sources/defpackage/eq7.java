package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class eq7 extends vp4 {
    public /* synthetic */ Object E;
    public int F;
    public final /* synthetic */ aq7 G;
    public lp7 H;
    public Throwable I;
    public int J;
    public int K;
    public long L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eq7(aq7 aq7Var, tp4 tp4Var) {
        super(tp4Var);
        this.G = aq7Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.F |= Integer.MIN_VALUE;
        return this.G.a(null, this);
    }
}
