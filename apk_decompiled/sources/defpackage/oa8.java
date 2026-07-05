package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class oa8 implements la8 {
    public static final AtomicBoolean C = new AtomicBoolean(true);
    public boolean A;
    public vfe B;
    public final jb2 b;
    public final ib2 c;
    public final RenderNode d;
    public long e;
    public Paint f;
    public Matrix g;
    public boolean h;
    public long i;
    public int j;
    public int k;
    public float l;
    public boolean m;
    public float n;
    public float o;
    public float p;
    public float q;
    public float r;
    public long s;
    public long t;
    public float u;
    public float v;
    public float w;
    public float x;
    public boolean y;
    public boolean z;

    public oa8(AndroidComposeView androidComposeView, jb2 jb2Var, ib2 ib2Var) {
        this.b = jb2Var;
        this.c = ib2Var;
        RenderNode renderNodeCreate = RenderNode.create("Compose", androidComposeView);
        this.d = renderNodeCreate;
        this.e = 0L;
        this.i = 0L;
        if (C.getAndSet(false)) {
            renderNodeCreate.setScaleX(renderNodeCreate.getScaleX());
            renderNodeCreate.setScaleY(renderNodeCreate.getScaleY());
            renderNodeCreate.setTranslationX(renderNodeCreate.getTranslationX());
            renderNodeCreate.setTranslationY(renderNodeCreate.getTranslationY());
            renderNodeCreate.setElevation(renderNodeCreate.getElevation());
            renderNodeCreate.setRotation(renderNodeCreate.getRotation());
            renderNodeCreate.setRotationX(renderNodeCreate.getRotationX());
            renderNodeCreate.setRotationY(renderNodeCreate.getRotationY());
            renderNodeCreate.setCameraDistance(renderNodeCreate.getCameraDistance());
            renderNodeCreate.setPivotX(renderNodeCreate.getPivotX());
            renderNodeCreate.setPivotY(renderNodeCreate.getPivotY());
            renderNodeCreate.setClipToOutline(renderNodeCreate.getClipToOutline());
            renderNodeCreate.setClipToBounds(false);
            renderNodeCreate.setAlpha(renderNodeCreate.getAlpha());
            renderNodeCreate.isValid();
            renderNodeCreate.setLeftTopRightBottom(0, 0, 0, 0);
            renderNodeCreate.offsetLeftAndRight(0);
            renderNodeCreate.offsetTopAndBottom(0);
            if (Build.VERSION.SDK_INT >= 28) {
                zfe.c(renderNodeCreate, zfe.a(renderNodeCreate));
                zfe.d(renderNodeCreate, zfe.b(renderNodeCreate));
            }
            yfe.a(renderNodeCreate);
            renderNodeCreate.setLayerType(0);
            renderNodeCreate.setHasOverlappingRendering(renderNodeCreate.hasOverlappingRendering());
        }
        renderNodeCreate.setClipToBounds(false);
        Q(0);
        this.j = 0;
        this.k = 3;
        this.l = 1.0f;
        this.n = 1.0f;
        this.o = 1.0f;
        long j = d54.b;
        this.s = j;
        this.t = j;
        this.x = 8.0f;
    }

    @Override // defpackage.la8
    public final void A() {
        R();
    }

    @Override // defpackage.la8
    public final void B(float f) {
        this.n = f;
        this.d.setScaleX(f);
    }

    @Override // defpackage.la8
    public final float C() {
        return this.x;
    }

    @Override // defpackage.la8
    public final float D() {
        return this.p;
    }

    @Override // defpackage.la8
    public final void E(boolean z) {
        this.y = z;
        P();
    }

    @Override // defpackage.la8
    public final float F() {
        return this.u;
    }

    @Override // defpackage.la8
    public final void G(int i) {
        this.j = i;
        R();
    }

    @Override // defpackage.la8
    public final void H(float f) {
        this.p = f;
        this.d.setTranslationX(f);
    }

    @Override // defpackage.la8
    public final void I(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.t = j;
            zfe.d(this.d, d4c.n0(j));
        }
    }

    @Override // defpackage.la8
    public final Matrix J() {
        Matrix matrix = this.g;
        if (matrix == null) {
            matrix = new Matrix();
            this.g = matrix;
        }
        this.d.getMatrix(matrix);
        return matrix;
    }

    @Override // defpackage.la8
    public final void K(float f) {
        this.x = f;
        this.d.setCameraDistance(-f);
    }

    @Override // defpackage.la8
    public final float L() {
        return this.r;
    }

    @Override // defpackage.la8
    public final float M() {
        return this.o;
    }

    @Override // defpackage.la8
    public final void N(float f) {
        this.u = f;
        this.d.setRotationX(f);
    }

    @Override // defpackage.la8
    public final int O() {
        return this.k;
    }

    public final void P() {
        boolean z = this.y;
        boolean z2 = false;
        boolean z3 = z && !this.h;
        if (z && this.h) {
            z2 = true;
        }
        if (z3 != this.z) {
            this.z = z3;
            this.d.setClipToBounds(z3);
        }
        if (z2 != this.A) {
            this.A = z2;
            this.d.setClipToOutline(z2);
        }
    }

    public final void Q(int i) {
        RenderNode renderNode = this.d;
        if (i == 1) {
            renderNode.setLayerType(2);
            renderNode.setLayerPaint(this.f);
            renderNode.setHasOverlappingRendering(true);
        } else if (i == 2) {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.f);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.f);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    public final void R() {
        int i = this.j;
        if (i != 1 && this.k == 3) {
            Q(i);
        } else {
            Q(1);
        }
    }

    @Override // defpackage.la8
    public final float a() {
        return this.l;
    }

    @Override // defpackage.la8
    public final void b(float f) {
        this.v = f;
        this.d.setRotationY(f);
    }

    @Override // defpackage.la8
    public final float c() {
        return this.n;
    }

    @Override // defpackage.la8
    public final void d(float f) {
        this.r = f;
        this.d.setElevation(f);
    }

    @Override // defpackage.la8
    public final vfe e() {
        return this.B;
    }

    @Override // defpackage.la8
    public final void f(float f) {
        this.w = f;
        this.d.setRotation(f);
    }

    @Override // defpackage.la8
    public final void g(float f) {
        this.q = f;
        this.d.setTranslationY(f);
    }

    @Override // defpackage.la8
    public final void h(Outline outline, long j) {
        this.i = j;
        this.d.setOutline(outline);
        this.h = outline != null;
        P();
    }

    @Override // defpackage.la8
    public final void i(vfe vfeVar) {
        this.B = vfeVar;
    }

    @Override // defpackage.la8
    public final void j(int i) {
        if (this.k == i) {
            return;
        }
        this.k = i;
        Paint paint = this.f;
        if (paint == null) {
            paint = new Paint();
            this.f = paint;
        }
        paint.setXfermode(new PorterDuffXfermode(wd6.D0(i)));
        R();
    }

    @Override // defpackage.la8
    public final void k() {
        yfe.a(this.d);
    }

    @Override // defpackage.la8
    public final void l(fb2 fb2Var) {
        DisplayListCanvas displayListCanvasB = jz.b(fb2Var);
        displayListCanvasB.getClass();
        displayListCanvasB.drawRenderNode(this.d);
    }

    @Override // defpackage.la8
    public final int m() {
        return this.j;
    }

    @Override // defpackage.la8
    public final hr1 n() {
        return null;
    }

    @Override // defpackage.la8
    public final void o(float f) {
        this.o = f;
        this.d.setScaleY(f);
    }

    @Override // defpackage.la8
    public final void p(cz5 cz5Var, fu9 fu9Var, ja8 ja8Var, e0 e0Var) {
        Canvas canvasStart = this.d.start(Math.max((int) (this.e >> 32), (int) (this.i >> 32)), Math.max((int) (this.e & 4294967295L), (int) (this.i & 4294967295L)));
        try {
            jb2 jb2Var = this.b;
            iz izVar = jb2Var.a;
            Canvas canvas = izVar.a;
            izVar.a = canvasStart;
            ib2 ib2Var = this.c;
            long jT = csg.T(this.e);
            fj0 fj0Var = ib2Var.F;
            fj0 fj0Var2 = ib2Var.F;
            cz5 cz5VarS = fj0Var.s();
            fu9 fu9VarU = fj0Var2.u();
            fb2 fb2VarP = fj0Var2.p();
            long jW = fj0Var2.w();
            ja8 ja8Var2 = (ja8) fj0Var2.F;
            fj0Var2.L(cz5Var);
            fj0Var2.M(fu9Var);
            fj0Var2.K(izVar);
            fj0Var2.N(jT);
            fj0Var2.F = ja8Var;
            izVar.g();
            try {
                e0Var.invoke(ib2Var);
                izVar.p();
                fj0Var2.L(cz5VarS);
                fj0Var2.M(fu9VarU);
                fj0Var2.K(fb2VarP);
                fj0Var2.N(jW);
                fj0Var2.F = ja8Var2;
                jb2Var.a.a = canvas;
            } catch (Throwable th) {
                izVar.p();
                fj0 fj0Var3 = ib2Var.F;
                fj0Var3.L(cz5VarS);
                fj0Var3.M(fu9VarU);
                fj0Var3.K(fb2VarP);
                fj0Var3.N(jW);
                fj0Var3.F = ja8Var2;
                throw th;
            }
        } finally {
            this.d.end(canvasStart);
        }
    }

    @Override // defpackage.la8
    public final void q(int i, int i2, long j) {
        int i3 = (int) (j >> 32);
        int i4 = (int) (4294967295L & j);
        this.d.setLeftTopRightBottom(i, i2, i + i3, i2 + i4);
        if (g79.b(this.e, j)) {
            return;
        }
        if (this.m) {
            this.d.setPivotX(i3 / 2.0f);
            this.d.setPivotY(i4 / 2.0f);
        }
        this.e = j;
    }

    @Override // defpackage.la8
    public final float r() {
        return this.v;
    }

    @Override // defpackage.la8
    public final boolean s() {
        return this.d.isValid();
    }

    @Override // defpackage.la8
    public final float t() {
        return this.w;
    }

    @Override // defpackage.la8
    public final void u(long j) {
        if ((9223372034707292159L & j) == 9205357640488583168L) {
            this.m = true;
            this.d.setPivotX(((int) (this.e >> 32)) / 2.0f);
            this.d.setPivotY(((int) (4294967295L & this.e)) / 2.0f);
        } else {
            this.m = false;
            this.d.setPivotX(Float.intBitsToFloat((int) (j >> 32)));
            this.d.setPivotY(Float.intBitsToFloat((int) (j & 4294967295L)));
        }
    }

    @Override // defpackage.la8
    public final long v() {
        return this.s;
    }

    @Override // defpackage.la8
    public final void w(float f) {
        this.l = f;
        this.d.setAlpha(f);
    }

    @Override // defpackage.la8
    public final float x() {
        return this.q;
    }

    @Override // defpackage.la8
    public final long y() {
        return this.t;
    }

    @Override // defpackage.la8
    public final void z(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.s = j;
            zfe.c(this.d, d4c.n0(j));
        }
    }

    public /* synthetic */ oa8(AndroidComposeView androidComposeView) {
        this(androidComposeView, new jb2(), new ib2());
    }
}
