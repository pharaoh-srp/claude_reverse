package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class avb {
    public final double a;
    public final float b;
    public final List c;

    public avb(double d, float f) {
        ArrayList arrayList = new ArrayList();
        this.a = d;
        this.b = f;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof avb)) {
            return false;
        }
        avb avbVar = (avb) obj;
        return Double.compare(this.a, avbVar.a) == 0 && Float.compare(this.b, avbVar.b) == 0 && x44.r(this.c, avbVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + vb7.b(this.b, Double.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return "MutableLineCartesianLayerMarkerTarget(x=" + this.a + ", canvasX=" + this.b + ", points=" + this.c + ")";
    }
}
