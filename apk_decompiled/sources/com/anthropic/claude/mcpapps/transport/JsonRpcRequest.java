package com.anthropic.claude.mcpapps.transport;

import com.anthropic.claude.api.login.VerifyMagicLinkRequest;
import defpackage.gvj;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.oi9;
import defpackage.onf;
import defpackage.pi9;
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
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000223B1\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bBC\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0014\u0010\u001c\u001a\u00060\u0004j\u0002`\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001bJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J>\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\f\b\u0002\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u001bJ\u0010\u0010$\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u001bR\u001b\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b-\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b.\u0010\u001bR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010/\u001a\u0004\b0\u0010 ¨\u00064"}, d2 = {"Lcom/anthropic/claude/mcpapps/transport/JsonRpcRequest;", "", "", "jsonrpc", "Lkotlinx/serialization/json/JsonPrimitive;", "Lcom/anthropic/claude/mcpapps/transport/RequestId;", "id", VerifyMagicLinkRequest.Credentials.DISCRIMINATOR, "Lkotlinx/serialization/json/JsonObject;", "params", "<init>", "(Ljava/lang/String;Lkotlinx/serialization/json/JsonPrimitive;Ljava/lang/String;Lkotlinx/serialization/json/JsonObject;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Lkotlinx/serialization/json/JsonPrimitive;Ljava/lang/String;Lkotlinx/serialization/json/JsonObject;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$Claude_mcpapp", "(Lcom/anthropic/claude/mcpapps/transport/JsonRpcRequest;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lkotlinx/serialization/json/JsonPrimitive;", "component3", "component4", "()Lkotlinx/serialization/json/JsonObject;", "copy", "(Ljava/lang/String;Lkotlinx/serialization/json/JsonPrimitive;Ljava/lang/String;Lkotlinx/serialization/json/JsonObject;)Lcom/anthropic/claude/mcpapps/transport/JsonRpcRequest;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getJsonrpc", "Lkotlinx/serialization/json/JsonPrimitive;", "getId", "getMethod", "Lkotlinx/serialization/json/JsonObject;", "getParams", "Companion", "oi9", "pi9", "Claude:mcpapp"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class JsonRpcRequest {
    public static final int $stable = 8;
    public static final pi9 Companion = new pi9();
    private final JsonPrimitive id;
    private final String jsonrpc;
    private final String method;
    private final JsonObject params;

    public /* synthetic */ JsonRpcRequest(int i, String str, JsonPrimitive jsonPrimitive, String str2, JsonObject jsonObject, vnf vnfVar) {
        if (6 != (i & 6)) {
            gvj.f(i, 6, oi9.a.getDescriptor());
            throw null;
        }
        this.jsonrpc = (i & 1) == 0 ? "2.0" : str;
        this.id = jsonPrimitive;
        this.method = str2;
        if ((i & 8) == 0) {
            this.params = null;
        } else {
            this.params = jsonObject;
        }
    }

    public static /* synthetic */ JsonRpcRequest copy$default(JsonRpcRequest jsonRpcRequest, String str, JsonPrimitive jsonPrimitive, String str2, JsonObject jsonObject, int i, Object obj) {
        if ((i & 1) != 0) {
            str = jsonRpcRequest.jsonrpc;
        }
        if ((i & 2) != 0) {
            jsonPrimitive = jsonRpcRequest.id;
        }
        if ((i & 4) != 0) {
            str2 = jsonRpcRequest.method;
        }
        if ((i & 8) != 0) {
            jsonObject = jsonRpcRequest.params;
        }
        return jsonRpcRequest.copy(str, jsonPrimitive, str2, jsonObject);
    }

    public static final /* synthetic */ void write$Self$Claude_mcpapp(JsonRpcRequest self, vd4 output, SerialDescriptor serialDesc) {
        if (output.E(serialDesc) || !x44.r(self.jsonrpc, "2.0")) {
            output.q(serialDesc, 0, self.jsonrpc);
        }
        output.r(serialDesc, 1, yh9.a, self.id);
        output.q(serialDesc, 2, self.method);
        if (!output.E(serialDesc) && self.params == null) {
            return;
        }
        output.B(serialDesc, 3, uh9.a, self.params);
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
    public final String getMethod() {
        return this.method;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final JsonObject getParams() {
        return this.params;
    }

    public final JsonRpcRequest copy(String jsonrpc, JsonPrimitive id, String method, JsonObject params) {
        jsonrpc.getClass();
        id.getClass();
        method.getClass();
        return new JsonRpcRequest(jsonrpc, id, method, params);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof JsonRpcRequest)) {
            return false;
        }
        JsonRpcRequest jsonRpcRequest = (JsonRpcRequest) other;
        return x44.r(this.jsonrpc, jsonRpcRequest.jsonrpc) && x44.r(this.id, jsonRpcRequest.id) && x44.r(this.method, jsonRpcRequest.method) && x44.r(this.params, jsonRpcRequest.params);
    }

    public final JsonPrimitive getId() {
        return this.id;
    }

    public final String getJsonrpc() {
        return this.jsonrpc;
    }

    public final String getMethod() {
        return this.method;
    }

    public final JsonObject getParams() {
        return this.params;
    }

    public int hashCode() {
        int iL = kgh.l((this.id.hashCode() + (this.jsonrpc.hashCode() * 31)) * 31, 31, this.method);
        JsonObject jsonObject = this.params;
        return iL + (jsonObject == null ? 0 : jsonObject.hashCode());
    }

    public String toString() {
        return "JsonRpcRequest(jsonrpc=" + this.jsonrpc + ", id=" + this.id + ", method=" + this.method + ", params=" + this.params + ")";
    }

    public JsonRpcRequest(String str, JsonPrimitive jsonPrimitive, String str2, JsonObject jsonObject) {
        str.getClass();
        jsonPrimitive.getClass();
        str2.getClass();
        this.jsonrpc = str;
        this.id = jsonPrimitive;
        this.method = str2;
        this.params = jsonObject;
    }

    public /* synthetic */ JsonRpcRequest(String str, JsonPrimitive jsonPrimitive, String str2, JsonObject jsonObject, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? "2.0" : str, jsonPrimitive, str2, (i & 8) != 0 ? null : jsonObject);
    }
}
