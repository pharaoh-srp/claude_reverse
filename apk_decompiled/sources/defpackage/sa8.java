package defpackage;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: loaded from: classes2.dex */
public final class sa8 implements la8 {
    public static final ra8 C = new ra8();
    public float A;
    public vfe B;
    public final td6 b;
    public final jb2 c;
    public final txi d;
    public final Resources e;
    public final Rect f;
    public Paint g;
    public int h;
    public int i;
    public long j;
    public boolean k;
    public boolean l;
    public boolean m;
    public int n;
    public int o;
    public float p;
    public boolean q;
    public float r;
    public float s;
    public float t;
    public float u;
    public float v;
    public long w;
    public long x;
    public float y;
    public float z;

    public sa8(td6 td6Var) {
        jb2 jb2Var = new jb2();
        ib2 ib2Var = new ib2();
        this.b = td6Var;
        this.c = jb2Var;
        txi txiVar = new txi(td6Var, jb2Var, ib2Var);
        this.d = txiVar;
        this.e = td6Var.getResources();
        this.f = new Rect();
        td6Var.addView(txiVar);
        txiVar.setClipBounds(null);
        this.j = 0L;
        View.generateViewId();
        this.n = 3;
        this.o = 0;
        this.p = 1.0f;
        this.r = 1.0f;
        this.s = 1.0f;
        long j = d54.b;
        this.w = j;
        this.x = j;
    }

    @Override // defpackage.la8
    public final void A() {
        Paint paint = this.g;
        if (paint == null) {
            paint = new Paint();
            this.g = paint;
        }
        paint.setColorFilter(null);
        Q();
    }

    @Override // defpackage.la8
    public final void B(float f) {
        this.r = f;
        this.d.setScaleX(f);
    }

    @Override // defpackage.la8
    public final float C() {
        return this.d.getCameraDistance() / this.e.getDisplayMetrics().densityDpi;
    }

    @Override // defpackage.la8
    public final float D() {
        return this.t;
    }

    @Override // defpackage.la8
    public final void E(boolean z) {
        boolean z2 = false;
        this.m = z && !this.l;
        this.k = true;
        if (z && this.l) {
            z2 = true;
        }
        this.d.setClipToOutline(z2);
    }

    @Override // defpackage.la8
    public final float F() {
        return this.y;
    }

    @Override // defpackage.la8
    public final void G(int i) {
        this.o = i;
        Q();
    }

    @Override // defpackage.la8
    public final void H(float f) {
        this.t = f;
        this.d.setTranslationX(f);
    }

    @Override // defpackage.la8
    public final void I(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.x = j;
            this.d.setOutlineSpotShadowColor(d4c.n0(j));
        }
    }

    @Override // defpackage.la8
    public final Matrix J() {
        return this.d.getMatrix();
    }

    @Override // defpackage.la8
    public final void K(float f) {
        this.d.setCameraDistance(f * this.e.getDisplayMetrics().densityDpi);
    }

    @Override // defpackage.la8
    public final float L() {
        return this.v;
    }

    @Override // defpackage.la8
    public final float M() {
        return this.s;
    }

    @Override // defpackage.la8
    public final void N(float f) {
        this.y = f;
        this.d.setRotationX(f);
    }

    @Override // defpackage.la8
    public final int O() {
        return this.n;
    }

    public final void P(int i) {
        txi txiVar = this.d;
        boolean z = true;
        if (i == 1) {
            txiVar.setLayerType(2, this.g);
        } else {
            Paint paint = this.g;
            if (i == 2) {
                txiVar.setLayerType(0, paint);
                z = false;
            } else {
                txiVar.setLayerType(0, paint);
            }
        }
        txiVar.setCanUseCompositingLayer$ui_graphics(z);
    }

    public final void Q() {
        int i = this.o;
        if (i != 1 && this.n == 3) {
            P(i);
        } else {
            P(1);
        }
    }

    @Override // defpackage.la8
    public final float a() {
        return this.p;
    }

    @Override // defpackage.la8
    public final void b(float f) {
        this.z = f;
        this.d.setRotationY(f);
    }

    @Override // defpackage.la8
    public final float c() {
        return this.r;
    }

    @Override // defpackage.la8
    public final void d(float f) {
        this.v = f;
        this.d.setElevation(f);
    }

    @Override // defpackage.la8
    public final vfe e() {
        return this.B;
    }

    @Override // defpackage.la8
    public final void f(float f) {
        this.A = f;
        this.d.setRotation(f);
    }

    @Override // defpackage.la8
    public final void g(float f) {
        this.u = f;
        this.d.setTranslationY(f);
    }

    @Override // defpackage.la8
    public final void h(Outline outline, long j) {
        txi txiVar = this.d;
        txiVar.I = outline;
        txiVar.invalidateOutline();
        if ((this.m || txiVar.getClipToOutline()) && outline != null) {
            txiVar.setClipToOutline(true);
            if (this.m) {
                this.m = false;
                this.k = true;
            }
        }
        this.l = outline != null;
    }

    @Override // defpackage.la8
    public final void i(vfe vfeVar) {
        this.B = vfeVar;
        if (Build.VERSION.SDK_INT >= 31) {
            this.d.setRenderEffect(vfeVar != null ? vfeVar.a() : null);
        }
    }

    @Override // defpackage.la8
    public final void j(int i) {
        this.n = i;
        Paint paint = this.g;
        if (paint == null) {
            paint = new Paint();
            this.g = paint;
        }
        paint.setXfermode(new PorterDuffXfermode(wd6.D0(i)));
        Q();
    }

    @Override // defpackage.la8
    public final void k() {
        this.b.removeViewInLayout(this.d);
    }

    @Override // defpackage.la8
    public final void l(fb2 fb2Var) {
        Rect rect;
        boolean z = this.k;
        txi txiVar = this.d;
        if (z) {
            if ((this.m || txiVar.getClipToOutline()) && !this.l) {
                rect = this.f;
                rect.left = 0;
                rect.top = 0;
                rect.right = txiVar.getWidth();
                rect.bottom = txiVar.getHeight();
            } else {
                rect = null;
            }
            txiVar.setClipBounds(rect);
        }
        if (jz.b(fb2Var).isHardwareAccelerated()) {
            this.b.a(fb2Var, txiVar, txiVar.getDrawingTime());
        }
    }

    @Override // defpackage.la8
    public final int m() {
        return this.o;
    }

    @Override // defpackage.la8
    public final hr1 n() {
        return null;
    }

    @Override // defpackage.la8
    public final void o(float f) {
        this.s = f;
        this.d.setScaleY(f);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.la8
    public final void p(cz5 cz5Var, fu9 fu9Var, ja8 ja8Var, e0 e0Var) {
        txi txiVar = this.d;
        ViewParent parent = txiVar.getParent();
        td6 td6Var = this.b;
        if (parent == null) {
            td6Var.addView(txiVar);
        }
        txiVar.K = cz5Var;
        txiVar.L = fu9Var;
        txiVar.M = e0Var;
        txiVar.N = ja8Var;
        if (txiVar.isAttachedToWindow()) {
            txiVar.setVisibility(4);
            txiVar.setVisibility(0);
            try {
                jb2 jb2Var = this.c;
                ra8 ra8Var = C;
                iz izVar = jb2Var.a;
                Canvas canvas = izVar.a;
                izVar.a = ra8Var;
                td6Var.a(izVar, txiVar, txiVar.getDrawingTime());
                jb2Var.a.a = canvas;
            } catch (ClassCastException unused) {
            }
        }
    }

    @Override // defpackage.la8
    public final void q(int i, int i2, long j) {
        boolean zB = g79.b(this.j, j);
        txi txiVar = this.d;
        if (zB) {
            int i3 = this.h;
            if (i3 != i) {
                txiVar.offsetLeftAndRight(i - i3);
            }
            int i4 = this.i;
            if (i4 != i2) {
                txiVar.offsetTopAndBottom(i2 - i4);
            }
        } else {
            if (this.m || txiVar.getClipToOutline()) {
                this.k = true;
            }
            int i5 = (int) (j >> 32);
            int i6 = (int) (4294967295L & j);
            txiVar.layout(i, i2, i + i5, i2 + i6);
            this.j = j;
            if (this.q) {
                txiVar.setPivotX(i5 / 2.0f);
                txiVar.setPivotY(i6 / 2.0f);
            }
        }
        this.h = i;
        this.i = i2;
    }

    @Override // defpackage.la8
    public final float r() {
        return this.z;
    }

    @Override // defpackage.la8
    public final float t() {
        return this.A;
    }

    @Override // defpackage.la8
    public final void u(long j) {
        long j2 = 9223372034707292159L & j;
        txi txiVar = this.d;
        if (j2 != 9205357640488583168L) {
            this.q = false;
            txiVar.setPivotX(Float.intBitsToFloat((int) (j >> 32)));
            txiVar.setPivotY(Float.intBitsToFloat((int) (j & 4294967295L)));
        } else {
            if (Build.VERSION.SDK_INT >= 28) {
                txiVar.resetPivot();
                return;
            }
            this.q = true;
            txiVar.setPivotX(((int) (this.j >> 32)) / 2.0f);
            txiVar.setPivotY(((int) (this.j & 4294967295L)) / 2.0f);
        }
    }

    @Override // defpackage.la8
    public final long v() {
        return this.w;
    }

    @Override // defpackage.la8
    public final void w(float f) {
        this.p = f;
        this.d.setAlpha(f);
    }

    @Override // defpackage.la8
    public final float x() {
        return this.u;
    }

    @Override // defpackage.la8
    public final long y() {
        return this.x;
    }

    @Override // defpackage.la8
    public final void z(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.w = j;
            this.d.setOutlineAmbientShadowColor(d4c.n0(j));
        }
    }
}
