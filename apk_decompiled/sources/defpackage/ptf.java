package defpackage;

import com.anthropic.claude.api.result.ApiResult;
import com.anthropic.claude.api.trusteddevice.ReattestChallengeResponse;
import com.anthropic.claude.api.trusteddevice.ReattestVerifyRequest;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J,\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0007\u0010\bJ6\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00052\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\n\u001a\u00020\tH§@¢\u0006\u0004\b\f\u0010\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lptf;", "", "", "", "headers", "Lcom/anthropic/claude/api/result/ApiResult;", "Lcom/anthropic/claude/api/trusteddevice/ReattestChallengeResponse;", "a", "(Ljava/util/Map;Ltp4;)Ljava/lang/Object;", "Lcom/anthropic/claude/api/trusteddevice/ReattestVerifyRequest;", "request", "Liei;", "b", "(Ljava/util/Map;Lcom/anthropic/claude/api/trusteddevice/ReattestVerifyRequest;Ltp4;)Ljava/lang/Object;", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
public interface ptf {
    @u08("auth/session_reattest/device_key/challenge")
    Object a(@ug8 Map<String, String> map, tp4<? super ApiResult<ReattestChallengeResponse>> tp4Var);

    @smc("auth/session_reattest/device_key")
    Object b(@ug8 Map<String, String> map, @ft1 ReattestVerifyRequest reattestVerifyRequest, tp4<? super ApiResult<iei>> tp4Var);
}
