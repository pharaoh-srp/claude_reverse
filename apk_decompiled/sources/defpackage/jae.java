package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class jae extends vp4 {
    public String E;
    public /* synthetic */ Object F;
    public final /* synthetic */ kae G;
    public int H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jae(kae kaeVar, vp4 vp4Var) {
        super(vp4Var);
        this.G = kaeVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return this.G.b(null, this);
    }
}
