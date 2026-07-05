package defpackage;

import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes2.dex */
public final class a15 {
    public final JsonObject a;
    public final pz7 b;

    public a15(JsonObject jsonObject, pz7 pz7Var) {
        this.a = jsonObject;
        this.b = pz7Var;
    }

    public final JsonObject a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a15)) {
            return false;
        }
        a15 a15Var = (a15) obj;
        return this.a.equals(a15Var.a) && this.b.equals(a15Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ConwayToolHandler(definition=" + this.a + ", run=" + this.b + ")";
    }
}
