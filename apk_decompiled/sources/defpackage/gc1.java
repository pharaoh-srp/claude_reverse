package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class gc1 {
    public final int a;
    public final int b;
    public final long c;

    public gc1(int i, int i2, long j) {
        this.a = i;
        this.b = i2;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gc1)) {
            return false;
        }
        gc1 gc1Var = (gc1) obj;
        return this.a == gc1Var.a && this.b == gc1Var.b && this.c == gc1Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + vb7.c(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return grc.r(this.c, ")", vb7.v("BackgroundTaskUsage(totalTokens=", ", toolUses=", this.a, this.b, ", durationMs="));
    }
}
