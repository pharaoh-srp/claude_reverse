package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hoc extends vp4 {
    public int E;
    public yig F;
    public /* synthetic */ Object G;
    public final /* synthetic */ koc H;
    public int I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hoc(koc kocVar, tp4 tp4Var) {
        super(tp4Var);
        this.H = kocVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.G = obj;
        this.I |= Integer.MIN_VALUE;
        return this.H.f(0, null, this);
    }
}
