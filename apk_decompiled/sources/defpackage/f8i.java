package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class f8i extends vp4 {
    public boolean E;
    public /* synthetic */ Object F;
    public final /* synthetic */ j8i G;
    public int H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f8i(j8i j8iVar, vp4 vp4Var) {
        super(vp4Var);
        this.G = j8iVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return this.G.f(this);
    }
}
