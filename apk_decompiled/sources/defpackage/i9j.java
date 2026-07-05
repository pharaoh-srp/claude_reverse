package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class i9j extends vp4 {
    public jj E;
    public Object F;
    public String G;
    public String H;
    public /* synthetic */ Object I;
    public final /* synthetic */ m9j J;
    public int K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i9j(m9j m9jVar, vp4 vp4Var) {
        super(vp4Var);
        this.J = m9jVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.I = obj;
        this.K |= Integer.MIN_VALUE;
        return m9j.O(this.J, null, null, this);
    }
}
