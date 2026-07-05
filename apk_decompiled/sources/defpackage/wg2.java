package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wg2 extends vp4 {
    public /* synthetic */ Object E;
    public final /* synthetic */ xg2 F;
    public int G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wg2(xg2 xg2Var, vp4 vp4Var) {
        super(vp4Var);
        this.F = xg2Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        this.F.l0(null, this);
        return m45.E;
    }
}
