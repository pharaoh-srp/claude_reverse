package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.pvporbit.freetype.FreeTypeConstants;

/* JADX INFO: loaded from: classes3.dex */
public abstract class i5h {
    static {
        d4c.o(4289226771L);
        d4c.o(4291771709L);
    }

    public static final void a(String str, int i, int i2, String str2, String str3, nad nadVar, zy7 zy7Var, iqb iqbVar, ld4 ld4Var, int i3) {
        long j;
        int i4;
        ud0 ud0Var;
        str.getClass();
        str3.getClass();
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1929197768);
        int i5 = i3 | (e18Var.f(str) ? 4 : 2) | (e18Var.d(i) ? 32 : 16) | (e18Var.d(i2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var.f(str2) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE) | (e18Var.f(str3) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) | (e18Var.d(nadVar.ordinal()) ? 131072 : 65536) | (e18Var.h(zy7Var) ? FreeTypeConstants.FT_LOAD_COLOR : 524288);
        if (e18Var.Q(i5 & 1, (4793491 & i5) != 4793490)) {
            int iOrdinal = nadVar.ordinal();
            if (iOrdinal == 0) {
                e18Var.a0(1466825663);
                j = gm3.a(e18Var).O;
                e18Var.p(false);
            } else if (iOrdinal == 1) {
                e18Var.a0(1466827330);
                j = gm3.a(e18Var).D;
                e18Var.p(false);
            } else if (iOrdinal == 2) {
                e18Var.a0(1466829153);
                j = gm3.a(e18Var).z;
                e18Var.p(false);
            } else {
                if (iOrdinal != 3) {
                    throw ebh.u(e18Var, 1466823948, false);
                }
                e18Var.a0(1466830948);
                j = gm3.a(e18Var).g;
                e18Var.p(false);
            }
            int iOrdinal2 = nadVar.ordinal();
            if (iOrdinal2 == 0) {
                i4 = R.string.ccr_pr_status_draft;
            } else if (iOrdinal2 == 1) {
                i4 = R.string.ccr_pr_status_open;
            } else if (iOrdinal2 == 2) {
                i4 = R.string.ccr_pr_status_closed;
            } else {
                if (iOrdinal2 != 3) {
                    wg6.i();
                    return;
                }
                i4 = R.string.ccr_pr_status_merged;
            }
            String strJ0 = d4c.j0(i4, e18Var);
            int iOrdinal3 = nadVar.ordinal();
            if (iOrdinal3 == 0) {
                ud0Var = ud0.b1;
            } else if (iOrdinal3 == 1) {
                ud0Var = ud0.d1;
            } else if (iOrdinal3 == 2) {
                ud0Var = ud0.a1;
            } else {
                if (iOrdinal3 != 3) {
                    wg6.i();
                    return;
                }
                ud0Var = ud0.c1;
            }
            c(ud0Var, fd9.q0(196029141, new ny3(str2, str, 7), e18Var), fd9.q0(2073298036, new h10(strJ0, j, str3, i, i2), e18Var), zy7Var, iqbVar, nadVar == nad.E ? d54.h : j, 0L, e18Var, ((i5 >> 9) & 7168) | 25008);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new xk1(str, i, i2, str2, str3, nadVar, zy7Var, iqbVar, i3);
        }
    }

    public static final void b(ta4 ta4Var, zy7 zy7Var, iqb iqbVar, ta4 ta4Var2, ld4 ld4Var, int i) {
        int i2;
        zy7 zy7Var2;
        iqb iqbVar2;
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1468393369);
        if ((i & 6) == 0) {
            i2 = (e18Var.h(ta4Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            zy7Var2 = zy7Var;
            i2 |= e18Var.h(zy7Var2) ? 32 : 16;
        } else {
            zy7Var2 = zy7Var;
        }
        if ((i & 384) == 0) {
            iqbVar2 = iqbVar;
            i2 |= e18Var.f(iqbVar2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        } else {
            iqbVar2 = iqbVar;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var.h(null) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i & 24576) == 0) {
            i2 |= e18Var.h(ta4Var2) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if (e18Var.Q(i2 & 1, (i2 & 9363) != 9362)) {
            int i3 = i2 >> 3;
            ghk.a(zy7Var2, iqbVar2, null, null, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, null, fd9.q0(743022258, new h5h(ta4Var, ta4Var2, 1), e18Var), e18Var, (i3 & 14) | 100663296 | (i3 & 112), 252);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new p3h(ta4Var, zy7Var, iqbVar, ta4Var2, i, 1);
        }
    }

    public static final void c(ud0 ud0Var, ta4 ta4Var, ta4 ta4Var2, zy7 zy7Var, iqb iqbVar, long j, long j2, ld4 ld4Var, int i) {
        int i2;
        long j3;
        e18 e18Var;
        long j4;
        zy7Var.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(1696493934);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? e18Var2.f(ud0Var) : e18Var2.h(ud0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var2.h(ta4Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var2.h(ta4Var2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var2.h(zy7Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i & 24576) == 0) {
            i2 |= e18Var2.f(iqbVar) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if ((196608 & i) == 0) {
            j3 = j;
            i2 |= e18Var2.e(j3) ? 131072 : 65536;
        } else {
            j3 = j;
        }
        int i3 = i2 | 920125440;
        if (e18Var2.Q(i3 & 1, (306783379 & i3) != 306783378)) {
            long j5 = d54.h;
            int i4 = i3 >> 6;
            e18Var = e18Var2;
            b(fd9.q0(1461128044, new k66(ud0Var, j3, j5), e18Var2), zy7Var, iqbVar, fd9.q0(835026008, new h5h(ta4Var, ta4Var2, 0), e18Var2), e18Var, (i4 & 896) | (i4 & 112) | 24582 | ((i3 >> 18) & 7168));
            j4 = j5;
        } else {
            e18Var = e18Var2;
            e18Var.T();
            j4 = j2;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new bp7(ud0Var, ta4Var, ta4Var2, zy7Var, iqbVar, j, j4, i);
        }
    }
}
