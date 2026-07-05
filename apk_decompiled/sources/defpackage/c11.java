package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class c11 extends vp4 {
    public jx8 E;
    public /* synthetic */ Object F;
    public final /* synthetic */ d11 G;
    public int H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c11(d11 d11Var, vp4 vp4Var) {
        super(vp4Var);
        this.G = d11Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return this.G.a(null, null, this);
    }
}
