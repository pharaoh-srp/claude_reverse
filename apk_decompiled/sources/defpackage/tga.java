package defpackage;

import com.anthropic.claude.api.login.SendMagicLinkRequest;
import com.anthropic.claude.api.login.SendMagicLinkResponse;
import com.anthropic.claude.api.login.VerifyGoogleMobileRequest;
import com.anthropic.claude.api.login.VerifyMagicLinkRequest;
import com.anthropic.claude.api.login.VerifyResponse;
import com.anthropic.claude.api.result.ApiResult;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\bH§@¢\u0006\u0004\b\n\u0010\u000bJ \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\fH§@¢\u0006\u0004\b\r\u0010\u000eJ*\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\b\b\u0001\u0010\u0011\u001a\u00020\u000fH§@¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014À\u0006\u0003"}, d2 = {"Ltga;", "", "Lcom/anthropic/claude/api/login/VerifyGoogleMobileRequest;", "request", "Lcom/anthropic/claude/api/result/ApiResult;", "Lcom/anthropic/claude/api/login/VerifyResponse;", "a", "(Lcom/anthropic/claude/api/login/VerifyGoogleMobileRequest;Ltp4;)Ljava/lang/Object;", "Lcom/anthropic/claude/api/login/SendMagicLinkRequest;", "Lcom/anthropic/claude/api/login/SendMagicLinkResponse;", "b", "(Lcom/anthropic/claude/api/login/SendMagicLinkRequest;Ltp4;)Ljava/lang/Object;", "Lcom/anthropic/claude/api/login/VerifyMagicLinkRequest;", "d", "(Lcom/anthropic/claude/api/login/VerifyMagicLinkRequest;Ltp4;)Ljava/lang/Object;", "", "code", "state", "c", "(Ljava/lang/String;Ljava/lang/String;Ltp4;)Ljava/lang/Object;", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
public interface tga {
    @smc("auth/verify_google_mobile")
    Object a(@ft1 VerifyGoogleMobileRequest verifyGoogleMobileRequest, tp4<? super ApiResult<VerifyResponse>> tp4Var);

    @smc("auth/send_magic_link")
    Object b(@ft1 SendMagicLinkRequest sendMagicLinkRequest, tp4<? super ApiResult<SendMagicLinkResponse>> tp4Var);

    @u08("enterprise_auth/sso_callback")
    Object c(@tzd("code") String str, @tzd("state") String str2, tp4<? super ApiResult<VerifyResponse>> tp4Var);

    @smc("auth/verify_magic_link")
    Object d(@ft1 VerifyMagicLinkRequest verifyMagicLinkRequest, tp4<? super ApiResult<VerifyResponse>> tp4Var);
}
