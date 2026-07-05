package com.anthropic.claude.api.mcp;

import defpackage.gvj;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.lm6;
import defpackage.mdj;
import defpackage.mia;
import defpackage.mq5;
import defpackage.onf;
import defpackage.srg;
import defpackage.u2b;
import defpackage.uo0;
import defpackage.v2b;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.w2b;
import defpackage.x44;
import defpackage.yb5;
import defpackage.znf;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/0B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nBI\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0018\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJD\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u001aJ\u0010\u0010\"\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u001aR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b*\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b+\u0010\u001aR\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b-\u0010\u001e¨\u00061"}, d2 = {"Lcom/anthropic/claude/api/mcp/McpPrompt;", "", "", "name", "description", "displayName", "", "Lcom/anthropic/claude/api/mcp/McpPromptArgument;", "arguments", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/mcp/McpPrompt;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/anthropic/claude/api/mcp/McpPrompt;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "getDescription", "getDisplayName", "Ljava/util/List;", "getArguments", "Companion", "u2b", "v2b", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class McpPrompt {
    public static final int $stable = 0;
    private final List<McpPromptArgument> arguments;
    private final String description;
    private final String displayName;
    private final String name;
    public static final v2b Companion = new v2b();
    private static final kw9[] $childSerializers = {null, null, null, yb5.w(w1a.F, new mia(23))};

    public /* synthetic */ McpPrompt(int i, String str, String str2, String str3, List list, vnf vnfVar) {
        if (1 != (i & 1)) {
            gvj.f(i, 1, u2b.a.getDescriptor());
            throw null;
        }
        this.name = str;
        if ((i & 2) == 0) {
            this.description = null;
        } else {
            this.description = str2;
        }
        if ((i & 4) == 0) {
            this.displayName = null;
        } else {
            this.displayName = str3;
        }
        if ((i & 8) == 0) {
            this.arguments = lm6.E;
        } else {
            this.arguments = list;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(w2b.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ McpPrompt copy$default(McpPrompt mcpPrompt, String str, String str2, String str3, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mcpPrompt.name;
        }
        if ((i & 2) != 0) {
            str2 = mcpPrompt.description;
        }
        if ((i & 4) != 0) {
            str3 = mcpPrompt.displayName;
        }
        if ((i & 8) != 0) {
            list = mcpPrompt.arguments;
        }
        return mcpPrompt.copy(str, str2, str3, list);
    }

    public static final /* synthetic */ void write$Self$api(McpPrompt self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.q(serialDesc, 0, self.name);
        if (output.E(serialDesc) || self.description != null) {
            output.B(serialDesc, 1, srg.a, self.description);
        }
        if (output.E(serialDesc) || self.displayName != null) {
            output.B(serialDesc, 2, srg.a, self.displayName);
        }
        if (!output.E(serialDesc) && x44.r(self.arguments, lm6.E)) {
            return;
        }
        output.B(serialDesc, 3, (znf) kw9VarArr[3].getValue(), self.arguments);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    public final List<McpPromptArgument> component4() {
        return this.arguments;
    }

    public final McpPrompt copy(String name, String description, String displayName, List<McpPromptArgument> arguments) {
        name.getClass();
        return new McpPrompt(name, description, displayName, arguments);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof McpPrompt)) {
            return false;
        }
        McpPrompt mcpPrompt = (McpPrompt) other;
        return x44.r(this.name, mcpPrompt.name) && x44.r(this.description, mcpPrompt.description) && x44.r(this.displayName, mcpPrompt.displayName) && x44.r(this.arguments, mcpPrompt.arguments);
    }

    public final List<McpPromptArgument> getArguments() {
        return this.arguments;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        int iHashCode = this.name.hashCode() * 31;
        String str = this.description;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.displayName;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<McpPromptArgument> list = this.arguments;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        String str = this.name;
        String str2 = this.description;
        String str3 = this.displayName;
        List<McpPromptArgument> list = this.arguments;
        StringBuilder sbR = kgh.r("McpPrompt(name=", str, ", description=", str2, ", displayName=");
        sbR.append(str3);
        sbR.append(", arguments=");
        sbR.append(list);
        sbR.append(")");
        return sbR.toString();
    }

    public McpPrompt(String str, String str2, String str3, List<McpPromptArgument> list) {
        str.getClass();
        this.name = str;
        this.description = str2;
        this.displayName = str3;
        this.arguments = list;
    }

    public /* synthetic */ McpPrompt(String str, String str2, String str3, List list, int i, mq5 mq5Var) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? lm6.E : list);
    }
}
