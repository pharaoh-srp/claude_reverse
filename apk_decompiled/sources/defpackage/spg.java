package defpackage;

import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes2.dex */
public final class spg extends wpg {
    public final String a;
    public final JsonObject b;
    public final long c;

    public spg(String str, JsonObject jsonObject, long j) {
        str.getClass();
        jsonObject.getClass();
        this.a = str;
        this.b = jsonObject;
        this.c = j;
    }

    @Override // defpackage.wpg
    public final long a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof spg)) {
            return false;
        }
        spg spgVar = (spg) obj;
        return x44.r(this.a, spgVar.a) && x44.r(this.b, spgVar.b) && this.c == spgVar.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ToolCallEntry(name=");
        sb.append(this.a);
        sb.append(", input=");
        sb.append(this.b);
        sb.append(", timestamp=");
        return grc.r(this.c, ")", sb);
    }
}
