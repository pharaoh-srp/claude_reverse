package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zi0 extends vp4 {
    public /* synthetic */ Object E;
    public int F;
    public final /* synthetic */ u70 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zi0(u70 u70Var, tp4 tp4Var) {
        super(tp4Var);
        this.G = u70Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.F |= Integer.MIN_VALUE;
        return this.G.g(null, this);
    }
}
