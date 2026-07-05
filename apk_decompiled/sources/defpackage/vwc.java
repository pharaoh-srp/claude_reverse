package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes.dex */
public final class vwc implements t35 {
    public final float a;

    public vwc(float f) {
        this.a = f;
        if (f < MTTypesetterKt.kLineSkipLimitMultiplier || f > 100.0f) {
            e39.a("The percent should be in the range of [0, 100]");
        }
    }

    @Override // defpackage.t35
    public final float a(long j, cz5 cz5Var) {
        return (this.a / 100.0f) * k8g.d(j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vwc) && Float.compare(this.a, ((vwc) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.a + "%)";
    }
}
