package com.anthropic.claude.api.mcp;

import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.r4b;
import defpackage.srg;
import defpackage.v4b;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002*+B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÂ\u0003¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0018\u0010\u000eJ\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ(\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u000eJ\u0010\u0010\u001e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u001aR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0005\u0010&\u0012\u0004\b'\u0010(¨\u0006,"}, d2 = {"Lcom/anthropic/claude/api/mcp/McpToolMeta;", "", "Lcom/anthropic/claude/api/mcp/McpToolUiMeta;", "ui", "", "uiResourceUri", "<init>", "(Lcom/anthropic/claude/api/mcp/McpToolUiMeta;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/api/mcp/McpToolUiMeta;Ljava/lang/String;Lvnf;)V", "component2", "()Ljava/lang/String;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/mcp/McpToolMeta;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "resourceUri", "component1", "()Lcom/anthropic/claude/api/mcp/McpToolUiMeta;", "copy", "(Lcom/anthropic/claude/api/mcp/McpToolUiMeta;Ljava/lang/String;)Lcom/anthropic/claude/api/mcp/McpToolMeta;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/anthropic/claude/api/mcp/McpToolUiMeta;", "getUi", "Ljava/lang/String;", "getUiResourceUri$annotations", "()V", "Companion", "q4b", "r4b", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class McpToolMeta {
    public static final int $stable = 0;
    public static final r4b Companion = new r4b();
    private final McpToolUiMeta ui;
    private final String uiResourceUri;

    public /* synthetic */ McpToolMeta(int i, McpToolUiMeta mcpToolUiMeta, String str, vnf vnfVar) {
        if ((i & 1) == 0) {
            this.ui = null;
        } else {
            this.ui = mcpToolUiMeta;
        }
        if ((i & 2) == 0) {
            this.uiResourceUri = null;
        } else {
            this.uiResourceUri = str;
        }
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    private final String getUiResourceUri() {
        return this.uiResourceUri;
    }

    public static /* synthetic */ McpToolMeta copy$default(McpToolMeta mcpToolMeta, McpToolUiMeta mcpToolUiMeta, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            mcpToolUiMeta = mcpToolMeta.ui;
        }
        if ((i & 2) != 0) {
            str = mcpToolMeta.uiResourceUri;
        }
        return mcpToolMeta.copy(mcpToolUiMeta, str);
    }

    private static /* synthetic */ void getUiResourceUri$annotations() {
    }

    public static final /* synthetic */ void write$Self$api(McpToolMeta self, vd4 output, SerialDescriptor serialDesc) {
        if (output.E(serialDesc) || self.ui != null) {
            output.B(serialDesc, 0, v4b.a, self.ui);
        }
        if (!output.E(serialDesc) && self.uiResourceUri == null) {
            return;
        }
        output.B(serialDesc, 1, srg.a, self.uiResourceUri);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final McpToolUiMeta getUi() {
        return this.ui;
    }

    public final McpToolMeta copy(McpToolUiMeta ui, String uiResourceUri) {
        return new McpToolMeta(ui, uiResourceUri);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof McpToolMeta)) {
            return false;
        }
        McpToolMeta mcpToolMeta = (McpToolMeta) other;
        return x44.r(this.ui, mcpToolMeta.ui) && x44.r(this.uiResourceUri, mcpToolMeta.uiResourceUri);
    }

    public final McpToolUiMeta getUi() {
        return this.ui;
    }

    public int hashCode() {
        McpToolUiMeta mcpToolUiMeta = this.ui;
        int iHashCode = (mcpToolUiMeta == null ? 0 : mcpToolUiMeta.hashCode()) * 31;
        String str = this.uiResourceUri;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String resourceUri() {
        String resourceUri;
        McpToolUiMeta mcpToolUiMeta = this.ui;
        return (mcpToolUiMeta == null || (resourceUri = mcpToolUiMeta.getResourceUri()) == null) ? this.uiResourceUri : resourceUri;
    }

    public String toString() {
        return "McpToolMeta(ui=" + this.ui + ", uiResourceUri=" + this.uiResourceUri + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public McpToolMeta() {
        this((McpToolUiMeta) null, (String) (0 == true ? 1 : 0), 3, (mq5) (0 == true ? 1 : 0));
    }

    public McpToolMeta(McpToolUiMeta mcpToolUiMeta, String str) {
        this.ui = mcpToolUiMeta;
        this.uiResourceUri = str;
    }

    public /* synthetic */ McpToolMeta(McpToolUiMeta mcpToolUiMeta, String str, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : mcpToolUiMeta, (i & 2) != 0 ? null : str);
    }
}
