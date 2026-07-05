package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xog extends vp4 {
    public bpg E;
    public /* synthetic */ Object F;
    public final /* synthetic */ bpg G;
    public int H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xog(bpg bpgVar, vp4 vp4Var) {
        super(vp4Var);
        this.G = bpgVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return bpg.d(this.G, this);
    }
}
