package defpackage;

import android.content.ClipData;
import android.content.ClipDescription;
import android.net.Uri;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class spk {
    public static final ta4 a = new ta4(1771708127, false, new ub4(12));
    public static final ta4 b = new ta4(1775589418, false, new ub4(13));
    public static Boolean c;

    /* JADX WARN: Removed duplicated region for block: B:54:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0121  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(defpackage.ek4 r19, boolean r20, defpackage.zy7 r21, defpackage.iqb r22, defpackage.ta4 r23, defpackage.ld4 r24, int r25) {
        /*
            Method dump skipped, instruction units count: 383
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.spk.a(ek4, boolean, zy7, iqb, ta4, ld4, int):void");
    }

    public static final void b(String str, q68 q68Var, skh skhVar, int i, ld4 ld4Var, int i2) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-192911377);
        if ((((e18Var.f(str) ? 4 : 2) | i2 | 48 | (e18Var.f(skhVar) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC)) & 1171) == 1170 && e18Var.C()) {
            e18Var.T();
        } else {
            e18Var.V();
            if ((i2 & 1) == 0 || e18Var.A()) {
                q68Var = o68.a;
            } else {
                e18Var.T();
            }
            e18Var.q();
            e18Var.b0(1849434622);
            Object objN = e18Var.N();
            if (objN == jd4.a) {
                objN = sjh.E;
                e18Var.k0(objN);
            }
            byte b2 = 0;
            e18Var.p(false);
            zy7 zy7Var = (zy7) ((jm9) objN);
            e18Var.b0(-1115894518);
            e18Var.b0(1886828752);
            if (!(e18Var.a instanceof gn0)) {
                iuj.A();
                throw null;
            }
            e18Var.Y();
            if (e18Var.S) {
                e18Var.k(new r68(0, zy7Var));
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, new qte(b2, 26), str);
            d4c.i0(e18Var, new qte(b2, 27), q68Var);
            d4c.i0(e18Var, new qte(b2, 28), skhVar);
            qte qteVar = new qte(b2, 29);
            if (e18Var.S || !x44.r(e18Var.N(), Integer.valueOf(i))) {
                e18Var.k0(Integer.valueOf(i));
                e18Var.b(qteVar, Integer.valueOf(i));
            }
            ij0.w(e18Var, true, false, false);
        }
        q68 q68Var2 = q68Var;
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new c3g(str, q68Var2, skhVar, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.CharSequence c(defpackage.zb0 r20) {
        /*
            Method dump skipped, instruction units count: 389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.spk.c(zb0):java.lang.CharSequence");
    }

    public static soe d(qh9 qh9Var) {
        ArrayList arrayList;
        ArrayList arrayList2;
        try {
            String strM = qh9Var.s("message").m();
            bh9 bh9VarS = qh9Var.s("code");
            String strM2 = bh9VarS != null ? bh9VarS.m() : null;
            bh9 bh9VarS2 = qh9Var.s("locations");
            if (bh9VarS2 != null) {
                ArrayList arrayList3 = bh9VarS2.e().E;
                arrayList = new ArrayList(arrayList3.size());
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    arrayList.add(xpk.a(((bh9) it.next()).g()));
                }
            } else {
                arrayList = null;
            }
            bh9 bh9VarS3 = qh9Var.s("path");
            if (bh9VarS3 != null) {
                ArrayList<bh9> arrayList4 = bh9VarS3.e().E;
                arrayList2 = new ArrayList(arrayList4.size());
                for (bh9 bh9Var : arrayList4) {
                    bh9Var.getClass();
                    arrayList2.add(aqk.e(bh9Var));
                }
            } else {
                arrayList2 = null;
            }
            strM.getClass();
            return new soe(strM, strM2, arrayList, arrayList2);
        } catch (IllegalStateException e) {
            pmf.j("Unable to parse json into type Error", e);
            return null;
        } catch (NullPointerException e2) {
            pmf.j("Unable to parse json into type Error", e2);
            return null;
        } catch (NumberFormatException e3) {
            pmf.j("Unable to parse json into type Error", e3);
            return null;
        }
    }

    public static z48 e(Uri uri) {
        if (!x44.r(uri.getScheme(), "https")) {
            return null;
        }
        if ((!x44.r(uri.getHost(), "claude.ai") && !x44.r(uri.getHost(), "claude-ai.staging.ant.dev")) || !x44.r(uri.getPath(), "/connect/github/callback")) {
            return null;
        }
        String queryParameter = uri.getQueryParameter("code");
        String queryParameter2 = uri.getQueryParameter("state");
        if (queryParameter == null || queryParameter2 == null) {
            return null;
        }
        return new z48(queryParameter, queryParameter2);
    }

    public static final mp3 f(ClipData clipData) {
        return new mp3(clipData);
    }

    public static final np3 g(ClipDescription clipDescription) {
        return new np3(clipDescription);
    }

    public static s3k h(Object obj) {
        return new s3k(obj);
    }
}
