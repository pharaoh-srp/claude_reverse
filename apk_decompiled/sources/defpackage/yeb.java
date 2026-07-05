package defpackage;

import androidx.compose.foundation.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.types.strings.ToolUseId;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class yeb {
    public static final long a = d4c.o(4279986098L);
    public static final long b = d4c.o(4285836258L);
    public static final long c = d4c.o(2150401243L);
    public static final long d = d4c.m(1725163000);
    public static final long e = d4c.m(1713127266);
    public static final long f = d4c.o(4281348142L);
    public static final /* synthetic */ int g = 0;

    public static final void a(String str, String str2, boolean z, zy7 zy7Var, iqb iqbVar, ld4 ld4Var, int i) {
        e18 e18Var;
        iqb iqbVar2;
        long j;
        int i2;
        long j2;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(1927073141);
        int i3 = i | (e18Var2.f(str) ? 4 : 2) | (e18Var2.f(str2) ? 32 : 16) | (e18Var2.g(z) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var2.h(zy7Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE) | 24576;
        if (e18Var2.Q(i3 & 1, (i3 & 9363) != 9362)) {
            boolean zF = v40.F(e18Var2);
            long j3 = z ? zF ? e : d : d54.g;
            long j4 = a;
            if (z) {
                e18Var2.a0(-1391530440);
                e18Var2.p(false);
                j = zF ? b : j4;
            } else {
                e18Var2.a0(-1391472191);
                j = gm3.a(e18Var2).v;
                e18Var2.p(false);
            }
            if (z) {
                e18Var2.a0(-1391385143);
                e18Var2.p(false);
                j2 = zF ? f : d54.d;
                i2 = i3;
            } else {
                e18Var2.a0(-1391312541);
                i2 = i3;
                long j5 = gm3.a(e18Var2).N;
                e18Var2.p(false);
                j2 = j5;
            }
            long j6 = z ? c : d54.g;
            if (z) {
                e18Var2.a0(786407642);
            } else {
                e18Var2.a0(786408604);
                j4 = gm3.a(e18Var2).N;
            }
            e18Var2.p(false);
            long j7 = j4;
            vve vveVarB = xve.b(24.0f);
            wo1 wo1Var = lja.Q;
            fqb fqbVar = fqb.E;
            iqb iqbVarK = gb9.K(b.c(yfd.p(xn5.V(ez1.t(fqbVar, 1.0f, j6, vveVarB), vveVarB), j3, zni.b), false, null, null, null, zy7Var, 15), 8.0f, 6.0f);
            cxe cxeVarA = axe.a(ko0.a, wo1Var, e18Var2, 48);
            int iHashCode = Long.hashCode(e18Var2.T);
            hyc hycVarL = e18Var2.l();
            iqb iqbVarE = kxk.E(e18Var2, iqbVarK);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var2.e0();
            if (e18Var2.S) {
                e18Var2.k(re4Var);
            } else {
                e18Var2.n0();
            }
            z80 z80Var = cd4.f;
            d4c.i0(e18Var2, z80Var, cxeVarA);
            z80 z80Var2 = cd4.e;
            d4c.i0(e18Var2, z80Var2, hycVarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            z80 z80Var3 = cd4.g;
            d4c.i0(e18Var2, z80Var3, numValueOf);
            bx bxVar = cd4.h;
            d4c.h0(e18Var2, bxVar);
            z80 z80Var4 = cd4.d;
            d4c.i0(e18Var2, z80Var4, iqbVarE);
            xo1 xo1Var = lja.K;
            iqb iqbVarP = yfd.p(androidx.compose.foundation.layout.b.o(fqbVar, 28.0f), j, xve.a);
            o5b o5bVarD = dw1.d(xo1Var, false);
            int iHashCode2 = Long.hashCode(e18Var2.T);
            hyc hycVarL2 = e18Var2.l();
            iqb iqbVarE2 = kxk.E(e18Var2, iqbVarP);
            e18Var2.e0();
            if (e18Var2.S) {
                e18Var2.k(re4Var);
            } else {
                e18Var2.n0();
            }
            d4c.i0(e18Var2, z80Var, o5bVarD);
            d4c.i0(e18Var2, z80Var2, hycVarL2);
            ij0.t(iHashCode2, e18Var2, z80Var3, e18Var2, bxVar);
            d4c.i0(e18Var2, z80Var4, iqbVarE2);
            tjh.b(str, null, j2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var2).e.E).j, e18Var2, i2 & 14, 0, 131066);
            e18Var2.p(true);
            kxk.g(e18Var2, androidx.compose.foundation.layout.b.t(fqbVar, 8.0f));
            tjh.b(str2, null, j7, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var2).e.E).i, e18Var2, (i2 >> 3) & 14, 0, 131066);
            e18Var = e18Var2;
            e18Var.p(true);
            iqbVar2 = fqbVar;
        } else {
            e18Var = e18Var2;
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new veb(str, str2, z, zy7Var, iqbVar2, i, 0);
        }
    }

    public static final void b(List list, rd4 rd4Var, bz7 bz7Var, iqb iqbVar, ld4 ld4Var, int i) {
        iqb iqbVar2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(183565075);
        int i2 = i | (e18Var.f(list) ? 4 : 2) | (e18Var.f(rd4Var) ? 32 : 16) | (e18Var.h(bz7Var) ? 256 : FreeTypeConstants.FT_LOAD_PEDANTIC) | 3072;
        if (e18Var.Q(i2 & 1, (i2 & 1171) != 1170)) {
            ho0 ho0Var = new ho0(8.0f, true, new sz6(1));
            qnc qncVarB = gb9.b(8.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2);
            fqb fqbVar = fqb.E;
            iqb iqbVarC = androidx.compose.foundation.layout.b.c(fqbVar, 1.0f);
            boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object objN = e18Var.N();
            if (z || objN == jd4.a) {
                objN = new ny4(list, rd4Var, bz7Var, 27);
                e18Var.k0(objN);
            }
            knk.i(iqbVarC, null, qncVarB, ho0Var, null, null, false, null, (bz7) objN, e18Var, 24960, 490);
            iqbVar2 = fqbVar;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new mm5(list, rd4Var, bz7Var, iqbVar2, i, 23);
        }
    }

    public static final void c(final v0i v0iVar, final String str, final String str2, final String str3, final int i, final boolean z, final boolean z2, final List list, final qhb qhbVar, final pz7 pz7Var, final lvh lvhVar, final iqb iqbVar, ld4 ld4Var, final int i2, final int i3) {
        int i4;
        String str4;
        String str5;
        int i5;
        boolean z3;
        seb sebVar;
        lz1 lz1Var;
        seb sebVar2;
        boolean z4;
        ta4 ta4VarQ0;
        v0iVar.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        pz7Var.getClass();
        lvhVar.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1228987605);
        if ((i2 & 6) == 0) {
            i4 = ((i2 & 8) == 0 ? e18Var.f(v0iVar) : e18Var.h(v0iVar) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            str4 = str;
            i4 |= e18Var.f(str4) ? 32 : 16;
        } else {
            str4 = str;
        }
        if ((i2 & 384) == 0) {
            str5 = str2;
            i4 |= e18Var.f(str5) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        } else {
            str5 = str2;
        }
        if ((i2 & 24576) == 0) {
            i4 |= e18Var.d(i) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if ((i2 & 196608) == 0) {
            i4 |= e18Var.g(z) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i4 |= e18Var.g(z2) ? FreeTypeConstants.FT_LOAD_COLOR : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i4 |= (i2 & 16777216) == 0 ? e18Var.f(list) : e18Var.h(list) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i4 |= e18Var.d(qhbVar == null ? -1 : qhbVar.ordinal()) ? 67108864 : 33554432;
        }
        if ((805306368 & i2) == 0) {
            i4 |= e18Var.h(pz7Var) ? 536870912 : 268435456;
        }
        int i6 = i4;
        if ((i3 & 6) == 0) {
            i5 = i3 | ((i3 & 8) == 0 ? e18Var.f(lvhVar) : e18Var.h(lvhVar) ? 4 : 2);
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= e18Var.f(iqbVar) ? 32 : 16;
        }
        int i7 = i5;
        boolean z5 = true;
        if (e18Var.Q(i6 & 1, ((i6 & 306782355) == 306782354 && (i7 & 19) == 18) ? false : true)) {
            lz1 lz1Var2 = jd4.a;
            ta4 ta4VarQ02 = null;
            if (qhbVar == null || list == null) {
                z3 = false;
                e18Var.a0(1827068547);
                e18Var.p(false);
                sebVar = null;
            } else {
                e18Var.a0(1826944733);
                int i8 = i6 >> 18;
                int i9 = ((i6 >> 3) & 14) | (i8 & 112) | (i8 & 896);
                m7f m7fVar = (m7f) e18Var.j(gr9.b);
                r7i r7iVar = new r7i(ToolUseId.m1157boximpl(str4), list, qhbVar);
                boolean z6 = (((i9 & 112) ^ 48) > 32 && e18Var.h(list)) || (i9 & 48) == 32;
                if ((((i9 & 896) ^ 384) <= 256 || !e18Var.d(qhbVar.ordinal())) && (i9 & 384) != 256) {
                    z5 = false;
                }
                boolean zH = z6 | z5 | e18Var.h(m7fVar);
                Object objN = e18Var.N();
                if (zH || objN == lz1Var2) {
                    objN = new ny4((Object) list, (Object) qhbVar, m7fVar, 26);
                    e18Var.k0(objN);
                }
                sebVar = (seb) fd9.r0(jce.a.b(seb.class), r7iVar, (bz7) objN, e18Var);
                z3 = false;
                e18Var.p(false);
            }
            e18Var.a0(58946347);
            if (qhbVar == qhb.F || qhbVar == qhb.G) {
                e18Var.a0(1880329812);
                lz1Var = lz1Var2;
                sebVar2 = sebVar;
                z4 = z3;
                ta4VarQ0 = fd9.q0(875535713, new mm5(sebVar2, lvhVar, str5, str4, 22), e18Var);
                e18Var.p(z4);
            } else {
                e18Var.a0(1881089343);
                e18Var.p(z3);
                sebVar2 = sebVar;
                lz1Var = lz1Var2;
                z4 = z3;
                ta4VarQ0 = null;
            }
            e18Var.p(z4);
            if (sebVar2 == null) {
                e18Var.a0(1828273051);
                e18Var.p(z4);
            } else {
                e18Var.a0(1828273052);
                ta4VarQ02 = fd9.q0(-1358125529, new nw7(sebVar2, 15, pz7Var), e18Var);
                e18Var.p(z4);
            }
            Object objN2 = e18Var.N();
            if (objN2 == lz1Var) {
                objN2 = new g9b(6);
                e18Var.k0(objN2);
            }
            int i10 = i6 >> 9;
            auk.b(v0iVar, i, z, z2, (zy7) objN2, iqbVar, false, 0L, false, ta4VarQ0, ta4VarQ02, e18Var, (i6 & 14) | 1597440 | (i10 & 112) | (i10 & 896) | (i10 & 7168) | ((i7 << 12) & 458752), 0, 384);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pz7() { // from class: web
                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP0 = x44.p0(i2 | 1);
                    int iP02 = x44.p0(i3);
                    yeb.c(v0iVar, str, str2, str3, i, z, z2, list, qhbVar, pz7Var, lvhVar, iqbVar, (ld4) obj, iP0, iP02);
                    return iei.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0411  */
    /* JADX WARN: Type inference failed for: r10v10, types: [pz7] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(final defpackage.seb r95, defpackage.pz7 r96, defpackage.iqb r97, defpackage.ld4 r98, int r99) {
        /*
            Method dump skipped, instruction units count: 1136
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yeb.d(seb, pz7, iqb, ld4, int):void");
    }

    public static final void e(String str, ld4 ld4Var, int i) {
        e18 e18Var;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(2004771007);
        int i2 = i | (e18Var2.f(str) ? 4 : 2);
        if (e18Var2.Q(i2 & 1, (i2 & 3) != 2)) {
            e18Var = e18Var2;
            tjh.b(str, gb9.L(fqb.E, MTTypesetterKt.kLineSkipLimitMultiplier, 16.0f, 1), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var, (i2 & 14) | 48, 0, 262140);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new yi7(str, i, 18);
        }
    }
}
