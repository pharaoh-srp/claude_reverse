package defpackage;

import android.content.Context;
import android.health.connect.LocalTimeRangeFilter;
import android.health.connect.TimeRangeFilter;
import android.health.connect.datatypes.AggregationType;
import android.net.Uri;
import android.view.textclassifier.TextClassification;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.api.chat.MessageImageAsset;
import com.pvporbit.freetype.FreeTypeConstants;

/* JADX INFO: loaded from: classes3.dex */
public abstract class tnk {
    public static final ta4 a = new ta4(1809851252, false, new sb4(13));

    /* JADX WARN: Removed duplicated region for block: B:74:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x013d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final defpackage.hi r10, final defpackage.bz7 r11, defpackage.iqb r12, defpackage.ld4 r13, int r14, int r15) {
        /*
            Method dump skipped, instruction units count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tnk.a(hi, bz7, iqb, ld4, int, int):void");
    }

    public static final void b(CharSequence charSequence, om8 om8Var, iqb iqbVar, ld4 ld4Var, int i) {
        charSequence.getClass();
        om8Var.getClass();
        iqb iqbVarB = iqbVar.B(new k5b(charSequence));
        e18 e18Var = (e18) ld4Var;
        Object objN = e18Var.N();
        lz1 lz1Var = jd4.a;
        if (objN == lz1Var) {
            objN = n34.E;
            e18Var.k0(objN);
        }
        bz7 bz7Var = (bz7) ((jm9) objN);
        boolean zH = e18Var.h(om8Var) | e18Var.h(charSequence);
        Object objN2 = e18Var.N();
        if (zH || objN2 == lz1Var) {
            objN2 = new m34(om8Var, charSequence, 0);
            e18Var.k0(objN2);
        }
        uj5.a(bz7Var, iqbVarB, (bz7) objN2, e18Var, 6, 0);
    }

    public static final void c(jse jseVar, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(961071471);
        int i2 = i | 2;
        int i3 = 3;
        if (e18Var.Q(i2 & 1, (i2 & 3) != 2)) {
            e18Var.V();
            int i4 = i & 1;
            lz1 lz1Var = jd4.a;
            if (i4 == 0 || e18Var.A()) {
                m7f m7fVarN = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF = e18Var.f(null) | e18Var.f(m7fVarN);
                Object objN = e18Var.N();
                if (zF || objN == lz1Var) {
                    objN = m7fVarN.a(jce.a.b(jse.class), null, null);
                    e18Var.k0(objN);
                }
                e18Var.p(false);
                e18Var.p(false);
                jseVar = (jse) objN;
            } else {
                e18Var.T();
            }
            jse jseVar2 = jseVar;
            e18Var.q();
            Context context = (Context) e18Var.j(w00.b);
            Object objN2 = e18Var.N();
            if (objN2 == lz1Var) {
                objN2 = fd9.O(im6.E, e18Var);
                e18Var.k0(objN2);
            }
            l45 l45Var = (l45) objN2;
            boolean zH = e18Var.h(l45Var) | e18Var.h(context) | e18Var.h(jseVar2);
            Object objN3 = e18Var.N();
            if (zH || objN3 == lz1Var) {
                objN3 = new ny4((Object) l45Var, context, (Object) jseVar2, 17);
                e18Var.k0(objN3);
            }
            mwa.f(context, jseVar2, l45Var, null, (bz7) objN3, e18Var, jse.c << 3);
            jseVar = jseVar2;
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ska(jseVar, i, i3);
        }
    }

    public static final void d(MessageImageAsset messageImageAsset, iqb iqbVar, String str, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-418400175);
        int i2 = i | (e18Var.f(messageImageAsset) ? 4 : 2) | (e18Var.f(iqbVar) ? 32 : 16) | (e18Var.f(str) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC);
        if (e18Var.Q(i2 & 1, (i2 & 147) != 146)) {
            String strN = (str == null || bsg.I0(str)) ? null : str;
            if (strN == null) {
                strN = vb7.n(e18Var, 1644366393, R.string.chat_input_image_attachment_content_description, e18Var, false);
            } else {
                e18Var.a0(1644364471);
                e18Var.p(false);
            }
            nuk.e(messageImageAsset, strN, iik.j(iqbVar, pnk.i(e18Var), false, null, 62), null, null, null, null, MTTypesetterKt.kLineSkipLimitMultiplier, 3, false, e18Var, i2 & 14, 3064);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new tfe(messageImageAsset, i, iqbVar, str, 24);
        }
    }

    public static final void e(MessageImageAsset messageImageAsset, iqb iqbVar, yw8 yw8Var, String str, ld4 ld4Var, int i) {
        iqb iqbVar2;
        String str2;
        MessageImageAsset messageImageAsset2;
        yw8 yw8Var2;
        messageImageAsset.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1936451400);
        int i2 = (e18Var.f(messageImageAsset) ? 4 : 2) | i | FreeTypeConstants.FT_LOAD_PEDANTIC | (e18Var.f(str) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE);
        if (e18Var.Q(i2 & 1, (i2 & 1171) != 1170)) {
            e18Var.V();
            if ((i & 1) == 0 || e18Var.A()) {
                m7f m7fVarN = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF = e18Var.f(null) | e18Var.f(m7fVarN);
                Object objN = e18Var.N();
                if (zF || objN == jd4.a) {
                    objN = m7fVarN.a(jce.a.b(yw8.class), null, null);
                    e18Var.k0(objN);
                }
                e18Var.p(false);
                e18Var.p(false);
                yw8Var = (yw8) objN;
            } else {
                e18Var.T();
            }
            int i3 = i2 & (-897);
            yw8 yw8Var3 = yw8Var;
            e18Var.q();
            iqbVar2 = iqbVar;
            f(messageImageAsset, messageImageAsset.getCacheKey(), iqbVar2, yw8Var3, null, str, e18Var, (i3 & 14) | 384 | ((i3 << 6) & 458752), 16);
            messageImageAsset2 = messageImageAsset;
            str2 = str;
            yw8Var2 = yw8Var3;
        } else {
            iqbVar2 = iqbVar;
            str2 = str;
            messageImageAsset2 = messageImageAsset;
            e18Var.T();
            yw8Var2 = yw8Var;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new v3e(messageImageAsset2, iqbVar2, yw8Var2, str2, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(java.lang.Object r19, java.lang.String r20, defpackage.iqb r21, defpackage.yw8 r22, defpackage.z0c r23, java.lang.String r24, defpackage.ld4 r25, int r26, int r27) {
        /*
            Method dump skipped, instruction units count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tnk.f(java.lang.Object, java.lang.String, iqb, yw8, z0c, java.lang.String, ld4, int, int):void");
    }

    public static final void g(String str, iqb iqbVar, String str2, yw8 yw8Var, z0c z0cVar, String str3, ld4 ld4Var, int i, int i2) {
        z0c z0cVar2;
        int i3;
        String str4;
        int i4;
        String str5;
        yw8 yw8Var2;
        z0c z0cVar3;
        String str6;
        yw8 yw8Var3;
        String str7;
        z0c z0cVar4;
        int i5;
        String str8;
        str.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1163645860);
        int i6 = i | (e18Var.f(str) ? 4 : 2);
        if ((i & 48) == 0) {
            i6 |= e18Var.f(iqbVar) ? 32 : 16;
        }
        int i7 = i6 | 1152;
        int i8 = i2 & 16;
        if (i8 != 0) {
            i3 = i6 | 25728;
            z0cVar2 = z0cVar;
        } else {
            z0cVar2 = z0cVar;
            i3 = i7 | (e18Var.h(z0cVar2) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN);
        }
        int i9 = i2 & 32;
        if (i9 != 0) {
            i4 = i3 | 196608;
            str4 = str3;
        } else {
            str4 = str3;
            i4 = i3 | (e18Var.f(str4) ? 131072 : 65536);
        }
        if (e18Var.Q(i4 & 1, (74899 & i4) != 74898)) {
            e18Var.V();
            if ((i & 1) == 0 || e18Var.A()) {
                m7f m7fVarN = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF = e18Var.f(null) | e18Var.f(m7fVarN);
                Object objN = e18Var.N();
                if (zF || objN == jd4.a) {
                    objN = m7fVarN.a(jce.a.b(yw8.class), null, null);
                    e18Var.k0(objN);
                }
                e18Var.p(false);
                e18Var.p(false);
                yw8 yw8Var4 = (yw8) objN;
                int i10 = i4 & (-8065);
                if (i8 != 0) {
                    z0cVar2 = null;
                }
                if (i9 != 0) {
                    z0cVar4 = z0cVar2;
                    i5 = i10;
                    yw8Var3 = yw8Var4;
                    str7 = null;
                } else {
                    yw8Var3 = yw8Var4;
                    str7 = str4;
                    z0cVar4 = z0cVar2;
                    i5 = i10;
                }
                str8 = str;
            } else {
                e18Var.T();
                yw8Var3 = yw8Var;
                str7 = str4;
                z0cVar4 = z0cVar2;
                i5 = i4 & (-8065);
                str8 = str2;
            }
            e18Var.q();
            f(str, str8, iqbVar, yw8Var3, z0cVar4, str7, e18Var, (i5 & 14) | ((i5 << 3) & 896) | (57344 & i5) | (i5 & 458752), 0);
            str5 = str8;
            yw8Var2 = yw8Var3;
            z0cVar3 = z0cVar4;
            str6 = str7;
        } else {
            e18Var.T();
            str5 = str2;
            yw8Var2 = yw8Var;
            z0cVar3 = z0cVar2;
            str6 = str4;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new xk1(str, iqbVar, str5, yw8Var2, z0cVar3, str6, i, i2, 12);
        }
    }

    public static final void h(Uri uri, String str, iqb iqbVar, yw8 yw8Var, ld4 ld4Var, int i) {
        yw8 yw8Var2;
        int i2;
        yw8 yw8Var3;
        uri.getClass();
        str.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-495420626);
        int i3 = i | (e18Var.h(uri) ? 4 : 2) | (e18Var.f(str) ? 32 : 16) | 25600;
        if (e18Var.Q(i3 & 1, (i3 & 9363) != 9362)) {
            e18Var.V();
            if ((i & 1) == 0 || e18Var.A()) {
                m7f m7fVarN = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF = e18Var.f(null) | e18Var.f(m7fVarN);
                Object objN = e18Var.N();
                if (zF || objN == jd4.a) {
                    objN = m7fVarN.a(jce.a.b(yw8.class), null, null);
                    e18Var.k0(objN);
                }
                e18Var.p(false);
                e18Var.p(false);
                i2 = i3 & (-7169);
                yw8Var3 = (yw8) objN;
            } else {
                e18Var.T();
                i2 = i3 & (-7169);
                yw8Var3 = yw8Var;
            }
            e18Var.q();
            f(uri, str, iqbVar, yw8Var3, null, null, e18Var, (i2 & 8190) | 196608, 16);
            yw8Var2 = yw8Var3;
        } else {
            e18Var.T();
            yw8Var2 = yw8Var;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new v3e((Object) uri, str, (Object) iqbVar, (Object) yw8Var2, i, 20);
        }
    }

    public static final void i(ydh ydhVar, Object obj, String str, int i, bz7 bz7Var) {
        ydhVar.a.a(new heh(obj, str, i, bz7Var));
    }

    public static final void j(ydh ydhVar, Object obj, TextClassification textClassification, int i) {
        ydhVar.a.a(new neh(obj, textClassification, i));
    }

    public static final AggregationType k(vr vrVar) {
        vrVar.getClass();
        AggregationType aggregationTypeN = bje.n(es.a.get(vrVar));
        if (aggregationTypeN != null || (aggregationTypeN = bje.n(es.b.get(vrVar))) != null || (aggregationTypeN = bje.n(es.c.get(vrVar))) != null || (aggregationTypeN = bje.n(es.f.get(vrVar))) != null || (aggregationTypeN = bje.n(es.d.get(vrVar))) != null || (aggregationTypeN = bje.n(es.e.get(vrVar))) != null || (aggregationTypeN = bje.n(es.g.get(vrVar))) != null || (aggregationTypeN = bje.n(es.h.get(vrVar))) != null || (aggregationTypeN = bje.n(es.i.get(vrVar))) != null || (aggregationTypeN = bje.n(es.j.get(vrVar))) != null || (aggregationTypeN = bje.n(es.k.get(vrVar))) != null) {
            return aggregationTypeN;
        }
        AggregationType aggregationTypeN2 = bje.n(es.l.get(vrVar));
        if (aggregationTypeN2 != null) {
            return aggregationTypeN2;
        }
        sz6.p("Unsupported aggregation type ".concat(vrVar.a()));
        return null;
    }

    public static final LocalTimeRangeFilter l(bqh bqhVar) {
        bqhVar.getClass();
        LocalTimeRangeFilter localTimeRangeFilterBuild = z8e.b().setStartTime(bqhVar.b).setEndTime(bqhVar.c).build();
        localTimeRangeFilterBuild.getClass();
        return localTimeRangeFilterBuild;
    }

    public static final TimeRangeFilter m(bqh bqhVar) {
        bqhVar.getClass();
        return bje.m(l(bqhVar));
    }
}
