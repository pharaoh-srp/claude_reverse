package defpackage;

import com.android.billingclient.api.Purchase;
import com.anthropic.claude.api.result.ApiResult;

/* JADX INFO: loaded from: classes2.dex */
public final class h98 extends vp4 {
    public Purchase E;
    public hwg F;
    public String G;
    public String H;
    public dae I;
    public ApiResult J;
    public ApiResult K;
    public boolean L;
    public int M;
    public int N;
    public /* synthetic */ Object O;
    public final /* synthetic */ m98 P;
    public int Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h98(m98 m98Var, vp4 vp4Var) {
        super(vp4Var);
        this.P = m98Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.O = obj;
        this.Q |= Integer.MIN_VALUE;
        return this.P.c(null, false, null, 0, this);
    }
}
