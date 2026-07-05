package defpackage;

import com.pvporbit.freetype.FreeTypeConstants;

/* JADX INFO: loaded from: classes3.dex */
public abstract class rw7 {
    public static final long a = eve.B(8);
    public static final long b = eve.B(4);
    public static final long c = eve.B(4);
    public static final hz6 d = new hz6(10);
    public static final hz6 e = new hz6(11);
    public static final xe4 f = new xe4(new c97(12));

    /* JADX WARN: Removed duplicated region for block: B:40:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final defpackage.cte r15, final defpackage.paa r16, java.util.List r17, int r18, defpackage.ta4 r19, defpackage.ld4 r20, int r21, int r22) {
        /*
            Method dump skipped, instruction units count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rw7.a(cte, paa, java.util.List, int, ta4, ld4, int, int):void");
    }

    public static final void b(int i, float f2, qnc qncVar, ta4 ta4Var, ta4 ta4Var2, ld4 ld4Var, int i2) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1888378294);
        int i3 = (e18Var.d(i) ? 4 : 2) | i2 | (e18Var.c(f2) ? 32 : 16) | (e18Var.f(qncVar) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC);
        if (e18Var.Q(i3 & 1, (i3 & 9363) != 9362)) {
            boolean z = ((i3 & 112) == 32) | ((i3 & 14) == 4);
            Object objN = e18Var.N();
            if (z || objN == jd4.a) {
                objN = new qw7(i, f2);
                e18Var.k0(objN);
            }
            o5b o5bVar = (o5b) objN;
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, fqb.E);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, cd4.f, o5bVar);
            d4c.i0(e18Var, cd4.e, hycVarL);
            d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var, cd4.h);
            d4c.i0(e18Var, cd4.d, iqbVarE);
            xvk.b(fd9.q0(-1117232110, new qq(i, qncVar, ta4Var, 23), e18Var), e18Var, 6);
            e18Var.a0(1702741527);
            for (int i4 = 0; i4 < i; i4++) {
                ta4Var2.invoke(Integer.valueOf(i4), e18Var, 48);
            }
            e18Var.p(false);
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new lb1(i, f2, qncVar, ta4Var, ta4Var2, i2);
        }
    }

    public static final void c(ta4 ta4Var, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(824663458);
        if (e18Var.Q(i & 1, (i & 3) != 2)) {
            j8.c(f.a(0), fd9.q0(20615394, new rx0(ta4Var, 18), e18Var), e18Var, 56);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new rx0(ta4Var, i, 19);
        }
    }
}
