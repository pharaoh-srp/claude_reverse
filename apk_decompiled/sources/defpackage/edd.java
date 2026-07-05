package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes2.dex */
public final class edd {
    public final lsc a = mpk.P(null);
    public final lsc b = mpk.P(Boolean.TRUE);
    public Object c;

    static {
        k7b.a("media3.ui.compose");
    }

    public static k8g a(v77 v77Var) {
        if (v77Var == null) {
            return null;
        }
        v77Var.F();
        float f = v77Var.b0.a;
        v77Var.F();
        long jI = eve.i(f, v77Var.b0.b);
        if (k8g.e(jI) == MTTypesetterKt.kLineSkipLimitMultiplier || k8g.c(jI) == MTTypesetterKt.kLineSkipLimitMultiplier) {
            return null;
        }
        v77Var.F();
        float f2 = v77Var.b0.c;
        double d = f2;
        if (d < 1.0d) {
            jI = k8g.a(jI, k8g.e(jI) * f2, MTTypesetterKt.kLineSkipLimitMultiplier, 2);
        } else if (d > 1.0d) {
            jI = k8g.a(jI, MTTypesetterKt.kLineSkipLimitMultiplier, k8g.c(jI) / f2, 1);
        }
        return new k8g(jI);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(defpackage.v77 r4) {
        /*
            r3 = this;
            lsc r3 = r3.b
            r0 = 1
            if (r4 == 0) goto L4a
            r1 = 30
            boolean r2 = r4.q(r1)
            if (r2 == 0) goto L21
            r4.F()
            j6d r2 = r4.d0
            f4i r2 = r2.i
            java.lang.Object r2 = r2.H
            r4i r2 = (defpackage.r4i) r2
            nz8 r2 = r2.a
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L21
            goto L22
        L21:
            r0 = 0
        L22:
            if (r0 != 0) goto L29
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r3.setValue(r2)
        L29:
            if (r0 == 0) goto L49
            boolean r0 = r4.q(r1)
            if (r0 == 0) goto L44
            r4.F()
            j6d r4 = r4.d0
            f4i r4 = r4.i
            java.lang.Object r4 = r4.H
            r4i r4 = (defpackage.r4i) r4
            r0 = 2
            boolean r4 = r4.a(r0)
            if (r4 == 0) goto L44
            goto L49
        L44:
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            r3.setValue(r4)
        L49:
            return
        L4a:
            java.lang.Object r4 = r3.getValue()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            r4.booleanValue()
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
            r3.setValue(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.edd.b(v77):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.v77 r5, defpackage.vp4 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.ddd
            if (r0 == 0) goto L13
            r0 = r6
            ddd r0 = (defpackage.ddd) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.H = r1
            goto L18
        L13:
            ddd r0 = new ddd
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.F
            m45 r1 = defpackage.m45.E
            int r2 = r0.H
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 == r3) goto L2a
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r4)
            r4 = 0
            return r4
        L2a:
            edd r4 = r0.E
            defpackage.sf5.h0(r6)     // Catch: java.lang.Throwable -> L35
            kotlin.KotlinNothingValueException r5 = new kotlin.KotlinNothingValueException     // Catch: java.lang.Throwable -> L35
            r5.<init>()     // Catch: java.lang.Throwable -> L35
            throw r5     // Catch: java.lang.Throwable -> L35
        L35:
            r5 = move-exception
            goto L5a
        L37:
            defpackage.sf5.h0(r6)
            k8g r6 = a(r5)     // Catch: java.lang.Throwable -> L35
            lsc r2 = r4.a     // Catch: java.lang.Throwable -> L35
            r2.setValue(r6)     // Catch: java.lang.Throwable -> L35
            r4.b(r5)     // Catch: java.lang.Throwable -> L35
            if (r5 == 0) goto L57
            lpa r6 = new lpa     // Catch: java.lang.Throwable -> L35
            r2 = 22
            r6.<init>(r4, r2, r5)     // Catch: java.lang.Throwable -> L35
            r0.E = r4     // Catch: java.lang.Throwable -> L35
            r0.H = r3     // Catch: java.lang.Throwable -> L35
            defpackage.cvj.f(r5, r6, r0)     // Catch: java.lang.Throwable -> L35
            return r1
        L57:
            iei r4 = defpackage.iei.a
            return r4
        L5a:
            r4.getClass()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.edd.c(v77, vp4):java.lang.Object");
    }
}
