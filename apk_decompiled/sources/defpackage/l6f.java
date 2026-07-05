package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class l6f {
    public final float a;
    public final long b;
    public final kl7 c;

    public l6f(float f, long j, kl7 kl7Var) {
        this.a = f;
        this.b = j;
        this.c = kl7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l6f)) {
            return false;
        }
        l6f l6fVar = (l6f) obj;
        return Float.compare(this.a, l6fVar.a) == 0 && d5i.a(this.b, l6fVar.b) && x44.r(this.c, l6fVar.c);
    }

    public final int hashCode() {
        int iHashCode = Float.hashCode(this.a) * 31;
        int i = d5i.c;
        return this.c.hashCode() + vb7.e(iHashCode, 31, this.b);
    }

    public final String toString() {
        return "Scale(scale=" + this.a + ", transformOrigin=" + ((Object) d5i.d(this.b)) + ", animationSpec=" + this.c + ')';
    }
}
