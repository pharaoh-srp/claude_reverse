package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class b62 {
    public final String a;
    public final String b;
    public final String c;

    public b62(String str, String str2, String str3) {
        grc.B(str, str2, str3);
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.c;
    }

    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b62)) {
            return false;
        }
        b62 b62Var = (b62) obj;
        return x44.r(this.a, b62Var.a) && x44.r(this.b, b62Var.b) && x44.r(this.c, b62Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + kgh.l(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return ij0.m(kgh.r("CachedMessage(uuid=", this.a, ", conversation_uuid=", this.b, ", message_json="), this.c, ")");
    }
}
