package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class or7 extends vp4 {
    public /* synthetic */ Object E;
    public int F;
    public lp7 G;
    public final /* synthetic */ pr7 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public or7(pr7 pr7Var, tp4 tp4Var) {
        super(tp4Var);
        this.H = pr7Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.F |= Integer.MIN_VALUE;
        return this.H.g(null, this);
    }
}
