package defpackage;

import com.anthropic.claude.mcpapps.transport.JsonRpcInboundMessage;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* JADX INFO: loaded from: classes3.dex */
public final class ii9 extends JsonRpcInboundMessage {
    public final JsonPrimitive a;
    public final String b;
    public final JsonObject c;

    public ii9(String str, JsonObject jsonObject, JsonPrimitive jsonPrimitive) {
        super(null);
        this.a = jsonPrimitive;
        this.b = str;
        this.c = jsonObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ii9)) {
            return false;
        }
        ii9 ii9Var = (ii9) obj;
        return x44.r(this.a, ii9Var.a) && x44.r(this.b, ii9Var.b) && x44.r(this.c, ii9Var.c);
    }

    public final int hashCode() {
        int iL = kgh.l(this.a.hashCode() * 31, 31, this.b);
        JsonObject jsonObject = this.c;
        return iL + (jsonObject == null ? 0 : jsonObject.hashCode());
    }

    public final String toString() {
        return "Request(id=" + this.a + ", method=" + this.b + ", params=" + this.c + ")";
    }
}
