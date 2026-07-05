package defpackage;

import android.content.Context;
import android.os.Build;
import android.text.SpannableString;
import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public abstract class unk {
    public static final ta4 a = new ta4(1736647826, false, new rb4(25));

    public static final void a(bz7 bz7Var, iqb iqbVar, ai aiVar, ld4 ld4Var, int i) {
        iqb iqbVar2;
        ai aiVar2;
        ai aiVar3;
        int i2;
        iqb iqbVar3;
        int i3;
        int i4;
        bz7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-482824120);
        int i5 = i | (e18Var.h(bz7Var) ? 4 : 2) | 176;
        int i6 = 1;
        int i7 = 0;
        if (e18Var.Q(i5 & 1, (i5 & 147) != 146)) {
            e18Var.V();
            int i8 = i & 1;
            lz1 lz1Var = jd4.a;
            if (i8 == 0 || e18Var.A()) {
                m7f m7fVarB = gr9.b(e18Var);
                boolean zH = e18Var.h(m7fVarB);
                Object objN = e18Var.N();
                if (zH || objN == lz1Var) {
                    objN = new di(m7fVarB, i7);
                    e18Var.k0(objN);
                }
                kce kceVar = jce.a;
                aiVar3 = (ai) fd9.r0(kceVar.b(ai.class), oq5.B(kceVar.b(ai.class)), (bz7) objN, e18Var);
                i2 = i5 & (-897);
                iqbVar3 = fqb.E;
            } else {
                e18Var.T();
                aiVar3 = aiVar;
                i2 = i5 & (-897);
                iqbVar3 = iqbVar;
            }
            e18Var.q();
            Object objN2 = e18Var.N();
            if (objN2 == lz1Var) {
                objN2 = mpk.P(Boolean.FALSE);
                e18Var.k0(objN2);
            }
            nwb nwbVar = (nwb) objN2;
            boolean z = (i2 & 14) == 4;
            Object objN3 = e18Var.N();
            if (z || objN3 == lz1Var) {
                objN3 = new bi(bz7Var, nwbVar, 0);
                e18Var.k0(objN3);
            }
            r4g r4gVarS = gb9.S(null, null, null, (zy7) objN3, e18Var, 0, 7);
            if (((hi) aiVar3.c.getValue()) instanceof fi) {
                i3 = 32612564;
                i4 = R.string.age_assurance_sheet_confirm_your_birthday_to_continue;
            } else {
                i3 = 32719545;
                i4 = R.string.age_assurance_sheet_confirm_your_age_to_continue;
            }
            String strN = vb7.n(e18Var, i3, i4, e18Var, false);
            iqb iqbVar4 = iqbVar3;
            vkc.a(r4gVarS, strN, iqbVar4, null, false, false, null, null, null, null, fd9.q0(1078696043, new wd(aiVar3, r4gVarS, nwbVar, i6), e18Var), null, fd9.q0(-690775571, new ci(i7, aiVar3), e18Var), e18Var, 197000, 3120, 6104);
            aiVar2 = aiVar3;
            iqbVar2 = iqbVar4;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
            aiVar2 = aiVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new m6(bz7Var, iqbVar2, aiVar2, i, 1);
        }
    }

    public static final void b(String str, String str2, iqb iqbVar, qnc qncVar, xm8 xm8Var, ld4 ld4Var, int i) {
        int i2;
        iqb iqbVar2;
        xm8 xm8Var2;
        int i3;
        iqb iqbVar3;
        xm8 xm8Var3;
        Object b9Var;
        nwb nwbVar;
        xm8 xm8Var4;
        om8 om8Var;
        String str3 = str;
        String str4 = str2;
        str3.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1827326798);
        if ((i & 6) == 0) {
            i2 = (e18Var.f(str3) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.f(str4) ? 32 : 16;
        }
        int i4 = i2 | 384;
        if ((i & 3072) == 0) {
            i4 |= e18Var.f(qncVar) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i & 24576) == 0) {
            i4 |= FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if (e18Var.Q(i4 & 1, (i4 & 9363) != 9362)) {
            e18Var.V();
            int i5 = i & 1;
            lz1 lz1Var = jd4.a;
            if (i5 == 0 || e18Var.A()) {
                m7f m7fVarN = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF = e18Var.f(null) | e18Var.f(m7fVarN);
                Object objN = e18Var.N();
                if (zF || objN == lz1Var) {
                    objN = m7fVarN.a(jce.a.b(xm8.class), null, null);
                    e18Var.k0(objN);
                }
                e18Var.p(false);
                e18Var.p(false);
                i3 = i4 & (-57345);
                iqbVar3 = fqb.E;
                xm8Var3 = (xm8) objN;
            } else {
                e18Var.T();
                i3 = i4 & (-57345);
                iqbVar3 = iqbVar;
                xm8Var3 = xm8Var;
            }
            e18Var.q();
            om8 om8Var2 = v40.F(e18Var) ? q54.b : q54.c;
            Object objN2 = e18Var.N();
            if (objN2 == lz1Var) {
                objN2 = mpk.P(null);
                e18Var.k0(objN2);
            }
            nwb nwbVar2 = (nwb) objN2;
            boolean zH = ((i3 & 14) == 4) | e18Var.h(xm8Var3) | ((i3 & 112) == 32) | e18Var.h(om8Var2);
            Object objN3 = e18Var.N();
            if (zH || objN3 == lz1Var) {
                nwbVar = nwbVar2;
                b9Var = new b9(xm8Var3, str, str4, om8Var2, nwbVar, null, 9);
                om8 om8Var3 = om8Var2;
                xm8Var4 = xm8Var3;
                str3 = str;
                str4 = str4;
                om8Var = om8Var3;
                e18Var.k0(b9Var);
            } else {
                b9Var = objN3;
                om8Var = om8Var2;
                nwbVar = nwbVar2;
                xm8Var4 = xm8Var3;
                str3 = str;
            }
            fd9.k(str3, str4, om8Var, (pz7) b9Var, e18Var);
            CharSequence charSequence = (SpannableString) nwbVar.getValue();
            if (charSequence == null) {
                charSequence = str3;
            }
            tnk.b(charSequence, om8Var, gb9.I(mpk.b0(iqbVar3, mpk.Y(e18Var), false), qncVar), e18Var, 64);
            xm8Var2 = xm8Var4;
            iqbVar2 = iqbVar3;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
            xm8Var2 = xm8Var;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new o34(str3, str4, iqbVar2, qncVar, xm8Var2, i, 0);
        }
    }

    public static final void c(iqb iqbVar, final go0 go0Var, jo0 jo0Var, wo1 wo1Var, int i, int i2, final ta4 ta4Var, ld4 ld4Var, final int i3, final int i4) {
        final iqb iqbVar2;
        final jo0 jo0Var2;
        final wo1 wo1Var2;
        final int i5;
        e18 e18Var;
        final int i6;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-1303174015);
        int i7 = i3 | 6;
        if ((i3 & 48) == 0) {
            i7 |= e18Var2.f(go0Var) ? 32 : 16;
        }
        int i8 = i4 & 4;
        if (i8 != 0) {
            i7 |= 384;
        } else if ((i3 & 384) == 0) {
            i7 |= e18Var2.f(jo0Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        int i9 = i4 & 8;
        if (i9 != 0) {
            i7 |= 3072;
        } else if ((i3 & 3072) == 0) {
            i7 |= e18Var2.f(wo1Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        int i10 = i7 | 221184;
        if (e18Var2.Q(i10 & 1, (599187 & i10) != 599186)) {
            if (i8 != 0) {
                jo0Var = ko0.c;
            }
            if (i9 != 0) {
                wo1Var = lja.P;
            }
            wo1 wo1Var3 = wo1Var;
            lyk lykVar = lyk.N;
            int i11 = (i10 & 112) | 1572870 | (i10 & 896) | (i10 & 7168) | 12804096;
            fqb fqbVar = fqb.E;
            jo0 jo0Var3 = jo0Var;
            d(fqbVar, go0Var, jo0Var3, wo1Var3, lykVar, ta4Var, e18Var2, i11);
            i5 = Integer.MAX_VALUE;
            iqbVar2 = fqbVar;
            wo1Var2 = wo1Var3;
            e18Var = e18Var2;
            i6 = Integer.MAX_VALUE;
            jo0Var2 = jo0Var3;
        } else {
            e18Var2.T();
            iqbVar2 = iqbVar;
            jo0Var2 = jo0Var;
            wo1Var2 = wo1Var;
            i5 = i;
            e18Var = e18Var2;
            i6 = i2;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pz7() { // from class: ir7
                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    unk.c(iqbVar2, go0Var, jo0Var2, wo1Var2, i5, i6, ta4Var, (ld4) obj, x44.p0(i3 | 1), i4);
                    return iei.a;
                }
            };
        }
    }

    public static final void d(iqb iqbVar, go0 go0Var, jo0 jo0Var, wo1 wo1Var, lyk lykVar, ta4 ta4Var, ld4 ld4Var, int i) {
        int i2;
        lyk lykVar2;
        boolean z;
        Object obj;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1956591841);
        if ((i & 6) == 0) {
            i2 = (e18Var.f(iqbVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.f(go0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.f(jo0Var) ? 256 : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var.f(wo1Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i & 24576) == 0) {
            i2 |= e18Var.d(Integer.MAX_VALUE) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if ((196608 & i) == 0) {
            i2 |= e18Var.d(Integer.MAX_VALUE) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            lykVar2 = lykVar;
            i2 |= e18Var.f(lykVar2) ? 1048576 : 524288;
        } else {
            lykVar2 = lykVar;
        }
        if ((i & 12582912) == 0) {
            i2 |= e18Var.h(ta4Var) ? 8388608 : 4194304;
        }
        int i3 = i2;
        if (e18Var.Q(i3 & 1, (i3 & 4793491) != 4793490)) {
            int i4 = i3 & 3670016;
            boolean z2 = i4 == 1048576;
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (z2 || objN == lz1Var) {
                lykVar2.getClass();
                objN = new kr7();
                e18Var.k0(objN);
            }
            kr7 kr7Var = (kr7) objN;
            int i5 = i3 >> 3;
            boolean zF = ((((57344 & i5) ^ 24576) > 16384 && e18Var.d(Integer.MAX_VALUE)) || (i5 & 24576) == 16384) | ((((i5 & 112) ^ 48) > 32 && e18Var.f(jo0Var)) || (i5 & 48) == 32) | ((((i5 & 14) ^ 6) > 4 && e18Var.f(go0Var)) || (i5 & 6) == 4) | ((((i5 & 896) ^ 384) > 256 && e18Var.f(wo1Var)) || (i5 & 384) == 256) | ((((i5 & 7168) ^ 3072) > 2048 && e18Var.d(Integer.MAX_VALUE)) || (i5 & 3072) == 2048) | e18Var.f(kr7Var);
            Object objN2 = e18Var.N();
            if (zF || objN2 == lz1Var) {
                mr7 mr7Var = new mr7(go0Var, jo0Var, go0Var.d(), new gc5(wo1Var), jo0Var.d(), kr7Var);
                e18Var.k0(mr7Var);
                objN2 = mr7Var;
            }
            mr7 mr7Var2 = (mr7) objN2;
            boolean z3 = (i4 == 1048576) | ((i3 & 29360128) == 8388608) | ((i3 & 458752) == 131072);
            Object objN3 = e18Var.N();
            if (z3 || objN3 == lz1Var) {
                ArrayList arrayList = new ArrayList();
                z = true;
                arrayList.add(new ta4(-1192950673, true, new rx0(ta4Var, 17)));
                lykVar.getClass();
                e18Var.k0(arrayList);
                obj = arrayList;
            } else {
                z = true;
                obj = objN3;
            }
            ta4 ta4Var2 = new ta4(1271844412, z, new z0(4, (List) obj));
            boolean zF2 = e18Var.f(mr7Var2);
            Object objN4 = e18Var.N();
            if (zF2 || objN4 == lz1Var) {
                objN4 = new mtb(mr7Var2);
                e18Var.k0(objN4);
            }
            o5b o5bVar = (o5b) objN4;
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
            d4c.i0(e18Var, cd4.f, o5bVar);
            d4c.i0(e18Var, cd4.e, hycVarL);
            d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var, cd4.h);
            d4c.i0(e18Var, cd4.d, iqbVarE);
            vb7.y(0, ta4Var2, e18Var, true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new hl(iqbVar, go0Var, jo0Var, wo1Var, lykVar, ta4Var, i, 9);
        }
    }

    public static final void e(rxa rxaVar, zy7 zy7Var, iqb iqbVar, ld4 ld4Var, int i) {
        int i2;
        int i3;
        int i4;
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1922892316);
        if ((i & 6) == 0) {
            i2 = (e18Var.f(rxaVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.h(zy7Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.f(iqbVar) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if (e18Var.Q(i2 & 1, (i2 & 147) != 146)) {
            if (rxaVar instanceof pxa) {
                i3 = -1063572325;
                i4 = R.string.mcp_app_error_server_not_found;
            } else if (rxaVar instanceof nxa) {
                i3 = -1063569254;
                i4 = R.string.mcp_app_error_no_app_resource;
            } else if (rxaVar instanceof lxa) {
                i3 = -1063566281;
                i4 = R.string.mcp_app_error_fetch_failed;
            } else if (rxaVar instanceof mxa) {
                i3 = -1063563335;
                i4 = R.string.mcp_app_error_invalid_domain;
            } else if (rxaVar instanceof oxa) {
                i3 = -1063560194;
                i4 = R.string.mcp_app_error_sandbox_load_failed;
            } else {
                if (!(rxaVar instanceof qxa)) {
                    throw ebh.u(e18Var, -1063573592, false);
                }
                i3 = -1063557230;
                i4 = R.string.mcp_app_error_unknown;
            }
            pzg.a(b.c(iqbVar, 1.0f), xve.b(12.0f), gm3.a(e18Var).A, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, sf5.a(MTTypesetterKt.kLineSkipLimitMultiplier, gm3.a(e18Var).z), fd9.q0(1708155007, new e42(zy7Var, vb7.n(e18Var, i3, i4, e18Var, false)), e18Var), e18Var, 12582912, 56);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new v76(rxaVar, i, zy7Var, iqbVar, 12);
        }
    }

    public static final void f(String str, zy7 zy7Var, ld4 ld4Var, int i) {
        int i2;
        zy7 zy7Var2;
        e18 e18Var;
        str.getClass();
        zy7Var.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(1128161954);
        if ((i & 6) == 0) {
            i2 = i | (e18Var2.f(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        byte b = 0;
        if (e18Var2.Q(i2 & 1, (i2 & 19) != 18)) {
            op3 op3Var = (op3) e18Var2.j(ve4.f);
            Object objN = e18Var2.N();
            if (objN == jd4.a) {
                objN = fd9.O(im6.E, e18Var2);
                e18Var2.k0(objN);
            }
            e18Var = e18Var2;
            trk.b(zy7Var, fd9.q0(1698938693, new mm5((l45) objN, op3Var, str, zy7Var, 19), e18Var2), null, fd9.q0(-1197075001, new sxa(zy7Var, b, b), e18Var2), vok.c, fd9.q0(-1246128246, new yi7(str, 13), e18Var2), null, 0L, 0L, 0L, 0L, null, e18Var, 1772598, 0, 16276);
            zy7Var2 = zy7Var;
        } else {
            zy7Var2 = zy7Var;
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new fv0(str, zy7Var2, i, 3);
        }
    }

    public static final void g(iqb iqbVar, b4e b4eVar, qi3 qi3Var, ld4 ld4Var, int i) {
        b4e b4eVar2;
        qi3 qi3Var2;
        b4e b4eVar3;
        qi3 qi3Var3;
        int i2;
        boolean zR;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1853593972);
        int i3 = i | (e18Var.f(iqbVar) ? 4 : 2) | 144;
        if (e18Var.Q(i3 & 1, (i3 & 147) != 146)) {
            e18Var.V();
            int i4 = i & 1;
            lz1 lz1Var = jd4.a;
            if (i4 == 0 || e18Var.A()) {
                m7f m7fVarN = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF = e18Var.f(null) | e18Var.f(m7fVarN);
                Object objN = e18Var.N();
                if (zF || objN == lz1Var) {
                    objN = m7fVarN.a(jce.a.b(b4e.class), null, null);
                    e18Var.k0(objN);
                }
                e18Var.p(false);
                e18Var.p(false);
                b4eVar3 = (b4e) objN;
                m7f m7fVarN2 = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF2 = e18Var.f(null) | e18Var.f(m7fVarN2);
                Object objN2 = e18Var.N();
                if (zF2 || objN2 == lz1Var) {
                    objN2 = m7fVarN2.a(jce.a.b(qi3.class), null, null);
                    e18Var.k0(objN2);
                }
                e18Var.p(false);
                e18Var.p(false);
                qi3Var3 = (qi3) objN2;
                i2 = i3 & (-1009);
            } else {
                e18Var.T();
                i2 = i3 & (-1009);
                b4eVar3 = b4eVar;
                qi3Var3 = qi3Var;
            }
            e18Var.q();
            Context context = (Context) e18Var.j(w00.b);
            b4eVar3.getClass();
            boolean zF3 = e18Var.f("com.anthropic.claude");
            Object objN3 = e18Var.N();
            if (zF3 || objN3 == lz1Var) {
                try {
                    zR = x44.r(Build.VERSION.SDK_INT >= 30 ? context.getPackageManager().getInstallSourceInfo("com.anthropic.claude").getInstallingPackageName() : context.getPackageManager().getInstallerPackageName("com.anthropic.claude"), "com.android.vending");
                } catch (Exception unused) {
                    zR = false;
                }
                objN3 = Boolean.valueOf(zR);
                e18Var.k0(objN3);
            }
            boolean zBooleanValue = ((Boolean) objN3).booleanValue();
            xn5.P(6, e18Var);
            boolean zH = e18Var.h(qi3Var3) | e18Var.g(zBooleanValue);
            Object objN4 = e18Var.N();
            if (zH || objN4 == lz1Var) {
                objN4 = new pke(qi3Var3, zBooleanValue, null);
                e18Var.k0(objN4);
            }
            csg.g((bz7) objN4, e18Var, 0, 1);
            boolean zF4 = e18Var.f("com.anthropic.claude") | e18Var.h(context);
            Object objN5 = e18Var.N();
            if (zF4 || objN5 == lz1Var) {
                objN5 = new cq0(context, 7);
                e18Var.k0(objN5);
            }
            h((i2 << 6) & 896, e18Var, (zy7) objN5, iqbVar, zBooleanValue);
            qi3Var2 = qi3Var3;
            b4eVar2 = b4eVar3;
        } else {
            e18Var.T();
            b4eVar2 = b4eVar;
            qi3Var2 = qi3Var;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new tfe(iqbVar, i, b4eVar2, qi3Var2, 2);
        }
    }

    public static final void h(int i, ld4 ld4Var, zy7 zy7Var, iqb iqbVar, boolean z) {
        int i2;
        e18 e18Var;
        zy7Var.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(1137675834);
        int i3 = 4;
        if ((i & 6) == 0) {
            i2 = (e18Var2.g(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var2.h(zy7Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var2.f(iqbVar) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if (e18Var2.Q(i2 & 1, (i2 & 147) != 146)) {
            e18Var = e18Var2;
            pzg.a(iqbVar.B(b.c), null, gm3.a(e18Var2).o, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, null, fd9.q0(-1622796481, new mu2(z, zy7Var, i3), e18Var2), e18Var, 12582912, ModuleDescriptor.MODULE_VERSION);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new r50(i, 4, zy7Var, iqbVar, z);
        }
    }

    public static void i() {
        aeh aehVar = aeh.b;
    }

    public static final String j(char c) {
        String strValueOf = String.valueOf(c);
        strValueOf.getClass();
        Locale locale = Locale.ROOT;
        String upperCase = strValueOf.toUpperCase(locale);
        upperCase.getClass();
        if (upperCase.length() <= 1) {
            return String.valueOf(Character.toTitleCase(c));
        }
        if (c == 329) {
            return upperCase;
        }
        char cCharAt = upperCase.charAt(0);
        String lowerCase = upperCase.substring(1).toLowerCase(locale);
        lowerCase.getClass();
        return cCharAt + lowerCase;
    }
}
