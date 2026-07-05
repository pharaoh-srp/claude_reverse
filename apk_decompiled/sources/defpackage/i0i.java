package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class i0i extends vp4 {
    public /* synthetic */ Object E;
    public final /* synthetic */ q0i F;
    public int G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0i(q0i q0iVar, vp4 vp4Var) {
        super(vp4Var);
        this.F = q0iVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return this.F.g(this);
    }
}
