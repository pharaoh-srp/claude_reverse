package defpackage;

import android.graphics.Rect;

/* JADX INFO: loaded from: classes.dex */
public final class rdj {
    public final pv1 a;
    public final float b;

    public rdj(Rect rect, float f) {
        this.a = new pv1(rect);
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!rdj.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        rdj rdjVar = (rdj) obj;
        return x44.r(this.a, rdjVar.a) && this.b == rdjVar.b;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WindowMetrics(_bounds=");
        sb.append(this.a);
        sb.append(", density=");
        return ebh.o(sb, this.b, ')');
    }

    public rdj(pv1 pv1Var, float f) {
        this.a = pv1Var;
        this.b = f;
    }
}
