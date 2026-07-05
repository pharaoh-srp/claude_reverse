package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class xo7 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public xo7(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof xo7)) {
            return false;
        }
        xo7 xo7Var = (xo7) obj;
        if (va6.b(this.a, xo7Var.a) && va6.b(this.b, xo7Var.b) && va6.b(this.c, xo7Var.c)) {
            return va6.b(this.d, xo7Var.d);
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + vb7.b(this.c, vb7.b(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }
}
