package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.os.LocaleList;
import android.view.ViewConfiguration;
import androidx.compose.foundation.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.mikepenz.aboutlibraries.Libs;
import com.mikepenz.aboutlibraries.entity.Library;
import com.pvporbit.freetype.FreeTypeConstants;
import java.io.File;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public abstract class xvj {
    public static final ta4 a = new ta4(-580762281, false, new ua4(24));
    public static final String[] b = {"input", "keygen", "object", "select", "textarea"};

    public static final void a(ta4 ta4Var, pz7 pz7Var, pz7 pz7Var2, tkh tkhVar, long j, long j2, ld4 ld4Var, int i) {
        pz7 pz7Var3;
        tkh tkhVar2;
        pz7 pz7Var4;
        int i2;
        boolean z;
        boolean z2;
        long j3 = j2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-321841045);
        int i3 = i | (e18Var.h(ta4Var) ? 4 : 2) | (e18Var.h(pz7Var) ? 32 : 16) | (e18Var.h(pz7Var2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var.f(tkhVar) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE) | (e18Var.e(j) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) | (e18Var.e(j3) ? 131072 : 65536);
        if (e18Var.Q(i3 & 1, (74899 & i3) != 74898)) {
            float f = pz7Var2 == null ? 8.0f : MTTypesetterKt.kLineSkipLimitMultiplier;
            fqb fqbVar = fqb.E;
            iqb iqbVarN = gb9.N(fqbVar, 16.0f, MTTypesetterKt.kLineSkipLimitMultiplier, f, MTTypesetterKt.kLineSkipLimitMultiplier, 10);
            Object objN = e18Var.N();
            if (objN == jd4.a) {
                objN = new t10(7);
                e18Var.k0(objN);
            }
            o5b o5bVar = (o5b) objN;
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
            z80 z80Var = cd4.f;
            d4c.i0(e18Var, z80Var, o5bVar);
            z80 z80Var2 = cd4.e;
            d4c.i0(e18Var, z80Var2, hycVarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            z80 z80Var3 = cd4.g;
            d4c.i0(e18Var, z80Var3, numValueOf);
            bx bxVar = cd4.h;
            d4c.h0(e18Var, bxVar);
            z80 z80Var4 = cd4.d;
            d4c.i0(e18Var, z80Var4, iqbVarE);
            iqb iqbVarL = gb9.L(zni.L(fqbVar, "text"), MTTypesetterKt.kLineSkipLimitMultiplier, 6.0f, 1);
            xo1 xo1Var = lja.G;
            o5b o5bVarD = dw1.d(xo1Var, false);
            int iHashCode2 = Long.hashCode(e18Var.T);
            hyc hycVarL2 = e18Var.l();
            iqb iqbVarE2 = kxk.E(e18Var, iqbVarL);
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
            vb7.y(i3 & 14, ta4Var, e18Var, true);
            if (pz7Var != null) {
                e18Var.a0(989211000);
                iqb iqbVarL2 = zni.L(fqbVar, "action");
                o5b o5bVarD2 = dw1.d(xo1Var, false);
                int iHashCode3 = Long.hashCode(e18Var.T);
                hyc hycVarL3 = e18Var.l();
                iqb iqbVarE3 = kxk.E(e18Var, iqbVarL2);
                e18Var.e0();
                if (e18Var.S) {
                    e18Var.k(re4Var);
                } else {
                    e18Var.n0();
                }
                d4c.i0(e18Var, z80Var, o5bVarD2);
                d4c.i0(e18Var, z80Var2, hycVarL3);
                ij0.t(iHashCode3, e18Var, z80Var3, e18Var, bxVar);
                d4c.i0(e18Var, z80Var4, iqbVarE3);
                tkhVar2 = tkhVar;
                i2 = 8;
                pz7Var4 = pz7Var;
                j8.d(new hvd[]{sq6.m(j, on4.a), tjh.a.a(tkhVar2)}, pz7Var4, e18Var, (i3 & 112) | 8);
                e18Var.p(true);
                z = false;
                e18Var.p(false);
            } else {
                tkhVar2 = tkhVar;
                i2 = 8;
                z = false;
                pz7Var4 = pz7Var;
                e18Var.a0(989526208);
                e18Var.p(false);
            }
            if (pz7Var2 != null) {
                e18Var.a0(989574568);
                iqb iqbVarL3 = zni.L(fqbVar, "dismissAction");
                o5b o5bVarD3 = dw1.d(xo1Var, z);
                int iHashCode4 = Long.hashCode(e18Var.T);
                hyc hycVarL4 = e18Var.l();
                iqb iqbVarE4 = kxk.E(e18Var, iqbVarL3);
                e18Var.e0();
                if (e18Var.S) {
                    e18Var.k(re4Var);
                } else {
                    e18Var.n0();
                }
                d4c.i0(e18Var, z80Var, o5bVarD3);
                d4c.i0(e18Var, z80Var2, hycVarL4);
                ij0.t(iHashCode4, e18Var, z80Var3, e18Var, bxVar);
                d4c.i0(e18Var, z80Var4, iqbVarE4);
                j3 = j2;
                pz7Var3 = pz7Var2;
                j8.c(sq6.m(j3, on4.a), pz7Var3, e18Var, i2 | ((i3 >> 3) & 112));
                z2 = true;
                e18Var.p(true);
                e18Var.p(false);
            } else {
                pz7Var3 = pz7Var2;
                z2 = true;
                j3 = j2;
                e18Var.a0(989843648);
                e18Var.p(z);
            }
            e18Var.p(z2);
        } else {
            pz7Var3 = pz7Var2;
            tkhVar2 = tkhVar;
            pz7Var4 = pz7Var;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new zbg(ta4Var, pz7Var4, pz7Var3, tkhVar2, j, j3, i);
        }
    }

    public static final void b(String str, String str2, bz7 bz7Var, iqb iqbVar, ld4 ld4Var, int i) {
        e18 e18Var;
        iqb iqbVar2;
        fqb fqbVar;
        iqb iqbVar3;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(1664514213);
        int i2 = i | (e18Var2.f(str) ? 4 : 2) | (e18Var2.f(str2) ? 32 : 16) | (e18Var2.h(bz7Var) ? 256 : FreeTypeConstants.FT_LOAD_PEDANTIC) | 3072;
        if (e18Var2.Q(i2 & 1, (i2 & 1171) != 1170)) {
            tkh tkhVar = ((jm3) gm3.c(e18Var2).e.E).g;
            long j = gm3.a(e18Var2).O;
            fqb fqbVar2 = fqb.E;
            if (str2 == null || str2.length() == 0) {
                fqbVar = fqbVar2;
                e18Var2.a0(1870337293);
                e18Var2.p(false);
                iqbVar3 = fqbVar;
            } else {
                e18Var2.a0(1870335574);
                vue vueVar = new vue(0);
                boolean z = ((i2 & 112) == 32) | ((i2 & 896) == 256);
                Object objN = e18Var2.N();
                if (z || objN == jd4.a) {
                    objN = new qn(bz7Var, str2, 4);
                    e18Var2.k0(objN);
                }
                iqb iqbVarC = b.c(fqbVar2, false, null, vueVar, null, (zy7) objN, 11);
                fqbVar = fqbVar2;
                e18Var2.p(false);
                iqbVar3 = iqbVarC;
            }
            e18Var = e18Var2;
            tjh.b(str, gb9.L(iqbVar3, MTTypesetterKt.kLineSkipLimitMultiplier, 2.0f, 1), j, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tkhVar, e18Var, i2 & 14, 0, 131064);
            iqbVar2 = fqbVar;
        } else {
            e18Var = e18Var2;
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new mm5(str, str2, bz7Var, iqbVar2, i, 16);
        }
    }

    public static final void c(Library library, bz7 bz7Var, iqb iqbVar, mnc mncVar, ld4 ld4Var, int i) {
        iqb iqbVar2;
        mnc mncVar2;
        int i2;
        mnc mncVarQ0;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(302578972);
        int i3 = i | (e18Var.h(library) ? 4 : 2) | (e18Var.h(bz7Var) ? 32 : 16) | FreeTypeConstants.FT_LOAD_NO_RECURSE;
        if (e18Var.Q(i3 & 1, (i3 & 1171) != 1170)) {
            e18Var.V();
            if ((i & 1) == 0 || e18Var.A()) {
                i2 = i3 & (-7169);
                mncVarQ0 = xn5.q0(j9a.a, gb9.b(MTTypesetterKt.kLineSkipLimitMultiplier, 8.0f, 1));
            } else {
                e18Var.T();
                i2 = i3 & (-7169);
                mncVarQ0 = mncVar;
            }
            e18Var.q();
            String website = library.getWebsite();
            iqb iqbVarC = fqb.E;
            if (website == null || website.length() == 0) {
                e18Var.a0(-1279370716);
            } else {
                e18Var.a0(-1279372559);
                vue vueVar = new vue(0);
                boolean zF = e18Var.f(website) | ((i2 & 112) == 32);
                Object objN = e18Var.N();
                if (zF || objN == jd4.a) {
                    objN = new qn(bz7Var, website, 3);
                    e18Var.k0(objN);
                }
                iqbVarC = b.c(iqbVarC, false, null, vueVar, null, (zy7) objN, 11);
            }
            e18Var.p(false);
            iqbVar2 = iqbVar;
            kwj.c(gb9.I(iqbVar2.B(iqbVarC), mncVarQ0), MTTypesetterKt.kLineSkipLimitMultiplier, null, fd9.q0(615055791, new nw7(library, 8, bz7Var), e18Var), e18Var, 3072, 6);
            mncVar2 = mncVarQ0;
        } else {
            iqbVar2 = iqbVar;
            e18Var.T();
            mncVar2 = mncVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new mm5(library, bz7Var, iqbVar2, mncVar2, i, 15);
        }
    }

    public static final void d(Libs libs, mnc mncVar, iqb iqbVar, ld4 ld4Var, int i) {
        int i2;
        mnc mncVar2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1290830183);
        if ((i & 6) == 0) {
            i2 = (e18Var.h(libs) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            mncVar2 = mncVar;
            i2 |= e18Var.f(mncVar2) ? 32 : 16;
        } else {
            mncVar2 = mncVar;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.f(iqbVar) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if (e18Var.Q(i2 & 1, (i2 & 147) != 146)) {
            eli eliVar = (eli) e18Var.j(ve4.t);
            boolean zH = e18Var.h(libs) | e18Var.h(eliVar);
            Object objN = e18Var.N();
            if (zH || objN == jd4.a) {
                objN = new f25(libs, 22, eliVar);
                e18Var.k0(objN);
            }
            knk.h(iqbVar, null, mncVar2, false, null, null, null, false, null, (bz7) objN, e18Var, ((i2 >> 6) & 14) | ((i2 << 3) & 896), 506);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new v76(libs, i, mncVar, iqbVar, 9);
        }
    }

    public static final void e(zy7 zy7Var, iqb iqbVar, t3a t3aVar, qi3 qi3Var, ld4 ld4Var, int i) {
        iqb iqbVar2;
        t3a t3aVar2;
        qi3 qi3Var2;
        int i2;
        qi3 qi3Var3;
        t3a t3aVar3;
        iqb iqbVar3;
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1249909873);
        int i3 = i | (e18Var.h(zy7Var) ? 4 : 2) | 1200;
        if (e18Var.Q(i3 & 1, (i3 & 1171) != 1170)) {
            e18Var.V();
            int i4 = i & 1;
            tp4 tp4Var = null;
            lz1 lz1Var = jd4.a;
            if (i4 == 0 || e18Var.A()) {
                m7f m7fVar = (m7f) e18Var.j(gr9.b);
                boolean zH = e18Var.h(m7fVar);
                Object objN = e18Var.N();
                if (zH || objN == lz1Var) {
                    objN = new di(m7fVar, 16);
                    e18Var.k0(objN);
                }
                kce kceVar = jce.a;
                t3a t3aVar4 = (t3a) fd9.r0(kceVar.b(t3a.class), oq5.B(kceVar.b(t3a.class)), (bz7) objN, e18Var);
                m7f m7fVarN = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF = e18Var.f(null) | e18Var.f(m7fVarN);
                Object objN2 = e18Var.N();
                if (zF || objN2 == lz1Var) {
                    objN2 = m7fVarN.a(kceVar.b(qi3.class), null, null);
                    e18Var.k0(objN2);
                }
                e18Var.p(false);
                e18Var.p(false);
                i2 = i3 & (-8065);
                qi3Var3 = (qi3) objN2;
                t3aVar3 = t3aVar4;
                iqbVar3 = fqb.E;
            } else {
                e18Var.T();
                i2 = i3 & (-8065);
                iqbVar3 = iqbVar;
                t3aVar3 = t3aVar;
                qi3Var3 = qi3Var;
            }
            e18Var.q();
            boolean zH2 = e18Var.h(qi3Var3);
            Object objN3 = e18Var.N();
            if (zH2 || objN3 == lz1Var) {
                objN3 = new gw(qi3Var3, tp4Var, 18);
                e18Var.k0(objN3);
            }
            csg.g((bz7) objN3, e18Var, 0, 1);
            ssj.c(d4c.j0(R.string.title_licenses, e18Var), zy7Var, iqbVar3, null, null, 0L, fd9.q0(1433193054, new nn(29, t3aVar3), e18Var), e18Var, ((i2 << 3) & 112) | 1573248, 56);
            iqbVar2 = iqbVar3;
            t3aVar2 = t3aVar3;
            qi3Var2 = qi3Var3;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
            t3aVar2 = t3aVar;
            qi3Var2 = qi3Var;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new mm5(zy7Var, iqbVar2, t3aVar2, qi3Var2, i, 14);
        }
    }

    public static final void f(final iqb iqbVar, final pz7 pz7Var, final pz7 pz7Var2, final e0g e0gVar, final long j, final long j2, final long j3, final long j4, final ta4 ta4Var, ld4 ld4Var, final int i) {
        int i2;
        pz7 pz7Var3;
        pz7 pz7Var4;
        e0g e0gVar2;
        long j5;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1218779924);
        if ((i & 6) == 0) {
            i2 = (e18Var.f(iqbVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            pz7Var3 = pz7Var;
            i2 |= e18Var.h(pz7Var3) ? 32 : 16;
        } else {
            pz7Var3 = pz7Var;
        }
        if ((i & 384) == 0) {
            pz7Var4 = pz7Var2;
            i2 |= e18Var.h(pz7Var4) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        } else {
            pz7Var4 = pz7Var2;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var.g(false) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i & 24576) == 0) {
            e0gVar2 = e0gVar;
            i2 |= e18Var.f(e0gVar2) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        } else {
            e0gVar2 = e0gVar;
        }
        if ((196608 & i) == 0) {
            i2 |= e18Var.e(j) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= e18Var.e(j2) ? FreeTypeConstants.FT_LOAD_COLOR : 524288;
        }
        if ((12582912 & i) == 0) {
            j5 = j3;
            i2 |= e18Var.e(j5) ? 8388608 : 4194304;
        } else {
            j5 = j3;
        }
        if ((100663296 & i) == 0) {
            i2 |= e18Var.e(j4) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i2 |= e18Var.h(ta4Var) ? 536870912 : 268435456;
        }
        if (e18Var.Q(i2 & 1, (306783379 & i2) != 306783378)) {
            e18Var.V();
            if ((i & 1) != 0 && !e18Var.A()) {
                e18Var.T();
            }
            e18Var.q();
            float f = fwj.e;
            ta4 ta4VarQ0 = fd9.q0(-1343524879, new kd8(pz7Var3, ta4Var, pz7Var4, j5, j4), e18Var);
            int i3 = (i2 & 14) | 12779520;
            int i4 = i2 >> 9;
            pzg.a(iqbVar, e0gVar2, j, j2, MTTypesetterKt.kLineSkipLimitMultiplier, f, null, ta4VarQ0, e18Var, i3 | (i4 & 112) | (i4 & 896) | (i4 & 7168), 80);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pz7() { // from class: ccg
                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP0 = x44.p0(i | 1);
                    xvj.f(iqbVar, pz7Var, pz7Var2, e0gVar, j, j2, j3, j4, ta4Var, (ld4) obj, iP0);
                    return iei.a;
                }
            };
        }
    }

    public static final void g(final sbg sbgVar, iqb iqbVar, e0g e0gVar, long j, long j2, long j3, long j4, long j5, ld4 ld4Var, final int i, final int i2) {
        int i3;
        long jD;
        long jD2;
        long jD3;
        e18 e18Var;
        final iqb iqbVar2;
        final e0g e0gVar2;
        final long j6;
        final long j7;
        final long j8;
        final long j9;
        final long j10;
        long jD4;
        long j11;
        long j12;
        long j13;
        e0g e0gVar3;
        int i4;
        iqb iqbVar3;
        ta4 ta4Var;
        o54 o54Var = fwj.b;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(274621471);
        if ((i & 6) == 0) {
            i3 = (e18Var2.f(sbgVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i3 | 432;
        if ((i & 3072) == 0) {
            i5 = i3 | 1456;
        }
        if ((i & 24576) == 0) {
            i5 |= ((i2 & 16) == 0 && e18Var2.e(j)) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if ((196608 & i) == 0) {
            jD = j2;
            i5 |= ((i2 & 32) == 0 && e18Var2.e(jD)) ? 131072 : 65536;
        } else {
            jD = j2;
        }
        if ((1572864 & i) == 0) {
            jD2 = j3;
            i5 |= ((i2 & 64) == 0 && e18Var2.e(jD2)) ? FreeTypeConstants.FT_LOAD_COLOR : 524288;
        } else {
            jD2 = j3;
        }
        if ((12582912 & i) == 0) {
            i5 |= 4194304;
        }
        if ((100663296 & i) == 0) {
            jD3 = j5;
            i5 |= ((i2 & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) == 0 && e18Var2.e(jD3)) ? 67108864 : 33554432;
        } else {
            jD3 = j5;
        }
        final int i6 = 0;
        final int i7 = 1;
        if (e18Var2.Q(i5 & 1, (38347923 & i5) != 38347922)) {
            e18Var2.V();
            if ((i & 1) == 0 || e18Var2.A()) {
                e0g e0gVarB = k1g.b(fwj.f, e18Var2);
                int i8 = i5 & (-7169);
                if ((i2 & 16) != 0) {
                    jD4 = p54.d(fwj.d, e18Var2);
                    i8 = i5 & (-64513);
                } else {
                    jD4 = j;
                }
                if ((i2 & 32) != 0) {
                    jD = p54.d(fwj.h, e18Var2);
                    i8 &= -458753;
                }
                if ((i2 & 64) != 0) {
                    jD2 = p54.d(o54Var, e18Var2);
                    i8 &= -3670017;
                }
                long jD5 = p54.d(o54Var, e18Var2);
                int i9 = i8 & (-29360129);
                int i10 = i2 & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING;
                fqb fqbVar = fqb.E;
                if (i10 != 0) {
                    jD3 = p54.d(fwj.g, e18Var2);
                    i9 = i8 & (-264241153);
                }
                j11 = jD;
                j12 = jD3;
                j13 = jD5;
                e0gVar3 = e0gVarB;
                i4 = i9;
                iqbVar3 = fqbVar;
            } else {
                e18Var2.T();
                int i11 = i5 & (-7169);
                if ((i2 & 16) != 0) {
                    i11 = i5 & (-64513);
                }
                if ((i2 & 32) != 0) {
                    i11 &= -458753;
                }
                if ((i2 & 64) != 0) {
                    i11 &= -3670017;
                }
                i4 = i11 & (-29360129);
                if ((i2 & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0) {
                    i4 = i11 & (-264241153);
                }
                iqbVar3 = iqbVar;
                e0gVar3 = e0gVar;
                jD4 = j;
                j13 = j4;
                j11 = jD;
                j12 = jD3;
            }
            e18Var2.q();
            String strB = ((vbg) sbgVar).a.b();
            ta4 ta4VarQ0 = null;
            if (strB != null) {
                e18Var2.a0(-663827885);
                ta4 ta4VarQ02 = fd9.q0(-1378313599, new fj2(jD2, sbgVar, strB), e18Var2);
                e18Var2.p(false);
                ta4Var = ta4VarQ02;
            } else {
                e18Var2.a0(-663528921);
                e18Var2.p(false);
                ta4Var = null;
            }
            if (((vbg) sbgVar).a.c()) {
                e18Var2.a0(-663364435);
                ta4VarQ0 = fd9.q0(-1812633777, new pz7() { // from class: acg
                    @Override // defpackage.pz7
                    public final Object invoke(Object obj, Object obj2) {
                        int i12 = i6;
                        iei ieiVar = iei.a;
                        sbg sbgVar2 = sbgVar;
                        switch (i12) {
                            case 0:
                                ld4 ld4Var2 = (ld4) obj;
                                int iIntValue = ((Integer) obj2).intValue();
                                e18 e18Var3 = (e18) ld4Var2;
                                if (!e18Var3.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    e18Var3.T();
                                } else {
                                    String strE = dch.E(R.string.m3c_snackbar_dismiss, e18Var3);
                                    e2i.b(c2i.a(e18Var3), fd9.q0(1030267332, new pp(strE, 16), e18Var3), e2i.c(e18Var3), null, false, fd9.q0(1926608556, new ufe(sbgVar2, 11, strE), e18Var3), e18Var3, 100663344, 248);
                                }
                                break;
                            default:
                                ld4 ld4Var3 = (ld4) obj;
                                int iIntValue2 = ((Integer) obj2).intValue();
                                e18 e18Var4 = (e18) ld4Var3;
                                if (!e18Var4.Q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    e18Var4.T();
                                } else {
                                    tjh.b(((vbg) sbgVar2).a.a(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var4, 0, 0, 262142);
                                }
                                break;
                        }
                        return ieiVar;
                    }
                }, e18Var2);
                e18Var2.p(false);
            } else {
                e18Var2.a0(-662598425);
                e18Var2.p(false);
            }
            int i12 = i4 << 3;
            e18Var = e18Var2;
            f(gb9.J(iqbVar3, 12.0f), ta4Var, ta4VarQ0, e0gVar3, jD4, j11, j13, j12, fd9.q0(-1266389126, new pz7() { // from class: acg
                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    int i122 = i7;
                    iei ieiVar = iei.a;
                    sbg sbgVar2 = sbgVar;
                    switch (i122) {
                        case 0:
                            ld4 ld4Var2 = (ld4) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            e18 e18Var3 = (e18) ld4Var2;
                            if (!e18Var3.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                                e18Var3.T();
                            } else {
                                String strE = dch.E(R.string.m3c_snackbar_dismiss, e18Var3);
                                e2i.b(c2i.a(e18Var3), fd9.q0(1030267332, new pp(strE, 16), e18Var3), e2i.c(e18Var3), null, false, fd9.q0(1926608556, new ufe(sbgVar2, 11, strE), e18Var3), e18Var3, 100663344, 248);
                            }
                            break;
                        default:
                            ld4 ld4Var3 = (ld4) obj;
                            int iIntValue2 = ((Integer) obj2).intValue();
                            e18 e18Var4 = (e18) ld4Var3;
                            if (!e18Var4.Q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                e18Var4.T();
                            } else {
                                tjh.b(((vbg) sbgVar2).a.a(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var4, 0, 0, 262142);
                            }
                            break;
                    }
                    return ieiVar;
                }
            }, e18Var2), e18Var, (i12 & 3670016) | (i12 & 7168) | 805306368 | (458752 & i12) | (i4 & 234881024));
            iqbVar2 = iqbVar3;
            j8 = jD2;
            e0gVar2 = e0gVar3;
            j6 = jD4;
            j7 = j11;
            j10 = j13;
            j9 = j12;
        } else {
            e18Var = e18Var2;
            e18Var.T();
            iqbVar2 = iqbVar;
            e0gVar2 = e0gVar;
            j6 = j;
            j7 = jD;
            j8 = jD2;
            j9 = jD3;
            j10 = j4;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pz7() { // from class: bcg
                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP0 = x44.p0(i | 1);
                    xvj.g(sbgVar, iqbVar2, e0gVar2, j6, j7, j8, j10, j9, (ld4) obj, iP0, i2);
                    return iei.a;
                }
            };
        }
    }

    public static void i(ViewConfiguration viewConfiguration) {
        viewConfiguration.getScaledHorizontalScrollFactor();
    }

    public static void j(ViewConfiguration viewConfiguration) {
        viewConfiguration.getScaledVerticalScrollFactor();
    }

    public static final File k(Context context, String str) {
        context.getClass();
        str.getClass();
        return tvk.c(context, str.concat(".preferences_pb"));
    }

    public static final rp6 l(ld4 ld4Var) {
        e18 e18Var = (e18) ld4Var;
        Configuration configuration = (Configuration) e18Var.j(w00.a);
        boolean zF = e18Var.f(configuration);
        Object objN = e18Var.N();
        lz1 lz1Var = jd4.a;
        if (zF || objN == lz1Var) {
            LocaleList locales = configuration.getLocales();
            locales.getClass();
            objN = (Locale) w44.L0(mpk.f0(locales));
            e18Var.k0(objN);
        }
        String country = ((Locale) objN).getCountry();
        country.getClass();
        e18 e18Var2 = (e18) ld4Var;
        m7f m7fVar = (m7f) e18Var2.j(gr9.b);
        boolean zF2 = e18Var2.f(country) | e18Var2.h(m7fVar);
        Object objN2 = e18Var2.N();
        if (zF2 || objN2 == lz1Var) {
            objN2 = new jy5(country, m7fVar, 2);
            e18Var2.k0(objN2);
        }
        kce kceVar = jce.a;
        String strB = oq5.B(kceVar.b(rp6.class));
        return (rp6) fd9.r0(kceVar.b(rp6.class), strB, (bz7) objN2, e18Var2);
    }
}
