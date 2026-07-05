package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class bb9 {
    public final float a;
    public final float b;

    public bb9(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final float a() {
        return this.a;
    }

    public final float b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bb9)) {
            return false;
        }
        bb9 bb9Var = (bb9) obj;
        return Float.compare(this.a, bb9Var.a) == 0 && Float.compare(this.b, bb9Var.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Offsets(restingPx=" + this.a + ", thresholdPx=" + this.b + ")";
    }
}
