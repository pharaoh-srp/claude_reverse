package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class fx4 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public fx4(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final long a() {
        return d4c.l(this.a, this.b, this.c, this.d, t54.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fx4)) {
            return false;
        }
        fx4 fx4Var = (fx4) obj;
        return Float.compare(this.a, fx4Var.a) == 0 && Float.compare(this.b, fx4Var.b) == 0 && Float.compare(this.c, fx4Var.c) == 0 && Float.compare(this.d, fx4Var.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + vb7.b(this.c, vb7.b(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return "ConwayRgba(r=" + this.a + ", g=" + this.b + ", b=" + this.c + ", a=" + this.d + ")";
    }
}
