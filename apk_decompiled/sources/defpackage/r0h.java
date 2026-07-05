package defpackage;

import com.anthropic.claude.api.result.ApiResult;
import com.anthropic.claude.api.sync.AuthStatus;
import com.anthropic.claude.api.sync.FinishAuthRequest;
import com.anthropic.claude.api.sync.StartAuthRequest;
import com.anthropic.claude.api.sync.StartAuthResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\t\u001a\u00020\rH§@¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011À\u0006\u0003"}, d2 = {"Lr0h;", "", "Lcom/anthropic/claude/types/strings/OrganizationId;", "organization", "Lcom/anthropic/claude/api/result/ApiResult;", "Lcom/anthropic/claude/api/sync/AuthStatus;", "b", "(Ljava/lang/String;Ltp4;)Ljava/lang/Object;", "Lcom/anthropic/claude/api/sync/StartAuthRequest;", "request", "Lcom/anthropic/claude/api/sync/StartAuthResponse;", "a", "(Ljava/lang/String;Lcom/anthropic/claude/api/sync/StartAuthRequest;Ltp4;)Ljava/lang/Object;", "Lcom/anthropic/claude/api/sync/FinishAuthRequest;", "Liei;", "c", "(Ljava/lang/String;Lcom/anthropic/claude/api/sync/FinishAuthRequest;Ltp4;)Ljava/lang/Object;", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
public interface r0h {
    @smc("organizations/{organization}/sync/github/auth/start")
    Object a(@ouc("organization") String str, @ft1 StartAuthRequest startAuthRequest, tp4<? super ApiResult<StartAuthResponse>> tp4Var);

    @u08("organizations/{organization}/sync/github/auth")
    Object b(@ouc("organization") String str, tp4<? super ApiResult<AuthStatus>> tp4Var);

    @smc("organizations/{organization}/sync/github/auth/finish")
    Object c(@ouc("organization") String str, @ft1 FinishAuthRequest finishAuthRequest, tp4<? super ApiResult<iei>> tp4Var);
}
