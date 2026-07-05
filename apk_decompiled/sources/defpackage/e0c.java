package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class e0c extends vp4 {
    public long E;
    public /* synthetic */ Object F;
    public final /* synthetic */ f0c G;
    public int H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0c(f0c f0cVar, vp4 vp4Var) {
        super(vp4Var);
        this.G = f0cVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return this.G.O0(0L, this);
    }
}
