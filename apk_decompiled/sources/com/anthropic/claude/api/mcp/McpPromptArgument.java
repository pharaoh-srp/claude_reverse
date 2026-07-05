package com.anthropic.claude.api.mcp;

import defpackage.kgh;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.qy1;
import defpackage.srg;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x2b;
import defpackage.x44;
import defpackage.zt1;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002*+B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ4\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010\"\u001a\u00020\u00052\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0018R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b&\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010\u001b¨\u0006,"}, d2 = {"Lcom/anthropic/claude/api/mcp/McpPromptArgument;", "", "", "name", "description", "", "required", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/mcp/McpPromptArgument;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/anthropic/claude/api/mcp/McpPromptArgument;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "getDescription", "Ljava/lang/Boolean;", "getRequired", "Companion", "w2b", "x2b", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class McpPromptArgument {
    public static final int $stable = 0;
    public static final x2b Companion = new x2b();
    private final String description;
    private final String name;
    private final Boolean required;

    public /* synthetic */ McpPromptArgument(int i, String str, String str2, Boolean bool, vnf vnfVar) {
        if ((i & 1) == 0) {
            this.name = null;
        } else {
            this.name = str;
        }
        if ((i & 2) == 0) {
            this.description = null;
        } else {
            this.description = str2;
        }
        if ((i & 4) == 0) {
            this.required = Boolean.FALSE;
        } else {
            this.required = bool;
        }
    }

    public static /* synthetic */ McpPromptArgument copy$default(McpPromptArgument mcpPromptArgument, String str, String str2, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mcpPromptArgument.name;
        }
        if ((i & 2) != 0) {
            str2 = mcpPromptArgument.description;
        }
        if ((i & 4) != 0) {
            bool = mcpPromptArgument.required;
        }
        return mcpPromptArgument.copy(str, str2, bool);
    }

    public static final /* synthetic */ void write$Self$api(McpPromptArgument self, vd4 output, SerialDescriptor serialDesc) {
        if (output.E(serialDesc) || self.name != null) {
            output.B(serialDesc, 0, srg.a, self.name);
        }
        if (output.E(serialDesc) || self.description != null) {
            output.B(serialDesc, 1, srg.a, self.description);
        }
        if (!output.E(serialDesc) && x44.r(self.required, Boolean.FALSE)) {
            return;
        }
        output.B(serialDesc, 2, zt1.a, self.required);
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
    public final Boolean getRequired() {
        return this.required;
    }

    public final McpPromptArgument copy(String name, String description, Boolean required) {
        return new McpPromptArgument(name, description, required);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof McpPromptArgument)) {
            return false;
        }
        McpPromptArgument mcpPromptArgument = (McpPromptArgument) other;
        return x44.r(this.name, mcpPromptArgument.name) && x44.r(this.description, mcpPromptArgument.description) && x44.r(this.required, mcpPromptArgument.required);
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getName() {
        return this.name;
    }

    public final Boolean getRequired() {
        return this.required;
    }

    public int hashCode() {
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.description;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.required;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        String str = this.name;
        String str2 = this.description;
        return qy1.h(kgh.r("McpPromptArgument(name=", str, ", description=", str2, ", required="), this.required, ")");
    }

    public McpPromptArgument() {
        this((String) null, (String) null, (Boolean) null, 7, (mq5) null);
    }

    public McpPromptArgument(String str, String str2, Boolean bool) {
        this.name = str;
        this.description = str2;
        this.required = bool;
    }

    public /* synthetic */ McpPromptArgument(String str, String str2, Boolean bool, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? Boolean.FALSE : bool);
    }
}
