package defpackage;

import com.anthropic.claude.api.result.ApiResult;
import com.anthropic.claude.api.trusteddevice.EnrollTrustedDeviceRequest;
import com.anthropic.claude.api.trusteddevice.EnrollTrustedDeviceResponse;
import com.anthropic.claude.api.trusteddevice.RotateReattestRequest;
import com.anthropic.claude.api.trusteddevice.RotateReattestResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\nH§@¢\u0006\u0004\b\f\u0010\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lv7i;", "", "Lcom/anthropic/claude/api/trusteddevice/EnrollTrustedDeviceRequest;", "request", "Lcom/anthropic/claude/api/result/ApiResult;", "Lcom/anthropic/claude/api/trusteddevice/EnrollTrustedDeviceResponse;", "b", "(Lcom/anthropic/claude/api/trusteddevice/EnrollTrustedDeviceRequest;Ltp4;)Ljava/lang/Object;", "", "deviceId", "Lcom/anthropic/claude/api/trusteddevice/RotateReattestRequest;", "Lcom/anthropic/claude/api/trusteddevice/RotateReattestResponse;", "a", "(Ljava/lang/String;Lcom/anthropic/claude/api/trusteddevice/RotateReattestRequest;Ltp4;)Ljava/lang/Object;", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
public interface v7i {
    @smc("auth/trusted_devices/{device_id}/rotate_reattest")
    Object a(@ouc("device_id") String str, @ft1 RotateReattestRequest rotateReattestRequest, tp4<? super ApiResult<RotateReattestResponse>> tp4Var);

    @smc("auth/trusted_devices")
    Object b(@ft1 EnrollTrustedDeviceRequest enrollTrustedDeviceRequest, tp4<? super ApiResult<EnrollTrustedDeviceResponse>> tp4Var);
}
