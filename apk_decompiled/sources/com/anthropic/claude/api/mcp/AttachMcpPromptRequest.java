package com.anthropic.claude.api.mcp;

import com.anthropic.claude.types.strings.McpServerId;
import defpackage.ew0;
import defpackage.f7a;
import defpackage.gvj;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.p3b;
import defpackage.qy1;
import defpackage.srg;
import defpackage.u11;
import defpackage.v11;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.yb5;
import defpackage.z2b;
import defpackage.znf;
import java.util.Map;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000212B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nBE\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u001c\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ:\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b#\u0010\u001aJ\u0010\u0010$\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b-\u0010\u001dR#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b/\u0010\u001f¨\u00063"}, d2 = {"Lcom/anthropic/claude/api/mcp/AttachMcpPromptRequest;", "", "Lcom/anthropic/claude/types/strings/McpServerId;", "server_uuid", "Lcom/anthropic/claude/api/mcp/McpPromptReference;", "prompt", "", "", "arguments", "<init>", "(Ljava/lang/String;Lcom/anthropic/claude/api/mcp/McpPromptReference;Ljava/util/Map;Lmq5;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/anthropic/claude/api/mcp/McpPromptReference;Ljava/util/Map;Lvnf;Lmq5;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/mcp/AttachMcpPromptRequest;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1-owoRr7k", "()Ljava/lang/String;", "component1", "component2", "()Lcom/anthropic/claude/api/mcp/McpPromptReference;", "component3", "()Ljava/util/Map;", "copy-6mZEJ4o", "(Ljava/lang/String;Lcom/anthropic/claude/api/mcp/McpPromptReference;Ljava/util/Map;)Lcom/anthropic/claude/api/mcp/AttachMcpPromptRequest;", "copy", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getServer_uuid-owoRr7k", "Lcom/anthropic/claude/api/mcp/McpPromptReference;", "getPrompt", "Ljava/util/Map;", "getArguments", "Companion", "u11", "v11", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class AttachMcpPromptRequest {
    public static final int $stable = 0;
    private final Map<String, String> arguments;
    private final McpPromptReference prompt;
    private final String server_uuid;
    public static final v11 Companion = new v11();
    private static final kw9[] $childSerializers = {null, null, yb5.w(w1a.F, new ew0(2))};

    private /* synthetic */ AttachMcpPromptRequest(int i, String str, McpPromptReference mcpPromptReference, Map map, vnf vnfVar) {
        if (7 != (i & 7)) {
            gvj.f(i, 7, u11.a.getDescriptor());
            throw null;
        }
        this.server_uuid = str;
        this.prompt = mcpPromptReference;
        this.arguments = map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        srg srgVar = srg.a;
        return new f7a(srgVar, srgVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: copy-6mZEJ4o$default, reason: not valid java name */
    public static /* synthetic */ AttachMcpPromptRequest m327copy6mZEJ4o$default(AttachMcpPromptRequest attachMcpPromptRequest, String str, McpPromptReference mcpPromptReference, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = attachMcpPromptRequest.server_uuid;
        }
        if ((i & 2) != 0) {
            mcpPromptReference = attachMcpPromptRequest.prompt;
        }
        if ((i & 4) != 0) {
            map = attachMcpPromptRequest.arguments;
        }
        return attachMcpPromptRequest.m329copy6mZEJ4o(str, mcpPromptReference, map);
    }

    public static final /* synthetic */ void write$Self$api(AttachMcpPromptRequest self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.r(serialDesc, 0, p3b.a, McpServerId.m1029boximpl(self.server_uuid));
        output.r(serialDesc, 1, z2b.a, self.prompt);
        output.r(serialDesc, 2, (znf) kw9VarArr[2].getValue(), self.arguments);
    }

    /* JADX INFO: renamed from: component1-owoRr7k, reason: not valid java name and from getter */
    public final String getServer_uuid() {
        return this.server_uuid;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final McpPromptReference getPrompt() {
        return this.prompt;
    }

    public final Map<String, String> component3() {
        return this.arguments;
    }

    /* JADX INFO: renamed from: copy-6mZEJ4o, reason: not valid java name */
    public final AttachMcpPromptRequest m329copy6mZEJ4o(String server_uuid, McpPromptReference prompt, Map<String, String> arguments) {
        server_uuid.getClass();
        prompt.getClass();
        arguments.getClass();
        return new AttachMcpPromptRequest(server_uuid, prompt, arguments, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AttachMcpPromptRequest)) {
            return false;
        }
        AttachMcpPromptRequest attachMcpPromptRequest = (AttachMcpPromptRequest) other;
        return McpServerId.m1032equalsimpl0(this.server_uuid, attachMcpPromptRequest.server_uuid) && x44.r(this.prompt, attachMcpPromptRequest.prompt) && x44.r(this.arguments, attachMcpPromptRequest.arguments);
    }

    public final Map<String, String> getArguments() {
        return this.arguments;
    }

    public final McpPromptReference getPrompt() {
        return this.prompt;
    }

    /* JADX INFO: renamed from: getServer_uuid-owoRr7k, reason: not valid java name */
    public final String m330getServer_uuidowoRr7k() {
        return this.server_uuid;
    }

    public int hashCode() {
        return this.arguments.hashCode() + ((this.prompt.hashCode() + (McpServerId.m1033hashCodeimpl(this.server_uuid) * 31)) * 31);
    }

    public String toString() {
        String strM1034toStringimpl = McpServerId.m1034toStringimpl(this.server_uuid);
        McpPromptReference mcpPromptReference = this.prompt;
        Map<String, String> map = this.arguments;
        StringBuilder sb = new StringBuilder("AttachMcpPromptRequest(server_uuid=");
        sb.append(strM1034toStringimpl);
        sb.append(", prompt=");
        sb.append(mcpPromptReference);
        sb.append(", arguments=");
        return qy1.i(sb, map, ")");
    }

    public /* synthetic */ AttachMcpPromptRequest(String str, McpPromptReference mcpPromptReference, Map map, mq5 mq5Var) {
        this(str, mcpPromptReference, map);
    }

    public /* synthetic */ AttachMcpPromptRequest(int i, String str, McpPromptReference mcpPromptReference, Map map, vnf vnfVar, mq5 mq5Var) {
        this(i, str, mcpPromptReference, map, vnfVar);
    }

    private AttachMcpPromptRequest(String str, McpPromptReference mcpPromptReference, Map<String, String> map) {
        str.getClass();
        mcpPromptReference.getClass();
        map.getClass();
        this.server_uuid = str;
        this.prompt = mcpPromptReference;
        this.arguments = map;
    }
}
