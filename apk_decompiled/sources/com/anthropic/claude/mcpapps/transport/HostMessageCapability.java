package com.anthropic.claude.mcpapps.transport;

import defpackage.gp8;
import defpackage.li9;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.uh9;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002()B'\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0018\u00010\u0002j\u0002`\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0018\u00010\u0002j\u0002`\u0003¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0016\u001a\b\u0018\u00010\u0002j\u0002`\u0003HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0018\u001a\b\u0018\u00010\u0002j\u0002`\u0003HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J0\u0010\u0019\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0018\u00010\u0002j\u0002`\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0018\u00010\u0002j\u0002`\u0003HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u001d\u0010\u0004\u001a\b\u0018\u00010\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b%\u0010\u0017R\u001d\u0010\u0005\u001a\b\u0018\u00010\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b&\u0010\u0017¨\u0006*"}, d2 = {"Lcom/anthropic/claude/mcpapps/transport/HostMessageCapability;", "", "Lkotlinx/serialization/json/JsonObject;", "Lcom/anthropic/claude/mcpapps/transport/McpCapability;", "text", "image", "<init>", "(Lkotlinx/serialization/json/JsonObject;Lkotlinx/serialization/json/JsonObject;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILkotlinx/serialization/json/JsonObject;Lkotlinx/serialization/json/JsonObject;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$Claude_mcpapp", "(Lcom/anthropic/claude/mcpapps/transport/HostMessageCapability;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lkotlinx/serialization/json/JsonObject;", "component2", "copy", "(Lkotlinx/serialization/json/JsonObject;Lkotlinx/serialization/json/JsonObject;)Lcom/anthropic/claude/mcpapps/transport/HostMessageCapability;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lkotlinx/serialization/json/JsonObject;", "getText", "getImage", "Companion", "fp8", "gp8", "Claude:mcpapp"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class HostMessageCapability {
    public static final int $stable = 8;
    public static final gp8 Companion = new gp8();
    private final JsonObject image;
    private final JsonObject text;

    public HostMessageCapability(int i, JsonObject jsonObject, JsonObject jsonObject2, vnf vnfVar) {
        this.text = (i & 1) == 0 ? li9.a : jsonObject;
        if ((i & 2) == 0) {
            this.image = li9.a;
        } else {
            this.image = jsonObject2;
        }
    }

    public static /* synthetic */ HostMessageCapability copy$default(HostMessageCapability hostMessageCapability, JsonObject jsonObject, JsonObject jsonObject2, int i, Object obj) {
        if ((i & 1) != 0) {
            jsonObject = hostMessageCapability.text;
        }
        if ((i & 2) != 0) {
            jsonObject2 = hostMessageCapability.image;
        }
        return hostMessageCapability.copy(jsonObject, jsonObject2);
    }

    public static final void write$Self$Claude_mcpapp(HostMessageCapability self, vd4 output, SerialDescriptor serialDesc) {
        if (output.E(serialDesc) || !x44.r(self.text, li9.a)) {
            output.B(serialDesc, 0, uh9.a, self.text);
        }
        if (!output.E(serialDesc) && x44.r(self.image, li9.a)) {
            return;
        }
        output.B(serialDesc, 1, uh9.a, self.image);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final JsonObject getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final JsonObject getImage() {
        return this.image;
    }

    public final HostMessageCapability copy(JsonObject text, JsonObject image) {
        return new HostMessageCapability(text, image);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HostMessageCapability)) {
            return false;
        }
        HostMessageCapability hostMessageCapability = (HostMessageCapability) other;
        return x44.r(this.text, hostMessageCapability.text) && x44.r(this.image, hostMessageCapability.image);
    }

    public final JsonObject getImage() {
        return this.image;
    }

    public final JsonObject getText() {
        return this.text;
    }

    public int hashCode() {
        JsonObject jsonObject = this.text;
        int iHashCode = (jsonObject == null ? 0 : jsonObject.hashCode()) * 31;
        JsonObject jsonObject2 = this.image;
        return iHashCode + (jsonObject2 != null ? jsonObject2.hashCode() : 0);
    }

    public String toString() {
        return "HostMessageCapability(text=" + this.text + ", image=" + this.image + ")";
    }

    public HostMessageCapability() {
        this((JsonObject) null, (JsonObject) null, 3, (mq5) null);
    }

    public HostMessageCapability(JsonObject jsonObject, JsonObject jsonObject2) {
        this.text = jsonObject;
        this.image = jsonObject2;
    }

    public HostMessageCapability(JsonObject jsonObject, JsonObject jsonObject2, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? li9.a : jsonObject, (i & 2) != 0 ? li9.a : jsonObject2);
    }
}
