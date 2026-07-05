package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class uqd extends vp4 {
    public String E;
    public nf0 F;
    public nf0 G;
    public boolean H;
    public /* synthetic */ Object I;
    public final /* synthetic */ wqd J;
    public int K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uqd(wqd wqdVar, vp4 vp4Var) {
        super(vp4Var);
        this.J = wqdVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.I = obj;
        this.K |= Integer.MIN_VALUE;
        return this.J.x(this, null, false);
    }
}
