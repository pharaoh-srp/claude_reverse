package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class a58 extends vp4 {
    public /* synthetic */ Object E;
    public final /* synthetic */ e58 F;
    public int G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a58(e58 e58Var, vp4 vp4Var) {
        super(vp4Var);
        this.F = e58Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return this.F.a(null, null, null, this);
    }
}
