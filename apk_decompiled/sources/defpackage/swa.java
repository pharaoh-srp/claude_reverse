package defpackage;

import com.anthropic.claude.api.mcp.AttachMcpPromptRequest;
import com.anthropic.claude.api.mcp.AttachMcpPromptResourceResponse;
import com.anthropic.claude.api.mcp.AttachMcpResourceRequest;
import com.anthropic.claude.api.mcp.CompleteMcpAuthResponse;
import com.anthropic.claude.api.mcp.CreateMcpRemoteServerRequest;
import com.anthropic.claude.api.mcp.CreateMcpRemoteServerResponse;
import com.anthropic.claude.api.mcp.DirectoryServerListResponse;
import com.anthropic.claude.api.mcp.McpServer;
import com.anthropic.claude.api.mcp.StartMcpAuthResponse;
import com.anthropic.claude.api.result.ApiResult;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J&\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u000e\u001a\u00020\rH§@¢\u0006\u0004\b\u0010\u0010\u0011J*\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u000e\u001a\u00020\u0012H§@¢\u0006\u0004\b\u0013\u0010\u0014JV\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0016\u001a\u00020\u00152\b\b\u0003\u0010\u0018\u001a\u00020\u00172\b\b\u0003\u0010\u0019\u001a\u00020\u00172\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0003\u0010\u001d\u001a\u0004\u0018\u00010\u001cH§@¢\u0006\u0004\b\u001f\u0010 J4\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u00042\b\b\u0001\u0010!\u001a\u00020\u00172\b\b\u0001\u0010\"\u001a\u00020\u00172\b\b\u0003\u0010\u0019\u001a\u00020\u0017H§@¢\u0006\u0004\b$\u0010%J*\u0010&\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0016\u001a\u00020\u0015H§@¢\u0006\u0004\b&\u0010'J*\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u000e\u001a\u00020(H§@¢\u0006\u0004\b*\u0010+Jt\u00106\u001a\b\u0012\u0004\u0012\u0002050\u00042\b\b\u0003\u0010,\u001a\u00020\u00172\n\b\u0003\u0010-\u001a\u0004\u0018\u00010\u00172\n\b\u0003\u0010.\u001a\u0004\u0018\u00010\u00172\n\b\u0003\u00100\u001a\u0004\u0018\u00010/2\n\b\u0003\u00101\u001a\u0004\u0018\u00010\u00172\n\b\u0003\u00102\u001a\u0004\u0018\u00010\u00172\n\b\u0003\u00103\u001a\u0004\u0018\u00010\u00172\n\b\u0003\u00104\u001a\u0004\u0018\u00010\u0017H§@¢\u0006\u0004\b6\u00107¨\u00068À\u0006\u0003"}, d2 = {"Lswa;", "", "Lcom/anthropic/claude/types/strings/OrganizationId;", "organization", "Lcom/anthropic/claude/api/result/ApiResult;", "", "Lcom/anthropic/claude/api/mcp/McpServer;", "h", "(Ljava/lang/String;Ltp4;)Ljava/lang/Object;", "Lu82;", "Liei;", "f", "(Ljava/lang/String;)Lu82;", "Lcom/anthropic/claude/api/mcp/AttachMcpPromptRequest;", "request", "Lcom/anthropic/claude/api/mcp/AttachMcpPromptResourceResponse;", "a", "(Ljava/lang/String;Lcom/anthropic/claude/api/mcp/AttachMcpPromptRequest;Ltp4;)Ljava/lang/Object;", "Lcom/anthropic/claude/api/mcp/AttachMcpResourceRequest;", "e", "(Ljava/lang/String;Lcom/anthropic/claude/api/mcp/AttachMcpResourceRequest;Ltp4;)Ljava/lang/Object;", "Lcom/anthropic/claude/types/strings/McpServerId;", "serverId", "", "productSurface", "responseFormat", "Lcom/anthropic/claude/types/strings/ChatId;", "chatId", "Lcom/anthropic/claude/types/strings/ToolUseId;", "toolUseId", "Lcom/anthropic/claude/api/mcp/StartMcpAuthResponse;", "g", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ltp4;)Ljava/lang/Object;", "code", "state", "Lcom/anthropic/claude/api/mcp/CompleteMcpAuthResponse;", "i", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ltp4;)Ljava/lang/Object;", "c", "(Ljava/lang/String;Ljava/lang/String;Ltp4;)Ljava/lang/Object;", "Lcom/anthropic/claude/api/mcp/CreateMcpRemoteServerRequest;", "Lcom/anthropic/claude/api/mcp/CreateMcpRemoteServerResponse;", "d", "(Ljava/lang/String;Lcom/anthropic/claude/api/mcp/CreateMcpRemoteServerRequest;Ltp4;)Ljava/lang/Object;", "url", "visibility", "sort", "", "limit", "q", "cursor", "category", "type", "Lcom/anthropic/claude/api/mcp/DirectoryServerListResponse;", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ltp4;)Ljava/lang/Object;", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
public interface swa {
    @smc("organizations/{organization}/mcp/attach_prompt")
    Object a(@ouc("organization") String str, @ft1 AttachMcpPromptRequest attachMcpPromptRequest, tp4<? super ApiResult<AttachMcpPromptResourceResponse>> tp4Var);

    @u08
    Object b(@gli String str, @tzd("visibility") String str2, @tzd("sort") String str3, @tzd("limit") Integer num, @tzd("q") String str4, @tzd("cursor") String str5, @tzd("category") String str6, @tzd("type") String str7, tp4<? super ApiResult<DirectoryServerListResponse>> tp4Var);

    @smc("organizations/{organization}/mcp/logout/{server}")
    Object c(@ouc("organization") String str, @ouc("server") String str2, tp4<? super ApiResult<iei>> tp4Var);

    @smc("organizations/{organization}/mcp/remote_servers")
    Object d(@ouc("organization") String str, @ft1 CreateMcpRemoteServerRequest createMcpRemoteServerRequest, tp4<? super ApiResult<CreateMcpRemoteServerResponse>> tp4Var);

    @smc("organizations/{organization}/mcp/attach_resource")
    Object e(@ouc("organization") String str, @ft1 AttachMcpResourceRequest attachMcpResourceRequest, tp4<? super ApiResult<AttachMcpPromptResourceResponse>> tp4Var);

    @lqg
    @u08("organizations/{organization}/mcp/v2/bootstrap")
    @vg8({"Accept: text/event-stream"})
    u82<iei> f(@ouc("organization") String organization);

    @u08("organizations/{organization}/mcp/start-auth/{server}")
    Object g(@ouc("organization") String str, @ouc("server") String str2, @tzd("product_surface") String str3, @tzd("response_format") String str4, @tzd("conversation_uuid") String str5, @tzd("tool_use_id") String str6, tp4<? super ApiResult<StartMcpAuthResponse>> tp4Var);

    @u08("organizations/{organization}/mcp/bootstrap")
    Object h(@ouc("organization") String str, tp4<? super ApiResult<? extends List<McpServer>>> tp4Var);

    @u08("mcp/auth_callback")
    Object i(@tzd("code") String str, @tzd("state") String str2, @tzd("response_format") String str3, tp4<? super ApiResult<CompleteMcpAuthResponse>> tp4Var);
}
