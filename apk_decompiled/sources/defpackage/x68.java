package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class x68 extends vp4 {
    public u73 E;
    public /* synthetic */ Object F;
    public final /* synthetic */ y68 G;
    public int H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x68(y68 y68Var, vp4 vp4Var) {
        super(vp4Var);
        this.G = y68Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return this.G.d(null, null, null, null, this);
    }
}
