package defpackage;

import com.anthropic.claude.api.account.Account;
import com.anthropic.claude.api.result.ApiResult;

/* JADX INFO: loaded from: classes.dex */
public final class b0i extends vp4 {
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public ApiResult J;
    public Account K;
    public /* synthetic */ Object L;
    public final /* synthetic */ q0i M;
    public int N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0i(q0i q0iVar, vp4 vp4Var) {
        super(vp4Var);
        this.M = q0iVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.L = obj;
        this.N |= Integer.MIN_VALUE;
        return this.M.d(this);
    }
}
