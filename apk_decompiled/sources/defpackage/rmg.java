package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class rmg extends vp4 {
    public jkf E;
    public /* synthetic */ Object F;
    public final /* synthetic */ yq1 G;
    public int H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rmg(yq1 yq1Var, vp4 vp4Var) {
        super(vp4Var);
        this.G = yq1Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return this.G.a(this);
    }
}
