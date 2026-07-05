package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes3.dex */
public final class cge extends vp4 {
    public ja8 E;
    public String F;
    public zt0 G;
    public String H;
    public float I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public /* synthetic */ Object O;
    public final /* synthetic */ dge P;
    public int Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cge(dge dgeVar, vp4 vp4Var) {
        super(vp4Var);
        this.P = dgeVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.O = obj;
        this.Q |= Integer.MIN_VALUE;
        return dge.a(this.P, null, MTTypesetterKt.kLineSkipLimitMultiplier, this);
    }
}
