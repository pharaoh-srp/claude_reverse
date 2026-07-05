package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.Region;

/* JADX INFO: loaded from: classes.dex */
public final class iz implements fb2 {
    public Canvas a = jz.a;
    public Rect b;
    public Rect c;

    @Override // defpackage.fb2
    public final void a(float f, float f2) {
        this.a.scale(f, f2);
    }

    @Override // defpackage.fb2
    public final void b(float f) {
        this.a.rotate(f);
    }

    @Override // defpackage.fb2
    public final void c(float f, long j, v30 v30Var) {
        this.a.drawCircle(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), f, v30Var.a);
    }

    @Override // defpackage.fb2
    public final void d(r20 r20Var, long j, long j2, long j3, v30 v30Var) {
        if (this.b == null) {
            this.b = new Rect();
            this.c = new Rect();
        }
        Canvas canvas = this.a;
        Bitmap bitmapL = yfd.l(r20Var);
        Rect rect = this.b;
        rect.getClass();
        int i = (int) (j >> 32);
        rect.left = i;
        int i2 = (int) (j & 4294967295L);
        rect.top = i2;
        rect.right = i + ((int) (j2 >> 32));
        rect.bottom = i2 + ((int) (j2 & 4294967295L));
        Rect rect2 = this.c;
        rect2.getClass();
        rect2.left = 0;
        rect2.top = 0;
        rect2.right = (int) (j3 >> 32);
        rect2.bottom = (int) (j3 & 4294967295L);
        canvas.drawBitmap(bitmapL, rect, rect2, v30Var.a);
    }

    @Override // defpackage.fb2
    public final void e(c40 c40Var, v30 v30Var) {
        Canvas canvas = this.a;
        if (c40Var instanceof c40) {
            canvas.drawPath(c40Var.a, dch.C(v30Var));
        } else {
            pmf.n("Unable to obtain android.graphics.Path");
        }
    }

    @Override // defpackage.fb2
    public final void f(float f, float f2, float f3, float f4, float f5, float f6, v30 v30Var) {
        this.a.drawRoundRect(f, f2, f3, f4, f5, f6, v30Var.a);
    }

    @Override // defpackage.fb2
    public final void g() {
        this.a.save();
    }

    @Override // defpackage.fb2
    public final void h(long j, long j2, v30 v30Var) {
        this.a.drawLine(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), v30Var.a);
    }

    @Override // defpackage.fb2
    public final void i() {
        jwj.g(this.a, false);
    }

    @Override // defpackage.fb2
    public final void j(float f, float f2, float f3, float f4, v30 v30Var) {
        this.a.drawRect(f, f2, f3, f4, dch.C(v30Var));
    }

    @Override // defpackage.fb2
    public final void k(float[] fArr) {
        if (yfd.H(fArr)) {
            return;
        }
        Matrix matrix = new Matrix();
        csg.M(matrix, fArr);
        this.a.concat(matrix);
    }

    @Override // defpackage.fb2
    public final void l(c40 c40Var) {
        Canvas canvas = this.a;
        if (c40Var instanceof c40) {
            canvas.clipPath(c40Var.a, Region.Op.INTERSECT);
        } else {
            pmf.n("Unable to obtain android.graphics.Path");
        }
    }

    @Override // defpackage.fb2
    public final void m(float f, float f2, float f3, float f4, int i) {
        this.a.clipRect(f, f2, f3, f4, i == 0 ? Region.Op.DIFFERENCE : Region.Op.INTERSECT);
    }

    @Override // defpackage.fb2
    public final void n(float f, float f2) {
        this.a.translate(f, f2);
    }

    @Override // defpackage.fb2
    public final void o(r20 r20Var, long j, v30 v30Var) {
        this.a.drawBitmap(yfd.l(r20Var), Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), dch.C(v30Var));
    }

    @Override // defpackage.fb2
    public final void p() {
        this.a.restore();
    }

    @Override // defpackage.fb2
    public final void r(l9e l9eVar, v30 v30Var) {
        this.a.saveLayer(l9eVar.a, l9eVar.b, l9eVar.c, l9eVar.d, v30Var.a, 31);
    }

    @Override // defpackage.fb2
    public final void s() {
        jwj.g(this.a, true);
    }

    @Override // defpackage.fb2
    public final void t(float f, float f2, float f3, float f4, float f5, float f6, v30 v30Var) {
        this.a.drawArc(f, f2, f3, f4, f5, f6, false, v30Var.a);
    }
}
