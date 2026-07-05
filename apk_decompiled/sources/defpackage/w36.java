package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class w36 implements x36 {
    public final v48 a;
    public final int b;
    public final int c;

    public w36(v48 v48Var, int i, int i2) {
        this.a = v48Var;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w36)) {
            return false;
        }
        w36 w36Var = (w36) obj;
        return this.a.equals(w36Var.a) && this.b == w36Var.b && this.c == w36Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + vb7.c(this.b, this.a.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Success(diff=");
        sb.append(this.a);
        sb.append(", added=");
        sb.append(this.b);
        sb.append(", removed=");
        return vb7.l(this.c, ")", sb);
    }
}
