package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.pvporbit.freetype.FreeTypeConstants;

/* JADX INFO: loaded from: classes2.dex */
public abstract class il {
    public static final long a;
    public static final long b;
    public static final y5f c;

    static {
        lz1 lz1Var = uh6.F;
        zh6 zh6Var = zh6.SECONDS;
        a = v40.Q(60, zh6Var);
        b = v40.Q(3, zh6Var);
        c = new y5f(new q6(7), new te(1));
    }

    public static final void a(ml3 ml3Var, sl slVar, qi3 qi3Var, String str, String str2, zy7 zy7Var, ld4 ld4Var, int i) {
        int i2;
        pgc pgcVar;
        slVar.getClass();
        qi3Var.getClass();
        str.getClass();
        str2.getClass();
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(608648175);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? e18Var.f(ml3Var) : e18Var.h(ml3Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? e18Var.f(slVar) : e18Var.h(slVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? e18Var.f(qi3Var) : e18Var.h(qi3Var) ? 256 : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var.f(str) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i & 24576) == 0) {
            i2 |= e18Var.f(str2) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if ((196608 & i) == 0) {
            i2 |= e18Var.h(zy7Var) ? 131072 : 65536;
        }
        int i3 = 1572864 & i;
        fqb fqbVar = fqb.E;
        if (i3 == 0) {
            i2 |= e18Var.f(fqbVar) ? FreeTypeConstants.FT_LOAD_COLOR : 524288;
        }
        int i4 = i2;
        if (e18Var.Q(i4 & 1, (599187 & i4) != 599186)) {
            Object[] objArr = new Object[0];
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (objN == lz1Var) {
                objN = new b5(7);
                e18Var.k0(objN);
            }
            nwb nwbVarH = iuj.H(objArr, c, (zy7) objN, e18Var);
            int i5 = i4 & 896;
            boolean zF = e18Var.f(nwbVarH) | (i5 == 256 || ((i4 & 512) != 0 && e18Var.h(qi3Var)));
            Object objN2 = e18Var.N();
            if (zF || objN2 == lz1Var) {
                objN2 = new g9(qi3Var, nwbVarH, null, 3);
                e18Var.k0(objN2);
            }
            fd9.i(e18Var, (pz7) objN2, iei.a);
            pgc pgcVar2 = (pgc) nwbVarH.getValue();
            boolean zF2 = ((i4 & 112) == 32 || ((i4 & 64) != 0 && e18Var.h(slVar))) | e18Var.f(nwbVarH) | (i5 == 256 || ((i4 & 512) != 0 && e18Var.h(qi3Var)));
            Object objN3 = e18Var.N();
            if (zF2 || objN3 == lz1Var) {
                pgcVar = pgcVar2;
                o0 o0Var = new o0(slVar, qi3Var, nwbVarH, null, 3);
                e18Var.k0(o0Var);
                objN3 = o0Var;
            } else {
                pgcVar = pgcVar2;
            }
            fd9.i(e18Var, (pz7) objN3, pgcVar);
            oq5.i(fqbVar, fd9.q0(1448766643, new gl(ml3Var, 0), e18Var), null, null, null, 0, gm3.a(e18Var).o, 0L, null, fd9.q0(161970302, new xe(str, str2, qi3Var, nwbVarH, zy7Var, 1), e18Var), e18Var, ((i4 >> 18) & 14) | 805306416, 444);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new hl(ml3Var, slVar, qi3Var, str, str2, zy7Var, i);
        }
    }

    public static final void b(int i, int i2, ld4 ld4Var, iqb iqbVar, String str) {
        iqb iqbVar2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1202713479);
        int i3 = i2 | (e18Var.f(str) ? 32 : 16) | 384;
        if (e18Var.Q(i3 & 1, (i3 & 147) != 146)) {
            wo1 wo1Var = lja.Q;
            fqb fqbVar = fqb.E;
            iqb iqbVarJ = gb9.J(ez1.t(b.c(fqbVar, 1.0f), 1.0f, gm3.a(e18Var).v, gm3.b(e18Var).g), 16.0f);
            cxe cxeVarA = axe.a(ko0.a, wo1Var, e18Var, 48);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarJ);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            z80 z80Var = cd4.f;
            d4c.i0(e18Var, z80Var, cxeVarA);
            z80 z80Var2 = cd4.e;
            d4c.i0(e18Var, z80Var2, hycVarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            z80 z80Var3 = cd4.g;
            d4c.i0(e18Var, z80Var3, numValueOf);
            bx bxVar = cd4.h;
            d4c.h0(e18Var, bxVar);
            z80 z80Var4 = cd4.d;
            d4c.i0(e18Var, z80Var4, iqbVarE);
            xo1 xo1Var = lja.K;
            iqb iqbVarP = yfd.p(b.o(fqbVar, 24.0f), gm3.a(e18Var).q, xve.a);
            o5b o5bVarD = dw1.d(xo1Var, false);
            int iHashCode2 = Long.hashCode(e18Var.T);
            hyc hycVarL2 = e18Var.l();
            iqb iqbVarE2 = kxk.E(e18Var, iqbVarP);
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, z80Var, o5bVarD);
            d4c.i0(e18Var, z80Var2, hycVarL2);
            ij0.t(iHashCode2, e18Var, z80Var3, e18Var, bxVar);
            d4c.i0(e18Var, z80Var4, iqbVarE2);
            tjh.b(String.valueOf(i), null, gm3.a(e18Var).N, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).i, e18Var, 0, 0, 131066);
            e18Var.p(true);
            tjh.b(str, gb9.N(fqbVar, 12.0f, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 14), gm3.a(e18Var).M, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).g, e18Var, ((i3 >> 3) & 14) | 48, 0, 131064);
            e18Var = e18Var;
            e18Var.p(true);
            iqbVar2 = fqbVar;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new el(i, str, iqbVar2, i2);
        }
    }

    public static final void c(String str, iqb iqbVar, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-709864262);
        if ((i & 6) == 0) {
            i2 = (e18Var.f(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (e18Var.Q(i3 & 1, (i3 & 19) != 18)) {
            ho0 ho0Var = new ho0(12.0f, true, new sz6(1));
            fqb fqbVar = fqb.E;
            iqb iqbVarC = b.c(fqbVar, 1.0f);
            q64 q64VarA = p64.a(ho0Var, lja.S, e18Var, 6);
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
            b(1, 6, e18Var, null, gik.l((nrg) drg.z.getValue(), e18Var));
            b(2, 6, e18Var, null, gik.m((nrg) drg.A.getValue(), new Object[]{str}, e18Var));
            b(3, 6, e18Var, null, gik.l((nrg) drg.y.getValue(), e18Var));
            e18Var.p(true);
            iqbVar = fqbVar;
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new el(str, iqbVar, i, 0);
        }
    }

    public static final void d(pgc pgcVar, String str, zy7 zy7Var, zy7 zy7Var2, zy7 zy7Var3, iqb iqbVar, ld4 ld4Var, int i) {
        iqb iqbVar2;
        fqb fqbVar;
        boolean z;
        boolean z2;
        fqb fqbVar2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1745607810);
        int i2 = i | (e18Var.d(pgcVar.ordinal()) ? 4 : 2) | (e18Var.f(str) ? 32 : 16) | (e18Var.h(zy7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var.h(zy7Var2) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE) | (e18Var.h(zy7Var3) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) | 196608;
        if (e18Var.Q(i2 & 1, (74899 & i2) != 74898)) {
            ho0 ho0Var = new ho0(8.0f, true, new sz6(1));
            fqb fqbVar3 = fqb.E;
            iqb iqbVarJ = gb9.J(b.c(fqbVar3, 1.0f), 16.0f);
            q64 q64VarA = p64.a(ho0Var, lja.S, e18Var, 6);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarJ);
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
            int iOrdinal = pgcVar.ordinal();
            f12 f12Var = f12.a;
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    z2 = true;
                    e18Var.a0(749508098);
                    fqbVar2 = fqbVar3;
                    dtj.a(gik.l((nrg) drg.v.getValue(), e18Var), b.c(fqbVar3, 1.0f), false, null, null, null, 0L, zy7Var2, e18Var, ((i2 << 12) & 29360128) | 48, 124);
                    e18Var.p(false);
                } else if (iOrdinal == 2) {
                    fqbVar2 = fqbVar3;
                    z2 = true;
                    e18Var.a0(-530003716);
                    e18Var.p(false);
                } else if (iOrdinal == 3) {
                    z2 = true;
                    e18Var.a0(749822252);
                    fqbVar2 = fqbVar3;
                    dtj.a(gik.l((nrg) drg.R.getValue(), e18Var), b.c(fqbVar3, 1.0f), false, null, f12Var, null, 0L, zy7Var2, e18Var, ((i2 << 12) & 29360128) | 24624, 108);
                    e18Var.p(false);
                } else {
                    if (iOrdinal != 4) {
                        throw ebh.u(e18Var, -530056236, false);
                    }
                    e18Var.a0(750144187);
                    z2 = true;
                    fqbVar2 = fqbVar3;
                    dtj.a(gik.l((nrg) drg.E.getValue(), e18Var), b.c(fqbVar3, 1.0f), false, null, null, null, 0L, zy7Var3, e18Var, ((i2 << 9) & 29360128) | 48, 124);
                    e18Var.p(false);
                }
                z = z2;
                fqbVar = fqbVar2;
            } else {
                e18Var.a0(748145152);
                Context context = (Context) e18Var.j(w00.b);
                String strL = gik.l((nrg) drg.O.getValue(), e18Var);
                String strL2 = gik.l((nrg) drg.w.getValue(), e18Var);
                iqb iqbVarC = b.c(fqbVar3, 1.0f);
                boolean zF = ((i2 & 112) == 32) | e18Var.f(strL) | e18Var.h(context);
                Object objN = e18Var.N();
                if (zF || objN == jd4.a) {
                    objN = new ei(context, strL, str, 1);
                    e18Var.k0(objN);
                }
                fqbVar = fqbVar3;
                dtj.a(strL2, iqbVarC, false, null, f12Var, null, 0L, (zy7) objN, e18Var, 24624, 108);
                dtj.a(gik.l((nrg) drg.H.getValue(), e18Var), b.c(fqbVar, 1.0f), false, null, null, null, 0L, zy7Var, e18Var, ((i2 << 15) & 29360128) | 48, 124);
                f(gb9.N(b.c(fqbVar, 1.0f), MTTypesetterKt.kLineSkipLimitMultiplier, 8.0f, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 13), e18Var, 6);
                e18Var.p(false);
                z = true;
            }
            e18Var.p(z);
            iqbVar2 = fqbVar;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ne((Object) pgcVar, (Object) str, (Object) zy7Var, (qz7) zy7Var2, (qz7) zy7Var3, iqbVar2, i, 1);
        }
    }

    public static final void e(pgc pgcVar, String str, iqb iqbVar, ld4 ld4Var, int i) {
        Object obj;
        sec secVar;
        cpc cpcVar;
        boolean z;
        boolean z2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1789037606);
        int i2 = i | (e18Var.d(pgcVar.ordinal()) ? 4 : 2) | (e18Var.f(str) ? 32 : 16) | 384;
        if (e18Var.Q(i2 & 1, (i2 & 147) != 146)) {
            int iOrdinal = pgcVar.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
                secVar = sec.Connecting;
            } else if (iOrdinal == 3) {
                secVar = sec.Failed;
            } else {
                if (iOrdinal != 4) {
                    wg6.i();
                    return;
                }
                secVar = sec.Connected;
            }
            int iOrdinal2 = pgcVar.ordinal();
            if (iOrdinal2 == 0) {
                cpcVar = new cpc((nrg) drg.D.getValue(), (nrg) drg.C.getValue());
            } else if (iOrdinal2 == 1) {
                cpcVar = new cpc((nrg) drg.N.getValue(), null);
            } else if (iOrdinal2 == 2) {
                cpcVar = new cpc((nrg) drg.G.getValue(), (nrg) drg.F.getValue());
            } else if (iOrdinal2 == 3) {
                cpcVar = new cpc((nrg) drg.B.getValue(), (nrg) drg.x.getValue());
            } else {
                if (iOrdinal2 != 4) {
                    wg6.i();
                    return;
                }
                cpcVar = new cpc((nrg) drg.Q.getValue(), (nrg) drg.P.getValue());
            }
            nrg nrgVar = (nrg) cpcVar.E;
            nrg nrgVar2 = (nrg) cpcVar.F;
            vo1 vo1Var = lja.T;
            fqb fqbVar = fqb.E;
            iqb iqbVarN = gb9.N(gb9.L(b.c(fqbVar, 1.0f), 24.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2), MTTypesetterKt.kLineSkipLimitMultiplier, 48.0f, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 13);
            q64 q64VarA = p64.a(ko0.c, vo1Var, e18Var, 48);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarN);
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
            lvk.a(secVar, null, e18Var, 0);
            kxk.g(e18Var, b.e(fqbVar, 32.0f));
            tjh.b(gik.l(nrgVar, e18Var), null, gm3.a(e18Var).M, 0L, null, null, null, 0L, null, new fdh(3), 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).a, e18Var, 0, 0, 130042);
            e18Var = e18Var;
            if (nrgVar2 != null) {
                sq6.A(16.0f, -1231470548, e18Var, e18Var, fqbVar);
                tjh.b(gik.l(nrgVar2, e18Var), null, gm3.a(e18Var).N, 0L, null, null, null, 0L, null, new fdh(3), 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).e, e18Var, 0, 0, 130042);
                e18Var = e18Var;
                z = false;
                e18Var.p(false);
            } else {
                z = false;
                e18Var.a0(-1231188014);
                e18Var.p(false);
            }
            int iOrdinal3 = pgcVar.ordinal();
            if (iOrdinal3 != 0) {
                z2 = true;
                if (iOrdinal3 == 1) {
                    sq6.A(32.0f, -1231124898, e18Var, e18Var, fqbVar);
                    g(str, null, e18Var, (i2 >> 3) & 14);
                    e18Var.p(z);
                } else if (iOrdinal3 == 2) {
                    sq6.A(48.0f, -1230970859, e18Var, e18Var, fqbVar);
                    ez1.a(null, vf2.J, 0L, e18Var, 48, 5);
                    e18Var.p(z);
                } else if (iOrdinal3 == 3) {
                    sq6.A(32.0f, -1230809411, e18Var, e18Var, fqbVar);
                    c(str, null, e18Var, (i2 >> 3) & 14);
                    e18Var.p(z);
                } else if (iOrdinal3 != 4) {
                    throw ebh.u(e18Var, -1702282848, z);
                }
                e18Var.p(z2);
                obj = fqbVar;
            } else {
                z2 = true;
            }
            e18Var.a0(-1702265932);
            e18Var.p(z);
            e18Var.p(z2);
            obj = fqbVar;
        } else {
            e18Var.T();
            obj = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new m6(pgcVar, i, str, obj, 4);
        }
    }

    public static final void f(iqb iqbVar, ld4 ld4Var, int i) {
        e18 e18Var;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(1468345787);
        if (e18Var2.Q(i & 1, (i & 3) != 2)) {
            String strL = gik.l((nrg) drg.I.getValue(), e18Var2);
            String strL2 = gik.l((nrg) drg.J.getValue(), e18Var2);
            long j = gm3.a(e18Var2).k;
            xb0 xb0Var = new xb0();
            xb0Var.h(strL);
            xb0Var.c(' ');
            int iK = xb0Var.k(new n6a(tyg.USE_COWORK_SAFELY.a(), new ekh(new egg(j, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534), null, null, null), 4));
            try {
                xb0Var.h(strL2);
                xb0Var.j(iK);
                e18Var = e18Var2;
                tjh.c(xb0Var.n(), iqbVar, gm3.a(e18Var2).O, 0L, 0L, new fdh(3), 0L, 0, false, 0, 0, null, null, ((jm3) gm3.c(e18Var2).e.E).i, e18Var, 48, 0, 261112);
            } catch (Throwable th) {
                xb0Var.j(iK);
                throw th;
            }
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new fl(i, 0, iqbVar);
        }
    }

    public static final void g(String str, iqb iqbVar, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(401483230);
        if ((i & 6) == 0) {
            i2 = (e18Var.f(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (e18Var.Q(i3 & 1, (i3 & 19) != 18)) {
            ho0 ho0Var = new ho0(12.0f, true, new sz6(1));
            fqb fqbVar = fqb.E;
            iqb iqbVarC = b.c(fqbVar, 1.0f);
            q64 q64VarA = p64.a(ho0Var, lja.S, e18Var, 6);
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
            b(1, 6, e18Var, null, gik.l((nrg) drg.K.getValue(), e18Var));
            b(2, 6, e18Var, null, gik.m((nrg) drg.L.getValue(), new Object[]{str}, e18Var));
            b(3, 6, e18Var, null, gik.l((nrg) drg.M.getValue(), e18Var));
            e18Var.p(true);
            iqbVar = fqbVar;
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new el(str, iqbVar, i, 1);
        }
    }
}
