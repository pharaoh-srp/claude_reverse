package defpackage;

import com.anthropic.claude.R;
import com.anthropic.claude.analytics.events.WebViewEvents$WebViewKind;
import com.anthropic.claude.api.chat.MessageBlobFile;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class kwj {
    public static final ta4 a = new ta4(-1708113316, false, new xa4(24));
    public static final ta4 b = new ta4(1825824065, false, new xa4(25));
    public static final float[] c = {0.82f, 0.65f, 0.92f};

    public static final void a(zy7 zy7Var, pz7 pz7Var, zy7 zy7Var2, iqb iqbVar, qb2 qb2Var, qi3 qi3Var, ze0 ze0Var, ld4 ld4Var, int i) {
        iqb iqbVar2;
        qb2 qb2Var2;
        qi3 qi3Var2;
        ze0 ze0Var2;
        int i2;
        qi3 qi3Var3;
        ze0 ze0Var3;
        qb2 qb2Var3;
        iqb iqbVar3;
        zy7Var.getClass();
        pz7Var.getClass();
        zy7Var2.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1995042027);
        int i3 = 2;
        int i4 = i | (e18Var.h(zy7Var) ? 4 : 2) | (e18Var.h(pz7Var) ? 32 : 16) | (e18Var.h(zy7Var2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | 601088;
        if (e18Var.Q(i4 & 1, (599187 & i4) != 599186)) {
            e18Var.V();
            int i5 = i & 1;
            tp4 tp4Var = null;
            lz1 lz1Var = jd4.a;
            if (i5 == 0 || e18Var.A()) {
                m7f m7fVarB = gr9.b(e18Var);
                boolean zH = e18Var.h(m7fVarB);
                Object objN = e18Var.N();
                if (zH || objN == lz1Var) {
                    objN = new di(m7fVarB, 7);
                    e18Var.k0(objN);
                }
                kce kceVar = jce.a;
                qb2 qb2Var4 = (qb2) fd9.r0(kceVar.b(qb2.class), oq5.B(kceVar.b(qb2.class)), (bz7) objN, e18Var);
                m7f m7fVarN = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF = e18Var.f(null) | e18Var.f(m7fVarN);
                Object objN2 = e18Var.N();
                if (zF || objN2 == lz1Var) {
                    objN2 = m7fVarN.a(kceVar.b(qi3.class), null, null);
                    e18Var.k0(objN2);
                }
                e18Var.p(false);
                e18Var.p(false);
                qi3 qi3Var4 = (qi3) objN2;
                m7f m7fVarN2 = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF2 = e18Var.f(null) | e18Var.f(m7fVarN2);
                Object objN3 = e18Var.N();
                if (zF2 || objN3 == lz1Var) {
                    objN3 = m7fVarN2.a(kceVar.b(ze0.class), null, null);
                    e18Var.k0(objN3);
                }
                e18Var.p(false);
                e18Var.p(false);
                i2 = i4 & (-4186113);
                qi3Var3 = qi3Var4;
                ze0Var3 = (ze0) objN3;
                qb2Var3 = qb2Var4;
                iqbVar3 = fqb.E;
            } else {
                e18Var.T();
                iqbVar3 = iqbVar;
                qb2Var3 = qb2Var;
                ze0Var3 = ze0Var;
                i2 = i4 & (-4186113);
                qi3Var3 = qi3Var;
            }
            e18Var.q();
            Object objN4 = e18Var.N();
            if (objN4 == lz1Var) {
                objN4 = sq6.p(e18Var);
            }
            ybg ybgVar = (ybg) objN4;
            boolean zH2 = e18Var.h(qi3Var3) | e18Var.h(qb2Var3);
            Object objN5 = e18Var.N();
            if (zH2 || objN5 == lz1Var) {
                objN5 = new dv(qi3Var3, qb2Var3, tp4Var, i3);
                e18Var.k0(objN5);
            }
            csg.g((bz7) objN5, e18Var, 0, 1);
            ssj.c(d4c.j0(R.string.capabilities_setting_title, e18Var), zy7Var, iqbVar3, null, null, 0L, fd9.q0(-104519108, new xe(qb2Var3, ybgVar, ze0Var3, zy7Var2, pz7Var, 10), e18Var), e18Var, ((i2 << 3) & 112) | 1573248, 56);
            iqbVar2 = iqbVar3;
            qi3Var2 = qi3Var3;
            ze0Var2 = ze0Var3;
            qb2Var2 = qb2Var3;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
            qb2Var2 = qb2Var;
            qi3Var2 = qi3Var;
            ze0Var2 = ze0Var;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new lw(zy7Var, (qz7) pz7Var, (Object) zy7Var2, (Object) iqbVar2, (Object) qb2Var2, qi3Var2, (Object) ze0Var2, i, 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(java.util.List r39, java.lang.String r40, defpackage.bz7 r41, defpackage.ld4 r42, int r43) {
        /*
            Method dump skipped, instruction units count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kwj.b(java.util.List, java.lang.String, bz7, ld4, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(defpackage.iqb r11, float r12, defpackage.mnc r13, defpackage.ta4 r14, defpackage.ld4 r15, int r16, int r17) {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kwj.c(iqb, float, mnc, ta4, ld4, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x016f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(final boolean r18, defpackage.zy7 r19, final defpackage.rz7 r20, final defpackage.iqb r21, defpackage.pz7 r22, defpackage.pz7 r23, float r24, final defpackage.mnc r25, defpackage.wo1 r26, float r27, defpackage.ta4 r28, defpackage.ld4 r29, final int r30, final int r31) {
        /*
            Method dump skipped, instruction units count: 681
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kwj.d(boolean, zy7, rz7, iqb, pz7, pz7, float, mnc, wo1, float, ta4, ld4, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(defpackage.pz7 r17, defpackage.iqb r18, float r19, defpackage.mnc r20, defpackage.pz7 r21, defpackage.wo1 r22, float r23, defpackage.ta4 r24, defpackage.ld4 r25, int r26, int r27) {
        /*
            Method dump skipped, instruction units count: 543
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kwj.e(pz7, iqb, float, mnc, pz7, wo1, float, ta4, ld4, int, int):void");
    }

    public static final void f(MessageBlobFile messageBlobFile, ej7 ej7Var, zy7 zy7Var, ned nedVar, hdc hdcVar, n3f n3fVar, ld4 ld4Var, int i) {
        int i2;
        ned nedVar2;
        n3f n3fVar2;
        e18 e18Var;
        hdc hdcVar2;
        int i3;
        n3f n3fVar3;
        hdc hdcVar3;
        ned nedVar3;
        messageBlobFile.getClass();
        zy7Var.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-921345432);
        if ((i & 6) == 0) {
            i2 = (e18Var2.f(messageBlobFile) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var2.f(ej7Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var2.h(zy7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i & 24576) == 0) {
            i2 |= FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if ((196608 & i) == 0) {
            i2 |= 65536;
        }
        if (e18Var2.Q(i2 & 1, (74899 & i2) != 74898)) {
            e18Var2.V();
            int i4 = i & 1;
            lz1 lz1Var = jd4.a;
            if (i4 == 0 || e18Var2.A()) {
                m7f m7fVarN = sq6.n(e18Var2, -1168520582, e18Var2, -1633490746);
                boolean zF = e18Var2.f(null) | e18Var2.f(m7fVarN);
                Object objN = e18Var2.N();
                if (zF || objN == lz1Var) {
                    objN = m7fVarN.a(jce.a.b(ned.class), null, null);
                    e18Var2.k0(objN);
                }
                e18Var2.p(false);
                e18Var2.p(false);
                ned nedVar4 = (ned) objN;
                m7f m7fVarN2 = sq6.n(e18Var2, -1168520582, e18Var2, -1633490746);
                boolean zF2 = e18Var2.f(null) | e18Var2.f(m7fVarN2);
                Object objN2 = e18Var2.N();
                if (zF2 || objN2 == lz1Var) {
                    objN2 = m7fVarN2.a(jce.a.b(hdc.class), null, null);
                    e18Var2.k0(objN2);
                }
                e18Var2.p(false);
                e18Var2.p(false);
                hdc hdcVar4 = (hdc) objN2;
                m7f m7fVarN3 = sq6.n(e18Var2, -1168520582, e18Var2, -1633490746);
                boolean zF3 = e18Var2.f(null) | e18Var2.f(m7fVarN3);
                Object objN3 = e18Var2.N();
                if (zF3 || objN3 == lz1Var) {
                    objN3 = m7fVarN3.a(jce.a.b(n3f.class), null, null);
                    e18Var2.k0(objN3);
                }
                e18Var2.p(false);
                e18Var2.p(false);
                i3 = i2 & (-523265);
                n3fVar3 = (n3f) objN3;
                hdcVar3 = hdcVar4;
                nedVar3 = nedVar4;
            } else {
                e18Var2.T();
                i3 = i2 & (-523265);
                nedVar3 = nedVar;
                hdcVar3 = hdcVar;
                n3fVar3 = n3fVar;
            }
            int i5 = i3;
            e18Var2.q();
            int i6 = i5 & 14;
            int i7 = i5 & 112;
            boolean z = (i6 == 4) | (i7 == 32);
            Object objN4 = e18Var2.N();
            if (z || objN4 == lz1Var) {
                objN4 = nedVar3.a(messageBlobFile, ej7Var);
                e18Var2.k0(objN4);
            }
            String str = (String) objN4;
            Object objN5 = e18Var2.N();
            if (objN5 == lz1Var) {
                objN5 = n3fVar3.a(WebViewEvents$WebViewKind.OFFICE_PREVIEW);
                e18Var2.k0(objN5);
            }
            o3f o3fVar = (o3f) objN5;
            boolean z2 = (i6 == 4) | (i7 == 32);
            Object objN6 = e18Var2.N();
            if (z2 || objN6 == lz1Var) {
                objN6 = mpk.P(Boolean.FALSE);
                e18Var2.k0(objN6);
            }
            int i8 = i6 | 24576;
            int i9 = i5 << 3;
            lwj.i(messageBlobFile, messageBlobFile.getFile_name(), ej7Var, zy7Var, fd9.q0(538460608, new oed(str, messageBlobFile, hdcVar3, o3fVar, (nwb) objN6, 0), e18Var2), e18Var2, i8 | (i9 & 896) | (i9 & 7168));
            e18Var = e18Var2;
            nedVar2 = nedVar3;
            n3fVar2 = n3fVar3;
            hdcVar2 = hdcVar3;
        } else {
            e18Var2.T();
            nedVar2 = nedVar;
            n3fVar2 = n3fVar;
            e18Var = e18Var2;
            hdcVar2 = hdcVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ped(messageBlobFile, ej7Var, zy7Var, nedVar2, hdcVar2, n3fVar2, i, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:143:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:150:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(final defpackage.y49 r23, final boolean r24, final boolean r25, defpackage.iqb r26, final long r27, float r29, float r30, float r31, float r32, defpackage.ld4 r33, final int r34, final int r35) {
        /*
            Method dump skipped, instruction units count: 650
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kwj.g(y49, boolean, boolean, iqb, long, float, float, float, float, ld4, int, int):void");
    }

    public static es6 h(qh9 qh9Var) {
        try {
            ArrayList arrayList = qh9Var.s("id").e().E;
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((bh9) it.next()).m());
            }
            return new es6(arrayList2);
        } catch (IllegalStateException e) {
            pmf.j("Unable to parse json into type Action", e);
            return null;
        } catch (NullPointerException e2) {
            pmf.j("Unable to parse json into type Action", e2);
            return null;
        } catch (NumberFormatException e3) {
            pmf.j("Unable to parse json into type Action", e3);
            return null;
        }
    }

    public static yvi i(qh9 qh9Var) {
        try {
            String strM = qh9Var.s("id").m();
            strM.getClass();
            return new yvi(strM);
        } catch (IllegalStateException e) {
            pmf.j("Unable to parse json into type ContainerView", e);
            return null;
        } catch (NullPointerException e2) {
            pmf.j("Unable to parse json into type ContainerView", e2);
            return null;
        } catch (NumberFormatException e3) {
            pmf.j("Unable to parse json into type ContainerView", e3);
            return null;
        }
    }

    public static final zb0 j(String str, List list, egg eggVar) {
        int i;
        str.getClass();
        list.getClass();
        StringBuilder sb = new StringBuilder(16);
        new ArrayList();
        ArrayList arrayList = new ArrayList();
        new ArrayList();
        sb.append(str);
        if (!list.isEmpty()) {
            int iCodePointCount = str.codePointCount(0, sb.length());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                b79 b79Var = (b79) it.next();
                boolean zIsEmpty = b79Var.isEmpty();
                int i2 = b79Var.F;
                if (!zIsEmpty && (i = b79Var.E) >= 0 && i2 < iCodePointCount) {
                    arrayList.add(new wb0(eggVar, str.offsetByCodePoints(0, i), str.offsetByCodePoints(0, i2 + 1), null, 8));
                }
            }
        }
        String string = sb.toString();
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            arrayList2.add(((wb0) arrayList.get(i3)).a(sb.length()));
        }
        return new zb0(string, (List) arrayList2);
    }
}
