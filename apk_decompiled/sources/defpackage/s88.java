package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class s88 extends vp4 {
    public zo1 E;
    public /* synthetic */ Object F;
    public final /* synthetic */ t88 G;
    public int H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s88(t88 t88Var, vp4 vp4Var) {
        super(vp4Var);
        this.G = t88Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return t88.a(this.G, this);
    }
}
