package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class esb {
    public final long a;
    public final long b;
    public final boolean c;

    public esb(long j, long j2, boolean z) {
        this.a = j;
        this.b = j2;
        this.c = z;
    }

    public final esb a(esb esbVar) {
        return new esb(fcc.i(this.a, esbVar.a), Math.max(this.b, esbVar.b), this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof esb)) {
            return false;
        }
        esb esbVar = (esb) obj;
        return fcc.c(this.a, esbVar.a) && this.b == esbVar.b && this.c == esbVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + vb7.e(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MouseWheelScrollDelta(value=");
        sb.append((Object) fcc.k(this.a));
        sb.append(", timeMillis=");
        sb.append(this.b);
        sb.append(", shouldApplyImmediately=");
        return y6a.p(sb, this.c, ')');
    }
}
