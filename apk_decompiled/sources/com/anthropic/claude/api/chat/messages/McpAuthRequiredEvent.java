package com.anthropic.claude.api.chat.messages;

import com.anthropic.claude.types.strings.McpServerId;
import com.anthropic.claude.types.strings.ToolUseId;
import defpackage.a0b;
import defpackage.b0b;
import defpackage.c1i;
import defpackage.gvj;
import defpackage.ij0;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.p3b;
import defpackage.vd4;
import defpackage.vnf;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+,B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J$\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0017J\u0010\u0010 \u001a\u00020\bHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b)\u0010\u0017¨\u0006-"}, d2 = {"Lcom/anthropic/claude/api/chat/messages/McpAuthRequiredEvent;", "Lcom/anthropic/claude/api/chat/messages/StreamEvent;", "Lcom/anthropic/claude/types/strings/McpServerId;", "server_id", "Lcom/anthropic/claude/types/strings/ToolUseId;", "tool_use_id", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lmq5;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lvnf;Lmq5;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/chat/messages/McpAuthRequiredEvent;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1-owoRr7k", "()Ljava/lang/String;", "component1", "component2-ERU6ZeY", "component2", "copy-oH2dtT4", "(Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/api/chat/messages/McpAuthRequiredEvent;", "copy", "", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getServer_id-owoRr7k", "getTool_use_id-ERU6ZeY", "Companion", "a0b", "b0b", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class McpAuthRequiredEvent implements StreamEvent {
    public static final int $stable = 0;
    public static final b0b Companion = new b0b();
    private final String server_id;
    private final String tool_use_id;

    private /* synthetic */ McpAuthRequiredEvent(int i, String str, String str2, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, a0b.a.getDescriptor());
            throw null;
        }
        this.server_id = str;
        this.tool_use_id = str2;
    }

    /* JADX INFO: renamed from: copy-oH2dtT4$default, reason: not valid java name */
    public static /* synthetic */ McpAuthRequiredEvent m294copyoH2dtT4$default(McpAuthRequiredEvent mcpAuthRequiredEvent, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mcpAuthRequiredEvent.server_id;
        }
        if ((i & 2) != 0) {
            str2 = mcpAuthRequiredEvent.tool_use_id;
        }
        return mcpAuthRequiredEvent.m297copyoH2dtT4(str, str2);
    }

    public static final /* synthetic */ void write$Self$api(McpAuthRequiredEvent self, vd4 output, SerialDescriptor serialDesc) {
        output.r(serialDesc, 0, p3b.a, McpServerId.m1029boximpl(self.server_id));
        output.r(serialDesc, 1, c1i.a, ToolUseId.m1157boximpl(self.tool_use_id));
    }

    /* JADX INFO: renamed from: component1-owoRr7k, reason: not valid java name and from getter */
    public final String getServer_id() {
        return this.server_id;
    }

    /* JADX INFO: renamed from: component2-ERU6ZeY, reason: not valid java name and from getter */
    public final String getTool_use_id() {
        return this.tool_use_id;
    }

    /* JADX INFO: renamed from: copy-oH2dtT4, reason: not valid java name */
    public final McpAuthRequiredEvent m297copyoH2dtT4(String server_id, String tool_use_id) {
        server_id.getClass();
        tool_use_id.getClass();
        return new McpAuthRequiredEvent(server_id, tool_use_id, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof McpAuthRequiredEvent)) {
            return false;
        }
        McpAuthRequiredEvent mcpAuthRequiredEvent = (McpAuthRequiredEvent) other;
        return McpServerId.m1032equalsimpl0(this.server_id, mcpAuthRequiredEvent.server_id) && ToolUseId.m1160equalsimpl0(this.tool_use_id, mcpAuthRequiredEvent.tool_use_id);
    }

    /* JADX INFO: renamed from: getServer_id-owoRr7k, reason: not valid java name */
    public final String m298getServer_idowoRr7k() {
        return this.server_id;
    }

    /* JADX INFO: renamed from: getTool_use_id-ERU6ZeY, reason: not valid java name */
    public final String m299getTool_use_idERU6ZeY() {
        return this.tool_use_id;
    }

    public int hashCode() {
        return ToolUseId.m1161hashCodeimpl(this.tool_use_id) + (McpServerId.m1033hashCodeimpl(this.server_id) * 31);
    }

    public String toString() {
        return ij0.l("McpAuthRequiredEvent(server_id=", McpServerId.m1034toStringimpl(this.server_id), ", tool_use_id=", ToolUseId.m1162toStringimpl(this.tool_use_id), ")");
    }

    public /* synthetic */ McpAuthRequiredEvent(String str, String str2, mq5 mq5Var) {
        this(str, str2);
    }

    public /* synthetic */ McpAuthRequiredEvent(int i, String str, String str2, vnf vnfVar, mq5 mq5Var) {
        this(i, str, str2, vnfVar);
    }

    private McpAuthRequiredEvent(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.server_id = str;
        this.tool_use_id = str2;
    }
}
