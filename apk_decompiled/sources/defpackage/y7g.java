package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class y7g extends vp4 {
    public jxb E;
    public boolean F;
    public /* synthetic */ Object G;
    public final /* synthetic */ z7g H;
    public int I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y7g(z7g z7gVar, vp4 vp4Var) {
        super(vp4Var);
        this.H = z7gVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.G = obj;
        this.I |= Integer.MIN_VALUE;
        return this.H.c(null, this);
    }
}
