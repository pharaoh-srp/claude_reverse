package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class h20 {
    public final float a;
    public final float b;

    public h20(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h20)) {
            return false;
        }
        h20 h20Var = (h20) obj;
        return Float.compare(this.a, h20Var.a) == 0 && Float.compare(this.b, h20Var.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FlingResult(distanceCoefficient=");
        sb.append(this.a);
        sb.append(", velocityCoefficient=");
        return ebh.o(sb, this.b, ')');
    }
}
