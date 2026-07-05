package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class erf extends vp4 {
    public String E;
    public Map F;
    public String G;
    public String H;
    public boolean I;
    public boolean J;
    public /* synthetic */ Object K;
    public final /* synthetic */ jrf L;
    public int M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public erf(jrf jrfVar, vp4 vp4Var) {
        super(vp4Var);
        this.L = jrfVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.K = obj;
        this.M |= Integer.MIN_VALUE;
        return this.L.y(null, false, null, false, this);
    }
}
