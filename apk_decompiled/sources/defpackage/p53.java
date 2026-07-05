package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class p53 extends vp4 {
    public y03 E;
    public /* synthetic */ Object F;
    public final /* synthetic */ t53 G;
    public int H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p53(t53 t53Var, vp4 vp4Var) {
        super(vp4Var);
        this.G = t53Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return t53.k0(this.G, null, this);
    }
}
