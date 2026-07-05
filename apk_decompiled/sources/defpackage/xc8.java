package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xc8 extends vp4 {
    public /* synthetic */ Object E;
    public int F;
    public final /* synthetic */ v70 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xc8(v70 v70Var, tp4 tp4Var) {
        super(tp4Var);
        this.G = v70Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.F |= Integer.MIN_VALUE;
        return this.G.a(null, this);
    }
}
