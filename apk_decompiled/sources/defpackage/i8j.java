package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class i8j extends vp4 {
    public /* synthetic */ Object E;
    public final /* synthetic */ ql8 F;
    public int G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i8j(ql8 ql8Var, vp4 vp4Var) {
        super(vp4Var);
        this.F = ql8Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return this.F.y(null, null, false, this);
    }
}
