package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class huc extends vp4 {
    public int E;
    public /* synthetic */ Object F;
    public final /* synthetic */ juc G;
    public int H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public huc(juc jucVar, tp4 tp4Var) {
        super(tp4Var);
        this.G = jucVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return this.G.e(null, null, this);
    }
}
