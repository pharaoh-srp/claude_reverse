package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class z3g {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public z3g(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z3g)) {
            return false;
        }
        z3g z3gVar = (z3g) obj;
        return d54.c(this.a, z3gVar.a) && d54.c(this.b, z3gVar.b) && d54.c(this.c, z3gVar.c) && d54.c(this.d, z3gVar.d);
    }

    public final int hashCode() {
        int i = d54.i;
        return Long.hashCode(this.d) + vb7.e(vb7.e(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        String strI = d54.i(this.a);
        String strI2 = d54.i(this.b);
        return vb7.t(kgh.r("SheetColors(containerColor=", strI, ", contentColor=", strI2, ", grabberColor="), d54.i(this.c), ", titleBarButtonContainerColor=", d54.i(this.d), ")");
    }
}
