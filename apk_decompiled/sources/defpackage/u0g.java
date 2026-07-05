package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes3.dex */
public final class u0g extends z0g {
    public final w0g c;

    public u0g(w0g w0gVar) {
        this.c = w0gVar;
    }

    @Override // defpackage.z0g
    public final void a(Matrix matrix, wzf wzfVar, int i, Canvas canvas) {
        w0g w0gVar = this.c;
        float f = w0gVar.f;
        float f2 = w0gVar.g;
        RectF rectF = new RectF(w0gVar.b, w0gVar.c, w0gVar.d, w0gVar.e);
        Paint paint = (Paint) wzfVar.e;
        boolean z = f2 < MTTypesetterKt.kLineSkipLimitMultiplier;
        Path path = (Path) wzfVar.h;
        int[] iArr = wzf.k;
        if (z) {
            iArr[0] = 0;
            iArr[1] = wzfVar.c;
            iArr[2] = wzfVar.b;
            iArr[3] = wzfVar.a;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f, f2);
            path.close();
            float f3 = -i;
            rectF.inset(f3, f3);
            iArr[0] = 0;
            iArr[1] = wzfVar.a;
            iArr[2] = wzfVar.b;
            iArr[3] = wzfVar.c;
        }
        float fWidth = rectF.width() / 2.0f;
        if (fWidth <= MTTypesetterKt.kLineSkipLimitMultiplier) {
            return;
        }
        float f4 = 1.0f - (i / fWidth);
        float[] fArr = wzf.l;
        fArr[1] = f4;
        fArr[2] = ((1.0f - f4) / 2.0f) + f4;
        paint.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, iArr, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, (Paint) wzfVar.g);
        }
        canvas.drawArc(rectF, f, f2, true, paint);
        canvas.restore();
    }
}
