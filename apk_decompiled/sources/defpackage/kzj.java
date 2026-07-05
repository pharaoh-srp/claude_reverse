package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.design.icon.a;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class kzj {
    public static final ta4 a = new ta4(1684427120, false, new bb4(26));

    public static final void a(int i, ld4 ld4Var) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-254308461);
        if (e18Var.Q(i & 1, i != 0)) {
            xo1 xo1Var = lja.K;
            iqb iqbVarJ = gb9.J(b.c, 32.0f);
            o5b o5bVarD = dw1.d(xo1Var, false);
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
            d4c.i0(e18Var, cd4.f, o5bVarD);
            d4c.i0(e18Var, cd4.e, hycVarL);
            d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var, cd4.h);
            d4c.i0(e18Var, cd4.d, iqbVarE);
            tjd.a(b.o(fqb.E, 48.0f), 0L, MTTypesetterKt.kLineSkipLimitMultiplier, 0L, 0, MTTypesetterKt.kLineSkipLimitMultiplier, e18Var, 6, 62);
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new uw8(i, 9);
        }
    }

    public static final void b(zy7 zy7Var, iqb iqbVar, qi3 qi3Var, vid vidVar, ld4 ld4Var, int i) {
        iqb iqbVar2;
        qi3 qi3Var2;
        vid vidVar2;
        int i2;
        qi3 qi3Var3;
        vid vidVar3;
        iqb iqbVar3;
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-376298491);
        int i3 = i | (e18Var.h(zy7Var) ? 4 : 2) | 1200;
        if (e18Var.Q(i3 & 1, (i3 & 1171) != 1170)) {
            e18Var.V();
            int i4 = i & 1;
            tp4 tp4Var = null;
            lz1 lz1Var = jd4.a;
            if (i4 == 0 || e18Var.A()) {
                m7f m7fVarN = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF = e18Var.f(null) | e18Var.f(m7fVarN);
                Object objN = e18Var.N();
                if (zF || objN == lz1Var) {
                    objN = m7fVarN.a(jce.a.b(qi3.class), null, null);
                    e18Var.k0(objN);
                }
                e18Var.p(false);
                e18Var.p(false);
                qi3 qi3Var4 = (qi3) objN;
                m7f m7fVarB = gr9.b(e18Var);
                boolean zH = e18Var.h(m7fVarB);
                Object objN2 = e18Var.N();
                if (zH || objN2 == lz1Var) {
                    objN2 = new di(m7fVarB, 26);
                    e18Var.k0(objN2);
                }
                kce kceVar = jce.a;
                vid vidVar4 = (vid) fd9.r0(kceVar.b(vid.class), oq5.B(kceVar.b(vid.class)), (bz7) objN2, e18Var);
                i2 = i3 & (-8065);
                qi3Var3 = qi3Var4;
                vidVar3 = vidVar4;
                iqbVar3 = fqb.E;
            } else {
                e18Var.T();
                i2 = i3 & (-8065);
                iqbVar3 = iqbVar;
                qi3Var3 = qi3Var;
                vidVar3 = vidVar;
            }
            e18Var.q();
            boolean zH2 = e18Var.h(qi3Var3);
            Object objN3 = e18Var.N();
            if (zH2 || objN3 == lz1Var) {
                objN3 = new gw(qi3Var3, tp4Var, 23);
                e18Var.k0(objN3);
            }
            csg.g((bz7) objN3, e18Var, 0, 1);
            Object objN4 = e18Var.N();
            if (objN4 == lz1Var) {
                objN4 = sq6.p(e18Var);
            }
            ybg ybgVar = (ybg) objN4;
            ssj.c(d4c.j0(R.string.title_profile, e18Var), zy7Var, iqbVar3, null, fd9.q0(-920385841, new rn(ybgVar, 18), e18Var), 0L, fd9.q0(-51852716, new nw7(vidVar3, 22, ybgVar), e18Var), e18Var, ((i2 << 3) & 112) | 1597824, 40);
            iqbVar2 = iqbVar3;
            qi3Var2 = qi3Var3;
            vidVar2 = vidVar3;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
            qi3Var2 = qi3Var;
            vidVar2 = vidVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new mm5(zy7Var, iqbVar2, qi3Var2, vidVar2, i, 28);
        }
    }

    public static final void c(int i, ld4 ld4Var, zy7 zy7Var, iqb iqbVar, String str, String str2, boolean z, boolean z2) {
        int i2;
        e18 e18Var;
        float f;
        long jB;
        long j;
        boolean z3;
        long j2;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(393393722);
        if ((i & 6) == 0) {
            i2 = i | (e18Var2.f(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        int i3 = i2 | (e18Var2.f(str2) ? 32 : 16) | (e18Var2.g(z) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var2.g(z2) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE) | (e18Var2.h(zy7Var) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN);
        if (e18Var2.Q(i3 & 1, (i3 & 74899) != 74898)) {
            wo1 wo1Var = lja.Q;
            ho0 ho0Var = new ho0(12.0f, true, new sz6(1));
            iqb iqbVarV = xn5.V(iqbVar, xve.b(28.0f));
            if (z) {
                e18Var2.a0(94259533);
                f = 28.0f;
                jB = d54.b(0.1f, gm3.a(e18Var2).c);
                e18Var2.p(false);
            } else {
                f = 28.0f;
                e18Var2.a0(94261439);
                jB = gm3.a(e18Var2).p;
                e18Var2.p(false);
            }
            iqb iqbVarP = yfd.p(iqbVarV, jB, zni.b);
            if (z) {
                e18Var2.a0(94265639);
                j = gm3.a(e18Var2).c;
                e18Var2.p(false);
            } else {
                e18Var2.a0(94267363);
                j = gm3.a(e18Var2).v;
                e18Var2.p(false);
            }
            iqb iqbVarK = gb9.K(j8.d0(ez1.t(iqbVarP, 1.0f, j, xve.b(f)), z, null, due.a(false, MTTypesetterKt.kLineSkipLimitMultiplier, 0L, null, false, 255), z2, new vue(3), zy7Var), 18.0f, 16.0f);
            cxe cxeVarA = axe.a(ho0Var, wo1Var, e18Var2, 54);
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
            d4c.i0(e18Var2, cd4.f, cxeVarA);
            d4c.i0(e18Var2, cd4.e, hycVarL);
            d4c.i0(e18Var2, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var2, cd4.h);
            d4c.i0(e18Var2, cd4.d, iqbVarE);
            tjh.b(str, null, 0L, eve.B(18), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var2, (i3 & 14) | 24576, 0, 262126);
            tkh tkhVar = ((jm3) gm3.c(e18Var2).e.E).g;
            if (z) {
                e18Var2.a0(1680094603);
                j2 = gm3.a(e18Var2).c;
                z3 = false;
            } else {
                z3 = false;
                e18Var2.a0(1680095813);
                j2 = gm3.a(e18Var2).M;
            }
            e18Var2.p(z3);
            tjh.b(str2, new hw9(1.0f, true), j2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tkhVar, e18Var2, (i3 >> 3) & 14, 0, 131064);
            e18Var = e18Var2;
            fqb fqbVar = fqb.E;
            if (z) {
                e18Var.a0(543471432);
                cv8.b(a.a(ud0.N, e18Var), null, b.o(fqbVar, 22.0f), gm3.a(e18Var).c, e18Var, 440, 0);
                e18Var.p(false);
            } else {
                e18Var.a0(543764475);
                kxk.g(e18Var, b.o(fqbVar, 22.0f));
                e18Var.p(false);
            }
            e18Var.p(true);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new rlg(str, str2, z, z2, zy7Var, iqbVar, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(defpackage.ml3 r18, java.lang.String r19, boolean r20, defpackage.bz7 r21, defpackage.zy7 r22, defpackage.iqb r23, defpackage.ld4 r24, int r25, int r26) {
        /*
            Method dump skipped, instruction units count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kzj.d(ml3, java.lang.String, boolean, bz7, zy7, iqb, ld4, int, int):void");
    }

    public static final CharSequence e(ke2 ke2Var, ge2 ge2Var, double d, pa1 pa1Var) {
        ke2Var.getClass();
        ge2Var.getClass();
        String strA = ke2Var.a(ge2Var, d);
        if (strA.length() > 0) {
            return strA;
        }
        sz6.j("`CartesianValueFormatter.format` returned an empty string. Use `HorizontalAxis.ItemPlacer` and `VerticalAxis.ItemPlacer`, not empty strings, to control which x and y values are labeled.");
        return null;
    }

    public static qs6 f(qh9 qh9Var) {
        String strM;
        try {
            bh9 bh9VarS = qh9Var.s("disposition");
            int i = 0;
            if (bh9VarS != null && (strM = bh9VarS.m()) != null) {
                int[] iArrH = sq6.H(2);
                int length = iArrH.length;
                while (i < length) {
                    int i2 = iArrH[i];
                    if (ms6.k(i2).equals(strM)) {
                        i = i2;
                    } else {
                        i++;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
            return new qs6(i);
        } catch (IllegalStateException e) {
            pmf.j("Unable to parse json into type Csp", e);
            return null;
        } catch (NullPointerException e2) {
            pmf.j("Unable to parse json into type Csp", e2);
            return null;
        } catch (NumberFormatException e3) {
            pmf.j("Unable to parse json into type Csp", e3);
            return null;
        }
    }

    public static swi g(qh9 qh9Var) {
        try {
            long jK = qh9Var.s("timestamp").k();
            bh9 bh9VarS = qh9Var.s("target_selector");
            String strM = bh9VarS != null ? bh9VarS.m() : null;
            bh9 bh9VarS2 = qh9Var.s("resource_url");
            String strM2 = bh9VarS2 != null ? bh9VarS2.m() : null;
            bh9 bh9VarS3 = qh9Var.s("sub_parts");
            return new swi(jK, strM, strM2, bh9VarS3 != null ? x2k.i(bh9VarS3.g()) : null);
        } catch (IllegalStateException e) {
            pmf.j("Unable to parse json into type Lcp", e);
            return null;
        } catch (NullPointerException e2) {
            pmf.j("Unable to parse json into type Lcp", e2);
            return null;
        } catch (NumberFormatException e3) {
            pmf.j("Unable to parse json into type Lcp", e3);
            return null;
        }
    }

    public static iqb h(iqb iqbVar, boolean z, boolean z2, vue vueVar, bz7 bz7Var, int i) {
        if ((i & 2) != 0) {
            z2 = true;
        }
        return iqbVar.B(new srh(z, null, null, true, z2, vueVar, bz7Var));
    }

    public static Parcelable i(String str, Bundle bundle) {
        ClassLoader classLoader = kzj.class.getClassLoader();
        dgj.v(classLoader);
        bundle.setClassLoader(classLoader);
        Bundle bundle2 = bundle.getBundle("map_state");
        if (bundle2 == null) {
            return null;
        }
        bundle2.setClassLoader(classLoader);
        return bundle2.getParcelable(str);
    }

    public static void j(Bundle bundle, Bundle bundle2) {
        Parcelable parcelableI = i("MapOptions", bundle);
        if (parcelableI != null) {
            k(bundle2, "MapOptions", parcelableI);
        }
        Parcelable parcelableI2 = i("StreetViewPanoramaOptions", bundle);
        if (parcelableI2 != null) {
            k(bundle2, "StreetViewPanoramaOptions", parcelableI2);
        }
        Parcelable parcelableI3 = i("camera", bundle);
        if (parcelableI3 != null) {
            k(bundle2, "camera", parcelableI3);
        }
        if (bundle.containsKey("position")) {
            bundle2.putString("position", bundle.getString("position"));
        }
        if (bundle.containsKey("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT")) {
            bundle2.putBoolean("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT", bundle.getBoolean("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT", false));
        }
    }

    public static void k(Bundle bundle, String str, Parcelable parcelable) {
        ClassLoader classLoader = kzj.class.getClassLoader();
        dgj.v(classLoader);
        bundle.setClassLoader(classLoader);
        Bundle bundle2 = bundle.getBundle("map_state");
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        bundle2.setClassLoader(classLoader);
        bundle2.putParcelable(str, parcelable);
        bundle.putBundle("map_state", bundle2);
    }
}
