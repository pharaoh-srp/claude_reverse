package defpackage;

import android.view.KeyEvent;
import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.pvporbit.freetype.FreeTypeConstants;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public abstract class cn5 {
    public static final qnc a = gb9.d(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 12.0f, 12.0f, 3);
    public static final float b;

    static {
        gb9.d(24.0f, 16.0f, 12.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 8);
        gb9.d(24.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 12.0f, 12.0f, 2);
        b = 16.0f;
    }

    public static final void a(final iqb iqbVar, final ta4 ta4Var, final ta4 ta4Var2, final pz7 pz7Var, final wl5 wl5Var, final tkh tkhVar, final float f, final ta4 ta4Var3, ld4 ld4Var, final int i) {
        int i2;
        ta4 ta4Var4;
        pz7 pz7Var2;
        e18 e18Var;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(1539132883);
        if ((i & 6) == 0) {
            i2 = (e18Var2.f(iqbVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var2.h(ta4Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            ta4Var4 = ta4Var2;
            i2 |= e18Var2.h(ta4Var4) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        } else {
            ta4Var4 = ta4Var2;
        }
        if ((i & 3072) == 0) {
            pz7Var2 = pz7Var;
            i2 |= e18Var2.h(pz7Var2) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        } else {
            pz7Var2 = pz7Var;
        }
        if ((i & 24576) == 0) {
            i2 |= e18Var2.f(wl5Var) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if ((196608 & i) == 0) {
            i2 |= e18Var2.f(tkhVar) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= e18Var2.c(f) ? FreeTypeConstants.FT_LOAD_COLOR : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= e18Var2.h(ta4Var3) ? 8388608 : 4194304;
        }
        int i3 = i2;
        if (e18Var2.Q(i3 & 1, (i3 & 4793491) != 4793490)) {
            iqb iqbVarS = b.s(iqbVar, gwk.d, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 14);
            Object objN = e18Var2.N();
            if (objN == jd4.a) {
                objN = new qy4(10);
                e18Var2.k0(objN);
            }
            iqb iqbVarP = yfd.p(tjf.b(iqbVarS, false, (bz7) objN), wl5Var.a, zni.b);
            q64 q64VarA = p64.a(ko0.c, lja.S, e18Var2, 0);
            int iHashCode = Long.hashCode(e18Var2.T);
            hyc hycVarL = e18Var2.l();
            iqb iqbVarE = kxk.E(e18Var2, iqbVarP);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var2.e0();
            if (e18Var2.S) {
                e18Var2.k(re4Var);
            } else {
                e18Var2.n0();
            }
            d4c.i0(e18Var2, cd4.f, q64VarA);
            d4c.i0(e18Var2, cd4.e, hycVarL);
            d4c.i0(e18Var2, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var2, cd4.h);
            d4c.i0(e18Var2, cd4.d, iqbVarE);
            d(ta4Var, wl5Var.b, wl5Var.c, f, fd9.q0(-1658370654, new mm5(ta4Var4, pz7Var2, ta4Var, wl5Var, tkhVar), e18Var2), e18Var2, (i3 & 112) | 196614 | (57344 & (i3 >> 6)));
            e18Var = e18Var2;
            vb7.y(14 & (i3 >> 21), ta4Var3, e18Var, true);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pz7() { // from class: nm5
                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    cn5.a(iqbVar, ta4Var, ta4Var2, pz7Var, wl5Var, tkhVar, f, ta4Var3, (ld4) obj, x44.p0(i | 1));
                    return iei.a;
                }
            };
        }
    }

    public static final void b(dn5 dn5Var, iqb iqbVar, am5 am5Var, wl5 wl5Var, ta4 ta4Var, ta4 ta4Var2, boolean z, bt7 bt7Var, ld4 ld4Var, int i) {
        iqb iqbVar2;
        am5 am5Var2;
        wl5 wl5Var2;
        boolean z2;
        e18 e18Var;
        bt7 bt7Var2;
        iqb iqbVar3;
        am5 am5Var3;
        wl5 wl5Var3;
        boolean z3;
        bt7 bt7Var3;
        ta4 ta4VarQ0;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(1105472031);
        int i2 = i | (e18Var2.f(dn5Var) ? 4 : 2) | 14156976;
        if (e18Var2.Q(i2 & 1, (4793491 & i2) != 4793490)) {
            e18Var2.V();
            int i3 = i & 1;
            lz1 lz1Var = jd4.a;
            if (i3 == 0 || e18Var2.A()) {
                Object objN = e18Var2.N();
                if (objN == lz1Var) {
                    b79 b79Var = yl5.a;
                    objN = new am5();
                    e18Var2.k0(objN);
                }
                am5 am5Var4 = (am5) objN;
                b79 b79Var2 = yl5.a;
                wl5 wl5VarA = yl5.a(e18Var2);
                Object objN2 = e18Var2.N();
                if (objN2 == lz1Var) {
                    objN2 = ij0.d(e18Var2);
                }
                iqbVar3 = fqb.E;
                am5Var3 = am5Var4;
                wl5Var3 = wl5VarA;
                z3 = true;
                bt7Var3 = (bt7) objN2;
            } else {
                e18Var2.T();
                iqbVar3 = iqbVar;
                am5Var3 = am5Var;
                wl5Var3 = wl5Var;
                z3 = z;
                bt7Var3 = bt7Var;
            }
            e18Var2.q();
            boolean zF = e18Var2.f(dn5Var.b);
            Object objN3 = e18Var2.N();
            if (zF || objN3 == lz1Var) {
                objN3 = dn5Var.c;
                e18Var2.k0(objN3);
            }
            o72 o72Var = (o72) objN3;
            if (z3) {
                e18Var2.a0(-690563017);
                ta4VarQ0 = fd9.q0(-1483431603, new t04(dn5Var, 29, wl5Var3), e18Var2);
                e18Var2.p(false);
            } else {
                e18Var2.a0(-690175393);
                e18Var2.p(false);
                ta4VarQ0 = null;
            }
            wl5Var2 = wl5Var3;
            iqb iqbVar4 = iqbVar3;
            a(iqbVar4, ta4Var, ta4Var2, ta4VarQ0, wl5Var2, bci.a(gwk.q, e18Var2), gwk.o, fd9.q0(-1346903698, new uo(dn5Var, o72Var, am5Var3, wl5Var2, bt7Var3, 18), e18Var2), e18Var2, 14156214);
            iqbVar2 = iqbVar4;
            e18Var = e18Var2;
            z2 = z3;
            am5Var2 = am5Var3;
            bt7Var2 = bt7Var3;
        } else {
            e18Var2.T();
            iqbVar2 = iqbVar;
            am5Var2 = am5Var;
            wl5Var2 = wl5Var;
            z2 = z;
            e18Var = e18Var2;
            bt7Var2 = bt7Var;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new su(dn5Var, iqbVar2, am5Var2, wl5Var2, ta4Var, ta4Var2, z2, bt7Var2, i);
        }
    }

    public static final void c(Long l, final long j, bz7 bz7Var, bz7 bz7Var2, final o72 o72Var, final b79 b79Var, am5 am5Var, final xl5 xl5Var, final wl5 wl5Var, ld4 ld4Var, int i) {
        l45 l45Var;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-434467002);
        int i2 = i | (e18Var.f(l) ? 4 : 2) | (e18Var.e(j) ? 32 : 16) | (e18Var.h(bz7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var.h(bz7Var2) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE) | (e18Var.h(o72Var) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) | (e18Var.h(b79Var) ? 131072 : 65536) | (e18Var.f(am5Var) ? FreeTypeConstants.FT_LOAD_COLOR : 524288) | (e18Var.f(xl5Var) ? 8388608 : 4194304) | (e18Var.f(wl5Var) ? 67108864 : 33554432);
        if (e18Var.Q(i2 & 1, (38347923 & i2) != 38347922)) {
            final u72 u72VarB = o72Var.b(j);
            int i3 = (((u72VarB.a - b79Var.E) * 12) + u72VarB.b) - 1;
            if (i3 < 0) {
                i3 = 0;
            }
            final x0a x0aVarA = a1a.a(i3, 2, e18Var);
            Integer numValueOf = Integer.valueOf(i3);
            boolean zF = e18Var.f(x0aVarA) | e18Var.d(i3);
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (zF || objN == lz1Var) {
                objN = new j23(i3, 1, null, x0aVarA);
                e18Var.k0(objN);
            }
            fd9.i(e18Var, (pz7) objN, numValueOf);
            Object objN2 = e18Var.N();
            if (objN2 == lz1Var) {
                objN2 = fd9.O(im6.E, e18Var);
                e18Var.k0(objN2);
            }
            l45 l45Var2 = (l45) objN2;
            Object[] objArr = new Object[0];
            Object objN3 = e18Var.N();
            if (objN3 == lz1Var) {
                objN3 = new h85(13);
                e18Var.k0(objN3);
            }
            final nwb nwbVar = (nwb) iuj.I(objArr, (zy7) objN3, e18Var, 48);
            final ps7 ps7Var = (ps7) e18Var.j(ve4.i);
            Object objN4 = e18Var.N();
            if (objN4 == lz1Var) {
                bt7 bt7Var = bt7.b;
                objN4 = at7.a;
                e18Var.k0(objN4);
            }
            ((at7) objN4).getClass();
            bt7 bt7Var2 = new bt7();
            final bt7 bt7Var3 = new bt7();
            final bt7 bt7Var4 = new bt7();
            final bt7 bt7Var5 = new bt7();
            vo1 vo1Var = lja.S;
            eo0 eo0Var = ko0.c;
            q64 q64VarA = p64.a(eo0Var, vo1Var, e18Var, 0);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            fqb fqbVar = fqb.E;
            iqb iqbVarE = kxk.E(e18Var, fqbVar);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            z80 z80Var = cd4.f;
            d4c.i0(e18Var, z80Var, q64VarA);
            z80 z80Var2 = cd4.e;
            d4c.i0(e18Var, z80Var2, hycVarL);
            Integer numValueOf2 = Integer.valueOf(iHashCode);
            z80 z80Var3 = cd4.g;
            d4c.i0(e18Var, z80Var3, numValueOf2);
            bx bxVar = cd4.h;
            d4c.h0(e18Var, bxVar);
            z80 z80Var4 = cd4.d;
            d4c.i0(e18Var, z80Var4, iqbVarE);
            iqb iqbVarL = gb9.L(fqbVar, 12.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2);
            boolean zD = x0aVarA.d();
            boolean zB = x0aVarA.b();
            boolean zBooleanValue = ((Boolean) nwbVar.getValue()).booleanValue();
            Locale locale = o72Var.a;
            am5Var.getClass();
            String strG = lvj.g(j, "yMMMM", locale, am5Var.a);
            if (strG == null) {
                strG = "-";
            }
            iqb iqbVarS = iv1.s(fqbVar, bt7Var2);
            boolean zH = e18Var.h(l45Var2) | e18Var.f(x0aVarA);
            Object objN5 = e18Var.N();
            if (zH || objN5 == lz1Var) {
                objN5 = new ht4(l45Var2, x0aVarA, 1);
                e18Var.k0(objN5);
            }
            zy7 zy7Var = (zy7) objN5;
            boolean zH2 = e18Var.h(l45Var2) | e18Var.f(x0aVarA);
            Object objN6 = e18Var.N();
            if (zH2 || objN6 == lz1Var) {
                objN6 = new ht4(l45Var2, x0aVarA, 2);
                e18Var.k0(objN6);
            }
            zy7 zy7Var2 = (zy7) objN6;
            boolean zF2 = e18Var.f(nwbVar);
            Object objN7 = e18Var.N();
            if (zF2 || objN7 == lz1Var) {
                objN7 = new sy4(9, nwbVar);
                e18Var.k0(objN7);
            }
            zy7 zy7Var3 = (zy7) objN7;
            boolean zF3 = e18Var.f(bt7Var4) | e18Var.h(ps7Var);
            Object objN8 = e18Var.N();
            if (zF3 || objN8 == lz1Var) {
                l45Var = l45Var2;
                objN8 = new dm5(bt7Var4, ps7Var, 1);
                e18Var.k0(objN8);
            } else {
                l45Var = l45Var2;
            }
            j(iqbVarL, zD, zB, zBooleanValue, strG, iqbVarS, zy7Var, zy7Var2, zy7Var3, (zy7) objN8, bt7Var3, wl5Var, e18Var, 6, (i2 >> 21) & 112);
            o5b o5bVarD = dw1.d(lja.G, false);
            int iHashCode2 = Long.hashCode(e18Var.T);
            hyc hycVarL2 = e18Var.l();
            iqb iqbVarE2 = kxk.E(e18Var, fqbVar);
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
            iqb iqbVarL2 = gb9.L(fqbVar, 12.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2);
            q64 q64VarA2 = p64.a(eo0Var, vo1Var, e18Var, 0);
            int iHashCode3 = Long.hashCode(e18Var.T);
            hyc hycVarL3 = e18Var.l();
            iqb iqbVarE3 = kxk.E(e18Var, iqbVarL2);
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, z80Var, q64VarA2);
            d4c.i0(e18Var, z80Var2, hycVarL3);
            ij0.t(iHashCode3, e18Var, z80Var3, e18Var, bxVar);
            d4c.i0(e18Var, z80Var4, iqbVarE3);
            l(wl5Var, o72Var, e18Var, ((i2 >> 24) & 14) | ((i2 >> 9) & 112));
            boolean zF4 = e18Var.f(bt7Var2);
            Object objN9 = e18Var.N();
            if (zF4 || objN9 == lz1Var) {
                objN9 = new du2(bt7Var2, 2);
                e18Var.k0(objN9);
            }
            g(x0aVarA, l, bz7Var, bz7Var2, o72Var, b79Var, am5Var, xl5Var, wl5Var, (zy7) objN9, ps7Var, e18Var, ((i2 << 3) & 112) | (i2 & 896) | (i2 & 7168) | (57344 & i2) | (458752 & i2) | (3670016 & i2) | (29360128 & i2) | (i2 & 234881024));
            e18Var.p(true);
            asb asbVar = asb.G;
            yig yigVarP = u00.P(asbVar, e18Var);
            yig yigVarP2 = u00.P(asb.H, e18Var);
            yig yigVarP3 = u00.P(asbVar, e18Var);
            boolean zBooleanValue2 = ((Boolean) nwbVar.getValue()).booleanValue();
            iqb iqbVarW = xn5.W(fqbVar);
            wp6 wp6VarA = gp6.d(yigVarP3, null, 14).a(new wp6(new b6i(new he7(0.6f, yigVarP), (s9g) null, (dh2) null, (l6f) null, (LinkedHashMap) null, 126)));
            d77 d77VarA = gp6.l(yigVarP3, null, 14).a(gp6.f(yigVarP2, 2));
            final l45 l45Var3 = l45Var;
            wd6.M(zBooleanValue2, iqbVarW, wp6VarA, d77VarA, null, fd9.q0(1193716082, new rz7() { // from class: tm5
                @Override // defpackage.rz7
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    b79 b79Var2;
                    ld4 ld4Var2 = (ld4) obj2;
                    ((Integer) obj3).getClass();
                    String strE = dch.E(R.string.m3c_date_picker_year_picker_pane_title, ld4Var2);
                    e18 e18Var2 = (e18) ld4Var2;
                    boolean zF5 = e18Var2.f(strE);
                    Object objN10 = e18Var2.N();
                    lz1 lz1Var2 = jd4.a;
                    int i4 = 0;
                    if (zF5 || objN10 == lz1Var2) {
                        objN10 = new cm5(strE, i4);
                        e18Var2.k0(objN10);
                    }
                    fqb fqbVar2 = fqb.E;
                    iqb iqbVarB = tjf.b(fqbVar2, false, (bz7) objN10);
                    q64 q64VarA3 = p64.a(ko0.c, lja.S, e18Var2, 0);
                    int iHashCode4 = Long.hashCode(e18Var2.T);
                    hyc hycVarL4 = e18Var2.l();
                    iqb iqbVarE4 = kxk.E(e18Var2, iqbVarB);
                    dd4.e.getClass();
                    re4 re4Var2 = cd4.b;
                    e18Var2.e0();
                    if (e18Var2.S) {
                        e18Var2.k(re4Var2);
                    } else {
                        e18Var2.n0();
                    }
                    d4c.i0(e18Var2, cd4.f, q64VarA3);
                    d4c.i0(e18Var2, cd4.e, hycVarL4);
                    d4c.i0(e18Var2, cd4.g, Integer.valueOf(iHashCode4));
                    d4c.h0(e18Var2, cd4.h);
                    d4c.i0(e18Var2, cd4.d, iqbVarE4);
                    iqb iqbVarL3 = gb9.L(b.h(fqbVar2, 336.0f - h96.a), 12.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2);
                    nwb nwbVar2 = nwbVar;
                    boolean zF6 = e18Var2.f(nwbVar2);
                    l45 l45Var4 = l45Var3;
                    boolean zH3 = zF6 | e18Var2.h(l45Var4);
                    x0a x0aVar = x0aVarA;
                    boolean zF7 = zH3 | e18Var2.f(x0aVar);
                    b79 b79Var3 = b79Var;
                    boolean zH4 = zF7 | e18Var2.h(b79Var3);
                    u72 u72Var = u72VarB;
                    boolean zF8 = zH4 | e18Var2.f(u72Var);
                    Object objN11 = e18Var2.N();
                    if (zF8 || objN11 == lz1Var2) {
                        objN11 = new w20(l45Var4, nwbVar2, x0aVar, b79Var3, u72Var, 4);
                        b79Var2 = b79Var3;
                        e18Var2.k0(objN11);
                    } else {
                        b79Var2 = b79Var3;
                    }
                    bz7 bz7Var3 = (bz7) objN11;
                    bt7 bt7Var6 = bt7Var3;
                    boolean zF9 = e18Var2.f(bt7Var6);
                    Object objN12 = e18Var2.N();
                    if (zF9 || objN12 == lz1Var2) {
                        objN12 = new du2(bt7Var6, 1);
                        e18Var2.k0(objN12);
                    }
                    zy7 zy7Var4 = (zy7) objN12;
                    bt7 bt7Var7 = bt7Var5;
                    boolean zF10 = e18Var2.f(bt7Var7);
                    ps7 ps7Var2 = ps7Var;
                    boolean zH5 = zF10 | e18Var2.h(ps7Var2);
                    Object objN13 = e18Var2.N();
                    if (zH5 || objN13 == lz1Var2) {
                        objN13 = new dm5(bt7Var7, ps7Var2, 0);
                        e18Var2.k0(objN13);
                    }
                    long j2 = j;
                    xl5 xl5Var2 = xl5Var;
                    o72 o72Var2 = o72Var;
                    wl5 wl5Var2 = wl5Var;
                    cn5.n(iqbVarL3, j2, bz7Var3, xl5Var2, o72Var2, b79Var2, wl5Var2, bt7Var4, zy7Var4, (zy7) objN13, e18Var2, 6);
                    long j3 = wl5Var2.x;
                    iqb iqbVarS2 = iv1.s(fqbVar2, bt7Var7);
                    boolean zH6 = e18Var2.h(ps7Var2);
                    Object objN14 = e18Var2.N();
                    if (zH6 || objN14 == lz1Var2) {
                        objN14 = new cv(25, ps7Var2);
                        e18Var2.k0(objN14);
                    }
                    iuj.e(dch.M(iqbVarS2, (bz7) objN14).B(it7.E), MTTypesetterKt.kLineSkipLimitMultiplier, j3, e18Var2, 0, 2);
                    e18Var2.p(true);
                    return iei.a;
                }
            }, e18Var), e18Var, 196656, 16);
            e18Var = e18Var;
            e18Var.p(true);
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new vm5(l, j, bz7Var, bz7Var2, o72Var, b79Var, am5Var, xl5Var, wl5Var, i);
        }
    }

    public static final void d(final ta4 ta4Var, final long j, final long j2, final float f, final ta4 ta4Var2, ld4 ld4Var, final int i) {
        int i2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(2020490761);
        int i3 = i & 6;
        fqb fqbVar = fqb.E;
        if (i3 == 0) {
            i2 = (e18Var.f(fqbVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.h(ta4Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.e(j) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var.e(j2) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i & 24576) == 0) {
            i2 |= e18Var.c(f) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if ((196608 & i) == 0) {
            i2 |= e18Var.h(ta4Var2) ? 131072 : 65536;
        }
        if (e18Var.Q(i2 & 1, (74899 & i2) != 74898)) {
            iqb iqbVarB = b.c(fqbVar, 1.0f).B(b.b(fqbVar, MTTypesetterKt.kLineSkipLimitMultiplier, f, 1));
            q64 q64VarA = p64.a(ko0.g, lja.S, e18Var, 6);
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
            d4c.i0(e18Var, cd4.f, q64VarA);
            d4c.i0(e18Var, cd4.e, hycVarL);
            d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var, cd4.h);
            d4c.i0(e18Var, cd4.d, iqbVarE);
            e18Var.a0(396894187);
            zh4.h(j, bci.a(gwk.s, e18Var), fd9.q0(1344395458, new rx0(ta4Var, 12), e18Var), e18Var, ((i2 >> 6) & 14) | 384);
            e18Var.p(false);
            j8.c(sq6.m(j2, on4.a), ta4Var2, e18Var, ((i2 >> 12) & 112) | 8);
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pz7() { // from class: pm5
                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    cn5.d(ta4Var, j, j2, f, ta4Var2, (ld4) obj, x44.p0(i | 1));
                    return iei.a;
                }
            };
        }
    }

    public static final void e(String str, iqb iqbVar, boolean z, zy7 zy7Var, boolean z2, boolean z3, boolean z4, String str2, wl5 wl5Var, ld4 ld4Var, int i) {
        String str3;
        int i2;
        long j;
        wlg wlgVarZ;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-945355136);
        if ((i & 6) == 0) {
            str3 = str;
            i2 = (e18Var.f(str3) ? 4 : 2) | i;
        } else {
            str3 = str;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.f(iqbVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.g(z) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var.h(zy7Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i & 24576) == 0) {
            i2 |= e18Var.g(z2) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if ((196608 & i) == 0) {
            i2 |= e18Var.g(z3) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= e18Var.g(z4) ? FreeTypeConstants.FT_LOAD_COLOR : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= e18Var.g(false) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= e18Var.f(str2) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i2 |= e18Var.f(wl5Var) ? 536870912 : 268435456;
        }
        if (e18Var.Q(i2 & 1, (306783379 & i2) != 306783378)) {
            boolean z5 = (234881024 & i2) == 67108864;
            Object objN = e18Var.N();
            if (z5 || objN == jd4.a) {
                objN = new cm5(str2, 2);
                e18Var.k0(objN);
            }
            iqb iqbVarB = tjf.b(iqbVar, true, (bz7) objN);
            e0g e0gVarB = k1g.b(gwk.f, e18Var);
            int i3 = i2 >> 6;
            if (z) {
                j = z3 ? wl5Var.r : wl5Var.s;
            } else {
                wl5Var.getClass();
                j = d54.g;
            }
            if (z2) {
                e18Var.a0(-1319881536);
                wlgVarZ = f8g.a(j, u00.P(asb.G, e18Var), null, e18Var, 0, 12);
                e18Var.p(false);
            } else {
                e18Var.a0(-1319654864);
                wlgVarZ = mpk.Z(new d54(j), e18Var);
                e18Var.p(false);
            }
            pzg.b(z, zy7Var, iqbVarB, z3, e0gVarB, ((d54) wlgVarZ.getValue()).a, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, (!z4 || z) ? null : sf5.a(gwk.l, wl5Var.u), null, fd9.q0(1126347158, new jm5(str3, wl5Var, z4, z, z3), e18Var), e18Var, i3 & 7294, 1472);
            e18Var = e18Var;
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new km5(str, iqbVar, z, zy7Var, z2, z3, z4, str2, wl5Var, i);
        }
    }

    public static final void f(iqb iqbVar, int i, bz7 bz7Var, wl5 wl5Var, ld4 ld4Var, int i2) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1461252485);
        int i3 = (e18Var.d(i) ? 32 : 16) | i2 | (e18Var.h(bz7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var.f(wl5Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE);
        if (e18Var.Q(i3 & 1, (i3 & 1171) != 1170)) {
            j8.c(sq6.m(wl5Var.c, on4.a), fd9.q0(-1734512197, new qq(i, bz7Var, iqbVar, 18), e18Var), e18Var, 56);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ji(iqbVar, i, bz7Var, wl5Var, i2);
        }
    }

    public static final void g(final x0a x0aVar, final Long l, final bz7 bz7Var, final bz7 bz7Var2, final o72 o72Var, final b79 b79Var, final am5 am5Var, final xl5 xl5Var, final wl5 wl5Var, final zy7 zy7Var, final ps7 ps7Var, ld4 ld4Var, final int i) {
        Object objC;
        Object w14Var;
        final x0a x0aVar2 = x0aVar;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1038629066);
        int i2 = i | (e18Var.f(x0aVar2) ? 4 : 2);
        if ((i & 48) == 0) {
            i2 |= e18Var.f(l) ? 32 : 16;
        }
        int i3 = i2 | (e18Var.h(bz7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var.h(bz7Var2) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE) | (e18Var.h(o72Var) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) | (e18Var.h(b79Var) ? 131072 : 65536) | (e18Var.f(am5Var) ? FreeTypeConstants.FT_LOAD_COLOR : 524288) | (e18Var.f(xl5Var) ? 8388608 : 4194304) | (e18Var.f(wl5Var) ? 67108864 : 33554432) | (e18Var.h(zy7Var) ? 536870912 : 268435456);
        if (e18Var.Q(i3 & 1, ((i3 & 306783379) == 306783378 && ((e18Var.h(ps7Var) ? (char) 4 : (char) 2) & 3) == 2) ? false : true)) {
            final q62 q62VarD = o72Var.d();
            boolean zF = e18Var.f(b79Var);
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (zF || objN == lz1Var) {
                objC = o72Var.c(LocalDate.of(b79Var.E, 1, 1));
                e18Var.k0(objC);
            } else {
                objC = objN;
            }
            final u72 u72Var = (u72) objC;
            tjh.a(bci.a(gwk.h, e18Var), fd9.q0(-1911156825, new pz7() { // from class: xm5
                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    ld4 ld4Var2 = (ld4) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    e18 e18Var2 = (e18) ld4Var2;
                    if (e18Var2.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        Object objN2 = e18Var2.N();
                        lz1 lz1Var2 = jd4.a;
                        if (objN2 == lz1Var2) {
                            objN2 = new qy4(8);
                            e18Var2.k0(objN2);
                        }
                        iqb iqbVarB = tjf.b(fqb.E, false, (bz7) objN2);
                        b79 b79Var2 = yl5.a;
                        zn5 zn5VarO0 = wd6.o0();
                        yig yigVarP = u00.P(asb.G, e18Var2);
                        boolean zF2 = e18Var2.f(zn5VarO0);
                        x0a x0aVar3 = x0aVar;
                        boolean zF3 = zF2 | e18Var2.f(x0aVar3);
                        Object objN3 = e18Var2.N();
                        if (zF3 || objN3 == lz1Var2) {
                            objN3 = new kcg(new ive(27, new qb5((Object) x0aVar3, (Object) hj6.S, false)), zn5VarO0, yigVarP);
                            e18Var2.k0(objN3);
                        }
                        kcg kcgVar = (kcg) objN3;
                        b79 b79Var3 = b79Var;
                        boolean zH = e18Var2.h(b79Var3);
                        o72 o72Var2 = o72Var;
                        boolean zH2 = zH | e18Var2.h(o72Var2);
                        u72 u72Var2 = u72Var;
                        boolean zF4 = zH2 | e18Var2.f(u72Var2);
                        bz7 bz7Var3 = bz7Var;
                        boolean zF5 = zF4 | e18Var2.f(bz7Var3);
                        q62 q62Var = q62VarD;
                        boolean zF6 = zF5 | e18Var2.f(q62Var);
                        Long l2 = l;
                        boolean zF7 = zF6 | e18Var2.f(l2);
                        am5 am5Var2 = am5Var;
                        boolean zH3 = zF7 | e18Var2.h(am5Var2);
                        xl5 xl5Var2 = xl5Var;
                        boolean zF8 = zH3 | e18Var2.f(xl5Var2);
                        wl5 wl5Var2 = wl5Var;
                        boolean zF9 = zF8 | e18Var2.f(wl5Var2) | e18Var2.f(x0aVar3);
                        ps7 ps7Var2 = ps7Var;
                        boolean zH4 = zF9 | e18Var2.h(ps7Var2);
                        zy7 zy7Var2 = zy7Var;
                        boolean zF10 = zH4 | e18Var2.f(zy7Var2);
                        Object objN4 = e18Var2.N();
                        if (zF10 || objN4 == lz1Var2) {
                            objN4 = new f04(q62Var, o72Var2, u72Var2, wl5Var2, xl5Var2, am5Var2, ps7Var2, zy7Var2, bz7Var3, b79Var3, x0aVar3, l2);
                            e18Var2.k0(objN4);
                        }
                        knk.i(iqbVarB, x0aVar3, null, null, null, kcgVar, false, null, (bz7) objN4, e18Var2, 0, 444);
                    } else {
                        e18Var2.T();
                    }
                    return iei.a;
                }
            }, e18Var), e18Var, 48);
            boolean zH = ((i3 & 14) == 4) | ((i3 & 7168) == 2048) | e18Var.h(o72Var) | e18Var.h(b79Var);
            Object objN2 = e18Var.N();
            if (zH || objN2 == lz1Var) {
                x0aVar2 = x0aVar;
                w14Var = new w14(x0aVar2, bz7Var2, o72Var, b79Var, null, 20);
                e18Var.k0(w14Var);
            } else {
                w14Var = objN2;
                x0aVar2 = x0aVar;
            }
            fd9.i(e18Var, (pz7) w14Var, x0aVar2);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pz7() { // from class: bm5
                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    cn5.g(x0aVar2, l, bz7Var, bz7Var2, o72Var, b79Var, am5Var, xl5Var, wl5Var, zy7Var, ps7Var, (ld4) obj, x44.p0(i | 1));
                    return iei.a;
                }
            };
        }
    }

    public static final void h(zy7 zy7Var, py8 py8Var, String str, iqb iqbVar, boolean z, ld4 ld4Var, int i, int i2) {
        iqb iqbVar2;
        int i3;
        boolean z2;
        int i4;
        iqb iqbVar3;
        boolean z3;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-368059805);
        int i5 = i | (e18Var.h(zy7Var) ? 4 : 2) | (e18Var.f(py8Var) ? 32 : 16) | (e18Var.f(str) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC);
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 = i5 | 3072;
            iqbVar2 = iqbVar;
        } else {
            iqbVar2 = iqbVar;
            i3 = i5 | (e18Var.f(iqbVar2) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE);
        }
        int i7 = i2 & 16;
        if (i7 != 0) {
            i4 = i3 | 24576;
            z2 = z;
        } else {
            z2 = z;
            i4 = i3 | (e18Var.g(z2) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN);
        }
        if (e18Var.Q(i4 & 1, (i4 & 9363) != 9362)) {
            iqb iqbVar4 = i6 != 0 ? fqb.E : iqbVar2;
            if (i7 != 0) {
                z2 = true;
            }
            boolean z4 = z2;
            e2i.b(c2i.a(e18Var), fd9.q0(-456272562, new pp(str, 9), e18Var), e2i.c(e18Var), null, false, fd9.q0(-1124908186, new bv(zy7Var, iqbVar4, z4, py8Var, str), e18Var), e18Var, 100663344, 248);
            iqbVar3 = iqbVar4;
            z3 = z4;
        } else {
            e18Var.T();
            iqbVar3 = iqbVar2;
            z3 = z2;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new k04(zy7Var, py8Var, str, iqbVar3, z3, i, i2);
        }
    }

    public static final void i(final u72 u72Var, final bz7 bz7Var, final long j, final Long l, final am5 am5Var, final xl5 xl5Var, final wl5 wl5Var, final Locale locale, final x0a x0aVar, final ps7 ps7Var, final zy7 zy7Var, ld4 ld4Var, final int i) {
        e18 e18Var;
        e18 e18Var2;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        l45 l45Var;
        lz1 lz1Var;
        boolean z;
        lz1 lz1Var2;
        boolean z2;
        int i7;
        boolean z3;
        String str;
        lz1 lz1Var3;
        String strC;
        l45 l45Var2;
        boolean z4;
        int i8;
        iqb iqbVarM;
        u72 u72Var2 = u72Var;
        am5 am5Var2 = am5Var;
        e18 e18Var3 = (e18) ld4Var;
        e18Var3.c0(1724672983);
        int i9 = i | (e18Var3.f(u72Var2) ? 4 : 2) | (e18Var3.h(bz7Var) ? 32 : 16) | (e18Var3.e(j) ? 256 : 128) | (e18Var3.f(l) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE) | (e18Var3.f(am5Var2) ? FreeTypeConstants.FT_LOAD_COLOR : 524288) | (e18Var3.f(xl5Var) ? 8388608 : 4194304) | (e18Var3.f(wl5Var) ? 67108864 : 33554432) | (e18Var3.f(locale) ? 536870912 : 268435456);
        if (e18Var3.Q(i9 & 1, ((i9 & 306783379) == 306783378 && ((((e18Var3.f(x0aVar) ? (char) 4 : (char) 2) | (e18Var3.h(ps7Var) ? ' ' : (char) 16)) | (e18Var3.h(zy7Var) ? (char) 256 : (char) 128)) & 147) == 146) ? false : true)) {
            e18Var3.a0(-960202325);
            e18Var3.p(false);
            Object objN = e18Var3.N();
            lz1 lz1Var4 = jd4.a;
            if (objN == lz1Var4) {
                objN = fd9.O(im6.E, e18Var3);
                e18Var3.k0(objN);
            }
            l45 l45Var3 = (l45) objN;
            boolean z5 = e18Var3.j(ve4.n) == fu9.F;
            int i10 = u72Var2.d;
            int i11 = u72Var2.c;
            xl5Var.getClass();
            int i12 = i11 + i10;
            int i13 = i12 - 1;
            fqb fqbVar = fqb.E;
            iqb iqbVarB = b.h(fqbVar, 288.0f).B(fqbVar);
            vo1 vo1Var = lja.S;
            vz8 vz8Var = ko0.f;
            q64 q64VarA = p64.a(vz8Var, vo1Var, e18Var3, 6);
            lz1 lz1Var5 = lz1Var4;
            int iHashCode = Long.hashCode(e18Var3.T);
            hyc hycVarL = e18Var3.l();
            iqb iqbVarE = kxk.E(e18Var3, iqbVarB);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var3.e0();
            boolean z6 = z5;
            if (e18Var3.S) {
                e18Var3.k(re4Var);
            } else {
                e18Var3.n0();
            }
            d4c.i0(e18Var3, cd4.f, q64VarA);
            d4c.i0(e18Var3, cd4.e, hycVarL);
            d4c.i0(e18Var3, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var3, cd4.h);
            d4c.i0(e18Var3, cd4.d, iqbVarE);
            e18Var3.a0(-1663449878);
            int i14 = 0;
            int i15 = 0;
            int i16 = 6;
            while (i15 < i16) {
                iqb iqbVarC = b.c(fqbVar, 1.0f);
                cxe cxeVarA = axe.a(vz8Var, lja.Q, e18Var3, 54);
                int iHashCode2 = Long.hashCode(e18Var3.T);
                hyc hycVarL2 = e18Var3.l();
                iqb iqbVarE2 = kxk.E(e18Var3, iqbVarC);
                dd4.e.getClass();
                vz8 vz8Var2 = vz8Var;
                re4 re4Var2 = cd4.b;
                e18Var3.e0();
                int i17 = i14;
                if (e18Var3.S) {
                    e18Var3.k(re4Var2);
                } else {
                    e18Var3.n0();
                }
                d4c.i0(e18Var3, cd4.f, cxeVarA);
                d4c.i0(e18Var3, cd4.e, hycVarL2);
                d4c.i0(e18Var3, cd4.g, Integer.valueOf(iHashCode2));
                d4c.h0(e18Var3, cd4.h);
                d4c.i0(e18Var3, cd4.d, iqbVarE2);
                e18Var3.a0(-1092569031);
                i14 = i17;
                int i18 = 0;
                while (i18 < 7) {
                    if (i14 < i10 || i14 >= i12) {
                        e18Var2 = e18Var3;
                        i2 = i18;
                        i3 = i10;
                        i4 = i12;
                        i5 = i13;
                        i6 = i15;
                        l45Var = l45Var3;
                        lz1Var = lz1Var5;
                        z = z6;
                        e18Var2.a0(490256726);
                        iqb iqbVarS = b.s(fqbVar, gwk.g, gwk.e, MTTypesetterKt.kLineSkipLimitMultiplier, 12);
                        umg umgVar = z79.c;
                        kxk.g(e18Var2, b.q(iqbVarS, ((va6) e18Var2.j(umgVar)).E, ((va6) e18Var2.j(umgVar)).E));
                        e18Var2.p(false);
                    } else {
                        e18Var3.a0(491361535);
                        int i19 = i14 - i10;
                        i2 = i18;
                        long j2 = (((long) i19) * 86400000) + u72Var2.e;
                        if (j2 == j) {
                            lz1Var2 = lz1Var5;
                            z2 = true;
                        } else {
                            lz1Var2 = lz1Var5;
                            z2 = false;
                        }
                        boolean z7 = l != null && j2 == l.longValue();
                        e18Var3.a0(492321698);
                        e18Var3.p(false);
                        StringBuilder sb = new StringBuilder();
                        i4 = i12;
                        e18Var3.a0(974818987);
                        e18Var3.p(false);
                        if (z2) {
                            e18Var3.a0(974842237);
                            if (sb.length() > 0) {
                                sb.append(", ");
                            }
                            sb.append(dch.E(R.string.m3c_date_picker_today_description, e18Var3));
                            e18Var3.p(false);
                            i7 = i15;
                        } else {
                            i7 = i15;
                            e18Var3.a0(975009451);
                            e18Var3.p(false);
                        }
                        String string = sb.length() == 0 ? null : sb.toString();
                        String strA = am5Var2.a(Long.valueOf(j2), locale, true);
                        if (strA == null) {
                            strA = "";
                        }
                        boolean zE = ((i9 & 29360128) == 8388608) | e18Var3.e(j2);
                        Object objN2 = e18Var3.N();
                        if (zE || objN2 == lz1Var2) {
                            objN2 = Boolean.TRUE;
                            e18Var3.k0(objN2);
                        }
                        boolean zBooleanValue = ((Boolean) objN2).booleanValue();
                        String strA2 = m72.a(i19 + 1, locale);
                        boolean z8 = i14 == i10;
                        boolean z9 = i14 == i13;
                        if (ps7Var == null) {
                            i3 = i10;
                            i5 = i13;
                            z3 = zBooleanValue;
                            iqbVarM = fqbVar;
                            str = string;
                            lz1Var3 = lz1Var2;
                            strC = strA;
                            l45Var2 = l45Var3;
                            z4 = z6;
                            i6 = i7;
                            i8 = 32;
                        } else if (z8) {
                            i3 = i10;
                            i5 = i13;
                            z3 = zBooleanValue;
                            str = string;
                            lz1Var3 = lz1Var2;
                            strC = strA;
                            z4 = z6;
                            i6 = i7;
                            i8 = 32;
                            l45Var2 = l45Var3;
                            iqbVarM = dch.M(fqbVar, new zm5(zy7Var, x0aVar, z4, ps7Var, l45Var3));
                        } else {
                            i3 = i10;
                            i5 = i13;
                            z3 = zBooleanValue;
                            str = string;
                            lz1Var3 = lz1Var2;
                            strC = strA;
                            l45Var2 = l45Var3;
                            z4 = z6;
                            i6 = i7;
                            i8 = 32;
                            iqbVarM = z9 ? dch.M(fqbVar, new an5(ps7Var, z4, x0aVar, l45Var2)) : dch.M(fqbVar, new ym5(z4, ps7Var, 1));
                        }
                        boolean zE2 = ((i9 & 112) == i8) | e18Var3.e(j2);
                        Object objN3 = e18Var3.N();
                        if (zE2 || objN3 == lz1Var3) {
                            lz1Var = lz1Var3;
                            objN3 = new nx4(bz7Var, j2, 1);
                            e18Var3.k0(objN3);
                        } else {
                            lz1Var = lz1Var3;
                        }
                        zy7 zy7Var2 = (zy7) objN3;
                        if (str != null) {
                            strC = ij0.C(str, ", ", strC);
                        }
                        e18 e18Var4 = e18Var3;
                        l45Var = l45Var2;
                        z = z4;
                        e(strA2, iqbVarM, z7, zy7Var2, z7, z3, z2, strC, wl5Var, e18Var4, (i9 << 3) & 1879048192);
                        e18Var2 = e18Var4;
                        e18Var2.p(false);
                    }
                    i14++;
                    i18 = i2 + 1;
                    am5Var2 = am5Var;
                    z6 = z;
                    e18Var3 = e18Var2;
                    l45Var3 = l45Var;
                    i12 = i4;
                    i15 = i6;
                    i13 = i5;
                    lz1Var5 = lz1Var;
                    u72Var2 = u72Var;
                    i10 = i3;
                }
                e18 e18Var5 = e18Var3;
                e18Var5.p(false);
                e18Var5.p(true);
                i15++;
                am5Var2 = am5Var;
                e18Var3 = e18Var5;
                vz8Var = vz8Var2;
                i13 = i13;
                i16 = 6;
                u72Var2 = u72Var;
                i10 = i10;
            }
            e18Var = e18Var3;
            e18Var.p(false);
            e18Var.p(true);
        } else {
            e18Var = e18Var3;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pz7(bz7Var, j, l, am5Var, xl5Var, wl5Var, locale, x0aVar, ps7Var, zy7Var, i) { // from class: hm5
                public final /* synthetic */ bz7 F;
                public final /* synthetic */ long G;
                public final /* synthetic */ Long H;
                public final /* synthetic */ am5 I;
                public final /* synthetic */ xl5 J;
                public final /* synthetic */ wl5 K;
                public final /* synthetic */ Locale L;
                public final /* synthetic */ x0a M;
                public final /* synthetic */ ps7 N;
                public final /* synthetic */ zy7 O;

                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP0 = x44.p0(221185);
                    cn5.i(this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, (ld4) obj, iP0);
                    return iei.a;
                }
            };
        }
    }

    public static final void j(final iqb iqbVar, final boolean z, final boolean z2, final boolean z3, final String str, final iqb iqbVar2, final zy7 zy7Var, final zy7 zy7Var2, final zy7 zy7Var3, final zy7 zy7Var4, final bt7 bt7Var, final wl5 wl5Var, ld4 ld4Var, final int i, final int i2) {
        int i3;
        int i4;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(942117263);
        int i5 = i | (e18Var.g(z) ? 32 : 16) | (e18Var.g(z2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var.g(z3) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE) | (e18Var.f(str) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) | (e18Var.f(iqbVar2) ? 131072 : 65536) | (e18Var.h(zy7Var) ? FreeTypeConstants.FT_LOAD_COLOR : 524288) | (e18Var.h(zy7Var2) ? 8388608 : 4194304) | (e18Var.h(zy7Var3) ? 67108864 : 33554432) | (e18Var.h(zy7Var4) ? 536870912 : 268435456);
        if ((i2 & 6) == 0) {
            i3 = i2 | (e18Var.f(bt7Var) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= e18Var.f(wl5Var) ? 32 : 16;
        }
        if (e18Var.Q(i5 & 1, ((306783379 & i5) == 306783378 && (i3 & 19) == 18) ? false : true)) {
            iqb iqbVarH = b.h(b.c(iqbVar, 1.0f), 56.0f);
            cxe cxeVarA = axe.a(z3 ? ko0.a : ko0.g, lja.Q, e18Var, 48);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarH);
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
            iqb iqbVarS = iv1.s(fqb.E, bt7Var);
            boolean z4 = ((i5 & 7168) == 2048) | ((1879048192 & i5) == 536870912);
            Object objN = e18Var.N();
            if (z4 || objN == jd4.a) {
                i4 = 0;
                objN = new ym5(z3, zy7Var4, 0);
                e18Var.k0(objN);
            } else {
                i4 = 0;
            }
            o(zy7Var3, z3, dch.M(iqbVarS, (bz7) objN), fd9.q0(921071711, new um5(str, i4, wl5Var), e18Var), e18Var, ((i5 >> 24) & 14) | 3072 | ((i5 >> 6) & 112));
            if (z3) {
                e18Var.a0(-1240891753);
                e18Var.p(false);
            } else {
                e18Var.a0(-1241751848);
                j8.c(sq6.m(wl5Var.f, on4.a), fd9.q0(591596400, new iw0(zy7Var2, z2, zy7Var, iqbVar2, z), e18Var), e18Var, 56);
                e18Var.p(false);
            }
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pz7(z, z2, z3, str, iqbVar2, zy7Var, zy7Var2, zy7Var3, zy7Var4, bt7Var, wl5Var, i, i2) { // from class: wm5
                public final /* synthetic */ boolean F;
                public final /* synthetic */ boolean G;
                public final /* synthetic */ boolean H;
                public final /* synthetic */ String I;
                public final /* synthetic */ iqb J;
                public final /* synthetic */ zy7 K;
                public final /* synthetic */ zy7 L;
                public final /* synthetic */ zy7 M;
                public final /* synthetic */ zy7 N;
                public final /* synthetic */ bt7 O;
                public final /* synthetic */ wl5 P;
                public final /* synthetic */ int Q;

                {
                    this.Q = i2;
                }

                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP0 = x44.p0(7);
                    int iP02 = x44.p0(this.Q);
                    cn5.j(this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, (ld4) obj, iP0, iP02);
                    return iei.a;
                }
            };
        }
    }

    public static final void k(final Long l, final long j, final int i, final bz7 bz7Var, final bz7 bz7Var2, final o72 o72Var, final b79 b79Var, final am5 am5Var, final xl5 xl5Var, final wl5 wl5Var, final bt7 bt7Var, ld4 ld4Var, final int i2) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-2053685029);
        int i3 = i2 | (e18Var.f(l) ? 4 : 2) | (e18Var.e(j) ? 32 : 16) | (e18Var.d(i) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var.h(bz7Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE) | (e18Var.h(bz7Var2) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) | (e18Var.h(o72Var) ? 131072 : 65536) | (e18Var.h(b79Var) ? FreeTypeConstants.FT_LOAD_COLOR : 524288) | (e18Var.f(am5Var) ? 8388608 : 4194304) | (e18Var.f(xl5Var) ? 67108864 : 33554432) | (e18Var.f(wl5Var) ? 536870912 : 268435456);
        if (e18Var.Q(i3 & 1, ((i3 & 306783379) == 306783378 && ((e18Var.f(bt7Var) ? (char) 4 : (char) 2) & 3) == 2) ? false : true)) {
            int i4 = -((cz5) e18Var.j(ve4.h)).M0(48.0f);
            yig yigVarP = u00.P(asb.G, e18Var);
            yig yigVarP2 = u00.P(asb.H, e18Var);
            asb asbVar = asb.E;
            yig yigVarP3 = u00.P(asbVar, e18Var);
            yig yigVarP4 = u00.P(asbVar, e18Var);
            o86 o86Var = new o86(i);
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (objN == lz1Var) {
                objN = new qy4(11);
                e18Var.k0(objN);
            }
            iqb iqbVarB = tjf.b(fqb.E, false, (bz7) objN);
            boolean zH = e18Var.h(yigVarP3) | e18Var.h(yigVarP) | e18Var.h(yigVarP2) | e18Var.d(i4) | e18Var.h(yigVarP4);
            Object objN2 = e18Var.N();
            if (zH || objN2 == lz1Var) {
                objN2 = new wu0(yigVarP3, yigVarP, yigVarP2, i4, yigVarP4);
                e18Var.k0(objN2);
            }
            xn5.G(o86Var, iqbVarB, (bz7) objN2, null, "DatePickerDisplayModeAnimation", null, fd9.q0(1838500091, new sz7() { // from class: qm5
                @Override // defpackage.sz7
                public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
                    ld4 ld4Var2 = (ld4) obj3;
                    ((Integer) obj4).intValue();
                    int i5 = ((o86) obj2).a;
                    Long l2 = l;
                    bz7 bz7Var3 = bz7Var;
                    o72 o72Var2 = o72Var;
                    b79 b79Var2 = b79Var;
                    am5 am5Var2 = am5Var;
                    xl5 xl5Var2 = xl5Var;
                    wl5 wl5Var2 = wl5Var;
                    if (i5 == 0) {
                        e18 e18Var2 = (e18) ld4Var2;
                        e18Var2.a0(1567031954);
                        cn5.c(l2, j, bz7Var3, bz7Var2, o72Var2, b79Var2, am5Var2, xl5Var2, wl5Var2, e18Var2, 0);
                        e18Var2.p(false);
                    } else if (i5 == 1) {
                        e18 e18Var3 = (e18) ld4Var2;
                        e18Var3.a0(1567050592);
                        rl5.a(l2, bz7Var3, o72Var2, b79Var2, am5Var2, xl5Var2, wl5Var2, bt7Var, e18Var3, 0);
                        e18Var3.p(false);
                    } else {
                        e18 e18Var4 = (e18) ld4Var2;
                        e18Var4.a0(1334373351);
                        e18Var4.p(false);
                    }
                    return iei.a;
                }
            }, e18Var), e18Var, ((i3 >> 6) & 14) | 1597440, 40);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pz7(l, j, i, bz7Var, bz7Var2, o72Var, b79Var, am5Var, xl5Var, wl5Var, bt7Var, i2) { // from class: rm5
                public final /* synthetic */ Long E;
                public final /* synthetic */ long F;
                public final /* synthetic */ int G;
                public final /* synthetic */ bz7 H;
                public final /* synthetic */ bz7 I;
                public final /* synthetic */ o72 J;
                public final /* synthetic */ b79 K;
                public final /* synthetic */ am5 L;
                public final /* synthetic */ xl5 M;
                public final /* synthetic */ wl5 N;
                public final /* synthetic */ bt7 O;

                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP0 = x44.p0(1);
                    cn5.k(this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, (ld4) obj, iP0);
                    return iei.a;
                }
            };
        }
    }

    public static final void l(wl5 wl5Var, o72 o72Var, ld4 ld4Var, int i) {
        wl5 wl5Var2 = wl5Var;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1849465391);
        int i2 = (i & 6) == 0 ? (e18Var.f(wl5Var2) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= e18Var.h(o72Var) ? 32 : 16;
        }
        boolean z = false;
        boolean z2 = true;
        if (e18Var.Q(i2 & 1, (i2 & 19) != 18)) {
            int i3 = o72Var.c;
            ArrayList arrayList = o72Var.d;
            ArrayList arrayList2 = new ArrayList();
            int i4 = i3 - 1;
            int size = arrayList.size();
            for (int i5 = i4; i5 < size; i5++) {
                arrayList2.add(arrayList.get(i5));
            }
            for (int i6 = 0; i6 < i4; i6++) {
                arrayList2.add(arrayList.get(i6));
            }
            tkh tkhVarA = bci.a(gwk.x, e18Var);
            fqb fqbVar = fqb.E;
            float f = MTTypesetterKt.kLineSkipLimitMultiplier;
            iqb iqbVarC = b.c(b.b(fqbVar, MTTypesetterKt.kLineSkipLimitMultiplier, 48.0f, 1), 1.0f);
            cxe cxeVarA = axe.a(ko0.f, lja.Q, e18Var, 54);
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
            d4c.i0(e18Var, cd4.f, cxeVarA);
            d4c.i0(e18Var, cd4.e, hycVarL);
            d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var, cd4.h);
            d4c.i0(e18Var, cd4.d, iqbVarE);
            e18Var.a0(24563235);
            int size2 = arrayList2.size();
            int i7 = 0;
            while (i7 < size2) {
                cpc cpcVar = (cpc) arrayList2.get(i7);
                boolean zF = e18Var.f(cpcVar);
                Object objN = e18Var.N();
                if (zF || objN == jd4.a) {
                    objN = new py3(13, cpcVar);
                    e18Var.k0(objN);
                }
                iqb iqbVarS = b.s(tjf.a(fqbVar, (bz7) objN), gwk.g, gwk.e, f, 12);
                umg umgVar = z79.c;
                iqb iqbVarQ = b.q(iqbVarS, ((va6) e18Var.j(umgVar)).E, ((va6) e18Var.j(umgVar)).E);
                o5b o5bVarD = dw1.d(lja.K, z);
                int iHashCode2 = Long.hashCode(e18Var.T);
                hyc hycVarL2 = e18Var.l();
                iqb iqbVarE2 = kxk.E(e18Var, iqbVarQ);
                dd4.e.getClass();
                re4 re4Var2 = cd4.b;
                e18Var.e0();
                if (e18Var.S) {
                    e18Var.k(re4Var2);
                } else {
                    e18Var.n0();
                }
                d4c.i0(e18Var, cd4.f, o5bVarD);
                d4c.i0(e18Var, cd4.e, hycVarL2);
                d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode2));
                d4c.h0(e18Var, cd4.h);
                d4c.i0(e18Var, cd4.d, iqbVarE2);
                e18 e18Var2 = e18Var;
                tjh.b((String) cpcVar.F, b.y(fqbVar, null, 3), wl5Var2.d, 0L, null, null, null, 0L, null, new fdh(3), 0L, 0, false, 0, 0, null, tkhVarA, e18Var2, 48, 0, 130040);
                e18Var = e18Var2;
                e18Var.p(true);
                i7++;
                z = false;
                z2 = true;
                size2 = size2;
                arrayList2 = arrayList2;
                fqbVar = fqbVar;
                f = f;
                wl5Var2 = wl5Var;
            }
            e18Var.p(z);
            e18Var.p(z2);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new qq(wl5Var, o72Var, i, 19);
        }
    }

    public static final void m(String str, iqb iqbVar, boolean z, boolean z2, zy7 zy7Var, String str2, wl5 wl5Var, ld4 ld4Var, int i) {
        int i2;
        qu1 qu1VarA;
        long j;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1153850597);
        int i3 = i | (e18Var.f(str) ? 4 : 2) | (e18Var.f(iqbVar) ? 32 : 16) | (e18Var.g(z) ? 256 : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var.g(z2) ? 2048 : FreeTypeConstants.FT_LOAD_NO_RECURSE) | (e18Var.h(zy7Var) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) | (e18Var.g(true) ? 131072 : 65536) | (e18Var.f(str2) ? 1048576 : 524288) | (e18Var.f(wl5Var) ? 8388608 : 4194304);
        if (e18Var.Q(i3 & 1, (4793491 & i3) != 4793490)) {
            boolean z3 = ((i3 & 7168) == 2048) | ((i3 & 896) == 256);
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (z3 || objN == lz1Var) {
                if (!z2 || z) {
                    i2 = i3;
                    qu1VarA = null;
                } else {
                    i2 = i3;
                    qu1VarA = sf5.a(gwk.l, wl5Var.u);
                }
                objN = qu1VarA;
                e18Var.k0(objN);
            } else {
                i2 = i3;
            }
            qu1 qu1Var = (qu1) objN;
            boolean z4 = (i2 & 3670016) == 1048576;
            Object objN2 = e18Var.N();
            if (z4 || objN2 == lz1Var) {
                objN2 = new cm5(str2, 3);
                e18Var.k0(objN2);
            }
            iqb iqbVarB = tjf.b(iqbVar, true, (bz7) objN2);
            e0g e0gVarB = k1g.b(gwk.D, e18Var);
            int i4 = i2 >> 6;
            int i5 = i4 & 14;
            if (z) {
                j = wl5Var.l;
            } else {
                wl5Var.getClass();
                j = d54.g;
            }
            pzg.b(z, zy7Var, iqbVarB, true, e0gVarB, ((d54) f8g.a(j, u00.P(asb.G, e18Var), null, e18Var, 0, 12).getValue()).a, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, qu1Var, null, fd9.q0(-564400443, new q32(str, wl5Var, z2, z), e18Var), e18Var, i5 | ((i2 >> 9) & 112) | (i4 & 7168), 1472);
            e18Var = e18Var;
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ey2(str, iqbVar, z, z2, zy7Var, str2, wl5Var, i);
        }
    }

    public static final void n(iqb iqbVar, long j, bz7 bz7Var, xl5 xl5Var, o72 o72Var, b79 b79Var, wl5 wl5Var, bt7 bt7Var, zy7 zy7Var, zy7 zy7Var2, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-724154510);
        int i2 = i | (e18Var.e(j) ? 32 : 16) | (e18Var.h(bz7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var.f(xl5Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE) | (e18Var.h(o72Var) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) | (e18Var.h(b79Var) ? 131072 : 65536) | (e18Var.f(wl5Var) ? FreeTypeConstants.FT_LOAD_COLOR : 524288) | (e18Var.f(bt7Var) ? 8388608 : 4194304) | (e18Var.h(zy7Var) ? 67108864 : 33554432) | (e18Var.h(zy7Var2) ? 536870912 : 268435456);
        if (e18Var.Q(i2 & 1, (306783379 & i2) != 306783378)) {
            tjh.a(bci.a(gwk.A, e18Var), fd9.q0(1910384865, new em5(o72Var, j, b79Var, iqbVar, wl5Var, zy7Var, zy7Var2, bt7Var, bz7Var, xl5Var), e18Var), e18Var, 48);
            boolean z = (29360128 & i2) == 8388608;
            Object objN = e18Var.N();
            if (z || objN == jd4.a) {
                objN = new fz3(bt7Var, null, 4);
                e18Var.k0(objN);
            }
            fd9.i(e18Var, (pz7) objN, bt7Var);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new em5(iqbVar, j, bz7Var, xl5Var, o72Var, b79Var, wl5Var, bt7Var, zy7Var, zy7Var2, i);
        }
    }

    public static final void o(zy7 zy7Var, boolean z, iqb iqbVar, ta4 ta4Var, ld4 ld4Var, int i) {
        int i2;
        iqb iqbVar2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-709923073);
        if ((i & 6) == 0) {
            i2 = (e18Var.h(zy7Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.g(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            iqbVar2 = iqbVar;
            i2 |= e18Var.f(iqbVar2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        } else {
            iqbVar2 = iqbVar;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var.h(ta4Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if (e18Var.Q(i2 & 1, (i2 & 1171) != 1170)) {
            vve vveVar = xve.a;
            qnc qncVar = q02.a;
            csg.j(zy7Var, iqbVar2, false, vveVar, q02.d(0L, ((d54) e18Var.j(on4.a)).a, 0L, e18Var, 13), null, null, fd9.q0(1899489890, new s50(ta4Var, z, 6), e18Var), e18Var, (i2 & 14) | 807075840 | ((i2 >> 3) & 112), 388);
            e18Var = e18Var;
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new en3(zy7Var, z, iqbVar, ta4Var, i);
        }
    }

    public static final boolean p(KeyEvent keyEvent) {
        return keyEvent.isShiftPressed() && ssj.j(keyEvent) == 2 && no9.a(zsj.b(keyEvent.getKeyCode()), no9.p);
    }

    public static final boolean q(KeyEvent keyEvent) {
        return !keyEvent.isShiftPressed() && ssj.j(keyEvent) == 2 && no9.a(zsj.b(keyEvent.getKeyCode()), no9.p);
    }

    public static final boolean r(KeyEvent keyEvent) {
        if (ssj.j(keyEvent) != 2) {
            return false;
        }
        long jB = zsj.b(keyEvent.getKeyCode());
        int i = no9.O;
        return no9.a(jB, no9.f);
    }

    public static final boolean s(KeyEvent keyEvent) {
        if (ssj.j(keyEvent) != 2) {
            return false;
        }
        long jB = zsj.b(keyEvent.getKeyCode());
        int i = no9.O;
        return no9.a(jB, no9.g);
    }
}
