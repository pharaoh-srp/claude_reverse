package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class py8 {
    public static int k;
    public static final a5 l = new a5(20);
    public final String a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final zri f;
    public final long g;
    public final int h;
    public final boolean i;
    public final int j;

    public py8(String str, float f, float f2, float f3, float f4, zri zriVar, long j, int i, boolean z) {
        int i2;
        synchronized (l) {
            i2 = k;
            k = i2 + 1;
        }
        this.a = str;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = zriVar;
        this.g = j;
        this.h = i;
        this.i = z;
        this.j = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof py8)) {
            return false;
        }
        py8 py8Var = (py8) obj;
        return x44.r(this.a, py8Var.a) && va6.b(this.b, py8Var.b) && va6.b(this.c, py8Var.c) && this.d == py8Var.d && this.e == py8Var.e && this.f.equals(py8Var.f) && d54.c(this.g, py8Var.g) && this.h == py8Var.h && this.i == py8Var.i;
    }

    public final int hashCode() {
        int iHashCode = (this.f.hashCode() + vb7.b(this.e, vb7.b(this.d, vb7.b(this.c, vb7.b(this.b, this.a.hashCode() * 31, 31), 31), 31), 31)) * 31;
        int i = d54.i;
        return Boolean.hashCode(this.i) + vb7.c(this.h, vb7.e(iHashCode, 31, this.g), 31);
    }
}
