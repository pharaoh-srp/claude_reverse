package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class qa8 implements la8 {
    public final jb2 b;
    public final ib2 c;
    public final RenderNode d;
    public long e;
    public Paint f;
    public Matrix g;
    public boolean h;
    public float i;
    public int j;
    public float k;
    public float l;
    public float m;
    public float n;
    public float o;
    public long p;
    public long q;
    public float r;
    public float s;
    public float t;
    public float u;
    public boolean v;
    public boolean w;
    public boolean x;
    public vfe y;
    public int z;

    public qa8() {
        jb2 jb2Var = new jb2();
        ib2 ib2Var = new ib2();
        this.b = jb2Var;
        this.c = ib2Var;
        RenderNode renderNodeD = pa8.d();
        this.d = renderNodeD;
        this.e = 0L;
        renderNodeD.setClipToBounds(false);
        Q(renderNodeD, 0);
        this.i = 1.0f;
        this.j = 3;
        this.k = 1.0f;
        this.l = 1.0f;
        long j = d54.b;
        this.p = j;
        this.q = j;
        this.u = 8.0f;
        this.z = 0;
    }

    @Override // defpackage.la8
    public final void A() {
        Paint paint = this.f;
        if (paint == null) {
            paint = new Paint();
            this.f = paint;
        }
        paint.setColorFilter(null);
        R();
    }

    @Override // defpackage.la8
    public final void B(float f) {
        this.k = f;
        this.d.setScaleX(f);
    }

    @Override // defpackage.la8
    public final float C() {
        return this.u;
    }

    @Override // defpackage.la8
    public final float D() {
        return this.m;
    }

    @Override // defpackage.la8
    public final void E(boolean z) {
        this.v = z;
        P();
    }

    @Override // defpackage.la8
    public final float F() {
        return this.r;
    }

    @Override // defpackage.la8
    public final void G(int i) {
        this.z = i;
        R();
    }

    @Override // defpackage.la8
    public final void H(float f) {
        this.m = f;
        this.d.setTranslationX(f);
    }

    @Override // defpackage.la8
    public final void I(long j) {
        this.q = j;
        this.d.setSpotShadowColor(d4c.n0(j));
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
        this.u = f;
        this.d.setCameraDistance(f);
    }

    @Override // defpackage.la8
    public final float L() {
        return this.o;
    }

    @Override // defpackage.la8
    public final float M() {
        return this.l;
    }

    @Override // defpackage.la8
    public final void N(float f) {
        this.r = f;
        this.d.setRotationX(f);
    }

    @Override // defpackage.la8
    public final int O() {
        return this.j;
    }

    public final void P() {
        boolean z = this.v;
        boolean z2 = false;
        boolean z3 = z && !this.h;
        if (z && this.h) {
            z2 = true;
        }
        if (z3 != this.w) {
            this.w = z3;
            this.d.setClipToBounds(z3);
        }
        if (z2 != this.x) {
            this.x = z2;
            this.d.setClipToOutline(z2);
        }
    }

    public final void Q(RenderNode renderNode, int i) {
        Paint paint = this.f;
        if (i == 1) {
            renderNode.setUseCompositingLayer(true, paint);
            renderNode.setHasOverlappingRendering(true);
        } else if (i == 2) {
            renderNode.setUseCompositingLayer(false, paint);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, paint);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    public final void R() {
        int i = this.z;
        if (i != 1 && this.j == 3 && this.y == null) {
            Q(this.d, i);
        } else {
            Q(this.d, 1);
        }
    }

    @Override // defpackage.la8
    public final float a() {
        return this.i;
    }

    @Override // defpackage.la8
    public final void b(float f) {
        this.s = f;
        this.d.setRotationY(f);
    }

    @Override // defpackage.la8
    public final float c() {
        return this.k;
    }

    @Override // defpackage.la8
    public final void d(float f) {
        this.o = f;
        this.d.setElevation(f);
    }

    @Override // defpackage.la8
    public final vfe e() {
        return this.y;
    }

    @Override // defpackage.la8
    public final void f(float f) {
        this.t = f;
        this.d.setRotationZ(f);
    }

    @Override // defpackage.la8
    public final void g(float f) {
        this.n = f;
        this.d.setTranslationY(f);
    }

    @Override // defpackage.la8
    public final void h(Outline outline, long j) {
        this.d.setOutline(outline);
        this.h = outline != null;
        P();
    }

    @Override // defpackage.la8
    public final void i(vfe vfeVar) {
        this.y = vfeVar;
        if (Build.VERSION.SDK_INT >= 31) {
            this.d.setRenderEffect(vfeVar != null ? vfeVar.a() : null);
        }
    }

    @Override // defpackage.la8
    public final void j(int i) {
        this.j = i;
        Paint paint = this.f;
        if (paint == null) {
            paint = new Paint();
            this.f = paint;
        }
        paint.setBlendMode(wd6.C0(i));
        R();
    }

    @Override // defpackage.la8
    public final void k() {
        this.d.discardDisplayList();
    }

    @Override // defpackage.la8
    public final void l(fb2 fb2Var) {
        jz.b(fb2Var).drawRenderNode(this.d);
    }

    @Override // defpackage.la8
    public final int m() {
        return this.z;
    }

    @Override // defpackage.la8
    public final hr1 n() {
        return null;
    }

    @Override // defpackage.la8
    public final void o(float f) {
        this.l = f;
        this.d.setScaleY(f);
    }

    @Override // defpackage.la8
    public final void p(cz5 cz5Var, fu9 fu9Var, ja8 ja8Var, e0 e0Var) {
        ib2 ib2Var = this.c;
        RecordingCanvas recordingCanvasBeginRecording = this.d.beginRecording();
        try {
            jb2 jb2Var = this.b;
            iz izVar = jb2Var.a;
            Canvas canvas = izVar.a;
            izVar.a = recordingCanvasBeginRecording;
            fj0 fj0Var = ib2Var.F;
            fj0Var.L(cz5Var);
            fj0Var.M(fu9Var);
            fj0Var.F = ja8Var;
            fj0Var.N(this.e);
            fj0Var.K(izVar);
            e0Var.invoke(ib2Var);
            jb2Var.a.a = canvas;
        } finally {
            this.d.endRecording();
        }
    }

    @Override // defpackage.la8
    public final void q(int i, int i2, long j) {
        this.d.setPosition(i, i2, ((int) (j >> 32)) + i, ((int) (4294967295L & j)) + i2);
        this.e = csg.T(j);
    }

    @Override // defpackage.la8
    public final float r() {
        return this.s;
    }

    @Override // defpackage.la8
    public final boolean s() {
        return this.d.hasDisplayList();
    }

    @Override // defpackage.la8
    public final float t() {
        return this.t;
    }

    @Override // defpackage.la8
    public final void u(long j) {
        long j2 = 9223372034707292159L & j;
        RenderNode renderNode = this.d;
        if (j2 == 9205357640488583168L) {
            renderNode.resetPivot();
        } else {
            renderNode.setPivotX(Float.intBitsToFloat((int) (j >> 32)));
            this.d.setPivotY(Float.intBitsToFloat((int) (j & 4294967295L)));
        }
    }

    @Override // defpackage.la8
    public final long v() {
        return this.p;
    }

    @Override // defpackage.la8
    public final void w(float f) {
        this.i = f;
        this.d.setAlpha(f);
    }

    @Override // defpackage.la8
    public final float x() {
        return this.n;
    }

    @Override // defpackage.la8
    public final long y() {
        return this.q;
    }

    @Override // defpackage.la8
    public final void z(long j) {
        this.p = j;
        this.d.setAmbientShadowColor(d4c.n0(j));
    }
}
