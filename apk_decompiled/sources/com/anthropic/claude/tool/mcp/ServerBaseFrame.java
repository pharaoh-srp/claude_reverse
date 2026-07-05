package com.anthropic.claude.tool.mcp;

import com.anthropic.claude.api.mcp.CaiMcpFlag;
import com.anthropic.claude.api.mcp.McpAuthStatus;
import com.anthropic.claude.types.strings.McpServerId;
import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.e0b;
import defpackage.ebh;
import defpackage.gvj;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.l62;
import defpackage.lof;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.p3b;
import defpackage.srg;
import defpackage.um6;
import defpackage.uo0;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.yb5;
import defpackage.znf;
import defpackage.zt1;
import java.util.Set;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0083\b\u0018\u0000 E2\u00020\u0001:\u0002FGBo\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0011\u0010\u0012B{\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0011\u0010\u0017J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0019J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0012\u0010!\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b#\u0010\u0019J\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0003¢\u0006\u0004\b$\u0010%J|\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010)\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b)\u0010\u0019J\u0010\u0010*\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010-\u001a\u00020\b2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b-\u0010.J'\u00107\u001a\u0002042\u0006\u0010/\u001a\u00020\u00002\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u000202H\u0001¢\u0006\u0004\b5\u00106R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00108\u001a\u0004\b9\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00108\u001a\u0004\b:\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u00108\u001a\u0004\b;\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u00108\u001a\u0004\b<\u0010\u0019R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010=\u001a\u0004\b>\u0010\u001fR\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u0010=\u001a\u0004\b?\u0010\u001fR\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010@\u001a\u0004\bA\u0010\"R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\r\u00108\u001a\u0004\bB\u0010\u0019R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u0010C\u001a\u0004\bD\u0010%¨\u0006H"}, d2 = {"Lcom/anthropic/claude/tool/mcp/ServerBaseFrame;", "", "Lcom/anthropic/claude/types/strings/McpServerId;", "uuid", "", "name", "url", "custom_oauth_client_id", "", "connected", "usedAuthentication", "Lcom/anthropic/claude/api/mcp/McpAuthStatus;", "authStatus", "iconUrl", "", "Lcom/anthropic/claude/api/mcp/CaiMcpFlag;", "cai_flags", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/anthropic/claude/api/mcp/McpAuthStatus;Ljava/lang/String;Ljava/util/Set;Lmq5;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/anthropic/claude/api/mcp/McpAuthStatus;Ljava/lang/String;Ljava/util/Set;Lvnf;Lmq5;)V", "component1-owoRr7k", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "()Ljava/lang/Boolean;", "component6", "component7", "()Lcom/anthropic/claude/api/mcp/McpAuthStatus;", "component8", "component9", "()Ljava/util/Set;", "copy-Z3C1-HA", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/anthropic/claude/api/mcp/McpAuthStatus;Ljava/lang/String;Ljava/util/Set;)Lcom/anthropic/claude/tool/mcp/ServerBaseFrame;", "copy", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$tool", "(Lcom/anthropic/claude/tool/mcp/ServerBaseFrame;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getUuid-owoRr7k", "getName", "getUrl", "getCustom_oauth_client_id", "Ljava/lang/Boolean;", "getConnected", "getUsedAuthentication", "Lcom/anthropic/claude/api/mcp/McpAuthStatus;", "getAuthStatus", "getIconUrl", "Ljava/util/Set;", "getCai_flags", "Companion", "com/anthropic/claude/tool/mcp/g", "lof", "tool"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
final /* data */ class ServerBaseFrame {
    private final McpAuthStatus authStatus;
    private final Set<CaiMcpFlag> cai_flags;
    private final Boolean connected;
    private final String custom_oauth_client_id;
    private final String iconUrl;
    private final String name;
    private final String url;
    private final Boolean usedAuthentication;
    private final String uuid;
    public static final lof Companion = new lof();
    private static final kw9[] $childSerializers = {null, null, null, null, null, null, null, null, yb5.w(w1a.F, new d(2))};

    private /* synthetic */ ServerBaseFrame(int i, String str, String str2, String str3, String str4, Boolean bool, Boolean bool2, McpAuthStatus mcpAuthStatus, String str5, Set set, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, g.a.getDescriptor());
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
            this.custom_oauth_client_id = null;
        } else {
            this.custom_oauth_client_id = str4;
        }
        if ((i & 16) == 0) {
            this.connected = Boolean.FALSE;
        } else {
            this.connected = bool;
        }
        if ((i & 32) == 0) {
            this.usedAuthentication = Boolean.FALSE;
        } else {
            this.usedAuthentication = bool2;
        }
        if ((i & 64) == 0) {
            this.authStatus = null;
        } else {
            this.authStatus = mcpAuthStatus;
        }
        if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) == 0) {
            this.iconUrl = null;
        } else {
            this.iconUrl = str5;
        }
        if ((i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) == 0) {
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
    /* JADX INFO: renamed from: copy-Z3C1-HA$default, reason: not valid java name */
    public static /* synthetic */ ServerBaseFrame m927copyZ3C1HA$default(ServerBaseFrame serverBaseFrame, String str, String str2, String str3, String str4, Boolean bool, Boolean bool2, McpAuthStatus mcpAuthStatus, String str5, Set set, int i, Object obj) {
        if ((i & 1) != 0) {
            str = serverBaseFrame.uuid;
        }
        if ((i & 2) != 0) {
            str2 = serverBaseFrame.name;
        }
        if ((i & 4) != 0) {
            str3 = serverBaseFrame.url;
        }
        if ((i & 8) != 0) {
            str4 = serverBaseFrame.custom_oauth_client_id;
        }
        if ((i & 16) != 0) {
            bool = serverBaseFrame.connected;
        }
        if ((i & 32) != 0) {
            bool2 = serverBaseFrame.usedAuthentication;
        }
        if ((i & 64) != 0) {
            mcpAuthStatus = serverBaseFrame.authStatus;
        }
        if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0) {
            str5 = serverBaseFrame.iconUrl;
        }
        if ((i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0) {
            set = serverBaseFrame.cai_flags;
        }
        String str6 = str5;
        Set set2 = set;
        Boolean bool3 = bool2;
        McpAuthStatus mcpAuthStatus2 = mcpAuthStatus;
        Boolean bool4 = bool;
        String str7 = str3;
        return serverBaseFrame.m929copyZ3C1HA(str, str2, str7, str4, bool4, bool3, mcpAuthStatus2, str6, set2);
    }

    public static final /* synthetic */ void write$Self$tool(ServerBaseFrame self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.r(serialDesc, 0, p3b.a, McpServerId.m1029boximpl(self.uuid));
        output.q(serialDesc, 1, self.name);
        if (output.E(serialDesc) || self.url != null) {
            output.B(serialDesc, 2, srg.a, self.url);
        }
        if (output.E(serialDesc) || self.custom_oauth_client_id != null) {
            output.B(serialDesc, 3, srg.a, self.custom_oauth_client_id);
        }
        if (output.E(serialDesc) || !x44.r(self.connected, Boolean.FALSE)) {
            output.B(serialDesc, 4, zt1.a, self.connected);
        }
        if (output.E(serialDesc) || !x44.r(self.usedAuthentication, Boolean.FALSE)) {
            output.B(serialDesc, 5, zt1.a, self.usedAuthentication);
        }
        if (output.E(serialDesc) || self.authStatus != null) {
            output.B(serialDesc, 6, e0b.d, self.authStatus);
        }
        if (output.E(serialDesc) || self.iconUrl != null) {
            output.B(serialDesc, 7, srg.a, self.iconUrl);
        }
        if (!output.E(serialDesc) && x44.r(self.cai_flags, um6.E)) {
            return;
        }
        output.r(serialDesc, 8, (znf) kw9VarArr[8].getValue(), self.cai_flags);
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

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCustom_oauth_client_id() {
        return this.custom_oauth_client_id;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getConnected() {
        return this.connected;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Boolean getUsedAuthentication() {
        return this.usedAuthentication;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final McpAuthStatus getAuthStatus() {
        return this.authStatus;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final Set<CaiMcpFlag> component9() {
        return this.cai_flags;
    }

    /* JADX INFO: renamed from: copy-Z3C1-HA, reason: not valid java name */
    public final ServerBaseFrame m929copyZ3C1HA(String uuid, String name, String url, String custom_oauth_client_id, Boolean connected, Boolean usedAuthentication, McpAuthStatus authStatus, String iconUrl, Set<? extends CaiMcpFlag> cai_flags) {
        uuid.getClass();
        name.getClass();
        cai_flags.getClass();
        return new ServerBaseFrame(uuid, name, url, custom_oauth_client_id, connected, usedAuthentication, authStatus, iconUrl, cai_flags, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ServerBaseFrame)) {
            return false;
        }
        ServerBaseFrame serverBaseFrame = (ServerBaseFrame) other;
        return McpServerId.m1032equalsimpl0(this.uuid, serverBaseFrame.uuid) && x44.r(this.name, serverBaseFrame.name) && x44.r(this.url, serverBaseFrame.url) && x44.r(this.custom_oauth_client_id, serverBaseFrame.custom_oauth_client_id) && x44.r(this.connected, serverBaseFrame.connected) && x44.r(this.usedAuthentication, serverBaseFrame.usedAuthentication) && this.authStatus == serverBaseFrame.authStatus && x44.r(this.iconUrl, serverBaseFrame.iconUrl) && x44.r(this.cai_flags, serverBaseFrame.cai_flags);
    }

    public final McpAuthStatus getAuthStatus() {
        return this.authStatus;
    }

    public final Set<CaiMcpFlag> getCai_flags() {
        return this.cai_flags;
    }

    public final Boolean getConnected() {
        return this.connected;
    }

    public final String getCustom_oauth_client_id() {
        return this.custom_oauth_client_id;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final String getName() {
        return this.name;
    }

    public final String getUrl() {
        return this.url;
    }

    public final Boolean getUsedAuthentication() {
        return this.usedAuthentication;
    }

    /* JADX INFO: renamed from: getUuid-owoRr7k, reason: not valid java name */
    public final String m930getUuidowoRr7k() {
        return this.uuid;
    }

    public int hashCode() {
        int iL = kgh.l(McpServerId.m1033hashCodeimpl(this.uuid) * 31, 31, this.name);
        String str = this.url;
        int iHashCode = (iL + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.custom_oauth_client_id;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.connected;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.usedAuthentication;
        int iHashCode4 = (iHashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        McpAuthStatus mcpAuthStatus = this.authStatus;
        int iHashCode5 = (iHashCode4 + (mcpAuthStatus == null ? 0 : mcpAuthStatus.hashCode())) * 31;
        String str3 = this.iconUrl;
        return this.cai_flags.hashCode() + ((iHashCode5 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public String toString() {
        String strM1034toStringimpl = McpServerId.m1034toStringimpl(this.uuid);
        String str = this.name;
        String str2 = this.url;
        String str3 = this.custom_oauth_client_id;
        Boolean bool = this.connected;
        Boolean bool2 = this.usedAuthentication;
        McpAuthStatus mcpAuthStatus = this.authStatus;
        String str4 = this.iconUrl;
        Set<CaiMcpFlag> set = this.cai_flags;
        StringBuilder sbR = kgh.r("ServerBaseFrame(uuid=", strM1034toStringimpl, ", name=", str, ", url=");
        kgh.u(sbR, str2, ", custom_oauth_client_id=", str3, ", connected=");
        ebh.C(sbR, bool, ", usedAuthentication=", bool2, ", authStatus=");
        sbR.append(mcpAuthStatus);
        sbR.append(", iconUrl=");
        sbR.append(str4);
        sbR.append(", cai_flags=");
        sbR.append(set);
        sbR.append(")");
        return sbR.toString();
    }

    public /* synthetic */ ServerBaseFrame(String str, String str2, String str3, String str4, Boolean bool, Boolean bool2, McpAuthStatus mcpAuthStatus, String str5, Set set, mq5 mq5Var) {
        this(str, str2, str3, str4, bool, bool2, mcpAuthStatus, str5, set);
    }

    public /* synthetic */ ServerBaseFrame(int i, String str, String str2, String str3, String str4, Boolean bool, Boolean bool2, McpAuthStatus mcpAuthStatus, String str5, Set set, vnf vnfVar, mq5 mq5Var) {
        this(i, str, str2, str3, str4, bool, bool2, mcpAuthStatus, str5, set, vnfVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private ServerBaseFrame(String str, String str2, String str3, String str4, Boolean bool, Boolean bool2, McpAuthStatus mcpAuthStatus, String str5, Set<? extends CaiMcpFlag> set) {
        str.getClass();
        str2.getClass();
        set.getClass();
        this.uuid = str;
        this.name = str2;
        this.url = str3;
        this.custom_oauth_client_id = str4;
        this.connected = bool;
        this.usedAuthentication = bool2;
        this.authStatus = mcpAuthStatus;
        this.iconUrl = str5;
        this.cai_flags = set;
    }

    public /* synthetic */ ServerBaseFrame(String str, String str2, String str3, String str4, Boolean bool, Boolean bool2, McpAuthStatus mcpAuthStatus, String str5, Set set, int i, mq5 mq5Var) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? Boolean.FALSE : bool, (i & 32) != 0 ? Boolean.FALSE : bool2, (i & 64) != 0 ? null : mcpAuthStatus, (i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0 ? null : str5, (i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0 ? um6.E : set, null);
    }
}
