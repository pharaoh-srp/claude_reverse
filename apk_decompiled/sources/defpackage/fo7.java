package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class fo7 {
    public final float a;
    public final float b;
    public final long c;

    public fo7(long j, float f, float f2) {
        this.a = f;
        this.b = f2;
        this.c = j;
    }

    public final float a(long j) {
        long j2 = this.c;
        return Math.signum(this.a) * this.b * i20.b(j2 > 0 ? j / j2 : 1.0f).a;
    }

    public final float b(long j) {
        long j2 = this.c;
        return (((Math.signum(this.a) * i20.b(j2 > 0 ? j / j2 : 1.0f).b) * this.b) / j2) * 1000.0f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fo7)) {
            return false;
        }
        fo7 fo7Var = (fo7) obj;
        return Float.compare(this.a, fo7Var.a) == 0 && Float.compare(this.b, fo7Var.b) == 0 && this.c == fo7Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + vb7.b(this.b, Float.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FlingInfo(initialVelocity=");
        sb.append(this.a);
        sb.append(", distance=");
        sb.append(this.b);
        sb.append(", duration=");
        return ebh.p(sb, this.c, ')');
    }
}
