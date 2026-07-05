package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class di5 {
    public final int a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;

    public di5(int i, int i2) {
        sq6.a(i);
        this.a = i;
        this.b = i2;
        long jB = kgh.b(i);
        this.c = jB;
        this.d = 10 * jB;
        this.e = 5 * jB;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof di5)) {
            return false;
        }
        di5 di5Var = (di5) obj;
        return this.a == di5Var.a && this.b == di5Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (sq6.F(this.a) * 31);
    }

    public final String toString() {
        return "DataUploadConfiguration(frequency=" + kgh.v(this.a) + ", maxBatchesPerUploadJob=" + this.b + ")";
    }
}
