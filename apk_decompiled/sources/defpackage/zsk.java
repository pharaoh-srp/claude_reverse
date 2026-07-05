package defpackage;

import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zsk {
    public static final ta4 a = new ta4(-982057132, false, new xb4(8));
    public static final ta4 b = new ta4(-1985070761, false, new xb4(9));
    public static final ta4 c = new ta4(985384495, false, new xb4(10));
    public static final ta4 d = new ta4(-178218894, false, new xb4(11));

    public static final void a(rvh rvhVar, mr0 mr0Var, zy7 zy7Var, iqb iqbVar, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var;
        int i3;
        int i4;
        int iA;
        rvhVar.getClass();
        Map map = rvhVar.d;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(684292327);
        if ((i & 6) == 0) {
            i2 = (e18Var2.h(rvhVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? e18Var2.f(mr0Var) : e18Var2.h(mr0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var2.h(zy7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var2.f(iqbVar) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        byte b2 = 0;
        if (e18Var2.Q(i2 & 1, (i2 & 1171) != 1170)) {
            boolean zF = e18Var2.f(map);
            Object objN = e18Var2.N();
            lz1 lz1Var = jd4.a;
            if (zF || objN == lz1Var) {
                objN = bwh.b(rvhVar);
                e18Var2.k0(objN);
            }
            String strN = (String) objN;
            if (strN == null) {
                strN = vb7.n(e18Var2, 474936736, R.string.ccr_artifact_card_fallback_title, e18Var2, false);
            } else {
                e18Var2.a0(474934752);
                e18Var2.p(false);
            }
            String str = null;
            oq0 oq0Var = mr0Var != null ? mr0Var.a : null;
            int i5 = oq0Var == null ? -1 : hq0.a[oq0Var.ordinal()];
            if (i5 == -1) {
                i3 = 474952092;
                i4 = R.string.ccr_artifact_card_publishing;
            } else if (i5 == 1) {
                i3 = 474947099;
                i4 = R.string.ccr_artifact_card_host_prod;
            } else {
                if (i5 != 2) {
                    throw ebh.u(e18Var2, 474939636, false);
                }
                i3 = 474949790;
                i4 = R.string.ccr_artifact_card_host_staging;
            }
            String strN2 = vb7.n(e18Var2, i3, i4, e18Var2, false);
            boolean zF2 = e18Var2.f(map);
            Object objN2 = e18Var2.N();
            if (zF2 || objN2 == lz1Var) {
                String strI = bwh.i("file_path", map);
                if (strI != null) {
                    String strH = bwh.h(strI);
                    if (!bsg.I0(strH) && !bsg.v0(strH, '/') && !bsg.v0(strH, '\\')) {
                        str = strH;
                    }
                }
                if (str == null) {
                    str = "";
                }
                String lowerCase = bsg.d1('.', str, "").toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                if (lowerCase.equals("html") || lowerCase.equals("htm")) {
                    ud0 ud0Var = ud0.d;
                    iA = R.drawable.anthropicon_atom;
                } else {
                    iA = uaj.a(str);
                }
                objN2 = Integer.valueOf(iA);
                e18Var2.k0(objN2);
            }
            int iIntValue = ((Number) objN2).intValue();
            e18Var = e18Var2;
            jwk.m(strN, ij0.C(d4c.j0(R.string.ccr_artifact_card_kind, e18Var2), " · ", strN2), fd9.q0(-1004580646, new gq0(iIntValue, b2, b2), e18Var2), iqbVar, zy7Var, d4c.j0(R.string.ccr_artifact_card_click_label, e18Var2), null, null, null, MTTypesetterKt.kLineSkipLimitMultiplier, null, null, mr0Var == null, e18Var, (i2 & 7168) | 384 | ((i2 << 6) & 57344), 0, 4032);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new xd(rvhVar, mr0Var, zy7Var, iqbVar, i, 4);
        }
    }

    public static final void b(String str, iqb iqbVar, ld4 ld4Var, int i) {
        iqb iqbVar2;
        str.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(847582161);
        int i2 = i | (e18Var.f(str) ? 4 : 2) | 48;
        if (e18Var.Q(i2 & 1, (i2 & 19) != 18)) {
            xo1 xo1Var = lja.K;
            fqb fqbVar = fqb.E;
            iqb iqbVarK = gb9.K(b.c(fqbVar, 1.0f), 24.0f, 32.0f);
            o5b o5bVarD = dw1.d(xo1Var, false);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarK);
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
            tjh.b(str, null, gm3.a(e18Var).O, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).i, e18Var, i2 & 14, 0, 131066);
            e18Var = e18Var;
            e18Var.p(true);
            iqbVar2 = fqbVar;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ip(str, iqbVar2, i, 11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c7  */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r14v2, types: [e18] */
    /* JADX WARN: Type inference failed for: r14v3, types: [e18, java.lang.Object, ld4] */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [rz7] */
    /* JADX WARN: Type inference failed for: r7v1, types: [ta4] */
    /* JADX WARN: Type inference failed for: r7v19, types: [ta4] */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v28, types: [rz7] */
    /* JADX WARN: Type inference failed for: r9v29 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(defpackage.ud0 r41, java.lang.String r42, java.lang.String r43, defpackage.iqb r44, defpackage.rz7 r45, float r46, defpackage.ta4 r47, defpackage.ld4 r48, int r49, int r50) {
        /*
            Method dump skipped, instruction units count: 969
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zsk.c(ud0, java.lang.String, java.lang.String, iqb, rz7, float, ta4, ld4, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(boolean r22, defpackage.iqb r23, boolean r24, long r25, float r27, defpackage.p0h r28, defpackage.bz7 r29, defpackage.ld4 r30, int r31, int r32) {
        /*
            Method dump skipped, instruction units count: 422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zsk.d(boolean, iqb, boolean, long, float, p0h, bz7, ld4, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:131:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x014d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(final boolean r24, final defpackage.ta4 r25, final defpackage.iqb r26, final boolean r27, long r28, float r30, final defpackage.p0h r31, final defpackage.bz7 r32, defpackage.ld4 r33, final int r34, final int r35) {
        /*
            Method dump skipped, instruction units count: 690
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zsk.e(boolean, ta4, iqb, boolean, long, float, p0h, bz7, ld4, int, int):void");
    }

    public static final boolean f(float f) {
        return Float.isNaN(f) || Math.abs(f) < 0.5f;
    }

    public static final void g(rwe rweVar, bga bgaVar) {
        rweVar.getClass();
        gmf gmfVar = rweVar.E;
        bgaVar.getClass();
        lsc lscVar = rweVar.F;
        if (x44.r(((bf3) lscVar.getValue()).a.a, bgaVar)) {
            return;
        }
        ie3 ie3Var = (ie3) w44.O0(r2.size() - 2, ((bf3) lscVar.getValue()).c);
        if (x44.r(ie3Var != null ? ie3Var.a : null, bgaVar)) {
            gmfVar.m(gge.G, new nmd(5));
        } else {
            gmfVar.m(new jx2(25, bgaVar), new nmd(6));
        }
    }

    public static String h(String str) {
        str.getClass();
        return ij0.l("<!DOCTYPE html><html><head>", "<meta http-equiv=\"Content-Security-Policy\" content=\"default-src 'none'; script-src 'unsafe-inline'; style-src 'unsafe-inline'; img-src data: blob:; media-src data: blob:; font-src data: blob:; connect-src 'none'; webrtc 'block'; form-action 'none'; base-uri 'none'\">", "<meta http-equiv=\"x-dns-prefetch-control\" content=\"off\"></head><body>", str, "</body></html>");
    }
}
