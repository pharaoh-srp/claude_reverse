package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class e02 {
    public final b02 a;
    public final int b;
    public final int c;

    public e02(b02 b02Var, int i, int i2) {
        this.a = b02Var;
        this.b = i;
        this.c = i2;
    }

    public final b02 a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final int c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e02)) {
            return false;
        }
        e02 e02Var = (e02) obj;
        return x44.r(this.a, e02Var.a) && this.b == e02Var.b && this.c == e02Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + vb7.c(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BulletSpanWithLevel(bullet=");
        sb.append(this.a);
        sb.append(", indentationLevel=");
        sb.append(this.b);
        sb.append(", start=");
        return vb7.r(sb, this.c, ')');
    }
}
