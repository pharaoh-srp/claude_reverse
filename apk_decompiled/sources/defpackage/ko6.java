package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ko6 extends vp4 {
    public ns5 E;
    public /* synthetic */ Object F;
    public final /* synthetic */ no6 G;
    public int H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ko6(no6 no6Var, vp4 vp4Var) {
        super(vp4Var);
        this.G = no6Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return this.G.a(null, this);
    }
}
