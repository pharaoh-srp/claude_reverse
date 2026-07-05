package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class wc4 extends vp4 {
    public Object E;
    public c79 F;
    public int G;
    public int H;
    public /* synthetic */ Object I;
    public final /* synthetic */ yc4 J;
    public int K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wc4(yc4 yc4Var, vp4 vp4Var) {
        super(vp4Var);
        this.J = yc4Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.I = obj;
        this.K |= Integer.MIN_VALUE;
        return yc4.a(this.J, null, null, this);
    }
}
