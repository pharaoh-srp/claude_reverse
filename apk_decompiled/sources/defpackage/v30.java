package defpackage;

import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class v30 {
    public final Paint a;
    public int b = 3;
    public Shader c;
    public hr1 d;
    public ruc e;

    public v30(Paint paint) {
        this.a = paint;
    }

    public final int a() {
        Paint.Cap strokeCap = this.a.getStrokeCap();
        int i = strokeCap == null ? -1 : w30.a[strokeCap.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            return i != 3 ? 0 : 2;
        }
        return 1;
    }

    public final int b() {
        Paint.Join strokeJoin = this.a.getStrokeJoin();
        int i = strokeJoin == null ? -1 : w30.b[strokeJoin.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            return i != 3 ? 0 : 1;
        }
        return 2;
    }

    public final void c(float f) {
        this.a.setAlpha((int) Math.rint(f * 255.0f));
    }

    public final void d(int i) {
        if (this.b == i) {
            return;
        }
        this.b = i;
        int i2 = Build.VERSION.SDK_INT;
        Paint paint = this.a;
        if (i2 >= 29) {
            paint.setBlendMode(wd6.C0(i));
        } else {
            paint.setXfermode(new PorterDuffXfermode(wd6.D0(i)));
        }
    }

    public final void e(long j) {
        this.a.setColor(d4c.n0(j));
    }

    public final void f(hr1 hr1Var) {
        this.d = hr1Var;
        this.a.setColorFilter(hr1Var != null ? hr1Var.a : null);
    }

    public final void g(int i) {
        this.a.setFilterBitmap(!(i == 0));
    }

    public final void h(ruc rucVar) {
        d40 d40Var = (d40) rucVar;
        this.a.setPathEffect(d40Var != null ? d40Var.a() : null);
        this.e = rucVar;
    }

    public final void i(Shader shader) {
        this.c = shader;
        this.a.setShader(shader);
    }

    public final void j(int i) {
        this.a.setStrokeCap(i == 2 ? Paint.Cap.SQUARE : i == 1 ? Paint.Cap.ROUND : i == 0 ? Paint.Cap.BUTT : Paint.Cap.BUTT);
    }

    public final void k(int i) {
        this.a.setStrokeJoin(i == 0 ? Paint.Join.MITER : i == 2 ? Paint.Join.BEVEL : i == 1 ? Paint.Join.ROUND : Paint.Join.MITER);
    }

    public final void l(float f) {
        this.a.setStrokeWidth(f);
    }

    public final void m(int i) {
        this.a.setStyle(i == 1 ? Paint.Style.STROKE : Paint.Style.FILL);
    }
}
