package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.design.icon.a;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class fs4 {
    public static final vve a = xve.b(24.0f);
    public static final float b = 48.0f;
    public static final tzf c = new tzf(4.0f, d54.b(0.08f, d54.b), MTTypesetterKt.kLineSkipLimitMultiplier, (((long) Float.floatToRawIntBits(MTTypesetterKt.kLineSkipLimitMultiplier)) << 32) | (((long) Float.floatToRawIntBits(2.0f)) & 4294967295L), 48);

    public static final void a(dx4 dx4Var, bz7 bz7Var, ld4 ld4Var, int i) {
        int i2;
        int i3;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1742306357);
        if ((i & 6) == 0) {
            i2 = (e18Var.g(true) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? e18Var.f(dx4Var) : e18Var.h(dx4Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.h(bz7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if (e18Var.Q(i2 & 1, (i2 & 147) != 146)) {
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (objN == lz1Var) {
                objN = mpk.P(Boolean.FALSE);
                e18Var.k0(objN);
            }
            nwb nwbVar = (nwb) objN;
            Object objN2 = e18Var.N();
            if (objN2 == lz1Var) {
                objN2 = fd9.O(im6.E, e18Var);
                e18Var.k0(objN2);
            }
            l45 l45Var = (l45) objN2;
            o5b o5bVarD = dw1.d(lja.G, false);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, fqb.E);
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
            bpc bpcVarA = a.a(ud0.d, e18Var);
            String strJ0 = d4c.j0(R.string.conway_attach, e18Var);
            Object objN3 = e18Var.N();
            if (objN3 == lz1Var) {
                objN3 = new vi4(13, nwbVar);
                e18Var.k0(objN3);
            }
            d4c.d(bpcVarA, strJ0, null, true, 0L, 20.0f, (zy7) objN3, e18Var, 1769480 | ((i2 << 9) & 7168), 20);
            boolean zBooleanValue = ((Boolean) nwbVar.getValue()).booleanValue();
            Object objN4 = e18Var.N();
            if (objN4 == lz1Var) {
                objN4 = new vi4(12, nwbVar);
                e18Var.k0(objN4);
            }
            i3 = 16;
            t30.a(zBooleanValue, (zy7) objN4, null, 0L, null, null, null, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, fd9.q0(2146965686, new bn(19, nwbVar, dx4Var, l45Var, bz7Var), e18Var), e18Var, 48, 48, 2044);
            e18Var = e18Var;
            e18Var.p(true);
        } else {
            i3 = 16;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new qq(dx4Var, bz7Var, i, i3);
        }
    }

    public static final void b(l45 l45Var, nwb nwbVar, bz7 bz7Var, bz7 bz7Var2) {
        nwbVar.setValue(Boolean.FALSE);
        gb9.D(l45Var, null, null, new t74(bz7Var, bz7Var2, (tp4) null, 7), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0254  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(java.lang.String r38, defpackage.bz7 r39, final defpackage.dx4 r40, final defpackage.bz7 r41, final boolean r42, final defpackage.zy7 r43, final java.lang.String r44, final boolean r45, final boolean r46, boolean r47, defpackage.pz7 r48, defpackage.ld4 r49, final int r50) {
        /*
            Method dump skipped, instruction units count: 756
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fs4.c(java.lang.String, bz7, dx4, bz7, boolean, zy7, java.lang.String, boolean, boolean, boolean, pz7, ld4, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0183  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(final java.lang.String r23, final defpackage.bz7 r24, final defpackage.dx4 r25, final java.util.List r26, final defpackage.bz7 r27, final defpackage.bz7 r28, final defpackage.bz7 r29, defpackage.iqb r30, final java.lang.String r31, final boolean r32, final boolean r33, final boolean r34, final defpackage.pz7 r35, defpackage.ld4 r36, int r37) {
        /*
            Method dump skipped, instruction units count: 559
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fs4.d(java.lang.String, bz7, dx4, java.util.List, bz7, bz7, bz7, iqb, java.lang.String, boolean, boolean, boolean, pz7, ld4, int):void");
    }

    public static final void e(int i, ld4 ld4Var, bz7 bz7Var, iqb iqbVar, List list) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1941489927);
        int i2 = (e18Var.f(list) ? 4 : 2) | i | (e18Var.h(bz7Var) ? 32 : 16);
        int i3 = 0;
        if (e18Var.Q(i2 & 1, (i2 & 147) != 146)) {
            ho0 ho0Var = new ho0(8.0f, true, new sz6(1));
            boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object objN = e18Var.N();
            if (z || objN == jd4.a) {
                objN = new bs4(i3, bz7Var, list);
                e18Var.k0(objN);
            }
            knk.i(iqbVar, null, null, ho0Var, null, null, false, null, (bz7) objN, e18Var, 24582, 494);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new i44(list, bz7Var, iqbVar, i, 1);
        }
    }
}
