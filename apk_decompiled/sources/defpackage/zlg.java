package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zlg extends vp4 {
    public lp7 E;
    public cmg F;
    public lf9 G;
    public Object H;
    public Object I;
    public /* synthetic */ Object J;
    public final /* synthetic */ amg K;
    public int L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zlg(amg amgVar, tp4 tp4Var) {
        super(tp4Var);
        this.K = amgVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.J = obj;
        this.L |= Integer.MIN_VALUE;
        this.K.a(null, this);
        return m45.E;
    }
}
