package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.util.Base64;
import android.util.Log;
import android.view.Surface;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.caverock.androidsvg.b;
import io.sentry.w6;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.Stack;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import okio.ByteString;
import okio.Okio;
import okio.RealBufferedSource;
import okio.Source;

/* JADX INFO: loaded from: classes3.dex */
public final class h2f {
    public static HashSet h;
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;

    public h2f() {
        this.a = 1;
        this.b = new AtomicBoolean(false);
        this.c = new CountDownLatch(1);
        this.g = "PublicSuffixDatabase.list";
    }

    public static Path B(w0f w0fVar) {
        Path path = new Path();
        float[] fArr = w0fVar.o;
        path.moveTo(fArr[0], fArr[1]);
        int i = 2;
        while (true) {
            float[] fArr2 = w0fVar.o;
            if (i >= fArr2.length) {
                break;
            }
            path.lineTo(fArr2[i], fArr2[i + 1]);
            i += 2;
        }
        if (w0fVar instanceof x0f) {
            path.close();
        }
        if (w0fVar.h == null) {
            w0fVar.h = d(path);
        }
        return path;
    }

    public static void P(f2f f2fVar, boolean z, k1f k1fVar) {
        int i;
        b1f b1fVar = f2fVar.a;
        float fFloatValue = (z ? b1fVar.G : b1fVar.I).floatValue();
        if (k1fVar instanceof e0f) {
            i = ((e0f) k1fVar).E;
        } else if (!(k1fVar instanceof f0f)) {
            return;
        } else {
            i = f2fVar.a.O.E;
        }
        int iJ = j(i, fFloatValue);
        if (z) {
            f2fVar.d.setColor(iJ);
        } else {
            f2fVar.e.setColor(iJ);
        }
    }

    public static h2f a(qh9 qh9Var) {
        h2f h2fVar = new h2f(4);
        h2fVar.c = x41.i(qh9Var, "name");
        h2fVar.d = x41.i(qh9Var, "resource");
        h2fVar.f = x41.i(qh9Var, "sample_rate");
        h2fVar.b = x41.i(qh9Var, "service");
        h2fVar.g = x41.i(qh9Var, "max_per_second");
        h2fVar.e = x41.s(qh9Var);
        return h2fVar;
    }

    public static void b(float f, float f2, float f3, float f4, float f5, boolean z, boolean z2, float f6, float f7, u0f u0fVar) {
        if (f == f6 && f2 == f7) {
            return;
        }
        if (f3 == MTTypesetterKt.kLineSkipLimitMultiplier || f4 == MTTypesetterKt.kLineSkipLimitMultiplier) {
            u0fVar.e(f6, f7);
            return;
        }
        float fAbs = Math.abs(f3);
        float fAbs2 = Math.abs(f4);
        double radians = Math.toRadians(((double) f5) % 360.0d);
        double dCos = Math.cos(radians);
        double dSin = Math.sin(radians);
        double d = ((double) (f - f6)) / 2.0d;
        double d2 = ((double) (f2 - f7)) / 2.0d;
        double d3 = (dSin * d2) + (dCos * d);
        double d4 = (dCos * d2) + ((-dSin) * d);
        double d5 = fAbs * fAbs;
        double d6 = fAbs2 * fAbs2;
        double d7 = d3 * d3;
        double d8 = d4 * d4;
        double d9 = (d8 / d6) + (d7 / d5);
        if (d9 > 0.99999d) {
            double dSqrt = Math.sqrt(d9) * 1.00001d;
            fAbs = (float) (((double) fAbs) * dSqrt);
            fAbs2 = (float) (dSqrt * ((double) fAbs2));
            d5 = fAbs * fAbs;
            d6 = fAbs2 * fAbs2;
        }
        double d10 = z == z2 ? -1.0d : 1.0d;
        double d11 = d5 * d6;
        double d12 = d5 * d8;
        double d13 = d6 * d7;
        double d14 = ((d11 - d12) - d13) / (d12 + d13);
        if (d14 < 0.0d) {
            d14 = 0.0d;
        }
        double dSqrt2 = Math.sqrt(d14) * d10;
        double d15 = fAbs;
        double d16 = fAbs2;
        double d17 = ((d15 * d4) / d16) * dSqrt2;
        double d18 = dSqrt2 * (-((d16 * d3) / d15));
        double d19 = ((dCos * d17) - (dSin * d18)) + (((double) (f + f6)) / 2.0d);
        double d20 = (dCos * d18) + (dSin * d17) + (((double) (f2 + f7)) / 2.0d);
        double d21 = (d3 - d17) / d15;
        double d22 = (d4 - d18) / d16;
        double d23 = ((-d3) - d17) / d15;
        double d24 = ((-d4) - d18) / d16;
        double d25 = (d22 * d22) + (d21 * d21);
        double dAcos = Math.acos(d21 / Math.sqrt(d25)) * (d22 < 0.0d ? -1.0d : 1.0d);
        double dSqrt3 = ((d22 * d24) + (d21 * d23)) / Math.sqrt(((d24 * d24) + (d23 * d23)) * d25);
        double dAcos2 = ((d21 * d24) - (d22 * d23) < 0.0d ? -1.0d : 1.0d) * (dSqrt3 < -1.0d ? 3.141592653589793d : dSqrt3 > 1.0d ? 0.0d : Math.acos(dSqrt3));
        if (!z2 && dAcos2 > 0.0d) {
            dAcos2 -= 6.283185307179586d;
        } else if (z2 && dAcos2 < 0.0d) {
            dAcos2 += 6.283185307179586d;
        }
        double d26 = dAcos2 % 6.283185307179586d;
        double d27 = dAcos % 6.283185307179586d;
        int iCeil = (int) Math.ceil((Math.abs(d26) * 2.0d) / 3.141592653589793d);
        double d28 = d26 / ((double) iCeil);
        double d29 = d28 / 2.0d;
        double dSin2 = (Math.sin(d29) * 1.3333333333333333d) / (Math.cos(d29) + 1.0d);
        int i = iCeil * 6;
        float[] fArr = new float[i];
        int i2 = 0;
        int i3 = 0;
        while (i2 < iCeil) {
            double d30 = d27;
            double d31 = (((double) i2) * d28) + d30;
            double dCos2 = Math.cos(d31);
            double dSin3 = Math.sin(d31);
            int i4 = i2;
            int i5 = i3;
            fArr[i5] = (float) (dCos2 - (dSin2 * dSin3));
            fArr[i3 + 1] = (float) ((dCos2 * dSin2) + dSin3);
            double d32 = d31 + d28;
            double dCos3 = Math.cos(d32);
            double dSin4 = Math.sin(d32);
            fArr[i5 + 2] = (float) ((dSin2 * dSin4) + dCos3);
            fArr[i5 + 3] = (float) (dSin4 - (dSin2 * dCos3));
            fArr[i5 + 4] = (float) dCos3;
            i3 = i5 + 6;
            fArr[i5 + 5] = (float) dSin4;
            i2 = i4 + 1;
            d27 = d30;
            iCeil = iCeil;
        }
        Matrix matrix = new Matrix();
        matrix.postScale(fAbs, fAbs2);
        matrix.postRotate(f5);
        matrix.postTranslate((float) d19, (float) d20);
        matrix.mapPoints(fArr);
        fArr[i - 2] = f6;
        fArr[i - 1] = f7;
        for (int i6 = 0; i6 < i; i6 += 6) {
            u0fVar.c(fArr[i6], fArr[i6 + 1], fArr[i6 + 2], fArr[i6 + 3], fArr[i6 + 4], fArr[i6 + 5]);
        }
    }

    public static sp0 d(Path path) {
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        return new sp0(rectF.left, rectF.top, rectF.width(), rectF.height(), 2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
    
        if (r7 != 9) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007d A[PHI: r5
      0x007d: PHI (r5v2 float) = (r5v1 float), (r5v3 float) binds: [B:32:0x006f, B:35:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Matrix f(defpackage.sp0 r9, defpackage.sp0 r10, defpackage.gdd r11) {
        /*
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            if (r11 == 0) goto L8a
            fdd r1 = r11.a
            if (r1 != 0) goto Ld
            goto L8a
        Ld:
            float r2 = r9.d
            float r3 = r10.d
            float r2 = r2 / r3
            float r3 = r9.e
            float r4 = r10.e
            float r3 = r3 / r4
            float r4 = r10.b
            float r4 = -r4
            float r5 = r10.c
            float r5 = -r5
            gdd r6 = defpackage.gdd.c
            boolean r6 = r11.equals(r6)
            if (r6 == 0) goto L33
            float r10 = r9.b
            float r9 = r9.c
            r0.preTranslate(r10, r9)
            r0.preScale(r2, r3)
            r0.preTranslate(r4, r5)
            return r0
        L33:
            int r11 = r11.b
            r6 = 2
            if (r11 != r6) goto L3d
            float r11 = java.lang.Math.max(r2, r3)
            goto L41
        L3d:
            float r11 = java.lang.Math.min(r2, r3)
        L41:
            float r2 = r9.d
            float r2 = r2 / r11
            float r3 = r9.e
            float r3 = r3 / r11
            int r7 = r1.ordinal()
            r8 = 1073741824(0x40000000, float:2.0)
            if (r7 == r6) goto L66
            r6 = 3
            if (r7 == r6) goto L61
            r6 = 5
            if (r7 == r6) goto L66
            r6 = 6
            if (r7 == r6) goto L61
            r6 = 8
            if (r7 == r6) goto L66
            r6 = 9
            if (r7 == r6) goto L61
            goto L6b
        L61:
            float r6 = r10.d
            float r6 = r6 - r2
        L64:
            float r4 = r4 - r6
            goto L6b
        L66:
            float r6 = r10.d
            float r6 = r6 - r2
            float r6 = r6 / r8
            goto L64
        L6b:
            int r1 = r1.ordinal()
            switch(r1) {
                case 4: goto L78;
                case 5: goto L78;
                case 6: goto L78;
                case 7: goto L73;
                case 8: goto L73;
                case 9: goto L73;
                default: goto L72;
            }
        L72:
            goto L7d
        L73:
            float r10 = r10.e
            float r10 = r10 - r3
        L76:
            float r5 = r5 - r10
            goto L7d
        L78:
            float r10 = r10.e
            float r10 = r10 - r3
            float r10 = r10 / r8
            goto L76
        L7d:
            float r10 = r9.b
            float r9 = r9.c
            r0.preTranslate(r10, r9)
            r0.preScale(r11, r11)
            r0.preTranslate(r4, r5)
        L8a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h2f.f(sp0, sp0, gdd):android.graphics.Matrix");
    }

    public static Typeface i(int i, String str, Integer num) {
        int i2;
        boolean z = i == 2;
        i2 = num.intValue() > 500 ? z ? 3 : 1 : z ? 2 : 0;
        str.getClass();
        switch (str) {
            case "sans-serif":
                return Typeface.create(Typeface.SANS_SERIF, i2);
            case "monospace":
                return Typeface.create(Typeface.MONOSPACE, i2);
            case "fantasy":
                return Typeface.create(Typeface.SANS_SERIF, i2);
            case "serif":
                return Typeface.create(Typeface.SERIF, i2);
            case "cursive":
                return Typeface.create(Typeface.SANS_SERIF, i2);
            default:
                return null;
        }
    }

    public static int j(int i, float f) {
        int i2 = 255;
        int iRound = Math.round(((i >> 24) & 255) * f);
        if (iRound < 0) {
            i2 = 0;
        } else if (iRound <= 255) {
            i2 = iRound;
        }
        return (i & 16777215) | (i2 << 24);
    }

    public static void p(String str, Object... objArr) {
        Log.e("SVGAndroidRenderer", String.format(str, objArr));
    }

    public static void r(i0f i0fVar, String str) {
        h1f h1fVarT = i0fVar.a.T(str);
        if (h1fVarT == null) {
            Log.w("SVGAndroidRenderer", "Gradient reference '" + str + "' not found");
            return;
        }
        if (!(h1fVarT instanceof i0f)) {
            p("Gradient href attributes must point to other gradient elements", new Object[0]);
            return;
        }
        if (h1fVarT == i0fVar) {
            p("Circular reference in gradient href attribute '%s'", str);
            return;
        }
        i0f i0fVar2 = (i0f) h1fVarT;
        if (i0fVar.i == null) {
            i0fVar.i = i0fVar2.i;
        }
        if (i0fVar.j == null) {
            i0fVar.j = i0fVar2.j;
        }
        if (i0fVar.k == 0) {
            i0fVar.k = i0fVar2.k;
        }
        if (i0fVar.h.isEmpty()) {
            i0fVar.h = i0fVar2.h;
        }
        try {
            if (i0fVar instanceof i1f) {
                i1f i1fVar = (i1f) i0fVar;
                i1f i1fVar2 = (i1f) h1fVarT;
                if (i1fVar.m == null) {
                    i1fVar.m = i1fVar2.m;
                }
                if (i1fVar.n == null) {
                    i1fVar.n = i1fVar2.n;
                }
                if (i1fVar.o == null) {
                    i1fVar.o = i1fVar2.o;
                }
                if (i1fVar.p == null) {
                    i1fVar.p = i1fVar2.p;
                }
            } else {
                s((m1f) i0fVar, (m1f) h1fVarT);
            }
        } catch (ClassCastException unused) {
        }
        String str2 = i0fVar2.l;
        if (str2 != null) {
            r(i0fVar, str2);
        }
    }

    public static void s(m1f m1fVar, m1f m1fVar2) {
        if (m1fVar.m == null) {
            m1fVar.m = m1fVar2.m;
        }
        if (m1fVar.n == null) {
            m1fVar.n = m1fVar2.n;
        }
        if (m1fVar.o == null) {
            m1fVar.o = m1fVar2.o;
        }
        if (m1fVar.p == null) {
            m1fVar.p = m1fVar2.p;
        }
        if (m1fVar.q == null) {
            m1fVar.q = m1fVar2.q;
        }
    }

    public static void t(v0f v0fVar, String str) {
        h1f h1fVarT = v0fVar.a.T(str);
        if (h1fVarT == null) {
            Log.w("SVGAndroidRenderer", "Pattern reference '" + str + "' not found");
            return;
        }
        if (!(h1fVarT instanceof v0f)) {
            p("Pattern href attributes must point to other pattern elements", new Object[0]);
            return;
        }
        if (h1fVarT == v0fVar) {
            p("Circular reference in pattern href attribute '%s'", str);
            return;
        }
        v0f v0fVar2 = (v0f) h1fVarT;
        if (v0fVar.p == null) {
            v0fVar.p = v0fVar2.p;
        }
        if (v0fVar.q == null) {
            v0fVar.q = v0fVar2.q;
        }
        if (v0fVar.r == null) {
            v0fVar.r = v0fVar2.r;
        }
        if (v0fVar.s == null) {
            v0fVar.s = v0fVar2.s;
        }
        if (v0fVar.t == null) {
            v0fVar.t = v0fVar2.t;
        }
        if (v0fVar.u == null) {
            v0fVar.u = v0fVar2.u;
        }
        if (v0fVar.v == null) {
            v0fVar.v = v0fVar2.v;
        }
        if (v0fVar.i.isEmpty()) {
            v0fVar.i = v0fVar2.i;
        }
        if (v0fVar.o == null) {
            v0fVar.o = v0fVar2.o;
        }
        if (v0fVar.n == null) {
            v0fVar.n = v0fVar2.n;
        }
        String str2 = v0fVar2.w;
        if (str2 != null) {
            t(v0fVar, str2);
        }
    }

    public static boolean x(b1f b1fVar, long j) {
        return (b1fVar.E & j) != 0;
    }

    public Path A(h0f h0fVar) {
        float f;
        n0f n0fVar = h0fVar.o;
        float f2 = MTTypesetterKt.kLineSkipLimitMultiplier;
        float fD = n0fVar != null ? n0fVar.d(this) : 0.0f;
        n0f n0fVar2 = h0fVar.p;
        if (n0fVar2 != null) {
            f2 = n0fVar2.f(this);
        }
        float f3 = f2;
        float fD2 = h0fVar.q.d(this);
        float f4 = h0fVar.r.f(this);
        float f5 = fD - fD2;
        float f6 = f3 - f4;
        float f7 = fD + fD2;
        float f8 = f3 + f4;
        if (h0fVar.h == null) {
            f = f5;
            h0fVar.h = new sp0(f5, f6, fD2 * 2.0f, 2.0f * f4, 2);
        } else {
            f = f5;
        }
        float f9 = fD2 * 0.5522848f;
        float f10 = f4 * 0.5522848f;
        Path path = new Path();
        path.moveTo(fD, f6);
        float f11 = fD + f9;
        float f12 = f3 - f10;
        path.cubicTo(f11, f6, f7, f12, f7, f3);
        float f13 = f3 + f10;
        path.cubicTo(f7, f13, f11, f8, fD, f8);
        float f14 = fD - f9;
        path.cubicTo(f14, f8, f, f13, f, f3);
        path.cubicTo(f, f12, f14, f6, fD, f6);
        path.close();
        return path;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.graphics.Path C(defpackage.y0f r20) {
        /*
            Method dump skipped, instruction units count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h2f.C(y0f):android.graphics.Path");
    }

    public sp0 D(n0f n0fVar, n0f n0fVar2, n0f n0fVar3, n0f n0fVar4) {
        float f = MTTypesetterKt.kLineSkipLimitMultiplier;
        float fD = n0fVar != null ? n0fVar.d(this) : 0.0f;
        if (n0fVar2 != null) {
            f = n0fVar2.f(this);
        }
        float f2 = f;
        f2f f2fVar = (f2f) this.d;
        sp0 sp0Var = f2fVar.g;
        if (sp0Var == null) {
            sp0Var = f2fVar.f;
        }
        return new sp0(fD, f2, n0fVar3 != null ? n0fVar3.d(this) : sp0Var.d, n0fVar4 != null ? n0fVar4.f(this) : sp0Var.e, 2);
    }

    public Path E(g1f g1fVar, boolean z) {
        Path path;
        Path pathE;
        Path pathC;
        ((Stack) this.e).push((f2f) this.d);
        f2f f2fVar = new f2f((f2f) this.d);
        this.d = f2fVar;
        V(f2fVar, g1fVar);
        if (!l() || !X()) {
            this.d = (f2f) ((Stack) this.e).pop();
            return null;
        }
        if (g1fVar instanceof y1f) {
            if (!z) {
                p("<use> elements inside a <clipPath> cannot reference another <use>", new Object[0]);
            }
            y1f y1fVar = (y1f) g1fVar;
            h1f h1fVarT = g1fVar.a.T(y1fVar.o);
            if (h1fVarT == null) {
                p("Use reference '%s' not found", y1fVar.o);
                this.d = (f2f) ((Stack) this.e).pop();
                return null;
            }
            if (!(h1fVarT instanceof g1f)) {
                this.d = (f2f) ((Stack) this.e).pop();
                return null;
            }
            pathE = E((g1f) h1fVarT, false);
            if (pathE != null) {
                if (y1fVar.h == null) {
                    y1fVar.h = d(pathE);
                }
                Matrix matrix = y1fVar.n;
                if (matrix != null) {
                    pathE.transform(matrix);
                }
                if (((f2f) this.d).a.b0 != null && (pathC = c(g1fVar, g1fVar.h)) != null) {
                    pathE.op(pathC, Path.Op.INTERSECT);
                }
                this.d = (f2f) ((Stack) this.e).pop();
                return pathE;
            }
            return null;
        }
        if (g1fVar instanceof j0f) {
            j0f j0fVar = (j0f) g1fVar;
            if (g1fVar instanceof t0f) {
                b2f b2fVar = new b2f(((t0f) g1fVar).o);
                sp0 sp0Var = g1fVar.h;
                Path path2 = b2fVar.a;
                if (sp0Var == null) {
                    g1fVar.h = d(path2);
                }
                path = path2;
            } else {
                path = g1fVar instanceof y0f ? C((y0f) g1fVar) : g1fVar instanceof c0f ? z((c0f) g1fVar) : g1fVar instanceof h0f ? A((h0f) g1fVar) : g1fVar instanceof w0f ? B((w0f) g1fVar) : null;
            }
            if (path != null) {
                if (j0fVar.h == null) {
                    j0fVar.h = d(path);
                }
                Matrix matrix2 = j0fVar.n;
                if (matrix2 != null) {
                    path.transform(matrix2);
                }
                int i = ((f2f) this.d).a.o0;
                path.setFillType((i == 0 || i != 2) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
            }
            return null;
        }
        if (!(g1fVar instanceof s1f)) {
            p("Invalid %s element found in clipPath definition", g1fVar.o());
            return null;
        }
        s1f s1fVar = (s1f) g1fVar;
        ArrayList arrayList = s1fVar.n;
        float f = MTTypesetterKt.kLineSkipLimitMultiplier;
        float fD = (arrayList == null || arrayList.size() == 0) ? 0.0f : ((n0f) s1fVar.n.get(0)).d(this);
        ArrayList arrayList2 = s1fVar.o;
        float f2 = (arrayList2 == null || arrayList2.size() == 0) ? 0.0f : ((n0f) s1fVar.o.get(0)).f(this);
        ArrayList arrayList3 = s1fVar.p;
        float fD2 = (arrayList3 == null || arrayList3.size() == 0) ? 0.0f : ((n0f) s1fVar.p.get(0)).d(this);
        ArrayList arrayList4 = s1fVar.q;
        if (arrayList4 != null && arrayList4.size() != 0) {
            f = ((n0f) s1fVar.q.get(0)).f(this);
        }
        if (((f2f) this.d).a.n0 != 1) {
            float fE = e(s1fVar);
            if (((f2f) this.d).a.n0 == 2) {
                fE /= 2.0f;
            }
            fD -= fE;
        }
        if (s1fVar.h == null) {
            e2f e2fVar = new e2f(this, fD, f2);
            o(s1fVar, e2fVar);
            Object obj = e2fVar.g;
            RectF rectF = (RectF) obj;
            s1fVar.h = new sp0(rectF.left, rectF.top, rectF.width(), ((RectF) obj).height(), 2);
        }
        path = new Path();
        o(s1fVar, new e2f(this, fD + fD2, f2 + f, path));
        Matrix matrix3 = s1fVar.r;
        if (matrix3 != null) {
            path.transform(matrix3);
        }
        int i2 = ((f2f) this.d).a.o0;
        path.setFillType((i2 == 0 || i2 != 2) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
        pathE = path;
        if (((f2f) this.d).a.b0 != null) {
            pathE.op(pathC, Path.Op.INTERSECT);
        }
        this.d = (f2f) ((Stack) this.e).pop();
        return pathE;
    }

    public void F(sp0 sp0Var) {
        Canvas canvas = (Canvas) this.b;
        if (((f2f) this.d).a.c0 != null) {
            Paint paint = new Paint();
            PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
            paint.setXfermode(new PorterDuffXfermode(mode));
            canvas.saveLayer(null, paint, 31);
            Paint paint2 = new Paint();
            paint2.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(new float[]{MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 0.2127f, 0.7151f, 0.0722f, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier})));
            canvas.saveLayer(null, paint2, 31);
            q0f q0fVar = (q0f) ((lrb) this.c).T(((f2f) this.d).a.c0);
            N(q0fVar, sp0Var);
            canvas.restore();
            Paint paint3 = new Paint();
            paint3.setXfermode(new PorterDuffXfermode(mode));
            canvas.saveLayer(null, paint3, 31);
            N(q0fVar, sp0Var);
            canvas.restore();
            canvas.restore();
        }
        Q();
    }

    public boolean G() {
        h1f h1fVarT;
        int i = 0;
        if (((f2f) this.d).a.N.floatValue() >= 1.0f && ((f2f) this.d).a.c0 == null) {
            return false;
        }
        Canvas canvas = (Canvas) this.b;
        int iFloatValue = (int) (((f2f) this.d).a.N.floatValue() * 256.0f);
        if (iFloatValue >= 0) {
            i = 255;
            if (iFloatValue <= 255) {
                i = iFloatValue;
            }
        }
        canvas.saveLayerAlpha(null, i, 31);
        ((Stack) this.e).push((f2f) this.d);
        f2f f2fVar = new f2f((f2f) this.d);
        this.d = f2fVar;
        String str = f2fVar.a.c0;
        if (str != null && ((h1fVarT = ((lrb) this.c).T(str)) == null || !(h1fVarT instanceof q0f))) {
            p("Mask reference '%s' not found", ((f2f) this.d).a.c0);
            ((f2f) this.d).a.c0 = null;
        }
        return true;
    }

    public void H() {
        try {
            RealBufferedSource realBufferedSource = new RealBufferedSource(y());
            try {
                ByteString byteStringT = realBufferedSource.t(realBufferedSource.readInt());
                ByteString byteStringT2 = realBufferedSource.t(realBufferedSource.readInt());
                realBufferedSource.close();
                synchronized (this) {
                    byteStringT.getClass();
                    this.d = byteStringT;
                    byteStringT2.getClass();
                    this.e = byteStringT2;
                }
            } finally {
            }
        } finally {
            ((CountDownLatch) this.c).countDown();
        }
    }

    public void I(c1f c1fVar, sp0 sp0Var, sp0 sp0Var2, gdd gddVar) {
        if (sp0Var.d == MTTypesetterKt.kLineSkipLimitMultiplier || sp0Var.e == MTTypesetterKt.kLineSkipLimitMultiplier) {
            return;
        }
        if (gddVar == null && (gddVar = c1fVar.n) == null) {
            gddVar = gdd.d;
        }
        V((f2f) this.d, c1fVar);
        if (l()) {
            f2f f2fVar = (f2f) this.d;
            f2fVar.f = sp0Var;
            if (!f2fVar.a.S.booleanValue()) {
                sp0 sp0Var3 = ((f2f) this.d).f;
                O(sp0Var3.b, sp0Var3.c, sp0Var3.d, sp0Var3.e);
            }
            g(c1fVar, ((f2f) this.d).f);
            Canvas canvas = (Canvas) this.b;
            f2f f2fVar2 = (f2f) this.d;
            if (sp0Var2 != null) {
                canvas.concat(f(f2fVar2.f, sp0Var2, gddVar));
                ((f2f) this.d).g = c1fVar.o;
            } else {
                sp0 sp0Var4 = f2fVar2.f;
                canvas.translate(sp0Var4.b, sp0Var4.c);
            }
            boolean zG = G();
            W();
            K(c1fVar, true);
            if (zG) {
                F(c1fVar.h);
            }
            T(c1fVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void J(j1f j1fVar) {
        n0f n0fVar;
        String str;
        int iIndexOf;
        Set setB;
        n0f n0fVar2;
        Boolean bool;
        if (j1fVar instanceof r0f) {
            return;
        }
        R();
        if ((j1fVar instanceof h1f) && (bool = ((h1f) j1fVar).d) != null) {
            ((f2f) this.d).h = bool.booleanValue();
        }
        if (j1fVar instanceof c1f) {
            c1f c1fVar = (c1f) j1fVar;
            I(c1fVar, D(c1fVar.p, c1fVar.q, c1fVar.r, c1fVar.s), c1fVar.o, c1fVar.n);
        } else {
            boolean z = j1fVar instanceof y1f;
            Bitmap bitmapDecodeByteArray = null;
            float f = MTTypesetterKt.kLineSkipLimitMultiplier;
            if (z) {
                y1f y1fVar = (y1f) j1fVar;
                Canvas canvas = (Canvas) this.b;
                n0f n0fVar3 = y1fVar.r;
                if ((n0fVar3 == null || !n0fVar3.h()) && ((n0fVar2 = y1fVar.s) == null || !n0fVar2.h())) {
                    V((f2f) this.d, y1fVar);
                    if (l()) {
                        j1f j1fVarT = y1fVar.a.T(y1fVar.o);
                        if (j1fVarT == null) {
                            p("Use reference '%s' not found", y1fVar.o);
                        } else {
                            Matrix matrix = y1fVar.n;
                            if (matrix != null) {
                                canvas.concat(matrix);
                            }
                            n0f n0fVar4 = y1fVar.p;
                            float fD = n0fVar4 != null ? n0fVar4.d(this) : 0.0f;
                            n0f n0fVar5 = y1fVar.q;
                            canvas.translate(fD, n0fVar5 != null ? n0fVar5.f(this) : 0.0f);
                            g(y1fVar, y1fVar.h);
                            boolean zG = G();
                            ((Stack) this.f).push(y1fVar);
                            ((Stack) this.g).push(((Canvas) this.b).getMatrix());
                            if (j1fVarT instanceof c1f) {
                                c1f c1fVar2 = (c1f) j1fVarT;
                                sp0 sp0VarD = D(null, null, y1fVar.r, y1fVar.s);
                                R();
                                I(c1fVar2, sp0VarD, c1fVar2.o, c1fVar2.n);
                                Q();
                            } else if (j1fVarT instanceof p1f) {
                                n0f n0fVar6 = y1fVar.r;
                                if (n0fVar6 == null) {
                                    n0fVar6 = new n0f(9, 100.0f);
                                }
                                n0f n0fVar7 = y1fVar.s;
                                if (n0fVar7 == null) {
                                    n0fVar7 = new n0f(9, 100.0f);
                                }
                                sp0 sp0VarD2 = D(null, null, n0fVar6, n0fVar7);
                                R();
                                p1f p1fVar = (p1f) j1fVarT;
                                if (sp0VarD2.d != MTTypesetterKt.kLineSkipLimitMultiplier && sp0VarD2.e != MTTypesetterKt.kLineSkipLimitMultiplier) {
                                    gdd gddVar = p1fVar.n;
                                    if (gddVar == null) {
                                        gddVar = gdd.d;
                                    }
                                    V((f2f) this.d, p1fVar);
                                    f2f f2fVar = (f2f) this.d;
                                    f2fVar.f = sp0VarD2;
                                    if (!f2fVar.a.S.booleanValue()) {
                                        sp0 sp0Var = ((f2f) this.d).f;
                                        O(sp0Var.b, sp0Var.c, sp0Var.d, sp0Var.e);
                                    }
                                    sp0 sp0Var2 = p1fVar.o;
                                    f2f f2fVar2 = (f2f) this.d;
                                    if (sp0Var2 != null) {
                                        canvas.concat(f(f2fVar2.f, sp0Var2, gddVar));
                                        ((f2f) this.d).g = p1fVar.o;
                                    } else {
                                        sp0 sp0Var3 = f2fVar2.f;
                                        canvas.translate(sp0Var3.b, sp0Var3.c);
                                    }
                                    boolean zG2 = G();
                                    K(p1fVar, true);
                                    if (zG2) {
                                        F(p1fVar.h);
                                    }
                                    T(p1fVar);
                                }
                                Q();
                            } else {
                                J(j1fVarT);
                            }
                            ((Stack) this.f).pop();
                            ((Stack) this.g).pop();
                            if (zG) {
                                F(y1fVar.h);
                            }
                            T(y1fVar);
                        }
                    }
                }
            } else if (j1fVar instanceof o1f) {
                o1f o1fVar = (o1f) j1fVar;
                V((f2f) this.d, o1fVar);
                if (l()) {
                    Matrix matrix2 = o1fVar.n;
                    if (matrix2 != null) {
                        ((Canvas) this.b).concat(matrix2);
                    }
                    g(o1fVar, o1fVar.h);
                    boolean zG3 = G();
                    String language = Locale.getDefault().getLanguage();
                    Iterator it = o1fVar.i.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        j1f j1fVar2 = (j1f) it.next();
                        if (j1fVar2 instanceof d1f) {
                            d1f d1fVar = (d1f) j1fVar2;
                            if (d1fVar.c() == null && ((setB = d1fVar.b()) == null || (!setB.isEmpty() && setB.contains(language)))) {
                                Set setG = d1fVar.g();
                                if (setG != null) {
                                    if (h == null) {
                                        synchronized (h2f.class) {
                                            HashSet hashSet = new HashSet();
                                            h = hashSet;
                                            hashSet.add("Structure");
                                            h.add("BasicStructure");
                                            h.add("ConditionalProcessing");
                                            h.add("Image");
                                            h.add("Style");
                                            h.add("ViewportAttribute");
                                            h.add("Shape");
                                            h.add("BasicText");
                                            h.add("PaintAttribute");
                                            h.add("BasicPaintAttribute");
                                            h.add("OpacityAttribute");
                                            h.add("BasicGraphicsAttribute");
                                            h.add("Marker");
                                            h.add("Gradient");
                                            h.add("Pattern");
                                            h.add("Clip");
                                            h.add("BasicClip");
                                            h.add("Mask");
                                            h.add("View");
                                        }
                                    }
                                    if (setG.isEmpty() || !h.containsAll(setG)) {
                                    }
                                }
                                Set setM = d1fVar.m();
                                if (setM == null) {
                                    Set setN = d1fVar.n();
                                    if (setN == null) {
                                        J(j1fVar2);
                                        break;
                                    }
                                    setN.isEmpty();
                                } else {
                                    setM.isEmpty();
                                }
                            }
                        }
                    }
                    if (zG3) {
                        F(o1fVar.h);
                    }
                    T(o1fVar);
                }
            } else if (j1fVar instanceof k0f) {
                k0f k0fVar = (k0f) j1fVar;
                V((f2f) this.d, k0fVar);
                if (l()) {
                    Matrix matrix3 = k0fVar.n;
                    if (matrix3 != null) {
                        ((Canvas) this.b).concat(matrix3);
                    }
                    g(k0fVar, k0fVar.h);
                    boolean zG4 = G();
                    K(k0fVar, true);
                    if (zG4) {
                        F(k0fVar.h);
                    }
                    T(k0fVar);
                }
            } else {
                if (j1fVar instanceof m0f) {
                    m0f m0fVar = (m0f) j1fVar;
                    Canvas canvas2 = (Canvas) this.b;
                    n0f n0fVar8 = m0fVar.r;
                    if (n0fVar8 != null && !n0fVar8.h() && (n0fVar = m0fVar.s) != null && !n0fVar.h() && (str = m0fVar.o) != null) {
                        gdd gddVar2 = m0fVar.n;
                        if (gddVar2 == null) {
                            gddVar2 = gdd.d;
                        }
                        gdd gddVar3 = gddVar2;
                        if (str.startsWith("data:") && str.length() >= 14 && (iIndexOf = str.indexOf(44)) >= 12 && ";base64".equals(str.substring(iIndexOf - 7, iIndexOf))) {
                            try {
                                byte[] bArrDecode = Base64.decode(str.substring(iIndexOf + 1), 0);
                                bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                            } catch (Exception e) {
                                Log.e("SVGAndroidRenderer", "Could not decode bad Data URL", e);
                            }
                        }
                        if (bitmapDecodeByteArray != null) {
                            sp0 sp0Var4 = new sp0(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight(), 2);
                            V((f2f) this.d, m0fVar);
                            if (l() && X()) {
                                Matrix matrix4 = m0fVar.t;
                                if (matrix4 != null) {
                                    canvas2.concat(matrix4);
                                }
                                n0f n0fVar9 = m0fVar.p;
                                float fD2 = n0fVar9 != null ? n0fVar9.d(this) : 0.0f;
                                n0f n0fVar10 = m0fVar.q;
                                float f2 = n0fVar10 != null ? n0fVar10.f(this) : 0.0f;
                                float fD3 = m0fVar.r.d(this);
                                float fD4 = m0fVar.s.d(this);
                                f2f f2fVar3 = (f2f) this.d;
                                f2fVar3.f = new sp0(fD2, f2, fD3, fD4, 2);
                                if (!f2fVar3.a.S.booleanValue()) {
                                    sp0 sp0Var5 = ((f2f) this.d).f;
                                    O(sp0Var5.b, sp0Var5.c, sp0Var5.d, sp0Var5.e);
                                }
                                m0fVar.h = ((f2f) this.d).f;
                                T(m0fVar);
                                g(m0fVar, m0fVar.h);
                                boolean zG5 = G();
                                W();
                                canvas2.save();
                                canvas2.concat(f(((f2f) this.d).f, sp0Var4, gddVar3));
                                canvas2.drawBitmap(bitmapDecodeByteArray, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, new Paint(((f2f) this.d).a.q0 != 3 ? 2 : 0));
                                canvas2.restore();
                                if (zG5) {
                                    F(m0fVar.h);
                                }
                            }
                        }
                    }
                } else if (j1fVar instanceof t0f) {
                    t0f t0fVar = (t0f) j1fVar;
                    if (t0fVar.o != null) {
                        V((f2f) this.d, t0fVar);
                        if (l() && X()) {
                            f2f f2fVar4 = (f2f) this.d;
                            if (f2fVar4.c || f2fVar4.b) {
                                Matrix matrix5 = t0fVar.n;
                                if (matrix5 != null) {
                                    ((Canvas) this.b).concat(matrix5);
                                }
                                Path path = new b2f(t0fVar.o).a;
                                if (t0fVar.h == null) {
                                    t0fVar.h = d(path);
                                }
                                T(t0fVar);
                                h(t0fVar);
                                g(t0fVar, t0fVar.h);
                                boolean zG6 = G();
                                f2f f2fVar5 = (f2f) this.d;
                                if (f2fVar5.b) {
                                    int i = f2fVar5.a.h0;
                                    path.setFillType((i == 0 || i != 2) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                    m(t0fVar, path);
                                }
                                if (((f2f) this.d).c) {
                                    n(path);
                                }
                                M(t0fVar);
                                if (zG6) {
                                    F(t0fVar.h);
                                }
                            }
                        }
                    }
                } else if (j1fVar instanceof y0f) {
                    y0f y0fVar = (y0f) j1fVar;
                    n0f n0fVar11 = y0fVar.q;
                    if (n0fVar11 != null && y0fVar.r != null && !n0fVar11.h() && !y0fVar.r.h()) {
                        V((f2f) this.d, y0fVar);
                        if (l() && X()) {
                            Matrix matrix6 = y0fVar.n;
                            if (matrix6 != null) {
                                ((Canvas) this.b).concat(matrix6);
                            }
                            Path pathC = C(y0fVar);
                            T(y0fVar);
                            h(y0fVar);
                            g(y0fVar, y0fVar.h);
                            boolean zG7 = G();
                            if (((f2f) this.d).b) {
                                m(y0fVar, pathC);
                            }
                            if (((f2f) this.d).c) {
                                n(pathC);
                            }
                            if (zG7) {
                                F(y0fVar.h);
                            }
                        }
                    }
                } else if (j1fVar instanceof c0f) {
                    c0f c0fVar = (c0f) j1fVar;
                    n0f n0fVar12 = c0fVar.q;
                    if (n0fVar12 != null && !n0fVar12.h()) {
                        V((f2f) this.d, c0fVar);
                        if (l() && X()) {
                            Matrix matrix7 = c0fVar.n;
                            if (matrix7 != null) {
                                ((Canvas) this.b).concat(matrix7);
                            }
                            Path pathZ = z(c0fVar);
                            T(c0fVar);
                            h(c0fVar);
                            g(c0fVar, c0fVar.h);
                            boolean zG8 = G();
                            if (((f2f) this.d).b) {
                                m(c0fVar, pathZ);
                            }
                            if (((f2f) this.d).c) {
                                n(pathZ);
                            }
                            if (zG8) {
                                F(c0fVar.h);
                            }
                        }
                    }
                } else if (j1fVar instanceof h0f) {
                    h0f h0fVar = (h0f) j1fVar;
                    n0f n0fVar13 = h0fVar.q;
                    if (n0fVar13 != null && h0fVar.r != null && !n0fVar13.h() && !h0fVar.r.h()) {
                        V((f2f) this.d, h0fVar);
                        if (l() && X()) {
                            Matrix matrix8 = h0fVar.n;
                            if (matrix8 != null) {
                                ((Canvas) this.b).concat(matrix8);
                            }
                            Path pathA = A(h0fVar);
                            T(h0fVar);
                            h(h0fVar);
                            g(h0fVar, h0fVar.h);
                            boolean zG9 = G();
                            if (((f2f) this.d).b) {
                                m(h0fVar, pathA);
                            }
                            if (((f2f) this.d).c) {
                                n(pathA);
                            }
                            if (zG9) {
                                F(h0fVar.h);
                            }
                        }
                    }
                } else if (j1fVar instanceof o0f) {
                    o0f o0fVar = (o0f) j1fVar;
                    V((f2f) this.d, o0fVar);
                    if (l() && X() && ((f2f) this.d).c) {
                        Matrix matrix9 = o0fVar.n;
                        if (matrix9 != null) {
                            ((Canvas) this.b).concat(matrix9);
                        }
                        n0f n0fVar14 = o0fVar.o;
                        float fD5 = n0fVar14 == null ? 0.0f : n0fVar14.d(this);
                        n0f n0fVar15 = o0fVar.p;
                        float f3 = n0fVar15 == null ? 0.0f : n0fVar15.f(this);
                        n0f n0fVar16 = o0fVar.q;
                        float fD6 = n0fVar16 == null ? 0.0f : n0fVar16.d(this);
                        n0f n0fVar17 = o0fVar.r;
                        if (n0fVar17 != null) {
                            f = n0fVar17.f(this);
                        }
                        if (o0fVar.h == null) {
                            o0fVar.h = new sp0(Math.min(fD5, fD6), Math.min(f3, f), Math.abs(fD6 - fD5), Math.abs(f - f3), 2);
                        }
                        Path path2 = new Path();
                        path2.moveTo(fD5, f3);
                        path2.lineTo(fD6, f);
                        T(o0fVar);
                        h(o0fVar);
                        g(o0fVar, o0fVar.h);
                        boolean zG10 = G();
                        n(path2);
                        M(o0fVar);
                        if (zG10) {
                            F(o0fVar.h);
                        }
                    }
                } else if (j1fVar instanceof x0f) {
                    x0f x0fVar = (x0f) j1fVar;
                    V((f2f) this.d, x0fVar);
                    if (l() && X()) {
                        f2f f2fVar6 = (f2f) this.d;
                        if (f2fVar6.c || f2fVar6.b) {
                            Matrix matrix10 = x0fVar.n;
                            if (matrix10 != null) {
                                ((Canvas) this.b).concat(matrix10);
                            }
                            if (x0fVar.o.length >= 2) {
                                Path pathB = B(x0fVar);
                                T(x0fVar);
                                h(x0fVar);
                                g(x0fVar, x0fVar.h);
                                boolean zG11 = G();
                                if (((f2f) this.d).b) {
                                    m(x0fVar, pathB);
                                }
                                if (((f2f) this.d).c) {
                                    n(pathB);
                                }
                                M(x0fVar);
                                if (zG11) {
                                    F(x0fVar.h);
                                }
                            }
                        }
                    }
                } else if (j1fVar instanceof w0f) {
                    w0f w0fVar = (w0f) j1fVar;
                    V((f2f) this.d, w0fVar);
                    if (l() && X()) {
                        f2f f2fVar7 = (f2f) this.d;
                        if (f2fVar7.c || f2fVar7.b) {
                            Matrix matrix11 = w0fVar.n;
                            if (matrix11 != null) {
                                ((Canvas) this.b).concat(matrix11);
                            }
                            if (w0fVar.o.length >= 2) {
                                Path pathB2 = B(w0fVar);
                                T(w0fVar);
                                int i2 = ((f2f) this.d).a.h0;
                                pathB2.setFillType((i2 == 0 || i2 != 2) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                h(w0fVar);
                                g(w0fVar, w0fVar.h);
                                boolean zG12 = G();
                                if (((f2f) this.d).b) {
                                    m(w0fVar, pathB2);
                                }
                                if (((f2f) this.d).c) {
                                    n(pathB2);
                                }
                                M(w0fVar);
                                if (zG12) {
                                    F(w0fVar.h);
                                }
                            }
                        }
                    }
                } else if (j1fVar instanceof s1f) {
                    s1f s1fVar = (s1f) j1fVar;
                    V((f2f) this.d, s1fVar);
                    if (l()) {
                        Matrix matrix12 = s1fVar.r;
                        if (matrix12 != null) {
                            ((Canvas) this.b).concat(matrix12);
                        }
                        ArrayList arrayList = s1fVar.n;
                        float fD7 = (arrayList == null || arrayList.size() == 0) ? 0.0f : ((n0f) s1fVar.n.get(0)).d(this);
                        ArrayList arrayList2 = s1fVar.o;
                        float f4 = (arrayList2 == null || arrayList2.size() == 0) ? 0.0f : ((n0f) s1fVar.o.get(0)).f(this);
                        ArrayList arrayList3 = s1fVar.p;
                        float fD8 = (arrayList3 == null || arrayList3.size() == 0) ? 0.0f : ((n0f) s1fVar.p.get(0)).d(this);
                        ArrayList arrayList4 = s1fVar.q;
                        if (arrayList4 != null && arrayList4.size() != 0) {
                            f = ((n0f) s1fVar.q.get(0)).f(this);
                        }
                        int iW = w();
                        if (iW != 1) {
                            float fE = e(s1fVar);
                            if (iW == 2) {
                                fE /= 2.0f;
                            }
                            fD7 -= fE;
                        }
                        if (s1fVar.h == null) {
                            e2f e2fVar = new e2f(this, fD7, f4);
                            o(s1fVar, e2fVar);
                            RectF rectF = (RectF) e2fVar.g;
                            s1fVar.h = new sp0(rectF.left, rectF.top, rectF.width(), ((RectF) e2fVar.g).height(), 2);
                        }
                        T(s1fVar);
                        h(s1fVar);
                        g(s1fVar, s1fVar.h);
                        boolean zG13 = G();
                        o(s1fVar, new d2f(this, fD7 + fD8, f4 + f));
                        if (zG13) {
                            F(s1fVar.h);
                        }
                    }
                }
            }
        }
        Q();
    }

    public void K(e1f e1fVar, boolean z) {
        if (z) {
            ((Stack) this.f).push(e1fVar);
            ((Stack) this.g).push(((Canvas) this.b).getMatrix());
        }
        Iterator it = e1fVar.i.iterator();
        while (it.hasNext()) {
            J((j1f) it.next());
        }
        if (z) {
            ((Stack) this.f).pop();
            ((Stack) this.g).pop();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ff A[PHI: r2
      0x00ff: PHI (r2v1 float) = (r2v0 float), (r2v2 float) binds: [B:63:0x00f3, B:66:0x00f9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x010d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void L(defpackage.p0f r13, defpackage.a2f r14) {
        /*
            Method dump skipped, instruction units count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h2f.L(p0f, a2f):void");
    }

    public void M(j0f j0fVar) {
        p0f p0fVar;
        p0f p0fVar2;
        p0f p0fVar3;
        int i;
        float f;
        float f2;
        float f3;
        ArrayList arrayList;
        int size;
        b1f b1fVar = ((f2f) this.d).a;
        String str = b1fVar.U;
        if (str == null && b1fVar.V == null && b1fVar.W == null) {
            return;
        }
        if (str == null) {
            p0fVar = null;
        } else {
            h1f h1fVarT = j0fVar.a.T(str);
            if (h1fVarT != null) {
                p0fVar = (p0f) h1fVarT;
            } else {
                p("Marker reference '%s' not found", ((f2f) this.d).a.U);
                p0fVar = null;
            }
        }
        String str2 = ((f2f) this.d).a.V;
        if (str2 == null) {
            p0fVar2 = null;
        } else {
            h1f h1fVarT2 = j0fVar.a.T(str2);
            if (h1fVarT2 != null) {
                p0fVar2 = (p0f) h1fVarT2;
            } else {
                p("Marker reference '%s' not found", ((f2f) this.d).a.V);
                p0fVar2 = null;
            }
        }
        String str3 = ((f2f) this.d).a.W;
        if (str3 == null) {
            p0fVar3 = null;
        } else {
            h1f h1fVarT3 = j0fVar.a.T(str3);
            if (h1fVarT3 != null) {
                p0fVar3 = (p0f) h1fVarT3;
            } else {
                p("Marker reference '%s' not found", ((f2f) this.d).a.W);
                p0fVar3 = null;
            }
        }
        boolean z = j0fVar instanceof t0f;
        float f4 = MTTypesetterKt.kLineSkipLimitMultiplier;
        if (z) {
            arrayList = (ArrayList) new u39(this, ((t0f) j0fVar).o).g;
            f2 = 0.0f;
            i = 1;
        } else if (j0fVar instanceof o0f) {
            o0f o0fVar = (o0f) j0fVar;
            n0f n0fVar = o0fVar.o;
            float fD = n0fVar != null ? n0fVar.d(this) : 0.0f;
            n0f n0fVar2 = o0fVar.p;
            float f5 = n0fVar2 != null ? n0fVar2.f(this) : 0.0f;
            n0f n0fVar3 = o0fVar.q;
            float fD2 = n0fVar3 != null ? n0fVar3.d(this) : 0.0f;
            n0f n0fVar4 = o0fVar.r;
            float f6 = n0fVar4 != null ? n0fVar4.f(this) : 0.0f;
            ArrayList arrayList2 = new ArrayList(2);
            float f7 = fD2 - fD;
            i = 1;
            float f8 = f6 - f5;
            arrayList2.add(new a2f(fD, f5, f7, f8));
            arrayList2.add(new a2f(fD2, f6, f7, f8));
            f2 = 0.0f;
            arrayList = arrayList2;
        } else {
            i = 1;
            w0f w0fVar = (w0f) j0fVar;
            int length = w0fVar.o.length;
            if (length < 2) {
                arrayList = null;
                f2 = 0.0f;
            } else {
                ArrayList arrayList3 = new ArrayList();
                float[] fArr = w0fVar.o;
                a2f a2fVar = new a2f(fArr[0], fArr[1], MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier);
                int i2 = 2;
                float f9 = 0.0f;
                float f10 = 0.0f;
                while (true) {
                    f = a2fVar.b;
                    f2 = f4;
                    f3 = a2fVar.a;
                    if (i2 >= length) {
                        break;
                    }
                    float[] fArr2 = w0fVar.o;
                    float f11 = fArr2[i2];
                    float f12 = fArr2[i2 + 1];
                    a2fVar.a(f11, f12);
                    arrayList3.add(a2fVar);
                    a2fVar = new a2f(f11, f12, f11 - f3, f12 - f);
                    i2 += 2;
                    f10 = f12;
                    f9 = f11;
                    f4 = f2;
                }
                if (w0fVar instanceof x0f) {
                    float[] fArr3 = w0fVar.o;
                    float f13 = fArr3[0];
                    if (f9 != f13) {
                        float f14 = fArr3[1];
                        if (f10 != f14) {
                            a2fVar.a(f13, f14);
                            arrayList3.add(a2fVar);
                            a2f a2fVar2 = new a2f(f13, f14, f13 - f3, f14 - f);
                            a2fVar2.b((a2f) arrayList3.get(0));
                            arrayList3.add(a2fVar2);
                            arrayList3.set(0, a2fVar2);
                        }
                    }
                } else {
                    arrayList3.add(a2fVar);
                }
                arrayList = arrayList3;
            }
        }
        if (arrayList == null || (size = arrayList.size()) == 0) {
            return;
        }
        b1f b1fVar2 = ((f2f) this.d).a;
        b1fVar2.W = null;
        b1fVar2.V = null;
        b1fVar2.U = null;
        if (p0fVar != null) {
            L(p0fVar, (a2f) arrayList.get(0));
        }
        if (p0fVar2 != null && arrayList.size() > 2) {
            a2f a2fVar3 = (a2f) arrayList.get(0);
            a2f a2fVar4 = (a2f) arrayList.get(i);
            int i3 = 1;
            while (i3 < size - 1) {
                i3++;
                a2f a2fVar5 = (a2f) arrayList.get(i3);
                if (a2fVar4.e) {
                    float f15 = a2fVar4.c;
                    float f16 = a2fVar4.d;
                    float f17 = a2fVar4.a;
                    float f18 = f17 - a2fVar3.a;
                    float f19 = a2fVar4.b;
                    float f20 = ((f19 - a2fVar3.b) * f16) + (f18 * f15);
                    if (f20 == f2) {
                        f20 = ((a2fVar5.a - f17) * f15) + ((a2fVar5.b - f19) * f16);
                    }
                    if (f20 <= f2 && (f20 != f2 || (f15 <= f2 && f16 < f2))) {
                        a2fVar4.c = -f15;
                        a2fVar4.d = -f16;
                    }
                }
                L(p0fVar2, a2fVar4);
                a2fVar3 = a2fVar4;
                a2fVar4 = a2fVar5;
            }
        }
        if (p0fVar3 != null) {
            L(p0fVar3, (a2f) arrayList.get(size - 1));
        }
    }

    public void N(q0f q0fVar, sp0 sp0Var) {
        float fD;
        float f;
        Canvas canvas = (Canvas) this.b;
        Boolean bool = q0fVar.n;
        if (bool == null || !bool.booleanValue()) {
            n0f n0fVar = q0fVar.p;
            float fB = n0fVar != null ? n0fVar.b(this, 1.0f) : 1.2f;
            n0f n0fVar2 = q0fVar.q;
            float fB2 = n0fVar2 != null ? n0fVar2.b(this, 1.0f) : 1.2f;
            fD = fB * sp0Var.d;
            f = fB2 * sp0Var.e;
        } else {
            n0f n0fVar3 = q0fVar.p;
            fD = n0fVar3 != null ? n0fVar3.d(this) : sp0Var.d;
            n0f n0fVar4 = q0fVar.q;
            f = n0fVar4 != null ? n0fVar4.f(this) : sp0Var.e;
        }
        if (fD == MTTypesetterKt.kLineSkipLimitMultiplier || f == MTTypesetterKt.kLineSkipLimitMultiplier) {
            return;
        }
        R();
        f2f f2fVarU = u(q0fVar);
        this.d = f2fVarU;
        f2fVarU.a.N = Float.valueOf(1.0f);
        boolean zG = G();
        canvas.save();
        Boolean bool2 = q0fVar.o;
        if (bool2 != null && !bool2.booleanValue()) {
            canvas.translate(sp0Var.b, sp0Var.c);
            canvas.scale(sp0Var.d, sp0Var.e);
        }
        K(q0fVar, false);
        canvas.restore();
        if (zG) {
            F(sp0Var);
        }
        Q();
    }

    public void O(float f, float f2, float f3, float f4) {
        float fD = f3 + f;
        float f5 = f4 + f2;
        c61 c61Var = ((f2f) this.d).a.T;
        if (c61Var != null) {
            f += ((n0f) c61Var.I).d(this);
            f2 += ((n0f) ((f2f) this.d).a.T.F).f(this);
            fD -= ((n0f) ((f2f) this.d).a.T.G).d(this);
            f5 -= ((n0f) ((f2f) this.d).a.T.H).f(this);
        }
        ((Canvas) this.b).clipRect(f, f2, fD, f5);
    }

    public void Q() {
        ((Canvas) this.b).restore();
        this.d = (f2f) ((Stack) this.e).pop();
    }

    public void R() {
        ((Canvas) this.b).save();
        ((Stack) this.e).push((f2f) this.d);
        this.d = new f2f((f2f) this.d);
    }

    public String S(String str, boolean z, boolean z2) {
        if (((f2f) this.d).h) {
            return str.replaceAll("[\\n\\t]", " ");
        }
        String strReplaceAll = str.replaceAll("\\n", "").replaceAll("\\t", " ");
        if (z) {
            strReplaceAll = strReplaceAll.replaceAll("^\\s+", "");
        }
        if (z2) {
            strReplaceAll = strReplaceAll.replaceAll("\\s+$", "");
        }
        return strReplaceAll.replaceAll("\\s{2,}", " ");
    }

    public void T(g1f g1fVar) {
        if (g1fVar.b == null || g1fVar.h == null) {
            return;
        }
        Matrix matrix = new Matrix();
        if (((Matrix) ((Stack) this.g).peek()).invert(matrix)) {
            sp0 sp0Var = g1fVar.h;
            float f = sp0Var.b;
            float f2 = sp0Var.c;
            float fG = sp0Var.g();
            sp0 sp0Var2 = g1fVar.h;
            float f3 = sp0Var2.c;
            float fG2 = sp0Var2.g();
            float fH = g1fVar.h.h();
            sp0 sp0Var3 = g1fVar.h;
            float[] fArr = {f, f2, fG, f3, fG2, fH, sp0Var3.b, sp0Var3.h()};
            matrix.preConcat(((Canvas) this.b).getMatrix());
            matrix.mapPoints(fArr);
            float f4 = fArr[0];
            float f5 = fArr[1];
            RectF rectF = new RectF(f4, f5, f4, f5);
            for (int i = 2; i <= 6; i += 2) {
                float f6 = fArr[i];
                if (f6 < rectF.left) {
                    rectF.left = f6;
                }
                if (f6 > rectF.right) {
                    rectF.right = f6;
                }
                float f7 = fArr[i + 1];
                if (f7 < rectF.top) {
                    rectF.top = f7;
                }
                if (f7 > rectF.bottom) {
                    rectF.bottom = f7;
                }
            }
            g1f g1fVar2 = (g1f) ((Stack) this.f).peek();
            sp0 sp0Var4 = g1fVar2.h;
            float f8 = rectF.left;
            float f9 = rectF.top;
            if (sp0Var4 == null) {
                g1fVar2.h = new sp0(f8, f9, rectF.right - f8, rectF.bottom - f9, 2);
                return;
            }
            float f10 = rectF.right - f8;
            float f11 = rectF.bottom - f9;
            if (f8 < sp0Var4.b) {
                sp0Var4.b = f8;
            }
            if (f9 < sp0Var4.c) {
                sp0Var4.c = f9;
            }
            if (f8 + f10 > sp0Var4.g()) {
                sp0Var4.d = (f8 + f10) - sp0Var4.b;
            }
            if (f9 + f11 > sp0Var4.h()) {
                sp0Var4.e = (f9 + f11) - sp0Var4.c;
            }
        }
    }

    public void U(f2f f2fVar, b1f b1fVar) {
        if (x(b1fVar, 4096L)) {
            f2fVar.a.O = b1fVar.O;
        }
        if (x(b1fVar, 2048L)) {
            f2fVar.a.N = b1fVar.N;
        }
        boolean zX = x(b1fVar, 1L);
        e0f e0fVar = e0f.G;
        if (zX) {
            f2fVar.a.F = b1fVar.F;
            k1f k1fVar = b1fVar.F;
            f2fVar.b = (k1fVar == null || k1fVar == e0fVar) ? false : true;
        }
        if (x(b1fVar, 4L)) {
            f2fVar.a.G = b1fVar.G;
        }
        if (x(b1fVar, 6149L)) {
            P(f2fVar, true, f2fVar.a.F);
        }
        if (x(b1fVar, 2L)) {
            f2fVar.a.h0 = b1fVar.h0;
        }
        if (x(b1fVar, 8L)) {
            f2fVar.a.H = b1fVar.H;
            k1f k1fVar2 = b1fVar.H;
            f2fVar.c = (k1fVar2 == null || k1fVar2 == e0fVar) ? false : true;
        }
        if (x(b1fVar, 16L)) {
            f2fVar.a.I = b1fVar.I;
        }
        if (x(b1fVar, 6168L)) {
            P(f2fVar, false, f2fVar.a.H);
        }
        if (x(b1fVar, 34359738368L)) {
            f2fVar.a.p0 = b1fVar.p0;
        }
        if (x(b1fVar, 32L)) {
            b1f b1fVar2 = f2fVar.a;
            n0f n0fVar = b1fVar.J;
            b1fVar2.J = n0fVar;
            f2fVar.e.setStrokeWidth(n0fVar.a(this));
        }
        if (x(b1fVar, 64L)) {
            b1f b1fVar3 = f2fVar.a;
            Paint paint = f2fVar.e;
            b1fVar3.i0 = b1fVar.i0;
            int iF = sq6.F(b1fVar.i0);
            if (iF == 0) {
                paint.setStrokeCap(Paint.Cap.BUTT);
            } else if (iF == 1) {
                paint.setStrokeCap(Paint.Cap.ROUND);
            } else if (iF == 2) {
                paint.setStrokeCap(Paint.Cap.SQUARE);
            }
        }
        if (x(b1fVar, 128L)) {
            b1f b1fVar4 = f2fVar.a;
            Paint paint2 = f2fVar.e;
            b1fVar4.j0 = b1fVar.j0;
            int iF2 = sq6.F(b1fVar.j0);
            if (iF2 == 0) {
                paint2.setStrokeJoin(Paint.Join.MITER);
            } else if (iF2 == 1) {
                paint2.setStrokeJoin(Paint.Join.ROUND);
            } else if (iF2 == 2) {
                paint2.setStrokeJoin(Paint.Join.BEVEL);
            }
        }
        if (x(b1fVar, 256L)) {
            f2fVar.a.K = b1fVar.K;
            f2fVar.e.setStrokeMiter(b1fVar.K.floatValue());
        }
        if (x(b1fVar, 512L)) {
            f2fVar.a.L = b1fVar.L;
        }
        if (x(b1fVar, 1024L)) {
            f2fVar.a.M = b1fVar.M;
        }
        Typeface typefaceI = null;
        if (x(b1fVar, 1536L)) {
            b1f b1fVar5 = f2fVar.a;
            Paint paint3 = f2fVar.e;
            n0f[] n0fVarArr = b1fVar5.L;
            if (n0fVarArr == null) {
                paint3.setPathEffect(null);
            } else {
                int length = n0fVarArr.length;
                int i = length % 2 == 0 ? length : length * 2;
                float[] fArr = new float[i];
                float f = 0.0f;
                for (int i2 = 0; i2 < i; i2++) {
                    float fA = b1fVar5.L[i2 % length].a(this);
                    fArr[i2] = fA;
                    f += fA;
                }
                if (f == MTTypesetterKt.kLineSkipLimitMultiplier) {
                    paint3.setPathEffect(null);
                } else {
                    float fA2 = b1fVar5.M.a(this);
                    if (fA2 < MTTypesetterKt.kLineSkipLimitMultiplier) {
                        fA2 = (fA2 % f) + f;
                    }
                    paint3.setPathEffect(new DashPathEffect(fArr, fA2));
                }
            }
        }
        if (x(b1fVar, 16384L)) {
            float textSize = ((f2f) this.d).d.getTextSize();
            f2fVar.a.Q = b1fVar.Q;
            f2fVar.d.setTextSize(b1fVar.Q.b(this, textSize));
            f2fVar.e.setTextSize(b1fVar.Q.b(this, textSize));
        }
        if (x(b1fVar, 8192L)) {
            f2fVar.a.P = b1fVar.P;
        }
        if (x(b1fVar, 32768L)) {
            if (b1fVar.R.intValue() == -1 && f2fVar.a.R.intValue() > 100) {
                b1f b1fVar6 = f2fVar.a;
                b1fVar6.R = Integer.valueOf(b1fVar6.R.intValue() - 100);
            } else if (b1fVar.R.intValue() != 1 || f2fVar.a.R.intValue() >= 900) {
                f2fVar.a.R = b1fVar.R;
            } else {
                b1f b1fVar7 = f2fVar.a;
                b1fVar7.R = Integer.valueOf(b1fVar7.R.intValue() + 100);
            }
        }
        if (x(b1fVar, 65536L)) {
            f2fVar.a.k0 = b1fVar.k0;
        }
        if (x(b1fVar, 106496L)) {
            b1f b1fVar8 = f2fVar.a;
            ArrayList arrayList = b1fVar8.P;
            if (arrayList != null && ((lrb) this.c) != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    typefaceI = i(b1fVar8.k0, (String) it.next(), b1fVar8.R);
                    if (typefaceI != null) {
                        break;
                    }
                }
            }
            if (typefaceI == null) {
                typefaceI = i(b1fVar8.k0, "serif", b1fVar8.R);
            }
            f2fVar.d.setTypeface(typefaceI);
            f2fVar.e.setTypeface(typefaceI);
        }
        if (x(b1fVar, 131072L)) {
            b1f b1fVar9 = f2fVar.a;
            Paint paint4 = f2fVar.e;
            Paint paint5 = f2fVar.d;
            b1fVar9.l0 = b1fVar.l0;
            paint5.setStrikeThruText(b1fVar.l0 == 4);
            paint5.setUnderlineText(b1fVar.l0 == 2);
            paint4.setStrikeThruText(b1fVar.l0 == 4);
            paint4.setUnderlineText(b1fVar.l0 == 2);
        }
        if (x(b1fVar, 68719476736L)) {
            f2fVar.a.m0 = b1fVar.m0;
        }
        if (x(b1fVar, 262144L)) {
            f2fVar.a.n0 = b1fVar.n0;
        }
        if (x(b1fVar, 524288L)) {
            f2fVar.a.S = b1fVar.S;
        }
        if (x(b1fVar, 2097152L)) {
            f2fVar.a.U = b1fVar.U;
        }
        if (x(b1fVar, 4194304L)) {
            f2fVar.a.V = b1fVar.V;
        }
        if (x(b1fVar, 8388608L)) {
            f2fVar.a.W = b1fVar.W;
        }
        if (x(b1fVar, 16777216L)) {
            f2fVar.a.X = b1fVar.X;
        }
        if (x(b1fVar, 33554432L)) {
            f2fVar.a.Y = b1fVar.Y;
        }
        if (x(b1fVar, w6.MAX_EVENT_SIZE_BYTES)) {
            f2fVar.a.T = b1fVar.T;
        }
        if (x(b1fVar, 268435456L)) {
            f2fVar.a.b0 = b1fVar.b0;
        }
        if (x(b1fVar, 536870912L)) {
            f2fVar.a.o0 = b1fVar.o0;
        }
        if (x(b1fVar, 1073741824L)) {
            f2fVar.a.c0 = b1fVar.c0;
        }
        if (x(b1fVar, 67108864L)) {
            f2fVar.a.Z = b1fVar.Z;
        }
        if (x(b1fVar, 134217728L)) {
            f2fVar.a.a0 = b1fVar.a0;
        }
        if (x(b1fVar, 8589934592L)) {
            f2fVar.a.f0 = b1fVar.f0;
        }
        if (x(b1fVar, 17179869184L)) {
            f2fVar.a.g0 = b1fVar.g0;
        }
        if (x(b1fVar, 137438953472L)) {
            f2fVar.a.q0 = b1fVar.q0;
        }
    }

    public void V(f2f f2fVar, h1f h1fVar) {
        boolean z = h1fVar.b == null;
        b1f b1fVar = f2fVar.a;
        Float fValueOf = Float.valueOf(1.0f);
        Boolean bool = Boolean.TRUE;
        b1fVar.X = bool;
        if (!z) {
            bool = Boolean.FALSE;
        }
        b1fVar.S = bool;
        b1fVar.T = null;
        b1fVar.b0 = null;
        b1fVar.N = fValueOf;
        b1fVar.Z = e0f.F;
        b1fVar.a0 = fValueOf;
        b1fVar.c0 = null;
        b1fVar.d0 = null;
        b1fVar.e0 = fValueOf;
        b1fVar.f0 = null;
        b1fVar.g0 = fValueOf;
        b1fVar.p0 = 1;
        b1f b1fVar2 = h1fVar.e;
        if (b1fVar2 != null) {
            U(f2fVar, b1fVar2);
        }
        ArrayList arrayList = ((d80) ((lrb) this.c).G).F;
        if (arrayList != null && !arrayList.isEmpty()) {
            for (u42 u42Var : ((d80) ((lrb) this.c).G).F) {
                if (b.g(u42Var.a, h1fVar)) {
                    U(f2fVar, u42Var.b);
                }
            }
        }
        b1f b1fVar3 = h1fVar.f;
        if (b1fVar3 != null) {
            U(f2fVar, b1fVar3);
        }
    }

    public void W() {
        int iJ;
        b1f b1fVar = ((f2f) this.d).a;
        k1f k1fVar = b1fVar.f0;
        if (k1fVar instanceof e0f) {
            iJ = ((e0f) k1fVar).E;
        } else if (!(k1fVar instanceof f0f)) {
            return;
        } else {
            iJ = b1fVar.O.E;
        }
        Float f = b1fVar.g0;
        if (f != null) {
            iJ = j(iJ, f.floatValue());
        }
        ((Canvas) this.b).drawColor(iJ);
    }

    public boolean X() {
        Boolean bool = ((f2f) this.d).a.Y;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public Path c(g1f g1fVar, sp0 sp0Var) {
        Path pathE;
        h1f h1fVarT = g1fVar.a.T(((f2f) this.d).a.b0);
        if (h1fVarT == null) {
            p("ClipPath reference '%s' not found", ((f2f) this.d).a.b0);
            return null;
        }
        d0f d0fVar = (d0f) h1fVarT;
        ((Stack) this.e).push((f2f) this.d);
        this.d = u(d0fVar);
        Boolean bool = d0fVar.o;
        boolean z = bool == null || bool.booleanValue();
        Matrix matrix = new Matrix();
        if (!z) {
            matrix.preTranslate(sp0Var.b, sp0Var.c);
            matrix.preScale(sp0Var.d, sp0Var.e);
        }
        Matrix matrix2 = d0fVar.n;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        Path path = new Path();
        for (j1f j1fVar : d0fVar.i) {
            if ((j1fVar instanceof g1f) && (pathE = E((g1f) j1fVar, true)) != null) {
                path.op(pathE, Path.Op.UNION);
            }
        }
        if (((f2f) this.d).a.b0 != null) {
            if (d0fVar.h == null) {
                d0fVar.h = d(path);
            }
            Path pathC = c(d0fVar, d0fVar.h);
            if (pathC != null) {
                path.op(pathC, Path.Op.INTERSECT);
            }
        }
        path.transform(matrix);
        this.d = (f2f) ((Stack) this.e).pop();
        return path;
    }

    public float e(u1f u1fVar) {
        g2f g2fVar = new g2f(this);
        o(u1fVar, g2fVar);
        return g2fVar.c;
    }

    public void g(g1f g1fVar, sp0 sp0Var) {
        Path pathC;
        if (((f2f) this.d).a.b0 == null || (pathC = c(g1fVar, sp0Var)) == null) {
            return;
        }
        ((Canvas) this.b).clipPath(pathC);
    }

    public void h(g1f g1fVar) {
        k1f k1fVar = ((f2f) this.d).a.F;
        if (k1fVar instanceof s0f) {
            k(true, g1fVar.h, (s0f) k1fVar);
        }
        k1f k1fVar2 = ((f2f) this.d).a.H;
        if (k1fVar2 instanceof s0f) {
            k(false, g1fVar.h, (s0f) k1fVar2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009d A[PHI: r11 r12 r15 r17
      0x009d: PHI (r11v17 float) = (r11v14 float), (r11v24 float) binds: [B:67:0x00cd, B:50:0x0096] A[DONT_GENERATE, DONT_INLINE]
      0x009d: PHI (r12v17 float) = (r12v15 float), (r12v24 float) binds: [B:67:0x00cd, B:50:0x0096] A[DONT_GENERATE, DONT_INLINE]
      0x009d: PHI (r15v17 float) = (r15v15 float), (r15v32 float) binds: [B:67:0x00cd, B:50:0x0096] A[DONT_GENERATE, DONT_INLINE]
      0x009d: PHI (r17v2 float) = (r17v1 float), (r17v4 float) binds: [B:67:0x00cd, B:50:0x0096] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void k(boolean r27, defpackage.sp0 r28, defpackage.s0f r29) {
        /*
            Method dump skipped, instruction units count: 981
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h2f.k(boolean, sp0, s0f):void");
    }

    public boolean l() {
        Boolean bool = ((f2f) this.d).a.X;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x0183  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m(defpackage.g1f r27, android.graphics.Path r28) {
        /*
            Method dump skipped, instruction units count: 594
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h2f.m(g1f, android.graphics.Path):void");
    }

    public void n(Path path) {
        f2f f2fVar = (f2f) this.d;
        int i = f2fVar.a.p0;
        Canvas canvas = (Canvas) this.b;
        if (i != 2) {
            canvas.drawPath(path, f2fVar.e);
            return;
        }
        Matrix matrix = canvas.getMatrix();
        Path path2 = new Path();
        path.transform(matrix, path2);
        canvas.setMatrix(new Matrix());
        Shader shader = ((f2f) this.d).e.getShader();
        Matrix matrix2 = new Matrix();
        if (shader != null) {
            shader.getLocalMatrix(matrix2);
            Matrix matrix3 = new Matrix(matrix2);
            matrix3.postConcat(matrix);
            shader.setLocalMatrix(matrix3);
        }
        canvas.drawPath(path2, ((f2f) this.d).e);
        canvas.setMatrix(matrix);
        if (shader != null) {
            shader.setLocalMatrix(matrix2);
        }
    }

    public void o(u1f u1fVar, ktk ktkVar) {
        float f;
        float f2;
        float fD;
        int iW;
        if (l()) {
            Iterator it = u1fVar.i.iterator();
            boolean z = true;
            while (it.hasNext()) {
                j1f j1fVar = (j1f) it.next();
                if (j1fVar instanceof x1f) {
                    ktkVar.q(S(((x1f) j1fVar).c, z, !it.hasNext()));
                } else if (ktkVar.p((u1f) j1fVar)) {
                    boolean z2 = j1fVar instanceof v1f;
                    float f3 = MTTypesetterKt.kLineSkipLimitMultiplier;
                    if (z2) {
                        R();
                        v1f v1fVar = (v1f) j1fVar;
                        V((f2f) this.d, v1fVar);
                        if (l() && X()) {
                            h1f h1fVarT = v1fVar.a.T(v1fVar.n);
                            if (h1fVarT == null) {
                                p("TextPath reference '%s' not found", v1fVar.n);
                            } else {
                                t0f t0fVar = (t0f) h1fVarT;
                                b2f b2fVar = new b2f(t0fVar.o);
                                Matrix matrix = t0fVar.n;
                                Path path = b2fVar.a;
                                if (matrix != null) {
                                    path.transform(matrix);
                                }
                                PathMeasure pathMeasure = new PathMeasure(path, false);
                                n0f n0fVar = v1fVar.o;
                                if (n0fVar != null) {
                                    f3 = n0fVar.b(this, pathMeasure.getLength());
                                }
                                int iW2 = w();
                                if (iW2 != 1) {
                                    float fE = e(v1fVar);
                                    if (iW2 == 2) {
                                        fE /= 2.0f;
                                    }
                                    f3 -= fE;
                                }
                                h(v1fVar.p);
                                boolean zG = G();
                                o(v1fVar, new c2f(this, path, f3));
                                if (zG) {
                                    F(v1fVar.h);
                                }
                            }
                        }
                        Q();
                    } else if (j1fVar instanceof r1f) {
                        R();
                        r1f r1fVar = (r1f) j1fVar;
                        V((f2f) this.d, r1fVar);
                        if (l()) {
                            ArrayList arrayList = r1fVar.n;
                            boolean z3 = arrayList != null && arrayList.size() > 0;
                            boolean z4 = ktkVar instanceof d2f;
                            if (z4) {
                                float fD2 = !z3 ? ((d2f) ktkVar).c : ((n0f) r1fVar.n.get(0)).d(this);
                                ArrayList arrayList2 = r1fVar.o;
                                f2 = (arrayList2 == null || arrayList2.size() == 0) ? ((d2f) ktkVar).d : ((n0f) r1fVar.o.get(0)).f(this);
                                ArrayList arrayList3 = r1fVar.p;
                                fD = (arrayList3 == null || arrayList3.size() == 0) ? 0.0f : ((n0f) r1fVar.p.get(0)).d(this);
                                ArrayList arrayList4 = r1fVar.q;
                                if (arrayList4 != null && arrayList4.size() != 0) {
                                    f3 = ((n0f) r1fVar.q.get(0)).f(this);
                                }
                                float f4 = fD2;
                                f = f3;
                                f3 = f4;
                            } else {
                                f = 0.0f;
                                f2 = 0.0f;
                                fD = 0.0f;
                            }
                            if (z3 && (iW = w()) != 1) {
                                float fE2 = e(r1fVar);
                                if (iW == 2) {
                                    fE2 /= 2.0f;
                                }
                                f3 -= fE2;
                            }
                            h(r1fVar.r);
                            if (z4) {
                                d2f d2fVar = (d2f) ktkVar;
                                d2fVar.c = f3 + fD;
                                d2fVar.d = f2 + f;
                            }
                            boolean zG2 = G();
                            o(r1fVar, ktkVar);
                            if (zG2) {
                                F(r1fVar.h);
                            }
                        }
                        Q();
                    } else if (j1fVar instanceof q1f) {
                        R();
                        q1f q1fVar = (q1f) j1fVar;
                        V((f2f) this.d, q1fVar);
                        if (l()) {
                            h(q1fVar.o);
                            h1f h1fVarT2 = j1fVar.a.T(q1fVar.n);
                            if (h1fVarT2 == null || !(h1fVarT2 instanceof u1f)) {
                                p("Tref reference '%s' not found", q1fVar.n);
                            } else {
                                StringBuilder sb = new StringBuilder();
                                q((u1f) h1fVarT2, sb);
                                if (sb.length() > 0) {
                                    ktkVar.q(sb.toString());
                                }
                            }
                        }
                        Q();
                    }
                }
                z = false;
            }
        }
    }

    public void q(u1f u1fVar, StringBuilder sb) {
        Iterator it = u1fVar.i.iterator();
        boolean z = true;
        while (it.hasNext()) {
            j1f j1fVar = (j1f) it.next();
            if (j1fVar instanceof u1f) {
                q((u1f) j1fVar, sb);
            } else if (j1fVar instanceof x1f) {
                sb.append(S(((x1f) j1fVar).c, z, !it.hasNext()));
            }
            z = false;
        }
    }

    public String toString() {
        switch (this.a) {
            case 4:
                qh9 qh9Var = new qh9();
                String str = (String) this.g;
                if (str != null) {
                    qh9Var.r("max_per_second", str);
                }
                String str2 = (String) this.c;
                if (str2 != null) {
                    qh9Var.r("name", str2);
                }
                String str3 = (String) this.d;
                if (str3 != null) {
                    qh9Var.r("resource", str3);
                }
                String str4 = (String) this.f;
                if (str4 != null) {
                    qh9Var.r("sample_rate", str4);
                }
                String str5 = (String) this.b;
                if (str5 != null) {
                    qh9Var.r("service", str5);
                }
                HashMap map = (HashMap) this.e;
                if (map != null) {
                    qh9Var.o("tags", oq5.y(map));
                }
                return qh9Var.toString();
            default:
                return super.toString();
        }
    }

    public f2f u(h1f h1fVar) {
        f2f f2fVar = new f2f();
        U(f2fVar, b1f.a());
        v(h1fVar, f2fVar);
        return f2fVar;
    }

    public void v(j1f j1fVar, f2f f2fVar) {
        ArrayList arrayList = new ArrayList();
        while (true) {
            if (j1fVar instanceof h1f) {
                arrayList.add(0, (h1f) j1fVar);
            }
            Object obj = j1fVar.b;
            if (obj == null) {
                break;
            } else {
                j1fVar = (j1f) obj;
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            V(f2fVar, (h1f) it.next());
        }
        f2f f2fVar2 = (f2f) this.d;
        f2fVar.g = f2fVar2.g;
        f2fVar.f = f2fVar2.f;
    }

    public int w() {
        int i;
        b1f b1fVar = ((f2f) this.d).a;
        return (b1fVar.m0 == 1 || (i = b1fVar.n0) == 2) ? b1fVar.n0 : i == 1 ? 3 : 1;
    }

    public Source y() throws IOException {
        s4d s4dVar = s4d.a;
        Object obj = s4d.a;
        to4 to4Var = obj != null ? (to4) obj : null;
        Context contextB = to4Var != null ? to4Var.b() : null;
        AssetManager assets = contextB != null ? contextB.getAssets() : null;
        if (assets != null) {
            InputStream inputStreamOpen = assets.open((String) this.g);
            inputStreamOpen.getClass();
            return Okio.g(inputStreamOpen);
        }
        if (Build.FINGERPRINT == null) {
            xh6.c("Platform applicationContext not initialized. Possibly running Android unit test without Robolectric. Android tests should run with Robolectric and call OkHttp.initialize before test");
            return null;
        }
        xh6.c("Platform applicationContext not initialized. Startup Initializer possibly disabled, call OkHttp.initialize before test.");
        return null;
    }

    public Path z(c0f c0fVar) {
        n0f n0fVar = c0fVar.o;
        float f = MTTypesetterKt.kLineSkipLimitMultiplier;
        float fD = n0fVar != null ? n0fVar.d(this) : 0.0f;
        n0f n0fVar2 = c0fVar.p;
        if (n0fVar2 != null) {
            f = n0fVar2.f(this);
        }
        float f2 = f;
        float fA = c0fVar.q.a(this);
        float f3 = fD - fA;
        float f4 = f2 - fA;
        float f5 = fD + fA;
        float f6 = f2 + fA;
        if (c0fVar.h == null) {
            float f7 = 2.0f * fA;
            c0fVar.h = new sp0(f3, f4, f7, f7, 2);
        }
        float f8 = fA * 0.5522848f;
        Path path = new Path();
        path.moveTo(fD, f4);
        float f9 = fD + f8;
        float f10 = f2 - f8;
        path.cubicTo(f9, f4, f5, f10, f5, f2);
        float f11 = f2 + f8;
        path.cubicTo(f5, f11, f9, f6, fD, f6);
        float f12 = fD - f8;
        path.cubicTo(f12, f6, f3, f11, f3, f2);
        path.cubicTo(f3, f10, f12, f4, fD, f4);
        path.close();
        return path;
    }

    public /* synthetic */ h2f(int i) {
        this.a = i;
    }

    public h2f(g6b g6bVar, MediaFormat mediaFormat, jw7 jw7Var, Surface surface, MediaCrypto mediaCrypto, xv8 xv8Var) {
        this.a = 3;
        this.b = g6bVar;
        this.c = mediaFormat;
        this.d = jw7Var;
        this.e = surface;
        this.f = mediaCrypto;
        this.g = xv8Var;
    }
}
