package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class p1e {
    public final boolean a;
    public final String b;
    public final String c;

    public p1e(String str, String str2, boolean z) {
        this.a = z;
        this.b = str;
        this.c = str2;
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.c;
    }

    public final boolean c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p1e)) {
            return false;
        }
        p1e p1eVar = (p1e) obj;
        return this.a == p1eVar.a && this.b.equals(p1eVar.b) && this.c.equals(p1eVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + kgh.l(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RateLimitResetFormat(isMultiDay=");
        sb.append(this.a);
        sb.append(", day=");
        sb.append(this.b);
        sb.append(", time=");
        return ij0.m(sb, this.c, ")");
    }
}
