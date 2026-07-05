package defpackage;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes3.dex */
public final class v0g extends z0g {
    public final x0g c;
    public final float d;
    public final float e;

    public v0g(x0g x0gVar, float f, float f2) {
        this.c = x0gVar;
        this.d = f;
        this.e = f2;
    }

    @Override // defpackage.z0g
    public final void a(Matrix matrix, wzf wzfVar, int i, Canvas canvas) {
        x0g x0gVar = this.c;
        float f = x0gVar.c;
        float f2 = this.e;
        float f3 = x0gVar.b;
        float f4 = this.d;
        RectF rectF = new RectF(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, (float) Math.hypot(f - f2, f3 - f4), MTTypesetterKt.kLineSkipLimitMultiplier);
        Matrix matrix2 = this.a;
        matrix2.set(matrix);
        matrix2.preTranslate(f4, f2);
        matrix2.preRotate(b());
        wzfVar.getClass();
        rectF.bottom += i;
        rectF.offset(MTTypesetterKt.kLineSkipLimitMultiplier, -i);
        int i2 = wzfVar.c;
        int[] iArr = wzf.i;
        iArr[0] = i2;
        iArr[1] = wzfVar.b;
        iArr[2] = wzfVar.a;
        Paint paint = (Paint) wzfVar.f;
        float f5 = rectF.left;
        paint.setShader(new LinearGradient(f5, rectF.top, f5, rectF.bottom, iArr, wzf.j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    public final float b() {
        x0g x0gVar = this.c;
        return (float) Math.toDegrees(Math.atan((x0gVar.c - this.e) / (x0gVar.b - this.d)));
    }
}
