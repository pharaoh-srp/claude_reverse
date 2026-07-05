package defpackage;

import android.graphics.Color;
import android.graphics.Matrix;
import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes2.dex */
public final class gh6 {
    public float a;
    public float b;
    public float c;
    public int d;
    public float[] e = null;

    public gh6(gh6 gh6Var) {
        this.a = MTTypesetterKt.kLineSkipLimitMultiplier;
        this.b = MTTypesetterKt.kLineSkipLimitMultiplier;
        this.c = MTTypesetterKt.kLineSkipLimitMultiplier;
        this.d = 0;
        this.a = gh6Var.a;
        this.b = gh6Var.b;
        this.c = gh6Var.c;
        this.d = gh6Var.d;
    }

    public final void a(int i, ps9 ps9Var) {
        int iAlpha = Color.alpha(this.d);
        int iC = vkb.c(i);
        Matrix matrix = zpi.a;
        int i2 = (int) ((((iAlpha / 255.0f) * iC) / 255.0f) * 255.0f);
        if (i2 <= 0) {
            ps9Var.clearShadowLayer();
        } else {
            ps9Var.setShadowLayer(Math.max(this.a, Float.MIN_VALUE), this.b, this.c, Color.argb(i2, Color.red(this.d), Color.green(this.d), Color.blue(this.d)));
        }
    }

    public final void b(int i) {
        this.d = Color.argb(Math.round((vkb.c(i) * Color.alpha(this.d)) / 255.0f), Color.red(this.d), Color.green(this.d), Color.blue(this.d));
    }

    public final void c(Matrix matrix) {
        if (this.e == null) {
            this.e = new float[2];
        }
        float[] fArr = this.e;
        fArr[0] = this.b;
        fArr[1] = this.c;
        matrix.mapVectors(fArr);
        float[] fArr2 = this.e;
        this.b = fArr2[0];
        this.c = fArr2[1];
        this.a = matrix.mapRadius(this.a);
    }
}
