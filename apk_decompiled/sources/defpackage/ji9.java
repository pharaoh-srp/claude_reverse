package defpackage;

import com.anthropic.claude.mcpapps.transport.JsonRpcError;
import com.anthropic.claude.mcpapps.transport.JsonRpcInboundMessage;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* JADX INFO: loaded from: classes3.dex */
public final class ji9 extends JsonRpcInboundMessage {
    public final JsonPrimitive a;
    public final JsonObject b;
    public final JsonRpcError c;

    public ji9(JsonPrimitive jsonPrimitive, JsonObject jsonObject, JsonRpcError jsonRpcError) {
        super(null);
        this.a = jsonPrimitive;
        this.b = jsonObject;
        this.c = jsonRpcError;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ji9)) {
            return false;
        }
        ji9 ji9Var = (ji9) obj;
        return x44.r(this.a, ji9Var.a) && x44.r(this.b, ji9Var.b) && x44.r(this.c, ji9Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        JsonObject jsonObject = this.b;
        int iHashCode2 = (iHashCode + (jsonObject == null ? 0 : jsonObject.hashCode())) * 31;
        JsonRpcError jsonRpcError = this.c;
        return iHashCode2 + (jsonRpcError != null ? jsonRpcError.hashCode() : 0);
    }

    public final String toString() {
        return "Response(id=" + this.a + ", result=" + this.b + ", error=" + this.c + ")";
    }
}
