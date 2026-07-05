package defpackage;

import com.anthropic.claude.mcpapps.transport.JsonRpcInboundMessage;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes3.dex */
public final class hi9 extends JsonRpcInboundMessage {
    public final String a;
    public final JsonObject b;

    public hi9(String str, JsonObject jsonObject) {
        super(null);
        this.a = str;
        this.b = jsonObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hi9)) {
            return false;
        }
        hi9 hi9Var = (hi9) obj;
        return x44.r(this.a, hi9Var.a) && x44.r(this.b, hi9Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        JsonObject jsonObject = this.b;
        return iHashCode + (jsonObject == null ? 0 : jsonObject.hashCode());
    }

    public final String toString() {
        return "Notification(method=" + this.a + ", params=" + this.b + ")";
    }
}
