package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class m2g extends vp4 {
    public n2g E;
    public lp7 F;
    public p2g G;
    public lf9 H;
    public /* synthetic */ Object I;
    public final /* synthetic */ n2g J;
    public int K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2g(n2g n2gVar, tp4 tp4Var) {
        super(tp4Var);
        this.J = n2gVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.I = obj;
        this.K |= Integer.MIN_VALUE;
        n2g.n(this.J, null, this);
        return m45.E;
    }
}
