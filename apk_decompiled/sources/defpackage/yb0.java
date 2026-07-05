package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class yb0 {
    public final Object a;
    public final int b;
    public final int c;
    public final String d;

    public yb0(int i, int i2, Object obj, String str) {
        this.a = obj;
        this.b = i;
        this.c = i2;
        this.d = str;
        if (i <= i2) {
            return;
        }
        c39.a("Reversed range is not supported");
    }

    public static yb0 a(yb0 yb0Var, vb0 vb0Var, int i, int i2, int i3) {
        Object obj = vb0Var;
        if ((i3 & 1) != 0) {
            obj = yb0Var.a;
        }
        if ((i3 & 2) != 0) {
            i = yb0Var.b;
        }
        if ((i3 & 4) != 0) {
            i2 = yb0Var.c;
        }
        String str = yb0Var.d;
        yb0Var.getClass();
        return new yb0(i, i2, obj, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yb0)) {
            return false;
        }
        yb0 yb0Var = (yb0) obj;
        return x44.r(this.a, yb0Var.a) && this.b == yb0Var.b && this.c == yb0Var.c && x44.r(this.d, yb0Var.d);
    }

    public final int hashCode() {
        Object obj = this.a;
        return this.d.hashCode() + vb7.c(this.c, vb7.c(this.b, (obj == null ? 0 : obj.hashCode()) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Range(item=");
        sb.append(this.a);
        sb.append(", start=");
        sb.append(this.b);
        sb.append(", end=");
        sb.append(this.c);
        sb.append(", tag=");
        return vb7.s(sb, this.d, ')');
    }

    public yb0(Object obj, int i, int i2) {
        this(i, i2, obj, "");
    }
}
