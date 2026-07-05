package defpackage;

import android.view.ViewTreeObserver;
import androidx.compose.ui.platform.AndroidComposeView;
import com.agog.mathdisplay.render.MTTypesetterKt;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class raf {
    public aaf a;
    public b20 b;
    public eo7 c;
    public ukc d;
    public boolean e;
    public b0c f;
    public final z9f g;
    public final u9f h;
    public boolean i;
    public int j = 1;
    public h9f k = r9f.b;
    public final paf l = new paf(this);
    public final tz9 m = new tz9(23, this);

    public raf(aaf aafVar, b20 b20Var, eo7 eo7Var, ukc ukcVar, boolean z, b0c b0cVar, z9f z9fVar, u9f u9fVar) {
        this.a = aafVar;
        this.b = b20Var;
        this.c = eo7Var;
        this.d = ukcVar;
        this.e = z;
        this.f = b0cVar;
        this.g = z9fVar;
        this.h = u9fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(long r11, defpackage.vp4 r13) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r13 instanceof defpackage.naf
            if (r0 == 0) goto L13
            r0 = r13
            naf r0 = (defpackage.naf) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.H = r1
            goto L18
        L13:
            naf r0 = new naf
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.F
            int r1 = r0.H
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L34
            if (r1 != r3) goto L2d
            cae r11 = r0.E
            defpackage.sf5.h0(r13)     // Catch: java.lang.Throwable -> L29
            r5 = r10
            goto L58
        L29:
            r0 = move-exception
            r11 = r0
            r5 = r10
            goto L67
        L2d:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r10)
            r10 = 0
            return r10
        L34:
            defpackage.sf5.h0(r13)
            cae r6 = new cae
            r6.<init>()
            r6.E = r11
            r10.i = r3
            zwb r13 = defpackage.zwb.E     // Catch: java.lang.Throwable -> L64
            oaf r4 = new oaf     // Catch: java.lang.Throwable -> L64
            r9 = 0
            r5 = r10
            r7 = r11
            r4.<init>(r5, r6, r7, r9)     // Catch: java.lang.Throwable -> L61
            r0.E = r6     // Catch: java.lang.Throwable -> L61
            r0.H = r3     // Catch: java.lang.Throwable -> L61
            java.lang.Object r10 = r5.f(r13, r4, r0)     // Catch: java.lang.Throwable -> L61
            m45 r11 = defpackage.m45.E
            if (r10 != r11) goto L57
            return r11
        L57:
            r11 = r6
        L58:
            r5.i = r2
            long r10 = r11.E
            qsi r10 = defpackage.qsi.a(r10)
            return r10
        L61:
            r0 = move-exception
        L62:
            r11 = r0
            goto L67
        L64:
            r0 = move-exception
            r5 = r10
            goto L62
        L67:
            r5.i = r2
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.raf.a(long, vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(long r4, boolean r6, defpackage.xzg r7) {
        /*
            r3 = this;
            if (r6 == 0) goto Lb
            eo7 r6 = r3.c
            a6f r0 = defpackage.r9f.a
            boolean r6 = r6 instanceof defpackage.ir5
            if (r6 == 0) goto Lb
            goto L48
        Lb:
            ukc r6 = r3.d
            ukc r0 = defpackage.ukc.F
            r1 = 0
            if (r6 != r0) goto L18
            r6 = 1
        L13:
            long r4 = defpackage.qsi.b(r4, r1, r1, r6)
            goto L1a
        L18:
            r6 = 2
            goto L13
        L1a:
            qaf r6 = new qaf
            r0 = 0
            r6.<init>(r3, r0)
            b20 r0 = r3.b
            m45 r1 = defpackage.m45.E
            if (r0 == 0) goto L3d
            aaf r2 = r3.a
            boolean r2 = r2.d()
            if (r2 != 0) goto L36
            aaf r3 = r3.a
            boolean r3 = r3.b()
            if (r3 == 0) goto L3d
        L36:
            java.lang.Object r3 = r0.b(r4, r6, r7)
            if (r3 != r1) goto L48
            return r3
        L3d:
            qsi r3 = defpackage.qsi.a(r4)
            java.lang.Object r3 = r6.invoke(r3, r7)
            if (r3 != r1) goto L48
            return r3
        L48:
            iei r3 = defpackage.iei.a
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.raf.b(long, boolean, xzg):java.lang.Object");
    }

    public final long c(h9f h9fVar, long j, int i) {
        f0c f0cVar = this.f.a;
        f0c f0cVarQ1 = f0cVar != null ? f0cVar.q1() : null;
        long jX = f0cVarQ1 != null ? f0cVarQ1.X(i, j) : 0L;
        long jH = fcc.h(j, jX);
        long jE = e(h(h9fVar.b(g(e(this.d == ukc.F ? fcc.a(jH, MTTypesetterKt.kLineSkipLimitMultiplier, 1) : fcc.a(jH, MTTypesetterKt.kLineSkipLimitMultiplier, 2))))));
        z9f z9fVar = this.g;
        if (z9fVar.R) {
            ViewTreeObserver viewTreeObserver = ((AndroidComposeView) yfd.X(z9fVar)).getViewTreeObserver();
            try {
                if (AndroidComposeView.w1 == null) {
                    Method declaredMethod = viewTreeObserver.getClass().getDeclaredMethod("dispatchOnScrollChanged", null);
                    declaredMethod.setAccessible(true);
                    AndroidComposeView.w1 = declaredMethod;
                }
                Method method = AndroidComposeView.w1;
                if (method != null) {
                    method.invoke(viewTreeObserver, null);
                }
            } catch (Exception unused) {
            }
        }
        long jH2 = fcc.h(jH, jE);
        f0c f0cVar2 = this.f.a;
        f0c f0cVarQ12 = f0cVar2 != null ? f0cVar2.q1() : null;
        return fcc.i(fcc.i(jX, jE), f0cVarQ12 != null ? f0cVarQ12.F(jE, i, jH2) : 0L);
    }

    public final float d(float f) {
        return this.e ? f * (-1.0f) : f;
    }

    public final long e(long j) {
        return this.e ? fcc.j(-1.0f, j) : j;
    }

    public final Object f(zwb zwbVar, pz7 pz7Var, vp4 vp4Var) {
        Object objC = this.a.c(zwbVar, new ba9(this, pz7Var, null, 18), vp4Var);
        return objC == m45.E ? objC : iei.a;
    }

    public final float g(long j) {
        return Float.intBitsToFloat((int) (this.d == ukc.F ? j >> 32 : j & 4294967295L));
    }

    public final long h(float f) {
        if (f == MTTypesetterKt.kLineSkipLimitMultiplier) {
            return 0L;
        }
        if (this.d == ukc.F) {
            return (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(MTTypesetterKt.kLineSkipLimitMultiplier)) & 4294967295L);
        }
        return (((long) Float.floatToRawIntBits(f)) & 4294967295L) | (Float.floatToRawIntBits(MTTypesetterKt.kLineSkipLimitMultiplier) << 32);
    }

    public final float i(long j) {
        int i = (int) (4294967295L & j);
        int i2 = (int) (j >> 32);
        double dAtan2 = (float) Math.atan2(Math.abs(Float.intBitsToFloat(i)), Math.abs(Float.intBitsToFloat(i2)));
        ukc ukcVar = this.d;
        return dAtan2 >= 0.7853981633974483d ? ukcVar == ukc.E ? Float.intBitsToFloat(i) : MTTypesetterKt.kLineSkipLimitMultiplier : ukcVar == ukc.F ? Float.intBitsToFloat(i2) : MTTypesetterKt.kLineSkipLimitMultiplier;
    }
}
