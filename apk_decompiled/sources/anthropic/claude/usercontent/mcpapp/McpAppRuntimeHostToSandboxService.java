package anthropic.claude.usercontent.mcpapp;

import anthropic.claude.usercontent.sandbox.wire_format.Request;
import com.squareup.wire.AnyMessage;
import defpackage.knk;
import defpackage.mdj;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u000b2\b\b\u0002\u0010\n\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lanthropic/claude/usercontent/mcpapp/McpAppRuntimeHostToSandboxService;", "", "<init>", "()V", "RenderMcpApp", "", "BridgeToSandbox", "Lanthropic/claude/usercontent/sandbox/wire_format/Request;", "payload", "Lanthropic/claude/usercontent/mcpapp/RenderMcpAppRequest;", "requestId", "Lanthropic/claude/usercontent/mcpapp/JsonRpcEnvelope;", "Claude:protos"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
public final class McpAppRuntimeHostToSandboxService {
    public static final String BridgeToSandbox = "anthropic.claude.usercontent.mcpapp.BridgeToSandbox";
    public static final McpAppRuntimeHostToSandboxService INSTANCE = new McpAppRuntimeHostToSandboxService();
    public static final String RenderMcpApp = "anthropic.claude.usercontent.mcpapp.RenderMcpApp";

    private McpAppRuntimeHostToSandboxService() {
    }

    public static /* synthetic */ Request BridgeToSandbox$default(McpAppRuntimeHostToSandboxService mcpAppRuntimeHostToSandboxService, JsonRpcEnvelope jsonRpcEnvelope, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = knk.F().toString();
        }
        return mcpAppRuntimeHostToSandboxService.BridgeToSandbox(jsonRpcEnvelope, str);
    }

    public static /* synthetic */ Request RenderMcpApp$default(McpAppRuntimeHostToSandboxService mcpAppRuntimeHostToSandboxService, RenderMcpAppRequest renderMcpAppRequest, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = knk.F().toString();
        }
        return mcpAppRuntimeHostToSandboxService.RenderMcpApp(renderMcpAppRequest, str);
    }

    public final Request BridgeToSandbox(JsonRpcEnvelope payload, String requestId) {
        payload.getClass();
        requestId.getClass();
        return new Request("request", requestId, BridgeToSandbox, AnyMessage.INSTANCE.pack(payload), null, 16, null);
    }

    public final Request RenderMcpApp(RenderMcpAppRequest payload, String requestId) {
        payload.getClass();
        requestId.getClass();
        return new Request("request", requestId, RenderMcpApp, AnyMessage.INSTANCE.pack(payload), null, 16, null);
    }
}
