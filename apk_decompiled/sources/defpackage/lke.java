package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lke extends vp4 {
    public int E;
    public /* synthetic */ Object F;
    public final /* synthetic */ oke G;
    public int H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lke(oke okeVar, vp4 vp4Var) {
        super(vp4Var);
        this.G = okeVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return this.G.b(false, 0, 0, this);
    }
}
