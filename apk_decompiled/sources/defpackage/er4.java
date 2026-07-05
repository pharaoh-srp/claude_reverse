package defpackage;

import com.anthropic.claude.api.conway.CreateWebhookRequest;
import com.anthropic.claude.api.conway.CreateWebhookResponse;
import com.anthropic.claude.api.conway.HeartbeatRecord;
import com.anthropic.claude.api.conway.RefreshMcpRequest;
import com.anthropic.claude.api.conway.UpdateWebhookRequest;
import com.anthropic.claude.api.conway.UpdateWebhookResponse;
import com.anthropic.claude.api.conway.WebhookRecord;
import com.anthropic.claude.api.result.ApiResult;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J&\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\tH§@¢\u0006\u0004\b\f\u0010\rJ4\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\n\u001a\u00020\u0010H§@¢\u0006\u0004\b\u0012\u0010\u0013J*\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u000f\u001a\u00020\u000eH§@¢\u0006\u0004\b\u0015\u0010\u0016J*\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00140\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u0017H§@¢\u0006\u0004\b\u0018\u0010\u0019J&\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u001b\u0010\bJ*\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00140\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u001c\u001a\u00020\u000eH§@¢\u0006\u0004\b\u001d\u0010\u0016J*\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00140\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u001c\u001a\u00020\u000eH§@¢\u0006\u0004\b\u001e\u0010\u0016J*\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00140\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u001c\u001a\u00020\u000eH§@¢\u0006\u0004\b\u001f\u0010\u0016¨\u0006 À\u0006\u0003"}, d2 = {"Ler4;", "", "Lcom/anthropic/claude/types/strings/OrganizationId;", "organizationId", "Lcom/anthropic/claude/api/result/ApiResult;", "", "Lcom/anthropic/claude/api/conway/WebhookRecord;", "i", "(Ljava/lang/String;Ltp4;)Ljava/lang/Object;", "Lcom/anthropic/claude/api/conway/CreateWebhookRequest;", "body", "Lcom/anthropic/claude/api/conway/CreateWebhookResponse;", "e", "(Ljava/lang/String;Lcom/anthropic/claude/api/conway/CreateWebhookRequest;Ltp4;)Ljava/lang/Object;", "", "token", "Lcom/anthropic/claude/api/conway/UpdateWebhookRequest;", "Lcom/anthropic/claude/api/conway/UpdateWebhookResponse;", "d", "(Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/api/conway/UpdateWebhookRequest;Ltp4;)Ljava/lang/Object;", "Liei;", "c", "(Ljava/lang/String;Ljava/lang/String;Ltp4;)Ljava/lang/Object;", "Lcom/anthropic/claude/api/conway/RefreshMcpRequest;", "g", "(Ljava/lang/String;Lcom/anthropic/claude/api/conway/RefreshMcpRequest;Ltp4;)Ljava/lang/Object;", "Lcom/anthropic/claude/api/conway/HeartbeatRecord;", "f", "name", "h", "b", "a", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
public interface er4 {
    @smc("/sandbox/conway/heartbeats/{name}/resume")
    Object a(@sg8("x-organization-uuid") String str, @ouc("name") String str2, tp4<? super ApiResult<iei>> tp4Var);

    @smc("/sandbox/conway/heartbeats/{name}/pause")
    Object b(@sg8("x-organization-uuid") String str, @ouc("name") String str2, tp4<? super ApiResult<iei>> tp4Var);

    @ff5("/sandbox/conway/webhooks/{token}")
    Object c(@sg8("x-organization-uuid") String str, @ouc("token") String str2, tp4<? super ApiResult<iei>> tp4Var);

    @rmc("/sandbox/conway/webhooks/{token}")
    Object d(@sg8("x-organization-uuid") String str, @ouc("token") String str2, @ft1 UpdateWebhookRequest updateWebhookRequest, tp4<? super ApiResult<UpdateWebhookResponse>> tp4Var);

    @smc("/sandbox/conway/webhooks")
    Object e(@sg8("x-organization-uuid") String str, @ft1 CreateWebhookRequest createWebhookRequest, tp4<? super ApiResult<CreateWebhookResponse>> tp4Var);

    @u08("/sandbox/conway/heartbeats")
    Object f(@sg8("x-organization-uuid") String str, tp4<? super ApiResult<? extends List<HeartbeatRecord>>> tp4Var);

    @smc("/sandbox/conway/refresh_mcp")
    Object g(@sg8("x-organization-uuid") String str, @ft1 RefreshMcpRequest refreshMcpRequest, tp4<? super ApiResult<iei>> tp4Var);

    @ff5("/sandbox/conway/heartbeats/{name}")
    Object h(@sg8("x-organization-uuid") String str, @ouc("name") String str2, tp4<? super ApiResult<iei>> tp4Var);

    @u08("/sandbox/conway/webhooks")
    Object i(@sg8("x-organization-uuid") String str, tp4<? super ApiResult<? extends List<WebhookRecord>>> tp4Var);
}
