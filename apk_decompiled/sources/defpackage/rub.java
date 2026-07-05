package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class rub {
    public final double a;
    public final float b;
    public final ArrayList c;

    public rub(double d, float f, ArrayList arrayList) {
        this.a = d;
        this.b = f;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rub)) {
            return false;
        }
        rub rubVar = (rub) obj;
        return Double.compare(this.a, rubVar.a) == 0 && Float.compare(this.b, rubVar.b) == 0 && this.c.equals(rubVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + vb7.b(this.b, Double.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return "MutableColumnCartesianLayerMarkerTarget(x=" + this.a + ", canvasX=" + this.b + ", columns=" + this.c + ")";
    }
}
