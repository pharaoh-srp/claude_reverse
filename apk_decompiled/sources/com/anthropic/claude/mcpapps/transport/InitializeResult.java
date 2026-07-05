package com.anthropic.claude.mcpapps.transport;

import defpackage.ap8;
import defpackage.dp8;
import defpackage.gvj;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.r29;
import defpackage.s29;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import defpackage.yo8;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000245B-\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bBC\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\bHÆ\u0003¢\u0006\u0004\b \u0010!J8\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u001bJ\u0010\u0010%\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b.\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010/\u001a\u0004\b0\u0010\u001fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00101\u001a\u0004\b2\u0010!¨\u00066"}, d2 = {"Lcom/anthropic/claude/mcpapps/transport/InitializeResult;", "", "", "protocolVersion", "Lcom/anthropic/claude/mcpapps/transport/HostInfo;", "hostInfo", "Lcom/anthropic/claude/mcpapps/transport/HostCapabilities;", "hostCapabilities", "Lcom/anthropic/claude/mcpapps/transport/HostContext;", "hostContext", "<init>", "(Ljava/lang/String;Lcom/anthropic/claude/mcpapps/transport/HostInfo;Lcom/anthropic/claude/mcpapps/transport/HostCapabilities;Lcom/anthropic/claude/mcpapps/transport/HostContext;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/anthropic/claude/mcpapps/transport/HostInfo;Lcom/anthropic/claude/mcpapps/transport/HostCapabilities;Lcom/anthropic/claude/mcpapps/transport/HostContext;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$Claude_mcpapp", "(Lcom/anthropic/claude/mcpapps/transport/InitializeResult;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/anthropic/claude/mcpapps/transport/HostInfo;", "component3", "()Lcom/anthropic/claude/mcpapps/transport/HostCapabilities;", "component4", "()Lcom/anthropic/claude/mcpapps/transport/HostContext;", "copy", "(Ljava/lang/String;Lcom/anthropic/claude/mcpapps/transport/HostInfo;Lcom/anthropic/claude/mcpapps/transport/HostCapabilities;Lcom/anthropic/claude/mcpapps/transport/HostContext;)Lcom/anthropic/claude/mcpapps/transport/InitializeResult;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getProtocolVersion", "Lcom/anthropic/claude/mcpapps/transport/HostInfo;", "getHostInfo", "Lcom/anthropic/claude/mcpapps/transport/HostCapabilities;", "getHostCapabilities", "Lcom/anthropic/claude/mcpapps/transport/HostContext;", "getHostContext", "Companion", "r29", "s29", "Claude:mcpapp"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class InitializeResult {
    public static final int $stable = 8;
    public static final s29 Companion = new s29();
    private final HostCapabilities hostCapabilities;
    private final HostContext hostContext;
    private final HostInfo hostInfo;
    private final String protocolVersion;

    public /* synthetic */ InitializeResult(int i, String str, HostInfo hostInfo, HostCapabilities hostCapabilities, HostContext hostContext, vnf vnfVar) {
        if (2 != (i & 2)) {
            gvj.f(i, 2, r29.a.getDescriptor());
            throw null;
        }
        this.protocolVersion = (i & 1) == 0 ? "2026-01-26" : str;
        this.hostInfo = hostInfo;
        if ((i & 4) == 0) {
            this.hostCapabilities = new HostCapabilities((JsonObject) null, (JsonObject) null, (JsonObject) null, (JsonObject) null, (HostUpdateModelContextCapability) null, (HostMessageCapability) null, 63, (mq5) null);
        } else {
            this.hostCapabilities = hostCapabilities;
        }
        if ((i & 8) == 0) {
            this.hostContext = new HostContext((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (ContainerDimensions) null, (DeviceCapabilities) null, (SafeAreaInsets) null, (JsonObject) null, (ToolInfo) null, 4095, (mq5) null);
        } else {
            this.hostContext = hostContext;
        }
    }

    public static /* synthetic */ InitializeResult copy$default(InitializeResult initializeResult, String str, HostInfo hostInfo, HostCapabilities hostCapabilities, HostContext hostContext, int i, Object obj) {
        if ((i & 1) != 0) {
            str = initializeResult.protocolVersion;
        }
        if ((i & 2) != 0) {
            hostInfo = initializeResult.hostInfo;
        }
        if ((i & 4) != 0) {
            hostCapabilities = initializeResult.hostCapabilities;
        }
        if ((i & 8) != 0) {
            hostContext = initializeResult.hostContext;
        }
        return initializeResult.copy(str, hostInfo, hostCapabilities, hostContext);
    }

    public static final /* synthetic */ void write$Self$Claude_mcpapp(InitializeResult self, vd4 output, SerialDescriptor serialDesc) {
        if (output.E(serialDesc) || !x44.r(self.protocolVersion, "2026-01-26")) {
            output.q(serialDesc, 0, self.protocolVersion);
        }
        output.r(serialDesc, 1, dp8.a, self.hostInfo);
        if (output.E(serialDesc) || !x44.r(self.hostCapabilities, new HostCapabilities((JsonObject) null, (JsonObject) null, (JsonObject) null, (JsonObject) null, (HostUpdateModelContextCapability) null, (HostMessageCapability) null, 63, (mq5) null))) {
            output.r(serialDesc, 2, yo8.a, self.hostCapabilities);
        }
        if (!output.E(serialDesc)) {
            if (x44.r(self.hostContext, new HostContext((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (ContainerDimensions) null, (DeviceCapabilities) null, (SafeAreaInsets) null, (JsonObject) null, (ToolInfo) null, 4095, (mq5) null))) {
                return;
            }
        }
        output.r(serialDesc, 3, ap8.a, self.hostContext);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getProtocolVersion() {
        return this.protocolVersion;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final HostInfo getHostInfo() {
        return this.hostInfo;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final HostCapabilities getHostCapabilities() {
        return this.hostCapabilities;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final HostContext getHostContext() {
        return this.hostContext;
    }

    public final InitializeResult copy(String protocolVersion, HostInfo hostInfo, HostCapabilities hostCapabilities, HostContext hostContext) {
        protocolVersion.getClass();
        hostInfo.getClass();
        hostCapabilities.getClass();
        hostContext.getClass();
        return new InitializeResult(protocolVersion, hostInfo, hostCapabilities, hostContext);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InitializeResult)) {
            return false;
        }
        InitializeResult initializeResult = (InitializeResult) other;
        return x44.r(this.protocolVersion, initializeResult.protocolVersion) && x44.r(this.hostInfo, initializeResult.hostInfo) && x44.r(this.hostCapabilities, initializeResult.hostCapabilities) && x44.r(this.hostContext, initializeResult.hostContext);
    }

    public final HostCapabilities getHostCapabilities() {
        return this.hostCapabilities;
    }

    public final HostContext getHostContext() {
        return this.hostContext;
    }

    public final HostInfo getHostInfo() {
        return this.hostInfo;
    }

    public final String getProtocolVersion() {
        return this.protocolVersion;
    }

    public int hashCode() {
        return this.hostContext.hashCode() + ((this.hostCapabilities.hashCode() + ((this.hostInfo.hashCode() + (this.protocolVersion.hashCode() * 31)) * 31)) * 31);
    }

    public String toString() {
        return "InitializeResult(protocolVersion=" + this.protocolVersion + ", hostInfo=" + this.hostInfo + ", hostCapabilities=" + this.hostCapabilities + ", hostContext=" + this.hostContext + ")";
    }

    public InitializeResult(String str, HostInfo hostInfo, HostCapabilities hostCapabilities, HostContext hostContext) {
        str.getClass();
        hostInfo.getClass();
        hostCapabilities.getClass();
        hostContext.getClass();
        this.protocolVersion = str;
        this.hostInfo = hostInfo;
        this.hostCapabilities = hostCapabilities;
        this.hostContext = hostContext;
    }

    public /* synthetic */ InitializeResult(String str, HostInfo hostInfo, HostCapabilities hostCapabilities, HostContext hostContext, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? "2026-01-26" : str, hostInfo, (i & 4) != 0 ? new HostCapabilities((JsonObject) null, (JsonObject) null, (JsonObject) null, (JsonObject) null, (HostUpdateModelContextCapability) null, (HostMessageCapability) null, 63, (mq5) null) : hostCapabilities, (i & 8) != 0 ? new HostContext((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (ContainerDimensions) null, (DeviceCapabilities) null, (SafeAreaInsets) null, (JsonObject) null, (ToolInfo) null, 4095, (mq5) null) : hostContext);
    }
}
