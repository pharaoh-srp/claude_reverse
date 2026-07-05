package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class f0i extends vp4 {
    public jxb E;
    public /* synthetic */ Object F;
    public final /* synthetic */ q0i G;
    public int H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0i(q0i q0iVar, vp4 vp4Var) {
        super(vp4Var);
        this.G = q0iVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return this.G.f(this);
    }
}
