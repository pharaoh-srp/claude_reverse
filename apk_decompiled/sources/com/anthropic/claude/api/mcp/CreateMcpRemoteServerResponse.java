package com.anthropic.claude.api.mcp;

import com.anthropic.claude.types.strings.McpServerId;
import defpackage.d75;
import defpackage.e75;
import defpackage.grc;
import defpackage.gvj;
import defpackage.ij0;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.p3b;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+,B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J.\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0018J\u0010\u0010 \u001a\u00020\tHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b(\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b)\u0010\u0018¨\u0006-"}, d2 = {"Lcom/anthropic/claude/api/mcp/CreateMcpRemoteServerResponse;", "", "Lcom/anthropic/claude/types/strings/McpServerId;", "uuid", "", "name", "url", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmq5;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvnf;Lmq5;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/mcp/CreateMcpRemoteServerResponse;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1-owoRr7k", "()Ljava/lang/String;", "component1", "component2", "component3", "copy-6mZEJ4o", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/api/mcp/CreateMcpRemoteServerResponse;", "copy", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUuid-owoRr7k", "getName", "getUrl", "Companion", "d75", "e75", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class CreateMcpRemoteServerResponse {
    public static final int $stable = 0;
    public static final e75 Companion = new e75();
    private final String name;
    private final String url;
    private final String uuid;

    private /* synthetic */ CreateMcpRemoteServerResponse(int i, String str, String str2, String str3, vnf vnfVar) {
        if (7 != (i & 7)) {
            gvj.f(i, 7, d75.a.getDescriptor());
            throw null;
        }
        this.uuid = str;
        this.name = str2;
        this.url = str3;
    }

    /* JADX INFO: renamed from: copy-6mZEJ4o$default, reason: not valid java name */
    public static /* synthetic */ CreateMcpRemoteServerResponse m335copy6mZEJ4o$default(CreateMcpRemoteServerResponse createMcpRemoteServerResponse, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = createMcpRemoteServerResponse.uuid;
        }
        if ((i & 2) != 0) {
            str2 = createMcpRemoteServerResponse.name;
        }
        if ((i & 4) != 0) {
            str3 = createMcpRemoteServerResponse.url;
        }
        return createMcpRemoteServerResponse.m337copy6mZEJ4o(str, str2, str3);
    }

    public static final /* synthetic */ void write$Self$api(CreateMcpRemoteServerResponse self, vd4 output, SerialDescriptor serialDesc) {
        output.r(serialDesc, 0, p3b.a, McpServerId.m1029boximpl(self.uuid));
        output.q(serialDesc, 1, self.name);
        output.q(serialDesc, 2, self.url);
    }

    /* JADX INFO: renamed from: component1-owoRr7k, reason: not valid java name and from getter */
    public final String getUuid() {
        return this.uuid;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* JADX INFO: renamed from: copy-6mZEJ4o, reason: not valid java name */
    public final CreateMcpRemoteServerResponse m337copy6mZEJ4o(String uuid, String name, String url) {
        uuid.getClass();
        name.getClass();
        url.getClass();
        return new CreateMcpRemoteServerResponse(uuid, name, url, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateMcpRemoteServerResponse)) {
            return false;
        }
        CreateMcpRemoteServerResponse createMcpRemoteServerResponse = (CreateMcpRemoteServerResponse) other;
        return McpServerId.m1032equalsimpl0(this.uuid, createMcpRemoteServerResponse.uuid) && x44.r(this.name, createMcpRemoteServerResponse.name) && x44.r(this.url, createMcpRemoteServerResponse.url);
    }

    public final String getName() {
        return this.name;
    }

    public final String getUrl() {
        return this.url;
    }

    /* JADX INFO: renamed from: getUuid-owoRr7k, reason: not valid java name */
    public final String m338getUuidowoRr7k() {
        return this.uuid;
    }

    public int hashCode() {
        return this.url.hashCode() + kgh.l(McpServerId.m1033hashCodeimpl(this.uuid) * 31, 31, this.name);
    }

    public String toString() {
        String strM1034toStringimpl = McpServerId.m1034toStringimpl(this.uuid);
        String str = this.name;
        return ij0.m(kgh.r("CreateMcpRemoteServerResponse(uuid=", strM1034toStringimpl, ", name=", str, ", url="), this.url, ")");
    }

    private CreateMcpRemoteServerResponse(String str, String str2, String str3) {
        grc.B(str, str2, str3);
        this.uuid = str;
        this.name = str2;
        this.url = str3;
    }

    public /* synthetic */ CreateMcpRemoteServerResponse(String str, String str2, String str3, mq5 mq5Var) {
        this(str, str2, str3);
    }

    public /* synthetic */ CreateMcpRemoteServerResponse(int i, String str, String str2, String str3, vnf vnfVar, mq5 mq5Var) {
        this(i, str, str2, str3, vnfVar);
    }
}
