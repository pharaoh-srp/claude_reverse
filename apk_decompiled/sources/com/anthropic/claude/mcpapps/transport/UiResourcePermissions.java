package com.anthropic.claude.mcpapps.transport;

import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.qdi;
import defpackage.uh9;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002./BG\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0018\u00010\u0002j\u0002`\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0018\u00010\u0002j\u0002`\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0018\u00010\u0002j\u0002`\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0018\u00010\u0002j\u0002`\u0003¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0018\u001a\b\u0018\u00010\u0002j\u0002`\u0003HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u001a\u001a\b\u0018\u00010\u0002j\u0002`\u0003HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0016\u0010\u001b\u001a\b\u0018\u00010\u0002j\u0002`\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0016\u0010\u001c\u001a\b\u0018\u00010\u0002j\u0002`\u0003HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019JP\u0010\u001d\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0018\u00010\u0002j\u0002`\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0018\u00010\u0002j\u0002`\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0018\u00010\u0002j\u0002`\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0018\u00010\u0002j\u0002`\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\u001d\u0010\u0004\u001a\b\u0018\u00010\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b)\u0010\u0019R\u001d\u0010\u0005\u001a\b\u0018\u00010\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b*\u0010\u0019R\u001d\u0010\u0006\u001a\b\u0018\u00010\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b+\u0010\u0019R\u001d\u0010\u0007\u001a\b\u0018\u00010\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b,\u0010\u0019¨\u00060"}, d2 = {"Lcom/anthropic/claude/mcpapps/transport/UiResourcePermissions;", "", "Lkotlinx/serialization/json/JsonObject;", "Lcom/anthropic/claude/mcpapps/transport/McpCapability;", "camera", "microphone", "geolocation", "clipboardWrite", "<init>", "(Lkotlinx/serialization/json/JsonObject;Lkotlinx/serialization/json/JsonObject;Lkotlinx/serialization/json/JsonObject;Lkotlinx/serialization/json/JsonObject;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILkotlinx/serialization/json/JsonObject;Lkotlinx/serialization/json/JsonObject;Lkotlinx/serialization/json/JsonObject;Lkotlinx/serialization/json/JsonObject;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$Claude_mcpapp", "(Lcom/anthropic/claude/mcpapps/transport/UiResourcePermissions;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lkotlinx/serialization/json/JsonObject;", "component2", "component3", "component4", "copy", "(Lkotlinx/serialization/json/JsonObject;Lkotlinx/serialization/json/JsonObject;Lkotlinx/serialization/json/JsonObject;Lkotlinx/serialization/json/JsonObject;)Lcom/anthropic/claude/mcpapps/transport/UiResourcePermissions;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lkotlinx/serialization/json/JsonObject;", "getCamera", "getMicrophone", "getGeolocation", "getClipboardWrite", "Companion", "pdi", "qdi", "Claude:mcpapp"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class UiResourcePermissions {
    public static final int $stable = 8;
    public static final qdi Companion = new qdi();
    private final JsonObject camera;
    private final JsonObject clipboardWrite;
    private final JsonObject geolocation;
    private final JsonObject microphone;

    public /* synthetic */ UiResourcePermissions(int i, JsonObject jsonObject, JsonObject jsonObject2, JsonObject jsonObject3, JsonObject jsonObject4, vnf vnfVar) {
        if ((i & 1) == 0) {
            this.camera = null;
        } else {
            this.camera = jsonObject;
        }
        if ((i & 2) == 0) {
            this.microphone = null;
        } else {
            this.microphone = jsonObject2;
        }
        if ((i & 4) == 0) {
            this.geolocation = null;
        } else {
            this.geolocation = jsonObject3;
        }
        if ((i & 8) == 0) {
            this.clipboardWrite = null;
        } else {
            this.clipboardWrite = jsonObject4;
        }
    }

    public static /* synthetic */ UiResourcePermissions copy$default(UiResourcePermissions uiResourcePermissions, JsonObject jsonObject, JsonObject jsonObject2, JsonObject jsonObject3, JsonObject jsonObject4, int i, Object obj) {
        if ((i & 1) != 0) {
            jsonObject = uiResourcePermissions.camera;
        }
        if ((i & 2) != 0) {
            jsonObject2 = uiResourcePermissions.microphone;
        }
        if ((i & 4) != 0) {
            jsonObject3 = uiResourcePermissions.geolocation;
        }
        if ((i & 8) != 0) {
            jsonObject4 = uiResourcePermissions.clipboardWrite;
        }
        return uiResourcePermissions.copy(jsonObject, jsonObject2, jsonObject3, jsonObject4);
    }

    public static final /* synthetic */ void write$Self$Claude_mcpapp(UiResourcePermissions self, vd4 output, SerialDescriptor serialDesc) {
        if (output.E(serialDesc) || self.camera != null) {
            output.B(serialDesc, 0, uh9.a, self.camera);
        }
        if (output.E(serialDesc) || self.microphone != null) {
            output.B(serialDesc, 1, uh9.a, self.microphone);
        }
        if (output.E(serialDesc) || self.geolocation != null) {
            output.B(serialDesc, 2, uh9.a, self.geolocation);
        }
        if (!output.E(serialDesc) && self.clipboardWrite == null) {
            return;
        }
        output.B(serialDesc, 3, uh9.a, self.clipboardWrite);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final JsonObject getCamera() {
        return this.camera;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final JsonObject getMicrophone() {
        return this.microphone;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final JsonObject getGeolocation() {
        return this.geolocation;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final JsonObject getClipboardWrite() {
        return this.clipboardWrite;
    }

    public final UiResourcePermissions copy(JsonObject camera, JsonObject microphone, JsonObject geolocation, JsonObject clipboardWrite) {
        return new UiResourcePermissions(camera, microphone, geolocation, clipboardWrite);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UiResourcePermissions)) {
            return false;
        }
        UiResourcePermissions uiResourcePermissions = (UiResourcePermissions) other;
        return x44.r(this.camera, uiResourcePermissions.camera) && x44.r(this.microphone, uiResourcePermissions.microphone) && x44.r(this.geolocation, uiResourcePermissions.geolocation) && x44.r(this.clipboardWrite, uiResourcePermissions.clipboardWrite);
    }

    public final JsonObject getCamera() {
        return this.camera;
    }

    public final JsonObject getClipboardWrite() {
        return this.clipboardWrite;
    }

    public final JsonObject getGeolocation() {
        return this.geolocation;
    }

    public final JsonObject getMicrophone() {
        return this.microphone;
    }

    public int hashCode() {
        JsonObject jsonObject = this.camera;
        int iHashCode = (jsonObject == null ? 0 : jsonObject.hashCode()) * 31;
        JsonObject jsonObject2 = this.microphone;
        int iHashCode2 = (iHashCode + (jsonObject2 == null ? 0 : jsonObject2.hashCode())) * 31;
        JsonObject jsonObject3 = this.geolocation;
        int iHashCode3 = (iHashCode2 + (jsonObject3 == null ? 0 : jsonObject3.hashCode())) * 31;
        JsonObject jsonObject4 = this.clipboardWrite;
        return iHashCode3 + (jsonObject4 != null ? jsonObject4.hashCode() : 0);
    }

    public String toString() {
        return "UiResourcePermissions(camera=" + this.camera + ", microphone=" + this.microphone + ", geolocation=" + this.geolocation + ", clipboardWrite=" + this.clipboardWrite + ")";
    }

    public UiResourcePermissions() {
        this((JsonObject) null, (JsonObject) null, (JsonObject) null, (JsonObject) null, 15, (mq5) null);
    }

    public UiResourcePermissions(JsonObject jsonObject, JsonObject jsonObject2, JsonObject jsonObject3, JsonObject jsonObject4) {
        this.camera = jsonObject;
        this.microphone = jsonObject2;
        this.geolocation = jsonObject3;
        this.clipboardWrite = jsonObject4;
    }

    public /* synthetic */ UiResourcePermissions(JsonObject jsonObject, JsonObject jsonObject2, JsonObject jsonObject3, JsonObject jsonObject4, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : jsonObject, (i & 2) != 0 ? null : jsonObject2, (i & 4) != 0 ? null : jsonObject3, (i & 8) != 0 ? null : jsonObject4);
    }
}
