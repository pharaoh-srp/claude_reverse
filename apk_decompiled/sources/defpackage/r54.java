package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class r54 {
    public final String a;
    public final long b;
    public final int c;

    public r54(String str, long j, int i) {
        this.a = str;
        this.b = j;
        this.c = i;
        if (str.length() == 0) {
            sz6.p("The name of a color space cannot be null and must contain at least 1 character");
            throw null;
        }
        if (i < -1 || i > 63) {
            sz6.p("The id must be between -1 and 63");
            throw null;
        }
    }

    public abstract float a(int i);

    public abstract float b(int i);

    public boolean c() {
        return false;
    }

    public abstract long d(float f, float f2, float f3);

    public abstract float e(float f, float f2, float f3);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        r54 r54Var = (r54) obj;
        if (this.c == r54Var.c && this.a.equals(r54Var.a)) {
            return yfd.y(this.b, r54Var.b);
        }
        return false;
    }

    public abstract long f(float f, float f2, float f3, float f4, r54 r54Var);

    public int hashCode() {
        return vb7.e(this.a.hashCode() * 31, 31, this.b) + this.c;
    }

    public final String toString() {
        return this.a + " (id=" + this.c + ", model=" + ((Object) yfd.k0(this.b)) + ')';
    }
}
