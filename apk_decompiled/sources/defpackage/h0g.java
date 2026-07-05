package defpackage;

import android.graphics.Paint;
import android.graphics.Path;
import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes3.dex */
public class h0g {
    public final pk7 a;
    public final d0g b;
    public final e59 c;
    public final pk7 d;
    public final float e;
    public final Paint f;
    public final Paint g;
    public final Path h;

    public h0g(pk7 pk7Var, d0g d0gVar, e59 e59Var, pk7 pk7Var2, float f) {
        d0gVar.getClass();
        e59Var.getClass();
        pk7Var2.getClass();
        this.a = pk7Var;
        this.b = d0gVar;
        this.c = e59Var;
        this.d = pk7Var2;
        this.e = f;
        Paint paint = new Paint(1);
        paint.setColor(pk7Var.a);
        this.f = paint;
        Paint paint2 = new Paint(1);
        paint2.setColor(pk7Var2.a);
        paint2.setStyle(Paint.Style.STROKE);
        this.g = paint2;
        this.h = new Path();
        if (f >= MTTypesetterKt.kLineSkipLimitMultiplier) {
            return;
        }
        sz6.p("`strokeThicknessDp` must be nonnegative.");
        throw null;
    }

    public final void a(yd2 yd2Var, float f, float f2, float f3, float f4) {
        yd2Var.getClass();
        e59 e59Var = this.c;
        float fB = e59Var.b(yd2Var) + f;
        float f5 = e59Var.b;
        ge2 ge2Var = yd2Var.a;
        float fB2 = ge2Var.b(f5) + f2;
        float fC = f3 - e59Var.c(yd2Var);
        float fB3 = f4 - ge2Var.b(e59Var.d);
        if (fB >= fC || fB2 >= fB3) {
            return;
        }
        float fB4 = ge2Var.b(this.e);
        if (fB4 != MTTypesetterKt.kLineSkipLimitMultiplier) {
            float f6 = fB4 / 2.0f;
            fB += f6;
            fB2 += f6;
            fC -= f6;
            fB3 -= f6;
            if (fB > fC || fB2 > fB3) {
                return;
            }
        }
        float f7 = fB2;
        float f8 = fC;
        float f9 = fB3;
        float f10 = fB;
        Path path = this.h;
        path.rewind();
        pk7 pk7Var = this.d;
        pk7Var.getClass();
        this.b.a(yd2Var, path, f10, f7, f8, f9);
        yd2Var.c.drawPath(path, this.f);
        if (fB4 == MTTypesetterKt.kLineSkipLimitMultiplier || ((pk7Var.a >> 24) & 255) == 0) {
            return;
        }
        Paint paint = this.g;
        paint.setStrokeWidth(fB4);
        yd2Var.c.drawPath(path, paint);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0g)) {
            return false;
        }
        h0g h0gVar = (h0g) obj;
        return this.a.equals(h0gVar.a) && x44.r(this.b, h0gVar.b) && x44.r(this.c, h0gVar.c) && x44.r(this.d, h0gVar.d) && this.e == h0gVar.e;
    }

    public int hashCode() {
        return vb7.b(this.e, (this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31, 31);
    }
}
