package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class fh5 extends vp4 {
    public wf5 E;
    public hxb F;
    public Serializable G;
    public Object H;
    public bi5 I;
    public int J;
    public int K;
    public /* synthetic */ Object L;
    public final /* synthetic */ gh5 M;
    public int N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fh5(gh5 gh5Var, vp4 vp4Var) {
        super(vp4Var);
        this.M = gh5Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.L = obj;
        this.N |= Integer.MIN_VALUE;
        return this.M.a(null, this);
    }
}
