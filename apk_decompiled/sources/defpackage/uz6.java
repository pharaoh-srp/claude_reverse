package defpackage;

import com.anthropic.claude.api.events.BatchEventLoggingRequest;
import com.anthropic.claude.api.events.BatchEventLoggingResponse;
import com.anthropic.claude.api.result.ApiResult;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\b\u0010\tJ \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\n\u0010\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Luz6;", "", "", "organizationUuid", "Lcom/anthropic/claude/api/events/BatchEventLoggingRequest;", "request", "Lcom/anthropic/claude/api/result/ApiResult;", "Lcom/anthropic/claude/api/events/BatchEventLoggingResponse;", "a", "(Ljava/lang/String;Lcom/anthropic/claude/api/events/BatchEventLoggingRequest;Ltp4;)Ljava/lang/Object;", "b", "(Lcom/anthropic/claude/api/events/BatchEventLoggingRequest;Ltp4;)Ljava/lang/Object;", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
public interface uz6 {
    @smc("event_logging/v2/batch")
    @vg8({"x-service-name: claude-android"})
    Object a(@sg8("x-organization-uuid") String str, @ft1 BatchEventLoggingRequest batchEventLoggingRequest, tp4<? super ApiResult<BatchEventLoggingResponse>> tp4Var);

    @smc("event_logging/v2/batch")
    @vg8({"x-service-name: claude-android"})
    Object b(@ft1 BatchEventLoggingRequest batchEventLoggingRequest, tp4<? super ApiResult<BatchEventLoggingResponse>> tp4Var);
}
