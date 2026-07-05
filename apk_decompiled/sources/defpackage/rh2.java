package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rh2 extends vp4 {
    public Object E;
    public /* synthetic */ Object F;
    public final /* synthetic */ sh2 G;
    public int H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rh2(sh2 sh2Var, tp4 tp4Var) {
        super(tp4Var);
        this.G = sh2Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return this.G.g(null, this);
    }
}
