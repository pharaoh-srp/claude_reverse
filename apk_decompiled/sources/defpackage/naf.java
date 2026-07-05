package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class naf extends vp4 {
    public cae E;
    public /* synthetic */ Object F;
    public final /* synthetic */ raf G;
    public int H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public naf(raf rafVar, vp4 vp4Var) {
        super(vp4Var);
        this.G = rafVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return this.G.a(0L, this);
    }
}
