package com.anthropic.claude.mcpapps.transport;

import defpackage.m3b;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.p2b;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002$%B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001c\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0015¨\u0006&"}, d2 = {"Lcom/anthropic/claude/mcpapps/transport/McpInitializeResult;", "", "Lcom/anthropic/claude/mcpapps/transport/McpServerCapabilities;", "capabilities", "<init>", "(Lcom/anthropic/claude/mcpapps/transport/McpServerCapabilities;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/mcpapps/transport/McpServerCapabilities;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$Claude_mcpapp", "(Lcom/anthropic/claude/mcpapps/transport/McpInitializeResult;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/anthropic/claude/mcpapps/transport/McpServerCapabilities;", "copy", "(Lcom/anthropic/claude/mcpapps/transport/McpServerCapabilities;)Lcom/anthropic/claude/mcpapps/transport/McpInitializeResult;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/anthropic/claude/mcpapps/transport/McpServerCapabilities;", "getCapabilities", "Companion", "o2b", "p2b", "Claude:mcpapp"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class McpInitializeResult {
    public static final int $stable = 8;
    public static final p2b Companion = new p2b();
    private final McpServerCapabilities capabilities;

    public /* synthetic */ McpInitializeResult(int i, McpServerCapabilities mcpServerCapabilities, vnf vnfVar) {
        if ((i & 1) == 0) {
            this.capabilities = null;
        } else {
            this.capabilities = mcpServerCapabilities;
        }
    }

    public static /* synthetic */ McpInitializeResult copy$default(McpInitializeResult mcpInitializeResult, McpServerCapabilities mcpServerCapabilities, int i, Object obj) {
        if ((i & 1) != 0) {
            mcpServerCapabilities = mcpInitializeResult.capabilities;
        }
        return mcpInitializeResult.copy(mcpServerCapabilities);
    }

    public static final /* synthetic */ void write$Self$Claude_mcpapp(McpInitializeResult self, vd4 output, SerialDescriptor serialDesc) {
        if (!output.E(serialDesc) && self.capabilities == null) {
            return;
        }
        output.B(serialDesc, 0, m3b.a, self.capabilities);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final McpServerCapabilities getCapabilities() {
        return this.capabilities;
    }

    public final McpInitializeResult copy(McpServerCapabilities capabilities) {
        return new McpInitializeResult(capabilities);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof McpInitializeResult) && x44.r(this.capabilities, ((McpInitializeResult) other).capabilities);
    }

    public final McpServerCapabilities getCapabilities() {
        return this.capabilities;
    }

    public int hashCode() {
        McpServerCapabilities mcpServerCapabilities = this.capabilities;
        if (mcpServerCapabilities == null) {
            return 0;
        }
        return mcpServerCapabilities.hashCode();
    }

    public String toString() {
        return "McpInitializeResult(capabilities=" + this.capabilities + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public McpInitializeResult() {
        this((McpServerCapabilities) null, 1, (mq5) (0 == true ? 1 : 0));
    }

    public McpInitializeResult(McpServerCapabilities mcpServerCapabilities) {
        this.capabilities = mcpServerCapabilities;
    }

    public /* synthetic */ McpInitializeResult(McpServerCapabilities mcpServerCapabilities, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : mcpServerCapabilities);
    }
}
