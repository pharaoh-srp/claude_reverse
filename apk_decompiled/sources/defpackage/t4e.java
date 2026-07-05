package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class t4e extends vp4 {
    public g89 E;
    public /* synthetic */ Object F;
    public final /* synthetic */ ns5 G;
    public int H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t4e(ns5 ns5Var, vp4 vp4Var) {
        super(vp4Var);
        this.G = ns5Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return this.G.i(this);
    }
}
