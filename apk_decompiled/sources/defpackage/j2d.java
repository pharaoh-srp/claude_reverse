package defpackage;

import com.anthropic.claude.api.common.EmptyResponseWithSuccess;
import com.anthropic.claude.api.result.ApiResult;
import com.anthropic.claude.api.verification.SendPhoneVerificationCodeRequest;
import com.anthropic.claude.api.verification.SendPhoneVerificationCodeResponse;
import com.anthropic.claude.api.verification.VerifyPhoneVerificationCodeRequest;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\bH§@¢\u0006\u0004\b\n\u0010\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lj2d;", "", "Lcom/anthropic/claude/api/verification/SendPhoneVerificationCodeRequest;", "request", "Lcom/anthropic/claude/api/result/ApiResult;", "Lcom/anthropic/claude/api/verification/SendPhoneVerificationCodeResponse;", "b", "(Lcom/anthropic/claude/api/verification/SendPhoneVerificationCodeRequest;Ltp4;)Ljava/lang/Object;", "Lcom/anthropic/claude/api/verification/VerifyPhoneVerificationCodeRequest;", "Lcom/anthropic/claude/api/common/EmptyResponseWithSuccess;", "a", "(Lcom/anthropic/claude/api/verification/VerifyPhoneVerificationCodeRequest;Ltp4;)Ljava/lang/Object;", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
public interface j2d {
    @smc("auth/verify_phone_code")
    Object a(@ft1 VerifyPhoneVerificationCodeRequest verifyPhoneVerificationCodeRequest, tp4<? super ApiResult<EmptyResponseWithSuccess>> tp4Var);

    @smc("auth/send_phone_code")
    Object b(@ft1 SendPhoneVerificationCodeRequest sendPhoneVerificationCodeRequest, tp4<? super ApiResult<SendPhoneVerificationCodeResponse>> tp4Var);
}
