package defpackage;

import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.pvporbit.freetype.FreeTypeConstants;

/* JADX INFO: loaded from: classes.dex */
public abstract class ldb {
    public static final qnc a = gb9.b(4.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2);
    public static final float b;
    public static final float c;
    public static final float d;
    public static final float e;

    static {
        new qnc(4.0f, 2.0f, 4.0f, 2.0f);
        b = ((Boolean) vad.a.getValue()).booleanValue() ? 12.0f : 8.0f;
        c = 8.0f;
        d = 112.0f;
        e = 280.0f;
    }

    public static final void a(final iqb iqbVar, final swb swbVar, final nwb nwbVar, final j9f j9fVar, final e0g e0gVar, final long j, final float f, final ta4 ta4Var, ld4 ld4Var, final int i) {
        rok rokVar;
        Object objQ0;
        boolean z;
        Object objQ02;
        bz7 bz7VarE;
        int i2 = 0;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(848986741);
        int i3 = i | (e18Var.f(iqbVar) ? 4 : 2) | (e18Var.f(swbVar) ? 32 : 16) | (e18Var.f(j9fVar) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE) | (e18Var.f(e0gVar) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) | (e18Var.e(j) ? 131072 : 65536) | (e18Var.c(MTTypesetterKt.kLineSkipLimitMultiplier) ? FreeTypeConstants.FT_LOAD_COLOR : 524288) | (e18Var.c(f) ? 8388608 : 4194304) | (e18Var.f(null) ? 67108864 : 33554432) | (e18Var.h(ta4Var) ? 536870912 : 268435456);
        if (e18Var.Q(i3 & 1, (i3 & 306783379) != 306783378)) {
            a6i a6iVarA0 = nai.a0(swbVar, "DropDownMenu", e18Var, (((i3 >> 3) & 14) | 48) & 126, 0);
            yig yigVarP = u00.P(asb.F, e18Var);
            yig yigVarP2 = u00.P(asb.H, e18Var);
            idb idbVar = new idb(yigVarP, i2);
            d9i d9iVar = dgj.f;
            boolean zG = a6iVarA0.g();
            rok rokVar2 = a6iVarA0.a;
            lz1 lz1Var = jd4.a;
            if (zG) {
                rokVar = rokVar2;
                e18Var.a0(1666827533);
                e18Var.p(false);
                objQ0 = rokVar.q0();
            } else {
                e18Var.a0(1666573488);
                boolean zF = e18Var.f(a6iVarA0);
                objQ0 = e18Var.N();
                if (zF || objQ0 == lz1Var) {
                    rcg rcgVarZ = fd9.Z();
                    if (rcgVarZ != null) {
                        rokVar = rokVar2;
                        bz7VarE = rcgVarZ.e();
                    } else {
                        rokVar = rokVar2;
                        bz7VarE = null;
                    }
                    rcg rcgVarK0 = fd9.k0(rcgVarZ);
                    try {
                        Object objQ03 = rokVar.q0();
                        fd9.s0(rcgVarZ, rcgVarK0, bz7VarE);
                        e18Var.k0(objQ03);
                        objQ0 = objQ03;
                    } catch (Throwable th) {
                        fd9.s0(rcgVarZ, rcgVarK0, bz7VarE);
                        throw th;
                    }
                } else {
                    rokVar = rokVar2;
                }
                e18Var.p(false);
            }
            boolean zBooleanValue = ((Boolean) objQ0).booleanValue();
            e18Var.a0(143964305);
            float f2 = zBooleanValue ? 1.0f : 0.8f;
            e18Var.p(false);
            Float fValueOf = Float.valueOf(f2);
            boolean zF2 = e18Var.f(a6iVarA0);
            Object objN = e18Var.N();
            if (zF2 || objN == lz1Var) {
                objN = mpk.w(new fe3(a6iVarA0, 4));
                e18Var.k0(objN);
            }
            boolean zBooleanValue2 = ((Boolean) ((wlg) objN).getValue()).booleanValue();
            e18Var.a0(143964305);
            float f3 = zBooleanValue2 ? 1.0f : 0.8f;
            e18Var.p(false);
            Float fValueOf2 = Float.valueOf(f3);
            boolean zF3 = e18Var.f(a6iVarA0);
            Object objN2 = e18Var.N();
            if (zF3 || objN2 == lz1Var) {
                objN2 = mpk.w(new fe3(a6iVarA0, 5));
                e18Var.k0(objN2);
            }
            v5i v5iVarV = nai.v(a6iVarA0, fValueOf, fValueOf2, (kl7) idbVar.invoke(((wlg) objN2).getValue(), e18Var, 0), d9iVar, e18Var, 0);
            idb idbVar2 = new idb(yigVarP2, 1);
            if (a6iVarA0.g()) {
                z = false;
                e18Var.a0(1666827533);
                e18Var.p(false);
                objQ02 = rokVar.q0();
            } else {
                e18Var.a0(1666573488);
                boolean zF4 = e18Var.f(a6iVarA0);
                objQ02 = e18Var.N();
                if (zF4 || objQ02 == lz1Var) {
                    rcg rcgVarZ2 = fd9.Z();
                    bz7 bz7VarE2 = rcgVarZ2 != null ? rcgVarZ2.e() : null;
                    rcg rcgVarK02 = fd9.k0(rcgVarZ2);
                    try {
                        Object objQ04 = rokVar.q0();
                        fd9.s0(rcgVarZ2, rcgVarK02, bz7VarE2);
                        e18Var.k0(objQ04);
                        objQ02 = objQ04;
                    } catch (Throwable th2) {
                        fd9.s0(rcgVarZ2, rcgVarK02, bz7VarE2);
                        throw th2;
                    }
                }
                z = false;
                e18Var.p(false);
            }
            boolean zBooleanValue3 = ((Boolean) objQ02).booleanValue();
            e18Var.a0(892761509);
            float f4 = zBooleanValue3 ? 1.0f : 0.0f;
            e18Var.p(z);
            Float fValueOf3 = Float.valueOf(f4);
            boolean zF5 = e18Var.f(a6iVarA0);
            Object objN3 = e18Var.N();
            if (zF5 || objN3 == lz1Var) {
                objN3 = mpk.w(new fe3(a6iVarA0, 6));
                e18Var.k0(objN3);
            }
            boolean zBooleanValue4 = ((Boolean) ((wlg) objN3).getValue()).booleanValue();
            e18Var.a0(892761509);
            float f5 = zBooleanValue4 ? 1.0f : 0.0f;
            e18Var.p(false);
            Float fValueOf4 = Float.valueOf(f5);
            boolean zF6 = e18Var.f(a6iVarA0);
            Object objN4 = e18Var.N();
            if (zF6 || objN4 == lz1Var) {
                objN4 = mpk.w(new fe3(a6iVarA0, 7));
                e18Var.k0(objN4);
            }
            v5i v5iVarV2 = nai.v(a6iVarA0, fValueOf3, fValueOf4, (kl7) idbVar2.invoke(((wlg) objN4).getValue(), e18Var, 0), d9iVar, e18Var, 0);
            boolean zBooleanValue5 = ((Boolean) e18Var.j(p59.a)).booleanValue();
            boolean zG2 = e18Var.g(zBooleanValue5) | e18Var.f(v5iVarV) | ((i3 & 112) == 32) | e18Var.f(v5iVarV2);
            Object objN5 = e18Var.N();
            if (zG2 || objN5 == lz1Var) {
                fk1 fk1Var = new fk1(zBooleanValue5, swbVar, nwbVar, v5iVarV, v5iVarV2);
                e18Var.k0(fk1Var);
                objN5 = fk1Var;
            }
            int i4 = i3 >> 9;
            int i5 = i3 >> 6;
            pzg.a(xn5.i0(fqb.E, (bz7) objN5), e0gVar, j, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, f, null, fd9.q0(-1463404422, new ra7(iqbVar, j9fVar, ta4Var, 17), e18Var), e18Var, (i4 & 896) | (i4 & 112) | 12582912 | (57344 & i5) | (458752 & i5) | (i5 & 3670016), 8);
            e18Var = e18Var;
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pz7(swbVar, nwbVar, j9fVar, e0gVar, j, f, ta4Var, i) { // from class: jdb
                public final /* synthetic */ swb F;
                public final /* synthetic */ nwb G;
                public final /* synthetic */ j9f H;
                public final /* synthetic */ e0g I;
                public final /* synthetic */ long J;
                public final /* synthetic */ float K;
                public final /* synthetic */ ta4 L;

                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP0 = x44.p0(385);
                    ldb.a(this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, (ld4) obj, iP0);
                    return iei.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(defpackage.zy7 r24, defpackage.ta4 r25, defpackage.e0g r26, defpackage.iqb r27, defpackage.pz7 r28, defpackage.pz7 r29, boolean r30, defpackage.ycb r31, defpackage.mnc r32, defpackage.ld4 r33, int r34, int r35) {
        /*
            Method dump skipped, instruction units count: 453
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ldb.b(zy7, ta4, e0g, iqb, pz7, pz7, boolean, ycb, mnc, ld4, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:136:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x021c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(defpackage.zy7 r24, defpackage.ta4 r25, defpackage.iqb r26, defpackage.pz7 r27, defpackage.pz7 r28, boolean r29, defpackage.ycb r30, defpackage.cdb r31, defpackage.mnc r32, defpackage.ld4 r33, int r34, int r35) {
        /*
            Method dump skipped, instruction units count: 677
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ldb.c(zy7, ta4, iqb, pz7, pz7, boolean, ycb, cdb, mnc, ld4, int, int):void");
    }

    public static final void d(pz7 pz7Var, zy7 zy7Var, iqb iqbVar, pz7 pz7Var2, pz7 pz7Var3, boolean z, ycb ycbVar, mnc mncVar, ld4 ld4Var, int i) {
        int i2;
        zy7 zy7Var2;
        pz7 pz7Var4;
        ycb ycbVar2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1325192924);
        if ((i & 6) == 0) {
            i2 = (e18Var.h(pz7Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            zy7Var2 = zy7Var;
            i2 |= e18Var.h(zy7Var2) ? 32 : 16;
        } else {
            zy7Var2 = zy7Var;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.f(iqbVar) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            pz7Var4 = pz7Var2;
            i2 |= e18Var.h(pz7Var4) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        } else {
            pz7Var4 = pz7Var2;
        }
        if ((i & 24576) == 0) {
            i2 |= e18Var.h(pz7Var3) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if ((196608 & i) == 0) {
            i2 |= e18Var.g(z) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            ycbVar2 = ycbVar;
            i2 |= e18Var.f(ycbVar2) ? FreeTypeConstants.FT_LOAD_COLOR : 524288;
        } else {
            ycbVar2 = ycbVar;
        }
        if ((12582912 & i) == 0) {
            i2 |= e18Var.f(mncVar) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= e18Var.f(null) ? 67108864 : 33554432;
        }
        if (e18Var.Q(i2 & 1, (38347923 & i2) != 38347922)) {
            iqb iqbVarI = gb9.I(b.s(b.c(androidx.compose.foundation.b.b(iqbVar, null, due.a(true, MTTypesetterKt.kLineSkipLimitMultiplier, 0L, null, false, 254), z, null, null, zy7Var2, 24), 1.0f), d, 48.0f, e, 8), mncVar);
            cxe cxeVarA = axe.a(ko0.a, lja.Q, e18Var, 48);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarI);
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
            tjh.a(((gwa) e18Var.j(jwa.a)).b.m, fd9.q0(865999929, new bv(pz7Var4, ycbVar2, z, pz7Var3, pz7Var), e18Var), e18Var, 48);
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pq(pz7Var, zy7Var, iqbVar, pz7Var2, pz7Var3, z, ycbVar, mncVar, i);
        }
    }

    public static final void e(ta4 ta4Var, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1482876964);
        if (e18Var.Q(i & 1, (i & 3) != 2)) {
            iqb iqbVarN = gb9.N(b.b(fqb.E, yb5.S, MTTypesetterKt.kLineSkipLimitMultiplier, 2), MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, b, MTTypesetterKt.kLineSkipLimitMultiplier, 11);
            o5b o5bVarD = dw1.d(lja.G, false);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarN);
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
            ta4Var.invoke(nw1.a, e18Var, 54);
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new rx0(ta4Var, i, 22);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long f(defpackage.c79 r11, defpackage.c79 r12) {
        /*
            int r0 = r12.a
            int r1 = r12.d
            int r2 = r12.a
            int r3 = r12.c
            int r4 = r12.b
            int r5 = r11.c
            int r6 = r11.b
            int r7 = r11.d
            int r8 = r11.a
            r9 = 1065353216(0x3f800000, float:1.0)
            r10 = 0
            if (r0 < r5) goto L19
        L17:
            r11 = r10
            goto L39
        L19:
            if (r3 > r8) goto L1d
            r11 = r9
            goto L39
        L1d:
            int r0 = r12.f()
            if (r0 != 0) goto L24
            goto L17
        L24:
            int r0 = java.lang.Math.max(r8, r2)
            int r11 = r11.c
            int r11 = java.lang.Math.min(r11, r3)
            int r11 = r11 + r0
            int r11 = r11 / 2
            int r11 = r11 - r2
            float r11 = (float) r11
            int r0 = r12.f()
            float r0 = (float) r0
            float r11 = r11 / r0
        L39:
            if (r4 < r7) goto L3d
        L3b:
            r9 = r10
            goto L5b
        L3d:
            if (r1 > r6) goto L40
            goto L5b
        L40:
            int r0 = r12.c()
            if (r0 != 0) goto L47
            goto L3b
        L47:
            int r0 = java.lang.Math.max(r6, r4)
            int r1 = java.lang.Math.min(r7, r1)
            int r1 = r1 + r0
            int r1 = r1 / 2
            int r1 = r1 - r4
            float r0 = (float) r1
            int r12 = r12.c()
            float r12 = (float) r12
            float r9 = r0 / r12
        L5b:
            long r11 = defpackage.yb5.e(r11, r9)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ldb.f(c79, c79):long");
    }
}
