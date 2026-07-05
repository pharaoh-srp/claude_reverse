package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.types.strings.OrganizationId;
import com.pvporbit.freetype.FreeTypeConstants;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public abstract class kik {
    public static final ta4 a = new ta4(-504394005, false, new db4(28));
    public static final ta4 b = new ta4(-1818223891, false, new db4(29));
    public static final jf7 c;
    public static final jf7 d;
    public static final jf7[] e;

    static {
        jf7 jf7Var = new jf7("auth_api_credentials_begin_sign_in", 9L);
        jf7 jf7Var2 = new jf7("auth_api_credentials_sign_out", 2L);
        c = jf7Var2;
        jf7 jf7Var3 = new jf7("auth_api_credentials_authorize", 1L);
        jf7 jf7Var4 = new jf7("auth_api_credentials_revoke_access", 1L);
        jf7 jf7Var5 = new jf7("auth_api_credentials_save_password", 4L);
        jf7 jf7Var6 = new jf7("auth_api_credentials_get_sign_in_intent", 6L);
        d = jf7Var6;
        e = new jf7[]{jf7Var, jf7Var2, jf7Var3, jf7Var4, jf7Var5, jf7Var6, new jf7("auth_api_credentials_save_account_linking_token", 3L), new jf7("auth_api_credentials_get_phone_number_hint_intent", 3L)};
    }

    public static final void a(gnd gndVar, List list, bz7 bz7Var, iqb iqbVar, ld4 ld4Var, int i) {
        int i2;
        bz7 bz7Var2;
        iqb iqbVar2;
        String strJ0;
        boolean z;
        gndVar.getClass();
        list.getClass();
        bz7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1611715236);
        if ((i & 6) == 0) {
            i2 = (e18Var.d(gndVar.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | (e18Var.f(list) ? 32 : 16);
        if ((i & 384) == 0) {
            bz7Var2 = bz7Var;
            i3 |= e18Var.h(bz7Var2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        } else {
            bz7Var2 = bz7Var;
        }
        int i4 = i3 | 3072;
        if (e18Var.Q(i4 & 1, (i4 & 1171) != 1170)) {
            Object[] objArr = new Object[0];
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (objN == lz1Var) {
                objN = new mgd(27);
                e18Var.k0(objN);
            }
            nwb nwbVar = (nwb) iuj.I(objArr, (zy7) objN, e18Var, 48);
            boolean z2 = gndVar != gnd.F;
            String strJ02 = d4c.j0(R.string.project_list_filter_projects_a11y, e18Var);
            String strJ03 = d4c.j0(R.string.project_list_filter_change_a11y, e18Var);
            if (z2) {
                e18Var.a0(1624869245);
                strJ0 = d4c.j0(hnd.b(gndVar), e18Var);
                e18Var.p(false);
            } else {
                e18Var.a0(-1168623167);
                e18Var.p(false);
                strJ0 = null;
            }
            o5b o5bVarD = dw1.d(lja.G, false);
            boolean z3 = z2;
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
            d4c.i0(e18Var, cd4.f, o5bVarD);
            d4c.i0(e18Var, cd4.e, hycVarL);
            d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var, cd4.h);
            d4c.i0(e18Var, cd4.d, iqbVarE);
            boolean zF = e18Var.f(nwbVar);
            Object objN2 = e18Var.N();
            if (zF || objN2 == lz1Var) {
                objN2 = new k3c(17, nwbVar);
                e18Var.k0(objN2);
            }
            zy7 zy7Var = (zy7) objN2;
            boolean zF2 = e18Var.f(strJ02) | e18Var.f(strJ03) | e18Var.f(strJ0);
            Object objN3 = e18Var.N();
            if (zF2 || objN3 == lz1Var) {
                z = true;
                objN3 = new cy2(strJ02, strJ03, strJ0, 1);
                e18Var.k0(objN3);
            } else {
                z = true;
            }
            boolean z4 = z;
            ez1.e(zy7Var, tjf.b(fqbVar, false, (bz7) objN3), false, null, null, fd9.q0(-1863804416, new xb2(z3, gndVar, 7), e18Var), e18Var, 1572864, 60);
            boolean zBooleanValue = ((Boolean) nwbVar.getValue()).booleanValue();
            boolean zF3 = e18Var.f(nwbVar);
            Object objN4 = e18Var.N();
            if (zF3 || objN4 == lz1Var) {
                objN4 = new k3c(18, nwbVar);
                e18Var.k0(objN4);
            }
            j8.b(zBooleanValue, (zy7) objN4, null, (((long) Float.floatToRawIntBits(MTTypesetterKt.kLineSkipLimitMultiplier)) << 32) | (((long) Float.floatToRawIntBits(8.0f)) & 4294967295L), null, null, null, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, fd9.q0(858405765, new h9a(list, gndVar, bz7Var2, nwbVar, 5), e18Var), e18Var, 3072, 2036);
            e18Var = e18Var;
            e18Var.p(z4);
            iqbVar2 = fqbVar;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new bg6(gndVar, list, bz7Var, iqbVar2, i, 19);
        }
    }

    public static final void b(gnd gndVar, boolean z, zy7 zy7Var, iqb iqbVar, ld4 ld4Var, int i) {
        iqb iqbVar2;
        long j;
        ta4 ta4VarQ0;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1404052947);
        int i2 = 2;
        int i3 = i | (e18Var.d(gndVar.ordinal()) ? 4 : 2) | (e18Var.g(z) ? 32 : 16) | (e18Var.h(zy7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | 3072;
        byte b2 = 0;
        if (e18Var.Q(i3 & 1, (i3 & 1171) != 1170)) {
            if (z) {
                e18Var.a0(675157925);
                j = gm3.a(e18Var).k;
            } else {
                e18Var.a0(675159258);
                j = ((d54) e18Var.j(on4.a)).a;
            }
            e18Var.p(false);
            if (z) {
                e18Var.a0(-544177800);
                ta4VarQ0 = fd9.q0(-1057771087, new e32(j, 3, b2), e18Var);
                e18Var.p(false);
            } else {
                e18Var.a0(-543779853);
                e18Var.p(false);
                ta4VarQ0 = null;
            }
            e0g e0gVar = gm3.b(e18Var).f;
            boolean z2 = (i3 & 112) == 32;
            Object objN = e18Var.N();
            if (z2 || objN == jd4.a) {
                objN = new xvg(z, 1);
                e18Var.k0(objN);
            }
            fqb fqbVar = fqb.E;
            long j2 = j;
            ldb.b(zy7Var, fd9.q0(-703893596, new d32(gndVar, z, j2, 3), e18Var), e0gVar, tjf.b(fqbVar, false, (bz7) objN), fd9.q0(1694829991, new me(gndVar, j2, i2), e18Var), ta4VarQ0, false, null, null, e18Var, ((i3 >> 6) & 14) | 24624, 1984);
            iqbVar2 = fqbVar;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new sq(i, 13, gndVar, zy7Var, iqbVar2, z);
        }
    }

    public static final void c(zy7 zy7Var, zy7 zy7Var2, ld4 ld4Var, int i) {
        e18 e18Var;
        Object zsgVar;
        qi3 qi3Var;
        ysg ysgVar;
        zy7Var.getClass();
        zy7Var2.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-1615304558);
        int i2 = (e18Var2.h(zy7Var) ? 4 : 2) | i | (e18Var2.h(zy7Var2) ? 32 : 16);
        if (e18Var2.Q(i2 & 1, (i2 & 19) != 18)) {
            m7f m7fVarN = sq6.n(e18Var2, -1168520582, e18Var2, -1633490746);
            boolean zF = e18Var2.f(null) | e18Var2.f(m7fVarN);
            Object objN = e18Var2.N();
            lz1 lz1Var = jd4.a;
            if (zF || objN == lz1Var) {
                objN = m7fVarN.a(jce.a.b(ysg.class), null, null);
                e18Var2.k0(objN);
            }
            e18Var2.p(false);
            e18Var2.p(false);
            ysg ysgVar2 = (ysg) objN;
            m7f m7fVarN2 = sq6.n(e18Var2, -1168520582, e18Var2, -1633490746);
            boolean zF2 = e18Var2.f(null) | e18Var2.f(m7fVarN2);
            Object objN2 = e18Var2.N();
            if (zF2 || objN2 == lz1Var) {
                objN2 = m7fVarN2.a(jce.a.b(qi3.class), null, null);
                e18Var2.k0(objN2);
            }
            e18Var2.p(false);
            e18Var2.p(false);
            qi3 qi3Var2 = (qi3) objN2;
            m7f m7fVarN3 = sq6.n(e18Var2, -1168520582, e18Var2, -1633490746);
            boolean zF3 = e18Var2.f(null) | e18Var2.f(m7fVarN3);
            Object objN3 = e18Var2.N();
            if (zF3 || objN3 == lz1Var) {
                objN3 = m7fVarN3.a(jce.a.b(OrganizationId.class), null, null);
                e18Var2.k0(objN3);
            }
            e18Var2.p(false);
            e18Var2.p(false);
            String strM1071unboximpl = ((OrganizationId) objN3).m1071unboximpl();
            Object objN4 = e18Var2.N();
            if (objN4 == lz1Var) {
                Long l = (Long) ysgVar2.g.getValue();
                Long lValueOf = l != null ? Long.valueOf(l.longValue() / 60) : null;
                e18Var2.k0(lValueOf);
                objN4 = lValueOf;
            }
            Long l2 = (Long) objN4;
            boolean zH = e18Var2.h(qi3Var2) | e18Var2.f(strM1071unboximpl) | e18Var2.h(ysgVar2) | ((i2 & 112) == 32);
            Object objN5 = e18Var2.N();
            if (zH || objN5 == lz1Var) {
                zsgVar = new zsg(qi3Var2, strM1071unboximpl, ysgVar2, zy7Var2, 0);
                qi3Var = qi3Var2;
                ysgVar = ysgVar2;
                e18Var2.k0(zsgVar);
            } else {
                zsgVar = objN5;
                ysgVar = ysgVar2;
                qi3Var = qi3Var2;
            }
            r4g r4gVarS = gb9.S(u4g.G, null, null, (zy7) zsgVar, e18Var2, 6, 6);
            String strJ0 = d4c.j0(R.string.stt_education_title, e18Var2);
            k4g k4gVar = k4g.a;
            vkc.a(r4gVarS, strJ0, null, k4g.d(gm3.a(e18Var2).q, e18Var2, 14), false, false, null, null, null, null, fd9.q0(-2049263409, new kw(qi3Var, strM1071unboximpl, ysgVar, zy7Var, 13), e18Var2), null, fd9.q0(-1102225523, new wd(l2, qi3Var, strM1071unboximpl, 13), e18Var2), e18Var2, 100663304, 3120, 5876);
            e18Var = e18Var2;
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new v56(i, 9, zy7Var, zy7Var2);
        }
    }

    public static final void d(int i, long j, ld4 ld4Var, iqb iqbVar, bpc bpcVar, String str) {
        long j2;
        int i2;
        long j3;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-863306302);
        int i3 = i | (e18Var.h(bpcVar) ? 4 : 2) | (e18Var.f(str) ? 32 : 16) | FreeTypeConstants.FT_LOAD_NO_RECURSE;
        if (e18Var.Q(i3 & 1, (i3 & 1171) != 1170)) {
            e18Var.V();
            if ((i & 1) == 0 || e18Var.A()) {
                i2 = i3 & (-7169);
                j3 = gm3.a(e18Var).N;
            } else {
                e18Var.T();
                i2 = i3 & (-7169);
                j3 = j;
            }
            int i4 = i2;
            e18Var.q();
            cxe cxeVarA = axe.a(ko0.a, lja.Q, e18Var, 48);
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
            d4c.i0(e18Var, cd4.f, cxeVarA);
            d4c.i0(e18Var, cd4.e, hycVarL);
            d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var, cd4.h);
            d4c.i0(e18Var, cd4.d, iqbVarE);
            cv8.b(bpcVar, null, b.o(gb9.L(fqb.E, 12.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2), 32.0f), j3, e18Var, 440 | (i4 & 14), 0);
            tjh.b(str, null, gm3.a(e18Var).M, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).f, e18Var, (i4 >> 3) & 14, 0, 131066);
            e18Var = e18Var;
            e18Var.p(true);
            j2 = j3;
        } else {
            e18Var.T();
            j2 = j;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new gp(i, j2, iqbVar, bpcVar, str);
        }
    }

    public static gt6 e(qh9 qh9Var) {
        try {
            String strM = qh9Var.s("test_id").m();
            String strM2 = qh9Var.s("result_id").m();
            bh9 bh9VarS = qh9Var.s("injected");
            Boolean boolValueOf = bh9VarS != null ? Boolean.valueOf(bh9VarS.a()) : null;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it = ((m7a) qh9Var.E.entrySet()).iterator();
            while (((o7a) it).hasNext()) {
                p7a p7aVarA = ((l7a) it).a();
                if (!mp0.o0(p7aVarA.getKey(), gt6.e)) {
                    Object key = p7aVarA.getKey();
                    key.getClass();
                    linkedHashMap.put(key, p7aVarA.getValue());
                }
            }
            strM.getClass();
            strM2.getClass();
            return new gt6(strM, strM2, boolValueOf, linkedHashMap);
        } catch (IllegalStateException e2) {
            pmf.j("Unable to parse json into type Synthetics", e2);
            return null;
        } catch (NullPointerException e3) {
            pmf.j("Unable to parse json into type Synthetics", e3);
            return null;
        } catch (NumberFormatException e4) {
            pmf.j("Unable to parse json into type Synthetics", e4);
            return null;
        }
    }

    public static ala f(qh9 qh9Var) {
        try {
            String strM = qh9Var.s("id").m();
            bh9 bh9VarS = qh9Var.s("name");
            String strM2 = bh9VarS != null ? bh9VarS.m() : null;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it = ((m7a) qh9Var.E.entrySet()).iterator();
            while (((o7a) it).hasNext()) {
                p7a p7aVarA = ((l7a) it).a();
                if (!mp0.o0(p7aVarA.getKey(), ala.d)) {
                    Object key = p7aVarA.getKey();
                    key.getClass();
                    linkedHashMap.put(key, p7aVarA.getValue());
                }
            }
            strM.getClass();
            return new ala(strM, strM2, linkedHashMap);
        } catch (IllegalStateException e2) {
            pmf.j("Unable to parse json into type Account", e2);
            return null;
        } catch (NullPointerException e3) {
            pmf.j("Unable to parse json into type Account", e3);
            return null;
        } catch (NumberFormatException e4) {
            pmf.j("Unable to parse json into type Account", e4);
            return null;
        }
    }

    public static final ymf g(View view) {
        return bnf.Z(qxi.E, view.getParent());
    }

    public static final File h(Context context, Bitmap bitmap) {
        try {
            File file = new File(oq5.G(context), "tmp_chart");
            if (!file.exists()) {
                file.mkdirs();
            }
            File fileCreateTempFile = File.createTempFile("chart_", ".png", file);
            FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
            try {
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                fileOutputStream.close();
                sfa sfaVar = sfa.DEBUG;
                zfa.a.getClass();
                if (yfa.b()) {
                    CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : copyOnWriteArrayList) {
                        ((n30) ((zfa) obj)).getClass();
                        arrayList.add(obj);
                    }
                    if (!arrayList.isEmpty()) {
                        zfa.a.getClass();
                        String str = "Chart image saved to " + fileCreateTempFile.getAbsolutePath();
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((n30) ((zfa) it.next())).b(sfaVar, "ChartSharingHelper", str);
                        }
                    }
                }
                return fileCreateTempFile;
            } finally {
            }
        } catch (Exception e2) {
            zfa.a.getClass();
            if (!yfa.b()) {
                return null;
            }
            CopyOnWriteArrayList copyOnWriteArrayList2 = yfa.b;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : copyOnWriteArrayList2) {
                ((n30) ((zfa) obj2)).getClass();
                arrayList2.add(obj2);
            }
            if (arrayList2.isEmpty()) {
                return null;
            }
            String strQ = sq6.q(zfa.a, e2, "Failed to save chart bitmap to file: ");
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                ((n30) ((zfa) it2.next())).b(sfa.ERROR, "ChartSharingHelper", strQ);
            }
            return null;
        }
    }

    public static final float i(int i, e18 e18Var) {
        float f = i;
        float fK0 = ((cz5) e18Var.j(ve4.h)).k0();
        if (fK0 < 1.0f) {
            fK0 = 1.0f;
        }
        return f / fK0;
    }
}
