package defpackage;

import android.content.Context;
import android.print.PrintAttributes;
import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.pvporbit.freetype.FreeTypeConstants;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ykk {
    public static final ta4 a = new ta4(-1092241061, false, new rb4(11));

    public static final void a(final boolean z, final x0a x0aVar, final int i, final int i2, float f, float f2, final nwb nwbVar, ld4 ld4Var, final int i3) {
        int i4;
        final float f3;
        final float f4;
        int i5;
        int i6;
        float f5;
        nwb nwbVar2;
        float f6;
        x0aVar.getClass();
        nwbVar.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1032194813);
        if ((i3 & 6) == 0) {
            i4 = (e18Var.g(z) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= e18Var.f(x0aVar) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= e18Var.d(i) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i3 & 3072) == 0) {
            i4 |= e18Var.d(i2) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        int i7 = i4 | 221184;
        if ((1572864 & i3) == 0) {
            i7 |= e18Var.f(nwbVar) ? 1048576 : 524288;
        }
        if (e18Var.Q(i7 & 1, (599187 & i7) != 599186)) {
            cz5 cz5Var = (cz5) e18Var.j(ve4.h);
            int iM0 = cz5Var.M0(72.0f);
            int iM02 = cz5Var.M0(64.0f);
            nwb nwbVarZ = mpk.Z(Integer.valueOf(i), e18Var);
            nwb nwbVarZ2 = mpk.Z(Integer.valueOf(i2), e18Var);
            nwb nwbVarZ3 = mpk.Z(cz5Var, e18Var);
            int i8 = i7 & 3670016;
            boolean zF = e18Var.f(nwbVarZ3) | (i8 == 1048576);
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (zF || objN == lz1Var) {
                objN = new am3(nwbVarZ3, nwbVar);
                e18Var.k0(objN);
            }
            nwb nwbVarZ4 = mpk.Z((jm9) objN, e18Var);
            Integer numValueOf = Integer.valueOf(((Number) nwbVarZ.getValue()).intValue());
            Boolean boolValueOf = Boolean.valueOf(z);
            int i9 = i7 & 14;
            int i10 = i7;
            int i11 = i10 & 112;
            boolean zF2 = ((i7 & 7168) == 2048) | (i9 == 4) | ((i7 & 896) == 256) | e18Var.f(nwbVarZ4) | (i11 == 32) | e18Var.f(nwbVarZ) | e18Var.d(iM0) | e18Var.f(nwbVarZ2) | e18Var.d(iM02);
            Object objN2 = e18Var.N();
            if (zF2 || objN2 == lz1Var) {
                i5 = i11;
                i6 = FreeTypeConstants.FT_LOAD_COLOR;
                f5 = 72.0f;
                xl3 xl3Var = new xl3(z, i, i2, x0aVar, iM0, iM02, nwbVarZ4, nwbVarZ, nwbVarZ2, null);
                nwbVar2 = nwbVarZ4;
                e18Var.k0(xl3Var);
                objN2 = xl3Var;
            } else {
                i5 = i11;
                i6 = FreeTypeConstants.FT_LOAD_COLOR;
                f5 = 72.0f;
                nwbVar2 = nwbVarZ4;
            }
            fd9.j(numValueOf, boolValueOf, (pz7) objN2, e18Var);
            Boolean boolValueOf2 = Boolean.valueOf(z);
            boolean zF3 = (i5 == 32) | (i9 == 4) | e18Var.f(nwbVarZ2) | (i8 == i6) | e18Var.f(nwbVarZ3) | e18Var.f(nwbVar2);
            Object objN3 = e18Var.N();
            if (zF3 || objN3 == lz1Var) {
                f6 = 64.0f;
                zl3 zl3Var = new zl3(z, x0aVar, nwbVarZ2, nwbVar, nwbVarZ3, nwbVar2, null);
                e18Var.k0(zl3Var);
                objN3 = zl3Var;
            } else {
                f6 = 64.0f;
            }
            fd9.i(e18Var, (pz7) objN3, boolValueOf2);
            f4 = f6;
            f3 = f5;
        } else {
            e18Var.T();
            f3 = f;
            f4 = f2;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pz7() { // from class: wl3
                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ykk.a(z, x0aVar, i, i2, f3, f4, nwbVar, (ld4) obj, x44.p0(i3 | 1));
                    return iei.a;
                }
            };
        }
    }

    public static final void b(String str, String str2, String str3, String str4, ld4 ld4Var, int i) {
        e18 e18Var;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-781622227);
        int i2 = i | (e18Var2.f(str) ? 4 : 2) | (e18Var2.f(str2) ? 32 : 16) | (e18Var2.f(str3) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var2.f(str4) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE);
        if (e18Var2.Q(i2 & 1, (i2 & 1171) != 1170)) {
            String strK0 = (str4 == null || bsg.I0(str4)) ? null : str4;
            if (strK0 == null) {
                e18Var2.a0(480323084);
                strK0 = d4c.k0(x44.r(str3, "cyber") ? R.string.ccr_refusal_fallback_notice_cyber : x44.r(str3, "bio") ? R.string.ccr_refusal_fallback_notice_bio : R.string.ccr_refusal_fallback_notice_generic, new Object[]{str, str2}, e18Var2);
                e18Var2.p(false);
            } else {
                e18Var2.a0(480321751);
                e18Var2.p(false);
            }
            String strJ0 = d4c.j0(R.string.ccr_refusal_fallback_notice_learn_more, e18Var2);
            long j = gm3.a(e18Var2).N;
            xb0 xb0Var = new xb0();
            xb0Var.h(strK0);
            xb0Var.c(' ');
            int iK = xb0Var.k(new n6a(tyg.REAL_TIME_SAFEGUARDS.a(), new ekh(new egg(j, 0L, null, null, null, null, null, 0L, null, null, null, 0L, qeh.c, null, 61438), null, null, null), 4));
            try {
                xb0Var.h(strJ0);
                xb0Var.j(iK);
                e18Var = e18Var2;
                tjh.c(xb0Var.n(), b.c(fqb.E, 1.0f), gm3.a(e18Var2).N, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, ((jm3) gm3.c(e18Var2).e.E).i, e18Var, 48, 0, 262136);
            } catch (Throwable th) {
                xb0Var.j(iK);
                throw th;
            }
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new v3e((Object) str, (Object) str2, (Object) str3, (Object) str4, i, 1);
        }
    }

    public static final void c(int i, ld4 ld4Var, zy7 zy7Var, String str, boolean z) {
        String str2;
        int i2;
        e18 e18Var;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(619184027);
        if ((i & 6) == 0) {
            str2 = str;
            i2 = (e18Var2.f(str2) ? 4 : 2) | i;
        } else {
            str2 = str;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var2.g(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var2.h(zy7Var) ? 256 : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        int i3 = i2;
        if (e18Var2.Q(i3 & 1, (i3 & 147) != 146)) {
            ho0 ho0Var = new ho0(8.0f, true, new sz6(1));
            wo1 wo1Var = lja.Q;
            iqb iqbVarG = b.g(b.c(fqb.E, 1.0f), 48.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2);
            Object objN = e18Var2.N();
            lz1 lz1Var = jd4.a;
            if (objN == lz1Var) {
                objN = vb7.f(e18Var2);
            }
            iqb iqbVarB = androidx.compose.foundation.b.b(iqbVarG, (zub) objN, null, false, null, new vue(0), zy7Var, 12);
            boolean z2 = ((i3 & 112) == 32) | ((i3 & 896) == 256);
            Object objN2 = e18Var2.N();
            if (z2 || objN2 == lz1Var) {
                objN2 = new lyb(z, zy7Var, 1);
                e18Var2.k0(objN2);
            }
            iqb iqbVarB2 = tjf.b(iqbVarB, false, (bz7) objN2);
            cxe cxeVarA = axe.a(ho0Var, wo1Var, e18Var2, 54);
            int iHashCode = Long.hashCode(e18Var2.T);
            hyc hycVarL = e18Var2.l();
            iqb iqbVarE = kxk.E(e18Var2, iqbVarB2);
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
            tjh.b(d4c.k0(R.string.ccr_refusal_fallback_notice_switched_to, new Object[]{str2}, e18Var2), new hw9(1.0f, false), gm3.a(e18Var2).N, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, ((jm3) gm3.c(e18Var2).e.E).i, e18Var2, 0, 24960, 110584);
            itj.a(null, gm3.a(e18Var2).N, ((jm3) gm3.c(e18Var2).e.E).i, true, e18Var2, 3072);
            tjh.b(d4c.j0(z ? R.string.ccr_refusal_fallback_notice_hide : R.string.ccr_refusal_fallback_notice_why, e18Var2), null, gm3.a(e18Var2).N, 0L, null, null, null, 0L, qeh.c, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var2).e.E).i, e18Var2, 805306368, 0, 130554);
            e18Var = e18Var2;
            e18Var.p(true);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ds0(str2, z, zy7Var, i, 9);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x04c7  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x04fe  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x05bb  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x05d8  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0634  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0647  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x06a3  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x06b6  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x06c1  */
    /* JADX WARN: Removed duplicated region for block: B:244:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008a  */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r11v11, types: [e18] */
    /* JADX WARN: Type inference failed for: r11v12, types: [e18, ld4] */
    /* JADX WARN: Type inference failed for: r11v13, types: [e18] */
    /* JADX WARN: Type inference failed for: r11v14, types: [e18] */
    /* JADX WARN: Type inference failed for: r11v16, types: [e18] */
    /* JADX WARN: Type inference failed for: r11v18, types: [e18] */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v2, types: [e18] */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v25 */
    /* JADX WARN: Type inference failed for: r11v26 */
    /* JADX WARN: Type inference failed for: r11v27 */
    /* JADX WARN: Type inference failed for: r11v28 */
    /* JADX WARN: Type inference failed for: r11v29 */
    /* JADX WARN: Type inference failed for: r11v30 */
    /* JADX WARN: Type inference failed for: r11v31 */
    /* JADX WARN: Type inference failed for: r11v32 */
    /* JADX WARN: Type inference failed for: r11v5, types: [e18, ld4] */
    /* JADX WARN: Type inference failed for: r11v6, types: [e18, ld4] */
    /* JADX WARN: Type inference failed for: r11v7, types: [e18] */
    /* JADX WARN: Type inference failed for: r11v9, types: [e18] */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r13v21 */
    /* JADX WARN: Type inference failed for: r13v24 */
    /* JADX WARN: Type inference failed for: r13v25 */
    /* JADX WARN: Type inference failed for: r13v27 */
    /* JADX WARN: Type inference failed for: r14v17, types: [e18, ld4] */
    /* JADX WARN: Type inference failed for: r14v19, types: [ld4] */
    /* JADX WARN: Type inference failed for: r17v5, types: [ld4] */
    /* JADX WARN: Type inference failed for: r17v8, types: [ld4] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v9, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(java.lang.String r37, java.util.List r38, defpackage.bz7 r39, defpackage.bz7 r40, defpackage.iqb r41, defpackage.mra r42, defpackage.ld4 r43, int r44, int r45) {
        /*
            Method dump skipped, instruction units count: 1748
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ykk.d(java.lang.String, java.util.List, bz7, bz7, iqb, mra, ld4, int, int):void");
    }

    public static final void e(iqb iqbVar, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1035653902);
        int i2 = (e18Var.f(iqbVar) ? 4 : 2) | i;
        if (e18Var.Q(i2 & 1, (i2 & 3) != 2)) {
            xo1 xo1Var = lja.K;
            iqb iqbVarP = yfd.p(iqbVar, gm3.a(e18Var).q, zni.b);
            o5b o5bVarD = dw1.d(xo1Var, false);
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
            tjh.b("Map", null, gm3.a(e18Var).N, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).g, e18Var, 6, 0, 131066);
            e18Var = e18Var;
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new fl(i, 22, iqbVar);
        }
    }

    public static final void f(String str, String str2, String str3, String str4, iqb iqbVar, ld4 ld4Var, int i) {
        str.getClass();
        str2.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1515146255);
        int i2 = i | (e18Var.f(str) ? 4 : 2) | (e18Var.f(str2) ? 32 : 16) | (e18Var.f(str3) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var.f(str4) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE) | (e18Var.f(iqbVar) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) | 196608;
        if (e18Var.Q(i2 & 1, (74899 & i2) != 74898)) {
            Object[] objArr = new Object[0];
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (objN == lz1Var) {
                objN = new rod(28);
                e18Var.k0(objN);
            }
            nwb nwbVar = (nwb) iuj.I(objArr, (zy7) objN, e18Var, 0);
            iqb iqbVarC = b.c(iqbVar, 1.0f);
            q64 q64VarA = p64.a(ko0.c, lja.S, e18Var, 0);
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
            d4c.i0(e18Var, cd4.f, q64VarA);
            d4c.i0(e18Var, cd4.e, hycVarL);
            d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var, cd4.h);
            d4c.i0(e18Var, cd4.d, iqbVarE);
            boolean zBooleanValue = ((Boolean) nwbVar.getValue()).booleanValue();
            boolean zF = e18Var.f(nwbVar);
            Object objN2 = e18Var.N();
            if (zF || objN2 == lz1Var) {
                objN2 = new k3c(23, nwbVar);
                e18Var.k0(objN2);
            }
            c((i2 >> 3) & 14, e18Var, (zy7) objN2, str2, zBooleanValue);
            wd6.H(s64.a, ((Boolean) nwbVar.getValue()).booleanValue(), null, gp6.e(null, 3).a(gp6.d(null, null, 15)), gp6.f(null, 3).a(gp6.l(null, null, 15)), null, fd9.q0(1546947043, new h9a(str, (Object) str2, (Object) str3, (Object) str4, 7), e18Var), e18Var, 1600518, 18);
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new zv6(str, str2, str3, str4, iqbVar, i, 1);
        }
    }

    public static final q0a g(x0a x0aVar, int i) {
        q0a q0aVar = (q0a) w44.V0(x0aVar.h().k);
        int i2 = q0aVar != null ? q0aVar.a : 0;
        Object obj = null;
        if (((isc) x0aVar.e.b).h() > i || i > i2) {
            return null;
        }
        Iterator it = x0aVar.h().k.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((q0a) next).a == i) {
                obj = next;
                break;
            }
        }
        return (q0a) obj;
    }

    public static ha h(qh9 qh9Var) {
        try {
            ia iaVarF = blk.f(qh9Var.s("view").g());
            String strM = qh9Var.s("source").m();
            strM.getClass();
            for (int i : sq6.H(11)) {
                if (sq6.f(i).equals(strM)) {
                    return new ha(iaVarF, i);
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        } catch (IllegalStateException e) {
            pmf.j("Unable to parse json into type Container", e);
            return null;
        } catch (NullPointerException e2) {
            pmf.j("Unable to parse json into type Container", e2);
            return null;
        } catch (NumberFormatException e3) {
            pmf.j("Unable to parse json into type Container", e3);
            return null;
        }
    }

    public static obh i(qh9 qh9Var) {
        try {
            bh9 bh9VarS = qh9Var.s("device");
            lbh lbhVarF = bh9VarS != null ? rkk.f(bh9VarS.g()) : null;
            bh9 bh9VarS2 = qh9Var.s("os");
            mbh mbhVarE = bh9VarS2 != null ? skk.e(bh9VarS2.g()) : null;
            bh9 bh9VarS3 = qh9Var.s("type");
            String strM = bh9VarS3 != null ? bh9VarS3.m() : null;
            String strM2 = qh9Var.s("status").m();
            String strM3 = qh9Var.s("message").m();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it = ((m7a) qh9Var.E.entrySet()).iterator();
            while (((o7a) it).hasNext()) {
                p7a p7aVarA = ((l7a) it).a();
                if (!mp0.o0(p7aVarA.getKey(), obh.e)) {
                    Object key = p7aVarA.getKey();
                    key.getClass();
                    linkedHashMap.put(key, p7aVarA.getValue());
                }
            }
            if (strM != null && !strM.equals("log")) {
                throw new IllegalStateException("Check failed.");
            }
            if (!x44.r(strM2, "debug")) {
                throw new IllegalStateException("Check failed.");
            }
            strM3.getClass();
            return new obh(lbhVarF, mbhVarE, strM3, linkedHashMap);
        } catch (IllegalStateException e) {
            pmf.j("Unable to parse json into type Telemetry", e);
            return null;
        } catch (NullPointerException e2) {
            pmf.j("Unable to parse json into type Telemetry", e2);
            return null;
        } catch (NumberFormatException e3) {
            pmf.j("Unable to parse json into type Telemetry", e3);
            return null;
        }
    }

    public static qe7 j() {
        return qe7.f;
    }

    public static Object k(Context context, String str, String str2, File file, h86 h86Var, wr0 wr0Var) {
        PrintAttributes printAttributesBuild = new PrintAttributes.Builder().setMediaSize(PrintAttributes.MediaSize.NA_LETTER).setResolution(new PrintAttributes.Resolution("pdf", "pdf", 300, 300)).setMinMargins(new PrintAttributes.Margins(500, 500, 500, 500)).build();
        printAttributesBuild.getClass();
        return gb9.c0(h86Var.a(), new t5h(context, str, str2, printAttributesBuild, file, (tp4) null), wr0Var);
    }
}
