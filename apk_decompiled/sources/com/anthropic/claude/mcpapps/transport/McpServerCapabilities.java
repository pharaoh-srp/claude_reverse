package com.anthropic.claude.mcpapps.transport;

import defpackage.mdj;
import defpackage.mq5;
import defpackage.n3b;
import defpackage.onf;
import defpackage.uh9;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+,B=\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0017\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0019\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0018\u0010\u001a\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018JF\u0010\u001b\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\tHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u001f\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b'\u0010\u0018R\u001f\u0010\u0005\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b(\u0010\u0018R\u001f\u0010\u0006\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038\u0006¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b)\u0010\u0018¨\u0006-"}, d2 = {"Lcom/anthropic/claude/mcpapps/transport/McpServerCapabilities;", "", "Lkotlinx/serialization/json/JsonObject;", "Lcom/anthropic/claude/mcpapps/transport/McpCapability;", "tools", "resources", "prompts", "<init>", "(Lkotlinx/serialization/json/JsonObject;Lkotlinx/serialization/json/JsonObject;Lkotlinx/serialization/json/JsonObject;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILkotlinx/serialization/json/JsonObject;Lkotlinx/serialization/json/JsonObject;Lkotlinx/serialization/json/JsonObject;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$Claude_mcpapp", "(Lcom/anthropic/claude/mcpapps/transport/McpServerCapabilities;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lkotlinx/serialization/json/JsonObject;", "component2", "component3", "copy", "(Lkotlinx/serialization/json/JsonObject;Lkotlinx/serialization/json/JsonObject;Lkotlinx/serialization/json/JsonObject;)Lcom/anthropic/claude/mcpapps/transport/McpServerCapabilities;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lkotlinx/serialization/json/JsonObject;", "getTools", "getResources", "getPrompts", "Companion", "m3b", "n3b", "Claude:mcpapp"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class McpServerCapabilities {
    public static final int $stable = 8;
    public static final n3b Companion = new n3b();
    private final JsonObject prompts;
    private final JsonObject resources;
    private final JsonObject tools;

    public /* synthetic */ McpServerCapabilities(int i, JsonObject jsonObject, JsonObject jsonObject2, JsonObject jsonObject3, vnf vnfVar) {
        if ((i & 1) == 0) {
            this.tools = null;
        } else {
            this.tools = jsonObject;
        }
        if ((i & 2) == 0) {
            this.resources = null;
        } else {
            this.resources = jsonObject2;
        }
        if ((i & 4) == 0) {
            this.prompts = null;
        } else {
            this.prompts = jsonObject3;
        }
    }

    public static /* synthetic */ McpServerCapabilities copy$default(McpServerCapabilities mcpServerCapabilities, JsonObject jsonObject, JsonObject jsonObject2, JsonObject jsonObject3, int i, Object obj) {
        if ((i & 1) != 0) {
            jsonObject = mcpServerCapabilities.tools;
        }
        if ((i & 2) != 0) {
            jsonObject2 = mcpServerCapabilities.resources;
        }
        if ((i & 4) != 0) {
            jsonObject3 = mcpServerCapabilities.prompts;
        }
        return mcpServerCapabilities.copy(jsonObject, jsonObject2, jsonObject3);
    }

    public static final /* synthetic */ void write$Self$Claude_mcpapp(McpServerCapabilities self, vd4 output, SerialDescriptor serialDesc) {
        if (output.E(serialDesc) || !x44.r(self.tools, null)) {
            output.B(serialDesc, 0, uh9.a, self.tools);
        }
        if (output.E(serialDesc) || !x44.r(self.resources, null)) {
            output.B(serialDesc, 1, uh9.a, self.resources);
        }
        if (!output.E(serialDesc) && x44.r(self.prompts, null)) {
            return;
        }
        output.B(serialDesc, 2, uh9.a, self.prompts);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final JsonObject getTools() {
        return this.tools;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final JsonObject getResources() {
        return this.resources;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final JsonObject getPrompts() {
        return this.prompts;
    }

    public final McpServerCapabilities copy(JsonObject tools, JsonObject resources, JsonObject prompts) {
        return new McpServerCapabilities(tools, resources, prompts);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof McpServerCapabilities)) {
            return false;
        }
        McpServerCapabilities mcpServerCapabilities = (McpServerCapabilities) other;
        return x44.r(this.tools, mcpServerCapabilities.tools) && x44.r(this.resources, mcpServerCapabilities.resources) && x44.r(this.prompts, mcpServerCapabilities.prompts);
    }

    public final JsonObject getPrompts() {
        return this.prompts;
    }

    public final JsonObject getResources() {
        return this.resources;
    }

    public final JsonObject getTools() {
        return this.tools;
    }

    public int hashCode() {
        JsonObject jsonObject = this.tools;
        int iHashCode = (jsonObject == null ? 0 : jsonObject.hashCode()) * 31;
        JsonObject jsonObject2 = this.resources;
        int iHashCode2 = (iHashCode + (jsonObject2 == null ? 0 : jsonObject2.hashCode())) * 31;
        JsonObject jsonObject3 = this.prompts;
        return iHashCode2 + (jsonObject3 != null ? jsonObject3.hashCode() : 0);
    }

    public String toString() {
        return "McpServerCapabilities(tools=" + this.tools + ", resources=" + this.resources + ", prompts=" + this.prompts + ")";
    }

    public McpServerCapabilities() {
        this((JsonObject) null, (JsonObject) null, (JsonObject) null, 7, (mq5) null);
    }

    public McpServerCapabilities(JsonObject jsonObject, JsonObject jsonObject2, JsonObject jsonObject3) {
        this.tools = jsonObject;
        this.resources = jsonObject2;
        this.prompts = jsonObject3;
    }

    public /* synthetic */ McpServerCapabilities(JsonObject jsonObject, JsonObject jsonObject2, JsonObject jsonObject3, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : jsonObject, (i & 2) != 0 ? null : jsonObject2, (i & 4) != 0 ? null : jsonObject3);
    }
}
