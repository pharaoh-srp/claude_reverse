package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import com.agog.mathdisplay.render.MTTypesetterKt;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class ww8 extends le1 {
    public final ps9 B;
    public final Rect C;
    public final Rect D;
    public final RectF E;
    public final rna F;
    public final ih6 G;
    public ecc H;
    public at I;

    public ww8(pna pnaVar, rt9 rt9Var) {
        super(pnaVar, rt9Var);
        this.B = new ps9(3, 0);
        this.C = new Rect();
        this.D = new Rect();
        this.E = new RectF();
        String str = rt9Var.g;
        bna bnaVar = pnaVar.E;
        this.F = bnaVar == null ? null : (rna) ((HashMap) bnaVar.c()).get(str);
        h80 h80Var = this.p.x;
        if (h80Var != null) {
            this.G = new ih6(this, this, h80Var);
        }
    }

    @Override // defpackage.le1, defpackage.pg6
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        super.c(rectF, matrix, z);
        if (this.F != null) {
            float fC = zpi.c();
            this.o.getClass();
            if (n() != null) {
                rectF.set(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, r0.getWidth() * fC, r0.getHeight() * fC);
            } else {
                rectF.set(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, r4.a * fC, r4.b * fC);
            }
            this.n.mapRect(rectF);
        }
    }

    @Override // defpackage.le1
    public final void i(Canvas canvas, Matrix matrix, int i, gh6 gh6Var) {
        Bitmap bitmapN = n();
        if (bitmapN == null || bitmapN.isRecycled() || this.F == null) {
            return;
        }
        float fC = zpi.c();
        ps9 ps9Var = this.B;
        ps9Var.setAlpha(i);
        ih6 ih6Var = this.G;
        if (ih6Var != null) {
            gh6Var = ih6Var.b(matrix, i);
        }
        int width = bitmapN.getWidth();
        int height = bitmapN.getHeight();
        Rect rect = this.C;
        rect.set(0, 0, width, height);
        this.o.getClass();
        Rect rect2 = this.D;
        rect2.set(0, 0, (int) (bitmapN.getWidth() * fC), (int) (bitmapN.getHeight() * fC));
        boolean z = gh6Var != null;
        if (z) {
            if (this.H == null) {
                this.H = new ecc();
            }
            if (this.I == null) {
                this.I = new at(7);
            }
            at atVar = this.I;
            atVar.F = 255;
            atVar.G = null;
            gh6Var.getClass();
            gh6 gh6Var2 = new gh6(gh6Var);
            atVar.G = gh6Var2;
            gh6Var2.b(i);
            float f = rect2.left;
            float f2 = rect2.top;
            float f3 = rect2.right;
            float f4 = rect2.bottom;
            RectF rectF = this.E;
            rectF.set(f, f2, f3, f4);
            matrix.mapRect(rectF);
            canvas = this.H.e(canvas, rectF, this.I);
        }
        canvas.save();
        canvas.concat(matrix);
        canvas.drawBitmap(bitmapN, rect, rect2, ps9Var);
        if (z) {
            this.H.c();
            if (this.H.c == 4) {
                return;
            }
        }
        canvas.restore();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Bitmap n() {
        /*
            Method dump skipped, instruction units count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ww8.n():android.graphics.Bitmap");
    }
}
