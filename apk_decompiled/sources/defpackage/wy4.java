package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class wy4 {
    public final long a;
    public final boolean b;
    public final String c;

    public wy4(String str, boolean z, long j) {
        str.getClass();
        this.a = j;
        this.b = z;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wy4)) {
            return false;
        }
        wy4 wy4Var = (wy4) obj;
        return d54.c(this.a, wy4Var.a) && this.b == wy4Var.b && x44.r(this.c, wy4Var.c);
    }

    public final int hashCode() {
        int i = d54.i;
        return this.c.hashCode() + fsh.p(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        String strI = d54.i(this.a);
        StringBuilder sb = new StringBuilder("Status(color=");
        sb.append(strI);
        sb.append(", pulse=");
        sb.append(this.b);
        sb.append(", label=");
        return ij0.m(sb, this.c, ")");
    }
}
