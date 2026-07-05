package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class uf1 extends vp4 {
    public l9e E;
    public wkh F;
    public l45 G;
    public sih H;
    public /* synthetic */ Object I;
    public final /* synthetic */ yf1 J;
    public int K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uf1(yf1 yf1Var, tp4 tp4Var) {
        super(tp4Var);
        this.J = yf1Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.I = obj;
        this.K |= Integer.MIN_VALUE;
        return this.J.a(null, null, this);
    }
}
