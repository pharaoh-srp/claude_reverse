package com.anthropic.claude.mcpapps.transport;

import defpackage.dp8;
import defpackage.gvj;
import defpackage.m0b;
import defpackage.m2b;
import defpackage.mdj;
import defpackage.n2b;
import defpackage.onf;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002./B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB9\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ.\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010\u001d¨\u00060"}, d2 = {"Lcom/anthropic/claude/mcpapps/transport/McpInitializeParams;", "", "", "protocolVersion", "Lcom/anthropic/claude/mcpapps/transport/McpClientCapabilities;", "capabilities", "Lcom/anthropic/claude/mcpapps/transport/HostInfo;", "clientInfo", "<init>", "(Ljava/lang/String;Lcom/anthropic/claude/mcpapps/transport/McpClientCapabilities;Lcom/anthropic/claude/mcpapps/transport/HostInfo;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/anthropic/claude/mcpapps/transport/McpClientCapabilities;Lcom/anthropic/claude/mcpapps/transport/HostInfo;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$Claude_mcpapp", "(Lcom/anthropic/claude/mcpapps/transport/McpInitializeParams;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/anthropic/claude/mcpapps/transport/McpClientCapabilities;", "component3", "()Lcom/anthropic/claude/mcpapps/transport/HostInfo;", "copy", "(Ljava/lang/String;Lcom/anthropic/claude/mcpapps/transport/McpClientCapabilities;Lcom/anthropic/claude/mcpapps/transport/HostInfo;)Lcom/anthropic/claude/mcpapps/transport/McpInitializeParams;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getProtocolVersion", "Lcom/anthropic/claude/mcpapps/transport/McpClientCapabilities;", "getCapabilities", "Lcom/anthropic/claude/mcpapps/transport/HostInfo;", "getClientInfo", "Companion", "m2b", "n2b", "Claude:mcpapp"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class McpInitializeParams {
    private final McpClientCapabilities capabilities;
    private final HostInfo clientInfo;
    private final String protocolVersion;
    public static final n2b Companion = new n2b();
    public static final int $stable = HostInfo.$stable;

    public /* synthetic */ McpInitializeParams(int i, String str, McpClientCapabilities mcpClientCapabilities, HostInfo hostInfo, vnf vnfVar) {
        if (7 != (i & 7)) {
            gvj.f(i, 7, m2b.a.getDescriptor());
            throw null;
        }
        this.protocolVersion = str;
        this.capabilities = mcpClientCapabilities;
        this.clientInfo = hostInfo;
    }

    public static /* synthetic */ McpInitializeParams copy$default(McpInitializeParams mcpInitializeParams, String str, McpClientCapabilities mcpClientCapabilities, HostInfo hostInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mcpInitializeParams.protocolVersion;
        }
        if ((i & 2) != 0) {
            mcpClientCapabilities = mcpInitializeParams.capabilities;
        }
        if ((i & 4) != 0) {
            hostInfo = mcpInitializeParams.clientInfo;
        }
        return mcpInitializeParams.copy(str, mcpClientCapabilities, hostInfo);
    }

    public static final /* synthetic */ void write$Self$Claude_mcpapp(McpInitializeParams self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.protocolVersion);
        output.r(serialDesc, 1, m0b.a, self.capabilities);
        output.r(serialDesc, 2, dp8.a, self.clientInfo);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getProtocolVersion() {
        return this.protocolVersion;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final McpClientCapabilities getCapabilities() {
        return this.capabilities;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final HostInfo getClientInfo() {
        return this.clientInfo;
    }

    public final McpInitializeParams copy(String protocolVersion, McpClientCapabilities capabilities, HostInfo clientInfo) {
        protocolVersion.getClass();
        capabilities.getClass();
        clientInfo.getClass();
        return new McpInitializeParams(protocolVersion, capabilities, clientInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof McpInitializeParams)) {
            return false;
        }
        McpInitializeParams mcpInitializeParams = (McpInitializeParams) other;
        return x44.r(this.protocolVersion, mcpInitializeParams.protocolVersion) && x44.r(this.capabilities, mcpInitializeParams.capabilities) && x44.r(this.clientInfo, mcpInitializeParams.clientInfo);
    }

    public final McpClientCapabilities getCapabilities() {
        return this.capabilities;
    }

    public final HostInfo getClientInfo() {
        return this.clientInfo;
    }

    public final String getProtocolVersion() {
        return this.protocolVersion;
    }

    public int hashCode() {
        return this.clientInfo.hashCode() + ((this.capabilities.hashCode() + (this.protocolVersion.hashCode() * 31)) * 31);
    }

    public String toString() {
        return "McpInitializeParams(protocolVersion=" + this.protocolVersion + ", capabilities=" + this.capabilities + ", clientInfo=" + this.clientInfo + ")";
    }

    public McpInitializeParams(String str, McpClientCapabilities mcpClientCapabilities, HostInfo hostInfo) {
        str.getClass();
        mcpClientCapabilities.getClass();
        hostInfo.getClass();
        this.protocolVersion = str;
        this.capabilities = mcpClientCapabilities;
        this.clientInfo = hostInfo;
    }
}
