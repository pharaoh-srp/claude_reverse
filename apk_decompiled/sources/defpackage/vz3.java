package defpackage;

import com.anthropic.claude.code.remote.c;
import com.anthropic.claude.sessions.types.ListAgentOwnedSessionsResponse;

/* JADX INFO: loaded from: classes2.dex */
public final class vz3 extends vp4 {
    public String E;
    public of0 F;
    public ListAgentOwnedSessionsResponse G;
    public boolean H;
    public boolean I;
    public boolean J;
    public /* synthetic */ Object K;
    public final /* synthetic */ c L;
    public int M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vz3(c cVar, vp4 vp4Var) {
        super(vp4Var);
        this.L = cVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.K = obj;
        this.M |= Integer.MIN_VALUE;
        return this.L.V(null, false, false, this);
    }
}
