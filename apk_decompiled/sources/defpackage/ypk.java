package defpackage;

import android.view.InputDevice;
import android.view.MotionEvent;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.design.icon.a;
import com.anthropic.claude.types.strings.DirectoryServerId;
import com.pvporbit.freetype.FreeTypeConstants;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ypk {
    public static final ta4 a = new ta4(1880401859, false, new ub4(17));
    public static final ta4 b = new ta4(-313065288, false, new ub4(18));

    public static final void a(int i, ld4 ld4Var, zy7 zy7Var, iqb iqbVar, String str, boolean z) {
        String str2;
        int i2;
        iqb iqbVar2;
        long j;
        long j2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1276539092);
        if ((i & 6) == 0) {
            str2 = str;
            i2 = (e18Var.f(str2) ? 4 : 2) | i;
        } else {
            str2 = str;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.g(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.h(zy7Var) ? 256 : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        int i3 = i2 | 3072;
        if (e18Var.Q(i3 & 1, (i3 & 1171) != 1170)) {
            xo1 xo1Var = lja.K;
            vve vveVar = xve.a;
            fqb fqbVar = fqb.E;
            iqb iqbVarV = xn5.V(fqbVar, vveVar);
            if (z) {
                e18Var.a0(-1606569735);
                j = gm3.a(e18Var).q;
                e18Var.p(false);
            } else {
                e18Var.a0(-1606569185);
                e18Var.p(false);
                j = d54.g;
            }
            iqb iqbVarP = yfd.p(iqbVarV, j, zni.b);
            vue vueVar = new vue(3);
            boolean z2 = (i3 & 896) == 256;
            Object objN = e18Var.N();
            if (z2 || objN == jd4.a) {
                objN = new kw0(6, zy7Var);
                e18Var.k0(objN);
            }
            iqb iqbVarL = gb9.L(b.e(kzj.h(iqbVarP, z, false, vueVar, (bz7) objN, 10), 32.0f), 16.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2);
            o5b o5bVarD = dw1.d(xo1Var, false);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarL);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, cd4.f, o5bVarD);
            d4c.i0(e18Var, cd4.e, hycVarL);
            d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var, cd4.h);
            d4c.i0(e18Var, cd4.d, iqbVarE);
            tkh tkhVar = ((jm3) gm3.c(e18Var).e.E).g;
            if (z) {
                e18Var.a0(1671840001);
                j2 = gm3.a(e18Var).M;
            } else {
                e18Var.a0(1671841025);
                j2 = gm3.a(e18Var).O;
            }
            e18Var.p(false);
            tjh.b(str2, null, j2, 0L, null, null, null, 0L, null, new fdh(3), 0L, 0, false, 1, 0, null, tkhVar, e18Var, i3 & 14, 24576, 113658);
            e18Var.p(true);
            iqbVar2 = fqbVar;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new mx3(str, z, zy7Var, iqbVar2, i, 2);
        }
    }

    public static final void b(f56 f56Var, bz7 bz7Var, zy7 zy7Var, iqb iqbVar, ld4 ld4Var, int i) {
        iqb iqbVar2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(417537058);
        int i2 = i | (e18Var.d(f56Var == null ? -1 : f56Var.ordinal()) ? 4 : 2) | (e18Var.h(bz7Var) ? 32 : 16) | (e18Var.h(zy7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC);
        int i3 = 1;
        if (e18Var.Q(i2 & 1, (i2 & 1171) != 1170)) {
            ho0 ho0Var = new ho0(8.0f, true, new sz6(i3));
            wo1 wo1Var = lja.Q;
            iqbVar2 = iqbVar;
            iqb iqbVarL = gb9.L(mpk.b0(iqbVar2, mpk.Y(e18Var), false), 16.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2);
            cxe cxeVarA = axe.a(ho0Var, wo1Var, e18Var, 54);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarL);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, cd4.f, cxeVarA);
            d4c.i0(e18Var, cd4.e, hycVarL);
            d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var, cd4.h);
            d4c.i0(e18Var, cd4.d, iqbVarE);
            a(i2 & 896, e18Var, zy7Var, null, d4c.j0(R.string.connector_directory_category_all, e18Var), f56Var == null);
            e18Var.a0(1232150612);
            for (f56 f56Var2 : f56.H) {
                String strJ0 = d4c.j0(f56Var2.F, e18Var);
                boolean z = f56Var2 == f56Var;
                boolean zD = ((i2 & 112) == 32) | e18Var.d(f56Var2.ordinal());
                Object objN = e18Var.N();
                if (zD || objN == jd4.a) {
                    objN = new d44(bz7Var, 6, f56Var2);
                    e18Var.k0(objN);
                }
                a(0, e18Var, (zy7) objN, null, strJ0, z);
            }
            e18Var.p(false);
            e18Var.p(true);
        } else {
            iqbVar2 = iqbVar;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new fn(f56Var, bz7Var, zy7Var, iqbVar2, i, 23);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:156:0x0391 A[PHI: r5
      0x0391: PHI (r5v26 hi4) = (r5v23 hi4), (r5v27 hi4) binds: [B:155:0x038f, B:151:0x0388] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x023a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(defpackage.uj4 r45, defpackage.bz7 r46, defpackage.iqb r47, float r48, defpackage.hi4 r49, defpackage.ld4 r50, int r51, int r52) {
        /*
            Method dump skipped, instruction units count: 1092
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ypk.c(uj4, bz7, iqb, float, hi4, ld4, int, int):void");
    }

    public static final void d(int i, int i2, ld4 ld4Var, iqb iqbVar, String str) {
        int i3;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(427635346);
        if ((i & 6) == 0) {
            i3 = (e18Var.f(str) ? 4 : 2) | i;
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
            xo1 xo1Var = lja.K;
            iqb iqbVarC = b.c(iqbVar, 1.0f);
            o5b o5bVarD = dw1.d(xo1Var, false);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarC);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, cd4.f, o5bVarD);
            d4c.i0(e18Var, cd4.e, hycVarL);
            d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var, cd4.h);
            d4c.i0(e18Var, cd4.d, iqbVarE);
            if (bsg.I0(str)) {
                e18Var.a0(1300230589);
                pvj.b(a.a(ud0.B1, e18Var), d4c.j0(R.string.connector_directory_empty_title, e18Var), null, null, e18Var, 8, 12);
                e18Var = e18Var;
                e18Var.p(false);
            } else {
                e18Var.a0(1300166047);
                xb5.b(str, null, null, e18Var, i3 & 14, 6);
                e18Var.p(false);
            }
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        iqb iqbVar2 = iqbVar;
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new sf2(str, iqbVar2, i, i2, 1);
        }
    }

    public static final void e(zy7 zy7Var, iqb iqbVar, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(970379682);
        if ((i & 6) == 0) {
            i2 = (e18Var.h(zy7Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.f(iqbVar) ? 32 : 16;
        }
        int i3 = i2;
        int i4 = 0;
        if (e18Var.Q(i3 & 1, (i3 & 19) != 18)) {
            vo1 vo1Var = lja.T;
            ho0 ho0Var = new ho0(16.0f, false, new do0(i4, lja.Q));
            iqb iqbVarC = b.c(iqbVar, 1.0f);
            q64 q64VarA = p64.a(ho0Var, vo1Var, e18Var, 54);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarC);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, cd4.f, q64VarA);
            d4c.i0(e18Var, cd4.e, hycVarL);
            d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var, cd4.h);
            d4c.i0(e18Var, cd4.d, iqbVarE);
            pvj.b(a.a(ud0.I1, e18Var), d4c.j0(R.string.connector_directory_error_title, e18Var), null, null, e18Var, 8, 12);
            dtj.a(d4c.j0(R.string.connector_directory_retry, e18Var), null, false, null, f12.a, y02.a, 0L, zy7Var, e18Var, ((i3 << 21) & 29360128) | 221184, 78);
            e18Var = e18Var;
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new mu(zy7Var, iqbVar, i, 11);
        }
    }

    public static final void f(uj4 uj4Var, iqb iqbVar, ld4 ld4Var, int i) {
        uj4Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1047583034);
        int i2 = (e18Var.h(uj4Var) ? 4 : 2) | i | 48;
        int i3 = 1;
        if (e18Var.Q(i2 & 1, (i2 & 19) != 18)) {
            nwb nwbVarU = mpk.u(uj4Var.i, e18Var);
            nwb nwbVarU2 = mpk.u(uj4Var.g, e18Var);
            n56 n56Var = (n56) nwbVarU.getValue();
            boolean zI0 = bsg.I0((String) nwbVarU2.getValue());
            boolean z = (i2 & 14) == 4 || e18Var.h(uj4Var);
            Object objN = e18Var.N();
            if (z || objN == jd4.a) {
                objN = new py3(i3, uj4Var);
                e18Var.k0(objN);
            }
            fqb fqbVar = fqb.E;
            g(n56Var, zI0, (bz7) objN, fqbVar, e18Var, 3072);
            iqbVar = fqbVar;
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new t04(uj4Var, iqbVar, i, 13);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void g(n56 n56Var, boolean z, bz7 bz7Var, iqb iqbVar, ld4 ld4Var, int i) {
        int i2;
        boolean z2;
        bz7 bz7Var2 = bz7Var;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-400739229);
        if ((i & 6) == 0) {
            i2 = (e18Var.d(n56Var.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.g(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.h(bz7Var2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var.f(iqbVar) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if (e18Var.Q(i2 & 1, (i2 & 1171) != 1170)) {
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (objN == lz1Var) {
                objN = mpk.P(Boolean.FALSE);
                e18Var.k0(objN);
            }
            nwb nwbVar = (nwb) objN;
            boolean z3 = n56Var != n56.F;
            String strJ0 = d4c.j0(R.string.connector_directory_sort_active, e18Var);
            o5b o5bVarD = dw1.d(lja.G, false);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVar);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, cd4.f, o5bVarD);
            d4c.i0(e18Var, cd4.e, hycVarL);
            d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var, cd4.h);
            d4c.i0(e18Var, cd4.d, iqbVarE);
            boolean zG = e18Var.g(z3) | e18Var.f(strJ0);
            Object objN2 = e18Var.N();
            if (zG || objN2 == lz1Var) {
                z2 = false;
                objN2 = new xj4(z3, strJ0, (int) (0 == true ? 1 : 0));
                e18Var.k0(objN2);
            } else {
                z2 = false;
            }
            iqb iqbVarB = tjf.b(fqb.E, z2, (bz7) objN2);
            Object objN3 = e18Var.N();
            if (objN3 == lz1Var) {
                objN3 = new vi4(3, nwbVar);
                e18Var.k0(objN3);
            }
            ez1.e((zy7) objN3, iqbVarB, z, null, null, fd9.q0(614571327, new tp(z3, 7), e18Var), e18Var, ((i2 << 3) & 896) | 1572870, 56);
            boolean zBooleanValue = ((Boolean) nwbVar.getValue()).booleanValue();
            Object objN4 = e18Var.N();
            if (objN4 == lz1Var) {
                objN4 = new vi4(2, nwbVar);
                e18Var.k0(objN4);
            }
            zy7 zy7Var = (zy7) objN4;
            bz7Var2 = bz7Var;
            j8.b(zBooleanValue, zy7Var, null, 0L, null, null, null, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, fd9.q0(-811156582, new xg4((Object) n56Var, bz7Var2, (Object) nwbVar, 1), e18Var), e18Var, 48, 2044);
            e18Var = e18Var;
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new en3(n56Var, z, bz7Var2, iqbVar, i, 2);
        }
    }

    public static final void h(final List list, final x0a x0aVar, final bz7 bz7Var, final String str, final LocalDate localDate, final boolean z, final boolean z2, final zy7 zy7Var, final bz7 bz7Var2, final bz7 bz7Var3, final iqb iqbVar, float f, pz7 pz7Var, pz7 pz7Var2, ld4 ld4Var, final int i, final int i2, final int i3) {
        int i4;
        bz7 bz7Var4;
        int i5;
        int i6;
        int i7;
        int i8;
        e18 e18Var;
        float f2;
        final pz7 pz7Var3;
        final pz7 pz7Var4;
        int i9;
        ho0 ho0Var;
        e18 e18Var2;
        pz7 pz7Var5;
        pz7 pz7Var6;
        e18 e18Var3 = (e18) ld4Var;
        e18Var3.c0(1034080740);
        if ((i & 6) == 0) {
            i4 = ((i & 8) == 0 ? e18Var3.f(list) : e18Var3.h(list) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= e18Var3.f(x0aVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            bz7Var4 = bz7Var;
            i4 |= e18Var3.h(bz7Var4) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        } else {
            bz7Var4 = bz7Var;
        }
        int i10 = i & 3072;
        int i11 = FreeTypeConstants.FT_LOAD_NO_RECURSE;
        if (i10 == 0) {
            i4 |= e18Var3.f(str != null ? DirectoryServerId.m999boximpl(str) : null) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : 1024;
        }
        if ((i & 24576) == 0) {
            i4 |= e18Var3.h(localDate) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if ((196608 & i) == 0) {
            i4 |= e18Var3.g(z) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i4 |= e18Var3.g(z2) ? FreeTypeConstants.FT_LOAD_COLOR : 524288;
        }
        if ((i & 12582912) == 0) {
            i4 |= e18Var3.h(zy7Var) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i4 |= e18Var3.h(bz7Var2) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i4 |= e18Var3.h(bz7Var3) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i5 = i2 | (e18Var3.f(iqbVar) ? 4 : 2);
        } else {
            i5 = i2;
        }
        int i12 = i3 & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM;
        if (i12 != 0) {
            i5 |= 48;
            i6 = i12;
        } else if ((i2 & 48) == 0) {
            i6 = i12;
            i5 |= e18Var3.c(f) ? 32 : 16;
        } else {
            i6 = i12;
        }
        int i13 = i5;
        int i14 = i3 & FreeTypeConstants.FT_LOAD_MONOCHROME;
        if (i14 != 0) {
            i7 = i13 | 384;
        } else {
            int i15 = i13;
            if ((i2 & 384) == 0) {
                i15 |= e18Var3.h(pz7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
            }
            i7 = i15;
        }
        int i16 = i3 & FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        if (i16 != 0) {
            i8 = i7 | 3072;
        } else {
            int i17 = i7;
            if ((i2 & 3072) == 0) {
                if (e18Var3.h(pz7Var2)) {
                    i11 = FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM;
                }
                i8 = i17 | i11;
            } else {
                i8 = i17;
            }
        }
        if (e18Var3.Q(i4 & 1, ((i4 & 306783379) == 306783378 && (i8 & 1171) == 1170) ? false : true)) {
            f2 = i6 != 0 ? MTTypesetterKt.kLineSkipLimitMultiplier : f;
            pz7 pz7Var7 = i14 != 0 ? null : pz7Var;
            pz7 pz7Var8 = i16 == 0 ? pz7Var2 : null;
            o5b o5bVarD = dw1.d(lja.G, false);
            pz7 pz7Var9 = pz7Var7;
            int iHashCode = Long.hashCode(e18Var3.T);
            hyc hycVarL = e18Var3.l();
            iqb iqbVarE = kxk.E(e18Var3, iqbVar);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var3.e0();
            if (e18Var3.S) {
                e18Var3.k(re4Var);
            } else {
                e18Var3.n0();
            }
            d4c.i0(e18Var3, cd4.f, o5bVarD);
            d4c.i0(e18Var3, cd4.e, hycVarL);
            d4c.i0(e18Var3, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var3, cd4.h);
            d4c.i0(e18Var3, cd4.d, iqbVarE);
            ho0 ho0Var2 = new ho0(8.0f, true, new sz6(1));
            qnc qncVarD = gb9.d(MTTypesetterKt.kLineSkipLimitMultiplier, 8.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 8.0f + f2, 5);
            FillElement fillElement = b.c;
            boolean zH = ((i8 & 7168) == 2048) | ((i8 & 896) == 256) | ((i4 & 14) == 4 || ((i4 & 8) != 0 && e18Var3.h(list))) | ((i4 & 896) == 256) | ((i4 & 7168) == 2048) | e18Var3.h(localDate) | ((234881024 & i4) == 67108864) | ((1879048192 & i4) == 536870912) | ((3670016 & i4) == 1048576) | ((29360128 & i4) == 8388608);
            Object objN = e18Var3.N();
            if (zH || objN == jd4.a) {
                i9 = i4;
                ho0Var = ho0Var2;
                pz7 pz7Var10 = pz7Var8;
                e18Var2 = e18Var3;
                qd2 qd2Var = new qd2(pz7Var9, list, pz7Var10, z2, bz7Var4, str, localDate, bz7Var2, bz7Var3, zy7Var);
                pz7Var5 = pz7Var9;
                pz7Var6 = pz7Var10;
                e18Var2.k0(qd2Var);
                objN = qd2Var;
            } else {
                pz7Var5 = pz7Var9;
                i9 = i4;
                ho0Var = ho0Var2;
                pz7Var6 = pz7Var8;
                e18Var2 = e18Var3;
            }
            e18 e18Var4 = e18Var2;
            knk.h(fillElement, x0aVar, qncVarD, false, ho0Var, null, null, false, null, (bz7) objN, e18Var4, (i9 & 112) | 24582, 488);
            e18Var = e18Var4;
            if (z) {
                e18Var.a0(1884336376);
                long j = gm3.a(e18Var).N;
                iqb iqbVarN = gb9.N(nw1.a.a(fqb.E, lja.H), MTTypesetterKt.kLineSkipLimitMultiplier, 12.0f, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 13);
                vve vveVar = xve.a;
                tjd.a(b.o(gb9.J(yfd.p(xn5.t0(iqbVarN, 2.0f, vveVar, 0L, 0L, 28), gm3.a(e18Var).o, vveVar), 4.0f), 20.0f), j, 2.0f, 0L, 0, MTTypesetterKt.kLineSkipLimitMultiplier, e18Var, 384, 56);
                e18Var.p(false);
            } else {
                e18Var.a0(1884788356);
                e18Var.p(false);
            }
            e18Var.p(true);
            pz7Var3 = pz7Var5;
            pz7Var4 = pz7Var6;
        } else {
            e18Var = e18Var3;
            e18Var.T();
            f2 = f;
            pz7Var3 = pz7Var;
            pz7Var4 = pz7Var2;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            final float f3 = f2;
            r7eVarS.d = new pz7() { // from class: wj4
                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP0 = x44.p0(i | 1);
                    int iP02 = x44.p0(i2);
                    ypk.h(list, x0aVar, bz7Var, str, localDate, z, z2, zy7Var, bz7Var2, bz7Var3, iqbVar, f3, pz7Var3, pz7Var4, (ld4) obj, iP0, iP02, i3);
                    return iei.a;
                }
            };
        }
    }

    public static final void i(iqb iqbVar, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(555724106);
        int i2 = (e18Var.f(iqbVar) ? 4 : 2) | i;
        if (e18Var.Q(i2 & 1, (i2 & 3) != 2)) {
            xo1 xo1Var = lja.K;
            iqb iqbVarC = b.c(iqbVar, 1.0f);
            o5b o5bVarD = dw1.d(xo1Var, false);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarC);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, cd4.f, o5bVarD);
            d4c.i0(e18Var, cd4.e, hycVarL);
            d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var, cd4.h);
            d4c.i0(e18Var, cd4.d, iqbVarE);
            tjd.a(null, gm3.a(e18Var).N, MTTypesetterKt.kLineSkipLimitMultiplier, 0L, 0, MTTypesetterKt.kLineSkipLimitMultiplier, e18Var, 0, 61);
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new fl(i, 15, iqbVar);
        }
    }

    public static final void j(bz7 bz7Var, zy7 zy7Var, iqb iqbVar, uj4 uj4Var, ld4 ld4Var, int i) {
        e18 e18Var;
        iqb iqbVar2;
        uj4 uj4Var2;
        uj4 uj4VarF;
        bz7Var.getClass();
        zy7Var.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(380890757);
        int i2 = 2;
        int i3 = i | (e18Var2.h(bz7Var) ? 4 : 2) | (e18Var2.h(zy7Var) ? 32 : 16) | 1408;
        if (e18Var2.Q(i3 & 1, (i3 & 1171) != 1170)) {
            e18Var2.V();
            if ((i & 1) == 0 || e18Var2.A()) {
                uj4VarF = xpk.f(e18Var2);
                iqbVar2 = fqb.E;
            } else {
                e18Var2.T();
                iqbVar2 = iqbVar;
                uj4VarF = uj4Var;
            }
            e18Var2.q();
            Object objN = e18Var2.N();
            if (objN == jd4.a) {
                objN = sq6.p(e18Var2);
            }
            ybg ybgVar = (ybg) objN;
            WeakHashMap weakHashMap = gdj.x;
            e18Var = e18Var2;
            v40.b(iqbVar2, null, fd9.q0(-1818083832, new t04(zy7Var, uj4VarF), e18Var2), kb4.b, fd9.q0(691480202, new rn(ybgVar, 7), e18Var2), null, 0, 0L, 0L, s4i.d(e18Var2).l, MTTypesetterKt.kLineSkipLimitMultiplier, fd9.q0(573663931, new xg4((Object) uj4VarF, (Object) ybgVar, bz7Var, i2), e18Var2), e18Var, 28038, 1506);
            uj4Var2 = uj4VarF;
        } else {
            e18Var = e18Var2;
            e18Var.T();
            iqbVar2 = iqbVar;
            uj4Var2 = uj4Var;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new fn(bz7Var, zy7Var, iqbVar2, uj4Var2, i);
        }
    }

    public static final void k(ni6 ni6Var, ta4 ta4Var, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1991437157);
        if ((((e18Var.f(ni6Var) ? 4 : 2) | i) & 19) == 18 && e18Var.C()) {
            e18Var.T();
        } else {
            e18Var.V();
            if ((i & 1) != 0 && !e18Var.A()) {
                e18Var.T();
            }
            e18Var.q();
            j8.c(te4.e.a(ni6Var), ta4Var, e18Var, 48);
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new um5(ni6Var, ta4Var, i, 17);
        }
    }

    public static final long l(long j, l9e l9eVar) {
        int i = (int) (j >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(i);
        float fIntBitsToFloat2 = l9eVar.a;
        if (fIntBitsToFloat >= fIntBitsToFloat2) {
            float fIntBitsToFloat3 = Float.intBitsToFloat(i);
            fIntBitsToFloat2 = l9eVar.c;
            if (fIntBitsToFloat3 <= fIntBitsToFloat2) {
                fIntBitsToFloat2 = Float.intBitsToFloat(i);
            }
        }
        int i2 = (int) (j & 4294967295L);
        float fIntBitsToFloat4 = Float.intBitsToFloat(i2);
        float fIntBitsToFloat5 = l9eVar.b;
        if (fIntBitsToFloat4 >= fIntBitsToFloat5) {
            float fIntBitsToFloat6 = Float.intBitsToFloat(i2);
            fIntBitsToFloat5 = l9eVar.d;
            if (fIntBitsToFloat6 <= fIntBitsToFloat5) {
                fIntBitsToFloat5 = Float.intBitsToFloat(i2);
            }
        }
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat5)) & 4294967295L);
    }

    public static final HashSet m(Iterable iterable) {
        HashSet hashSet = new HashSet();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Set setC = ((fab) it.next()).c();
            if (setC == null) {
                return null;
            }
            b54.t0(hashSet, setC);
        }
        return hashSet;
    }

    public static xoe n(qh9 qh9Var) {
        try {
            String strM = qh9Var.s("name").m();
            String strM2 = qh9Var.s("version").m();
            bh9 bh9VarS = qh9Var.s("build");
            String strM3 = bh9VarS != null ? bh9VarS.m() : null;
            String strM4 = qh9Var.s("version_major").m();
            strM.getClass();
            strM2.getClass();
            strM4.getClass();
            return new xoe(strM, strM2, strM3, strM4);
        } catch (IllegalStateException e) {
            pmf.j("Unable to parse json into type Os", e);
            return null;
        } catch (NullPointerException e2) {
            pmf.j("Unable to parse json into type Os", e2);
            return null;
        } catch (NumberFormatException e3) {
            pmf.j("Unable to parse json into type Os", e3);
            return null;
        }
    }

    public static final MotionEvent o(s20 s20Var) {
        return (MotionEvent) s20Var.G;
    }

    public static final int p(MotionEvent motionEvent) {
        if (!motionEvent.isFromSource(FreeTypeConstants.FT_LOAD_COMPUTE_METRICS)) {
            sz6.p("MotionEvent must be a touch navigation source");
            return 0;
        }
        InputDevice device = motionEvent.getDevice();
        if (device != null) {
            InputDevice.MotionRange motionRange = device.getMotionRange(0);
            InputDevice.MotionRange motionRange2 = device.getMotionRange(1);
            if (motionRange == null || motionRange2 != null) {
                if (motionRange2 != null && motionRange == null) {
                    return 2;
                }
                if (motionRange != null && motionRange2 != null) {
                    float range = motionRange.getRange();
                    float range2 = motionRange2.getRange();
                    if (range <= range2 || (range2 != MTTypesetterKt.kLineSkipLimitMultiplier && range / range2 < 5.0f)) {
                        if (range2 > range && (range == MTTypesetterKt.kLineSkipLimitMultiplier || range2 / range >= 5.0f)) {
                            return 2;
                        }
                    }
                }
            }
            return 1;
        }
        return 0;
    }

    public static boolean q(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
