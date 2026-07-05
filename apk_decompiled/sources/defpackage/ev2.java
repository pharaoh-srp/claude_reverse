package defpackage;

import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class ev2 {
    public static final tzf a = new tzf(4.0f, d54.b(0.08f, d54.b), MTTypesetterKt.kLineSkipLimitMultiplier, (((long) Float.floatToRawIntBits(MTTypesetterKt.kLineSkipLimitMultiplier)) << 32) | (((long) Float.floatToRawIntBits(2.0f)) & 4294967295L), 48);
    public static final vve b = xve.b(24.0f);
    public static final vve c = xve.d(24.0f, 24.0f, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 12);

    public static final void a(boolean z, ta4 ta4Var, boolean z2, ta4 ta4Var2, pz7 pz7Var, boolean z3, boolean z4, ta4 ta4Var3, iqb iqbVar, ld4 ld4Var, int i) {
        int i2;
        boolean z5;
        e18 e18Var;
        ta4 ta4Var4 = ta4Var2;
        pz7 pz7Var2 = pz7Var;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(623508387);
        if ((i & 6) == 0) {
            i2 = (e18Var2.g(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var2.h(ta4Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var2.g(z2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var2.h(ta4Var4) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i & 24576) == 0) {
            i2 |= e18Var2.h(pz7Var2) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if ((196608 & i) == 0) {
            i2 |= e18Var2.g(z3) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= e18Var2.g(z4) ? FreeTypeConstants.FT_LOAD_COLOR : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= e18Var2.h(ta4Var3) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= e18Var2.f(iqbVar) ? 67108864 : 33554432;
        }
        int i3 = i2;
        if (e18Var2.Q(i3 & 1, (i3 & 38347923) != 38347922)) {
            e18Var = e18Var2;
            iqb iqbVarN = gb9.N(iqbVar, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, ((va6) n80.a((z || z2 || pz7Var2 != null) ? 8.0f : MTTypesetterKt.kLineSkipLimitMultiplier, null, "mic end padding", e18Var2, 384, 10).getValue()).E, MTTypesetterKt.kLineSkipLimitMultiplier, 11);
            xo1 xo1Var = lja.G;
            o5b o5bVarD = dw1.d(xo1Var, false);
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
            z80 z80Var = cd4.f;
            d4c.i0(e18Var, z80Var, o5bVarD);
            z80 z80Var2 = cd4.e;
            d4c.i0(e18Var, z80Var2, hycVarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            z80 z80Var3 = cd4.g;
            d4c.i0(e18Var, z80Var3, numValueOf);
            bx bxVar = cd4.h;
            d4c.h0(e18Var, bxVar);
            z80 z80Var4 = cd4.d;
            d4c.i0(e18Var, z80Var4, iqbVarE);
            csg.c(z3 || z4, "dictation microphone button", fd9.q0(782329491, new tu2(ta4Var3, 0), e18Var), e18Var, 432);
            e18Var.p(true);
            o5b o5bVarD2 = dw1.d(xo1Var, false);
            int iHashCode2 = Long.hashCode(e18Var.T);
            hyc hycVarL2 = e18Var.l();
            iqb iqbVarE2 = kxk.E(e18Var, iqbVar);
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, z80Var, o5bVarD2);
            d4c.i0(e18Var, z80Var2, hycVarL2);
            ij0.t(iHashCode2, e18Var, z80Var3, e18Var, bxVar);
            d4c.i0(e18Var, z80Var4, iqbVarE2);
            csg.c(z, "send button", fd9.q0(888093066, new tu2(ta4Var, 1), e18Var), e18Var, (i3 & 14) | 432);
            ta4Var4 = ta4Var2;
            z5 = z2;
            csg.c(z5, "stop button", fd9.q0(-1818358783, new tu2(ta4Var4, 2), e18Var), e18Var, ((i3 >> 6) & 14) | 432);
            if (pz7Var != null) {
                e18Var.a0(-1693718982);
                pz7Var2 = pz7Var;
                csg.c((z || z5) ? false : true, "bell mode button", fd9.q0(-2116090075, new vu2(0, pz7Var2), e18Var), e18Var, 432);
                e18Var.p(false);
            } else {
                pz7Var2 = pz7Var;
                e18Var.a0(-1693496030);
                e18Var.p(false);
            }
            e18Var.p(true);
        } else {
            z5 = z2;
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new nu2(z, ta4Var, z5, ta4Var4, pz7Var2, z3, z4, ta4Var3, iqbVar, i);
        }
    }

    public static final void b(dxe dxeVar, boolean z, boolean z2, boolean z3, boolean z4, ta4 ta4Var, ta4 ta4Var2, pz7 pz7Var, zy7 zy7Var, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-2062081230);
        if ((i & 6) == 0) {
            i2 = (e18Var.f(dxeVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.g(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.g(z2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var.g(z3) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i & 24576) == 0) {
            i2 |= e18Var.g(z4) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if ((196608 & i) == 0) {
            i2 |= e18Var.h(ta4Var) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i2 |= e18Var.h(ta4Var2) ? FreeTypeConstants.FT_LOAD_COLOR : 524288;
        }
        if ((i & 12582912) == 0) {
            i2 |= e18Var.h(pz7Var) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= e18Var.h(zy7Var) ? 67108864 : 33554432;
        }
        if (e18Var.Q(i2 & 1, (38347923 & i2) != 38347922)) {
            int i3 = i2;
            wd6.K(dxeVar, z || z2 || z3 || z4, null, null, null, null, zni.a, e18Var, (i2 & 14) | 1572864, 30);
            int i4 = ((i3 >> 3) & 14) | 12582912 | ((i3 >> 12) & 112) | (i3 & 896);
            int i5 = i3 >> 9;
            int i6 = i4 | (i5 & 7168) | (i5 & 57344);
            int i7 = i3 << 6;
            a(z, ta4Var, z2, ta4Var2, pz7Var, z3, z4, fd9.q0(375889659, new ow1(dxeVar, 3, zy7Var), e18Var), dxeVar.b(fqb.E, lja.R), e18Var, i6 | (458752 & i7) | (i7 & 3670016));
            e18Var = e18Var;
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new nu2(dxeVar, z, z2, z3, z4, ta4Var, ta4Var2, pz7Var, zy7Var, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:299:0x05de A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:300:0x05e0  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x066e  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x06aa  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x06ef  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x06f9  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x071d  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0727  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x0743  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x074f  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x07a9  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x09d6  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x09d8  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x09eb  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x09f5  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x0a07  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x0a11  */
    /* JADX WARN: Removed duplicated region for block: B:434:0x0a2a  */
    /* JADX WARN: Removed duplicated region for block: B:440:0x0a36  */
    /* JADX WARN: Removed duplicated region for block: B:446:0x0a54  */
    /* JADX WARN: Removed duplicated region for block: B:454:0x0a64  */
    /* JADX WARN: Removed duplicated region for block: B:457:0x0a6b  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x0a71  */
    /* JADX WARN: Removed duplicated region for block: B:462:0x0a98  */
    /* JADX WARN: Removed duplicated region for block: B:469:0x0b1f  */
    /* JADX WARN: Removed duplicated region for block: B:472:0x0b26  */
    /* JADX WARN: Removed duplicated region for block: B:476:0x0b2d  */
    /* JADX WARN: Removed duplicated region for block: B:480:0x0b3c  */
    /* JADX WARN: Removed duplicated region for block: B:484:0x0b45  */
    /* JADX WARN: Removed duplicated region for block: B:487:0x0b4e  */
    /* JADX WARN: Removed duplicated region for block: B:488:0x0b50  */
    /* JADX WARN: Removed duplicated region for block: B:494:0x0b5e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(final defpackage.hw2 r61, final com.anthropic.claude.api.common.RateLimit r62, final com.anthropic.claude.api.notice.Notice r63, final defpackage.zy7 r64, final defpackage.zy7 r65, final com.anthropic.claude.api.notice.Notice r66, final defpackage.zy7 r67, final defpackage.jgb r68, final defpackage.zy7 r69, final defpackage.zy7 r70, final defpackage.zy7 r71, final defpackage.pz7 r72, final boolean r73, final defpackage.pz7 r74, final boolean r75, final boolean r76, final boolean r77, final boolean r78, final java.lang.String r79, final defpackage.zy7 r80, final defpackage.pz7 r81, final defpackage.zy7 r82, final defpackage.szh r83, final defpackage.bz7 r84, final defpackage.zy7 r85, final defpackage.zy7 r86, final defpackage.zy7 r87, final defpackage.zy7 r88, final defpackage.bz7 r89, final defpackage.bz7 r90, final defpackage.zy7 r91, final defpackage.zy7 r92, final defpackage.bz7 r93, final boolean r94, final defpackage.zy7 r95, final defpackage.zy7 r96, final defpackage.iqb r97, final boolean r98, final java.lang.String r99, final com.anthropic.claude.api.experience.Experience r100, final defpackage.zy7 r101, final defpackage.zy7 r102, final defpackage.pz7 r103, final defpackage.pz7 r104, int r105, defpackage.va6 r106, final defpackage.zub r107, final defpackage.bt7 r108, final defpackage.j9f r109, defpackage.ld4 r110, final int r111) {
        /*
            Method dump skipped, instruction units count: 3232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ev2.c(hw2, com.anthropic.claude.api.common.RateLimit, com.anthropic.claude.api.notice.Notice, zy7, zy7, com.anthropic.claude.api.notice.Notice, zy7, jgb, zy7, zy7, zy7, pz7, boolean, pz7, boolean, boolean, boolean, boolean, java.lang.String, zy7, pz7, zy7, szh, bz7, zy7, zy7, zy7, zy7, bz7, bz7, zy7, zy7, bz7, boolean, zy7, zy7, iqb, boolean, java.lang.String, com.anthropic.claude.api.experience.Experience, zy7, zy7, pz7, pz7, int, va6, zub, bt7, j9f, ld4, int):void");
    }

    public static final void d(final pz7 pz7Var, final ta4 ta4Var, final ta4 ta4Var2, pz7 pz7Var2, int i, final ta4 ta4Var3, final pz7 pz7Var3, boolean z, final bz7 bz7Var, final sn8 sn8Var, final pz7 pz7Var4, final iqb iqbVar, final wsg wsgVar, final boolean z2, iqb iqbVar2, final va6 va6Var, tzf tzfVar, ld4 ld4Var, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        tzf tzfVar2;
        e18 e18Var;
        int i7;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-2144283725);
        if ((i2 & 6) == 0) {
            i4 = (e18Var2.h(pz7Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= e18Var2.h(ta4Var) ? 32 : 16;
        }
        int i8 = i2 & 384;
        int i9 = FreeTypeConstants.FT_LOAD_PEDANTIC;
        if (i8 == 0) {
            i4 |= e18Var2.h(ta4Var2) ? 256 : 128;
        }
        int i10 = i2 & 3072;
        int i11 = FreeTypeConstants.FT_LOAD_NO_RECURSE;
        if (i10 == 0) {
            i4 |= e18Var2.h(pz7Var2) ? 2048 : 1024;
        }
        int i12 = i2 & 24576;
        int i13 = FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        if (i12 == 0) {
            i5 = i;
            i4 |= e18Var2.d(i5) ? 16384 : 8192;
        } else {
            i5 = i;
        }
        if ((i2 & 196608) == 0) {
            i4 |= e18Var2.h(ta4Var3) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i4 |= (i2 & FreeTypeConstants.FT_LOAD_COMPUTE_METRICS) == 0 ? e18Var2.f(pz7Var3) : e18Var2.h(pz7Var3) ? FreeTypeConstants.FT_LOAD_COLOR : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i4 |= e18Var2.g(z) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i4 |= e18Var2.h(bz7Var) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i4 |= (i2 & 1073741824) == 0 ? e18Var2.f(sn8Var) : e18Var2.h(sn8Var) ? 536870912 : 268435456;
        }
        if ((i3 & 6) == 0) {
            i6 = i3 | (e18Var2.h(pz7Var4) ? 4 : 2);
        } else {
            i6 = i3;
        }
        if ((i3 & 48) == 0) {
            i6 |= e18Var2.f(iqbVar) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            if ((i3 & 512) == 0 ? e18Var2.f(wsgVar) : e18Var2.h(wsgVar)) {
                i9 = 256;
            }
            i6 |= i9;
        }
        if ((i3 & 3072) == 0) {
            if (e18Var2.g(z2)) {
                i11 = 2048;
            }
            i6 |= i11;
        }
        if ((i3 & 24576) == 0) {
            if (e18Var2.f(iqbVar2)) {
                i13 = 16384;
            }
            i6 |= i13;
        }
        if ((i3 & 196608) == 0) {
            i6 |= e18Var2.f(va6Var) ? 131072 : 65536;
        }
        if (e18Var2.Q(i4 & 1, ((i4 & 306783379) == 306783378 && ((i6 | 1572864) & 599187) == 599186) ? false : true)) {
            boolean z3 = pz7Var2 != null;
            qd4 qd4Var = qd4.E;
            qd4 qd4Var2 = qd4.F;
            qd4 qd4Var3 = sn8Var != null ? qd4.G : z ? qd4Var2 : qd4Var;
            Object objN = e18Var2.N();
            lz1 lz1Var = jd4.a;
            Object obj = objN;
            if (objN == lz1Var) {
                int[] iArr = {0};
                e18Var2.k0(iArr);
                obj = iArr;
            }
            int[] iArr2 = (int[]) obj;
            boolean zD = e18Var2.d(qd4Var3.ordinal());
            Object objN2 = e18Var2.N();
            if (zD || objN2 == lz1Var) {
                if (qd4Var3 == qd4Var2) {
                    i7 = iArr2[0] + 1;
                    iArr2[0] = i7;
                } else {
                    i7 = iArr2[0];
                }
                objN2 = Integer.valueOf(i7);
                e18Var2.k0(objN2);
            }
            final int iIntValue = ((Number) objN2).intValue();
            boolean z4 = qd4Var3 != qd4Var;
            xo1 xo1Var = lja.N;
            iqb iqbVarC = b.c(iqbVar2, 1.0f);
            final boolean z5 = z4;
            o5b o5bVarD = dw1.d(xo1Var, false);
            int iHashCode = Long.hashCode(e18Var2.T);
            hyc hycVarL = e18Var2.l();
            iqb iqbVarE = kxk.E(e18Var2, iqbVarC);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var2.e0();
            if (e18Var2.S) {
                e18Var2.k(re4Var);
            } else {
                e18Var2.n0();
            }
            d4c.i0(e18Var2, cd4.f, o5bVarD);
            d4c.i0(e18Var2, cd4.e, hycVarL);
            d4c.i0(e18Var2, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var2, cd4.h);
            d4c.i0(e18Var2, cd4.d, iqbVarE);
            Object objN3 = e18Var2.N();
            if (objN3 == lz1Var) {
                objN3 = new ph1(13);
                e18Var2.k0(objN3);
            }
            wp6 wp6VarN = gp6.n(1, (bz7) objN3);
            Object objN4 = e18Var2.N();
            if (objN4 == lz1Var) {
                objN4 = new ph1(14);
                e18Var2.k0(objN4);
            }
            d77 d77VarP = gp6.p(1, (bz7) objN4);
            final tzf tzfVar3 = a;
            wd6.M(z3, null, wp6VarN, d77VarP, null, fd9.q0(-1803549419, new wt2(pz7Var2, va6Var, tzfVar3, 0), e18Var2), e18Var2, 200064, 18);
            e18 e18Var3 = e18Var2;
            boolean z6 = !z3;
            Object objN5 = e18Var3.N();
            if (objN5 == lz1Var) {
                objN5 = new ph1(15);
                e18Var3.k0(objN5);
            }
            wp6 wp6VarN2 = gp6.n(1, (bz7) objN5);
            Object objN6 = e18Var3.N();
            if (objN6 == lz1Var) {
                objN6 = new ph1(16);
                e18Var3.k0(objN6);
            }
            final qd4 qd4Var4 = qd4Var3;
            final int i14 = i5;
            wd6.M(z6, null, wp6VarN2, gp6.p(1, (bz7) objN6), null, fd9.q0(1829230142, new rz7() { // from class: xt2
                @Override // defpackage.rz7
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    ld4 ld4Var2 = (ld4) obj3;
                    int iIntValue2 = ((Integer) obj4).intValue();
                    ((ia0) obj2).getClass();
                    e18 e18Var4 = (e18) ld4Var2;
                    if (e18Var4.Q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                        final wsg wsgVar2 = wsgVar;
                        final phg phgVarA = qhg.a(wsgVar2, e18Var4, 0);
                        q64 q64VarA = p64.a(ko0.c, lja.T, e18Var4, 48);
                        int iHashCode2 = Long.hashCode(e18Var4.T);
                        hyc hycVarL2 = e18Var4.l();
                        fqb fqbVar = fqb.E;
                        iqb iqbVarE2 = kxk.E(e18Var4, fqbVar);
                        dd4.e.getClass();
                        re4 re4Var2 = cd4.b;
                        e18Var4.e0();
                        if (e18Var4.S) {
                            e18Var4.k(re4Var2);
                        } else {
                            e18Var4.n0();
                        }
                        d4c.i0(e18Var4, cd4.f, q64VarA);
                        d4c.i0(e18Var4, cd4.e, hycVarL2);
                        d4c.i0(e18Var4, cd4.g, Integer.valueOf(iHashCode2));
                        d4c.h0(e18Var4, cd4.h);
                        d4c.i0(e18Var4, cd4.d, iqbVarE2);
                        v40.f(phgVarA.k, gb9.N(gb9.L(b.c(b.v(gb9.L(fqbVar, 16.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2), MTTypesetterKt.kLineSkipLimitMultiplier, uu1.b, 1), 1.0f), 16.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2), MTTypesetterKt.kLineSkipLimitMultiplier, 8.0f, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 13), e18Var4, 0);
                        iqb iqbVarJ = gb9.J(fqbVar, 16.0f);
                        final pz7 pz7Var5 = pz7Var;
                        final boolean z7 = z5;
                        final int i15 = i14;
                        final ta4 ta4Var4 = ta4Var3;
                        final va6 va6Var2 = va6Var;
                        final qd4 qd4Var5 = qd4Var4;
                        final iqb iqbVar3 = iqbVar;
                        final ta4 ta4Var5 = ta4Var;
                        final ta4 ta4Var6 = ta4Var2;
                        final int i16 = iIntValue;
                        final bz7 bz7Var2 = bz7Var;
                        final pz7 pz7Var6 = pz7Var3;
                        final sn8 sn8Var2 = sn8Var;
                        final pz7 pz7Var7 = pz7Var4;
                        ev2.e(iqbVarJ, va6Var2, 0L, 0L, null, tzfVar3, false, z2, fd9.q0(-1363214400, new rz7() { // from class: hu2
                            /* JADX WARN: Type inference fix 'apply assigned field type' failed
                            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
                            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                             */
                            @Override // defpackage.rz7
                            public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                s64 s64Var = (s64) obj5;
                                ld4 ld4Var3 = (ld4) obj6;
                                int iIntValue3 = ((Integer) obj7).intValue();
                                s64Var.getClass();
                                if ((iIntValue3 & 6) == 0) {
                                    iIntValue3 |= ((e18) ld4Var3).f(s64Var) ? 4 : 2;
                                }
                                e18 e18Var5 = (e18) ld4Var3;
                                if (e18Var5.Q(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                                    pz7 pz7Var8 = pz7Var5;
                                    boolean z8 = z7;
                                    wd6.H(s64Var, (pz7Var8 == null || z8) ? false : true, null, gp6.e(null, 3).a(gp6.d(null, null, 15)), gp6.f(null, 3).a(gp6.l(null, null, 15)), null, fd9.q0(1339887768, new pu2(0, pz7Var8), e18Var5), e18Var5, (iIntValue3 & 14) | 1600512, 18);
                                    fqb fqbVar2 = fqb.E;
                                    int i17 = i15;
                                    if (i17 > 0) {
                                        e18Var5.a0(1691342336);
                                        ta4Var4.invoke(e18Var5, 0);
                                        grc.z(fqbVar2, 12.0f, e18Var5, false);
                                    } else {
                                        e18Var5.a0(1691467266);
                                        e18Var5.p(false);
                                    }
                                    wlg wlgVarB = n80.b(z8 ? 0.0f : 1.0f, null, "textfield-alpha", e18Var5, 3072, 22);
                                    iqb iqbVarB = gb9.i(gb9.L(s64Var.b(fqbVar2, 1.0f, false), 16.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2), null, 3).B(z8 ? b.g(fqbVar2, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 1) : fqbVar2);
                                    boolean zF = e18Var5.f(wlgVarB);
                                    Object objN7 = e18Var5.N();
                                    lz1 lz1Var2 = jd4.a;
                                    if (zF || objN7 == lz1Var2) {
                                        objN7 = new ma0(wlgVarB, 1);
                                        e18Var5.k0(objN7);
                                    }
                                    iqb iqbVarI0 = xn5.i0(iqbVarB, (bz7) objN7);
                                    cxe cxeVarA = axe.a(ko0.a, lja.P, e18Var5, 0);
                                    int iHashCode3 = Long.hashCode(e18Var5.T);
                                    hyc hycVarL3 = e18Var5.l();
                                    iqb iqbVarE3 = kxk.E(e18Var5, iqbVarI0);
                                    dd4.e.getClass();
                                    re4 re4Var3 = cd4.b;
                                    e18Var5.e0();
                                    if (e18Var5.S) {
                                        e18Var5.k(re4Var3);
                                    } else {
                                        e18Var5.n0();
                                    }
                                    z80 z80Var = cd4.f;
                                    d4c.i0(e18Var5, z80Var, cxeVarA);
                                    z80 z80Var2 = cd4.e;
                                    d4c.i0(e18Var5, z80Var2, hycVarL3);
                                    Integer numValueOf = Integer.valueOf(iHashCode3);
                                    z80 z80Var3 = cd4.g;
                                    d4c.i0(e18Var5, z80Var3, numValueOf);
                                    bx bxVar = cd4.h;
                                    d4c.h0(e18Var5, bxVar);
                                    z80 z80Var4 = cd4.d;
                                    d4c.i0(e18Var5, z80Var4, iqbVarE3);
                                    xo1 xo1Var2 = lja.J;
                                    iqb iqbVarG = b.g(gb9.N(fqbVar2, 4.0f, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 14).B(new hw9(1.0f, true)), 32.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2);
                                    o5b o5bVarD2 = dw1.d(xo1Var2, false);
                                    int iHashCode4 = Long.hashCode(e18Var5.T);
                                    hyc hycVarL4 = e18Var5.l();
                                    iqb iqbVarE4 = kxk.E(e18Var5, iqbVarG);
                                    e18Var5.e0();
                                    if (e18Var5.S) {
                                        e18Var5.k(re4Var3);
                                    } else {
                                        e18Var5.n0();
                                    }
                                    d4c.i0(e18Var5, z80Var, o5bVarD2);
                                    d4c.i0(e18Var5, z80Var2, hycVarL4);
                                    ij0.t(iHashCode4, e18Var5, z80Var3, e18Var5, bxVar);
                                    d4c.i0(e18Var5, z80Var4, iqbVarE4);
                                    ta4Var5.invoke(e18Var5, 0);
                                    e18Var5.p(true);
                                    e18Var5.p(true);
                                    iqb iqbVarC2 = b.c(fqbVar2, 1.0f);
                                    va6 va6Var3 = va6Var2;
                                    iqb iqbVarG2 = fqbVar2;
                                    iqbVarG2 = fqbVar2;
                                    if (va6Var3 != null && i17 == 0) {
                                        iqbVarG2 = b.g(fqbVar2, va6Var3.E, MTTypesetterKt.kLineSkipLimitMultiplier, 2);
                                    }
                                    final iqb iqbVarL = gb9.L(iqbVarC2.B(iqbVarG2), 16.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2);
                                    xo1 xo1Var3 = lja.K;
                                    Object objN8 = e18Var5.N();
                                    if (objN8 == lz1Var2) {
                                        objN8 = new ph1(17);
                                        e18Var5.k0(objN8);
                                    }
                                    final ta4 ta4Var7 = ta4Var6;
                                    final int i18 = i16;
                                    final bz7 bz7Var3 = bz7Var2;
                                    final wsg wsgVar3 = wsgVar2;
                                    final pz7 pz7Var9 = pz7Var6;
                                    final phg phgVar = phgVarA;
                                    final sn8 sn8Var3 = sn8Var2;
                                    final pz7 pz7Var10 = pz7Var7;
                                    xn5.G(qd4Var5, iqbVar3, (bz7) objN8, xo1Var3, "ChatInputComposerSwap", null, fd9.q0(1612004348, new sz7() { // from class: qu2
                                        /* JADX WARN: Type inference fix 'apply assigned field type' failed
                                        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                                        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
                                        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                                        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                                         */
                                        @Override // defpackage.sz7
                                        public final Object i(Object obj8, Object obj9, Object obj10, Object obj11) {
                                            qd4 qd4Var6 = (qd4) obj9;
                                            ld4 ld4Var4 = (ld4) obj10;
                                            int iIntValue4 = ((Integer) obj11).intValue();
                                            ((c90) obj8).getClass();
                                            qd4Var6.getClass();
                                            if ((iIntValue4 & 48) == 0) {
                                                iIntValue4 |= ((e18) ld4Var4).d(qd4Var6.ordinal()) ? 32 : 16;
                                            }
                                            e18 e18Var6 = (e18) ld4Var4;
                                            if (e18Var6.Q(iIntValue4 & 1, (iIntValue4 & 145) != 144)) {
                                                int iOrdinal = qd4Var6.ordinal();
                                                if (iOrdinal != 0) {
                                                    wsg wsgVar4 = wsgVar3;
                                                    pz7 pz7Var11 = pz7Var9;
                                                    iqb iqbVar4 = iqbVarL;
                                                    phg phgVar2 = phgVar;
                                                    if (iOrdinal == 1) {
                                                        e18Var6.a0(1152266694);
                                                        e18Var6.X(-1347009159, Integer.valueOf(i18));
                                                        owj.f(bz7Var3, wsgVar4, pz7Var11, iqbVar4, null, phgVar2, null, e18Var6, 262144, 80);
                                                        e18Var6.p(false);
                                                        e18Var6.p(false);
                                                    } else {
                                                        if (iOrdinal != 2) {
                                                            throw kgh.s(e18Var6, -1347011251, false);
                                                        }
                                                        e18Var6.a0(1193010366);
                                                        Object objN9 = e18Var6.N();
                                                        sn8 sn8Var4 = sn8Var3;
                                                        lz1 lz1Var3 = jd4.a;
                                                        if (objN9 == lz1Var3) {
                                                            objN9 = mpk.P(sn8Var4);
                                                            e18Var6.k0(objN9);
                                                        }
                                                        nwb nwbVar = (nwb) objN9;
                                                        if (sn8Var4 != null) {
                                                            nwbVar.setValue(sn8Var4);
                                                        }
                                                        sn8 sn8Var5 = (sn8) nwbVar.getValue();
                                                        if (sn8Var5 == null) {
                                                            e18Var6.a0(1193610897);
                                                            e18Var6.p(false);
                                                        } else {
                                                            e18Var6.a0(1193610898);
                                                            e18Var6.X(-529616411, sn8Var5);
                                                            pz7 pz7Var12 = pz7Var10;
                                                            boolean zF2 = e18Var6.f(pz7Var12) | e18Var6.h(sn8Var5);
                                                            Object objN10 = e18Var6.N();
                                                            if (zF2 || objN10 == lz1Var3) {
                                                                objN10 = new o5(pz7Var12, 9, sn8Var5);
                                                                e18Var6.k0(objN10);
                                                            }
                                                            owj.f((bz7) objN10, wsgVar4, pz7Var11, iqbVar4, sn8Var5, phgVar2, null, e18Var6, 262144, 64);
                                                            e18Var6.p(false);
                                                            e18Var6.p(false);
                                                        }
                                                        e18Var6.p(false);
                                                    }
                                                } else {
                                                    e18Var6.a0(-1347011963);
                                                    ta4Var7.invoke(e18Var6, 0);
                                                    e18Var6.p(false);
                                                }
                                            } else {
                                                e18Var6.T();
                                            }
                                            return iei.a;
                                        }
                                    }, e18Var5), e18Var5, 1600896, 32);
                                } else {
                                    e18Var5.T();
                                }
                                return iei.a;
                            }
                        }, e18Var4), e18Var4, 100663302, 92);
                        e18Var4.p(true);
                    } else {
                        e18Var4.T();
                    }
                    return iei.a;
                }
            }, e18Var3), e18Var3, 200064, 18);
            e18Var3.p(true);
            tzfVar2 = tzfVar3;
            e18Var = e18Var3;
        } else {
            e18 e18Var4 = e18Var2;
            e18Var4.T();
            tzfVar2 = tzfVar;
            e18Var = e18Var4;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new yt2(pz7Var, ta4Var, ta4Var2, pz7Var2, i, ta4Var3, pz7Var3, z, bz7Var, sn8Var, pz7Var4, iqbVar, wsgVar, z2, iqbVar2, va6Var, tzfVar2, i2, i3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:134:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(defpackage.iqb r28, defpackage.va6 r29, long r30, long r32, defpackage.mnc r34, defpackage.tzf r35, boolean r36, final boolean r37, final defpackage.ta4 r38, defpackage.ld4 r39, final int r40, final int r41) {
        /*
            Method dump skipped, instruction units count: 535
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ev2.e(iqb, va6, long, long, mnc, tzf, boolean, boolean, ta4, ld4, int, int):void");
    }

    public static final void f(final yih yihVar, final String str, final bz7 bz7Var, final bz7 bz7Var2, final zy7 zy7Var, final bt7 bt7Var, final boolean z, final iqb iqbVar, final boolean z2, tkh tkhVar, ffh ffhVar, final int i, final zub zubVar, final j9f j9fVar, ld4 ld4Var, final int i2) {
        e18 e18Var;
        final tkh tkhVar2;
        final ffh ffhVarA;
        int i3;
        e18 e18Var2;
        tkh tkhVar3;
        e18 e18Var3 = (e18) ld4Var;
        e18Var3.c0(-1480425939);
        int i4 = i2 | (e18Var3.f(yihVar) ? 4 : 2) | (e18Var3.f(str) ? 32 : 16) | (e18Var3.h(bz7Var) ? 256 : 128) | (e18Var3.h(bz7Var2) ? 2048 : 1024) | (e18Var3.h(zy7Var) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) | (e18Var3.f(bt7Var) ? 131072 : 65536) | (e18Var3.g(z) ? FreeTypeConstants.FT_LOAD_COLOR : 524288) | (e18Var3.g(z2) ? 67108864 : 33554432) | 268435456;
        if (e18Var3.Q(i4 & 1, ((306783379 & i4) == 306783378 && ((((2 | (e18Var3.d(i) ? ' ' : (char) 16)) | (e18Var3.f(zubVar) ? (char) 256 : (char) 128)) | (e18Var3.f(j9fVar) ? (char) 2048 : (char) 1024)) & 1171) == 1170) ? false : true)) {
            e18Var3.V();
            if ((i2 & 1) == 0 || e18Var3.A()) {
                tkh tkhVar4 = (tkh) e18Var3.j(tjh.a);
                i3 = i4 & (-1879048193);
                e18Var2 = e18Var3;
                ffhVarA = vz8.A(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, ((gwa) e18Var3.j(jwa.a)).a.s, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, e18Var3, 2147483391, 4095);
                tkhVar3 = tkhVar4;
            } else {
                e18Var3.T();
                i3 = i4 & (-1879048193);
                ffhVarA = ffhVar;
                e18Var2 = e18Var3;
                tkhVar3 = tkhVar;
            }
            e18Var2.q();
            final tkh tkhVarF = tkhVar3.f(new tkh(ffhVarA.a, 0L, null, null, null, 0L, 0L, 0, 0, 0L, null, 16777214));
            boolean z3 = (i3 & 3670016) == 1048576;
            Object objN = e18Var2.N();
            if (z3 || objN == jd4.a) {
                objN = new bv2(z);
                e18Var2.k0(objN);
            }
            final bv2 bv2Var = (bv2) objN;
            e18Var = e18Var2;
            j8.c(okh.a.a(ffhVarA.k), fd9.q0(-612547859, new pz7() { // from class: ku2
                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    ld4 ld4Var2 = (ld4) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    e18 e18Var4 = (e18) ld4Var2;
                    if (e18Var4.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        final bz7 bz7Var3 = bz7Var2;
                        final ffh ffhVar2 = ffhVarA;
                        final iqb iqbVar2 = iqbVar;
                        final bt7 bt7Var2 = bt7Var;
                        final bz7 bz7Var4 = bz7Var;
                        final zy7 zy7Var2 = zy7Var;
                        final yih yihVar2 = yihVar;
                        final boolean z4 = z2;
                        final tkh tkhVar5 = tkhVarF;
                        final zub zubVar2 = zubVar;
                        final j9f j9fVar2 = j9fVar;
                        final String str2 = str;
                        final int i5 = i;
                        w5d.a(bv2Var, fd9.q0(-732739133, new pz7() { // from class: ou2
                            @Override // defpackage.pz7
                            public final Object invoke(Object obj3, Object obj4) {
                                k6e k6eVar;
                                iqb g6eVar;
                                ld4 ld4Var3 = (ld4) obj3;
                                int iIntValue2 = ((Integer) obj4).intValue();
                                e18 e18Var5 = (e18) ld4Var3;
                                if (e18Var5.Q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    bz7 bz7Var5 = bz7Var3;
                                    lz1 lz1Var = jd4.a;
                                    if (bz7Var5 == null) {
                                        e18Var5.a0(-2007504083);
                                        e18Var5.p(false);
                                        k6eVar = null;
                                    } else {
                                        e18Var5.a0(-2007504082);
                                        nwb nwbVarZ = mpk.Z(bz7Var5, e18Var5);
                                        Object objN2 = e18Var5.N();
                                        if (objN2 == lz1Var) {
                                            objN2 = new k6e(nwbVarZ);
                                            e18Var5.k0(objN2);
                                        }
                                        k6eVar = (k6e) objN2;
                                        e18Var5.p(false);
                                    }
                                    k6e k6eVar2 = k6eVar;
                                    mp9 mp9Var = mp9.g;
                                    mp9 mp9VarA = mp9.a();
                                    ffh ffhVar3 = ffhVar2;
                                    eeg eegVar = new eeg(ffhVar3.i);
                                    chh chhVar = new chh(10, 1);
                                    yih yihVar3 = yihVar2;
                                    zu2 zu2Var = new zu2(yihVar3, ffhVar3, str2, i5);
                                    iqb iqbVar3 = iqbVar2;
                                    bt7 bt7Var3 = bt7Var2;
                                    iqb iqbVarT = gb9.T(iv1.s(iqbVar3, bt7Var3), bt7Var3, e18Var5, 0);
                                    bz7 bz7Var6 = bz7Var4;
                                    if (bz7Var6 != null) {
                                        e18Var5.a0(-2006352835);
                                        final nwb nwbVarZ2 = mpk.Z(bz7Var6, e18Var5);
                                        Object objN3 = e18Var5.N();
                                        if (objN3 == lz1Var) {
                                            objN3 = new h6e() { // from class: j6e
                                                @Override // defpackage.h6e
                                                public final o5l a(o5l o5lVar) {
                                                    if (!cvk.p(o5lVar)) {
                                                        return o5lVar;
                                                    }
                                                    ArrayList arrayList = new ArrayList();
                                                    o5l o5lVarK = cvk.k(o5lVar, new bc0(2, arrayList));
                                                    ((bz7) nwbVarZ2.getValue()).invoke(arrayList);
                                                    return o5lVarK;
                                                }
                                            };
                                            e18Var5.k0(objN3);
                                        }
                                        g6eVar = new g6e((h6e) objN3);
                                        e18Var5.p(false);
                                    } else {
                                        e18Var5.a0(-2006219969);
                                        e18Var5.p(false);
                                        g6eVar = fqb.E;
                                    }
                                    iqb iqbVarB = iqbVarT.B(g6eVar);
                                    iqbVarB.getClass();
                                    ps7 ps7Var = (ps7) e18Var5.j(ve4.i);
                                    Object objN4 = e18Var5.N();
                                    if (objN4 == lz1Var) {
                                        objN4 = mpk.P(Boolean.FALSE);
                                        e18Var5.k0(objN4);
                                    }
                                    nwb nwbVar = (nwb) objN4;
                                    boolean zH = e18Var5.h(ps7Var);
                                    Object objN5 = e18Var5.N();
                                    if (zH || objN5 == lz1Var) {
                                        objN5 = new y73(ps7Var, 9, nwbVar);
                                        e18Var5.k0(objN5);
                                    }
                                    iqb iqbVarN = dch.N(iqbVarB, (bz7) objN5);
                                    zy7 zy7Var3 = zy7Var2;
                                    boolean zF = e18Var5.f(zy7Var3);
                                    Object objN6 = e18Var5.N();
                                    if (zF || objN6 == lz1Var) {
                                        objN6 = new g0(2, zy7Var3);
                                        e18Var5.k0(objN6);
                                    }
                                    iqb iqbVarD0 = d4c.d0(iqbVarN, (bz7) objN6);
                                    iqbVarD0.getClass();
                                    bg1.a(yihVar3, iqbVarD0, z4, k6eVar2, tkhVar5, mp9VarA, chhVar, zubVar2, eegVar, zu2Var, j9fVar2, e18Var5, 100663296, 4744);
                                } else {
                                    e18Var5.T();
                                }
                                return iei.a;
                            }
                        }, e18Var4), e18Var4, 48);
                    } else {
                        e18Var4.T();
                    }
                    return iei.a;
                }
            }, e18Var), e18Var, 56);
            tkhVar2 = tkhVar3;
        } else {
            e18Var = e18Var3;
            e18Var.T();
            tkhVar2 = tkhVar;
            ffhVarA = ffhVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pz7(str, bz7Var, bz7Var2, zy7Var, bt7Var, z, iqbVar, z2, tkhVar2, ffhVarA, i, zubVar, j9fVar, i2) { // from class: lu2
                public final /* synthetic */ String F;
                public final /* synthetic */ bz7 G;
                public final /* synthetic */ bz7 H;
                public final /* synthetic */ zy7 I;
                public final /* synthetic */ bt7 J;
                public final /* synthetic */ boolean K;
                public final /* synthetic */ iqb L;
                public final /* synthetic */ boolean M;
                public final /* synthetic */ tkh N;
                public final /* synthetic */ ffh O;
                public final /* synthetic */ int P;
                public final /* synthetic */ zub Q;
                public final /* synthetic */ j9f R;

                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP0 = x44.p0(12582913);
                    ev2.f(this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, this.R, (ld4) obj, iP0);
                    return iei.a;
                }
            };
        }
    }

    public static final void g(final pz7 pz7Var, final iqb iqbVar, final va6 va6Var, long j, long j2, final tzf tzfVar, mnc mncVar, ld4 ld4Var, final int i) {
        final long j3;
        final long j4;
        final mnc mncVar2;
        mnc mncVarD;
        long j5;
        pz7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1292743479);
        int i2 = i | (e18Var.h(pz7Var) ? 4 : 2) | (e18Var.f(va6Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | 9216 | (e18Var.f(tzfVar) ? 131072 : 65536) | 1572864;
        if (e18Var.Q(i2 & 1, (599187 & i2) != 599186)) {
            e18Var.V();
            if ((i & 1) == 0 || e18Var.A()) {
                long j6 = gm3.a(e18Var).n;
                long j7 = gm3.a(e18Var).M;
                mncVarD = gb9.d(MTTypesetterKt.kLineSkipLimitMultiplier, 12.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 4.0f, 5);
                j3 = j6;
                j5 = j7;
            } else {
                e18Var.T();
                j3 = j;
                j5 = j2;
                mncVarD = mncVar;
            }
            e18Var.q();
            um2 um2Var = (um2) e18Var.j(vm2.a);
            d54 d54Var = um2Var.c;
            long j8 = d54Var != null ? d54Var.a : j3;
            j4 = j5;
            qu1 qu1Var = um2Var.a;
            iqb iqbVarC = b.c(iqbVar, 1.0f);
            tzf tzfVar2 = um2Var.b;
            if (tzfVar2 == null) {
                tzfVar2 = tzfVar;
            }
            vve vveVar = b;
            pzg.a(xn5.a0(iqbVarC, vveVar, tzfVar2), vveVar, j8, j4, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, qu1Var, fd9.q0(-2052427036, new fn(um2Var, va6Var, mncVarD, pz7Var, 13), e18Var), e18Var, 12582960, 48);
            mncVar2 = mncVarD;
        } else {
            e18Var.T();
            j3 = j;
            j4 = j2;
            mncVar2 = mncVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pz7(iqbVar, va6Var, j3, j4, tzfVar, mncVar2, i) { // from class: iu2
                public final /* synthetic */ iqb F;
                public final /* synthetic */ va6 G;
                public final /* synthetic */ long H;
                public final /* synthetic */ long I;
                public final /* synthetic */ tzf J;
                public final /* synthetic */ mnc K;

                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP0 = x44.p0(49);
                    ev2.g(this.E, this.F, this.G, this.H, this.I, this.J, this.K, (ld4) obj, iP0);
                    return iei.a;
                }
            };
        }
    }

    public static final void h(boolean z, final boolean z2, zy7 zy7Var, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-318916463);
        if ((i & 6) == 0) {
            i2 = (e18Var.g(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.g(z2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.h(zy7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if (e18Var.Q(i2 & 1, (i2 & 147) != 146)) {
            final long j = gm3.a(e18Var).F;
            d4c.h(zy7Var, vz8.E(gm3.a(e18Var).c, j, e18Var, 24576), null, z, fd9.q0(821460929, new pz7() { // from class: zt2
                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    ld4 ld4Var2 = (ld4) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    e18 e18Var2 = (e18) ld4Var2;
                    if (e18Var2.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        fqb fqbVar = fqb.E;
                        if (z2) {
                            e18Var2.a0(-581070081);
                            tjd.a(b.o(fqbVar, 24.0f), j, 2.0f, 0L, 0, MTTypesetterKt.kLineSkipLimitMultiplier, e18Var2, 390, 56);
                            e18Var2.p(false);
                        } else {
                            e18Var2.a0(-580890467);
                            iv1.b(ud0.o, d4c.j0(R.string.chat_input_send_button_content_description, e18Var2), b.o(fqbVar, 20.0f), null, 0L, e18Var2, 384, 24);
                            e18Var2.p(false);
                        }
                    } else {
                        e18Var2.T();
                    }
                    return iei.a;
                }
            }, e18Var), e18Var, ((i2 >> 6) & 14) | 24576 | ((i2 << 9) & 7168), 4);
            e18Var = e18Var;
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new bv0(z, z2, zy7Var, i, 1);
        }
    }

    public static final void i(int i, ld4 ld4Var, zy7 zy7Var, boolean z) {
        int i2;
        zy7 zy7Var2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1105556156);
        if ((i & 6) == 0) {
            i2 = (e18Var.h(zy7Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.g(z) ? 32 : 16;
        }
        if (e18Var.Q(i2 & 1, (i2 & 19) != 18)) {
            zy7Var2 = zy7Var;
            d4c.h(zy7Var2, vz8.E(gm3.a(e18Var).q, gm3.a(e18Var).M, e18Var, 24576), fqb.E, false, fd9.q0(1791569388, new tp(z, 5), e18Var), e18Var, (i2 & 14) | 24576, 8);
            e18Var = e18Var;
        } else {
            zy7Var2 = zy7Var;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new lw0(zy7Var2, z, i);
        }
    }
}
