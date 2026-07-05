package com.anthropic.claude.api.mcp;

import defpackage.g3b;
import defpackage.gvj;
import defpackage.h3b;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.srg;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import defpackage.zt1;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0087\b\u0018\u0000 22\u00020\u0001:\u000234BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bBW\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001bJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001bJ\u0012\u0010 \u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b \u0010!JT\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u001bJ\u0010\u0010%\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010(\u001a\u00020\b2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b,\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b-\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b.\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b/\u0010\u001bR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00100\u001a\u0004\b1\u0010!¨\u00065"}, d2 = {"Lcom/anthropic/claude/api/mcp/McpResource;", "", "", "name", "uri", "description", "displayName", "mimeType", "", "hidden", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/mcp/McpResource;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/anthropic/claude/api/mcp/McpResource;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "getUri", "getDescription", "getDisplayName", "getMimeType", "Ljava/lang/Boolean;", "getHidden", "Companion", "g3b", "h3b", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class McpResource {
    public static final int $stable = 0;
    public static final h3b Companion = new h3b();
    private final String description;
    private final String displayName;
    private final Boolean hidden;
    private final String mimeType;
    private final String name;
    private final String uri;

    public /* synthetic */ McpResource(int i, String str, String str2, String str3, String str4, String str5, Boolean bool, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, g3b.a.getDescriptor());
            throw null;
        }
        this.name = str;
        this.uri = str2;
        if ((i & 4) == 0) {
            this.description = null;
        } else {
            this.description = str3;
        }
        if ((i & 8) == 0) {
            this.displayName = null;
        } else {
            this.displayName = str4;
        }
        if ((i & 16) == 0) {
            this.mimeType = null;
        } else {
            this.mimeType = str5;
        }
        if ((i & 32) == 0) {
            this.hidden = Boolean.FALSE;
        } else {
            this.hidden = bool;
        }
    }

    public static /* synthetic */ McpResource copy$default(McpResource mcpResource, String str, String str2, String str3, String str4, String str5, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mcpResource.name;
        }
        if ((i & 2) != 0) {
            str2 = mcpResource.uri;
        }
        if ((i & 4) != 0) {
            str3 = mcpResource.description;
        }
        if ((i & 8) != 0) {
            str4 = mcpResource.displayName;
        }
        if ((i & 16) != 0) {
            str5 = mcpResource.mimeType;
        }
        if ((i & 32) != 0) {
            bool = mcpResource.hidden;
        }
        String str6 = str5;
        Boolean bool2 = bool;
        return mcpResource.copy(str, str2, str3, str4, str6, bool2);
    }

    public static final /* synthetic */ void write$Self$api(McpResource self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.name);
        output.q(serialDesc, 1, self.uri);
        if (output.E(serialDesc) || self.description != null) {
            output.B(serialDesc, 2, srg.a, self.description);
        }
        if (output.E(serialDesc) || self.displayName != null) {
            output.B(serialDesc, 3, srg.a, self.displayName);
        }
        if (output.E(serialDesc) || self.mimeType != null) {
            output.B(serialDesc, 4, srg.a, self.mimeType);
        }
        if (!output.E(serialDesc) && x44.r(self.hidden, Boolean.FALSE)) {
            return;
        }
        output.B(serialDesc, 5, zt1.a, self.hidden);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUri() {
        return this.uri;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getMimeType() {
        return this.mimeType;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Boolean getHidden() {
        return this.hidden;
    }

    public final McpResource copy(String name, String uri, String description, String displayName, String mimeType, Boolean hidden) {
        name.getClass();
        uri.getClass();
        return new McpResource(name, uri, description, displayName, mimeType, hidden);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof McpResource)) {
            return false;
        }
        McpResource mcpResource = (McpResource) other;
        return x44.r(this.name, mcpResource.name) && x44.r(this.uri, mcpResource.uri) && x44.r(this.description, mcpResource.description) && x44.r(this.displayName, mcpResource.displayName) && x44.r(this.mimeType, mcpResource.mimeType) && x44.r(this.hidden, mcpResource.hidden);
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final Boolean getHidden() {
        return this.hidden;
    }

    public final String getMimeType() {
        return this.mimeType;
    }

    public final String getName() {
        return this.name;
    }

    public final String getUri() {
        return this.uri;
    }

    public int hashCode() {
        int iL = kgh.l(this.name.hashCode() * 31, 31, this.uri);
        String str = this.description;
        int iHashCode = (iL + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.displayName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.mimeType;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.hidden;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        String str = this.name;
        String str2 = this.uri;
        String str3 = this.description;
        String str4 = this.displayName;
        String str5 = this.mimeType;
        Boolean bool = this.hidden;
        StringBuilder sbR = kgh.r("McpResource(name=", str, ", uri=", str2, ", description=");
        kgh.u(sbR, str3, ", displayName=", str4, ", mimeType=");
        sbR.append(str5);
        sbR.append(", hidden=");
        sbR.append(bool);
        sbR.append(")");
        return sbR.toString();
    }

    public McpResource(String str, String str2, String str3, String str4, String str5, Boolean bool) {
        str.getClass();
        str2.getClass();
        this.name = str;
        this.uri = str2;
        this.description = str3;
        this.displayName = str4;
        this.mimeType = str5;
        this.hidden = bool;
    }

    public /* synthetic */ McpResource(String str, String str2, String str3, String str4, String str5, Boolean bool, int i, mq5 mq5Var) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? Boolean.FALSE : bool);
    }
}
