package com.anthropic.claude.api.mcp;

import com.anthropic.claude.api.chat.tool.ToolResultContent;
import defpackage.fsh;
import defpackage.gvj;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mia;
import defpackage.mq5;
import defpackage.onf;
import defpackage.uh9;
import defpackage.uo0;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.wya;
import defpackage.x44;
import defpackage.xya;
import defpackage.yb5;
import defpackage.znf;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000223B7\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bBG\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b \u0010\u001fJB\u0010!\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010)\u001a\u00020\u00052\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010+\u001a\u0004\b,\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b\u0006\u0010\u001dR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b/\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b0\u0010\u001f¨\u00064"}, d2 = {"Lcom/anthropic/claude/api/mcp/McpAppToolResult;", "", "", "Lcom/anthropic/claude/api/chat/tool/ToolResultContent;", "content", "", "isError", "Lkotlinx/serialization/json/JsonObject;", "structuredContent", "meta", "<init>", "(Ljava/util/List;ZLkotlinx/serialization/json/JsonObject;Lkotlinx/serialization/json/JsonObject;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/util/List;ZLkotlinx/serialization/json/JsonObject;Lkotlinx/serialization/json/JsonObject;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/mcp/McpAppToolResult;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "()Z", "component3", "()Lkotlinx/serialization/json/JsonObject;", "component4", "copy", "(Ljava/util/List;ZLkotlinx/serialization/json/JsonObject;Lkotlinx/serialization/json/JsonObject;)Lcom/anthropic/claude/api/mcp/McpAppToolResult;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getContent", "Z", "Lkotlinx/serialization/json/JsonObject;", "getStructuredContent", "getMeta", "Companion", "wya", "xya", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class McpAppToolResult {
    public static final int $stable = 0;
    private final List<ToolResultContent> content;
    private final boolean isError;
    private final JsonObject meta;
    private final JsonObject structuredContent;
    public static final xya Companion = new xya();
    private static final kw9[] $childSerializers = {yb5.w(w1a.F, new mia(12)), null, null, null};

    public /* synthetic */ McpAppToolResult(int i, List list, boolean z, JsonObject jsonObject, JsonObject jsonObject2, vnf vnfVar) {
        if (1 != (i & 1)) {
            gvj.f(i, 1, wya.a.getDescriptor());
            throw null;
        }
        this.content = list;
        if ((i & 2) == 0) {
            this.isError = false;
        } else {
            this.isError = z;
        }
        if ((i & 4) == 0) {
            this.structuredContent = null;
        } else {
            this.structuredContent = jsonObject;
        }
        if ((i & 8) == 0) {
            this.meta = null;
        } else {
            this.meta = jsonObject2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(ToolResultContent.Companion.serializer(), 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ McpAppToolResult copy$default(McpAppToolResult mcpAppToolResult, List list, boolean z, JsonObject jsonObject, JsonObject jsonObject2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = mcpAppToolResult.content;
        }
        if ((i & 2) != 0) {
            z = mcpAppToolResult.isError;
        }
        if ((i & 4) != 0) {
            jsonObject = mcpAppToolResult.structuredContent;
        }
        if ((i & 8) != 0) {
            jsonObject2 = mcpAppToolResult.meta;
        }
        return mcpAppToolResult.copy(list, z, jsonObject, jsonObject2);
    }

    public static final /* synthetic */ void write$Self$api(McpAppToolResult self, vd4 output, SerialDescriptor serialDesc) {
        output.r(serialDesc, 0, (znf) $childSerializers[0].getValue(), self.content);
        if (output.E(serialDesc) || self.isError) {
            output.p(serialDesc, 1, self.isError);
        }
        if (output.E(serialDesc) || self.structuredContent != null) {
            output.B(serialDesc, 2, uh9.a, self.structuredContent);
        }
        if (!output.E(serialDesc) && self.meta == null) {
            return;
        }
        output.B(serialDesc, 3, uh9.a, self.meta);
    }

    public final List<ToolResultContent> component1() {
        return this.content;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsError() {
        return this.isError;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final JsonObject getStructuredContent() {
        return this.structuredContent;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final JsonObject getMeta() {
        return this.meta;
    }

    public final McpAppToolResult copy(List<? extends ToolResultContent> content, boolean isError, JsonObject structuredContent, JsonObject meta) {
        content.getClass();
        return new McpAppToolResult(content, isError, structuredContent, meta);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof McpAppToolResult)) {
            return false;
        }
        McpAppToolResult mcpAppToolResult = (McpAppToolResult) other;
        return x44.r(this.content, mcpAppToolResult.content) && this.isError == mcpAppToolResult.isError && x44.r(this.structuredContent, mcpAppToolResult.structuredContent) && x44.r(this.meta, mcpAppToolResult.meta);
    }

    public final List<ToolResultContent> getContent() {
        return this.content;
    }

    public final JsonObject getMeta() {
        return this.meta;
    }

    public final JsonObject getStructuredContent() {
        return this.structuredContent;
    }

    public int hashCode() {
        int iP = fsh.p(this.content.hashCode() * 31, 31, this.isError);
        JsonObject jsonObject = this.structuredContent;
        int iHashCode = (iP + (jsonObject == null ? 0 : jsonObject.hashCode())) * 31;
        JsonObject jsonObject2 = this.meta;
        return iHashCode + (jsonObject2 != null ? jsonObject2.hashCode() : 0);
    }

    public final boolean isError() {
        return this.isError;
    }

    public String toString() {
        return "McpAppToolResult(content=" + this.content + ", isError=" + this.isError + ", structuredContent=" + this.structuredContent + ", meta=" + this.meta + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public McpAppToolResult(List<? extends ToolResultContent> list, boolean z, JsonObject jsonObject, JsonObject jsonObject2) {
        list.getClass();
        this.content = list;
        this.isError = z;
        this.structuredContent = jsonObject;
        this.meta = jsonObject2;
    }

    public /* synthetic */ McpAppToolResult(List list, boolean z, JsonObject jsonObject, JsonObject jsonObject2, int i, mq5 mq5Var) {
        this(list, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : jsonObject, (i & 8) != 0 ? null : jsonObject2);
    }
}
