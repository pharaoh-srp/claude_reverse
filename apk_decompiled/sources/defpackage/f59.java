package defpackage;

import android.graphics.Insets;

/* JADX INFO: loaded from: classes.dex */
public final class f59 {
    public static final f59 e = new f59(0, 0, 0, 0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public f59(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public static f59 a(f59 f59Var, f59 f59Var2) {
        return c(Math.max(f59Var.a, f59Var2.a), Math.max(f59Var.b, f59Var2.b), Math.max(f59Var.c, f59Var2.c), Math.max(f59Var.d, f59Var2.d));
    }

    public static f59 b(f59 f59Var, f59 f59Var2) {
        return c(Math.min(f59Var.a, f59Var2.a), Math.min(f59Var.b, f59Var2.b), Math.min(f59Var.c, f59Var2.c), Math.min(f59Var.d, f59Var2.d));
    }

    public static f59 c(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? e : new f59(i, i2, i3, i4);
    }

    public static f59 d(Insets insets) {
        return c(insets.left, insets.top, insets.right, insets.bottom);
    }

    public final Insets e() {
        return d59.h(this.a, this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f59.class != obj.getClass()) {
            return false;
        }
        f59 f59Var = (f59) obj;
        return this.d == f59Var.d && this.a == f59Var.a && this.c == f59Var.c && this.b == f59Var.b;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Insets{left=");
        sb.append(this.a);
        sb.append(", top=");
        sb.append(this.b);
        sb.append(", right=");
        sb.append(this.c);
        sb.append(", bottom=");
        return vb7.r(sb, this.d, '}');
    }
}
