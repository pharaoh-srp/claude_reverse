package com.anthropic.claude.mcpapps.transport;

import defpackage.fp8;
import defpackage.hp8;
import defpackage.li9;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.uh9;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import defpackage.zo8;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 92\u00020\u0001:\u0002:;B_\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0018\u00010\u0002j\u0002`\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0018\u00010\u0002j\u0002`\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0018\u00010\u0002j\u0002`\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0018\u00010\u0002j\u0002`\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rBW\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0016\u0010\u001c\u001a\b\u0018\u00010\u0002j\u0002`\u0003HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0016\u0010\u001e\u001a\b\u0018\u00010\u0002j\u0002`\u0003HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0016\u0010\u001f\u001a\b\u0018\u00010\u0002j\u0002`\u0003HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001dJ\u0016\u0010 \u001a\b\u0018\u00010\u0002j\u0002`\u0003HÆ\u0003¢\u0006\u0004\b \u0010\u001dJ\u0012\u0010!\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b#\u0010$Jh\u0010%\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0018\u00010\u0002j\u0002`\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0018\u00010\u0002j\u0002`\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0018\u00010\u0002j\u0002`\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0018\u00010\u0002j\u0002`\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010(\u001a\u00020'HÖ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010.\u001a\u00020-2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b.\u0010/R\u001d\u0010\u0004\u001a\b\u0018\u00010\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u00100\u001a\u0004\b1\u0010\u001dR\u001d\u0010\u0005\u001a\b\u0018\u00010\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u00100\u001a\u0004\b2\u0010\u001dR\u001d\u0010\u0006\u001a\b\u0018\u00010\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0006\u00100\u001a\u0004\b3\u0010\u001dR\u001d\u0010\u0007\u001a\b\u0018\u00010\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u00100\u001a\u0004\b4\u0010\u001dR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00105\u001a\u0004\b6\u0010\"R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00107\u001a\u0004\b8\u0010$¨\u0006<"}, d2 = {"Lcom/anthropic/claude/mcpapps/transport/HostCapabilities;", "", "Lkotlinx/serialization/json/JsonObject;", "Lcom/anthropic/claude/mcpapps/transport/McpCapability;", "openLinks", "serverTools", "serverResources", "logging", "Lcom/anthropic/claude/mcpapps/transport/HostUpdateModelContextCapability;", "updateModelContext", "Lcom/anthropic/claude/mcpapps/transport/HostMessageCapability;", "message", "<init>", "(Lkotlinx/serialization/json/JsonObject;Lkotlinx/serialization/json/JsonObject;Lkotlinx/serialization/json/JsonObject;Lkotlinx/serialization/json/JsonObject;Lcom/anthropic/claude/mcpapps/transport/HostUpdateModelContextCapability;Lcom/anthropic/claude/mcpapps/transport/HostMessageCapability;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILkotlinx/serialization/json/JsonObject;Lkotlinx/serialization/json/JsonObject;Lkotlinx/serialization/json/JsonObject;Lkotlinx/serialization/json/JsonObject;Lcom/anthropic/claude/mcpapps/transport/HostUpdateModelContextCapability;Lcom/anthropic/claude/mcpapps/transport/HostMessageCapability;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$Claude_mcpapp", "(Lcom/anthropic/claude/mcpapps/transport/HostCapabilities;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lkotlinx/serialization/json/JsonObject;", "component2", "component3", "component4", "component5", "()Lcom/anthropic/claude/mcpapps/transport/HostUpdateModelContextCapability;", "component6", "()Lcom/anthropic/claude/mcpapps/transport/HostMessageCapability;", "copy", "(Lkotlinx/serialization/json/JsonObject;Lkotlinx/serialization/json/JsonObject;Lkotlinx/serialization/json/JsonObject;Lkotlinx/serialization/json/JsonObject;Lcom/anthropic/claude/mcpapps/transport/HostUpdateModelContextCapability;Lcom/anthropic/claude/mcpapps/transport/HostMessageCapability;)Lcom/anthropic/claude/mcpapps/transport/HostCapabilities;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lkotlinx/serialization/json/JsonObject;", "getOpenLinks", "getServerTools", "getServerResources", "getLogging", "Lcom/anthropic/claude/mcpapps/transport/HostUpdateModelContextCapability;", "getUpdateModelContext", "Lcom/anthropic/claude/mcpapps/transport/HostMessageCapability;", "getMessage", "Companion", "zo8", "yo8", "Claude:mcpapp"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class HostCapabilities {
    public static final int $stable = 8;
    public static final zo8 Companion = new zo8();
    private final JsonObject logging;
    private final HostMessageCapability message;
    private final JsonObject openLinks;
    private final JsonObject serverResources;
    private final JsonObject serverTools;
    private final HostUpdateModelContextCapability updateModelContext;

    public HostCapabilities(int i, JsonObject jsonObject, JsonObject jsonObject2, JsonObject jsonObject3, JsonObject jsonObject4, HostUpdateModelContextCapability hostUpdateModelContextCapability, HostMessageCapability hostMessageCapability, vnf vnfVar) {
        this.openLinks = (i & 1) == 0 ? li9.a : jsonObject;
        if ((i & 2) == 0) {
            this.serverTools = li9.a;
        } else {
            this.serverTools = jsonObject2;
        }
        if ((i & 4) == 0) {
            this.serverResources = null;
        } else {
            this.serverResources = jsonObject3;
        }
        if ((i & 8) == 0) {
            this.logging = li9.a;
        } else {
            this.logging = jsonObject4;
        }
        if ((i & 16) == 0) {
            this.updateModelContext = new HostUpdateModelContextCapability((JsonObject) null, (JsonObject) null, 3, (mq5) null);
        } else {
            this.updateModelContext = hostUpdateModelContextCapability;
        }
        if ((i & 32) == 0) {
            this.message = new HostMessageCapability((JsonObject) null, (JsonObject) null, 3, (mq5) null);
        } else {
            this.message = hostMessageCapability;
        }
    }

    public static /* synthetic */ HostCapabilities copy$default(HostCapabilities hostCapabilities, JsonObject jsonObject, JsonObject jsonObject2, JsonObject jsonObject3, JsonObject jsonObject4, HostUpdateModelContextCapability hostUpdateModelContextCapability, HostMessageCapability hostMessageCapability, int i, Object obj) {
        if ((i & 1) != 0) {
            jsonObject = hostCapabilities.openLinks;
        }
        if ((i & 2) != 0) {
            jsonObject2 = hostCapabilities.serverTools;
        }
        if ((i & 4) != 0) {
            jsonObject3 = hostCapabilities.serverResources;
        }
        if ((i & 8) != 0) {
            jsonObject4 = hostCapabilities.logging;
        }
        if ((i & 16) != 0) {
            hostUpdateModelContextCapability = hostCapabilities.updateModelContext;
        }
        if ((i & 32) != 0) {
            hostMessageCapability = hostCapabilities.message;
        }
        HostUpdateModelContextCapability hostUpdateModelContextCapability2 = hostUpdateModelContextCapability;
        HostMessageCapability hostMessageCapability2 = hostMessageCapability;
        return hostCapabilities.copy(jsonObject, jsonObject2, jsonObject3, jsonObject4, hostUpdateModelContextCapability2, hostMessageCapability2);
    }

    public static final void write$Self$Claude_mcpapp(HostCapabilities self, vd4 output, SerialDescriptor serialDesc) {
        if (output.E(serialDesc) || !x44.r(self.openLinks, li9.a)) {
            output.B(serialDesc, 0, uh9.a, self.openLinks);
        }
        if (output.E(serialDesc) || !x44.r(self.serverTools, li9.a)) {
            output.B(serialDesc, 1, uh9.a, self.serverTools);
        }
        if (output.E(serialDesc) || !x44.r(self.serverResources, null)) {
            output.B(serialDesc, 2, uh9.a, self.serverResources);
        }
        if (output.E(serialDesc) || !x44.r(self.logging, li9.a)) {
            output.B(serialDesc, 3, uh9.a, self.logging);
        }
        if (output.E(serialDesc) || !x44.r(self.updateModelContext, new HostUpdateModelContextCapability((JsonObject) null, (JsonObject) null, 3, (mq5) null))) {
            output.B(serialDesc, 4, hp8.a, self.updateModelContext);
        }
        if (!output.E(serialDesc) && x44.r(self.message, new HostMessageCapability((JsonObject) null, (JsonObject) null, 3, (mq5) null))) {
            return;
        }
        output.B(serialDesc, 5, fp8.a, self.message);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final JsonObject getOpenLinks() {
        return this.openLinks;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final JsonObject getServerTools() {
        return this.serverTools;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final JsonObject getServerResources() {
        return this.serverResources;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final JsonObject getLogging() {
        return this.logging;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final HostUpdateModelContextCapability getUpdateModelContext() {
        return this.updateModelContext;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final HostMessageCapability getMessage() {
        return this.message;
    }

    public final HostCapabilities copy(JsonObject openLinks, JsonObject serverTools, JsonObject serverResources, JsonObject logging, HostUpdateModelContextCapability updateModelContext, HostMessageCapability message) {
        return new HostCapabilities(openLinks, serverTools, serverResources, logging, updateModelContext, message);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HostCapabilities)) {
            return false;
        }
        HostCapabilities hostCapabilities = (HostCapabilities) other;
        return x44.r(this.openLinks, hostCapabilities.openLinks) && x44.r(this.serverTools, hostCapabilities.serverTools) && x44.r(this.serverResources, hostCapabilities.serverResources) && x44.r(this.logging, hostCapabilities.logging) && x44.r(this.updateModelContext, hostCapabilities.updateModelContext) && x44.r(this.message, hostCapabilities.message);
    }

    public final JsonObject getLogging() {
        return this.logging;
    }

    public final HostMessageCapability getMessage() {
        return this.message;
    }

    public final JsonObject getOpenLinks() {
        return this.openLinks;
    }

    public final JsonObject getServerResources() {
        return this.serverResources;
    }

    public final JsonObject getServerTools() {
        return this.serverTools;
    }

    public final HostUpdateModelContextCapability getUpdateModelContext() {
        return this.updateModelContext;
    }

    public int hashCode() {
        JsonObject jsonObject = this.openLinks;
        int iHashCode = (jsonObject == null ? 0 : jsonObject.hashCode()) * 31;
        JsonObject jsonObject2 = this.serverTools;
        int iHashCode2 = (iHashCode + (jsonObject2 == null ? 0 : jsonObject2.hashCode())) * 31;
        JsonObject jsonObject3 = this.serverResources;
        int iHashCode3 = (iHashCode2 + (jsonObject3 == null ? 0 : jsonObject3.hashCode())) * 31;
        JsonObject jsonObject4 = this.logging;
        int iHashCode4 = (iHashCode3 + (jsonObject4 == null ? 0 : jsonObject4.hashCode())) * 31;
        HostUpdateModelContextCapability hostUpdateModelContextCapability = this.updateModelContext;
        int iHashCode5 = (iHashCode4 + (hostUpdateModelContextCapability == null ? 0 : hostUpdateModelContextCapability.hashCode())) * 31;
        HostMessageCapability hostMessageCapability = this.message;
        return iHashCode5 + (hostMessageCapability != null ? hostMessageCapability.hashCode() : 0);
    }

    public String toString() {
        return "HostCapabilities(openLinks=" + this.openLinks + ", serverTools=" + this.serverTools + ", serverResources=" + this.serverResources + ", logging=" + this.logging + ", updateModelContext=" + this.updateModelContext + ", message=" + this.message + ")";
    }

    public HostCapabilities() {
        this((JsonObject) null, (JsonObject) null, (JsonObject) null, (JsonObject) null, (HostUpdateModelContextCapability) null, (HostMessageCapability) null, 63, (mq5) null);
    }

    public HostCapabilities(JsonObject jsonObject, JsonObject jsonObject2, JsonObject jsonObject3, JsonObject jsonObject4, HostUpdateModelContextCapability hostUpdateModelContextCapability, HostMessageCapability hostMessageCapability) {
        this.openLinks = jsonObject;
        this.serverTools = jsonObject2;
        this.serverResources = jsonObject3;
        this.logging = jsonObject4;
        this.updateModelContext = hostUpdateModelContextCapability;
        this.message = hostMessageCapability;
    }

    public HostCapabilities(JsonObject jsonObject, JsonObject jsonObject2, JsonObject jsonObject3, JsonObject jsonObject4, HostUpdateModelContextCapability hostUpdateModelContextCapability, HostMessageCapability hostMessageCapability, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? li9.a : jsonObject, (i & 2) != 0 ? li9.a : jsonObject2, (i & 4) != 0 ? null : jsonObject3, (i & 8) != 0 ? li9.a : jsonObject4, (i & 16) != 0 ? new HostUpdateModelContextCapability((JsonObject) null, (JsonObject) null, 3, (mq5) null) : hostUpdateModelContextCapability, (i & 32) != 0 ? new HostMessageCapability((JsonObject) null, (JsonObject) null, 3, (mq5) null) : hostMessageCapability);
    }
}
