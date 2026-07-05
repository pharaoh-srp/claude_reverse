package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class c36 {
    public final boolean a;
    public final boolean b;
    public final sef c;
    public final boolean d;
    public final boolean e;
    public final String f;
    public final int g;

    public c36(int i, boolean z, boolean z2, boolean z3) {
        z = (i & 2) != 0 ? true : z;
        z2 = (i & 8) != 0 ? true : z2;
        this.a = true;
        this.b = z;
        this.c = sef.E;
        this.d = z2;
        this.e = z3;
        this.f = "";
        this.g = 2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c36)) {
            return false;
        }
        c36 c36Var = (c36) obj;
        return this.a == c36Var.a && this.b == c36Var.b && this.c == c36Var.c && this.d == c36Var.d && this.e == c36Var.e && this.g == c36Var.g;
    }

    public final int hashCode() {
        return (fsh.p(fsh.p((this.c.hashCode() + fsh.p(Boolean.hashCode(this.a) * 31, 31, this.b)) * 31, 31, this.d), 31, this.e) + this.g) * 31;
    }

    public c36(int i) {
        this(224, true, (i & 4) != 0, true);
    }
}
