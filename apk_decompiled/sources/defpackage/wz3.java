package defpackage;

import com.anthropic.claude.api.result.ApiResult;
import com.anthropic.claude.code.remote.c;
import com.anthropic.claude.sessions.types.ListAgentOwnedSessionsResponse;
import com.anthropic.claude.sessions.types.ListSessionsResponse;

/* JADX INFO: loaded from: classes2.dex */
public final class wz3 extends vp4 {
    public boolean E;
    public boolean F;
    public hxb G;
    public ApiResult H;
    public ListSessionsResponse I;
    public ListAgentOwnedSessionsResponse J;
    public int K;
    public /* synthetic */ Object L;
    public final /* synthetic */ c M;
    public int N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wz3(c cVar, vp4 vp4Var) {
        super(vp4Var);
        this.M = cVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.L = obj;
        this.N |= Integer.MIN_VALUE;
        return this.M.W(false, false, this);
    }
}
