package com.anthropic.claude.api.mcp;

import defpackage.gvj;
import defpackage.ij0;
import defpackage.mdj;
import defpackage.onf;
import defpackage.q2b;
import defpackage.r2b;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%&B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J$\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b#\u0010\u0016¨\u0006'"}, d2 = {"Lcom/anthropic/claude/api/mcp/McpLegalAttestation;", "", "", "type", "content_hash", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/mcp/McpLegalAttestation;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/api/mcp/McpLegalAttestation;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getType", "getContent_hash", "Companion", "q2b", "r2b", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class McpLegalAttestation {
    public static final int $stable = 0;
    public static final r2b Companion = new r2b();
    private final String content_hash;
    private final String type;

    public /* synthetic */ McpLegalAttestation(int i, String str, String str2, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, q2b.a.getDescriptor());
            throw null;
        }
        this.type = str;
        this.content_hash = str2;
    }

    public static /* synthetic */ McpLegalAttestation copy$default(McpLegalAttestation mcpLegalAttestation, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mcpLegalAttestation.type;
        }
        if ((i & 2) != 0) {
            str2 = mcpLegalAttestation.content_hash;
        }
        return mcpLegalAttestation.copy(str, str2);
    }

    public static final /* synthetic */ void write$Self$api(McpLegalAttestation self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.type);
        output.q(serialDesc, 1, self.content_hash);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getContent_hash() {
        return this.content_hash;
    }

    public final McpLegalAttestation copy(String type, String content_hash) {
        type.getClass();
        content_hash.getClass();
        return new McpLegalAttestation(type, content_hash);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof McpLegalAttestation)) {
            return false;
        }
        McpLegalAttestation mcpLegalAttestation = (McpLegalAttestation) other;
        return x44.r(this.type, mcpLegalAttestation.type) && x44.r(this.content_hash, mcpLegalAttestation.content_hash);
    }

    public final String getContent_hash() {
        return this.content_hash;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return this.content_hash.hashCode() + (this.type.hashCode() * 31);
    }

    public String toString() {
        return ij0.l("McpLegalAttestation(type=", this.type, ", content_hash=", this.content_hash, ")");
    }

    public McpLegalAttestation(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.type = str;
        this.content_hash = str2;
    }
}
