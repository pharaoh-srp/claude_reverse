package com.anthropic.claude.conway.protocol;

import defpackage.eh9;
import defpackage.gvj;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.srg;
import defpackage.st4;
import defpackage.tt4;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonElement;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002./B/\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ<\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b)\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b*\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010\u001d¨\u00060"}, d2 = {"Lcom/anthropic/claude/conway/protocol/ConwayErrorPayload;", "", "", "layer", "code", "message", "Lkotlinx/serialization/json/JsonElement;", "data", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$conway", "(Lcom/anthropic/claude/conway/protocol/ConwayErrorPayload;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lkotlinx/serialization/json/JsonElement;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)Lcom/anthropic/claude/conway/protocol/ConwayErrorPayload;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getLayer", "getCode", "getMessage", "Lkotlinx/serialization/json/JsonElement;", "getData", "Companion", "st4", "tt4", "conway"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ConwayErrorPayload {
    public static final int $stable = 8;
    public static final tt4 Companion = new tt4();
    private final String code;
    private final JsonElement data;
    private final String layer;
    private final String message;

    public /* synthetic */ ConwayErrorPayload(int i, String str, String str2, String str3, JsonElement jsonElement, vnf vnfVar) {
        if (6 != (i & 6)) {
            gvj.f(i, 6, st4.a.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.layer = null;
        } else {
            this.layer = str;
        }
        this.code = str2;
        this.message = str3;
        if ((i & 8) == 0) {
            this.data = null;
        } else {
            this.data = jsonElement;
        }
    }

    public static /* synthetic */ ConwayErrorPayload copy$default(ConwayErrorPayload conwayErrorPayload, String str, String str2, String str3, JsonElement jsonElement, int i, Object obj) {
        if ((i & 1) != 0) {
            str = conwayErrorPayload.layer;
        }
        if ((i & 2) != 0) {
            str2 = conwayErrorPayload.code;
        }
        if ((i & 4) != 0) {
            str3 = conwayErrorPayload.message;
        }
        if ((i & 8) != 0) {
            jsonElement = conwayErrorPayload.data;
        }
        return conwayErrorPayload.copy(str, str2, str3, jsonElement);
    }

    public static final /* synthetic */ void write$Self$conway(ConwayErrorPayload self, vd4 output, SerialDescriptor serialDesc) {
        if (output.E(serialDesc) || self.layer != null) {
            output.B(serialDesc, 0, srg.a, self.layer);
        }
        output.q(serialDesc, 1, self.code);
        output.q(serialDesc, 2, self.message);
        if (!output.E(serialDesc) && self.data == null) {
            return;
        }
        output.B(serialDesc, 3, eh9.a, self.data);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getLayer() {
        return this.layer;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final JsonElement getData() {
        return this.data;
    }

    public final ConwayErrorPayload copy(String layer, String code, String message, JsonElement data) {
        code.getClass();
        message.getClass();
        return new ConwayErrorPayload(layer, code, message, data);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConwayErrorPayload)) {
            return false;
        }
        ConwayErrorPayload conwayErrorPayload = (ConwayErrorPayload) other;
        return x44.r(this.layer, conwayErrorPayload.layer) && x44.r(this.code, conwayErrorPayload.code) && x44.r(this.message, conwayErrorPayload.message) && x44.r(this.data, conwayErrorPayload.data);
    }

    public final String getCode() {
        return this.code;
    }

    public final JsonElement getData() {
        return this.data;
    }

    public final String getLayer() {
        return this.layer;
    }

    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        String str = this.layer;
        int iL = kgh.l(kgh.l((str == null ? 0 : str.hashCode()) * 31, 31, this.code), 31, this.message);
        JsonElement jsonElement = this.data;
        return iL + (jsonElement != null ? jsonElement.hashCode() : 0);
    }

    public String toString() {
        String str = this.layer;
        String str2 = this.code;
        String str3 = this.message;
        JsonElement jsonElement = this.data;
        StringBuilder sbR = kgh.r("ConwayErrorPayload(layer=", str, ", code=", str2, ", message=");
        sbR.append(str3);
        sbR.append(", data=");
        sbR.append(jsonElement);
        sbR.append(")");
        return sbR.toString();
    }

    public ConwayErrorPayload(String str, String str2, String str3, JsonElement jsonElement) {
        str2.getClass();
        str3.getClass();
        this.layer = str;
        this.code = str2;
        this.message = str3;
        this.data = jsonElement;
    }

    public /* synthetic */ ConwayErrorPayload(String str, String str2, String str3, JsonElement jsonElement, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : str, str2, str3, (i & 8) != 0 ? null : jsonElement);
    }
}
