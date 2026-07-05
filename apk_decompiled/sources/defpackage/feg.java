package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes2.dex */
public final class feg extends le1 {
    public final RectF B;
    public final ps9 C;
    public final float[] D;
    public final Path E;
    public final rt9 F;

    public feg(pna pnaVar, rt9 rt9Var) {
        super(pnaVar, rt9Var);
        this.B = new RectF();
        ps9 ps9Var = new ps9();
        this.C = ps9Var;
        this.D = new float[8];
        this.E = new Path();
        this.F = rt9Var;
        ps9Var.setAlpha(0);
        ps9Var.setStyle(Paint.Style.FILL);
        ps9Var.setColor(rt9Var.l);
    }

    @Override // defpackage.le1, defpackage.pg6
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        super.c(rectF, matrix, z);
        rt9 rt9Var = this.F;
        float f = rt9Var.j;
        float f2 = rt9Var.k;
        RectF rectF2 = this.B;
        rectF2.set(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, f, f2);
        this.n.mapRect(rectF2);
        rectF.set(rectF2);
    }

    @Override // defpackage.le1
    public final void i(Canvas canvas, Matrix matrix, int i, gh6 gh6Var) {
        rt9 rt9Var = this.F;
        int iAlpha = Color.alpha(rt9Var.l);
        if (iAlpha == 0) {
            return;
        }
        int i2 = rt9Var.l;
        ps9 ps9Var = this.C;
        ps9Var.setColor(i2);
        int iIntValue = (int) ((((iAlpha / 255.0f) * (this.w.p == null ? 100 : ((Integer) r2.d()).intValue())) / 100.0f) * (i / 255.0f) * 255.0f);
        ps9Var.setAlpha(iIntValue);
        if (gh6Var == null || Color.alpha(gh6Var.d) <= 0) {
            ps9Var.clearShadowLayer();
        } else {
            ps9Var.setShadowLayer(Math.max(gh6Var.a, Float.MIN_VALUE), gh6Var.b, gh6Var.c, gh6Var.d);
        }
        if (iIntValue > 0) {
            float[] fArr = this.D;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            float f = rt9Var.j;
            fArr[2] = f;
            fArr[3] = 0.0f;
            fArr[4] = f;
            float f2 = rt9Var.k;
            fArr[5] = f2;
            fArr[6] = 0.0f;
            fArr[7] = f2;
            matrix.mapPoints(fArr);
            Path path = this.E;
            path.reset();
            path.moveTo(fArr[0], fArr[1]);
            path.lineTo(fArr[2], fArr[3]);
            path.lineTo(fArr[4], fArr[5]);
            path.lineTo(fArr[6], fArr[7]);
            path.lineTo(fArr[0], fArr[1]);
            path.close();
            canvas.drawPath(path, ps9Var);
        }
    }
}
