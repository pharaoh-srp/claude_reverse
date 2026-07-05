package com.anthropic.claude.settings.internal;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import com.anthropic.claude.R;
import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.b4e;
import defpackage.bk1;
import defpackage.bn;
import defpackage.bz7;
import defpackage.cpc;
import defpackage.csg;
import defpackage.d29;
import defpackage.d4c;
import defpackage.e18;
import defpackage.fd9;
import defpackage.fk0;
import defpackage.fqb;
import defpackage.fw;
import defpackage.gw;
import defpackage.haa;
import defpackage.ij0;
import defpackage.im6;
import defpackage.iqb;
import defpackage.jce;
import defpackage.jd4;
import defpackage.jn0;
import defpackage.koi;
import defpackage.l45;
import defpackage.ld4;
import defpackage.lz1;
import defpackage.m7f;
import defpackage.mpk;
import defpackage.nwb;
import defpackage.pp;
import defpackage.qi3;
import defpackage.r7e;
import defpackage.rn;
import defpackage.rwe;
import defpackage.sq6;
import defpackage.ssj;
import defpackage.ta4;
import defpackage.tp4;
import defpackage.um1;
import defpackage.um5;
import defpackage.w00;
import defpackage.x44;
import defpackage.xu;
import defpackage.ybg;
import defpackage.ze0;
import defpackage.zy7;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e {
    public static final void a(koi koiVar, ybg ybgVar, ld4 ld4Var, int i) {
        final koi koiVar2;
        final ybg ybgVar2;
        Object obj;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(2107244650);
        int i2 = (e18Var.f(koiVar) ? 4 : 2) | i;
        if (e18Var.Q(i2 & 1, (i2 & 19) != 18)) {
            final Context context = (Context) e18Var.j(w00.b);
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (objN == lz1Var) {
                objN = fd9.O(im6.E, e18Var);
                e18Var.k0(objN);
            }
            final l45 l45Var = (l45) objN;
            String strI = ij0.i("Account ID: ", koiVar.d);
            int i3 = i2 & 14;
            boolean zH = e18Var.h(context) | (i3 == 4) | e18Var.h(l45Var);
            Object objN2 = e18Var.N();
            if (zH || objN2 == lz1Var) {
                final int i4 = 0;
                koiVar2 = koiVar;
                ybgVar2 = ybgVar;
                obj = new zy7() { // from class: t99
                    @Override // defpackage.zy7
                    public final Object a() {
                        int i5 = i4;
                        iei ieiVar = iei.a;
                        ybg ybgVar3 = ybgVar2;
                        l45 l45Var2 = l45Var;
                        koi koiVar3 = koiVar2;
                        Context context2 = context;
                        switch (i5) {
                            case 0:
                                Object systemService = context2.getSystemService("clipboard");
                                systemService.getClass();
                                ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("Account ID", koiVar3.d));
                                gb9.D(l45Var2, null, null, new y99(ybgVar3, null, 0), 3);
                                break;
                            default:
                                Object systemService2 = context2.getSystemService("clipboard");
                                systemService2.getClass();
                                ((ClipboardManager) systemService2).setPrimaryClip(ClipData.newPlainText("Organization ID", koiVar3.e));
                                gb9.D(l45Var2, null, null, new y99(ybgVar3, null, 1), 3);
                                break;
                        }
                        return ieiVar;
                    }
                };
                e18Var.k0(obj);
            } else {
                ybgVar2 = ybgVar;
                obj = objN2;
                koiVar2 = koiVar;
            }
            c(0, e18Var, (zy7) obj, null, strI);
            String strI2 = ij0.i("Organization ID: ", koiVar2.e);
            boolean zH2 = e18Var.h(context) | (i3 == 4) | e18Var.h(l45Var);
            Object objN3 = e18Var.N();
            if (zH2 || objN3 == lz1Var) {
                final int i5 = 1;
                zy7 zy7Var = new zy7() { // from class: t99
                    @Override // defpackage.zy7
                    public final Object a() {
                        int i52 = i5;
                        iei ieiVar = iei.a;
                        ybg ybgVar3 = ybgVar2;
                        l45 l45Var2 = l45Var;
                        koi koiVar3 = koiVar2;
                        Context context2 = context;
                        switch (i52) {
                            case 0:
                                Object systemService = context2.getSystemService("clipboard");
                                systemService.getClass();
                                ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("Account ID", koiVar3.d));
                                gb9.D(l45Var2, null, null, new y99(ybgVar3, null, 0), 3);
                                break;
                            default:
                                Object systemService2 = context2.getSystemService("clipboard");
                                systemService2.getClass();
                                ((ClipboardManager) systemService2).setPrimaryClip(ClipData.newPlainText("Organization ID", koiVar3.e));
                                gb9.D(l45Var2, null, null, new y99(ybgVar3, null, 1), 3);
                                break;
                        }
                        return ieiVar;
                    }
                };
                e18Var.k0(zy7Var);
                objN3 = zy7Var;
            }
            c(0, e18Var, (zy7) objN3, null, strI2);
        } else {
            koiVar2 = koiVar;
            ybgVar2 = ybgVar;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new um5(koiVar2, ybgVar2, i, 25);
        }
    }

    public static final void b(fk0 fk0Var, iqb iqbVar, ld4 ld4Var, int i) {
        iqb iqbVar2;
        Object next;
        String str;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-652220417);
        int i2 = (e18Var.h(fk0Var) ? 4 : 2) | i | 48;
        if (e18Var.Q(i2 & 1, (i2 & 19) != 18)) {
            String str2 = "None (use real API)";
            List listX = x44.X(new cpc(null, "None (use real API)"), new cpc("verified", "Verified (18+)"), new cpc("supervised", "Supervised (blocked)"), new cpc("declared_adult", "Declared adult (18+, self-asserted)"), new cpc("declared_minor", "Declared minor (<18, self-asserted, blocked)"), new cpc("declared", "Declared (self-asserted, straddles 18 or unspecified)"), new cpc("unknown", "Unknown"), new cpc("retryable_error", "Retryable error"), new cpc("skipped", "Skipped"));
            String str3 = (String) fk0Var.D.getValue();
            Iterator it = listX.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (x44.r(((cpc) next).E, str3)) {
                        break;
                    }
                }
            }
            cpc cpcVar = (cpc) next;
            if (cpcVar != null && (str = (String) cpcVar.F) != null) {
                str2 = str;
            }
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (objN == lz1Var) {
                objN = mpk.P(Boolean.FALSE);
                e18Var.k0(objN);
            }
            nwb nwbVar = (nwb) objN;
            Object objN2 = e18Var.N();
            if (objN2 == lz1Var) {
                objN2 = new d29(4, nwbVar);
                e18Var.k0(objN2);
            }
            ta4 ta4VarQ0 = fd9.q0(-1578153904, new bn(str2, nwbVar, listX, fk0Var), e18Var);
            iqbVar2 = fqb.E;
            d((zy7) objN2, iqbVar2, ta4VarQ0, e18Var, 438, 0);
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new um5(fk0Var, iqbVar2, i, 26);
        }
    }

    public static final void c(int i, ld4 ld4Var, zy7 zy7Var, iqb iqbVar, String str) {
        int i2;
        iqb iqbVar2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(468201307);
        if ((i & 6) == 0) {
            i2 = (e18Var.f(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.h(zy7Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (e18Var.Q(i3 & 1, (i3 & 147) != 146)) {
            iqbVar2 = fqb.E;
            d(zy7Var, iqbVar2, fd9.q0(1685258474, new pp(str, 13), e18Var), e18Var, ((i3 >> 3) & 14) | 432, 0);
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new bk1(str, zy7Var, iqbVar2, i, 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(defpackage.zy7 r15, defpackage.iqb r16, defpackage.ta4 r17, defpackage.ld4 r18, int r19, int r20) {
        /*
            Method dump skipped, instruction units count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.settings.internal.e.d(zy7, iqb, ta4, ld4, int, int):void");
    }

    public static final void e(zy7 zy7Var, zy7 zy7Var2, rwe rweVar, iqb iqbVar, fk0 fk0Var, um1 um1Var, ze0 ze0Var, qi3 qi3Var, b4e b4eVar, ld4 ld4Var, int i) {
        iqb iqbVar2;
        fk0 fk0Var2;
        um1 um1Var2;
        ze0 ze0Var2;
        qi3 qi3Var2;
        b4e b4eVar2;
        b4e b4eVar3;
        ze0 ze0Var3;
        iqb iqbVar3;
        fk0 fk0Var3;
        int i2;
        qi3 qi3Var3;
        zy7Var.getClass();
        zy7Var2.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1201310504);
        int i3 = i | (e18Var.h(zy7Var) ? 4 : 2) | (e18Var.h(zy7Var2) ? 32 : 16) | (e18Var.f(rweVar) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | 38349824;
        if (e18Var.Q(i3 & 1, (38347923 & i3) != 38347922)) {
            e18Var.V();
            int i4 = i & 1;
            tp4 tp4Var = null;
            lz1 lz1Var = jd4.a;
            if (i4 == 0 || e18Var.A()) {
                m7f m7fVarN = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF = e18Var.f(null) | e18Var.f(m7fVarN);
                Object objN = e18Var.N();
                if (zF || objN == lz1Var) {
                    objN = m7fVarN.a(jce.a.b(fk0.class), null, null);
                    e18Var.k0(objN);
                }
                e18Var.p(false);
                e18Var.p(false);
                fk0 fk0Var4 = (fk0) objN;
                m7f m7fVarN2 = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF2 = e18Var.f(null) | e18Var.f(m7fVarN2);
                Object objN2 = e18Var.N();
                if (zF2 || objN2 == lz1Var) {
                    objN2 = m7fVarN2.a(jce.a.b(um1.class), null, null);
                    e18Var.k0(objN2);
                }
                e18Var.p(false);
                e18Var.p(false);
                um1 um1Var3 = (um1) objN2;
                m7f m7fVarN3 = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF3 = e18Var.f(null) | e18Var.f(m7fVarN3);
                Object objN3 = e18Var.N();
                if (zF3 || objN3 == lz1Var) {
                    objN3 = m7fVarN3.a(jce.a.b(ze0.class), null, null);
                    e18Var.k0(objN3);
                }
                e18Var.p(false);
                e18Var.p(false);
                ze0 ze0Var4 = (ze0) objN3;
                m7f m7fVarN4 = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF4 = e18Var.f(null) | e18Var.f(m7fVarN4);
                Object objN4 = e18Var.N();
                if (zF4 || objN4 == lz1Var) {
                    objN4 = m7fVarN4.a(jce.a.b(qi3.class), null, null);
                    e18Var.k0(objN4);
                }
                e18Var.p(false);
                e18Var.p(false);
                qi3 qi3Var4 = (qi3) objN4;
                m7f m7fVarN5 = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF5 = e18Var.f(null) | e18Var.f(m7fVarN5);
                Object objN5 = e18Var.N();
                if (zF5 || objN5 == lz1Var) {
                    objN5 = m7fVarN5.a(jce.a.b(b4e.class), null, null);
                    e18Var.k0(objN5);
                }
                e18Var.p(false);
                e18Var.p(false);
                b4eVar3 = (b4e) objN5;
                ze0Var3 = ze0Var4;
                iqbVar3 = fqb.E;
                fk0Var3 = fk0Var4;
                um1Var2 = um1Var3;
                i2 = i3 & (-268427265);
                qi3Var3 = qi3Var4;
            } else {
                e18Var.T();
                iqbVar3 = iqbVar;
                fk0Var3 = fk0Var;
                um1Var2 = um1Var;
                ze0Var3 = ze0Var;
                b4eVar3 = b4eVar;
                i2 = i3 & (-268427265);
                qi3Var3 = qi3Var;
            }
            e18Var.q();
            boolean zH = e18Var.h(qi3Var3);
            Object objN6 = e18Var.N();
            if (zH || objN6 == lz1Var) {
                objN6 = new gw(qi3Var3, tp4Var, 17);
                e18Var.k0(objN6);
            }
            csg.g((bz7) objN6, e18Var, 0, 1);
            Object objN7 = e18Var.N();
            if (objN7 == lz1Var) {
                objN7 = sq6.p(e18Var);
            }
            ybg ybgVar = (ybg) objN7;
            ssj.c(d4c.j0(R.string.internal_settings_title, e18Var), zy7Var, iqbVar3, null, fd9.q0(-2001968946, new rn(ybgVar, 11), e18Var), 0L, fd9.q0(2059550889, new fw(fk0Var3, rweVar, ze0Var3, um1Var2, zy7Var2, b4eVar3, ybgVar, 5), e18Var), e18Var, ((i2 << 3) & 112) | 1597824, 40);
            iqbVar2 = iqbVar3;
            ze0Var2 = ze0Var3;
            b4eVar2 = b4eVar3;
            qi3Var2 = qi3Var3;
            fk0Var2 = fk0Var3;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
            fk0Var2 = fk0Var;
            um1Var2 = um1Var;
            ze0Var2 = ze0Var;
            qi3Var2 = qi3Var;
            b4eVar2 = b4eVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new jn0(zy7Var, zy7Var2, rweVar, iqbVar2, fk0Var2, um1Var2, ze0Var2, qi3Var2, b4eVar2, i, 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0264  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(java.lang.String r35, boolean r36, defpackage.bz7 r37, defpackage.iqb r38, java.lang.String r39, defpackage.oxf r40, defpackage.mnc r41, defpackage.ld4 r42, int r43, int r44) {
        /*
            Method dump skipped, instruction units count: 628
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.settings.internal.e.f(java.lang.String, boolean, bz7, iqb, java.lang.String, oxf, mnc, ld4, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01d8  */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v42 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r7v11, types: [e18] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v2, types: [e18] */
    /* JADX WARN: Type inference failed for: r7v5, types: [e18, ld4] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [e18] */
    /* JADX WARN: Type inference failed for: r7v8, types: [e18] */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v27 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(final defpackage.ybg r36, defpackage.fk0 r37, defpackage.um1 r38, final com.anthropic.claude.code.remote.stores.a r39, com.anthropic.claude.code.remote.stores.b r40, defpackage.ca9 r41, defpackage.ld4 r42, int r43) {
        /*
            Method dump skipped, instruction units count: 1151
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.settings.internal.e.g(ybg, fk0, um1, com.anthropic.claude.code.remote.stores.a, com.anthropic.claude.code.remote.stores.b, ca9, ld4, int):void");
    }

    public static final void h(haa haaVar, String str, boolean z, ta4 ta4Var) {
        haa.a(haaVar, z, new ta4(716050320, true, new xu(str, 4, ta4Var)), 2);
    }

    public static /* synthetic */ void i(haa haaVar, String str, ta4 ta4Var, int i) {
        if ((i & 1) != 0) {
            str = null;
        }
        h(haaVar, str, true, ta4Var);
    }
}
