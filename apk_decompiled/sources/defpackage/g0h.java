package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class g0h {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public g0h(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0h)) {
            return false;
        }
        g0h g0hVar = (g0h) obj;
        return Float.compare(this.a, g0hVar.a) == 0 && Float.compare(this.b, g0hVar.b) == 0 && Float.compare(this.c, g0hVar.c) == 0 && Float.compare(this.d, g0hVar.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + vb7.b(this.c, vb7.b(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return "ViewBox(left=" + this.a + ", top=" + this.b + ", right=" + this.c + ", bottom=" + this.d + ")";
    }
}
