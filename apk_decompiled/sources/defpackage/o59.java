package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class o59 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public o59(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o59)) {
            return false;
        }
        o59 o59Var = (o59) obj;
        return this.a == o59Var.a && this.b == o59Var.b && this.c == o59Var.c && this.d == o59Var.d;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InsetsValues(left=");
        sb.append(this.a);
        sb.append(", top=");
        sb.append(this.b);
        sb.append(", right=");
        sb.append(this.c);
        sb.append(", bottom=");
        return vb7.r(sb, this.d, ')');
    }
}
