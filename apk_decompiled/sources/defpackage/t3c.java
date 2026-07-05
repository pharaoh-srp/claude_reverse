package defpackage;

import androidx.compose.foundation.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.design.icon.a;
import com.anthropic.claude.sessions.types.PermissionMode;
import com.pvporbit.freetype.FreeTypeConstants;

/* JADX INFO: loaded from: classes2.dex */
public abstract class t3c {
    public static final void a(ud0 ud0Var, String str, zy7 zy7Var, iqb iqbVar, boolean z, ld4 ld4Var, int i) {
        int i2;
        String str2;
        zy7 zy7Var2;
        iqb iqbVar2;
        boolean z2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1703491938);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? e18Var.f(ud0Var) : e18Var.h(ud0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            str2 = str;
            i2 |= e18Var.f(str2) ? 32 : 16;
        } else {
            str2 = str;
        }
        if ((i & 384) == 0) {
            zy7Var2 = zy7Var;
            i2 |= e18Var.h(zy7Var2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        } else {
            zy7Var2 = zy7Var;
        }
        int i3 = i2 | 27648;
        if (e18Var.Q(i3 & 1, (i3 & 9363) != 9362)) {
            long j = gm3.a(e18Var).M;
            wo1 wo1Var = lja.Q;
            ho0 ho0Var = new ho0(6.0f, true, new sz6(1));
            vve vveVarB = xve.b(16.0f);
            fqb fqbVar = fqb.E;
            iqb iqbVarK = gb9.K(b.c(xn5.V(fqbVar, vveVarB), true, null, new vue(0), null, zy7Var2, 10), 10.0f, 6.0f);
            cxe cxeVarA = axe.a(ho0Var, wo1Var, e18Var, 54);
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
            d4c.i0(e18Var, cd4.f, cxeVarA);
            d4c.i0(e18Var, cd4.e, hycVarL);
            d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var, cd4.h);
            d4c.i0(e18Var, cd4.d, iqbVarE);
            ud0 ud0Var2 = ud0.d;
            cv8.b(a.a(ud0Var, e18Var), null, androidx.compose.foundation.layout.b.o(fqbVar, 20.0f), j, e18Var, 440, 0);
            tjh.b(str2, null, j, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).g, e18Var, (i3 >> 3) & 14, 0, 131066);
            e18Var = e18Var;
            e18Var.p(true);
            iqbVar2 = fqbVar;
            z2 = true;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
            z2 = z;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new m3c(ud0Var, str, zy7Var, iqbVar2, z2, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(defpackage.ud0 r16, java.lang.String r17, defpackage.zy7 r18, defpackage.iqb r19, boolean r20, defpackage.ld4 r21, int r22, int r23) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t3c.b(ud0, java.lang.String, zy7, iqb, boolean, ld4, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:229:0x06bc  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x06d3  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x06e8  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0701  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x071a  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x072b  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x074a  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0767  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x077b  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0788  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x07fc  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x081d  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0845  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0875  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x087e  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0891  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x08bf  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0963  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x096d  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0986  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0a17  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0a31  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0a9e  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0ab5  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x0b95  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x0bba  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0bd3  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0c44  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x0c5c  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x0cd3  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x0ce8  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x0d90  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x0da7  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x0e72  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x0e8d  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x0ecb  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x0edd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(final com.anthropic.claude.code.remote.c r60, defpackage.zy7 r61, final defpackage.bz7 r62, defpackage.zy7 r63, defpackage.iqb r64, defpackage.u3c r65, defpackage.b1i r66, defpackage.ysg r67, defpackage.fk0 r68, defpackage.rc8 r69, defpackage.nf7 r70, defpackage.koi r71, defpackage.qi3 r72, java.lang.String r73, defpackage.ld4 r74, int r75) {
        /*
            Method dump skipped, instruction units count: 3892
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t3c.c(com.anthropic.claude.code.remote.c, zy7, bz7, zy7, iqb, u3c, b1i, ysg, fk0, rc8, nf7, koi, qi3, java.lang.String, ld4, int):void");
    }

    public static final void d(bz7 bz7Var, boolean z, boolean z2, PermissionMode permissionMode, zy7 zy7Var, boolean z3, zy7 zy7Var2, boolean z4, zy7 zy7Var3, zy7 zy7Var4, i4g i4gVar, iqb iqbVar, ld4 ld4Var, int i, int i2) {
        int i3;
        boolean z5;
        int i4;
        e18 e18Var;
        iqb iqbVar2;
        ud0 ud0Var;
        int i5;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-1346863615);
        if ((i & 6) == 0) {
            i3 = (e18Var2.h(bz7Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= e18Var2.g(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= e18Var2.g(z2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i3 |= e18Var2.d(permissionMode.ordinal()) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((196608 & i) == 0) {
            i3 |= e18Var2.g(z3) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= e18Var2.h(zy7Var2) ? FreeTypeConstants.FT_LOAD_COLOR : 524288;
        }
        if ((12582912 & i) == 0) {
            z5 = z4;
            i3 |= e18Var2.g(z5) ? 8388608 : 4194304;
        } else {
            z5 = z4;
        }
        if ((805306368 & i) == 0) {
            i3 |= e18Var2.h(zy7Var4) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (e18Var2.f(i4gVar) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if (e18Var2.Q(i3 & 1, ((306783379 & i3) == 306783378 && ((i4 | 48) & 19) == 18) ? false : true)) {
            fqb fqbVar = fqb.E;
            iqb iqbVarC = androidx.compose.foundation.layout.b.c(fqbVar, 1.0f);
            q64 q64VarA = p64.a(ko0.c, lja.S, e18Var2, 0);
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
            z80 z80Var = cd4.f;
            d4c.i0(e18Var2, z80Var, q64VarA);
            z80 z80Var2 = cd4.e;
            d4c.i0(e18Var2, z80Var2, hycVarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            z80 z80Var3 = cd4.g;
            d4c.i0(e18Var2, z80Var3, numValueOf);
            bx bxVar = cd4.h;
            d4c.h0(e18Var2, bxVar);
            z80 z80Var4 = cd4.d;
            d4c.i0(e18Var2, z80Var4, iqbVarE);
            knk.i(gb9.N(androidx.compose.foundation.layout.b.c(fqbVar, 1.0f), MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 12.0f, 7), null, gb9.b(16.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2), new ho0(8.0f, true, new sz6(1)), null, null, false, null, bz7Var, e18Var2, ((i3 << 27) & 1879048192) | 24966, 490);
            iuj.e(null, MTTypesetterKt.kLineSkipLimitMultiplier, gm3.a(e18Var2).v, e18Var2, 0, 3);
            wo1 wo1Var = lja.Q;
            int i6 = i3;
            iqb iqbVarL = gb9.L(ttj.m(androidx.compose.foundation.layout.b.c(fqbVar, 1.0f), i4gVar), MTTypesetterKt.kLineSkipLimitMultiplier, 8.0f, 1);
            cxe cxeVarA = axe.a(ko0.a, wo1Var, e18Var2, 48);
            int iHashCode2 = Long.hashCode(e18Var2.T);
            hyc hycVarL2 = e18Var2.l();
            iqb iqbVarE2 = kxk.E(e18Var2, iqbVarL);
            e18Var2.e0();
            if (e18Var2.S) {
                e18Var2.k(re4Var);
            } else {
                e18Var2.n0();
            }
            d4c.i0(e18Var2, z80Var, cxeVarA);
            d4c.i0(e18Var2, z80Var2, hycVarL2);
            ij0.t(iHashCode2, e18Var2, z80Var3, e18Var2, bxVar);
            d4c.i0(e18Var2, z80Var4, iqbVarE2);
            b(ud0.d, d4c.j0(R.string.ccr_sheet_add_context, e18Var2), zy7Var3, null, z5, e18Var2, 384 | ((i6 >> 9) & 57344), 8);
            e18Var = e18Var2;
            kxk.g(e18Var, new hw9(1.0f, true));
            if (z2) {
                e18Var.a0(-1958913374);
                int[] iArr = s3c.a;
                int i7 = iArr[permissionMode.ordinal()];
                if (i7 == 1) {
                    ud0Var = ud0.j1;
                } else if (i7 == 2) {
                    ud0Var = ud0.S;
                } else {
                    if (i7 != 3) {
                        wg6.i();
                        return;
                    }
                    ud0Var = ud0.E0;
                }
                int i8 = iArr[permissionMode.ordinal()];
                if (i8 == 1) {
                    i5 = R.string.ccr_mode_plan;
                } else if (i8 == 2) {
                    i5 = R.string.ccr_mode_act;
                } else {
                    if (i8 != 3) {
                        wg6.i();
                        return;
                    }
                    i5 = R.string.ccr_mode_auto;
                }
                a(ud0Var, d4c.j0(i5, e18Var), zy7Var, null, false, e18Var, 384);
                e18Var = e18Var;
                vb7.A(fqbVar, 4.0f, e18Var, false);
            } else {
                e18Var.a0(-1958643333);
                e18Var.p(false);
            }
            if (z3) {
                e18Var.a0(-1958605234);
                e18 e18Var3 = e18Var;
                b(ud0.N0, d4c.j0(R.string.ccr_sheet_start_dictation, e18Var), zy7Var2, null, false, e18Var3, (i6 >> 12) & 896, 24);
                e18Var = e18Var3;
                vb7.A(fqbVar, 4.0f, e18Var, false);
            } else {
                e18Var.a0(-1958315973);
                e18Var.p(false);
            }
            f(((i6 >> 3) & 14) | ((i6 >> 24) & 112), e18Var, zy7Var4, null, z);
            e18Var.p(true);
            e18Var.p(true);
            iqbVar2 = fqbVar;
        } else {
            e18Var = e18Var2;
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ry2(bz7Var, z, z2, permissionMode, zy7Var, z3, zy7Var2, z4, zy7Var3, zy7Var4, i4gVar, iqbVar2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(defpackage.yih r34, java.lang.String r35, defpackage.bt7 r36, defpackage.i4g r37, defpackage.iqb r38, defpackage.ld4 r39, int r40, int r41) {
        /*
            Method dump skipped, instruction units count: 477
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t3c.e(yih, java.lang.String, bt7, i4g, iqb, ld4, int, int):void");
    }

    public static final void f(int i, ld4 ld4Var, zy7 zy7Var, iqb iqbVar, boolean z) {
        int i2;
        e18 e18Var;
        iqb iqbVar2;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-909564657);
        if ((i & 6) == 0) {
            i2 = (e18Var2.g(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var2.h(zy7Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (e18Var2.Q(i3 & 1, (i3 & 147) != 146)) {
            jl3 jl3VarA = gm3.a(e18Var2);
            xo1 xo1Var = lja.K;
            fqb fqbVar = fqb.E;
            iqb iqbVarC = b.c(yfd.p(xn5.V(androidx.compose.foundation.layout.b.o(fqbVar, 40.0f), xve.a), z ? jl3VarA.c : jl3VarA.q, zni.b), z, null, new vue(0), null, zy7Var, 10);
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
            e18Var = e18Var2;
            cv8.b(a.a(ud0.o, e18Var2), d4c.j0(R.string.ccr_sheet_send, e18Var2), null, z ? jl3VarA.F : jl3VarA.O, e18Var, 8, 4);
            e18Var.p(true);
            iqbVar2 = fqbVar;
        } else {
            e18Var = e18Var2;
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new r50(i, 3, zy7Var, iqbVar2, z);
        }
    }

    public static final void g(ud0 ud0Var, String str, zy7 zy7Var, iqb iqbVar, boolean z, ld4 ld4Var, int i, int i2) {
        boolean z2;
        int i3;
        iqb iqbVar2;
        boolean z3;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-692032198);
        int i4 = i | (e18Var.f(ud0Var) ? 4 : 2) | (e18Var.f(str) ? 32 : 16) | (e18Var.h(zy7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC);
        int i5 = i4 | 3072;
        int i6 = i2 & 16;
        if (i6 != 0) {
            i3 = i4 | 27648;
            z2 = z;
        } else {
            z2 = z;
            i3 = i5 | (e18Var.g(z2) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN);
        }
        if (e18Var.Q(i3 & 1, (i3 & 9363) != 9362)) {
            boolean z4 = i6 != 0 ? true : z2;
            jl3 jl3VarA = gm3.a(e18Var);
            vve vveVarB = xve.b(20.0f);
            wo1 wo1Var = lja.Q;
            ho0 ho0Var = new ho0(8.0f, true, new sz6(1));
            fqb fqbVar = fqb.E;
            boolean z5 = z4;
            iqb iqbVarK = gb9.K(b.c(yfd.p(ez1.t(xn5.V(fqbVar, vveVarB), MTTypesetterKt.kLineSkipLimitMultiplier, jl3VarA.u, vveVarB), jl3VarA.n, vveVarB), z4, null, new vue(0), null, zy7Var, 10), 12.0f, 8.0f);
            cxe cxeVarA = axe.a(ho0Var, wo1Var, e18Var, 54);
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
            d4c.i0(e18Var, cd4.f, cxeVarA);
            d4c.i0(e18Var, cd4.e, hycVarL);
            d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var, cd4.h);
            d4c.i0(e18Var, cd4.d, iqbVarE);
            ud0 ud0Var2 = ud0.d;
            int i7 = i3;
            cv8.b(a.a(ud0Var, e18Var), null, androidx.compose.foundation.layout.b.o(fqbVar, 16.0f), jl3VarA.N, e18Var, 440, 0);
            tjh.b(str, androidx.compose.foundation.layout.b.v(fqbVar, MTTypesetterKt.kLineSkipLimitMultiplier, 140.0f, 1), jl3VarA.N, 0L, null, null, null, 0L, null, null, 0L, 5, false, 1, 0, null, ((jm3) gm3.c(e18Var).e.E).g, e18Var, ((i7 >> 3) & 14) | 48, 24960, 110584);
            e18Var = e18Var;
            e18Var.p(true);
            z3 = z5;
            iqbVar2 = fqbVar;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
            z3 = z2;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new m3c(ud0Var, str, zy7Var, iqbVar2, z3, i, i2);
        }
    }
}
