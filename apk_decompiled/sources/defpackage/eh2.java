package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class eh2 {
    public int a;
    public int b;
    public int c;
    public int d;

    public eh2(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final int a() {
        return this.d;
    }

    public final int b() {
        return this.c;
    }

    public final int c() {
        return this.b;
    }

    public final int d() {
        return this.a;
    }

    public final void e(int i) {
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eh2)) {
            return false;
        }
        eh2 eh2Var = (eh2) obj;
        return this.a == eh2Var.a && this.b == eh2Var.b && this.c == eh2Var.c && this.d == eh2Var.d;
    }

    public final void f(int i) {
        this.c = i;
    }

    public final void g(int i) {
        this.b = i;
    }

    public final void h(int i) {
        this.a = i;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + vb7.c(this.c, vb7.c(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Change(preStart=");
        sb.append(this.a);
        sb.append(", preEnd=");
        sb.append(this.b);
        sb.append(", originalStart=");
        sb.append(this.c);
        sb.append(", originalEnd=");
        return vb7.r(sb, this.d, ')');
    }
}
