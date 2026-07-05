package defpackage;

import android.os.Build;
import android.text.style.TtsSpan;
import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.app.onboarding.OnboardingPage;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class mvk {
    public static final ta4 a = new ta4(266507060, false, new cc4(20));

    public static final void a(ggc ggcVar, iqb iqbVar, OnboardingPage onboardingPage, ld4 ld4Var, int i) {
        int i2;
        iqb iqbVar2;
        ggcVar.getClass();
        onboardingPage.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-889518999);
        if ((i & 6) == 0) {
            i2 = (e18Var.f(ggcVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? e18Var.f(onboardingPage) : e18Var.h(onboardingPage) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if (e18Var.Q(i3 & 1, (i3 & 147) != 146)) {
            int i4 = i3 & 1022;
            iqb iqbVar3 = fqb.E;
            onboardingPage.Content(ggcVar, iqbVar3, e18Var, i4);
            iqbVar2 = iqbVar3;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new v76(i, 19, iqbVar2, ggcVar, onboardingPage);
        }
    }

    public static final void b(String str, iqb iqbVar, ta4 ta4Var, ld4 ld4Var, int i) {
        int i2;
        int i3;
        bx bxVar;
        z80 z80Var;
        z80 z80Var2;
        z80 z80Var3;
        z80 z80Var4;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-50704320);
        if ((i & 6) == 0) {
            i2 = (e18Var.f(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.f(iqbVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.h(ta4Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if (e18Var.Q(i2 & 1, (i2 & 147) != 146)) {
            e0g e0gVar = gm3.b(e18Var).h;
            iqb iqbVarT = ez1.t(yfd.p(xn5.V(iqbVar, e0gVar), gm3.a(e18Var).n, zni.b), 0.5f, gm3.a(e18Var).v, e0gVar);
            vo1 vo1Var = lja.S;
            q64 q64VarA = p64.a(ko0.c, vo1Var, e18Var, 0);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarT);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            z80 z80Var5 = cd4.f;
            d4c.i0(e18Var, z80Var5, q64VarA);
            z80 z80Var6 = cd4.e;
            d4c.i0(e18Var, z80Var6, hycVarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            z80 z80Var7 = cd4.g;
            d4c.i0(e18Var, z80Var7, numValueOf);
            bx bxVar2 = cd4.h;
            d4c.h0(e18Var, bxVar2);
            z80 z80Var8 = cd4.d;
            d4c.i0(e18Var, z80Var8, iqbVarE);
            if (str != null) {
                e18Var.a0(-1072852609);
                c(str, null, e18Var, i2 & 14);
                z80Var2 = z80Var8;
                i3 = i2;
                bxVar = bxVar2;
                z80Var = z80Var7;
                z80Var4 = z80Var5;
                z80Var3 = z80Var6;
                iuj.e(null, 0.5f, gm3.a(e18Var).v, e18Var, 48, 1);
                e18Var.p(false);
            } else {
                i3 = i2;
                bxVar = bxVar2;
                z80Var = z80Var7;
                z80Var2 = z80Var8;
                z80Var3 = z80Var6;
                z80Var4 = z80Var5;
                e18Var.a0(-1072655604);
                e18Var.p(false);
            }
            ho0 ho0Var = new ho0(8.0f, true, new sz6(1));
            iqb iqbVarJ = gb9.J(b.c(fqb.E, 1.0f), 16.0f);
            int i4 = ((i3 << 3) & 7168) | 54;
            q64 q64VarA2 = p64.a(ho0Var, vo1Var, e18Var, 6);
            int iHashCode2 = Long.hashCode(e18Var.T);
            hyc hycVarL2 = e18Var.l();
            iqb iqbVarE2 = kxk.E(e18Var, iqbVarJ);
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, z80Var4, q64VarA2);
            d4c.i0(e18Var, z80Var3, hycVarL2);
            ij0.t(iHashCode2, e18Var, z80Var, e18Var, bxVar);
            d4c.i0(e18Var, z80Var2, iqbVarE2);
            ta4Var.invoke(s64.a, e18Var, Integer.valueOf(((i4 >> 6) & 112) | 6));
            e18Var.p(true);
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new v76(str, iqbVar, ta4Var, i, 7);
        }
    }

    public static final void c(String str, iqb iqbVar, ld4 ld4Var, int i) {
        int i2;
        iqb iqbVar2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(575124461);
        if ((i & 6) == 0) {
            i2 = i | (e18Var.f(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (e18Var.Q(i3 & 1, (i3 & 19) != 18)) {
            wo1 wo1Var = lja.Q;
            fqb fqbVar = fqb.E;
            iqb iqbVarL = gb9.L(b.e(b.c(fqbVar, 1.0f), 44.0f), 16.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2);
            cxe cxeVarA = axe.a(ko0.a, wo1Var, e18Var, 48);
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
            tjh.b(str, new hw9(1.0f, true), gm3.a(e18Var).O, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).i, e18Var, i3 & 14, 0, 131064);
            e18Var = e18Var;
            rwk.a(0, e18Var);
            e18Var.p(true);
            iqbVar2 = fqbVar;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new el(str, iqbVar2, i, 6);
        }
    }

    public static final void d(String str, String str2, bz7 bz7Var, zy7 zy7Var, qnd qndVar, ybg ybgVar, ld4 ld4Var, int i) {
        int i2;
        qnd qndVar2;
        qnd qndVar3;
        int i3;
        str.getClass();
        str2.getClass();
        bz7Var.getClass();
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-427125988);
        if ((i & 6) == 0) {
            i2 = (e18Var.f(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.f(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.h(bz7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var.h(zy7Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i & 24576) == 0) {
            i2 |= FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if ((196608 & i) == 0) {
            i2 |= e18Var.f(ybgVar) ? 131072 : 65536;
        }
        int i4 = 0;
        if (e18Var.Q(i2 & 1, (74899 & i2) != 74898)) {
            e18Var.V();
            int i5 = i & 1;
            lz1 lz1Var = jd4.a;
            if (i5 == 0 || e18Var.A()) {
                m7f m7fVar = (m7f) e18Var.j(gr9.b);
                boolean zH = e18Var.h(m7fVar);
                Object objN = e18Var.N();
                if (zH || objN == lz1Var) {
                    objN = new di(m7fVar, 27);
                    e18Var.k0(objN);
                }
                kce kceVar = jce.a;
                qndVar3 = (qnd) fd9.r0(kceVar.b(qnd.class), oq5.B(kceVar.b(qnd.class)), (bz7) objN, e18Var);
                i3 = i2 & (-57345);
            } else {
                e18Var.T();
                i3 = i2 & (-57345);
                qndVar3 = qndVar;
            }
            e18Var.q();
            r4g r4gVarS = gb9.S(u4g.F, null, null, zy7Var, e18Var, (i3 & 7168) | 6, 6);
            boolean zH2 = e18Var.h(qndVar3);
            Object objN2 = e18Var.N();
            if (zH2 || objN2 == lz1Var) {
                objN2 = new l6b(qndVar3, null, 7);
                e18Var.k0(objN2);
            }
            fd9.i(e18Var, (pz7) objN2, qndVar3);
            auj.b(r4gVarS, str, null, null, false, null, null, null, fd9.q0(1995526768, new ngf(str2, i4), e18Var), fd9.q0(-90316047, new u22(r4gVarS, 15), e18Var), null, null, fd9.q0(-1005575774, new zee(qndVar3, bz7Var, ybgVar, 1), e18Var), e18Var, 905969672 | ((i3 << 3) & 112), 384, 3324);
            e18Var = e18Var;
            qndVar2 = qndVar3;
        } else {
            e18Var.T();
            qndVar2 = qndVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new hl(str, str2, bz7Var, zy7Var, qndVar2, ybgVar, i);
        }
    }

    public static final void e(lze lzeVar) throws Exception {
        lzeVar.getClass();
        d8a d8aVarE = x44.E();
        tze tzeVarL0 = lzeVar.L0("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (tzeVarL0.H0()) {
            try {
                d8aVarE.add(tzeVarL0.g0(0));
            } finally {
            }
        }
        csg.o(tzeVarL0, null);
        ListIterator listIterator = x44.v(d8aVarE).listIterator(0);
        while (true) {
            c8a c8aVar = (c8a) listIterator;
            if (!c8aVar.hasNext()) {
                return;
            }
            String str = (String) c8aVar.next();
            if (isg.q0(str, "room_fts_content_sync_", false)) {
                u00.r(lzeVar, "DROP TRIGGER IF EXISTS ".concat(str));
            }
        }
    }

    public static boolean f(int i) {
        return (i & FreeTypeConstants.FT_LOAD_NO_AUTOHINT) != 0;
    }

    public static boolean g(int i) {
        if (i == 15 || i == 255) {
            return true;
        }
        if (i == 32768) {
            return Build.VERSION.SDK_INT >= 30;
        }
        if (i != 32783) {
            return i == 33023 || i == 0;
        }
        int i2 = Build.VERSION.SDK_INT;
        return i2 < 28 || i2 > 29;
    }

    public static final TtsSpan h(wsi wsiVar) {
        if (wsiVar instanceof wsi) {
            return new TtsSpan.VerbatimBuilder(wsiVar.a).build();
        }
        wg6.i();
        return null;
    }
}
