package com.anthropic.claude.mcpapps.transport;

import defpackage.ei9;
import defpackage.gvj;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.qi9;
import defpackage.ri9;
import defpackage.uh9;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import defpackage.yh9;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 42\u00020\u0001:\u000256B5\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fBC\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0014\u0010\u001d\u001a\u00060\u0004j\u0002`\u0005HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b!\u0010\"J@\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\f\b\u0002\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u001cJ\u0010\u0010&\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u001cR\u001b\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010.\u001a\u0004\b/\u0010\u001eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u00100\u001a\u0004\b1\u0010 R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00102\u001a\u0004\b3\u0010\"¨\u00067"}, d2 = {"Lcom/anthropic/claude/mcpapps/transport/JsonRpcResponse;", "", "", "jsonrpc", "Lkotlinx/serialization/json/JsonPrimitive;", "Lcom/anthropic/claude/mcpapps/transport/RequestId;", "id", "Lkotlinx/serialization/json/JsonObject;", "result", "Lcom/anthropic/claude/mcpapps/transport/JsonRpcError;", "error", "<init>", "(Ljava/lang/String;Lkotlinx/serialization/json/JsonPrimitive;Lkotlinx/serialization/json/JsonObject;Lcom/anthropic/claude/mcpapps/transport/JsonRpcError;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Lkotlinx/serialization/json/JsonPrimitive;Lkotlinx/serialization/json/JsonObject;Lcom/anthropic/claude/mcpapps/transport/JsonRpcError;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$Claude_mcpapp", "(Lcom/anthropic/claude/mcpapps/transport/JsonRpcResponse;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lkotlinx/serialization/json/JsonPrimitive;", "component3", "()Lkotlinx/serialization/json/JsonObject;", "component4", "()Lcom/anthropic/claude/mcpapps/transport/JsonRpcError;", "copy", "(Ljava/lang/String;Lkotlinx/serialization/json/JsonPrimitive;Lkotlinx/serialization/json/JsonObject;Lcom/anthropic/claude/mcpapps/transport/JsonRpcError;)Lcom/anthropic/claude/mcpapps/transport/JsonRpcResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getJsonrpc", "Lkotlinx/serialization/json/JsonPrimitive;", "getId", "Lkotlinx/serialization/json/JsonObject;", "getResult", "Lcom/anthropic/claude/mcpapps/transport/JsonRpcError;", "getError", "Companion", "ri9", "qi9", "Claude:mcpapp"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class JsonRpcResponse {
    public static final int $stable = 8;
    public static final ri9 Companion = new ri9();
    private final JsonRpcError error;
    private final JsonPrimitive id;
    private final String jsonrpc;
    private final JsonObject result;

    public /* synthetic */ JsonRpcResponse(int i, String str, JsonPrimitive jsonPrimitive, JsonObject jsonObject, JsonRpcError jsonRpcError, vnf vnfVar) {
        if (2 != (i & 2)) {
            gvj.f(i, 2, qi9.a.getDescriptor());
            throw null;
        }
        this.jsonrpc = (i & 1) == 0 ? "2.0" : str;
        this.id = jsonPrimitive;
        if ((i & 4) == 0) {
            this.result = null;
        } else {
            this.result = jsonObject;
        }
        if ((i & 8) == 0) {
            this.error = null;
        } else {
            this.error = jsonRpcError;
        }
    }

    public static /* synthetic */ JsonRpcResponse copy$default(JsonRpcResponse jsonRpcResponse, String str, JsonPrimitive jsonPrimitive, JsonObject jsonObject, JsonRpcError jsonRpcError, int i, Object obj) {
        if ((i & 1) != 0) {
            str = jsonRpcResponse.jsonrpc;
        }
        if ((i & 2) != 0) {
            jsonPrimitive = jsonRpcResponse.id;
        }
        if ((i & 4) != 0) {
            jsonObject = jsonRpcResponse.result;
        }
        if ((i & 8) != 0) {
            jsonRpcError = jsonRpcResponse.error;
        }
        return jsonRpcResponse.copy(str, jsonPrimitive, jsonObject, jsonRpcError);
    }

    public static final /* synthetic */ void write$Self$Claude_mcpapp(JsonRpcResponse self, vd4 output, SerialDescriptor serialDesc) {
        if (output.E(serialDesc) || !x44.r(self.jsonrpc, "2.0")) {
            output.q(serialDesc, 0, self.jsonrpc);
        }
        output.r(serialDesc, 1, yh9.a, self.id);
        if (output.E(serialDesc) || self.result != null) {
            output.B(serialDesc, 2, uh9.a, self.result);
        }
        if (!output.E(serialDesc) && self.error == null) {
            return;
        }
        output.B(serialDesc, 3, ei9.a, self.error);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getJsonrpc() {
        return this.jsonrpc;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final JsonPrimitive getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final JsonObject getResult() {
        return this.result;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final JsonRpcError getError() {
        return this.error;
    }

    public final JsonRpcResponse copy(String jsonrpc, JsonPrimitive id, JsonObject result, JsonRpcError error) {
        jsonrpc.getClass();
        id.getClass();
        return new JsonRpcResponse(jsonrpc, id, result, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof JsonRpcResponse)) {
            return false;
        }
        JsonRpcResponse jsonRpcResponse = (JsonRpcResponse) other;
        return x44.r(this.jsonrpc, jsonRpcResponse.jsonrpc) && x44.r(this.id, jsonRpcResponse.id) && x44.r(this.result, jsonRpcResponse.result) && x44.r(this.error, jsonRpcResponse.error);
    }

    public final JsonRpcError getError() {
        return this.error;
    }

    public final JsonPrimitive getId() {
        return this.id;
    }

    public final String getJsonrpc() {
        return this.jsonrpc;
    }

    public final JsonObject getResult() {
        return this.result;
    }

    public int hashCode() {
        int iHashCode = (this.id.hashCode() + (this.jsonrpc.hashCode() * 31)) * 31;
        JsonObject jsonObject = this.result;
        int iHashCode2 = (iHashCode + (jsonObject == null ? 0 : jsonObject.hashCode())) * 31;
        JsonRpcError jsonRpcError = this.error;
        return iHashCode2 + (jsonRpcError != null ? jsonRpcError.hashCode() : 0);
    }

    public String toString() {
        return "JsonRpcResponse(jsonrpc=" + this.jsonrpc + ", id=" + this.id + ", result=" + this.result + ", error=" + this.error + ")";
    }

    public JsonRpcResponse(String str, JsonPrimitive jsonPrimitive, JsonObject jsonObject, JsonRpcError jsonRpcError) {
        str.getClass();
        jsonPrimitive.getClass();
        this.jsonrpc = str;
        this.id = jsonPrimitive;
        this.result = jsonObject;
        this.error = jsonRpcError;
    }

    public /* synthetic */ JsonRpcResponse(String str, JsonPrimitive jsonPrimitive, JsonObject jsonObject, JsonRpcError jsonRpcError, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? "2.0" : str, jsonPrimitive, (i & 4) != 0 ? null : jsonObject, (i & 8) != 0 ? null : jsonRpcError);
    }
}
