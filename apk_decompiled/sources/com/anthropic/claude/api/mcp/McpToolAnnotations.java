package com.anthropic.claude.api.mcp;

import defpackage.ebh;
import defpackage.g4b;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.qy1;
import defpackage.srg;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import defpackage.zt1;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u000201BC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nBM\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001cJL\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010&\u001a\u00020\u00042\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010\u001cR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b,\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b-\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010*\u001a\u0004\b.\u0010\u001c¨\u00062"}, d2 = {"Lcom/anthropic/claude/api/mcp/McpToolAnnotations;", "", "", "title", "", "readOnlyHint", "destructiveHint", "idempotentHint", "openWorldHint", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/mcp/McpToolAnnotations;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Boolean;", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/anthropic/claude/api/mcp/McpToolAnnotations;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "Ljava/lang/Boolean;", "getReadOnlyHint", "getDestructiveHint", "getIdempotentHint", "getOpenWorldHint", "Companion", "f4b", "g4b", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class McpToolAnnotations {
    public static final int $stable = 0;
    public static final g4b Companion = new g4b();
    private final Boolean destructiveHint;
    private final Boolean idempotentHint;
    private final Boolean openWorldHint;
    private final Boolean readOnlyHint;
    private final String title;

    public /* synthetic */ McpToolAnnotations(int i, String str, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, vnf vnfVar) {
        if ((i & 1) == 0) {
            this.title = null;
        } else {
            this.title = str;
        }
        if ((i & 2) == 0) {
            this.readOnlyHint = null;
        } else {
            this.readOnlyHint = bool;
        }
        if ((i & 4) == 0) {
            this.destructiveHint = null;
        } else {
            this.destructiveHint = bool2;
        }
        if ((i & 8) == 0) {
            this.idempotentHint = null;
        } else {
            this.idempotentHint = bool3;
        }
        if ((i & 16) == 0) {
            this.openWorldHint = null;
        } else {
            this.openWorldHint = bool4;
        }
    }

    public static /* synthetic */ McpToolAnnotations copy$default(McpToolAnnotations mcpToolAnnotations, String str, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mcpToolAnnotations.title;
        }
        if ((i & 2) != 0) {
            bool = mcpToolAnnotations.readOnlyHint;
        }
        if ((i & 4) != 0) {
            bool2 = mcpToolAnnotations.destructiveHint;
        }
        if ((i & 8) != 0) {
            bool3 = mcpToolAnnotations.idempotentHint;
        }
        if ((i & 16) != 0) {
            bool4 = mcpToolAnnotations.openWorldHint;
        }
        Boolean bool5 = bool4;
        Boolean bool6 = bool2;
        return mcpToolAnnotations.copy(str, bool, bool6, bool3, bool5);
    }

    public static final /* synthetic */ void write$Self$api(McpToolAnnotations self, vd4 output, SerialDescriptor serialDesc) {
        if (output.E(serialDesc) || self.title != null) {
            output.B(serialDesc, 0, srg.a, self.title);
        }
        if (output.E(serialDesc) || self.readOnlyHint != null) {
            output.B(serialDesc, 1, zt1.a, self.readOnlyHint);
        }
        if (output.E(serialDesc) || self.destructiveHint != null) {
            output.B(serialDesc, 2, zt1.a, self.destructiveHint);
        }
        if (output.E(serialDesc) || self.idempotentHint != null) {
            output.B(serialDesc, 3, zt1.a, self.idempotentHint);
        }
        if (!output.E(serialDesc) && self.openWorldHint == null) {
            return;
        }
        output.B(serialDesc, 4, zt1.a, self.openWorldHint);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getReadOnlyHint() {
        return this.readOnlyHint;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getDestructiveHint() {
        return this.destructiveHint;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getIdempotentHint() {
        return this.idempotentHint;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getOpenWorldHint() {
        return this.openWorldHint;
    }

    public final McpToolAnnotations copy(String title, Boolean readOnlyHint, Boolean destructiveHint, Boolean idempotentHint, Boolean openWorldHint) {
        return new McpToolAnnotations(title, readOnlyHint, destructiveHint, idempotentHint, openWorldHint);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof McpToolAnnotations)) {
            return false;
        }
        McpToolAnnotations mcpToolAnnotations = (McpToolAnnotations) other;
        return x44.r(this.title, mcpToolAnnotations.title) && x44.r(this.readOnlyHint, mcpToolAnnotations.readOnlyHint) && x44.r(this.destructiveHint, mcpToolAnnotations.destructiveHint) && x44.r(this.idempotentHint, mcpToolAnnotations.idempotentHint) && x44.r(this.openWorldHint, mcpToolAnnotations.openWorldHint);
    }

    public final Boolean getDestructiveHint() {
        return this.destructiveHint;
    }

    public final Boolean getIdempotentHint() {
        return this.idempotentHint;
    }

    public final Boolean getOpenWorldHint() {
        return this.openWorldHint;
    }

    public final Boolean getReadOnlyHint() {
        return this.readOnlyHint;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.readOnlyHint;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.destructiveHint;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.idempotentHint;
        int iHashCode4 = (iHashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.openWorldHint;
        return iHashCode4 + (bool4 != null ? bool4.hashCode() : 0);
    }

    public String toString() {
        String str = this.title;
        Boolean bool = this.readOnlyHint;
        Boolean bool2 = this.destructiveHint;
        Boolean bool3 = this.idempotentHint;
        Boolean bool4 = this.openWorldHint;
        StringBuilder sb = new StringBuilder("McpToolAnnotations(title=");
        sb.append(str);
        sb.append(", readOnlyHint=");
        sb.append(bool);
        sb.append(", destructiveHint=");
        ebh.C(sb, bool2, ", idempotentHint=", bool3, ", openWorldHint=");
        return qy1.h(sb, bool4, ")");
    }

    public McpToolAnnotations() {
        this((String) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, 31, (mq5) null);
    }

    public McpToolAnnotations(String str, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
        this.title = str;
        this.readOnlyHint = bool;
        this.destructiveHint = bool2;
        this.idempotentHint = bool3;
        this.openWorldHint = bool4;
    }

    public /* synthetic */ McpToolAnnotations(String str, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : bool2, (i & 8) != 0 ? null : bool3, (i & 16) != 0 ? null : bool4);
    }
}
