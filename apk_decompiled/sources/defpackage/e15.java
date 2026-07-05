package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class e15 extends vp4 {
    public bx4 E;
    public d15 F;
    public hxb G;
    public int H;
    public /* synthetic */ Object I;
    public final /* synthetic */ f15 J;
    public int K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e15(f15 f15Var, vp4 vp4Var) {
        super(vp4Var);
        this.J = f15Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.I = obj;
        this.K |= Integer.MIN_VALUE;
        return this.J.a(null, this);
    }
}
