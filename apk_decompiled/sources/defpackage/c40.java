package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes.dex */
public final class c40 {
    public final Path a;
    public RectF b;
    public float[] c;
    public Matrix d;

    public c40(Path path) {
        this.a = path;
    }

    public static void a(c40 c40Var, c40 c40Var2) {
        Path path = c40Var.a;
        if (c40Var2 instanceof c40) {
            path.addPath(c40Var2.a, Float.intBitsToFloat(0), Float.intBitsToFloat(0));
        } else {
            pmf.n("Unable to obtain android.graphics.Path");
        }
    }

    public static void b(c40 c40Var, l9e l9eVar) {
        c40Var.getClass();
        float f = l9eVar.a;
        float f2 = l9eVar.d;
        float f3 = l9eVar.c;
        float f4 = l9eVar.b;
        if (Float.isNaN(f) || Float.isNaN(f4) || Float.isNaN(f3) || Float.isNaN(f2)) {
            f40.c("Invalid rectangle, make sure no value is NaN");
        }
        if (c40Var.b == null) {
            c40Var.b = new RectF();
        }
        RectF rectF = c40Var.b;
        rectF.getClass();
        rectF.set(f, f4, f3, f2);
        Path path = c40Var.a;
        RectF rectF2 = c40Var.b;
        rectF2.getClass();
        path.addRect(rectF2, f40.b(nuc.E));
    }

    public static void c(c40 c40Var, sve sveVar) {
        if (c40Var.b == null) {
            c40Var.b = new RectF();
        }
        RectF rectF = c40Var.b;
        rectF.getClass();
        float f = sveVar.a;
        long j = sveVar.h;
        long j2 = sveVar.g;
        long j3 = sveVar.f;
        long j4 = sveVar.e;
        rectF.set(f, sveVar.b, sveVar.c, sveVar.d);
        if (c40Var.c == null) {
            c40Var.c = new float[8];
        }
        float[] fArr = c40Var.c;
        fArr.getClass();
        fArr[0] = Float.intBitsToFloat((int) (j4 >> 32));
        fArr[1] = Float.intBitsToFloat((int) (j4 & 4294967295L));
        fArr[2] = Float.intBitsToFloat((int) (j3 >> 32));
        fArr[3] = Float.intBitsToFloat((int) (j3 & 4294967295L));
        fArr[4] = Float.intBitsToFloat((int) (j2 >> 32));
        fArr[5] = Float.intBitsToFloat((int) (j2 & 4294967295L));
        fArr[6] = Float.intBitsToFloat((int) (j >> 32));
        fArr[7] = Float.intBitsToFloat((int) (j & 4294967295L));
        Path path = c40Var.a;
        RectF rectF2 = c40Var.b;
        rectF2.getClass();
        float[] fArr2 = c40Var.c;
        fArr2.getClass();
        path.addRoundRect(rectF2, fArr2, f40.b(nuc.E));
    }

    public final void d(float f, float f2, float f3, float f4, float f5, float f6) {
        this.a.cubicTo(f, f2, f3, f4, f5, f6);
    }

    public final l9e e() {
        if (this.b == null) {
            this.b = new RectF();
        }
        RectF rectF = this.b;
        rectF.getClass();
        this.a.computeBounds(rectF, true);
        return new l9e(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public final void f(float f, float f2) {
        this.a.lineTo(f, f2);
    }

    public final void g(float f, float f2) {
        this.a.moveTo(f, f2);
    }

    public final boolean h(c40 c40Var, c40 c40Var2, int i) {
        Path.Op op = rkj.h(i, 0) ? Path.Op.DIFFERENCE : rkj.h(i, 1) ? Path.Op.INTERSECT : rkj.h(i, 4) ? Path.Op.REVERSE_DIFFERENCE : rkj.h(i, 2) ? Path.Op.UNION : Path.Op.XOR;
        if (!(c40Var instanceof c40)) {
            pmf.n("Unable to obtain android.graphics.Path");
            return false;
        }
        Path path = c40Var.a;
        if (c40Var2 instanceof c40) {
            return this.a.op(path, c40Var2.a, op);
        }
        pmf.n("Unable to obtain android.graphics.Path");
        return false;
    }

    public final void i() {
        this.a.reset();
    }

    public final void j() {
        this.a.rewind();
    }

    public final void k(int i) {
        this.a.setFillType(i == 1 ? Path.FillType.EVEN_ODD : Path.FillType.WINDING);
    }

    public final void l(long j) {
        Matrix matrix = this.d;
        if (matrix == null) {
            this.d = new Matrix();
        } else {
            matrix.reset();
        }
        Matrix matrix2 = this.d;
        matrix2.getClass();
        matrix2.setTranslate(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        Matrix matrix3 = this.d;
        matrix3.getClass();
        this.a.transform(matrix3);
    }
}
