package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dr7 extends vp4 {
    public /* synthetic */ Object E;
    public int F;
    public final /* synthetic */ er7 G;
    public lp7 H;
    public dae I;
    public int J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dr7(er7 er7Var, tp4 tp4Var) {
        super(tp4Var);
        this.G = er7Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.F |= Integer.MIN_VALUE;
        return this.G.a(null, this);
    }
}
