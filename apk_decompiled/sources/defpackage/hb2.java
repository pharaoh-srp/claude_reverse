package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class hb2 {
    public cz5 a;
    public fu9 b;
    public fb2 c;
    public long d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hb2)) {
            return false;
        }
        hb2 hb2Var = (hb2) obj;
        return x44.r(this.a, hb2Var.a) && this.b == hb2Var.b && x44.r(this.c, hb2Var.c) && k8g.b(this.d, hb2Var.d);
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "DrawParams(density=" + this.a + ", layoutDirection=" + this.b + ", canvas=" + this.c + ", size=" + ((Object) k8g.h(this.d)) + ')';
    }
}
