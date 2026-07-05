package defpackage;

import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class mwj {
    public static final ta4 a = new ta4(-1873203464, false, new bb4(0));
    public static final ta4 b = new ta4(1810494774, false, new bb4(1));
    public static final ta4 c = new ta4(1504860245, false, new bb4(2));
    public static final ta4 d = new ta4(-1657261851, false, new bb4(3));
    public static final ta4 e = new ta4(-1158705049, false, new bb4(4));
    public static final StackTraceElement[] f = new StackTraceElement[0];

    /* JADX WARN: Removed duplicated region for block: B:31:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final java.lang.String r15, defpackage.iqb r16, java.lang.String r17, defpackage.pz7 r18, defpackage.tkh r19, long r20, defpackage.tkh r22, long r23, defpackage.ld4 r25, final int r26, final int r27) {
        /*
            Method dump skipped, instruction units count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mwj.a(java.lang.String, iqb, java.lang.String, pz7, tkh, long, tkh, long, ld4, int, int):void");
    }

    public static final void b(final zb0 zb0Var, iqb iqbVar, final zb0 zb0Var2, final pz7 pz7Var, final tkh tkhVar, long j, final tkh tkhVar2, long j2, final boolean z, ld4 ld4Var, final int i) {
        final iqb iqbVar2;
        final long j3;
        final long j4;
        int i2;
        final long j5;
        final long j6;
        iqb iqbVar3;
        zb0Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1699302175);
        int i3 = i | (e18Var.f(zb0Var) ? 4 : 2) | 48 | (e18Var.f(zb0Var2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var.h(pz7Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE) | (e18Var.f(tkhVar) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) | 65536 | (e18Var.f(tkhVar2) ? FreeTypeConstants.FT_LOAD_COLOR : 524288) | 104857600;
        if (e18Var.Q(i3 & 1, (306783379 & i3) != 306783378)) {
            e18Var.V();
            if ((i & 1) == 0 || e18Var.A()) {
                long j7 = ((d54) e18Var.j(on4.a)).a;
                i2 = i3 & (-29818881);
                j5 = gm3.a(e18Var).O;
                j6 = j7;
                iqbVar3 = fqb.E;
            } else {
                e18Var.T();
                i2 = i3 & (-29818881);
                iqbVar3 = iqbVar;
                j6 = j;
                j5 = j2;
            }
            e18Var.q();
            e(z, tkhVar, tkhVar2, iqbVar3, fd9.q0(162578049, new rz7() { // from class: o9a
                @Override // defpackage.rz7
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    ta4 ta4VarQ0;
                    iqb iqbVar4 = (iqb) obj;
                    ld4 ld4Var2 = (ld4) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    iqbVar4.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= ((e18) ld4Var2).f(iqbVar4) ? 4 : 2;
                    }
                    e18 e18Var2 = (e18) ld4Var2;
                    if (e18Var2.Q(iIntValue & 1, (iIntValue & 19) != 18)) {
                        ta4 ta4VarQ02 = fd9.q0(1209729416, new gp(pz7Var, zb0Var, tkhVar, j6), e18Var2);
                        zb0 zb0Var3 = zb0Var2;
                        if (zb0Var3 == null) {
                            e18Var2.a0(-1359961646);
                            e18Var2.p(false);
                            ta4VarQ0 = null;
                        } else {
                            e18Var2.a0(-1359961645);
                            ta4VarQ0 = fd9.q0(-1124166858, new fj2(zb0Var3, j5, tkhVar2, 2), e18Var2);
                            e18Var2.p(false);
                        }
                        mwj.d(iqbVar4, ta4VarQ02, ta4VarQ0, e18Var2, (iIntValue & 14) | 384);
                    } else {
                        e18Var2.T();
                    }
                    return iei.a;
                }
            }, e18Var), e18Var, ((i2 >> 12) & 896) | ((i2 >> 9) & 112) | 196614 | 27648);
            iqbVar2 = iqbVar3;
            j4 = j5;
            j3 = j6;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
            j3 = j;
            j4 = j2;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pz7(iqbVar2, zb0Var2, pz7Var, tkhVar, j3, tkhVar2, j4, z, i) { // from class: p9a
                public final /* synthetic */ iqb F;
                public final /* synthetic */ zb0 G;
                public final /* synthetic */ pz7 H;
                public final /* synthetic */ tkh I;
                public final /* synthetic */ long J;
                public final /* synthetic */ tkh K;
                public final /* synthetic */ long L;
                public final /* synthetic */ boolean M;

                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP0 = x44.p0(805306369);
                    mwj.b(this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, (ld4) obj, iP0);
                    return iei.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(com.anthropic.claude.api.chat.MessageImageAsset r19, defpackage.ej7 r20, defpackage.zy7 r21, defpackage.zy7 r22, defpackage.zy7 r23, defpackage.iqb r24, java.lang.String r25, java.lang.String r26, boolean r27, boolean r28, defpackage.ld4 r29, int r30, int r31) {
        /*
            Method dump skipped, instruction units count: 411
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mwj.c(com.anthropic.claude.api.chat.MessageImageAsset, ej7, zy7, zy7, zy7, iqb, java.lang.String, java.lang.String, boolean, boolean, ld4, int, int):void");
    }

    public static final void d(iqb iqbVar, ta4 ta4Var, pz7 pz7Var, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-113503998);
        if ((i & 6) == 0) {
            i2 = (e18Var.f(iqbVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.c(MTTypesetterKt.kLineSkipLimitMultiplier) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.h(ta4Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var.h(pz7Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if (e18Var.Q(i2 & 1, (i2 & 1171) != 1170)) {
            q64 q64VarA = p64.a(ko0.c, lja.S, e18Var, 0);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVar);
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
            ta4Var.invoke(e18Var, Integer.valueOf((i2 >> 6) & 14));
            if (pz7Var != null) {
                e18Var.a0(716026387);
                kxk.g(e18Var, b.e(fqb.E, MTTypesetterKt.kLineSkipLimitMultiplier));
                sq6.B((i2 >> 9) & 14, pz7Var, e18Var, false);
            } else {
                e18Var.a0(716109994);
                e18Var.p(false);
            }
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new v76(iqbVar, ta4Var, pz7Var, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [e18, java.lang.Object, ld4] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v2, types: [e18] */
    /* JADX WARN: Type inference failed for: r0v8, types: [e18, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, ta4] */
    /* JADX WARN: Type inference failed for: r5v1, types: [ta4] */
    /* JADX WARN: Type inference failed for: r5v4, types: [ta4] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    public static final void e(final boolean z, final tkh tkhVar, final tkh tkhVar2, final iqb iqbVar, ta4 ta4Var, ld4 ld4Var, final int i) {
        int i2;
        tkh tkhVar3;
        final ?? r5;
        ?? r0;
        r7e r7eVarS;
        pz7 pz7Var;
        final ?? r52 = ta4Var;
        ?? r02 = (e18) ld4Var;
        r02.c0(-1652761407);
        if ((i & 6) == 0) {
            i2 = (r02.g(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            tkhVar3 = tkhVar;
            i2 |= r02.f(tkhVar3) ? 32 : 16;
        } else {
            tkhVar3 = tkhVar;
        }
        if ((i & 384) == 0) {
            i2 |= r02.f(tkhVar2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= r02.c(MTTypesetterKt.kLineSkipLimitMultiplier) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i & 24576) == 0) {
            i2 |= r02.f(iqbVar) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if ((196608 & i) == 0) {
            i2 |= r02.h(r52) ? 131072 : 65536;
        }
        int i3 = i2;
        if (!r02.Q(i3 & 1, (i3 & 74899) != 74898)) {
            r02.T();
            r0 = r02;
            r5 = r52;
        } else {
            if (!z) {
                r02.a0(90229353);
                r52.invoke(iqbVar, r02, Integer.valueOf((i3 >> 12) & 126));
                r02.p(false);
                r7eVarS = r02.s();
                if (r7eVarS != null) {
                    final int i4 = 1;
                    final tkh tkhVar4 = tkhVar3;
                    pz7Var = new pz7() { // from class: m9a
                        @Override // defpackage.pz7
                        public final Object invoke(Object obj, Object obj2) {
                            int i5 = i4;
                            iei ieiVar = iei.a;
                            int i6 = i;
                            switch (i5) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int iP0 = x44.p0(i6 | 1);
                                    mwj.e(z, tkhVar4, tkhVar2, iqbVar, r52, (ld4) obj, iP0);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    int iP02 = x44.p0(i6 | 1);
                                    mwj.e(z, tkhVar4, tkhVar2, iqbVar, r52, (ld4) obj, iP02);
                                    break;
                            }
                            return ieiVar;
                        }
                    };
                    r7eVarS.d = pz7Var;
                }
                return;
            }
            r02.a0(90252417);
            r02.p(false);
            int i5 = i3 >> 12;
            o5b o5bVarD = dw1.d(lja.J, false);
            int iHashCode = Long.hashCode(r02.T);
            hyc hycVarL = r02.l();
            iqb iqbVarE = kxk.E(r02, iqbVar);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            r02.e0();
            if (r02.S) {
                r02.k(re4Var);
            } else {
                r02.n0();
            }
            z80 z80Var = cd4.f;
            d4c.i0(r02, z80Var, o5bVarD);
            z80 z80Var2 = cd4.e;
            d4c.i0(r02, z80Var2, hycVarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            z80 z80Var3 = cd4.g;
            d4c.i0(r02, z80Var3, numValueOf);
            bx bxVar = cd4.h;
            d4c.h0(r02, bxVar);
            z80 z80Var4 = cd4.d;
            d4c.i0(r02, z80Var4, iqbVarE);
            fqb fqbVar = fqb.E;
            iqb iqbVarS = xn5.S(fqbVar, MTTypesetterKt.kLineSkipLimitMultiplier);
            Object objN = r02.N();
            if (objN == jd4.a) {
                objN = new e69(17);
                r02.k0(objN);
            }
            iqb iqbVarB = tjf.b(iqbVarS, false, (bz7) objN);
            q64 q64VarA = p64.a(ko0.c, lja.S, r02, 0);
            int iHashCode2 = Long.hashCode(r02.T);
            hyc hycVarL2 = r02.l();
            iqb iqbVarE2 = kxk.E(r02, iqbVarB);
            r02.e0();
            if (r02.S) {
                r02.k(re4Var);
            } else {
                r02.n0();
            }
            d4c.i0(r02, z80Var, q64VarA);
            d4c.i0(r02, z80Var2, hycVarL2);
            ij0.t(iHashCode2, r02, z80Var3, r02, bxVar);
            d4c.i0(r02, z80Var4, iqbVarE2);
            tjh.b("", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 1, null, tkhVar, r02, 6, ((i3 << 18) & 29360128) | 221184, 81918);
            kxk.g(r02, b.e(fqbVar, MTTypesetterKt.kLineSkipLimitMultiplier));
            tjh.b("", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 1, null, tkhVar2, r02, 6, ((i3 << 15) & 29360128) | 221184, 81918);
            ?? r03 = r02;
            r03.p(true);
            ?? r53 = ta4Var;
            r53.invoke(b.c(fqbVar, 1.0f), r03, Integer.valueOf((i5 & 112) | 6));
            r03.p(true);
            r0 = r03;
            r5 = r53;
        }
        r7eVarS = r0.s();
        if (r7eVarS != null) {
            final int i6 = 0;
            pz7Var = new pz7() { // from class: m9a
                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    int i52 = i6;
                    iei ieiVar = iei.a;
                    int i62 = i;
                    switch (i52) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int iP0 = x44.p0(i62 | 1);
                            mwj.e(z, tkhVar, tkhVar2, iqbVar, r5, (ld4) obj, iP0);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int iP02 = x44.p0(i62 | 1);
                            mwj.e(z, tkhVar, tkhVar2, iqbVar, r5, (ld4) obj, iP02);
                            break;
                    }
                    return ieiVar;
                }
            };
            r7eVarS.d = pz7Var;
        }
    }

    public static final String f(String str) {
        char cCharAt;
        str.getClass();
        if (str.length() == 0 || 'a' > (cCharAt = str.charAt(0)) || cCharAt >= '{') {
            return str;
        }
        return Character.toUpperCase(cCharAt) + str.substring(1);
    }

    public static gs6 g(qh9 qh9Var) {
        try {
            String strM = qh9Var.s("uuid").m();
            String strM2 = qh9Var.s("name").m();
            boolean zA = qh9Var.s("is_system").a();
            bh9 bh9VarS = qh9Var.s("load_address");
            String strM3 = bh9VarS != null ? bh9VarS.m() : null;
            bh9 bh9VarS2 = qh9Var.s("max_address");
            String strM4 = bh9VarS2 != null ? bh9VarS2.m() : null;
            bh9 bh9VarS3 = qh9Var.s("arch");
            String strM5 = bh9VarS3 != null ? bh9VarS3.m() : null;
            strM.getClass();
            strM2.getClass();
            return new gs6(strM, strM2, strM3, strM4, strM5, zA);
        } catch (IllegalStateException e2) {
            pmf.j("Unable to parse json into type BinaryImage", e2);
            return null;
        } catch (NullPointerException e3) {
            pmf.j("Unable to parse json into type BinaryImage", e3);
            return null;
        } catch (NumberFormatException e4) {
            pmf.j("Unable to parse json into type BinaryImage", e4);
            return null;
        }
    }

    public static dwi h(qh9 qh9Var) {
        try {
            bh9 bh9VarS = qh9Var.s("device_pixel_ratio");
            return new dwi(bh9VarS != null ? bh9VarS.l() : null);
        } catch (IllegalStateException e2) {
            pmf.j("Unable to parse json into type DdCls", e2);
            return null;
        } catch (NullPointerException e3) {
            pmf.j("Unable to parse json into type DdCls", e3);
            return null;
        } catch (NumberFormatException e4) {
            pmf.j("Unable to parse json into type DdCls", e4);
            return null;
        }
    }

    public static final String i(h08 h08Var) {
        sxb sxbVar;
        e92 e92VarJ = or9.y(h08Var) ? j(h08Var) : null;
        if (e92VarJ != null) {
            e92 e92VarI = o06.i(e92VarJ);
            if (e92VarI instanceof hrd) {
                or9.y(e92VarI);
                e92 e92VarB = o06.b(o06.i(e92VarI), ex.e0);
                if (e92VarB != null && (sxbVar = (sxb) a02.a.get(o06.g(e92VarB))) != null) {
                    return sxbVar.b();
                }
            } else if (e92VarI instanceof c7g) {
                int i = yz1.l;
                LinkedHashMap linkedHashMap = wgg.i;
                String strF = csk.f((c7g) e92VarI);
                sxb sxbVar2 = strF == null ? null : (sxb) linkedHashMap.get(strF);
                if (sxbVar2 != null) {
                    return sxbVar2.b();
                }
            }
        }
        return null;
    }

    public static final e92 j(e92 e92Var) {
        e92Var.getClass();
        if (!wgg.j.contains(e92Var.getName()) && !a02.d.contains(o06.i(e92Var).getName())) {
            return null;
        }
        if (e92Var instanceof hrd ? true : e92Var instanceof erd) {
            return o06.b(e92Var, p9d.i0);
        }
        if (e92Var instanceof c7g) {
            return o06.b(e92Var, p9d.j0);
        }
        return null;
    }

    public static final e92 k(e92 e92Var) {
        e92Var.getClass();
        e92 e92VarJ = j(e92Var);
        if (e92VarJ != null) {
            return e92VarJ;
        }
        int i = zz1.l;
        sxb name = e92Var.getName();
        name.getClass();
        if (wgg.e.contains(name)) {
            return o06.b(e92Var, pgg.G);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0141, code lost:
    
        if (r6 == null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0148, code lost:
    
        return !defpackage.or9.y(r12);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean l(defpackage.qqb r12, defpackage.e92 r13) {
        /*
            Method dump skipped, instruction units count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mwj.l(qqb, e92):boolean");
    }

    public static final boolean m(int i, String str) {
        char cCharAt = str.charAt(i);
        return 'A' <= cCharAt && cCharAt < '[';
    }

    public static final String n(String str) {
        str.getClass();
        StringBuilder sb = new StringBuilder(str.length());
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if ('A' <= cCharAt && cCharAt < '[') {
                cCharAt = Character.toLowerCase(cCharAt);
            }
            sb.append(cCharAt);
        }
        return sb.toString();
    }
}
