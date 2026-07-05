package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class grf extends vp4 {
    public String E;
    public List F;
    public String G;
    public String H;
    public String I;
    public Exception J;
    public Object K;
    public /* synthetic */ Object L;
    public final /* synthetic */ jrf M;
    public int N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public grf(jrf jrfVar, vp4 vp4Var) {
        super(vp4Var);
        this.M = jrfVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.L = obj;
        this.N |= Integer.MIN_VALUE;
        return this.M.A(this, null, null, null, null);
    }
}
