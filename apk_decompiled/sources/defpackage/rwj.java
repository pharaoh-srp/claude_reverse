package defpackage;

import androidx.compose.foundation.layout.b;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public abstract class rwj {
    public static final ta4 a = new ta4(-1076060628, false, new xa4(28));
    public static final ta4 b = new ta4(2063609093, false, new bb4(15));
    public static final ta4 c = new ta4(-143564663, false, new bb4(16));
    public static final ta4 d = new ta4(227270578, false, new bb4(17));
    public static final ta4 e = new ta4(-1062155762, false, new bb4(18));

    public static final void a(List list, iqb iqbVar, ld4 ld4Var, int i, int i2) {
        int i3;
        list.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-720370717);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? e18Var.f(list) : e18Var.h(list) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= e18Var.f(iqbVar) ? 32 : 16;
        }
        if (e18Var.Q(i3 & 1, (i3 & 19) != 18)) {
            if (i4 != 0) {
                iqbVar = fqb.E;
            }
            j8.c(jmc.a.a(null), fd9.q0(-277403485, new ra7(iqbVar, list, v40.F(e18Var) ? q54.b : q54.c, 23), e18Var), e18Var, 48);
        } else {
            e18Var.T();
        }
        iqb iqbVar2 = iqbVar;
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ve2(i, i2, 4, list, iqbVar2);
        }
    }

    public static final void b(e1a e1aVar, iqb iqbVar, String str, ta4 ta4Var, ld4 ld4Var, int i) {
        String str2;
        iqb iqbVar2;
        e1aVar.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(862229074);
        int i2 = (e18Var.h(e1aVar) ? 4 : 2) | i | 48;
        if (e18Var.Q(i2 & 1, (i2 & 1171) != 1170)) {
            Boolean bool = Boolean.FALSE;
            boolean zH = e18Var.h(e1aVar);
            Object objN = e18Var.N();
            if (zH || objN == jd4.a) {
                objN = new kza(e1aVar, (tp4) null, 19);
                e18Var.k0(objN);
            }
            nwb nwbVarR = mpk.R(e18Var, (pz7) objN, bool);
            Boolean boolValueOf = Boolean.valueOf(((List) e1aVar.d.getValue()) != null);
            ta4 ta4VarQ0 = fd9.q0(-1998269581, new xg4(e1aVar, ta4Var, nwbVarR, 26), e18Var);
            fqb fqbVar = fqb.E;
            str2 = str;
            knk.e(boolValueOf, fqbVar, null, str2, ta4VarQ0, e18Var, 27696, 4);
            iqbVar2 = fqbVar;
        } else {
            str2 = str;
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new bg6(e1aVar, iqbVar2, str2, ta4Var, i);
        }
    }

    public static final void c(String str, String str2, zy7 zy7Var, e1a e1aVar, ld4 ld4Var, int i) {
        String str3;
        int i2;
        zy7 zy7Var2;
        e1a e1aVar2;
        int i3;
        e1a e1aVarN;
        str.getClass();
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(572492804);
        int i4 = 2;
        if ((i & 6) == 0) {
            str3 = str;
            i2 = (e18Var.f(str3) ? 4 : 2) | i;
        } else {
            str3 = str;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.f(str2) ? 32 : 16;
        }
        int i5 = i & 384;
        dj7 dj7Var = dj7.a;
        if (i5 == 0) {
            i2 |= e18Var.f(dj7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            zy7Var2 = zy7Var;
            i2 |= e18Var.h(zy7Var2) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        } else {
            zy7Var2 = zy7Var;
        }
        if ((i & 24576) == 0) {
            i2 |= FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        int i6 = 1;
        if (e18Var.Q(i2 & 1, (i2 & 9363) != 9362)) {
            e18Var.V();
            if ((i & 1) == 0 || e18Var.A()) {
                i3 = i2 & (-57345);
                e1aVarN = n(str2, e18Var, (i2 >> 3) & 14);
            } else {
                e18Var.T();
                i3 = i2 & (-57345);
                e1aVarN = e1aVar;
            }
            e18Var.q();
            boolean zH = e18Var.h(e1aVarN) | ((i3 & 112) == 32);
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (zH || objN == lz1Var) {
                objN = new x1d(e1aVarN, str2, null, i4);
                e18Var.k0(objN);
            }
            fd9.i(e18Var, (pz7) objN, str2);
            lwj.j(dj7Var, null, "text", null, e18Var, ((i3 >> 6) & 14) | 432);
            Object objN2 = e18Var.N();
            if (objN2 == lz1Var) {
                objN2 = new oob(19);
                e18Var.k0(objN2);
            }
            zy7 zy7Var3 = (zy7) objN2;
            Object objN3 = e18Var.N();
            if (objN3 == lz1Var) {
                objN3 = new oob(19);
                e18Var.k0(objN3);
            }
            otj.e(str3, false, false, zy7Var3, zy7Var2, (zy7) objN3, null, null, null, null, null, fd9.q0(1909852716, new tdd(e1aVarN, i6), e18Var), e18Var, (i3 & 14) | 200112 | (57344 & (i3 << 3)), 48, 1984);
            e18Var = e18Var;
            e1aVar2 = e1aVarN;
        } else {
            e18Var.T();
            e1aVar2 = e1aVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new bg6(str, str2, zy7Var, e1aVar2, i, 17);
        }
    }

    public static final void d(String str, iqb iqbVar, ld4 ld4Var, int i) {
        e18 e18Var;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-342320046);
        int i2 = i | (e18Var2.f(str) ? 4 : 2);
        if ((i & 48) == 0) {
            i2 |= e18Var2.f(iqbVar) ? 32 : 16;
        }
        if (e18Var2.Q(i2 & 1, (i2 & 19) != 18)) {
            wo1 wo1Var = lja.Q;
            ho0 ho0Var = new ho0(12.0f, true, new sz6(1));
            iqb iqbVarC = b.c(iqbVar, 1.0f);
            cxe cxeVarA = axe.a(ho0Var, wo1Var, e18Var2, 54);
            int iHashCode = Long.hashCode(e18Var2.T);
            hyc hycVarL = e18Var2.l();
            iqb iqbVarE = kxk.E(e18Var2, iqbVarC);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var2.e0();
            if (e18Var2.S) {
                e18Var2.k(re4Var);
            } else {
                e18Var2.n0();
            }
            d4c.i0(e18Var2, cd4.f, cxeVarA);
            d4c.i0(e18Var2, cd4.e, hycVarL);
            d4c.i0(e18Var2, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var2, cd4.h);
            d4c.i0(e18Var2, cd4.d, iqbVarE);
            if (1.0f <= 0.0d) {
                z29.a("invalid weight; must be greater than zero");
            }
            e(new hw9(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), e18Var2, 0);
            tjh.b(str, null, gm3.a(e18Var2).u, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var2).e.E).k, e18Var2, i2 & 14, 0, 131066);
            e18Var = e18Var2;
            if (1.0f <= 0.0d) {
                z29.a("invalid weight; must be greater than zero");
            }
            e(new hw9(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), e18Var, 0);
            e18Var.p(true);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new el(str, iqbVar, i, 8);
        }
    }

    public static final void e(iqb iqbVar, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-903513306);
        int i2 = (e18Var.f(iqbVar) ? 4 : 2) | i;
        if (e18Var.Q(i2 & 1, (i2 & 3) != 2)) {
            long j = gm3.a(e18Var).u;
            iqb iqbVarE = b.e(iqbVar, 4.0f);
            boolean zE = e18Var.e(j);
            Object objN = e18Var.N();
            if (zE || objN == jd4.a) {
                objN = new j10(j, 7);
                e18Var.k0(objN);
            }
            kxk.g(e18Var, zni.t(iqbVarE, (bz7) objN));
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new fl(i, 26, iqbVar);
        }
    }

    public static final void f(int i, ld4 ld4Var, iqb iqbVar, String str, String str2) {
        str2.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-124338546);
        int i2 = (e18Var.f(str) ? 4 : 2) | i | (e18Var.f(str2) ? 32 : 16);
        if (!e18Var.Q(i2 & 1, (i2 & 147) != 146)) {
            e18Var.T();
        } else if (str2.equals("txt")) {
            e18Var.a0(-1907658740);
            boolean z = (i2 & 14) == 4;
            Object objN = e18Var.N();
            if (z || objN == jd4.a) {
                objN = p(str);
                e18Var.k0(objN);
            }
            a((List) objN, iqbVar, e18Var, 48, 0);
            e18Var.p(false);
        } else {
            e18Var.a0(-1907513009);
            xvk.c(iqbVar, fd9.q0(879714581, new ny3(str, str2, 6), e18Var), e18Var, 54, 0);
            e18Var.p(false);
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new fl3(str, str2, iqbVar, i, 1);
        }
    }

    public static nc2 g(long j, long j2, long j3, long j4, ld4 ld4Var, int i, int i2) {
        long jB = (i2 & 2) != 0 ? p54.b(j, ld4Var) : j2;
        long j5 = (i2 & 4) != 0 ? d54.h : j3;
        long jB2 = (i2 & 8) != 0 ? d54.b(0.38f, jB) : j4;
        nc2 nc2VarL = l(((gwa) ((e18) ld4Var).j(jwa.a)).a);
        long j6 = j != 16 ? j : nc2VarL.a;
        if (jB == 16) {
            jB = nc2VarL.b;
        }
        if (j5 == 16) {
            j5 = nc2VarL.c;
        }
        if (jB2 == 16) {
            jB2 = nc2VarL.d;
        }
        return new nc2(j6, jB, j5, jB2);
    }

    public static rc2 h(int i) {
        return new rc2((i & 1) != 0 ? 0.0f : 2.0f, fe5.h, fe5.g, (i & 32) != 0 ? 0.0f : 2.0f);
    }

    public static final o92 i(Executor executor, String str, zy7 zy7Var) {
        executor.getClass();
        return mpk.J(new et5(executor, str, zy7Var, 4));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static kt6 j(qh9 qh9Var) {
        kt6 kt6Var;
        int i;
        String strM;
        qh9Var.getClass();
        try {
            long jK = qh9Var.s("date").k();
            fs6 fs6VarL = lwj.l(qh9Var.s("application").g());
            bh9 bh9VarS = qh9Var.s("service");
            String strM2 = bh9VarS != null ? bh9VarS.m() : null;
            bh9 bh9VarS2 = qh9Var.s("version");
            String strM3 = bh9VarS2 != null ? bh9VarS2.m() : null;
            bh9 bh9VarS3 = qh9Var.s("build_version");
            String strM4 = bh9VarS3 != null ? bh9VarS3.m() : null;
            bh9 bh9VarS4 = qh9Var.s("build_id");
            String strM5 = bh9VarS4 != null ? bh9VarS4.m() : null;
            bh9 bh9VarS5 = qh9Var.s("ddtags");
            String strM6 = bh9VarS5 != null ? bh9VarS5.m() : null;
            ws6 ws6VarH = uhk.h(qh9Var.s("session").g());
            bh9 bh9VarS6 = qh9Var.s("source");
            int i2 = 0;
            if (bh9VarS6 != null && (strM = bh9VarS6.m()) != null) {
                int[] iArrH = sq6.H(11);
                kt6Var = null;
                try {
                    int length = iArrH.length;
                    while (i2 < length) {
                        int i3 = iArrH[i2];
                        int i4 = length;
                        if (ms6.n(i3).equals(strM)) {
                            i = i3;
                        } else {
                            i2++;
                            length = i4;
                        }
                    }
                    throw new NoSuchElementException("Array contains no element matching the predicate.");
                } catch (IllegalStateException e2) {
                    e = e2;
                    pmf.j("Unable to parse json into type ErrorEvent", e);
                    return kt6Var;
                } catch (NullPointerException e3) {
                    e = e3;
                    pmf.j("Unable to parse json into type ErrorEvent", e);
                    return kt6Var;
                } catch (NumberFormatException e4) {
                    e = e4;
                    pmf.j("Unable to parse json into type ErrorEvent", e);
                    return kt6Var;
                }
            }
            kt6Var = null;
            i = 0;
            xs6 xs6VarG = yhk.g(qh9Var.s("view").g());
            bh9 bh9VarS7 = qh9Var.s("usr");
            it6 it6VarD = bh9VarS7 != null ? pik.d(bh9VarS7.g()) : kt6Var;
            bh9 bh9VarS8 = qh9Var.s("account");
            ds6 ds6VarH = bh9VarS8 != null ? jwj.h(bh9VarS8.g()) : kt6Var;
            bh9 bh9VarS9 = qh9Var.s("connectivity");
            ls6 ls6VarD = bh9VarS9 != null ? uwj.d(bh9VarS9.g()) : kt6Var;
            bh9 bh9VarS10 = qh9Var.s("display");
            us6 us6VarI = bh9VarS10 != null ? ghk.i(bh9VarS10.g()) : kt6Var;
            bh9 bh9VarS11 = qh9Var.s("synthetics");
            gt6 gt6VarE = bh9VarS11 != null ? kik.e(bh9VarS11.g()) : kt6Var;
            bh9 bh9VarS12 = qh9Var.s("ci_test");
            js6 js6VarE = bh9VarS12 != null ? qwj.e(bh9VarS12.g()) : kt6Var;
            bh9 bh9VarS13 = qh9Var.s("os");
            bt6 bt6VarK = bh9VarS13 != null ? fik.k(bh9VarS13.g()) : kt6Var;
            bh9 bh9VarS14 = qh9Var.s("device");
            ts6 ts6VarD = bh9VarS14 != null ? fhk.d(bh9VarS14.g()) : kt6Var;
            rs6 rs6VarH = x2k.h(qh9Var.s("_dd").g());
            bh9 bh9VarS15 = qh9Var.s("context");
            ps6 ps6VarF = bh9VarS15 != null ? dxj.f(bh9VarS15.g()) : kt6Var;
            bh9 bh9VarS16 = qh9Var.s("action");
            es6 es6VarH = bh9VarS16 != null ? kwj.h(bh9VarS16.g()) : kt6Var;
            bh9 bh9VarS17 = qh9Var.s("container");
            ns6 ns6VarC = bh9VarS17 != null ? xwj.c(bh9VarS17.g()) : kt6Var;
            String strM7 = qh9Var.s("type").m();
            vs6 vs6VarH = thk.h(qh9Var.s("error").g());
            bh9 bh9VarS18 = qh9Var.s("freeze");
            ys6 ys6VarF = bh9VarS18 != null ? zhk.f(bh9VarS18.g()) : kt6Var;
            bh9 bh9VarS19 = qh9Var.s("feature_flags");
            ps6 ps6VarF2 = bh9VarS19 != null ? dxj.f(bh9VarS19.g()) : kt6Var;
            if (x44.r(strM7, "error")) {
                return new kt6(jK, fs6VarL, strM2, strM3, strM4, strM5, strM6, ws6VarH, i, xs6VarG, it6VarD, ds6VarH, ls6VarD, us6VarI, gt6VarE, js6VarE, bt6VarK, ts6VarD, rs6VarH, ps6VarF, es6VarH, ns6VarC, vs6VarH, ys6VarF, ps6VarF2);
            }
            throw new IllegalStateException("Check failed.");
        } catch (IllegalStateException e5) {
            e = e5;
            kt6Var = null;
        } catch (NullPointerException e6) {
            e = e6;
            kt6Var = null;
        } catch (NumberFormatException e7) {
            e = e7;
            kt6Var = null;
        }
    }

    public static jwi k(qh9 qh9Var) {
        try {
            return new jwi(qh9Var.s("timestamp").k());
        } catch (IllegalStateException e2) {
            pmf.j("Unable to parse json into type Fcp", e2);
            return null;
        } catch (NullPointerException e3) {
            pmf.j("Unable to parse json into type Fcp", e3);
            return null;
        } catch (NumberFormatException e4) {
            pmf.j("Unable to parse json into type Fcp", e4);
            return null;
        }
    }

    public static nc2 l(n54 n54Var) {
        nc2 nc2Var = n54Var.Z;
        if (nc2Var != null) {
            return nc2Var;
        }
        o54 o54Var = fe5.c;
        nc2 nc2Var2 = new nc2(p54.c(n54Var, o54Var), p54.a(n54Var, p54.c(n54Var, o54Var)), d4c.I(d54.b(fe5.f, p54.c(n54Var, fe5.e)), p54.c(n54Var, o54Var)), d54.b(0.38f, p54.a(n54Var, p54.c(n54Var, o54Var))));
        n54Var.Z = nc2Var2;
        return nc2Var2;
    }

    public static o92 m(c45 c45Var, pz7 pz7Var) {
        c45Var.getClass();
        return mpk.J(new et5(c45Var, o45.E, pz7Var, 3));
    }

    public static final e1a n(String str, ld4 ld4Var, int i) {
        str.getClass();
        e18 e18Var = (e18) ld4Var;
        m7f m7fVar = (m7f) e18Var.j(gr9.b);
        boolean zH = ((((i & 14) ^ 6) > 4 && e18Var.f(str)) || (i & 6) == 4) | e18Var.h(m7fVar);
        Object objN = e18Var.N();
        if (zH || objN == jd4.a) {
            objN = new jy5(str, m7fVar, 7);
            e18Var.k0(objN);
        }
        kce kceVar = jce.a;
        return (e1a) fd9.r0(kceVar.b(e1a.class), oq5.B(kceVar.b(e1a.class)), (bz7) objN, e18Var);
    }

    public static final iqb o(pz7 pz7Var) {
        return new deh(pz7Var);
    }

    public static final List p(String str) {
        str.getClass();
        return bnf.e0(new rn7(new pp0(4, str), new f7d(4), enf.E));
    }
}
