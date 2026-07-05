package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class i7i extends vp4 {
    public fj0 E;
    public /* synthetic */ Object F;
    public final /* synthetic */ o7i G;
    public int H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i7i(o7i o7iVar, vp4 vp4Var) {
        super(vp4Var);
        this.G = o7iVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return o7i.b(this.G, this);
    }
}
