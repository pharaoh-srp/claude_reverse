package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fh4 extends vp4 {
    public boolean E;
    public Object F;
    public Object G;
    public dae H;
    public c45 I;
    public dae J;
    public dd8 K;
    public /* synthetic */ Object L;
    public final /* synthetic */ gh4 M;
    public int N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fh4(gh4 gh4Var, vp4 vp4Var) {
        super(vp4Var);
        this.M = gh4Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.L = obj;
        this.N |= Integer.MIN_VALUE;
        return this.M.D(false, null, this);
    }
}
