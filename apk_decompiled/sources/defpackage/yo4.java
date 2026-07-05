package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class yo4 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;

    public yo4(long j, long j2, long j3, long j4, long j5) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof yo4)) {
            return false;
        }
        yo4 yo4Var = (yo4) obj;
        return d54.c(this.a, yo4Var.a) && d54.c(this.b, yo4Var.b) && d54.c(this.c, yo4Var.c) && d54.c(this.d, yo4Var.d) && d54.c(this.e, yo4Var.e);
    }

    public final int hashCode() {
        int i = d54.i;
        return Long.hashCode(this.e) + vb7.e(vb7.e(vb7.e(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContextMenuColors(backgroundColor=");
        y6a.q(this.a, ", textColor=", sb);
        y6a.q(this.b, ", iconColor=", sb);
        y6a.q(this.c, ", disabledTextColor=", sb);
        y6a.q(this.d, ", disabledIconColor=", sb);
        sb.append((Object) d54.i(this.e));
        sb.append(')');
        return sb.toString();
    }
}
