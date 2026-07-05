package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class u0c extends vp4 {
    public dae E;
    public dae F;
    public /* synthetic */ Object G;
    public final /* synthetic */ x0c H;
    public int I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0c(x0c x0cVar, tp4 tp4Var) {
        super(tp4Var);
        this.H = x0cVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.G = obj;
        this.I |= Integer.MIN_VALUE;
        return x0c.b(this.H, this);
    }
}
