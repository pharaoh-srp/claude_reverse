package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class i9g {
    public final float a;
    public final float b;
    public final boolean c;
    public final float d;

    public i9g(float f, float f2, boolean z, float f3) {
        this.a = f;
        this.b = f2;
        this.c = z;
        this.d = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i9g)) {
            return false;
        }
        i9g i9gVar = (i9g) obj;
        return va6.b(this.a, i9gVar.a) && Float.compare(this.b, i9gVar.b) == 0 && this.c == i9gVar.c && va6.b(this.d, i9gVar.d);
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + fsh.p(vb7.b(this.b, Float.hashCode(this.a) * 31, 31), 31, this.c);
    }

    public final String toString() {
        return "Cloud(gap=" + va6.c(this.a) + ", scale=" + this.b + ", flipped=" + this.c + ", y=" + va6.c(this.d) + ")";
    }
}
