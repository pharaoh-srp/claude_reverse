package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public abstract class fqi {
    public static final long a = sl4.b(0, 0, 0, 0, 5);
    public static final /* synthetic */ int b = 0;

    public static final d11 a(ld4 ld4Var) {
        e18 e18Var = (e18) ld4Var;
        if (!((Boolean) e18Var.j(p59.a)).booleanValue()) {
            e18Var.a0(2019088453);
            e18Var.p(false);
            return null;
        }
        e18Var.a0(2019030948);
        d11 d11Var = (d11) e18Var.j(xca.a);
        e18Var.p(false);
        return d11Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.x8g b(defpackage.jo4 r2, defpackage.ld4 r3) {
        /*
            qm7 r0 = defpackage.ho4.e
            boolean r2 = defpackage.x44.r(r2, r0)
            e18 r3 = (defpackage.e18) r3
            boolean r0 = r3.g(r2)
            java.lang.Object r1 = r3.N()
            if (r0 != 0) goto L16
            lz1 r0 = defpackage.jd4.a
            if (r1 != r0) goto L30
        L16:
            if (r2 == 0) goto L1c
            a5e r2 = defpackage.x8g.m
        L1a:
            r1 = r2
            goto L2d
        L1c:
            ul4 r2 = new ul4
            r2.<init>()
            long r0 = defpackage.fqi.a
            r2.E = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.F = r0
            goto L1a
        L2d:
            r3.k0(r1)
        L30:
            x8g r1 = (defpackage.x8g) r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fqi.b(jo4, ld4):x8g");
    }

    public static final jx8 c(Object obj, ld4 ld4Var) {
        e18 e18Var = (e18) ld4Var;
        e18Var.a0(1319639034);
        if (obj instanceof jx8) {
            e18Var.a0(1530875884);
            jx8 jx8Var = (jx8) obj;
            e18Var.p(false);
            e18Var.p(false);
            return jx8Var;
        }
        e18Var.a0(1530915130);
        Context context = (Context) e18Var.j(w00.b);
        boolean zF = e18Var.f(context) | e18Var.f(obj);
        Object objN = e18Var.N();
        if (zF || objN == jd4.a) {
            fx8 fx8Var = new fx8(context);
            fx8Var.c = obj;
            objN = fx8Var.a();
            e18Var.k0(objN);
        }
        jx8 jx8Var2 = (jx8) objN;
        e18Var.p(false);
        e18Var.p(false);
        return jx8Var2;
    }

    public static final jx8 d(Object obj, jo4 jo4Var, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.a0(-329318062);
        boolean z = obj instanceof jx8;
        lz1 lz1Var = jd4.a;
        if (!z) {
            e18Var.a0(-1008595950);
            Context context = (Context) e18Var.j(w00.b);
            x8g x8gVarB = b(jo4Var, e18Var);
            boolean zF = e18Var.f(context) | e18Var.f(obj) | e18Var.f(x8gVarB);
            Object objN = e18Var.N();
            if (zF || objN == lz1Var) {
                fx8 fx8Var = new fx8(context);
                fx8Var.c = obj;
                fx8Var.n = x8gVarB;
                objN = fx8Var.a();
                e18Var.k0(objN);
            }
            jx8 jx8Var = (jx8) objN;
            e18Var.p(false);
            e18Var.p(false);
            return jx8Var;
        }
        e18Var.a0(-1008942344);
        jx8 jx8Var2 = (jx8) obj;
        if (jx8Var2.u.g != null) {
            e18Var.a0(-1008902292);
            e18Var.p(false);
            e18Var.p(false);
            e18Var.p(false);
            return jx8Var2;
        }
        e18Var.a0(-1008854118);
        x8g x8gVarB2 = b(jo4Var, e18Var);
        boolean zF2 = e18Var.f(obj) | e18Var.f(x8gVarB2);
        Object objN2 = e18Var.N();
        if (zF2 || objN2 == lz1Var) {
            fx8 fx8VarV = jx8.v(jx8Var2);
            fx8VarV.n = x8gVarB2;
            objN2 = fx8VarV.a();
            e18Var.k0(objN2);
        }
        jx8 jx8Var3 = (jx8) objN2;
        ij0.w(e18Var, false, false, false);
        return jx8Var3;
    }

    public static final long e(long j) {
        int iL = mwa.L(Float.intBitsToFloat((int) (j >> 32)));
        return (((long) mwa.L(Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (((long) iL) << 32);
    }

    public static void f(String str) {
        throw new IllegalArgumentException(ij0.k("Unsupported type: ", str, ". ", ij0.j("If you wish to display this ", str, ", use androidx.compose.foundation.Image.")));
    }

    public static final void g(jx8 jx8Var) {
        Object obj = jx8Var.b;
        if (obj instanceof fx8) {
            sz6.p("Unsupported type: ImageRequest.Builder. Did you forget to call ImageRequest.Builder.build()?");
            return;
        }
        if (obj instanceof r20) {
            f("ImageBitmap");
            throw null;
        }
        if (obj instanceof py8) {
            f("ImageVector");
            throw null;
        }
        if (obj instanceof bpc) {
            f("Painter");
            throw null;
        }
        if (jx8Var.c != null) {
            sz6.p("request.target must be null.");
        } else {
            if (((c4a) dch.y(jx8Var, nx8.e)) == null) {
                return;
            }
            sz6.p("request.lifecycle must be null.");
        }
    }
}
