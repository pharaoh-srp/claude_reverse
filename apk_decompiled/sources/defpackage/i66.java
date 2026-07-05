package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class i66 extends vp4 {
    public of0 E;
    public /* synthetic */ Object F;
    public final /* synthetic */ j66 G;
    public int H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i66(j66 j66Var, vp4 vp4Var) {
        super(vp4Var);
        this.G = j66Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return this.G.O(this);
    }
}
