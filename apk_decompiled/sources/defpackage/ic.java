package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ic extends vp4 {
    public boolean E;
    public /* synthetic */ Object F;
    public final /* synthetic */ mc G;
    public int H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ic(mc mcVar, vp4 vp4Var) {
        super(vp4Var);
        this.G = mcVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return this.G.a(this);
    }
}
