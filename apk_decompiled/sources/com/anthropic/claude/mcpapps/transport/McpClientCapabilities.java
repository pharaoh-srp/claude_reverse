package com.anthropic.claude.mcpapps.transport;

import defpackage.k2b;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.n0b;
import defpackage.onf;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002$%B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001c\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0015¨\u0006&"}, d2 = {"Lcom/anthropic/claude/mcpapps/transport/McpClientCapabilities;", "", "Lcom/anthropic/claude/mcpapps/transport/McpExtensions;", "extensions", "<init>", "(Lcom/anthropic/claude/mcpapps/transport/McpExtensions;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/mcpapps/transport/McpExtensions;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$Claude_mcpapp", "(Lcom/anthropic/claude/mcpapps/transport/McpClientCapabilities;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/anthropic/claude/mcpapps/transport/McpExtensions;", "copy", "(Lcom/anthropic/claude/mcpapps/transport/McpExtensions;)Lcom/anthropic/claude/mcpapps/transport/McpClientCapabilities;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/anthropic/claude/mcpapps/transport/McpExtensions;", "getExtensions", "Companion", "m0b", "n0b", "Claude:mcpapp"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class McpClientCapabilities {
    public static final int $stable = 8;
    public static final n0b Companion = new n0b();
    private final McpExtensions extensions;

    public /* synthetic */ McpClientCapabilities(int i, McpExtensions mcpExtensions, vnf vnfVar) {
        if ((i & 1) == 0) {
            this.extensions = null;
        } else {
            this.extensions = mcpExtensions;
        }
    }

    public static /* synthetic */ McpClientCapabilities copy$default(McpClientCapabilities mcpClientCapabilities, McpExtensions mcpExtensions, int i, Object obj) {
        if ((i & 1) != 0) {
            mcpExtensions = mcpClientCapabilities.extensions;
        }
        return mcpClientCapabilities.copy(mcpExtensions);
    }

    public static final /* synthetic */ void write$Self$Claude_mcpapp(McpClientCapabilities self, vd4 output, SerialDescriptor serialDesc) {
        if (!output.E(serialDesc) && self.extensions == null) {
            return;
        }
        output.B(serialDesc, 0, k2b.a, self.extensions);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final McpExtensions getExtensions() {
        return this.extensions;
    }

    public final McpClientCapabilities copy(McpExtensions extensions) {
        return new McpClientCapabilities(extensions);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof McpClientCapabilities) && x44.r(this.extensions, ((McpClientCapabilities) other).extensions);
    }

    public final McpExtensions getExtensions() {
        return this.extensions;
    }

    public int hashCode() {
        McpExtensions mcpExtensions = this.extensions;
        if (mcpExtensions == null) {
            return 0;
        }
        return mcpExtensions.hashCode();
    }

    public String toString() {
        return "McpClientCapabilities(extensions=" + this.extensions + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public McpClientCapabilities() {
        this((McpExtensions) null, 1, (mq5) (0 == true ? 1 : 0));
    }

    public McpClientCapabilities(McpExtensions mcpExtensions) {
        this.extensions = mcpExtensions;
    }

    public /* synthetic */ McpClientCapabilities(McpExtensions mcpExtensions, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : mcpExtensions);
    }
}
