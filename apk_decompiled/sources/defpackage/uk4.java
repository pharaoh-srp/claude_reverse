package defpackage;

import com.anthropic.claude.api.consent.CheckConsentRequest;
import com.anthropic.claude.api.consent.HasConsentResponse;
import com.anthropic.claude.api.consent.RevokeConsentRequest;
import com.anthropic.claude.api.consent.UserConsentRequest;
import com.anthropic.claude.api.consent.UserConsentResponse;
import com.anthropic.claude.api.result.ApiResult;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\bH§@¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\fH§@¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010À\u0006\u0003"}, d2 = {"Luk4;", "", "Lcom/anthropic/claude/api/consent/UserConsentRequest;", "request", "Lcom/anthropic/claude/api/result/ApiResult;", "Lcom/anthropic/claude/api/consent/UserConsentResponse;", "a", "(Lcom/anthropic/claude/api/consent/UserConsentRequest;Ltp4;)Ljava/lang/Object;", "Lcom/anthropic/claude/api/consent/CheckConsentRequest;", "Lcom/anthropic/claude/api/consent/HasConsentResponse;", "c", "(Lcom/anthropic/claude/api/consent/CheckConsentRequest;Ltp4;)Ljava/lang/Object;", "Lcom/anthropic/claude/api/consent/RevokeConsentRequest;", "Liei;", "b", "(Lcom/anthropic/claude/api/consent/RevokeConsentRequest;Ltp4;)Ljava/lang/Object;", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
public interface uk4 {
    @vmc("accounts/me/consents")
    Object a(@ft1 UserConsentRequest userConsentRequest, tp4<? super ApiResult<UserConsentResponse>> tp4Var);

    @smc("accounts/me/consents/revoke")
    Object b(@ft1 RevokeConsentRequest revokeConsentRequest, tp4<? super ApiResult<iei>> tp4Var);

    @smc("accounts/me/consents/check")
    Object c(@ft1 CheckConsentRequest checkConsentRequest, tp4<? super ApiResult<HasConsentResponse>> tp4Var);
}
