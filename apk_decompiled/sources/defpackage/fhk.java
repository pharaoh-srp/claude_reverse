package defpackage;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.pvporbit.freetype.FreeTypeConstants;
import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class fhk {
    public static final ta4 a = new ta4(963862964, false, new db4(2));

    public static final void a(String str, iqb iqbVar, ld4 ld4Var, int i) {
        String str2;
        iqb iqbVar2;
        r7e r7eVarS;
        ip ipVar;
        hdc hdcVar;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(240195905);
        int i2 = (e18Var.f(str) ? 4 : 2) | i | (e18Var.f(iqbVar) ? 32 : 16);
        if (!e18Var.Q(i2 & 1, (i2 & 19) != 18)) {
            str2 = str;
            iqbVar2 = iqbVar;
            e18Var.T();
        } else {
            if (str == null) {
                e18Var.a0(260829725);
                iqb iqbVarB = iqbVar.B(b.c);
                o5b o5bVarD = dw1.d(lja.K, false);
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
                d4c.i0(e18Var, cd4.f, o5bVarD);
                d4c.i0(e18Var, cd4.e, hycVarL);
                d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
                d4c.h0(e18Var, cd4.h);
                d4c.i0(e18Var, cd4.d, iqbVarE);
                tjh.b(d4c.j0(R.string.ccr_attachment_load_failed, e18Var), null, gm3.a(e18Var).N, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).g, e18Var, 0, 0, 131066);
                e18Var.p(true);
                e18Var.p(false);
                r7eVarS = e18Var.s();
                if (r7eVarS != null) {
                    ipVar = new ip(str, iqbVar, i, 5);
                    r7eVarS.d = ipVar;
                }
                return;
            }
            str2 = str;
            iqbVar2 = iqbVar;
            e18Var.a0(261141089);
            e18Var.p(false);
            boolean zBooleanValue = ((Boolean) e18Var.j(p59.a)).booleanValue();
            lz1 lz1Var = jd4.a;
            if (zBooleanValue) {
                e18Var.a0(847428294);
                Object objN = e18Var.N();
                if (objN == lz1Var) {
                    gdc gdcVar = new gdc();
                    gdcVar.a(x44.W(jh4.g));
                    hdc hdcVar2 = new hdc(gdcVar);
                    e18Var.k0(hdcVar2);
                    objN = hdcVar2;
                }
                hdcVar = (hdc) objN;
                e18Var.p(false);
            } else {
                e18Var.a0(847539863);
                e18Var.a0(-1168520582);
                m7f m7fVarB = gr9.b(e18Var);
                e18Var.a0(-1633490746);
                boolean zF = e18Var.f(null) | e18Var.f(m7fVarB);
                Object objN2 = e18Var.N();
                if (zF || objN2 == lz1Var) {
                    objN2 = m7fVarB.a(jce.a.b(hdc.class), null, null);
                    e18Var.k0(objN2);
                }
                e18Var.p(false);
                e18Var.p(false);
                hdcVar = (hdc) objN2;
                e18Var.p(false);
            }
            tm3.a(str2, hdcVar, iqbVar2.B(b.c), e18Var, i2 & 14);
        }
        r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            ipVar = new ip(str2, iqbVar2, i, 6);
            r7eVarS.d = ipVar;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:136:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:141:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final java.lang.String r36, defpackage.iqb r37, final defpackage.tkh r38, long r39, long r41, float r43, int r44, int r45, defpackage.vh6 r46, boolean r47, defpackage.ld4 r48, final int r49, final int r50, final int r51) {
        /*
            Method dump skipped, instruction units count: 699
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fhk.b(java.lang.String, iqb, tkh, long, long, float, int, int, vh6, boolean, ld4, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(defpackage.iqb r22, defpackage.tkh r23, defpackage.ld4 r24, int r25, int r26) {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fhk.c(iqb, tkh, ld4, int, int):void");
    }

    public static ts6 d(qh9 qh9Var) {
        ArrayList arrayList;
        String strM;
        try {
            bh9 bh9VarS = qh9Var.s("type");
            int i = 0;
            if (bh9VarS != null && (strM = bh9VarS.m()) != null) {
                int[] iArrH = sq6.H(7);
                int length = iArrH.length;
                while (i < length) {
                    int i2 = iArrH[i];
                    if (ms6.f(i2).equals(strM)) {
                        i = i2;
                    } else {
                        i++;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
            bh9 bh9VarS2 = qh9Var.s("name");
            String strM2 = bh9VarS2 != null ? bh9VarS2.m() : null;
            bh9 bh9VarS3 = qh9Var.s("model");
            String strM3 = bh9VarS3 != null ? bh9VarS3.m() : null;
            bh9 bh9VarS4 = qh9Var.s("brand");
            String strM4 = bh9VarS4 != null ? bh9VarS4.m() : null;
            bh9 bh9VarS5 = qh9Var.s("architecture");
            String strM5 = bh9VarS5 != null ? bh9VarS5.m() : null;
            bh9 bh9VarS6 = qh9Var.s("locale");
            String strM6 = bh9VarS6 != null ? bh9VarS6.m() : null;
            bh9 bh9VarS7 = qh9Var.s("locales");
            if (bh9VarS7 != null) {
                ArrayList arrayList2 = bh9VarS7.e().E;
                arrayList = new ArrayList(arrayList2.size());
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((bh9) it.next()).m());
                }
            } else {
                arrayList = null;
            }
            bh9 bh9VarS8 = qh9Var.s("time_zone");
            String strM7 = bh9VarS8 != null ? bh9VarS8.m() : null;
            bh9 bh9VarS9 = qh9Var.s("battery_level");
            Number numberL = bh9VarS9 != null ? bh9VarS9.l() : null;
            bh9 bh9VarS10 = qh9Var.s("power_saving_mode");
            Boolean boolValueOf = bh9VarS10 != null ? Boolean.valueOf(bh9VarS10.a()) : null;
            bh9 bh9VarS11 = qh9Var.s("brightness_level");
            Number numberL2 = bh9VarS11 != null ? bh9VarS11.l() : null;
            bh9 bh9VarS12 = qh9Var.s("logical_cpu_count");
            Number numberL3 = bh9VarS12 != null ? bh9VarS12.l() : null;
            bh9 bh9VarS13 = qh9Var.s("total_ram");
            Number numberL4 = bh9VarS13 != null ? bh9VarS13.l() : null;
            bh9 bh9VarS14 = qh9Var.s("is_low_ram");
            return new ts6(i, strM2, strM3, strM4, strM5, strM6, arrayList, strM7, numberL, boolValueOf, numberL2, numberL3, numberL4, bh9VarS14 != null ? Boolean.valueOf(bh9VarS14.a()) : null);
        } catch (IllegalStateException e) {
            pmf.j("Unable to parse json into type Device", e);
            return null;
        } catch (NullPointerException e2) {
            pmf.j("Unable to parse json into type Device", e2);
            return null;
        } catch (NumberFormatException e3) {
            pmf.j("Unable to parse json into type Device", e3);
            return null;
        }
    }

    public static wwi e(qh9 qh9Var) {
        try {
            String strM = qh9Var.s("state").m();
            strM.getClass();
            for (int i : sq6.H(5)) {
                if (fsh.m(i).equals(strM)) {
                    return new wwi(i, qh9Var.s("start").k());
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        } catch (IllegalStateException e) {
            pmf.j("Unable to parse json into type PageState", e);
            return null;
        } catch (NullPointerException e2) {
            pmf.j("Unable to parse json into type PageState", e2);
            return null;
        } catch (NumberFormatException e3) {
            pmf.j("Unable to parse json into type PageState", e3);
            return null;
        }
    }

    public static final float f(Layout layout) {
        layout.getClass();
        Iterator it = wd6.H0(0, layout.getLineCount()).iterator();
        if (!it.hasNext()) {
            pmf.d();
            return MTTypesetterKt.kLineSkipLimitMultiplier;
        }
        a79 a79Var = (a79) it;
        float lineWidth = layout.getLineWidth(a79Var.nextInt());
        while (it.hasNext()) {
            lineWidth = Math.max(lineWidth, layout.getLineWidth(a79Var.nextInt()));
        }
        return lineWidth;
    }

    public static URI g(String str) {
        if (str == null) {
            return null;
        }
        try {
            return URI.create(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static StaticLayout h(CharSequence charSequence, TextPaint textPaint, int i, int i2, float f, TextUtils.TruncateAt truncateAt, Layout.Alignment alignment, int i3) {
        if ((i3 & 8) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        int length = charSequence.length();
        if ((i3 & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0) {
            f = MTTypesetterKt.kLineSkipLimitMultiplier;
        }
        if ((i3 & 512) != 0) {
            truncateAt = null;
        }
        if ((i3 & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM) != 0) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        }
        charSequence.getClass();
        textPaint.getClass();
        alignment.getClass();
        StaticLayout staticLayoutBuild = StaticLayout.Builder.obtain(charSequence, 0, length, textPaint, i).setAlignment(alignment).setLineSpacing(f, 1.0f).setIncludePad(true).setEllipsize(truncateAt).setEllipsizedWidth(i).setMaxLines(i2).build();
        staticLayoutBuild.getClass();
        return staticLayoutBuild;
    }
}
