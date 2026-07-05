package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ej extends vp4 {
    public boolean E;
    public long F;
    public int G;
    public int H;
    public int I;
    public int J;
    public /* synthetic */ Object K;
    public final /* synthetic */ hj L;
    public int M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ej(hj hjVar, vp4 vp4Var) {
        super(vp4Var);
        this.L = hjVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.K = obj;
        this.M |= Integer.MIN_VALUE;
        return hj.a(this.L, false, this);
    }
}
