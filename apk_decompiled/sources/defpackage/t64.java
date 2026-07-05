package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class t64 extends vp4 {
    public /* synthetic */ Object E;
    public final /* synthetic */ u64 F;
    public int G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t64(u64 u64Var, tp4 tp4Var) {
        super(tp4Var);
        this.F = u64Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return this.F.g(null, this);
    }
}
