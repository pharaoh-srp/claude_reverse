package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.agog.mathdisplay.render.MTTypesetterKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes2.dex */
public final class wma extends ts9 implements bz7 {
    public final /* synthetic */ Rect F;
    public final /* synthetic */ Matrix G;
    public final /* synthetic */ pna H;
    public final /* synthetic */ bna I;
    public final /* synthetic */ Context J;
    public final /* synthetic */ zy7 K;
    public final /* synthetic */ nwb L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wma(Rect rect, Matrix matrix, pna pnaVar, bna bnaVar, Context context, zy7 zy7Var, nwb nwbVar) {
        super(1);
        this.F = rect;
        this.G = matrix;
        this.H = pnaVar;
        this.I = bnaVar;
        this.J = context;
        this.K = zy7Var;
        this.L = nwbVar;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        xd6 xd6Var = (xd6) obj;
        xd6Var.getClass();
        fb2 fb2VarP = xd6Var.B0().p();
        Rect rect = this.F;
        long jI = eve.i(rect.width(), rect.height());
        long jF = csg.f(mwa.L(k8g.e(xd6Var.g())), mwa.L(k8g.c(xd6Var.g())));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (xd6Var.g() >> 32)) / Float.intBitsToFloat((int) (jI >> 32));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32);
        int i = m6f.a;
        float fE = k8g.e(jI);
        int i2 = m6f.a;
        int i3 = (int) (jFloatToRawIntBits >> 32);
        int i4 = (int) (jFloatToRawIntBits & 4294967295L);
        long jF2 = csg.f((int) (Float.intBitsToFloat(i3) * fE), (int) (Float.intBitsToFloat(i4) * k8g.c(jI)));
        long jRound = (((long) Math.round(((xd6Var.getLayoutDirection() == fu9.E ? 0.0f : (-1.0f) * MTTypesetterKt.kLineSkipLimitMultiplier) + 1.0f) * ((((int) (jF >> 32)) - ((int) (jF2 >> 32))) / 2.0f))) << 32) | (((long) Math.round((1.0f + 1.0f) * ((((int) (jF & 4294967295L)) - ((int) (jF2 & 4294967295L))) / 2.0f))) & 4294967295L);
        Matrix matrix = this.G;
        matrix.reset();
        matrix.preTranslate((int) (jRound >> 32), (int) (jRound & 4294967295L));
        matrix.preScale(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4));
        pna pnaVar = this.H;
        if5 if5Var = pnaVar.K;
        xna xnaVar = pnaVar.F;
        boolean zRemove = if5Var.a.remove(qna.E);
        if (pnaVar.E != null && zRemove) {
            pnaVar.b();
        }
        pnaVar.i0 = 1;
        pnaVar.c();
        pnaVar.j0 = 1;
        ArrayList arrayList = pnaVar.H;
        bna bnaVar = pnaVar.E;
        bna bnaVar2 = this.I;
        if (bnaVar != bnaVar2) {
            pnaVar.d0 = true;
            if (xnaVar.Q) {
                xnaVar.cancel();
                if (!pnaVar.isVisible()) {
                    pnaVar.h0 = 1;
                }
            }
            pnaVar.E = null;
            pnaVar.M = null;
            pnaVar.I = null;
            pnaVar.g0 = -3.4028235E38f;
            xnaVar.P = null;
            xnaVar.N = -2.1474836E9f;
            xnaVar.O = 2.1474836E9f;
            pnaVar.invalidateSelf();
            pnaVar.E = bnaVar2;
            pnaVar.b();
            boolean z = xnaVar.P == null;
            xnaVar.P = bnaVar2;
            if (z) {
                xnaVar.j(Math.max(xnaVar.N, bnaVar2.l), Math.min(xnaVar.O, bnaVar2.m));
            } else {
                xnaVar.j((int) bnaVar2.l, (int) bnaVar2.m);
            }
            float f = xnaVar.L;
            xnaVar.L = MTTypesetterKt.kLineSkipLimitMultiplier;
            xnaVar.K = MTTypesetterKt.kLineSkipLimitMultiplier;
            xnaVar.i((int) f);
            xnaVar.g();
            pnaVar.m(xnaVar.getAnimatedFraction());
            Iterator it = new ArrayList(arrayList).iterator();
            while (it.hasNext()) {
                ona onaVar = (ona) it.next();
                if (onaVar != null) {
                    onaVar.run();
                }
                it.remove();
            }
            arrayList.clear();
            bnaVar2.a.getClass();
            pnaVar.c();
            Drawable.Callback callback = pnaVar.getCallback();
            if (callback instanceof ImageView) {
                ImageView imageView = (ImageView) callback;
                imageView.setImageDrawable(null);
                imageView.setImageDrawable(pnaVar);
            }
        }
        if (this.L.getValue() != null) {
            mr9.o();
            return null;
        }
        pnaVar.O = true;
        if (pnaVar.L) {
            pnaVar.L = false;
            me4 me4Var = pnaVar.M;
            if (me4Var != null) {
                me4Var.J = false;
            }
            pnaVar.invalidateSelf();
        }
        gua guaVarG = pnaVar.g();
        if (pnaVar.a(this.J) || guaVarG == null) {
            pnaVar.m(((Number) this.K.a()).floatValue());
        } else {
            pnaVar.m(guaVarG.b);
        }
        pnaVar.setBounds(0, 0, rect.width(), rect.height());
        Canvas canvasB = jz.b(fb2VarP);
        fc fcVar = pnaVar.f0;
        ThreadPoolExecutor threadPoolExecutor = pna.l0;
        Semaphore semaphore = pnaVar.e0;
        me4 me4Var2 = pnaVar.M;
        bna bnaVar3 = pnaVar.E;
        if (me4Var2 != null && bnaVar3 != null) {
            int i5 = pnaVar.j0;
            if (i5 == 0) {
                i5 = 1;
            }
            boolean z2 = i5 == 2;
            if (z2) {
                try {
                    semaphore.acquire();
                    if (pnaVar.n()) {
                        pnaVar.m(xnaVar.a());
                    }
                } catch (InterruptedException unused) {
                    if (z2) {
                        semaphore.release();
                        if (me4Var2.I != xnaVar.a()) {
                        }
                    }
                    return iei.a;
                } catch (Throwable th) {
                    if (z2) {
                        semaphore.release();
                        if (me4Var2.I != xnaVar.a()) {
                            threadPoolExecutor.execute(fcVar);
                        }
                    }
                    throw th;
                }
            }
            int i6 = pnaVar.N;
            if (pnaVar.P) {
                canvasB.save();
                canvasB.concat(matrix);
                pnaVar.j(canvasB, me4Var2);
                canvasB.restore();
            } else {
                me4Var2.f(canvasB, matrix, i6, null);
            }
            pnaVar.d0 = false;
            if (z2) {
                semaphore.release();
                if (me4Var2.I != xnaVar.a()) {
                    threadPoolExecutor.execute(fcVar);
                }
            }
        }
        return iei.a;
    }
}
