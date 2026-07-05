package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class h33 extends vp4 {
    public skd E;
    public /* synthetic */ Object F;
    public final /* synthetic */ g33 G;
    public int H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h33(g33 g33Var, tp4 tp4Var) {
        super(tp4Var);
        this.G = g33Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return this.G.a(null, this);
    }
}
