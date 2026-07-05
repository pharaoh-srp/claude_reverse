package defpackage;

import com.anthropic.claude.api.result.ApiResult;

/* JADX INFO: loaded from: classes3.dex */
public final class hk6 extends vp4 {
    public bz7 E;
    public ApiResult F;
    public ApiResult G;
    public ApiResult H;
    public boolean I;
    public /* synthetic */ Object J;
    public final /* synthetic */ ik6 K;
    public int L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hk6(ik6 ik6Var, vp4 vp4Var) {
        super(vp4Var);
        this.K = ik6Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.J = obj;
        this.L |= Integer.MIN_VALUE;
        return this.K.e(null, this);
    }
}
