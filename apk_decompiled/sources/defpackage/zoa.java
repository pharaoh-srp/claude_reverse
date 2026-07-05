package defpackage;

import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.login.MagicLinkSentConfig;
import com.pvporbit.freetype.FreeTypeConstants;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zoa {
    public static final void a(MagicLinkSentConfig magicLinkSentConfig, rz7 rz7Var, zy7 zy7Var, zy7 zy7Var2, ybg ybgVar, iqb iqbVar, poa poaVar, mnc mncVar, ld4 ld4Var, int i) {
        poa poaVar2;
        int i2;
        MagicLinkSentConfig magicLinkSentConfig2 = magicLinkSentConfig;
        magicLinkSentConfig2.getClass();
        rz7Var.getClass();
        zy7Var.getClass();
        zy7Var2.getClass();
        ybgVar.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(117853047);
        int i3 = i | (e18Var.f(magicLinkSentConfig2) ? 4 : 2) | (e18Var.h(rz7Var) ? 32 : 16) | (e18Var.h(zy7Var) ? 256 : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var.h(zy7Var2) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE) | (e18Var.f(ybgVar) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) | (e18Var.f(iqbVar) ? 131072 : 65536) | 524288 | (e18Var.f(mncVar) ? 8388608 : 4194304);
        if (e18Var.Q(i3 & 1, (4793491 & i3) != 4793490)) {
            e18Var.V();
            int i4 = i & 1;
            lz1 lz1Var = jd4.a;
            if (i4 == 0 || e18Var.A()) {
                String strM764getEmailZiuLfiY = magicLinkSentConfig2.m764getEmailZiuLfiY();
                strM764getEmailZiuLfiY.getClass();
                m7f m7fVarB = gr9.b(e18Var);
                boolean zF = e18Var.f(strM764getEmailZiuLfiY) | e18Var.h(m7fVarB);
                Object objN = e18Var.N();
                if (zF || objN == lz1Var) {
                    objN = new jy5(strM764getEmailZiuLfiY, m7fVarB, 5);
                    e18Var.k0(objN);
                }
                kce kceVar = jce.a;
                poaVar2 = (poa) fd9.r0(kceVar.b(poa.class), oq5.B(kceVar.b(poa.class)), (bz7) objN, e18Var);
                i2 = i3 & (-3670017);
            } else {
                e18Var.T();
                i2 = i3 & (-3670017);
                poaVar2 = poaVar;
            }
            e18Var.q();
            zy1 zy1Var = poaVar2.j;
            boolean z = ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object objN2 = e18Var.N();
            if (z || objN2 == lz1Var) {
                objN2 = new toa(rz7Var, zy7Var, null, 0);
                e18Var.k0(objN2);
            }
            x44.b(zy1Var, (pz7) objN2, e18Var, 0);
            int i5 = i2 >> 9;
            zni.g(poaVar2.k, ybgVar, e18Var, i5 & 112);
            Object objN3 = e18Var.N();
            if (objN3 == lz1Var) {
                objN3 = ij0.d(e18Var);
            }
            bt7 bt7Var = (bt7) objN3;
            nwb nwbVarH0 = x44.h0(e18Var);
            int i6 = i2 & 14;
            boolean zF2 = (i6 == 4) | e18Var.f(poaVar2);
            Object objN4 = e18Var.N();
            if (zF2 || objN4 == lz1Var) {
                objN4 = new ix5(magicLinkSentConfig2, poaVar2, null, 24);
                e18Var.k0(objN4);
            }
            iei ieiVar = iei.a;
            fd9.i(e18Var, (pz7) objN4, ieiVar);
            vo1 vo1Var = lja.T;
            iqb iqbVarL = gb9.L(gb9.I(mpk.b0(iqbVar, mpk.Y(e18Var), true), mncVar), 24.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2);
            q64 q64VarA = p64.a(ko0.c, vo1Var, e18Var, 48);
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
            d4c.i0(e18Var, cd4.f, q64VarA);
            d4c.i0(e18Var, cd4.e, hycVarL);
            d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var, cd4.h);
            d4c.i0(e18Var, cd4.d, iqbVarE);
            fqb fqbVar = fqb.E;
            kxk.g(e18Var, b.e(fqbVar, 52.0f));
            Object[] objArr = new Object[0];
            Object objN5 = e18Var.N();
            if (objN5 == lz1Var) {
                objN5 = new mia(5);
                e18Var.k0(objN5);
            }
            nwb nwbVar = (nwb) iuj.I(objArr, (zy7) objN5, e18Var, 48);
            Boolean bool = (Boolean) nwbVar.getValue();
            bool.getClass();
            kw kwVar = new kw(nwbVarH0, magicLinkSentConfig2, poaVar2, bt7Var, 5);
            magicLinkSentConfig2 = magicLinkSentConfig2;
            xn5.G(bool, null, null, null, "Magic Link Code Input Transition", null, fd9.q0(-158412450, kwVar, e18Var), e18Var, 1597440, 46);
            kxk.g(e18Var, b.e(fqbVar, 24.0f));
            b(magicLinkSentConfig2.m764getEmailZiuLfiY(), null, e18Var, 0);
            kxk.g(e18Var, b.e(fqbVar, 16.0f));
            lnk.d(zy7Var2, null, false, null, null, null, null, pok.a, e18Var, (i5 & 14) | 805306368, 510);
            e18Var = e18Var;
            if (((Boolean) nwbVar.getValue()).booleanValue()) {
                e18Var.a0(-1263779999);
                e18Var.p(false);
            } else {
                e18Var.a0(-1264005834);
                boolean zF3 = e18Var.f(nwbVar) | (i6 == 4);
                Object objN6 = e18Var.N();
                if (zF3 || objN6 == lz1Var) {
                    objN6 = new ix5(magicLinkSentConfig2, nwbVar, null, 25);
                    e18Var.k0(objN6);
                }
                fd9.i(e18Var, (pz7) objN6, ieiVar);
                e18Var.p(false);
            }
            e18Var.p(true);
            kxk.g(e18Var, b.e(fqbVar, 36.0f));
        } else {
            e18Var.T();
            poaVar2 = poaVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new mq0(magicLinkSentConfig2, rz7Var, zy7Var, zy7Var2, ybgVar, iqbVar, poaVar2, mncVar, i);
        }
    }

    public static final void b(String str, iqb iqbVar, ld4 ld4Var, int i) {
        iqb iqbVar2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-10779030);
        int i2 = i | (e18Var.f(str) ? 4 : 2) | 48;
        if (e18Var.Q(i2 & 1, (i2 & 19) != 18)) {
            fqb fqbVar = fqb.E;
            iqb iqbVarV = xn5.V(yfd.p(ez1.t(b.c(fqbVar, 1.0f), MTTypesetterKt.kLineSkipLimitMultiplier, gm3.a(e18Var).v, gm3.b(e18Var).f), gm3.a(e18Var).p, gm3.b(e18Var).f), gm3.b(e18Var).f);
            Object objN = e18Var.N();
            if (objN == jd4.a) {
                objN = new e69(24);
                e18Var.k0(objN);
            }
            iqb iqbVarB = tjf.b(iqbVarV, true, (bz7) objN);
            xo1 xo1Var = lja.G;
            o5b o5bVarD = dw1.d(xo1Var, false);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarB);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            z80 z80Var = cd4.f;
            d4c.i0(e18Var, z80Var, o5bVarD);
            z80 z80Var2 = cd4.e;
            d4c.i0(e18Var, z80Var2, hycVarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            z80 z80Var3 = cd4.g;
            d4c.i0(e18Var, z80Var3, numValueOf);
            bx bxVar = cd4.h;
            d4c.h0(e18Var, bxVar);
            z80 z80Var4 = cd4.d;
            d4c.i0(e18Var, z80Var4, iqbVarE);
            q64 q64VarA = p64.a(ko0.c, lja.S, e18Var, 0);
            int iHashCode2 = Long.hashCode(e18Var.T);
            hyc hycVarL2 = e18Var.l();
            iqb iqbVarE2 = kxk.E(e18Var, fqbVar);
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, z80Var, q64VarA);
            d4c.i0(e18Var, z80Var2, hycVarL2);
            ij0.t(iHashCode2, e18Var, z80Var3, e18Var, bxVar);
            d4c.i0(e18Var, z80Var4, iqbVarE2);
            iqbVar2 = fqbVar;
            tjh.c(zrk.k(R.string.login_magic_link_sent_to, new CharSequence[]{str}, e18Var), gb9.N(b.c(fqbVar, 1.0f), MTTypesetterKt.kLineSkipLimitMultiplier, 20.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 12.0f, 5), 0L, 0L, 0L, new fdh(3), 0L, 0, false, 0, 0, null, null, ((jm3) gm3.c(e18Var).e.E).g, e18Var, 48, 0, 261116);
            e18Var = e18Var;
            iqb iqbVarB2 = b.e(b.c(iqbVar2, 1.0f), 48.0f).B(new ko8(lja.T));
            o5b o5bVarD2 = dw1.d(xo1Var, false);
            int iHashCode3 = Long.hashCode(e18Var.T);
            hyc hycVarL3 = e18Var.l();
            iqb iqbVarE3 = kxk.E(e18Var, iqbVarB2);
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
            xn5.M(j8.r0(R.drawable.envelope, e18Var), sf5.N(nw1.a.a(iqbVar2, lja.K), MTTypesetterKt.kLineSkipLimitMultiplier, 8.0f, 1), e18Var, 48);
            ij0.w(e18Var, true, true, true);
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ip(str, iqbVar2, i, 13);
        }
    }
}
