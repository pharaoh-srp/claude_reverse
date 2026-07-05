package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class w0c extends vp4 {
    public i4e E;
    public m1c F;
    public m1c G;
    public ro6 H;
    public /* synthetic */ Object I;
    public final /* synthetic */ x0c J;
    public int K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0c(x0c x0cVar, vp4 vp4Var) {
        super(vp4Var);
        this.J = x0cVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.I = obj;
        this.K |= Integer.MIN_VALUE;
        return x0c.d(this.J, null, null, null, this);
    }
}
