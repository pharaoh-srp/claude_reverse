package defpackage;

import android.graphics.PathMeasure;

/* JADX INFO: loaded from: classes2.dex */
public final class e40 {
    public final PathMeasure a;

    public e40(PathMeasure pathMeasure) {
        this.a = pathMeasure;
    }

    public final float a() {
        return this.a.getLength();
    }

    public final void b(float f, float f2, c40 c40Var) {
        if (!(c40Var instanceof c40)) {
            pmf.n("Unable to obtain android.graphics.Path");
        } else {
            this.a.getSegment(f, f2, c40Var.a, true);
        }
    }

    public final void c(c40 c40Var) {
        this.a.setPath(c40Var != null ? c40Var.a : null, false);
    }
}
