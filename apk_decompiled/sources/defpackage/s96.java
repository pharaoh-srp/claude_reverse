package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class s96 extends vp4 {
    public zy1 E;
    public /* synthetic */ Object F;
    public final /* synthetic */ t96 G;
    public int H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s96(t96 t96Var, vp4 vp4Var) {
        super(vp4Var);
        this.G = t96Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return this.G.a(null, null, this);
    }
}
