package com.anthropic.claude.mcpapps.transport;

import defpackage.ei9;
import defpackage.fi9;
import defpackage.gvj;
import defpackage.kgh;
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
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,-B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB7\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ0\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u001aJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0018J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b*\u0010\u001c¨\u0006."}, d2 = {"Lcom/anthropic/claude/mcpapps/transport/JsonRpcError;", "", "", "code", "", "message", "Lkotlinx/serialization/json/JsonObject;", "data", "<init>", "(ILjava/lang/String;Lkotlinx/serialization/json/JsonObject;)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(IILjava/lang/String;Lkotlinx/serialization/json/JsonObject;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$Claude_mcpapp", "(Lcom/anthropic/claude/mcpapps/transport/JsonRpcError;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "()Lkotlinx/serialization/json/JsonObject;", "copy", "(ILjava/lang/String;Lkotlinx/serialization/json/JsonObject;)Lcom/anthropic/claude/mcpapps/transport/JsonRpcError;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getCode", "Ljava/lang/String;", "getMessage", "Lkotlinx/serialization/json/JsonObject;", "getData", "Companion", "ei9", "fi9", "Claude:mcpapp"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class JsonRpcError {
    public static final int $stable = 8;
    public static final fi9 Companion = new fi9();
    private final int code;
    private final JsonObject data;
    private final String message;

    public /* synthetic */ JsonRpcError(int i, int i2, String str, JsonObject jsonObject, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, ei9.a.getDescriptor());
            throw null;
        }
        this.code = i2;
        this.message = str;
        if ((i & 4) == 0) {
            this.data = null;
        } else {
            this.data = jsonObject;
        }
    }

    public static /* synthetic */ JsonRpcError copy$default(JsonRpcError jsonRpcError, int i, String str, JsonObject jsonObject, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = jsonRpcError.code;
        }
        if ((i2 & 2) != 0) {
            str = jsonRpcError.message;
        }
        if ((i2 & 4) != 0) {
            jsonObject = jsonRpcError.data;
        }
        return jsonRpcError.copy(i, str, jsonObject);
    }

    public static final /* synthetic */ void write$Self$Claude_mcpapp(JsonRpcError self, vd4 output, SerialDescriptor serialDesc) {
        output.l(0, self.code, serialDesc);
        output.q(serialDesc, 1, self.message);
        if (!output.E(serialDesc) && self.data == null) {
            return;
        }
        output.B(serialDesc, 2, uh9.a, self.data);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final JsonObject getData() {
        return this.data;
    }

    public final JsonRpcError copy(int code, String message, JsonObject data) {
        message.getClass();
        return new JsonRpcError(code, message, data);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof JsonRpcError)) {
            return false;
        }
        JsonRpcError jsonRpcError = (JsonRpcError) other;
        return this.code == jsonRpcError.code && x44.r(this.message, jsonRpcError.message) && x44.r(this.data, jsonRpcError.data);
    }

    public final int getCode() {
        return this.code;
    }

    public final JsonObject getData() {
        return this.data;
    }

    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        int iL = kgh.l(Integer.hashCode(this.code) * 31, 31, this.message);
        JsonObject jsonObject = this.data;
        return iL + (jsonObject == null ? 0 : jsonObject.hashCode());
    }

    public String toString() {
        return "JsonRpcError(code=" + this.code + ", message=" + this.message + ", data=" + this.data + ")";
    }

    public JsonRpcError(int i, String str, JsonObject jsonObject) {
        str.getClass();
        this.code = i;
        this.message = str;
        this.data = jsonObject;
    }

    public /* synthetic */ JsonRpcError(int i, String str, JsonObject jsonObject, int i2, mq5 mq5Var) {
        this(i, str, (i2 & 4) != 0 ? null : jsonObject);
    }
}
