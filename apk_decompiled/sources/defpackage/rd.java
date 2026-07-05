package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class rd {
    public static final rd f = new rd(8.0f, 1000.0f, 50.0f, 0.4f, 0.6f);
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;

    public rd(float f2, float f3, float f4, float f5, float f6) {
        this.a = f2;
        this.b = f3;
        this.c = f4;
        this.d = f5;
        this.e = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rd)) {
            return false;
        }
        rd rdVar = (rd) obj;
        return Float.compare(this.a, rdVar.a) == 0 && Float.compare(this.b, rdVar.b) == 0 && Float.compare(this.c, rdVar.c) == 0 && Float.compare(this.d, rdVar.d) == 0 && Float.compare(this.e, rdVar.e) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.e) + vb7.b(this.d, vb7.b(this.c, vb7.b(this.b, Float.hashCode(this.a) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "AdaptiveGainParams(maxGain=" + this.a + ", targetRms=" + this.b + ", noiseFloorRms=" + this.c + ", attack=" + this.d + ", release=" + this.e + ")";
    }
}
