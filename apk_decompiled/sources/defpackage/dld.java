package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class dld extends vp4 {
    public String E;
    public /* synthetic */ Object F;
    public final /* synthetic */ ild G;
    public int H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dld(ild ildVar, vp4 vp4Var) {
        super(vp4Var);
        this.G = ildVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return ild.P(this.G, this);
    }
}
