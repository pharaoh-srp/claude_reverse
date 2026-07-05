package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class i4h {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public i4h(float f, float f2, float f3, float f4, float f5, float f6) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i4h)) {
            return false;
        }
        i4h i4hVar = (i4h) obj;
        return Float.compare(this.a, i4hVar.a) == 0 && Float.compare(this.b, i4hVar.b) == 0 && Float.compare(this.c, i4hVar.c) == 0 && Float.compare(this.d, i4hVar.d) == 0 && Float.compare(this.e, i4hVar.e) == 0 && Float.compare(this.f, i4hVar.f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f) + vb7.b(this.e, vb7.b(this.d, vb7.b(this.c, vb7.b(this.b, Float.hashCode(this.a) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        return "TailFadeSegment(startX=" + this.a + ", endX=" + this.b + ", lineTop=" + this.c + ", lineBottom=" + this.d + ", startAlphaFraction=" + this.e + ", endAlphaFraction=" + this.f + ")";
    }
}
