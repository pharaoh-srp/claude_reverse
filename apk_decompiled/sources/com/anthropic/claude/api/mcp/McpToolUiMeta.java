package com.anthropic.claude.api.mcp;

import defpackage.b5b;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.rpa;
import defpackage.srg;
import defpackage.uo0;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.w4b;
import defpackage.x44;
import defpackage.y6a;
import defpackage.yb5;
import defpackage.znf;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)*B%\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ.\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0018J\u0010\u0010\u001e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0018R\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b'\u0010\u001a¨\u0006+"}, d2 = {"Lcom/anthropic/claude/api/mcp/McpToolUiMeta;", "", "", "resourceUri", "", "Lcom/anthropic/claude/api/mcp/McpToolVisibility;", "visibility", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/mcp/McpToolUiMeta;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/util/List;)Lcom/anthropic/claude/api/mcp/McpToolUiMeta;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getResourceUri", "Ljava/util/List;", "getVisibility", "Companion", "v4b", "w4b", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class McpToolUiMeta {
    public static final int $stable = 0;
    private final String resourceUri;
    private final List<McpToolVisibility> visibility;
    public static final w4b Companion = new w4b();
    private static final kw9[] $childSerializers = {null, yb5.w(w1a.F, new rpa(17))};

    public /* synthetic */ McpToolUiMeta(int i, String str, List list, vnf vnfVar) {
        if ((i & 1) == 0) {
            this.resourceUri = null;
        } else {
            this.resourceUri = str;
        }
        if ((i & 2) == 0) {
            this.visibility = null;
        } else {
            this.visibility = list;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(b5b.d, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ McpToolUiMeta copy$default(McpToolUiMeta mcpToolUiMeta, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mcpToolUiMeta.resourceUri;
        }
        if ((i & 2) != 0) {
            list = mcpToolUiMeta.visibility;
        }
        return mcpToolUiMeta.copy(str, list);
    }

    public static final /* synthetic */ void write$Self$api(McpToolUiMeta self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        if (output.E(serialDesc) || self.resourceUri != null) {
            output.B(serialDesc, 0, srg.a, self.resourceUri);
        }
        if (!output.E(serialDesc) && self.visibility == null) {
            return;
        }
        output.B(serialDesc, 1, (znf) kw9VarArr[1].getValue(), self.visibility);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getResourceUri() {
        return this.resourceUri;
    }

    public final List<McpToolVisibility> component2() {
        return this.visibility;
    }

    public final McpToolUiMeta copy(String resourceUri, List<? extends McpToolVisibility> visibility) {
        return new McpToolUiMeta(resourceUri, visibility);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof McpToolUiMeta)) {
            return false;
        }
        McpToolUiMeta mcpToolUiMeta = (McpToolUiMeta) other;
        return x44.r(this.resourceUri, mcpToolUiMeta.resourceUri) && x44.r(this.visibility, mcpToolUiMeta.visibility);
    }

    public final String getResourceUri() {
        return this.resourceUri;
    }

    public final List<McpToolVisibility> getVisibility() {
        return this.visibility;
    }

    public int hashCode() {
        String str = this.resourceUri;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<McpToolVisibility> list = this.visibility;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return y6a.o("McpToolUiMeta(resourceUri=", this.resourceUri, ", visibility=", this.visibility, ")");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public McpToolUiMeta() {
        this((String) null, (List) (0 == true ? 1 : 0), 3, (mq5) (0 == true ? 1 : 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public McpToolUiMeta(String str, List<? extends McpToolVisibility> list) {
        this.resourceUri = str;
        this.visibility = list;
    }

    public /* synthetic */ McpToolUiMeta(String str, List list, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list);
    }
}
