package defpackage;

import com.anthropic.claude.api.result.ApiResult;
import com.anthropic.claude.sessions.types.SharedSessionData;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ewf extends vp4 {
    public String E;
    public ApiResult F;
    public SharedSessionData G;
    public List H;
    public String I;
    public int J;
    public /* synthetic */ Object K;
    public final /* synthetic */ jwf L;
    public int M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ewf(jwf jwfVar, vp4 vp4Var) {
        super(vp4Var);
        this.L = jwfVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.K = obj;
        this.M |= Integer.MIN_VALUE;
        return this.L.e(null, this);
    }
}
