package com.anthropic.claude.api.mcp;

import com.anthropic.claude.types.strings.McpServerId;
import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.d4b;
import defpackage.e0b;
import defpackage.ebh;
import defpackage.g3b;
import defpackage.gvj;
import defpackage.k3b;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.l3b;
import defpackage.l62;
import defpackage.lm6;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.p3b;
import defpackage.rpa;
import defpackage.srg;
import defpackage.u2b;
import defpackage.um6;
import defpackage.uo0;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.yb5;
import defpackage.znf;
import defpackage.zt1;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0087\b\u0018\u0000 W2\u00020\u0001:\u0002XYB·\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000e\u0012\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u000e\u0012\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000e\u0012\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\u0004\b\u0019\u0010\u001aB»\u0001\b\u0010\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000e\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u000e\u0012\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000e\u0012\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u0019\u0010\u001fJ\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b#\u0010!J\u0012\u0010$\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b$\u0010!J\u0012\u0010%\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b%\u0010!J\u0012\u0010&\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b(\u0010'J\u0012\u0010)\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b+\u0010!J\u0018\u0010,\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b,\u0010-J\u0018\u0010.\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b.\u0010-J\u0018\u0010/\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b/\u0010-J\u0018\u00100\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b0\u0010-J\u0016\u00101\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016HÆ\u0003¢\u0006\u0004\b1\u00102JÄ\u0001\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000e2\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u000e2\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000e2\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016HÆ\u0001¢\u0006\u0004\b3\u00104J\u0010\u00106\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b6\u0010!J\u0010\u00107\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b7\u00108J\u001a\u0010:\u001a\u00020\b2\b\u00109\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b:\u0010;J'\u0010D\u001a\u00020A2\u0006\u0010<\u001a\u00020\u00002\u0006\u0010>\u001a\u00020=2\u0006\u0010@\u001a\u00020?H\u0001¢\u0006\u0004\bB\u0010CR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010E\u001a\u0004\bF\u0010!R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010E\u001a\u0004\bG\u0010!R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010E\u001a\u0004\bH\u0010!R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010E\u001a\u0004\bI\u0010!R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010J\u001a\u0004\bK\u0010'R\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u0010J\u001a\u0004\bL\u0010'R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010M\u001a\u0004\bN\u0010*R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010E\u001a\u0004\bO\u0010!R\u001f\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u0010P\u001a\u0004\bQ\u0010-R\u001f\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u0012\u0010P\u001a\u0004\bR\u0010-R\u001f\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u0014\u0010P\u001a\u0004\bS\u0010-R\u001f\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u0015\u0010P\u001a\u0004\bT\u0010-R\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0006¢\u0006\f\n\u0004\b\u0018\u0010U\u001a\u0004\bV\u00102¨\u0006Z"}, d2 = {"Lcom/anthropic/claude/api/mcp/McpServer;", "", "Lcom/anthropic/claude/types/strings/McpServerId;", "uuid", "", "name", "url", "custom_oauth_client_id", "", "connected", "usedAuthentication", "Lcom/anthropic/claude/api/mcp/McpAuthStatus;", "authStatus", "iconUrl", "", "Lcom/anthropic/claude/api/mcp/McpTool;", "tools", "Lcom/anthropic/claude/api/mcp/McpPrompt;", "prompts", "Lcom/anthropic/claude/api/mcp/McpResource;", "resources", "allowed_link_domains", "", "Lcom/anthropic/claude/api/mcp/CaiMcpFlag;", "cai_flags", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/anthropic/claude/api/mcp/McpAuthStatus;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/Set;Lmq5;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/anthropic/claude/api/mcp/McpAuthStatus;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/Set;Lvnf;Lmq5;)V", "component1-owoRr7k", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "()Ljava/lang/Boolean;", "component6", "component7", "()Lcom/anthropic/claude/api/mcp/McpAuthStatus;", "component8", "component9", "()Ljava/util/List;", "component10", "component11", "component12", "component13", "()Ljava/util/Set;", "copy-IgoR-xQ", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/anthropic/claude/api/mcp/McpAuthStatus;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/Set;)Lcom/anthropic/claude/api/mcp/McpServer;", "copy", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/mcp/McpServer;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getUuid-owoRr7k", "getName", "getUrl", "getCustom_oauth_client_id", "Ljava/lang/Boolean;", "getConnected", "getUsedAuthentication", "Lcom/anthropic/claude/api/mcp/McpAuthStatus;", "getAuthStatus", "getIconUrl", "Ljava/util/List;", "getTools", "getPrompts", "getResources", "getAllowed_link_domains", "Ljava/util/Set;", "getCai_flags", "Companion", "k3b", "l3b", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class McpServer {
    private static final kw9[] $childSerializers;
    public static final int $stable = 0;
    public static final l3b Companion = new l3b();
    private final List<String> allowed_link_domains;
    private final McpAuthStatus authStatus;
    private final Set<CaiMcpFlag> cai_flags;
    private final Boolean connected;
    private final String custom_oauth_client_id;
    private final String iconUrl;
    private final String name;
    private final List<McpPrompt> prompts;
    private final List<McpResource> resources;
    private final List<McpTool> tools;
    private final String url;
    private final Boolean usedAuthentication;
    private final String uuid;

    static {
        rpa rpaVar = new rpa(11);
        w1a w1aVar = w1a.F;
        $childSerializers = new kw9[]{null, null, null, null, null, null, null, null, yb5.w(w1aVar, rpaVar), yb5.w(w1aVar, new rpa(12)), yb5.w(w1aVar, new rpa(13)), yb5.w(w1aVar, new rpa(14)), yb5.w(w1aVar, new rpa(15))};
    }

    private /* synthetic */ McpServer(int i, String str, String str2, String str3, String str4, Boolean bool, Boolean bool2, McpAuthStatus mcpAuthStatus, String str5, List list, List list2, List list3, List list4, Set set, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, k3b.a.getDescriptor());
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
        int i2 = i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING;
        lm6 lm6Var = lm6.E;
        if (i2 == 0) {
            this.tools = lm6Var;
        } else {
            this.tools = list;
        }
        if ((i & 512) == 0) {
            this.prompts = lm6Var;
        } else {
            this.prompts = list2;
        }
        if ((i & FreeTypeConstants.FT_LOAD_NO_RECURSE) == 0) {
            this.resources = lm6Var;
        } else {
            this.resources = list3;
        }
        if ((i & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM) == 0) {
            this.allowed_link_domains = null;
        } else {
            this.allowed_link_domains = list4;
        }
        this.cai_flags = (i & FreeTypeConstants.FT_LOAD_MONOCHROME) == 0 ? um6.E : set;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(d4b.a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new uo0(u2b.a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
        return new uo0(g3b.a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$2() {
        return new uo0(srg.a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$3() {
        return new uo0(l62.d, 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: copy-IgoR-xQ$default, reason: not valid java name */
    public static /* synthetic */ McpServer m343copyIgoRxQ$default(McpServer mcpServer, String str, String str2, String str3, String str4, Boolean bool, Boolean bool2, McpAuthStatus mcpAuthStatus, String str5, List list, List list2, List list3, List list4, Set set, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mcpServer.uuid;
        }
        return mcpServer.m345copyIgoRxQ(str, (i & 2) != 0 ? mcpServer.name : str2, (i & 4) != 0 ? mcpServer.url : str3, (i & 8) != 0 ? mcpServer.custom_oauth_client_id : str4, (i & 16) != 0 ? mcpServer.connected : bool, (i & 32) != 0 ? mcpServer.usedAuthentication : bool2, (i & 64) != 0 ? mcpServer.authStatus : mcpAuthStatus, (i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0 ? mcpServer.iconUrl : str5, (i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0 ? mcpServer.tools : list, (i & 512) != 0 ? mcpServer.prompts : list2, (i & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0 ? mcpServer.resources : list3, (i & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM) != 0 ? mcpServer.allowed_link_domains : list4, (i & FreeTypeConstants.FT_LOAD_MONOCHROME) != 0 ? mcpServer.cai_flags : set);
    }

    public static final /* synthetic */ void write$Self$api(McpServer self, vd4 output, SerialDescriptor serialDesc) {
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
        boolean zE = output.E(serialDesc);
        lm6 lm6Var = lm6.E;
        if (zE || !x44.r(self.tools, lm6Var)) {
            output.B(serialDesc, 8, (znf) kw9VarArr[8].getValue(), self.tools);
        }
        if (output.E(serialDesc) || !x44.r(self.prompts, lm6Var)) {
            output.B(serialDesc, 9, (znf) kw9VarArr[9].getValue(), self.prompts);
        }
        if (output.E(serialDesc) || !x44.r(self.resources, lm6Var)) {
            output.B(serialDesc, 10, (znf) kw9VarArr[10].getValue(), self.resources);
        }
        if (output.E(serialDesc) || self.allowed_link_domains != null) {
            output.B(serialDesc, 11, (znf) kw9VarArr[11].getValue(), self.allowed_link_domains);
        }
        if (!output.E(serialDesc) && x44.r(self.cai_flags, um6.E)) {
            return;
        }
        output.r(serialDesc, 12, (znf) kw9VarArr[12].getValue(), self.cai_flags);
    }

    /* JADX INFO: renamed from: component1-owoRr7k, reason: not valid java name and from getter */
    public final String getUuid() {
        return this.uuid;
    }

    public final List<McpPrompt> component10() {
        return this.prompts;
    }

    public final List<McpResource> component11() {
        return this.resources;
    }

    public final List<String> component12() {
        return this.allowed_link_domains;
    }

    public final Set<CaiMcpFlag> component13() {
        return this.cai_flags;
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

    public final List<McpTool> component9() {
        return this.tools;
    }

    /* JADX INFO: renamed from: copy-IgoR-xQ, reason: not valid java name */
    public final McpServer m345copyIgoRxQ(String uuid, String name, String url, String custom_oauth_client_id, Boolean connected, Boolean usedAuthentication, McpAuthStatus authStatus, String iconUrl, List<McpTool> tools, List<McpPrompt> prompts, List<McpResource> resources, List<String> allowed_link_domains, Set<? extends CaiMcpFlag> cai_flags) {
        uuid.getClass();
        name.getClass();
        cai_flags.getClass();
        return new McpServer(uuid, name, url, custom_oauth_client_id, connected, usedAuthentication, authStatus, iconUrl, tools, prompts, resources, allowed_link_domains, cai_flags, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof McpServer)) {
            return false;
        }
        McpServer mcpServer = (McpServer) other;
        return McpServerId.m1032equalsimpl0(this.uuid, mcpServer.uuid) && x44.r(this.name, mcpServer.name) && x44.r(this.url, mcpServer.url) && x44.r(this.custom_oauth_client_id, mcpServer.custom_oauth_client_id) && x44.r(this.connected, mcpServer.connected) && x44.r(this.usedAuthentication, mcpServer.usedAuthentication) && this.authStatus == mcpServer.authStatus && x44.r(this.iconUrl, mcpServer.iconUrl) && x44.r(this.tools, mcpServer.tools) && x44.r(this.prompts, mcpServer.prompts) && x44.r(this.resources, mcpServer.resources) && x44.r(this.allowed_link_domains, mcpServer.allowed_link_domains) && x44.r(this.cai_flags, mcpServer.cai_flags);
    }

    public final List<String> getAllowed_link_domains() {
        return this.allowed_link_domains;
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

    public final List<McpPrompt> getPrompts() {
        return this.prompts;
    }

    public final List<McpResource> getResources() {
        return this.resources;
    }

    public final List<McpTool> getTools() {
        return this.tools;
    }

    public final String getUrl() {
        return this.url;
    }

    public final Boolean getUsedAuthentication() {
        return this.usedAuthentication;
    }

    /* JADX INFO: renamed from: getUuid-owoRr7k, reason: not valid java name */
    public final String m346getUuidowoRr7k() {
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
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<McpTool> list = this.tools;
        int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        List<McpPrompt> list2 = this.prompts;
        int iHashCode8 = (iHashCode7 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<McpResource> list3 = this.resources;
        int iHashCode9 = (iHashCode8 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<String> list4 = this.allowed_link_domains;
        return this.cai_flags.hashCode() + ((iHashCode9 + (list4 != null ? list4.hashCode() : 0)) * 31);
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
        List<McpTool> list = this.tools;
        List<McpPrompt> list2 = this.prompts;
        List<McpResource> list3 = this.resources;
        List<String> list4 = this.allowed_link_domains;
        Set<CaiMcpFlag> set = this.cai_flags;
        StringBuilder sbR = kgh.r("McpServer(uuid=", strM1034toStringimpl, ", name=", str, ", url=");
        kgh.u(sbR, str2, ", custom_oauth_client_id=", str3, ", connected=");
        ebh.C(sbR, bool, ", usedAuthentication=", bool2, ", authStatus=");
        sbR.append(mcpAuthStatus);
        sbR.append(", iconUrl=");
        sbR.append(str4);
        sbR.append(", tools=");
        sbR.append(list);
        sbR.append(", prompts=");
        sbR.append(list2);
        sbR.append(", resources=");
        sbR.append(list3);
        sbR.append(", allowed_link_domains=");
        sbR.append(list4);
        sbR.append(", cai_flags=");
        sbR.append(set);
        sbR.append(")");
        return sbR.toString();
    }

    public /* synthetic */ McpServer(String str, String str2, String str3, String str4, Boolean bool, Boolean bool2, McpAuthStatus mcpAuthStatus, String str5, List list, List list2, List list3, List list4, Set set, mq5 mq5Var) {
        this(str, str2, str3, str4, bool, bool2, mcpAuthStatus, str5, list, list2, list3, list4, set);
    }

    public /* synthetic */ McpServer(int i, String str, String str2, String str3, String str4, Boolean bool, Boolean bool2, McpAuthStatus mcpAuthStatus, String str5, List list, List list2, List list3, List list4, Set set, vnf vnfVar, mq5 mq5Var) {
        this(i, str, str2, str3, str4, bool, bool2, mcpAuthStatus, str5, list, list2, list3, list4, set, vnfVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private McpServer(String str, String str2, String str3, String str4, Boolean bool, Boolean bool2, McpAuthStatus mcpAuthStatus, String str5, List<McpTool> list, List<McpPrompt> list2, List<McpResource> list3, List<String> list4, Set<? extends CaiMcpFlag> set) {
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
        this.tools = list;
        this.prompts = list2;
        this.resources = list3;
        this.allowed_link_domains = list4;
        this.cai_flags = set;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ McpServer(String str, String str2, String str3, String str4, Boolean bool, Boolean bool2, McpAuthStatus mcpAuthStatus, String str5, List list, List list2, List list3, List list4, Set set, int i, mq5 mq5Var) {
        String str6 = (i & 4) != 0 ? null : str3;
        String str7 = (i & 8) != 0 ? null : str4;
        Boolean bool3 = (i & 16) != 0 ? Boolean.FALSE : bool;
        Boolean bool4 = (i & 32) != 0 ? Boolean.FALSE : bool2;
        McpAuthStatus mcpAuthStatus2 = (i & 64) != 0 ? null : mcpAuthStatus;
        String str8 = (i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0 ? null : str5;
        int i2 = i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING;
        lm6 lm6Var = lm6.E;
        this(str, str2, str6, str7, bool3, bool4, mcpAuthStatus2, str8, i2 != 0 ? lm6Var : list, (i & 512) != 0 ? lm6Var : list2, (i & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0 ? lm6Var : list3, (i & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM) != 0 ? null : list4, (i & FreeTypeConstants.FT_LOAD_MONOCHROME) != 0 ? um6.E : set, null);
    }
}
