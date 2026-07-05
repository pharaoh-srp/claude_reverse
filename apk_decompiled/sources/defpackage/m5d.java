package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class m5d extends vp4 {
    public CharSequence E;
    public Object F;
    public jxb G;
    public long H;
    public /* synthetic */ Object I;
    public final /* synthetic */ p5d J;
    public int K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m5d(p5d p5dVar, vp4 vp4Var) {
        super(vp4Var);
        this.J = p5dVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.I = obj;
        this.K |= Integer.MIN_VALUE;
        return p5d.a(this.J, null, 0L, null, this);
    }
}
