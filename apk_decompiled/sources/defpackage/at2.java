package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class at2 {
    public final ft2 a;
    public final String b;

    public at2(ft2 ft2Var, String str) {
        str.getClass();
        this.a = ft2Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof at2)) {
            return false;
        }
        at2 at2Var = (at2) obj;
        return this.a.equals(at2Var.a) && x44.r(this.b, at2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ChatIdListEntry(source=" + this.a + ", chat_uuid=" + this.b + ")";
    }
}
