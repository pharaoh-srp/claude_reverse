package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class hu9 {
    public final int a;
    public final int b;
    public final boolean c;

    public hu9(int i, int i2, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = z;
    }

    public final int a() {
        return this.b;
    }

    public final int b() {
        return this.a;
    }

    public final boolean c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hu9)) {
            return false;
        }
        hu9 hu9Var = (hu9) obj;
        return this.a == hu9Var.a && this.b == hu9Var.b && this.c == hu9Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + vb7.c(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BidiRun(start=");
        sb.append(this.a);
        sb.append(", end=");
        sb.append(this.b);
        sb.append(", isRtl=");
        return y6a.p(sb, this.c, ')');
    }
}
