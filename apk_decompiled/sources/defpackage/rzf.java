package defpackage;

import android.graphics.Paint;
import android.graphics.Shader;

/* JADX INFO: loaded from: classes3.dex */
public abstract class rzf extends jy1 {
    public fnf a;
    public long b = 9205357640488583168L;

    @Override // defpackage.jy1
    public final void a(float f, long j, v30 v30Var) {
        Paint paint = v30Var.a;
        fnf fnfVar = this.a;
        if (fnfVar == null || !k8g.b(this.b, j)) {
            if (k8g.f(j)) {
                this.a = null;
                this.b = 9205357640488583168L;
                fnfVar = null;
            } else {
                fnfVar = this.a;
                if (fnfVar == null) {
                    fnfVar = new fnf(6, false);
                    this.a = fnfVar;
                }
                fnfVar.F = c(j);
                this.a = fnfVar;
                this.b = j;
            }
        }
        long jM = d4c.m(paint.getColor());
        long j2 = d54.b;
        if (!d54.c(jM, j2)) {
            v30Var.e(j2);
        }
        if (!x44.r(v30Var.c, fnfVar != null ? (Shader) fnfVar.F : null)) {
            v30Var.i(fnfVar != null ? (Shader) fnfVar.F : null);
        }
        if (paint.getAlpha() / 255.0f == f) {
            return;
        }
        v30Var.c(f);
    }

    public abstract Shader c(long j);
}
