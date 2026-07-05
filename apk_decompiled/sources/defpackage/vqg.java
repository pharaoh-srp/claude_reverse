package defpackage;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.widget.EdgeEffect;
import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes.dex */
public final class vqg extends qw5 implements vd6 {
    public final b20 U;
    public final zi6 V;
    public RenderNode W;

    public vqg(e0h e0hVar, b20 b20Var, zi6 zi6Var) {
        this.U = b20Var;
        this.V = zi6Var;
        p1(e0hVar);
    }

    public static boolean s1(float f, EdgeEffect edgeEffect, Canvas canvas) {
        if (f == MTTypesetterKt.kLineSkipLimitMultiplier) {
            return edgeEffect.draw(canvas);
        }
        int iSave = canvas.save();
        canvas.rotate(f);
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    @Override // defpackage.vd6
    public final void I0(cv9 cv9Var) {
        boolean z;
        boolean zS1;
        float f;
        float f2;
        float f3;
        ib2 ib2Var = cv9Var.E;
        long jG = ib2Var.g();
        b20 b20Var = this.U;
        b20Var.i(jG);
        Canvas canvasB = jz.b(ib2Var.F.p());
        b20Var.d.getValue();
        if (k8g.f(ib2Var.g())) {
            cv9Var.a();
            return;
        }
        boolean zIsHardwareAccelerated = canvasB.isHardwareAccelerated();
        zi6 zi6Var = this.V;
        if (!zIsHardwareAccelerated) {
            EdgeEffect edgeEffect = zi6Var.d;
            if (edgeEffect != null) {
                edgeEffect.finish();
            }
            EdgeEffect edgeEffect2 = zi6Var.e;
            if (edgeEffect2 != null) {
                edgeEffect2.finish();
            }
            EdgeEffect edgeEffect3 = zi6Var.f;
            if (edgeEffect3 != null) {
                edgeEffect3.finish();
            }
            EdgeEffect edgeEffect4 = zi6Var.g;
            if (edgeEffect4 != null) {
                edgeEffect4.finish();
            }
            EdgeEffect edgeEffect5 = zi6Var.h;
            if (edgeEffect5 != null) {
                edgeEffect5.finish();
            }
            EdgeEffect edgeEffect6 = zi6Var.i;
            if (edgeEffect6 != null) {
                edgeEffect6.finish();
            }
            EdgeEffect edgeEffect7 = zi6Var.j;
            if (edgeEffect7 != null) {
                edgeEffect7.finish();
            }
            EdgeEffect edgeEffect8 = zi6Var.k;
            if (edgeEffect8 != null) {
                edgeEffect8.finish();
            }
            cv9Var.a();
            return;
        }
        float fQ0 = cv9Var.q0(30.0f);
        boolean z2 = zi6.f(zi6Var.d) || zi6.g(zi6Var.h) || zi6.f(zi6Var.e) || zi6.g(zi6Var.i);
        boolean z3 = zi6.f(zi6Var.f) || zi6.g(zi6Var.j) || zi6.f(zi6Var.g) || zi6.g(zi6Var.k);
        if (z2 && z3) {
            t1().setPosition(0, 0, canvasB.getWidth(), canvasB.getHeight());
        } else if (z2) {
            t1().setPosition(0, 0, (mwa.L(fQ0) * 2) + canvasB.getWidth(), canvasB.getHeight());
        } else {
            if (!z3) {
                cv9Var.a();
                return;
            }
            t1().setPosition(0, 0, canvasB.getWidth(), (mwa.L(fQ0) * 2) + canvasB.getHeight());
        }
        RecordingCanvas recordingCanvasBeginRecording = t1().beginRecording();
        boolean zG = zi6.g(zi6Var.j);
        ukc ukcVar = ukc.F;
        if (zG) {
            EdgeEffect edgeEffectA = zi6Var.j;
            if (edgeEffectA == null) {
                edgeEffectA = zi6Var.a(ukcVar);
                zi6Var.j = edgeEffectA;
            }
            s1(90.0f, edgeEffectA, recordingCanvasBeginRecording);
            edgeEffectA.finish();
        }
        if (zi6.f(zi6Var.f)) {
            EdgeEffect edgeEffectC = zi6Var.c();
            zS1 = s1(270.0f, edgeEffectC, recordingCanvasBeginRecording);
            if (zi6.g(zi6Var.f)) {
                z = z3;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (b20Var.c() & 4294967295L));
                EdgeEffect edgeEffectA2 = zi6Var.j;
                if (edgeEffectA2 == null) {
                    edgeEffectA2 = zi6Var.a(ukcVar);
                    zi6Var.j = edgeEffectA2;
                }
                cvj.k(edgeEffectA2, cvj.e(edgeEffectC), 1.0f - fIntBitsToFloat);
            } else {
                z = z3;
            }
        } else {
            z = z3;
            zS1 = false;
        }
        boolean zG2 = zi6.g(zi6Var.h);
        ukc ukcVar2 = ukc.E;
        if (zG2) {
            EdgeEffect edgeEffectA3 = zi6Var.h;
            if (edgeEffectA3 == null) {
                edgeEffectA3 = zi6Var.a(ukcVar2);
                zi6Var.h = edgeEffectA3;
            }
            s1(180.0f, edgeEffectA3, recordingCanvasBeginRecording);
            edgeEffectA3.finish();
        }
        if (zi6.f(zi6Var.d)) {
            EdgeEffect edgeEffectE = zi6Var.e();
            zS1 = s1(MTTypesetterKt.kLineSkipLimitMultiplier, edgeEffectE, recordingCanvasBeginRecording) || zS1;
            if (zi6.g(zi6Var.d)) {
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (b20Var.c() >> 32));
                EdgeEffect edgeEffectA4 = zi6Var.h;
                if (edgeEffectA4 == null) {
                    edgeEffectA4 = zi6Var.a(ukcVar2);
                    zi6Var.h = edgeEffectA4;
                }
                cvj.k(edgeEffectA4, cvj.e(edgeEffectE), fIntBitsToFloat2);
            }
        }
        if (zi6.g(zi6Var.k)) {
            EdgeEffect edgeEffectA5 = zi6Var.k;
            if (edgeEffectA5 == null) {
                edgeEffectA5 = zi6Var.a(ukcVar);
                zi6Var.k = edgeEffectA5;
            }
            s1(270.0f, edgeEffectA5, recordingCanvasBeginRecording);
            edgeEffectA5.finish();
        }
        if (zi6.f(zi6Var.g)) {
            EdgeEffect edgeEffectD = zi6Var.d();
            zS1 = s1(90.0f, edgeEffectD, recordingCanvasBeginRecording) || zS1;
            if (zi6.g(zi6Var.g)) {
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (b20Var.c() & 4294967295L));
                EdgeEffect edgeEffectA6 = zi6Var.k;
                if (edgeEffectA6 == null) {
                    edgeEffectA6 = zi6Var.a(ukcVar);
                    zi6Var.k = edgeEffectA6;
                }
                cvj.k(edgeEffectA6, cvj.e(edgeEffectD), fIntBitsToFloat3);
            }
        }
        if (zi6.g(zi6Var.i)) {
            EdgeEffect edgeEffectA7 = zi6Var.i;
            if (edgeEffectA7 == null) {
                edgeEffectA7 = zi6Var.a(ukcVar2);
                zi6Var.i = edgeEffectA7;
            }
            f = MTTypesetterKt.kLineSkipLimitMultiplier;
            s1(MTTypesetterKt.kLineSkipLimitMultiplier, edgeEffectA7, recordingCanvasBeginRecording);
            edgeEffectA7.finish();
        } else {
            f = MTTypesetterKt.kLineSkipLimitMultiplier;
        }
        if (zi6.f(zi6Var.e)) {
            EdgeEffect edgeEffectB = zi6Var.b();
            boolean z4 = s1(180.0f, edgeEffectB, recordingCanvasBeginRecording) || zS1;
            if (zi6.g(zi6Var.e)) {
                float fIntBitsToFloat4 = Float.intBitsToFloat((int) (b20Var.c() >> 32));
                EdgeEffect edgeEffectA8 = zi6Var.i;
                if (edgeEffectA8 == null) {
                    edgeEffectA8 = zi6Var.a(ukcVar2);
                    zi6Var.i = edgeEffectA8;
                }
                cvj.k(edgeEffectA8, cvj.e(edgeEffectB), 1.0f - fIntBitsToFloat4);
            }
            zS1 = z4;
        }
        if (zS1) {
            b20Var.d();
        }
        float f4 = z ? f : fQ0;
        if (z2) {
            fQ0 = f;
        }
        fu9 layoutDirection = cv9Var.getLayoutDirection();
        iz izVarA = jz.a(recordingCanvasBeginRecording);
        long jG2 = ib2Var.g();
        cz5 cz5VarS = ib2Var.F.s();
        fu9 fu9VarU = ib2Var.F.u();
        fb2 fb2VarP = ib2Var.F.p();
        long jW = ib2Var.F.w();
        fj0 fj0Var = ib2Var.F;
        ja8 ja8Var = (ja8) fj0Var.F;
        fj0Var.L(cv9Var);
        fj0Var.M(layoutDirection);
        fj0Var.K(izVarA);
        fj0Var.N(jG2);
        fj0Var.F = null;
        izVarA.g();
        try {
            ((efe) ib2Var.F.E).G(f4, fQ0);
            try {
                cv9Var.a();
                izVarA.p();
                fj0 fj0Var2 = ib2Var.F;
                fj0Var2.L(cz5VarS);
                fj0Var2.M(fu9VarU);
                fj0Var2.K(fb2VarP);
                fj0Var2.N(jW);
                fj0Var2.F = ja8Var;
                t1().endRecording();
                int iSave = canvasB.save();
                canvasB.translate(f2, f3);
                canvasB.drawRenderNode(t1());
                canvasB.restoreToCount(iSave);
            } finally {
                ((efe) ib2Var.F.E).G(-f4, -fQ0);
            }
        } catch (Throwable th) {
            izVarA.p();
            fj0 fj0Var3 = ib2Var.F;
            fj0Var3.L(cz5VarS);
            fj0Var3.M(fu9VarU);
            fj0Var3.K(fb2VarP);
            fj0Var3.N(jW);
            fj0Var3.F = ja8Var;
            throw th;
        }
    }

    public final RenderNode t1() {
        RenderNode renderNode = this.W;
        if (renderNode != null) {
            return renderNode;
        }
        RenderNode renderNodeB = n6b.B();
        this.W = renderNodeB;
        return renderNodeB;
    }
}
