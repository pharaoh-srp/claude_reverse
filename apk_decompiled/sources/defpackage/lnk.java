package defpackage;

import android.view.View;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.design.icon.a;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public abstract class lnk {
    public static final ta4 a = new ta4(1561109795, false, new rb4(24));

    static {
        new ta4(-446650783, false, new sb4(10));
    }

    public static final void a(final boolean z, final zy7 zy7Var, final zy7 zy7Var2, final zy7 zy7Var3, final zy7 zy7Var4, final zy7 zy7Var5, final String str, final String str2, final zy7 zy7Var6, final boolean z2, final boolean z3, final zy7 zy7Var7, iqb iqbVar, ld4 ld4Var, int i) {
        iqb iqbVar2;
        nwb nwbVar;
        zy7Var.getClass();
        zy7Var2.getClass();
        zy7Var3.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-353929053);
        int i2 = i | (e18Var.g(z) ? 4 : 2) | (e18Var.h(zy7Var) ? 32 : 16) | (e18Var.h(zy7Var2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var.h(zy7Var4) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) | (e18Var.h(zy7Var5) ? 131072 : 65536) | (e18Var.f(str) ? FreeTypeConstants.FT_LOAD_COLOR : 524288) | (e18Var.f(str2) ? 8388608 : 4194304) | (e18Var.h(zy7Var6) ? 67108864 : 33554432) | (e18Var.g(z2) ? 536870912 : 268435456);
        if (e18Var.Q(i2 & 1, ((306783379 & i2) == 306783378 && ((((e18Var.g(z3) ? (char) 4 : (char) 2) | (e18Var.h(zy7Var7) ? ' ' : (char) 16)) | 384) & 147) == 146) ? false : true)) {
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (objN == lz1Var) {
                objN = mpk.P(Boolean.FALSE);
                e18Var.k0(objN);
            }
            nwb nwbVar2 = (nwb) objN;
            Object objN2 = e18Var.N();
            if (objN2 == lz1Var) {
                objN2 = new dy2(18, nwbVar2);
                e18Var.k0(objN2);
            }
            zy7 zy7Var8 = (zy7) objN2;
            ta4 ta4Var = fik.a;
            fqb fqbVar = fqb.E;
            ez1.e(zy7Var8, fqbVar, false, null, null, ta4Var, e18Var, 1572918, 60);
            boolean zBooleanValue = ((Boolean) nwbVar2.getValue()).booleanValue();
            Object objN3 = e18Var.N();
            if (objN3 == lz1Var) {
                nwbVar = nwbVar2;
                objN3 = new dy2(19, nwbVar);
                e18Var.k0(objN3);
            } else {
                nwbVar = nwbVar2;
            }
            final nwb nwbVar3 = nwbVar;
            j8.b(zBooleanValue, (zy7) objN3, null, (((long) Float.floatToRawIntBits(-8.0f)) << 32) | (((long) Float.floatToRawIntBits(MTTypesetterKt.kLineSkipLimitMultiplier)) & 4294967295L), null, null, null, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, fd9.q0(1961328992, new rz7() { // from class: h34
                @Override // defpackage.rz7
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    zy7 zy7Var9;
                    String str3;
                    zy7 zy7Var10;
                    ld4 ld4Var2 = (ld4) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((s64) obj).getClass();
                    e18 e18Var2 = (e18) ld4Var2;
                    if (e18Var2.Q(iIntValue & 1, (iIntValue & 17) != 16)) {
                        boolean z4 = z2;
                        nwb nwbVar4 = nwbVar3;
                        lz1 lz1Var2 = jd4.a;
                        if (z4 || (str3 = str2) == null || (zy7Var10 = zy7Var6) == null) {
                            e18Var2.a0(1217321538);
                            e18Var2.p(false);
                        } else {
                            e18Var2.a0(1216993837);
                            String strJ0 = d4c.j0(R.string.session_menu_copy_branch, e18Var2);
                            ud0 ud0Var = ud0.Y;
                            boolean zF = e18Var2.f(zy7Var10);
                            Object objN4 = e18Var2.N();
                            if (zF || objN4 == lz1Var2) {
                                objN4 = new pn(zy7Var10, nwbVar4, 7);
                                e18Var2.k0(objN4);
                            }
                            lnk.e(strJ0, str3, ud0Var, (zy7) objN4, e18Var2, 0);
                            e18Var2.p(false);
                        }
                        if (z4 || (zy7Var9 = zy7Var5) == null) {
                            e18Var2.a0(1217727266);
                            e18Var2.p(false);
                        } else {
                            e18Var2.a0(1217388994);
                            String strJ02 = d4c.j0(R.string.session_menu_change_model, e18Var2);
                            ud0 ud0Var2 = ud0.p1;
                            boolean zF2 = e18Var2.f(zy7Var9);
                            Object objN5 = e18Var2.N();
                            if (zF2 || objN5 == lz1Var2) {
                                objN5 = new pn(zy7Var9, nwbVar4, 8);
                                e18Var2.k0(objN5);
                            }
                            lnk.e(strJ02, str, ud0Var2, (zy7) objN5, e18Var2, 0);
                            e18Var2.p(false);
                        }
                        zy7 zy7Var11 = zy7Var4;
                        boolean z5 = z3;
                        if (zy7Var11 == null || z5) {
                            e18Var2.a0(1218239138);
                            e18Var2.p(false);
                        } else {
                            e18Var2.a0(1217959487);
                            String strJ03 = d4c.j0(R.string.ccr_share_session, e18Var2);
                            bpc bpcVarA = a.a(ud0.o1, e18Var2);
                            boolean zF3 = e18Var2.f(zy7Var11);
                            Object objN6 = e18Var2.N();
                            if (zF3 || objN6 == lz1Var2) {
                                objN6 = new pn(zy7Var11, nwbVar4, 9);
                                e18Var2.k0(objN6);
                            }
                            uuj.a(strJ03, bpcVarA, (zy7) objN6, null, null, false, null, null, null, null, 0, 0, e18Var2, 64, 4088);
                            e18Var2 = e18Var2;
                            e18Var2.p(false);
                        }
                        if (z4 || z5) {
                            e18Var2.a0(1219273794);
                            e18Var2.p(false);
                        } else {
                            e18Var2.a0(1218313755);
                            String strJ04 = d4c.j0(R.string.session_menu_rename, e18Var2);
                            bpc bpcVarA2 = a.a(ud0.e0, e18Var2);
                            zy7 zy7Var12 = zy7Var3;
                            boolean zF4 = e18Var2.f(zy7Var12);
                            Object objN7 = e18Var2.N();
                            if (zF4 || objN7 == lz1Var2) {
                                objN7 = new pn(zy7Var12, nwbVar4, 10);
                                e18Var2.k0(objN7);
                            }
                            e18 e18Var3 = e18Var2;
                            uuj.a(strJ04, bpcVarA2, (zy7) objN7, null, null, false, null, null, null, null, 0, 0, e18Var3, 64, 4088);
                            if (z) {
                                e18Var3.a0(1218603760);
                                String strJ05 = d4c.j0(R.string.session_menu_unarchive, e18Var3);
                                bpc bpcVarA3 = a.a(ud0.h, e18Var3);
                                zy7 zy7Var13 = zy7Var2;
                                boolean zF5 = e18Var3.f(zy7Var13);
                                Object objN8 = e18Var3.N();
                                if (zF5 || objN8 == lz1Var2) {
                                    objN8 = new pn(zy7Var13, nwbVar4, 11);
                                    e18Var3.k0(objN8);
                                }
                                uuj.a(strJ05, bpcVarA3, (zy7) objN8, null, null, false, null, null, null, null, 0, 0, e18Var3, 64, 4088);
                                e18Var2 = e18Var3;
                                e18Var2.p(false);
                            } else {
                                e18Var3.a0(1218944822);
                                String strJ06 = d4c.j0(R.string.session_menu_archive, e18Var3);
                                bpc bpcVarA4 = a.a(ud0.C1, e18Var3);
                                zy7 zy7Var14 = zy7Var;
                                boolean zF6 = e18Var3.f(zy7Var14);
                                Object objN9 = e18Var3.N();
                                if (zF6 || objN9 == lz1Var2) {
                                    objN9 = new pn(zy7Var14, nwbVar4, 12);
                                    e18Var3.k0(objN9);
                                }
                                uuj.a(strJ06, bpcVarA4, (zy7) objN9, null, null, false, null, null, null, null, 0, 0, e18Var3, 64, 4088);
                                e18Var2 = e18Var3;
                                e18Var2.p(false);
                            }
                            e18Var2.p(false);
                        }
                        zy7 zy7Var15 = zy7Var7;
                        if (zy7Var15 != null) {
                            e18Var2.a0(1219325037);
                            String strJ07 = d4c.j0(R.string.code_agent_view_in_slack, e18Var2);
                            bpc bpcVarA5 = a.a(ud0.F0, e18Var2);
                            boolean zF7 = e18Var2.f(zy7Var15);
                            Object objN10 = e18Var2.N();
                            if (zF7 || objN10 == lz1Var2) {
                                objN10 = new pn(zy7Var15, nwbVar4, 6);
                                e18Var2.k0(objN10);
                            }
                            e18 e18Var4 = e18Var2;
                            uuj.a(strJ07, bpcVarA5, (zy7) objN10, null, null, false, null, null, null, null, 0, 0, e18Var4, 64, 4088);
                            e18Var4.p(false);
                        } else {
                            e18Var2.a0(1219621986);
                            e18Var2.p(false);
                        }
                    } else {
                        e18Var2.T();
                    }
                    return iei.a;
                }
            }, e18Var), e18Var, 3120, 2036);
            e18Var = e18Var;
            iqbVar2 = fqbVar;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new s04(z, zy7Var, zy7Var2, zy7Var3, zy7Var4, zy7Var5, str, str2, zy7Var6, z2, z3, zy7Var7, iqbVar2, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final defpackage.zy7 r25, final boolean r26, defpackage.iqb r27, boolean r28, defpackage.e0g r29, defpackage.n02 r30, defpackage.mnc r31, defpackage.tkh r32, long r33, float r35, final defpackage.ta4 r36, defpackage.ld4 r37, final int r38, final int r39) {
        /*
            Method dump skipped, instruction units count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lnk.b(zy7, boolean, iqb, boolean, e0g, n02, mnc, tkh, long, float, ta4, ld4, int, int):void");
    }

    public static final void c(bz7 bz7Var, iqb iqbVar, ta4 ta4Var, ld4 ld4Var, int i) {
        int i2;
        bz7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(416851534);
        if ((i & 6) == 0) {
            i2 = (e18Var.h(bz7Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.f(iqbVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.h(ta4Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        byte b = 0;
        if (e18Var.Q(i2 & 1, (i2 & 147) != 146)) {
            View view = (View) e18Var.j(w00.f);
            nwb nwbVarZ = mpk.Z(bz7Var, e18Var);
            boolean zF = e18Var.f(view);
            Object objN = e18Var.N();
            if (zF || objN == jd4.a) {
                objN = new lhe(view, new ol5(28, nwbVarZ));
                e18Var.k0(objN);
            }
            j8.c(ve4.s.a((lhe) objN), fd9.q0(491621134, new fu2(iqbVar, ta4Var, 3, b), e18Var), e18Var, 48);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new v76(i, 26, iqbVar, bz7Var, ta4Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:166:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0100  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(defpackage.zy7 r27, defpackage.iqb r28, boolean r29, defpackage.e0g r30, defpackage.n02 r31, defpackage.mnc r32, defpackage.tkh r33, defpackage.rz7 r34, defpackage.ld4 r35, int r36, int r37) {
        /*
            Method dump skipped, instruction units count: 590
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lnk.d(zy7, iqb, boolean, e0g, n02, mnc, tkh, rz7, ld4, int, int):void");
    }

    public static final void e(String str, String str2, ud0 ud0Var, zy7 zy7Var, ld4 ld4Var, int i) {
        zy7 zy7Var2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(2037723978);
        int i2 = (e18Var.f(str) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= e18Var.f(str2) ? 32 : 16;
        }
        int i3 = i2 | (e18Var.f(ud0Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC);
        if ((i & 3072) == 0) {
            zy7Var2 = zy7Var;
            i3 |= e18Var.h(zy7Var2) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        } else {
            zy7Var2 = zy7Var;
        }
        int i4 = 1;
        if (e18Var.Q(i3 & 1, (i3 & 1171) != 1170)) {
            ldb.b(zy7Var2, fd9.q0(688726297, new ny3(str, str2, i4), e18Var), gm3.b(e18Var).f, null, null, fd9.q0(593235861, new fp(26, ud0Var), e18Var), false, null, null, e18Var, ((i3 >> 9) & 14) | 196656, 2008);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new xd(str, str2, ud0Var, zy7Var, i, 17);
        }
    }

    public static final nwb f(ylg ylgVar, ld4 ld4Var) {
        m4a m4aVar = (m4a) ((e18) ld4Var).j(tda.a);
        Object value = ylgVar.getValue();
        c4a c4aVarA = m4aVar.a();
        a4a a4aVar = a4a.H;
        im6 im6Var = im6.E;
        Object[] objArr = {ylgVar, c4aVarA, a4aVar, im6Var};
        e18 e18Var = (e18) ld4Var;
        boolean zH = e18Var.h(c4aVarA) | e18Var.d(a4aVar.ordinal()) | e18Var.h(im6Var) | e18Var.h(ylgVar);
        Object objN = e18Var.N();
        lz1 lz1Var = jd4.a;
        if (zH || objN == lz1Var) {
            mt4 mt4Var = new mt4(c4aVarA, a4aVar, im6Var, ylgVar, (tp4) null, 9);
            e18Var.k0(mt4Var);
            objN = mt4Var;
        }
        pz7 pz7Var = (pz7) objN;
        Object objN2 = e18Var.N();
        if (objN2 == lz1Var) {
            objN2 = mpk.P(value);
            e18Var.k0(objN2);
        }
        nwb nwbVar = (nwb) objN2;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 4);
        boolean zH2 = e18Var.h(pz7Var);
        Object objN3 = e18Var.N();
        if (zH2 || objN3 == lz1Var) {
            objN3 = new idg(pz7Var, nwbVar, null, 1);
            e18Var.k0(objN3);
        }
        fd9.l(objArrCopyOf, (pz7) objN3, e18Var);
        return nwbVar;
    }

    public static float g(float f, float f2, float f3, float f4, float f5) {
        return i(f, f2, Math.max(MTTypesetterKt.kLineSkipLimitMultiplier, Math.min(1.0f, f3 == f4 ? 0.0f : (f5 - f3) / (f4 - f3))));
    }

    public static byte[] h(byte[] bArr) {
        if (bArr.length != 16) {
            sz6.p("value must be a block.");
            return null;
        }
        byte[] bArr2 = new byte[16];
        for (int i = 0; i < 16; i++) {
            byte b = (byte) ((bArr[i] << 1) & 254);
            bArr2[i] = b;
            if (i < 15) {
                bArr2[i] = (byte) (((byte) ((bArr[i + 1] >> 7) & 1)) | b);
            }
        }
        bArr2[15] = (byte) (((byte) ((bArr[0] >> 7) & 135)) ^ bArr2[15]);
        return bArr2;
    }

    public static float i(float f, float f2, float f3) {
        return sq6.k(f2, f, f3, f);
    }

    public static final iqb j(iqb iqbVar, float f) {
        return iqbVar.B(new qjj(f));
    }
}
