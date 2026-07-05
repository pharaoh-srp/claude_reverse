package com.anthropic.claude.api.mcp;

import defpackage.b75;
import defpackage.c75;
import defpackage.fr4;
import defpackage.gid;
import defpackage.gvj;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.lm6;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.q2b;
import defpackage.uo0;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.yb5;
import defpackage.znf;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,-B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tB?\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ4\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0019J\u0010\u0010 \u001a\u00020\nHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b(\u0010\u0019R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b*\u0010\u001c¨\u0006."}, d2 = {"Lcom/anthropic/claude/api/mcp/CreateMcpRemoteServerRequest;", "", "", "name", "url", "", "Lcom/anthropic/claude/api/mcp/McpLegalAttestation;", "attestations", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/mcp/CreateMcpRemoteServerRequest;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/anthropic/claude/api/mcp/CreateMcpRemoteServerRequest;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "getUrl", "Ljava/util/List;", "getAttestations", "Companion", "b75", "c75", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class CreateMcpRemoteServerRequest {
    public static final int $stable = 0;
    private final List<McpLegalAttestation> attestations;
    private final String name;
    private final String url;
    public static final c75 Companion = new c75();
    private static final kw9[] $childSerializers = {null, null, yb5.w(w1a.F, new fr4(29))};

    public /* synthetic */ CreateMcpRemoteServerRequest(int i, String str, String str2, List list, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, b75.a.getDescriptor());
            throw null;
        }
        this.name = str;
        this.url = str2;
        if ((i & 4) == 0) {
            this.attestations = lm6.E;
        } else {
            this.attestations = list;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(q2b.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CreateMcpRemoteServerRequest copy$default(CreateMcpRemoteServerRequest createMcpRemoteServerRequest, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = createMcpRemoteServerRequest.name;
        }
        if ((i & 2) != 0) {
            str2 = createMcpRemoteServerRequest.url;
        }
        if ((i & 4) != 0) {
            list = createMcpRemoteServerRequest.attestations;
        }
        return createMcpRemoteServerRequest.copy(str, str2, list);
    }

    public static final /* synthetic */ void write$Self$api(CreateMcpRemoteServerRequest self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.q(serialDesc, 0, self.name);
        output.q(serialDesc, 1, self.url);
        if (!output.E(serialDesc) && x44.r(self.attestations, lm6.E)) {
            return;
        }
        output.r(serialDesc, 2, (znf) kw9VarArr[2].getValue(), self.attestations);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    public final List<McpLegalAttestation> component3() {
        return this.attestations;
    }

    public final CreateMcpRemoteServerRequest copy(String name, String url, List<McpLegalAttestation> attestations) {
        name.getClass();
        url.getClass();
        attestations.getClass();
        return new CreateMcpRemoteServerRequest(name, url, attestations);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateMcpRemoteServerRequest)) {
            return false;
        }
        CreateMcpRemoteServerRequest createMcpRemoteServerRequest = (CreateMcpRemoteServerRequest) other;
        return x44.r(this.name, createMcpRemoteServerRequest.name) && x44.r(this.url, createMcpRemoteServerRequest.url) && x44.r(this.attestations, createMcpRemoteServerRequest.attestations);
    }

    public final List<McpLegalAttestation> getAttestations() {
        return this.attestations;
    }

    public final String getName() {
        return this.name;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return this.attestations.hashCode() + kgh.l(this.name.hashCode() * 31, 31, this.url);
    }

    public String toString() {
        String str = this.name;
        String str2 = this.url;
        return gid.q(kgh.r("CreateMcpRemoteServerRequest(name=", str, ", url=", str2, ", attestations="), this.attestations, ")");
    }

    public CreateMcpRemoteServerRequest(String str, String str2, List<McpLegalAttestation> list) {
        str.getClass();
        str2.getClass();
        list.getClass();
        this.name = str;
        this.url = str2;
        this.attestations = list;
    }

    public /* synthetic */ CreateMcpRemoteServerRequest(String str, String str2, List list, int i, mq5 mq5Var) {
        this(str, str2, (i & 4) != 0 ? lm6.E : list);
    }
}
