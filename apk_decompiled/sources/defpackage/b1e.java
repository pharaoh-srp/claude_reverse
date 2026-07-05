package defpackage;

import android.app.Activity;
import android.content.Context;
import androidx.compose.foundation.b;
import androidx.compose.foundation.layout.FillElement;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.design.icon.a;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b1e {
    public static final Set a = mp0.Z0(new String[]{"youtube.com", "youtube-nocookie.com"});

    public static final void a(Activity activity, boolean z, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1286554108);
        int i2 = (e18Var.h(activity) ? 4 : 2) | i | (e18Var.g(z) ? 32 : 16);
        if (e18Var.Q(i2 & 1, (i2 & 19) != 18)) {
            Boolean boolValueOf = Boolean.valueOf(z);
            boolean zH = e18Var.h(activity) | ((i2 & 112) == 32);
            Object objN = e18Var.N();
            if (zH || objN == jd4.a) {
                objN = new xu0(activity, z, 3);
                e18Var.k0(objN);
            }
            fd9.e(activity, boolValueOf, (bz7) objN, e18Var);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new xb2(i, 9, activity, z);
        }
    }

    public static final void b(zy7 zy7Var, iqb iqbVar, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(68968728);
        if ((i & 6) == 0) {
            i2 = (e18Var.h(zy7Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.f(iqbVar) ? 32 : 16;
        }
        if (e18Var.Q(i2 & 1, (i2 & 19) != 18)) {
            xo1 xo1Var = lja.K;
            iqb iqbVarC = b.c(yfd.p(xn5.V(androidx.compose.foundation.layout.b.o(iqbVar, 44.0f), xve.a), d54.b(0.5f, d54.b), zni.b), false, d4c.j0(R.string.generic_button_close, e18Var), new vue(0), null, zy7Var, 9);
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
            cv8.b(a.a(ud0.M1, e18Var), null, androidx.compose.foundation.layout.b.o(fqb.E, 20.0f), d54.d, e18Var, 3512, 0);
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new mu(zy7Var, iqbVar, i, 12);
        }
    }

    public static final void c(zy7 zy7Var, iqb iqbVar, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1481027023);
        int i2 = (e18Var.f(iqbVar) ? 32 : 16) | i;
        if (e18Var.Q(i2 & 1, (i2 & 19) != 18)) {
            vo1 vo1Var = lja.T;
            iqb iqbVarL = gb9.L(iqbVar, 32.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2);
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
            pvj.c(msk.a, msk.b, null, d54.d, MTTypesetterKt.kLineSkipLimitMultiplier, e18Var, 3126, 20);
            dtj.a(gid.p(16.0f, R.string.generic_retry, e18Var, e18Var, fqb.E), null, false, null, null, y02.a, 0L, zy7Var, e18Var, 12779520, 94);
            e18Var = e18Var;
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new xh(zy7Var, iqbVar, i, 14);
        }
    }

    public static final void d(zy7 zy7Var, zy7 zy7Var2, zy7 zy7Var3, iqb iqbVar, ld4 ld4Var, int i) {
        zy7 zy7Var4;
        zy7 zy7Var5;
        lz1 lz1Var;
        Integer num;
        nw1 nw1Var;
        xo1 xo1Var = lja.K;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-2137526499);
        tp4 tp4Var = null;
        int i2 = i | (e18Var.f(null) ? 4 : 2) | (e18Var.h(zy7Var) ? 32 : 16) | (e18Var.f(iqbVar) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN);
        if (e18Var.Q(i2 & 1, (i2 & 9363) != 9362)) {
            Object objN = e18Var.N();
            d1e d1eVar = d1e.a;
            lz1 lz1Var2 = jd4.a;
            if (objN == lz1Var2) {
                objN = mpk.P(d1eVar);
                e18Var.k0(objN);
            }
            nwb nwbVar = (nwb) objN;
            Object objN2 = e18Var.N();
            if (objN2 == lz1Var2) {
                objN2 = vb7.g(0, e18Var);
            }
            isc iscVar = (isc) objN2;
            a(trk.e((Context) e18Var.j(w00.b)), !(((f1e) nwbVar.getValue()) instanceof c1e), e18Var, 0);
            Integer numValueOf = Integer.valueOf(iscVar.h());
            boolean z = (i2 & 14) == 4;
            Object objN3 = e18Var.N();
            if (z || objN3 == lz1Var2) {
                lz1Var = lz1Var2;
                num = numValueOf;
                lza lzaVar = new lza(zy7Var2, nwbVar, zy7Var3, tp4Var, 9);
                e18Var.k0(lzaVar);
                objN3 = lzaVar;
            } else {
                lz1Var = lz1Var2;
                num = numValueOf;
            }
            fd9.j(null, num, (pz7) objN3, e18Var);
            FillElement fillElement = androidx.compose.foundation.layout.b.c;
            iqb iqbVarP = yfd.p(iqbVar.B(fillElement), d54.b, zni.b);
            xo1 xo1Var2 = lja.G;
            o5b o5bVarD = dw1.d(xo1Var2, false);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarP);
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
            f1e f1eVar = (f1e) nwbVar.getValue();
            boolean zR = x44.r(f1eVar, d1eVar);
            fqb fqbVar = fqb.E;
            nw1 nw1Var2 = nw1.a;
            if (zR) {
                e18Var.a0(-2036946319);
                nw1Var = nw1Var2;
                ez1.a(nw1Var2.a(fqbVar, xo1Var), vf2.J, d54.d, e18Var, 432, 0);
                e18Var = e18Var;
                e18Var.p(false);
                zy7Var4 = zy7Var3;
            } else {
                nw1Var = nw1Var2;
                if (f1eVar instanceof e1e) {
                    e18Var.a0(-1312626849);
                    String str = ((e1e) f1eVar).a;
                    int iH = iscVar.h();
                    Object objN4 = e18Var.N();
                    if (objN4 == lz1Var) {
                        zy7Var4 = zy7Var3;
                        objN4 = new pn(zy7Var4, nwbVar, 22);
                        e18Var.k0(objN4);
                    } else {
                        zy7Var4 = zy7Var3;
                    }
                    f(iH, 3072, e18Var, (zy7) objN4, fillElement, str);
                    e18Var.p(false);
                } else {
                    zy7Var4 = zy7Var3;
                    if (!x44.r(f1eVar, c1e.a)) {
                        throw ebh.u(e18Var, -1312635290, false);
                    }
                    e18Var.a0(-1312616545);
                    Object objN5 = e18Var.N();
                    if (objN5 == lz1Var) {
                        objN5 = new op(nwbVar, iscVar, 3);
                        e18Var.k0(objN5);
                    }
                    c((zy7) objN5, nw1Var.a(fqbVar, xo1Var), e18Var, 6);
                    e18Var.p(false);
                }
            }
            iqb iqbVarA = nw1Var.a(gb9.J(mpk.k0(fqbVar, mpk.l), 16.0f), xo1Var2);
            int i3 = (i2 >> 3) & 14;
            zy7Var5 = zy7Var;
            b(zy7Var5, iqbVarA, e18Var, i3);
            e18Var.p(true);
        } else {
            zy7Var4 = zy7Var3;
            zy7Var5 = zy7Var;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new h94(zy7Var5, zy7Var2, zy7Var4, iqbVar, i, 1);
        }
    }

    public static final void e(int i, ld4 ld4Var, bz7 bz7Var, iqb iqbVar) {
        bz7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1901856269);
        int i2 = (e18Var.h(bz7Var) ? 4 : 2) | i | 432;
        if (e18Var.Q(i2 & 1, (i2 & 147) != 146)) {
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (objN == lz1Var) {
                objN = mpk.P(null);
                e18Var.k0(objN);
            }
            nwb nwbVar = (nwb) objN;
            boolean z = (i2 & 14) == 4;
            Object objN2 = e18Var.N();
            if (z || objN2 == lz1Var) {
                objN2 = new bi(bz7Var, nwbVar, 3);
                e18Var.k0(objN2);
            }
            zy7 zy7Var = (zy7) objN2;
            wpk.a(zy7Var, new c36(228, false, false, false), fd9.q0(1379703638, new q05(zy7Var, nwbVar), e18Var), e18Var, 432, 0);
            iqbVar = fqb.E;
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new z0e(bz7Var, iqbVar, i);
        }
    }

    public static final void f(int i, int i2, ld4 ld4Var, zy7 zy7Var, iqb iqbVar, String str) {
        e18 e18Var;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(897512271);
        int i3 = i2 | (e18Var2.f(str) ? 4 : 2) | (e18Var2.d(i) ? 32 : 16) | (e18Var2.h(zy7Var) ? 256 : FreeTypeConstants.FT_LOAD_PEDANTIC);
        if (e18Var2.Q(i3 & 1, (i3 & 1171) != 1170)) {
            int i4 = i3 & 14;
            boolean z = ((i3 & 112) == 32) | (i4 == 4);
            Object objN = e18Var2.N();
            lz1 lz1Var = jd4.a;
            if (z || objN == lz1Var) {
                objN = mpk.P(Boolean.FALSE);
                e18Var2.k0(objN);
            }
            nwb nwbVar = (nwb) objN;
            o5b o5bVarD = dw1.d(lja.G, false);
            int iHashCode = Long.hashCode(e18Var2.T);
            hyc hycVarL = e18Var2.l();
            iqb iqbVarE = kxk.E(e18Var2, iqbVar);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var2.e0();
            if (e18Var2.S) {
                e18Var2.k(re4Var);
            } else {
                e18Var2.n0();
            }
            d4c.i0(e18Var2, cd4.f, o5bVarD);
            d4c.i0(e18Var2, cd4.e, hycVarL);
            d4c.i0(e18Var2, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var2, cd4.h);
            d4c.i0(e18Var2, cd4.d, iqbVarE);
            FillElement fillElement = androidx.compose.foundation.layout.b.c;
            boolean zF = ((i3 & 896) == 256) | e18Var2.f(nwbVar) | (i4 == 4);
            Object objN2 = e18Var2.N();
            if (zF || objN2 == lz1Var) {
                objN2 = new f2d(str, nwbVar, zy7Var);
                e18Var2.k0(objN2);
            }
            bz7 bz7Var = (bz7) objN2;
            Object objN3 = e18Var2.N();
            if (objN3 == lz1Var) {
                objN3 = new f7d(20);
                e18Var2.k0(objN3);
            }
            e18Var = e18Var2;
            uj5.b(bz7Var, fillElement, null, (bz7) objN3, null, e18Var, 3120, 20);
            if (((Boolean) nwbVar.getValue()).booleanValue()) {
                e18Var.a0(-2100730323);
                e18Var.p(false);
            } else {
                e18Var.a0(-2100907457);
                ez1.a(nw1.a.a(fqb.E, lja.K), vf2.J, d54.d, e18Var, 432, 0);
                e18Var = e18Var;
                e18Var.p(false);
            }
            e18Var.p(true);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new bk1(str, i, zy7Var, iqbVar, i2);
        }
    }

    public static final String g(String str) {
        vs8 vs8VarC;
        Object objPrevious;
        try {
            us8 us8Var = new us8();
            us8Var.h(null, str);
            vs8VarC = us8Var.c();
        } catch (IllegalArgumentException unused) {
            vs8VarC = null;
        }
        if (vs8VarC != null) {
            String lowerCase = vs8VarC.d.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            if (lowerCase.equals("youtu.be") || lowerCase.equals("youtube.com") || isg.h0(lowerCase, ".youtube.com", false)) {
                String strG = vs8VarC.g("v");
                if (strG != null) {
                    if (!h(strG)) {
                        strG = null;
                    }
                    if (strG != null) {
                        return strG;
                    }
                }
                ArrayList arrayList = vs8VarC.f;
                ListIterator listIterator = arrayList.listIterator(arrayList.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        objPrevious = null;
                        break;
                    }
                    objPrevious = listIterator.previous();
                    if (((String) objPrevious).length() > 0) {
                        break;
                    }
                }
                String str2 = (String) objPrevious;
                if (str2 == null || !h(str2)) {
                    return null;
                }
                return str2;
            }
        }
        return null;
    }

    public static final boolean h(String str) {
        if (str.length() == 11) {
            for (int i = 0; i < str.length(); i++) {
                char cCharAt = str.charAt(i);
                if (Character.isLetterOrDigit(cCharAt) || cCharAt == '-' || cCharAt == '_') {
                }
            }
            return true;
        }
        return false;
    }
}
