package defpackage;

import android.graphics.Matrix;
import android.graphics.PointF;
import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes2.dex */
public final class c5i {
    public final Matrix b;
    public final Matrix c;
    public final Matrix d;
    public final float[] e;
    public final sp9 l;
    public final ke1 m;
    public final x98 n;
    public final g54 o;
    public final g54 p;
    public final g54 q;
    public final g54 r;
    public final g54 s;
    public final g54 t;
    public final g54 u;
    public final g54 v;
    public final g54 w;
    public final boolean x;
    public final Matrix a = new Matrix();
    public float f = Float.NaN;
    public float g = Float.NaN;
    public float h = Float.NaN;
    public float i = 1.0f;
    public float j = 1.0f;
    public boolean k = true;

    public c5i(i80 i80Var) {
        d80 d80Var = i80Var.a;
        this.l = (sp9) (d80Var == null ? null : d80Var.a());
        k80 k80Var = i80Var.b;
        this.m = k80Var == null ? null : k80Var.a();
        b80 b80Var = i80Var.c;
        this.n = (x98) (b80Var == null ? null : b80Var.a());
        c80 c80Var = i80Var.d;
        this.o = c80Var == null ? null : c80Var.a();
        c80 c80Var2 = i80Var.f;
        g54 g54VarA = c80Var2 == null ? null : c80Var2.a();
        this.q = g54VarA;
        this.x = i80Var.m;
        c80 c80Var3 = i80Var.h;
        this.s = c80Var3 == null ? null : c80Var3.a();
        c80 c80Var4 = i80Var.i;
        this.t = c80Var4 == null ? null : c80Var4.a();
        c80 c80Var5 = i80Var.j;
        this.u = c80Var5 == null ? null : c80Var5.a();
        if (g54VarA != null) {
            this.b = new Matrix();
            this.c = new Matrix();
            this.d = new Matrix();
            this.e = new float[9];
        } else {
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = null;
        }
        c80 c80Var6 = i80Var.g;
        this.r = c80Var6 == null ? null : c80Var6.a();
        b80 b80Var2 = i80Var.e;
        if (b80Var2 != null) {
            this.p = (g54) b80Var2.a();
        }
        c80 c80Var7 = i80Var.k;
        if (c80Var7 != null) {
            this.v = c80Var7.a();
        } else {
            this.v = null;
        }
        c80 c80Var8 = i80Var.l;
        if (c80Var8 != null) {
            this.w = c80Var8.a();
        } else {
            this.w = null;
        }
    }

    public final void a(le1 le1Var) {
        le1Var.d(this.p);
        le1Var.d(this.v);
        le1Var.d(this.w);
        le1Var.d(this.l);
        le1Var.d(this.m);
        le1Var.d(this.n);
        le1Var.d(this.o);
        le1Var.d(this.q);
        le1Var.d(this.r);
        le1Var.d(this.s);
        le1Var.d(this.t);
        le1Var.d(this.u);
    }

    public final void b(ge1 ge1Var) {
        g54 g54Var = this.p;
        if (g54Var != null) {
            g54Var.a(ge1Var);
        }
        g54 g54Var2 = this.v;
        if (g54Var2 != null) {
            g54Var2.a(ge1Var);
        }
        g54 g54Var3 = this.w;
        if (g54Var3 != null) {
            g54Var3.a(ge1Var);
        }
        sp9 sp9Var = this.l;
        if (sp9Var != null) {
            sp9Var.a(ge1Var);
        }
        ke1 ke1Var = this.m;
        if (ke1Var != null) {
            ke1Var.a(ge1Var);
        }
        x98 x98Var = this.n;
        if (x98Var != null) {
            x98Var.a(ge1Var);
        }
        g54 g54Var4 = this.o;
        if (g54Var4 != null) {
            g54Var4.a(ge1Var);
        }
        g54 g54Var5 = this.q;
        if (g54Var5 != null) {
            g54Var5.a(ge1Var);
        }
        g54 g54Var6 = this.r;
        if (g54Var6 != null) {
            g54Var6.a(ge1Var);
        }
        g54 g54Var7 = this.s;
        if (g54Var7 != null) {
            g54Var7.a(ge1Var);
            g54Var7.a(new b5i(0, this));
        }
        g54 g54Var8 = this.t;
        if (g54Var8 != null) {
            g54Var8.a(ge1Var);
            g54Var8.a(new b5i(1, this));
        }
        g54 g54Var9 = this.u;
        if (g54Var9 != null) {
            g54Var9.a(ge1Var);
            g54Var9.a(new b5i(2, this));
        }
    }

    public final void c() {
        for (int i = 0; i < 9; i++) {
            this.e[i] = 0.0f;
        }
    }

    public final Matrix d() {
        PointF pointF;
        n6f n6fVar;
        PointF pointF2;
        Matrix matrix = this.a;
        matrix.reset();
        x98 x98Var = this.n;
        sp9 sp9Var = this.l;
        ke1 ke1Var = this.m;
        g54 g54Var = this.u;
        g54 g54Var2 = this.t;
        g54 g54Var3 = this.s;
        if ((g54Var3 == null || g54Var3.i() == MTTypesetterKt.kLineSkipLimitMultiplier) && ((g54Var2 == null || g54Var2.i() == MTTypesetterKt.kLineSkipLimitMultiplier) && (g54Var == null || g54Var.i() == MTTypesetterKt.kLineSkipLimitMultiplier))) {
            if (ke1Var != null && (pointF2 = (PointF) ke1Var.d()) != null) {
                float f = pointF2.x;
                if (f != MTTypesetterKt.kLineSkipLimitMultiplier || pointF2.y != MTTypesetterKt.kLineSkipLimitMultiplier) {
                    matrix.preTranslate(f, pointF2.y);
                }
            }
            if (!this.x) {
                g54 g54Var4 = this.o;
                if (g54Var4 != null) {
                    float fI = g54Var4.i();
                    if (fI != MTTypesetterKt.kLineSkipLimitMultiplier) {
                        matrix.preRotate(fI);
                    }
                }
            } else if (ke1Var != null) {
                float f2 = ke1Var.d;
                PointF pointF3 = (PointF) ke1Var.d();
                float f3 = pointF3.x;
                float f4 = pointF3.y;
                ke1Var.g(1.0E-4f + f2);
                PointF pointF4 = (PointF) ke1Var.d();
                ke1Var.g(f2);
                matrix.preRotate((float) Math.toDegrees(Math.atan2(pointF4.y - f4, pointF4.x - f3)));
            }
            if (this.q != null) {
                g54 g54Var5 = this.r;
                float fCos = g54Var5 == null ? 0.0f : (float) Math.cos(Math.toRadians((-g54Var5.i()) + 90.0f));
                float fSin = g54Var5 == null ? 1.0f : (float) Math.sin(Math.toRadians((-g54Var5.i()) + 90.0f));
                float fTan = (float) Math.tan(Math.toRadians(r4.i()));
                c();
                float[] fArr = this.e;
                fArr[0] = fCos;
                fArr[1] = fSin;
                float f5 = -fSin;
                fArr[3] = f5;
                fArr[4] = fCos;
                fArr[8] = 1.0f;
                Matrix matrix2 = this.b;
                matrix2.setValues(fArr);
                c();
                fArr[0] = 1.0f;
                fArr[3] = fTan;
                fArr[4] = 1.0f;
                fArr[8] = 1.0f;
                Matrix matrix3 = this.c;
                matrix3.setValues(fArr);
                c();
                fArr[0] = fCos;
                fArr[1] = f5;
                fArr[3] = fSin;
                fArr[4] = fCos;
                fArr[8] = 1.0f;
                Matrix matrix4 = this.d;
                matrix4.setValues(fArr);
                matrix3.preConcat(matrix2);
                matrix4.preConcat(matrix3);
                matrix.preConcat(matrix4);
            }
            if (x98Var != null && (n6fVar = (n6f) x98Var.d()) != null) {
                float f6 = n6fVar.a;
                if (f6 != 1.0f || n6fVar.b != 1.0f) {
                    matrix.preScale(f6, n6fVar.b);
                }
            }
            if (sp9Var != null && (pointF = (PointF) sp9Var.d()) != null) {
                float f7 = pointF.x;
                if (f7 != MTTypesetterKt.kLineSkipLimitMultiplier || pointF.y != MTTypesetterKt.kLineSkipLimitMultiplier) {
                    matrix.preTranslate(-f7, -pointF.y);
                }
            }
        } else {
            float fI2 = g54Var3 != null ? g54Var3.i() : 0.0f;
            float fI3 = g54Var2 != null ? g54Var2.i() : 0.0f;
            float fI4 = g54Var != null ? g54Var.i() : 0.0f;
            if (this.k || fI2 != this.f || fI3 != this.g || fI4 != this.h) {
                this.f = fI2;
                this.g = fI3;
                this.h = fI4;
                if (fI2 != MTTypesetterKt.kLineSkipLimitMultiplier) {
                    this.i = (float) Math.cos(Math.toRadians(fI2));
                } else {
                    this.i = 1.0f;
                }
                if (fI3 != MTTypesetterKt.kLineSkipLimitMultiplier) {
                    this.j = (float) Math.cos(Math.toRadians(fI3));
                } else {
                    this.j = 1.0f;
                }
                this.k = false;
            }
            PointF pointF5 = sp9Var == null ? null : (PointF) sp9Var.d();
            PointF pointF6 = ke1Var == null ? null : (PointF) ke1Var.d();
            n6f n6fVar2 = x98Var != null ? (n6f) x98Var.d() : null;
            float f8 = n6fVar2 != null ? n6fVar2.a : 1.0f;
            float f9 = n6fVar2 != null ? n6fVar2.b : 1.0f;
            float f10 = this.i;
            float f11 = this.j;
            matrix.reset();
            if (pointF6 != null) {
                float f12 = pointF6.x;
                if (f12 != MTTypesetterKt.kLineSkipLimitMultiplier || pointF6.y != MTTypesetterKt.kLineSkipLimitMultiplier) {
                    matrix.preTranslate(f12, pointF6.y);
                }
            }
            if (fI4 != MTTypesetterKt.kLineSkipLimitMultiplier) {
                matrix.preRotate(fI4);
            }
            if (fI3 != MTTypesetterKt.kLineSkipLimitMultiplier) {
                matrix.preScale(f11, 1.0f);
            }
            if (fI2 != MTTypesetterKt.kLineSkipLimitMultiplier) {
                matrix.preScale(1.0f, f10);
            }
            if (f8 != 1.0f || f9 != 1.0f) {
                matrix.preScale(f8, f9);
            }
            if (pointF5 != null) {
                float f13 = pointF5.x;
                if (f13 != MTTypesetterKt.kLineSkipLimitMultiplier || pointF5.y != MTTypesetterKt.kLineSkipLimitMultiplier) {
                    matrix.preTranslate(-f13, -pointF5.y);
                    return matrix;
                }
            }
        }
        return matrix;
    }

    public final Matrix e(float f) {
        ke1 ke1Var = this.m;
        PointF pointF = ke1Var == null ? null : (PointF) ke1Var.d();
        x98 x98Var = this.n;
        n6f n6fVar = x98Var == null ? null : (n6f) x98Var.d();
        sp9 sp9Var = this.l;
        PointF pointF2 = sp9Var != null ? (PointF) sp9Var.d() : null;
        Matrix matrix = this.a;
        matrix.reset();
        if (pointF != null) {
            matrix.preTranslate(pointF.x * f, pointF.y * f);
        }
        float f2 = MTTypesetterKt.kLineSkipLimitMultiplier;
        g54 g54Var = this.s;
        float fI = g54Var != null ? g54Var.i() * f : 0.0f;
        g54 g54Var2 = this.t;
        float fI2 = g54Var2 != null ? g54Var2.i() * f : 0.0f;
        g54 g54Var3 = this.u;
        float fI3 = g54Var3 != null ? g54Var3.i() * f : 0.0f;
        if (fI == MTTypesetterKt.kLineSkipLimitMultiplier && fI2 == MTTypesetterKt.kLineSkipLimitMultiplier && fI3 == MTTypesetterKt.kLineSkipLimitMultiplier) {
            g54 g54Var4 = this.o;
            if (g54Var4 != null) {
                float fFloatValue = ((Float) g54Var4.d()).floatValue() * f;
                float f3 = pointF2 == null ? 0.0f : pointF2.x;
                if (pointF2 != null) {
                    f2 = pointF2.y;
                }
                matrix.preRotate(fFloatValue, f3, f2);
            }
        } else {
            float fCos = fI != MTTypesetterKt.kLineSkipLimitMultiplier ? (float) Math.cos(Math.toRadians(fI)) : 1.0f;
            float fCos2 = fI2 != MTTypesetterKt.kLineSkipLimitMultiplier ? (float) Math.cos(Math.toRadians(fI2)) : 1.0f;
            if (fI3 != MTTypesetterKt.kLineSkipLimitMultiplier) {
                float f4 = pointF2 == null ? 0.0f : pointF2.x;
                if (pointF2 != null) {
                    f2 = pointF2.y;
                }
                matrix.preRotate(fI3, f4, f2);
            }
            if (fI2 != MTTypesetterKt.kLineSkipLimitMultiplier) {
                matrix.preScale(fCos2, 1.0f);
            }
            if (fI != MTTypesetterKt.kLineSkipLimitMultiplier) {
                matrix.preScale(1.0f, fCos);
            }
        }
        if (n6fVar != null) {
            double d = f;
            matrix.preScale((float) Math.pow(n6fVar.a, d), (float) Math.pow(n6fVar.b, d));
        }
        return matrix;
    }
}
