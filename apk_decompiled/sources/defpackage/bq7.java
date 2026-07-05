package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bq7 extends vp4 {
    public /* synthetic */ Object E;
    public int F;
    public final /* synthetic */ yp7 G;
    public lp7 H;
    public int I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bq7(yp7 yp7Var, tp4 tp4Var) {
        super(tp4Var);
        this.G = yp7Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.F |= Integer.MIN_VALUE;
        return this.G.a(null, this);
    }
}
