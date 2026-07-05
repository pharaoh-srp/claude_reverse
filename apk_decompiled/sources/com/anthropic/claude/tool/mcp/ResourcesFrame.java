package com.anthropic.claude.tool.mcp;

import com.anthropic.claude.api.mcp.McpResource;
import com.anthropic.claude.types.strings.McpServerId;
import defpackage.g3b;
import defpackage.gvj;
import defpackage.jqe;
import defpackage.kw9;
import defpackage.lm6;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.p3b;
import defpackage.uo0;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.y6a;
import defpackage.yb5;
import defpackage.znf;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\b\u0083\b\u0018\u0000 +2\u00020\u0001:\u0002,-B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ*\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010\u0018J\u0010\u0010!\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b*\u0010\u001b¨\u0006."}, d2 = {"Lcom/anthropic/claude/tool/mcp/ResourcesFrame;", "", "Lcom/anthropic/claude/types/strings/McpServerId;", "server_uuid", "", "Lcom/anthropic/claude/api/mcp/McpResource;", "resources", "<init>", "(Ljava/lang/String;Ljava/util/List;Lmq5;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Lvnf;Lmq5;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$tool", "(Lcom/anthropic/claude/tool/mcp/ResourcesFrame;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1-owoRr7k", "()Ljava/lang/String;", "component1", "component2", "()Ljava/util/List;", "copy-l3aBY8c", "(Ljava/lang/String;Ljava/util/List;)Lcom/anthropic/claude/tool/mcp/ResourcesFrame;", "copy", "", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getServer_uuid-owoRr7k", "Ljava/util/List;", "getResources", "Companion", "com/anthropic/claude/tool/mcp/f", "jqe", "tool"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
final /* data */ class ResourcesFrame {
    private final List<McpResource> resources;
    private final String server_uuid;
    public static final jqe Companion = new jqe();
    private static final kw9[] $childSerializers = {null, yb5.w(w1a.F, new d(1))};

    private /* synthetic */ ResourcesFrame(int i, String str, List list, vnf vnfVar) {
        if (1 != (i & 1)) {
            gvj.f(i, 1, f.a.getDescriptor());
            throw null;
        }
        this.server_uuid = str;
        if ((i & 2) == 0) {
            this.resources = lm6.E;
        } else {
            this.resources = list;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(g3b.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: copy-l3aBY8c$default, reason: not valid java name */
    public static /* synthetic */ ResourcesFrame m923copyl3aBY8c$default(ResourcesFrame resourcesFrame, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = resourcesFrame.server_uuid;
        }
        if ((i & 2) != 0) {
            list = resourcesFrame.resources;
        }
        return resourcesFrame.m925copyl3aBY8c(str, list);
    }

    public static final /* synthetic */ void write$Self$tool(ResourcesFrame self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.r(serialDesc, 0, p3b.a, McpServerId.m1029boximpl(self.server_uuid));
        if (!output.E(serialDesc) && x44.r(self.resources, lm6.E)) {
            return;
        }
        output.r(serialDesc, 1, (znf) kw9VarArr[1].getValue(), self.resources);
    }

    /* JADX INFO: renamed from: component1-owoRr7k, reason: not valid java name and from getter */
    public final String getServer_uuid() {
        return this.server_uuid;
    }

    public final List<McpResource> component2() {
        return this.resources;
    }

    /* JADX INFO: renamed from: copy-l3aBY8c, reason: not valid java name */
    public final ResourcesFrame m925copyl3aBY8c(String server_uuid, List<McpResource> resources) {
        server_uuid.getClass();
        resources.getClass();
        return new ResourcesFrame(server_uuid, resources, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ResourcesFrame)) {
            return false;
        }
        ResourcesFrame resourcesFrame = (ResourcesFrame) other;
        return McpServerId.m1032equalsimpl0(this.server_uuid, resourcesFrame.server_uuid) && x44.r(this.resources, resourcesFrame.resources);
    }

    public final List<McpResource> getResources() {
        return this.resources;
    }

    /* JADX INFO: renamed from: getServer_uuid-owoRr7k, reason: not valid java name */
    public final String m926getServer_uuidowoRr7k() {
        return this.server_uuid;
    }

    public int hashCode() {
        return this.resources.hashCode() + (McpServerId.m1033hashCodeimpl(this.server_uuid) * 31);
    }

    public String toString() {
        return y6a.o("ResourcesFrame(server_uuid=", McpServerId.m1034toStringimpl(this.server_uuid), ", resources=", this.resources, ")");
    }

    public /* synthetic */ ResourcesFrame(String str, List list, mq5 mq5Var) {
        this(str, list);
    }

    public /* synthetic */ ResourcesFrame(int i, String str, List list, vnf vnfVar, mq5 mq5Var) {
        this(i, str, list, vnfVar);
    }

    private ResourcesFrame(String str, List<McpResource> list) {
        str.getClass();
        list.getClass();
        this.server_uuid = str;
        this.resources = list;
    }

    public /* synthetic */ ResourcesFrame(String str, List list, int i, mq5 mq5Var) {
        this(str, (i & 2) != 0 ? lm6.E : list, null);
    }
}
