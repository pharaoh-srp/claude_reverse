package defpackage;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public abstract class ycj {
    /* JADX WARN: Multi-variable type inference failed */
    public static mxi a(qh9 qh9Var) {
        mxi mxiVar;
        int i;
        String strM;
        qh9Var.getClass();
        try {
            long jK = qh9Var.s("date").k();
            svi sviVarA = mbj.a(qh9Var.s("application").g());
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
            jxi jxiVarA = kak.a(qh9Var.s("session").g());
            bh9 bh9VarS6 = qh9Var.s("source");
            int i2 = 0;
            if (bh9VarS6 != null && (strM = bh9VarS6.m()) != null) {
                int[] iArrH = sq6.H(11);
                mxiVar = null;
                try {
                    int length = iArrH.length;
                    while (i2 < length) {
                        int i3 = iArrH[i2];
                        int i4 = length;
                        if (kgh.j(i3).equals(strM)) {
                            i = i3;
                        } else {
                            i2++;
                            length = i4;
                        }
                    }
                    throw new NoSuchElementException("Array contains no element matching the predicate.");
                } catch (IllegalStateException e) {
                    e = e;
                    pmf.j("Unable to parse json into type ViewEvent", e);
                    return mxiVar;
                } catch (NullPointerException e2) {
                    e = e2;
                    pmf.j("Unable to parse json into type ViewEvent", e);
                    return mxiVar;
                } catch (NumberFormatException e3) {
                    e = e3;
                    pmf.j("Unable to parse json into type ViewEvent", e);
                    return mxiVar;
                }
            }
            mxiVar = null;
            i = 0;
            kxi kxiVarA = iek.a(qh9Var.s("view").g());
            bh9 bh9VarS7 = qh9Var.s("usr");
            ixi ixiVarA = bh9VarS7 != null ? exj.a(bh9VarS7.g()) : mxiVar;
            bh9 bh9VarS8 = qh9Var.s("account");
            qvi qviVarL = bh9VarS8 != null ? bwj.l(bh9VarS8.g()) : mxiVar;
            bh9 bh9VarS9 = qh9Var.s("connectivity");
            wvi wviVarA = bh9VarS9 != null ? mdj.a(bh9VarS9.g()) : mxiVar;
            bh9 bh9VarS10 = qh9Var.s("display");
            gwi gwiVarF = bh9VarS10 != null ? me7.f(bh9VarS10.g()) : mxiVar;
            bh9 bh9VarS11 = qh9Var.s("synthetics");
            hxi hxiVarC = bh9VarS11 != null ? iik.c(bh9VarS11.g()) : mxiVar;
            bh9 bh9VarS12 = qh9Var.s("ci_test");
            uvi uviVarG = bh9VarS12 != null ? gwj.g(bh9VarS12.g()) : mxiVar;
            bh9 bh9VarS13 = qh9Var.s("os");
            vwi vwiVarA = bh9VarS13 != null ? btj.a(bh9VarS13.g()) : mxiVar;
            bh9 bh9VarS14 = qh9Var.s("device");
            fwi fwiVarB = bh9VarS14 != null ? rij.b(bh9VarS14.g()) : mxiVar;
            cwi cwiVarA = qfj.a(qh9Var.s("_dd").g());
            bh9 bh9VarS15 = qh9Var.s("context");
            zvi zviVarA = bh9VarS15 != null ? ndj.a(bh9VarS15.g()) : mxiVar;
            bh9 bh9VarS16 = qh9Var.s("container");
            xvi xviVarI = bh9VarS16 != null ? jwj.i(bh9VarS16.g()) : mxiVar;
            bh9 bh9VarS17 = qh9Var.s("feature_flags");
            zvi zviVarA2 = bh9VarS17 != null ? ndj.a(bh9VarS17.g()) : mxiVar;
            bh9 bh9VarS18 = qh9Var.s("privacy");
            bxi bxiVarG = bh9VarS18 != null ? zhk.g(bh9VarS18.g()) : mxiVar;
            if (x44.r(qh9Var.s("type").m(), "view")) {
                return new mxi(jK, sviVarA, strM2, strM3, strM4, strM5, strM6, jxiVarA, i, kxiVarA, ixiVarA, qviVarL, wviVarA, gwiVarF, hxiVarC, uviVarG, vwiVarA, fwiVarB, cwiVarA, zviVarA, xviVarI, zviVarA2, bxiVarG);
            }
            throw new IllegalStateException("Check failed.");
        } catch (IllegalStateException e4) {
            e = e4;
            mxiVar = null;
        } catch (NullPointerException e5) {
            e = e5;
            mxiVar = null;
        } catch (NumberFormatException e6) {
            e = e6;
            mxiVar = null;
        }
    }

    public static int b(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 4) {
            return 2;
        }
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 32) {
            return 5;
        }
        if (i == 64) {
            return 6;
        }
        if (i == 128) {
            return 7;
        }
        if (i == 256) {
            return 8;
        }
        if (i == 512) {
            return 9;
        }
        sz6.p(grc.p(i, "type needs to be >= FIRST and <= LAST, type="));
        return 0;
    }
}
