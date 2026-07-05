package com.anthropic.claude.api.mcp;

import com.anthropic.claude.types.strings.McpServerId;
import defpackage.gvj;
import defpackage.i3b;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.p3b;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import defpackage.y11;
import defpackage.z11;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+,B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ$\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0017J\u0010\u0010 \u001a\u00020\bHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010\u001a¨\u0006-"}, d2 = {"Lcom/anthropic/claude/api/mcp/AttachMcpResourceRequest;", "", "Lcom/anthropic/claude/types/strings/McpServerId;", "server_uuid", "Lcom/anthropic/claude/api/mcp/McpResourceReference;", "resource", "<init>", "(Ljava/lang/String;Lcom/anthropic/claude/api/mcp/McpResourceReference;Lmq5;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/anthropic/claude/api/mcp/McpResourceReference;Lvnf;Lmq5;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/mcp/AttachMcpResourceRequest;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1-owoRr7k", "()Ljava/lang/String;", "component1", "component2", "()Lcom/anthropic/claude/api/mcp/McpResourceReference;", "copy-l3aBY8c", "(Ljava/lang/String;Lcom/anthropic/claude/api/mcp/McpResourceReference;)Lcom/anthropic/claude/api/mcp/AttachMcpResourceRequest;", "copy", "", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getServer_uuid-owoRr7k", "Lcom/anthropic/claude/api/mcp/McpResourceReference;", "getResource", "Companion", "y11", "z11", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class AttachMcpResourceRequest {
    public static final int $stable = 0;
    public static final z11 Companion = new z11();
    private final McpResourceReference resource;
    private final String server_uuid;

    private /* synthetic */ AttachMcpResourceRequest(int i, String str, McpResourceReference mcpResourceReference, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, y11.a.getDescriptor());
            throw null;
        }
        this.server_uuid = str;
        this.resource = mcpResourceReference;
    }

    /* JADX INFO: renamed from: copy-l3aBY8c$default, reason: not valid java name */
    public static /* synthetic */ AttachMcpResourceRequest m331copyl3aBY8c$default(AttachMcpResourceRequest attachMcpResourceRequest, String str, McpResourceReference mcpResourceReference, int i, Object obj) {
        if ((i & 1) != 0) {
            str = attachMcpResourceRequest.server_uuid;
        }
        if ((i & 2) != 0) {
            mcpResourceReference = attachMcpResourceRequest.resource;
        }
        return attachMcpResourceRequest.m333copyl3aBY8c(str, mcpResourceReference);
    }

    public static final /* synthetic */ void write$Self$api(AttachMcpResourceRequest self, vd4 output, SerialDescriptor serialDesc) {
        output.r(serialDesc, 0, p3b.a, McpServerId.m1029boximpl(self.server_uuid));
        output.r(serialDesc, 1, i3b.a, self.resource);
    }

    /* JADX INFO: renamed from: component1-owoRr7k, reason: not valid java name and from getter */
    public final String getServer_uuid() {
        return this.server_uuid;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final McpResourceReference getResource() {
        return this.resource;
    }

    /* JADX INFO: renamed from: copy-l3aBY8c, reason: not valid java name */
    public final AttachMcpResourceRequest m333copyl3aBY8c(String server_uuid, McpResourceReference resource) {
        server_uuid.getClass();
        resource.getClass();
        return new AttachMcpResourceRequest(server_uuid, resource, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AttachMcpResourceRequest)) {
            return false;
        }
        AttachMcpResourceRequest attachMcpResourceRequest = (AttachMcpResourceRequest) other;
        return McpServerId.m1032equalsimpl0(this.server_uuid, attachMcpResourceRequest.server_uuid) && x44.r(this.resource, attachMcpResourceRequest.resource);
    }

    public final McpResourceReference getResource() {
        return this.resource;
    }

    /* JADX INFO: renamed from: getServer_uuid-owoRr7k, reason: not valid java name */
    public final String m334getServer_uuidowoRr7k() {
        return this.server_uuid;
    }

    public int hashCode() {
        return this.resource.hashCode() + (McpServerId.m1033hashCodeimpl(this.server_uuid) * 31);
    }

    public String toString() {
        return "AttachMcpResourceRequest(server_uuid=" + McpServerId.m1034toStringimpl(this.server_uuid) + ", resource=" + this.resource + ")";
    }

    public /* synthetic */ AttachMcpResourceRequest(String str, McpResourceReference mcpResourceReference, mq5 mq5Var) {
        this(str, mcpResourceReference);
    }

    public /* synthetic */ AttachMcpResourceRequest(int i, String str, McpResourceReference mcpResourceReference, vnf vnfVar, mq5 mq5Var) {
        this(i, str, mcpResourceReference, vnfVar);
    }

    private AttachMcpResourceRequest(String str, McpResourceReference mcpResourceReference) {
        str.getClass();
        mcpResourceReference.getClass();
        this.server_uuid = str;
        this.resource = mcpResourceReference;
    }
}
