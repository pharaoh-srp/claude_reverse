package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ir1 {
    public final long a;
    public final float b;
    public final float c;
    public final float d;

    public ir1(long j, float f, float f2, float f3) {
        this.a = j;
        this.b = f;
        this.c = f2;
        this.d = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ir1)) {
            return false;
        }
        ir1 ir1Var = (ir1) obj;
        return fcc.c(this.a, ir1Var.a) && Float.compare(this.b, ir1Var.b) == 0 && Float.compare(this.c, ir1Var.c) == 0 && Float.compare(this.d, ir1Var.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + vb7.b(this.c, vb7.b(this.b, Long.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return "Blob(anchor=" + fcc.k(this.a) + ", baseRadius=" + this.b + ", freq=" + this.c + ", phaseOffset=" + this.d + ")";
    }
}
