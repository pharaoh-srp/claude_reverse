package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class i9d extends vp4 {
    public boolean E;
    public vh4 F;
    public /* synthetic */ Object G;
    public final /* synthetic */ l9d H;
    public int I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i9d(l9d l9dVar, vp4 vp4Var) {
        super(vp4Var);
        this.H = l9dVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.G = obj;
        this.I |= Integer.MIN_VALUE;
        return this.H.f(false, this);
    }
}
