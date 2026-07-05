package defpackage;

import com.anthropic.claude.settings.internal.growthbook.GateKind;
import kotlinx.serialization.json.JsonDecodingException;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* JADX INFO: loaded from: classes3.dex */
public final class n18 {
    public final String a;
    public final JsonElement b;
    public final boolean c;
    public final GateKind d;
    public final String e;

    public n18(String str, JsonElement jsonElement, boolean z, GateKind gateKind, String str2) {
        str.getClass();
        this.a = str;
        this.b = jsonElement;
        this.c = z;
        this.d = gateKind;
        this.e = str2;
    }

    public final GateKind a() {
        GateKind gateKind;
        Long lValueOf;
        GateKind gateKind2;
        JsonElement jsonElement = this.b;
        if (jsonElement == null || (jsonElement instanceof JsonNull)) {
            gateKind = GateKind.UNKNOWN;
        } else if (jsonElement instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElement;
            if (jsonPrimitive.isString()) {
                gateKind = GateKind.STRING;
            } else if (ch9.e(jsonPrimitive) != null) {
                gateKind = GateKind.BOOLEAN;
            } else {
                try {
                    lValueOf = Long.valueOf(ch9.k(jsonPrimitive));
                } catch (JsonDecodingException unused) {
                    lValueOf = null;
                }
                gateKind = (lValueOf == null && hsg.a0(jsonPrimitive.getContent()) == null) ? GateKind.UNKNOWN : GateKind.NUMBER;
            }
        } else {
            gateKind = ((jsonElement instanceof JsonObject) && ((JsonObject) jsonElement).isEmpty()) ? GateKind.UNKNOWN : GateKind.JSON;
        }
        return (gateKind != GateKind.UNKNOWN || (gateKind2 = this.d) == null) ? gateKind : gateKind2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n18)) {
            return false;
        }
        n18 n18Var = (n18) obj;
        return x44.r(this.a, n18Var.a) && x44.r(this.b, n18Var.b) && this.c == n18Var.c && this.d == n18Var.d && x44.r(this.e, n18Var.e);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        JsonElement jsonElement = this.b;
        int iP = fsh.p((iHashCode + (jsonElement == null ? 0 : jsonElement.hashCode())) * 31, 31, this.c);
        GateKind gateKind = this.d;
        int iHashCode2 = (iP + (gateKind == null ? 0 : gateKind.hashCode())) * 31;
        String str = this.e;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GateState(gate=");
        sb.append(this.a);
        sb.append(", rawValue=");
        sb.append(this.b);
        sb.append(", isOverridden=");
        sb.append(this.c);
        sb.append(", declaredKind=");
        sb.append(this.d);
        sb.append(", category=");
        return ij0.m(sb, this.e, ")");
    }
}
