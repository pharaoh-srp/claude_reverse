package com.anthropic.claude.tool.mcp;

import com.anthropic.claude.api.mcp.CaiMcpFlag;
import com.anthropic.claude.types.strings.McpServerId;
import defpackage.ebh;
import defpackage.gvj;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.l62;
import defpackage.lm6;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.p3b;
import defpackage.srg;
import defpackage.um6;
import defpackage.uo0;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.vof;
import defpackage.w1a;
import defpackage.wof;
import defpackage.x44;
import defpackage.yb5;
import defpackage.znf;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0083\b\u0018\u0000 $2\u00020\u0001:\u0003%&'B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u0017\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b#\u0010\u0016¨\u0006("}, d2 = {"Lcom/anthropic/claude/tool/mcp/ServerListFrame;", "", "", "Lcom/anthropic/claude/tool/mcp/ServerListFrame$ServerStub;", "servers", "<init>", "(Ljava/util/List;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/util/List;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$tool", "(Lcom/anthropic/claude/tool/mcp/ServerListFrame;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/anthropic/claude/tool/mcp/ServerListFrame;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getServers", "Companion", "ServerStub", "com/anthropic/claude/tool/mcp/h", "vof", "tool"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ServerListFrame {
    private final List<ServerStub> servers;
    public static final vof Companion = new vof();
    private static final kw9[] $childSerializers = {yb5.w(w1a.F, new d(3))};

    public /* synthetic */ ServerListFrame(int i, List list, vnf vnfVar) {
        if ((i & 1) == 0) {
            this.servers = lm6.E;
        } else {
            this.servers = list;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(i.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ServerListFrame copy$default(ServerListFrame serverListFrame, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = serverListFrame.servers;
        }
        return serverListFrame.copy(list);
    }

    public static final /* synthetic */ void write$Self$tool(ServerListFrame self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        if (!output.E(serialDesc) && x44.r(self.servers, lm6.E)) {
            return;
        }
        output.r(serialDesc, 0, (znf) kw9VarArr[0].getValue(), self.servers);
    }

    public final List<ServerStub> component1() {
        return this.servers;
    }

    public final ServerListFrame copy(List<ServerStub> servers) {
        servers.getClass();
        return new ServerListFrame(servers);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ServerListFrame) && x44.r(this.servers, ((ServerListFrame) other).servers);
    }

    public final List<ServerStub> getServers() {
        return this.servers;
    }

    public int hashCode() {
        return this.servers.hashCode();
    }

    public String toString() {
        return ebh.n("ServerListFrame(servers=", ")", this.servers);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ServerListFrame() {
        this((List) null, 1, (mq5) (0 == true ? 1 : 0));
    }

    public ServerListFrame(List<ServerStub> list) {
        list.getClass();
        this.servers = list;
    }

    public /* synthetic */ ServerListFrame(List list, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? lm6.E : list);
    }

    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000223B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bBI\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001bJ\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J@\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b$\u0010\u001bJ\u0010\u0010%\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b-\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b.\u0010\u001bR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010/\u001a\u0004\b0\u0010 ¨\u00064"}, d2 = {"Lcom/anthropic/claude/tool/mcp/ServerListFrame$ServerStub;", "", "Lcom/anthropic/claude/types/strings/McpServerId;", "uuid", "", "name", "url", "", "Lcom/anthropic/claude/api/mcp/CaiMcpFlag;", "cai_flags", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Lmq5;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Lvnf;Lmq5;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$tool", "(Lcom/anthropic/claude/tool/mcp/ServerListFrame$ServerStub;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1-owoRr7k", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "()Ljava/util/Set;", "copy-t4ao_k4", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;)Lcom/anthropic/claude/tool/mcp/ServerListFrame$ServerStub;", "copy", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUuid-owoRr7k", "getName", "getUrl", "Ljava/util/Set;", "getCai_flags", "Companion", "com/anthropic/claude/tool/mcp/i", "com/anthropic/claude/tool/mcp/j", "tool"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class ServerStub {
        public static final int $stable = 8;
        private final Set<CaiMcpFlag> cai_flags;
        private final String name;
        private final String url;
        private final String uuid;
        public static final j Companion = new j();
        private static final kw9[] $childSerializers = {null, null, null, yb5.w(w1a.F, new wof(0))};

        private /* synthetic */ ServerStub(int i, String str, String str2, String str3, Set set, vnf vnfVar) {
            if (3 != (i & 3)) {
                gvj.f(i, 3, i.a.getDescriptor());
                throw null;
            }
            this.uuid = str;
            this.name = str2;
            if ((i & 4) == 0) {
                this.url = null;
            } else {
                this.url = str3;
            }
            if ((i & 8) == 0) {
                this.cai_flags = um6.E;
            } else {
                this.cai_flags = set;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new uo0(l62.d, 1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: copy-t4ao_k4$default, reason: not valid java name */
        public static /* synthetic */ ServerStub m931copyt4ao_k4$default(ServerStub serverStub, String str, String str2, String str3, Set set, int i, Object obj) {
            if ((i & 1) != 0) {
                str = serverStub.uuid;
            }
            if ((i & 2) != 0) {
                str2 = serverStub.name;
            }
            if ((i & 4) != 0) {
                str3 = serverStub.url;
            }
            if ((i & 8) != 0) {
                set = serverStub.cai_flags;
            }
            return serverStub.m933copyt4ao_k4(str, str2, str3, set);
        }

        public static final /* synthetic */ void write$Self$tool(ServerStub self, vd4 output, SerialDescriptor serialDesc) {
            kw9[] kw9VarArr = $childSerializers;
            output.r(serialDesc, 0, p3b.a, McpServerId.m1029boximpl(self.uuid));
            output.q(serialDesc, 1, self.name);
            if (output.E(serialDesc) || self.url != null) {
                output.B(serialDesc, 2, srg.a, self.url);
            }
            if (!output.E(serialDesc) && x44.r(self.cai_flags, um6.E)) {
                return;
            }
            output.r(serialDesc, 3, (znf) kw9VarArr[3].getValue(), self.cai_flags);
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

        public final Set<CaiMcpFlag> component4() {
            return this.cai_flags;
        }

        /* JADX INFO: renamed from: copy-t4ao_k4, reason: not valid java name */
        public final ServerStub m933copyt4ao_k4(String uuid, String name, String url, Set<? extends CaiMcpFlag> cai_flags) {
            uuid.getClass();
            name.getClass();
            cai_flags.getClass();
            return new ServerStub(uuid, name, url, cai_flags, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ServerStub)) {
                return false;
            }
            ServerStub serverStub = (ServerStub) other;
            return McpServerId.m1032equalsimpl0(this.uuid, serverStub.uuid) && x44.r(this.name, serverStub.name) && x44.r(this.url, serverStub.url) && x44.r(this.cai_flags, serverStub.cai_flags);
        }

        public final Set<CaiMcpFlag> getCai_flags() {
            return this.cai_flags;
        }

        public final String getName() {
            return this.name;
        }

        public final String getUrl() {
            return this.url;
        }

        /* JADX INFO: renamed from: getUuid-owoRr7k, reason: not valid java name */
        public final String m934getUuidowoRr7k() {
            return this.uuid;
        }

        public int hashCode() {
            int iL = kgh.l(McpServerId.m1033hashCodeimpl(this.uuid) * 31, 31, this.name);
            String str = this.url;
            return this.cai_flags.hashCode() + ((iL + (str == null ? 0 : str.hashCode())) * 31);
        }

        public String toString() {
            String strM1034toStringimpl = McpServerId.m1034toStringimpl(this.uuid);
            String str = this.name;
            String str2 = this.url;
            Set<CaiMcpFlag> set = this.cai_flags;
            StringBuilder sbR = kgh.r("ServerStub(uuid=", strM1034toStringimpl, ", name=", str, ", url=");
            sbR.append(str2);
            sbR.append(", cai_flags=");
            sbR.append(set);
            sbR.append(")");
            return sbR.toString();
        }

        public /* synthetic */ ServerStub(String str, String str2, String str3, Set set, mq5 mq5Var) {
            this(str, str2, str3, set);
        }

        public /* synthetic */ ServerStub(int i, String str, String str2, String str3, Set set, vnf vnfVar, mq5 mq5Var) {
            this(i, str, str2, str3, set, vnfVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private ServerStub(String str, String str2, String str3, Set<? extends CaiMcpFlag> set) {
            str.getClass();
            str2.getClass();
            set.getClass();
            this.uuid = str;
            this.name = str2;
            this.url = str3;
            this.cai_flags = set;
        }

        public /* synthetic */ ServerStub(String str, String str2, String str3, Set set, int i, mq5 mq5Var) {
            this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? um6.E : set, null);
        }
    }
}
