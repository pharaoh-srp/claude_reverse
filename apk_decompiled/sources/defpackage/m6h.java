package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class m6h {
    public final long a;
    public final long b;
    public final String c;
    public final boolean d;

    public m6h(long j, long j2, String str, boolean z) {
        str.getClass();
        this.a = j;
        this.b = j2;
        this.c = str;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m6h)) {
            return false;
        }
        m6h m6hVar = (m6h) obj;
        return d54.c(this.a, m6hVar.a) && d54.c(this.b, m6hVar.b) && x44.r(this.c, m6hVar.c) && this.d == m6hVar.d;
    }

    public final int hashCode() {
        int i = d54.i;
        return Boolean.hashCode(this.d) + kgh.l(vb7.e(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbR = kgh.r("TaskPillStyle(bg=", d54.i(this.a), ", fg=", d54.i(this.b), ", label=");
        sbR.append(this.c);
        sbR.append(", showDot=");
        sbR.append(this.d);
        sbR.append(")");
        return sbR.toString();
    }
}
