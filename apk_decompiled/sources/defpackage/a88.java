package defpackage;

import android.graphics.Canvas;
import android.widget.EdgeEffect;
import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes2.dex */
public final class a88 extends qw5 implements vd6 {
    public final b20 U;
    public final zi6 V;
    public final mnc W;

    public a88(e0h e0hVar, b20 b20Var, zi6 zi6Var, mnc mncVar) {
        this.U = b20Var;
        this.V = zi6Var;
        this.W = mncVar;
        p1(e0hVar);
    }

    public static boolean s1(float f, long j, EdgeEffect edgeEffect, Canvas canvas) {
        int iSave = canvas.save();
        canvas.rotate(f);
        canvas.translate(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    @Override // defpackage.vd6
    public final void I0(cv9 cv9Var) {
        boolean zS1;
        char c;
        long j;
        ib2 ib2Var = cv9Var.E;
        long jG = ib2Var.g();
        b20 b20Var = this.U;
        b20Var.i(jG);
        if (k8g.f(ib2Var.g())) {
            cv9Var.a();
            return;
        }
        cv9Var.a();
        b20Var.d.getValue();
        Canvas canvasB = jz.b(ib2Var.F.p());
        zi6 zi6Var = this.V;
        boolean zF = zi6.f(zi6Var.f);
        mnc mncVar = this.W;
        if (zF) {
            zS1 = s1(270.0f, (((long) Float.floatToRawIntBits(cv9Var.q0(mncVar.b(cv9Var.getLayoutDirection())))) & 4294967295L) | (((long) Float.floatToRawIntBits(-Float.intBitsToFloat((int) (ib2Var.g() & 4294967295L)))) << 32), zi6Var.c(), canvasB);
        } else {
            zS1 = false;
        }
        if (zi6.f(zi6Var.d)) {
            c = ' ';
            j = 4294967295L;
            zS1 = s1(MTTypesetterKt.kLineSkipLimitMultiplier, (((long) Float.floatToRawIntBits(MTTypesetterKt.kLineSkipLimitMultiplier)) << 32) | (((long) Float.floatToRawIntBits(cv9Var.q0(mncVar.d()))) & 4294967295L), zi6Var.e(), canvasB) || zS1;
        } else {
            c = ' ';
            j = 4294967295L;
        }
        if (zi6.f(zi6Var.g)) {
            zS1 = s1(90.0f, (((long) Float.floatToRawIntBits(cv9Var.q0(mncVar.c(cv9Var.getLayoutDirection())) + (-((float) mwa.L(Float.intBitsToFloat((int) (ib2Var.g() >> c))))))) & j) | (((long) Float.floatToRawIntBits(MTTypesetterKt.kLineSkipLimitMultiplier)) << c), zi6Var.d(), canvasB) || zS1;
        }
        if (zi6.f(zi6Var.e)) {
            EdgeEffect edgeEffectB = zi6Var.b();
            zS1 = s1(180.0f, (((long) Float.floatToRawIntBits(-Float.intBitsToFloat((int) (ib2Var.g() >> c)))) << c) | (((long) Float.floatToRawIntBits((-Float.intBitsToFloat((int) (ib2Var.g() & j))) + cv9Var.q0(mncVar.a()))) & j), edgeEffectB, canvasB) || zS1;
        }
        if (zS1) {
            b20Var.d();
        }
    }
}
