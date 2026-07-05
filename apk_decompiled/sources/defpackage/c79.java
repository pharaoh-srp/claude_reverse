package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class c79 {
    public static final c79 e = new c79(0, 0, 0, 0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public c79(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public static c79 a(c79 c79Var, int i, int i2, int i3, int i4, int i5) {
        if ((i5 & 1) != 0) {
            i = c79Var.a;
        }
        if ((i5 & 2) != 0) {
            i2 = c79Var.b;
        }
        if ((i5 & 4) != 0) {
            i3 = c79Var.c;
        }
        if ((i5 & 8) != 0) {
            i4 = c79Var.d;
        }
        c79Var.getClass();
        return new c79(i, i2, i3, i4);
    }

    public final long b() {
        return (((long) ((c() / 2) + this.b)) & 4294967295L) | (((long) ((f() / 2) + this.a)) << 32);
    }

    public final int c() {
        return this.d - this.b;
    }

    public final long d() {
        return (((long) f()) << 32) | (((long) c()) & 4294967295L);
    }

    public final long e() {
        return (((long) this.a) << 32) | (((long) this.b) & 4294967295L);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c79)) {
            return false;
        }
        c79 c79Var = (c79) obj;
        return this.a == c79Var.a && this.b == c79Var.b && this.c == c79Var.c && this.d == c79Var.d;
    }

    public final int f() {
        return this.c - this.a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + vb7.c(this.c, vb7.c(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntRect.fromLTRB(");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.b);
        sb.append(", ");
        sb.append(this.c);
        sb.append(", ");
        return vb7.r(sb, this.d, ')');
    }
}
