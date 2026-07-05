package com.anthropic.claude.mcpapps.transport;

import com.anthropic.claude.api.login.VerifyMagicLinkRequest;
import defpackage.gvj;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.mi9;
import defpackage.mq5;
import defpackage.ni9;
import defpackage.onf;
import defpackage.uh9;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+,B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ0\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b'\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010\u001b¨\u0006-"}, d2 = {"Lcom/anthropic/claude/mcpapps/transport/JsonRpcNotification;", "", "", "jsonrpc", VerifyMagicLinkRequest.Credentials.DISCRIMINATOR, "Lkotlinx/serialization/json/JsonObject;", "params", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/json/JsonObject;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/json/JsonObject;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$Claude_mcpapp", "(Lcom/anthropic/claude/mcpapps/transport/JsonRpcNotification;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lkotlinx/serialization/json/JsonObject;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/json/JsonObject;)Lcom/anthropic/claude/mcpapps/transport/JsonRpcNotification;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getJsonrpc", "getMethod", "Lkotlinx/serialization/json/JsonObject;", "getParams", "Companion", "mi9", "ni9", "Claude:mcpapp"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class JsonRpcNotification {
    public static final int $stable = 8;
    public static final ni9 Companion = new ni9();
    private final String jsonrpc;
    private final String method;
    private final JsonObject params;

    public /* synthetic */ JsonRpcNotification(int i, String str, String str2, JsonObject jsonObject, vnf vnfVar) {
        if (2 != (i & 2)) {
            gvj.f(i, 2, mi9.a.getDescriptor());
            throw null;
        }
        this.jsonrpc = (i & 1) == 0 ? "2.0" : str;
        this.method = str2;
        if ((i & 4) == 0) {
            this.params = null;
        } else {
            this.params = jsonObject;
        }
    }

    public static /* synthetic */ JsonRpcNotification copy$default(JsonRpcNotification jsonRpcNotification, String str, String str2, JsonObject jsonObject, int i, Object obj) {
        if ((i & 1) != 0) {
            str = jsonRpcNotification.jsonrpc;
        }
        if ((i & 2) != 0) {
            str2 = jsonRpcNotification.method;
        }
        if ((i & 4) != 0) {
            jsonObject = jsonRpcNotification.params;
        }
        return jsonRpcNotification.copy(str, str2, jsonObject);
    }

    public static final /* synthetic */ void write$Self$Claude_mcpapp(JsonRpcNotification self, vd4 output, SerialDescriptor serialDesc) {
        if (output.E(serialDesc) || !x44.r(self.jsonrpc, "2.0")) {
            output.q(serialDesc, 0, self.jsonrpc);
        }
        output.q(serialDesc, 1, self.method);
        if (!output.E(serialDesc) && self.params == null) {
            return;
        }
        output.B(serialDesc, 2, uh9.a, self.params);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getJsonrpc() {
        return this.jsonrpc;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMethod() {
        return this.method;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final JsonObject getParams() {
        return this.params;
    }

    public final JsonRpcNotification copy(String jsonrpc, String method, JsonObject params) {
        jsonrpc.getClass();
        method.getClass();
        return new JsonRpcNotification(jsonrpc, method, params);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof JsonRpcNotification)) {
            return false;
        }
        JsonRpcNotification jsonRpcNotification = (JsonRpcNotification) other;
        return x44.r(this.jsonrpc, jsonRpcNotification.jsonrpc) && x44.r(this.method, jsonRpcNotification.method) && x44.r(this.params, jsonRpcNotification.params);
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
        int iL = kgh.l(this.jsonrpc.hashCode() * 31, 31, this.method);
        JsonObject jsonObject = this.params;
        return iL + (jsonObject == null ? 0 : jsonObject.hashCode());
    }

    public String toString() {
        String str = this.jsonrpc;
        String str2 = this.method;
        JsonObject jsonObject = this.params;
        StringBuilder sbR = kgh.r("JsonRpcNotification(jsonrpc=", str, ", method=", str2, ", params=");
        sbR.append(jsonObject);
        sbR.append(")");
        return sbR.toString();
    }

    public JsonRpcNotification(String str, String str2, JsonObject jsonObject) {
        str.getClass();
        str2.getClass();
        this.jsonrpc = str;
        this.method = str2;
        this.params = jsonObject;
    }

    public /* synthetic */ JsonRpcNotification(String str, String str2, JsonObject jsonObject, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? "2.0" : str, str2, (i & 4) != 0 ? null : jsonObject);
    }
}
