package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class lo1 extends vp4 {
    public x9c E;
    public sy1 F;
    public jo1 G;
    public int H;
    public long I;
    public long J;
    public long K;
    public long L;
    public /* synthetic */ Object M;
    public final /* synthetic */ mo1 N;
    public int O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lo1(mo1 mo1Var, vp4 vp4Var) {
        super(vp4Var);
        this.N = mo1Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.M = obj;
        this.O |= Integer.MIN_VALUE;
        return mo1.a(this.N, null, 0, this);
    }
}
