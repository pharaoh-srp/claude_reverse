package defpackage;

import android.app.Activity;
import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class tik {
    public static final ta4 a = new ta4(-308170239, false, new hb4(2));
    public static final ta4 b = new ta4(-1242994630, false, new jb4(5));
    public static final String[] c = {"firebase_last_notification", "first_open_time", "first_visit_time", "last_deep_link_referrer", "user_id", "last_advertising_id_reset", "first_open_after_install", "lifetime_user_engagement", "session_user_engagement", "non_personalized_ads", "ga_session_number", "ga_session_id", "last_gclid", "session_number", "session_id"};
    public static final String[] d = {"_ln", "_fot", "_fvt", "_ldl", "_id", "_lair", "_fi", "_lte", "_se", "_npa", "_sno", "_sid", "_lgclid", "_sno", "_sid"};

    public static final void a(zy7 zy7Var, boolean z, iqb iqbVar, j9f j9fVar, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-882367543);
        int i2 = i | (e18Var.h(zy7Var) ? 4 : 2) | (e18Var.g(z) ? 32 : 16) | (e18Var.f(j9fVar) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE);
        if (e18Var.Q(i2 & 1, (i2 & 1171) != 1170)) {
            eli eliVar = (eli) e18Var.j(ve4.t);
            String strJ0 = d4c.j0(R.string.subscription_level_free, e18Var);
            String strJ02 = d4c.j0(R.string.onboarding_v2_subscription_free_subtitle, e18Var);
            String strJ03 = d4c.j0(R.string.onboarding_v2_plan_continue_free, e18Var);
            String strJ04 = d4c.j0(R.string.onboarding_v2_subscription_free_limits_a11y, e18Var);
            boolean zH = e18Var.h(eliVar);
            Object objN = e18Var.N();
            if (zH || objN == jd4.a) {
                objN = new mp1(eliVar, 5);
                e18Var.k0(objN);
            }
            uik.e(strJ0, strJ02, z, false, zy7Var, strJ03, (zy7) objN, strJ04, nuk.c, nuk.d, iqbVar, j9fVar, e18Var, ((i2 << 3) & 896) | 905972736 | ((i2 << 12) & 57344), (i2 >> 6) & 126);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new sq(zy7Var, z, iqbVar, j9fVar, i);
        }
    }

    public static final void b(k4d k4dVar, iqb iqbVar, ld4 ld4Var, int i) {
        iqb iqbVar2;
        fqb fqbVar;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-142847381);
        int i2 = i | (e18Var.d(k4dVar.ordinal()) ? 4 : 2) | 48;
        if (e18Var.Q(i2 & 1, (i2 & 19) != 18)) {
            xo1 xo1Var = lja.K;
            fqb fqbVar2 = fqb.E;
            iqb iqbVarL = gb9.L(b.c(fqbVar2, 1.0f), MTTypesetterKt.kLineSkipLimitMultiplier, 48.0f, 1);
            o5b o5bVarD = dw1.d(xo1Var, false);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarL);
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
            int iOrdinal = k4dVar.ordinal();
            if (iOrdinal == 0) {
                fqbVar = fqbVar2;
                e18Var.a0(736415202);
                tjd.a(null, gm3.a(e18Var).N, MTTypesetterKt.kLineSkipLimitMultiplier, 0L, 0, MTTypesetterKt.kLineSkipLimitMultiplier, e18Var, 0, 61);
                e18Var.p(false);
            } else {
                if (iOrdinal != 1) {
                    throw ebh.u(e18Var, 736413914, false);
                }
                e18Var.a0(1354143501);
                fqbVar = fqbVar2;
                tjh.b(d4c.j0(R.string.onboarding_v2_subscription_max_unavailable, e18Var), null, gm3.a(e18Var).O, 0L, null, null, null, 0L, null, new fdh(3), 0L, 0, false, 0, 0, null, (tkh) ((wk) gm3.c(e18Var).e.F).f, e18Var, 0, 0, 130042);
                e18Var = e18Var;
                e18Var.p(false);
            }
            e18Var.p(true);
            iqbVar2 = fqbVar;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ufe(k4dVar, iqbVar2, i, 12);
        }
    }

    public static final void c(final xs5 xs5Var, bz7 bz7Var, iqb iqbVar, ld4 ld4Var, int i) {
        boolean z;
        eoc eocVar = xs5Var.d;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(327378694);
        int i2 = i | (e18Var.f(xs5Var) ? 4 : 2) | (e18Var.h(bz7Var) ? 32 : 16) | (e18Var.f(iqbVar) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC);
        if (e18Var.Q(i2 & 1, (i2 & 147) != 146)) {
            final long j = gm3.a(e18Var).o;
            final long j2 = gm3.a(e18Var).v;
            iqb iqbVarJ = gb9.J(ez1.t(yfd.p(tvk.f(rkj.k(iqbVar, za9.E)), d54.b(0.07f, gm3.a(e18Var).t), gm3.b(e18Var).s), MTTypesetterKt.kLineSkipLimitMultiplier, gm3.a(e18Var).w, gm3.b(e18Var).s), 1.0f);
            o5b o5bVarD = dw1.d(lja.G, false);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarJ);
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
            e(((isc) eocVar.G).h(), gm3.a(e18Var).O, bz7Var, null, e18Var, (i2 << 3) & 896, 8);
            int iH = ((isc) eocVar.G).h();
            long j3 = gm3.a(e18Var).M;
            iqb iqbVarB = nw1.a.b();
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (objN == lz1Var) {
                objN = new z1g(25);
                e18Var.k0(objN);
            }
            iqb iqbVarB2 = tjf.b(iqbVarB, false, (bz7) objN);
            boolean zE = e18Var.e(j) | ((i2 & 14) == 4) | e18Var.e(j2);
            Object objN2 = e18Var.N();
            if (zE || objN2 == lz1Var) {
                z = true;
                bz7 bz7Var2 = new bz7() { // from class: svg
                    @Override // defpackage.bz7
                    public final Object invoke(Object obj) {
                        b52 b52Var = (b52) obj;
                        b52Var.getClass();
                        final float fIntBitsToFloat = Float.intBitsToFloat((int) (b52Var.E.g() >> 32)) / i4d.G.size();
                        final long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (b52Var.E.g() & 4294967295L)))) & 4294967295L);
                        float density = b52Var.getDensity() * 7.0f;
                        final long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(density)) << 32) | (((long) Float.floatToRawIntBits(density)) & 4294967295L);
                        final c40 c40VarA = f40.a();
                        l9e l9eVarX = d4c.x(0L, jFloatToRawIntBits);
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jFloatToRawIntBits2 >> 32));
                        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jFloatToRawIntBits2 & 4294967295L));
                        float f = l9eVarX.a;
                        float f2 = l9eVarX.b;
                        float f3 = l9eVarX.c;
                        float f4 = l9eVarX.d;
                        long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) & 4294967295L);
                        c40.c(c40VarA, new sve(f, f2, f3, f4, jFloatToRawIntBits3, jFloatToRawIntBits3, jFloatToRawIntBits3, jFloatToRawIntBits3));
                        final ksg ksgVar = new ksg(1.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 0, 0, null, 30);
                        final boolean z2 = b52Var.E.getLayoutDirection() == fu9.F;
                        final xs5 xs5Var2 = xs5Var;
                        final long j4 = j;
                        final long j5 = j2;
                        return b52Var.b(new bz7() { // from class: uvg
                            @Override // defpackage.bz7
                            public final Object invoke(Object obj2) throws Throwable {
                                float f5;
                                ib2 ib2Var;
                                float f6;
                                fj0 fj0Var;
                                long jW;
                                float f7;
                                long j6 = j4;
                                long j7 = jFloatToRawIntBits;
                                long j8 = jFloatToRawIntBits2;
                                long j9 = j5;
                                ksg ksgVar2 = ksgVar;
                                c40 c40Var = c40VarA;
                                cv9 cv9Var = (cv9) obj2;
                                cv9Var.getClass();
                                float fH = ((hsc) xs5Var2.d.H).h() + ((isc) r4.G).h();
                                if (z2) {
                                    fH = (i4d.G.size() - 1) - fH;
                                }
                                float f8 = fIntBitsToFloat;
                                float f9 = fH * f8;
                                ib2 ib2Var2 = cv9Var.E;
                                ((efe) ib2Var2.F.E).G(f9, MTTypesetterKt.kLineSkipLimitMultiplier);
                                float f10 = fH;
                                try {
                                    xd6.y(cv9Var, j6, 0L, j7, j8, null, MTTypesetterKt.kLineSkipLimitMultiplier, 242);
                                    ib2Var = ib2Var2;
                                    try {
                                        xd6.y(cv9Var, j9, 0L, j7, j8, ksgVar2, MTTypesetterKt.kLineSkipLimitMultiplier, 226);
                                        fj0Var = ib2Var.F;
                                        jW = fj0Var.w();
                                        fj0Var.p().g();
                                        try {
                                            ((efe) fj0Var.E).j(c40Var);
                                            f7 = (-f10) * f8;
                                            ((efe) ib2Var.F.E).G(f7, MTTypesetterKt.kLineSkipLimitMultiplier);
                                        } catch (Throwable th) {
                                            th = th;
                                            f6 = f9;
                                            f5 = -0.0f;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        f6 = f9;
                                        f5 = -0.0f;
                                    }
                                    try {
                                        cv9Var.a();
                                        f5 = -0.0f;
                                        try {
                                            ((efe) ib2Var.F.E).G(-f7, -0.0f);
                                            try {
                                                fj0Var.p().p();
                                                fj0Var.N(jW);
                                                ((efe) ib2Var.F.E).G(-f9, -0.0f);
                                                return iei.a;
                                            } catch (Throwable th3) {
                                                th = th3;
                                                f6 = f9;
                                                ((efe) ib2Var.F.E).G(-f6, f5);
                                                throw th;
                                            }
                                        } catch (Throwable th4) {
                                            th = th4;
                                            f6 = f9;
                                            try {
                                                fj0Var.p().p();
                                                fj0Var.N(jW);
                                                throw th;
                                            } catch (Throwable th5) {
                                                th = th5;
                                                ((efe) ib2Var.F.E).G(-f6, f5);
                                                throw th;
                                            }
                                        }
                                    } catch (Throwable th6) {
                                        f6 = f9;
                                        f5 = -0.0f;
                                        try {
                                            ((efe) ib2Var.F.E).G(-f7, -0.0f);
                                            throw th6;
                                        } catch (Throwable th7) {
                                            th = th7;
                                            fj0Var.p().p();
                                            fj0Var.N(jW);
                                            throw th;
                                        }
                                    }
                                } catch (Throwable th8) {
                                    th = th8;
                                    f5 = -0.0f;
                                    ib2Var = ib2Var2;
                                }
                            }
                        });
                    }
                };
                e18Var.k0(bz7Var2);
                objN2 = bz7Var2;
            } else {
                z = true;
            }
            e(iH, j3, null, zni.t(iqbVarB2, (bz7) objN2), e18Var, 384, 0);
            e18Var.p(z);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new tfe(xs5Var, i, bz7Var, iqbVar, 15);
        }
    }

    public static final void d(i4d i4dVar, long j, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var;
        String strN;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-1102009921);
        if ((i & 6) == 0) {
            i2 = i | (e18Var2.d(i4dVar.ordinal()) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var2.e(j) ? 32 : 16;
        }
        if (e18Var2.Q(i2 & 1, (i2 & 19) != 18)) {
            int iOrdinal = i4dVar.ordinal();
            if (iOrdinal == 0) {
                strN = vb7.n(e18Var2, -1928646467, R.string.subscription_level_free, e18Var2, false);
            } else if (iOrdinal == 1) {
                strN = vb7.n(e18Var2, -1928644324, R.string.subscription_level_pro, e18Var2, false);
            } else {
                if (iOrdinal != 2) {
                    throw ebh.u(e18Var2, -1928647294, false);
                }
                strN = vb7.n(e18Var2, -1928642212, R.string.subscription_level_max, e18Var2, false);
            }
            e18Var = e18Var2;
            tjh.b(strN, null, j, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, ((jm3) gm3.c(e18Var2).e.E).j, e18Var, (i2 << 3) & 896, 24576, 114682);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new xc9(i4dVar, j, i, 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(final int r23, final long r24, final defpackage.bz7 r26, defpackage.iqb r27, defpackage.ld4 r28, final int r29, final int r30) {
        /*
            Method dump skipped, instruction units count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tik.e(int, long, bz7, iqb, ld4, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:171:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:176:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(defpackage.zy7 r25, defpackage.iqb r26, defpackage.pz7 r27, boolean r28, defpackage.cji r29, defpackage.qi3 r30, defpackage.ld4 r31, int r32, int r33) {
        /*
            Method dump skipped, instruction units count: 801
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tik.f(zy7, iqb, pz7, boolean, cji, qi3, ld4, int, int):void");
    }

    public static zt6 g(ld4 ld4Var) {
        long j = gm3.a(ld4Var).A;
        long j2 = gm3.a(ld4Var).x;
        e0g e0gVar = gm3.b(ld4Var).j;
        qu1 qu1VarA = sf5.a(MTTypesetterKt.kLineSkipLimitMultiplier, gm3.a(ld4Var).z);
        qnc qncVar = q02.a;
        return new zt6(j, j2, e0gVar, qu1VarA, 2.0f, q02.d(gm3.a(ld4Var).z, gm3.a(ld4Var).F, gm3.a(ld4Var).z, ld4Var, 4));
    }

    public static zt6 h(ld4 ld4Var) {
        long j = gm3.a(ld4Var).q;
        long j2 = gm3.a(ld4Var).M;
        e0g e0gVar = gm3.b(ld4Var).h;
        qu1 qu1VarA = sf5.a(MTTypesetterKt.kLineSkipLimitMultiplier, gm3.a(ld4Var).v);
        qnc qncVar = q02.a;
        return new zt6(j, j2, e0gVar, qu1VarA, MTTypesetterKt.kLineSkipLimitMultiplier, q02.d(gm3.a(ld4Var).s, gm3.a(ld4Var).N, d54.b(0.5f, gm3.a(ld4Var).N), ld4Var, 4));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static zla i(qh9 qh9Var) {
        zla zlaVar;
        int i;
        String strM;
        qh9Var.getClass();
        try {
            long jK = qh9Var.s("date").k();
            cla claVarE = pik.e(qh9Var.s("application").g());
            bh9 bh9VarS = qh9Var.s("service");
            String strM2 = bh9VarS != null ? bh9VarS.m() : null;
            bh9 bh9VarS2 = qh9Var.s("version");
            String strM3 = bh9VarS2 != null ? bh9VarS2.m() : null;
            bh9 bh9VarS3 = qh9Var.s("build_version");
            String strM4 = bh9VarS3 != null ? bh9VarS3.m() : null;
            bh9 bh9VarS4 = qh9Var.s("build_id");
            String strM5 = bh9VarS4 != null ? bh9VarS4.m() : null;
            bh9 bh9VarS5 = qh9Var.s("ddtags");
            String strM6 = bh9VarS5 != null ? bh9VarS5.m() : null;
            qla qlaVarC = ljk.c(qh9Var.s("session").g());
            bh9 bh9VarS6 = qh9Var.s("source");
            int i2 = 0;
            if (bh9VarS6 != null && (strM = bh9VarS6.m()) != null) {
                int[] iArrH = sq6.H(11);
                zlaVar = null;
                try {
                    int length = iArrH.length;
                    while (i2 < length) {
                        int i3 = iArrH[i2];
                        int i4 = length;
                        if (y6a.i(i3).equals(strM)) {
                            i = i3;
                        } else {
                            i2++;
                            length = i4;
                        }
                    }
                    throw new NoSuchElementException("Array contains no element matching the predicate.");
                } catch (IllegalStateException e) {
                    e = e;
                    pmf.j("Unable to parse json into type LongTaskEvent", e);
                    return zlaVar;
                } catch (NullPointerException e2) {
                    e = e2;
                    pmf.j("Unable to parse json into type LongTaskEvent", e);
                    return zlaVar;
                } catch (NumberFormatException e3) {
                    e = e3;
                    pmf.j("Unable to parse json into type LongTaskEvent", e);
                    return zlaVar;
                }
            }
            zlaVar = null;
            i = 0;
            rla rlaVarE = vjk.e(qh9Var.s("view").g());
            bh9 bh9VarS7 = qh9Var.s("usr");
            xla xlaVarG = bh9VarS7 != null ? akk.g(bh9VarS7.g()) : zlaVar;
            bh9 bh9VarS8 = qh9Var.s("account");
            ala alaVarF = bh9VarS8 != null ? kik.f(bh9VarS8.g()) : zlaVar;
            bh9 bh9VarS9 = qh9Var.s("connectivity");
            gla glaVarD = bh9VarS9 != null ? xik.d(bh9VarS9.g()) : zlaVar;
            bh9 bh9VarS10 = qh9Var.s("display");
            nla nlaVarA = bh9VarS10 != null ? hjk.a(bh9VarS10.g()) : zlaVar;
            bh9 bh9VarS11 = qh9Var.s("synthetics");
            wla wlaVarE = bh9VarS11 != null ? zjk.e(bh9VarS11.g()) : zlaVar;
            bh9 bh9VarS12 = qh9Var.s("ci_test");
            ela elaVarC = bh9VarS12 != null ? sik.c(bh9VarS12.g()) : zlaVar;
            bh9 bh9VarS13 = qh9Var.s("os");
            sla slaVarN = bh9VarS13 != null ? wjk.n(bh9VarS13.g()) : zlaVar;
            bh9 bh9VarS14 = qh9Var.s("device");
            mla mlaVarJ = bh9VarS14 != null ? gjk.j(bh9VarS14.g()) : zlaVar;
            kla klaVarJ = cjk.j(qh9Var.s("_dd").g());
            bh9 bh9VarS15 = qh9Var.s("context");
            jla jlaVarD = bh9VarS15 != null ? bjk.d(bh9VarS15.g()) : zlaVar;
            bh9 bh9VarS16 = qh9Var.s("action");
            bla blaVarG = bh9VarS16 != null ? nik.g(bh9VarS16.g()) : zlaVar;
            bh9 bh9VarS17 = qh9Var.s("container");
            hla hlaVarC = bh9VarS17 != null ? zik.c(bh9VarS17.g()) : zlaVar;
            String strM7 = qh9Var.s("type").m();
            pla plaVarF = ijk.f(qh9Var.s("long_task").g());
            if (x44.r(strM7, "long_task")) {
                return new zla(jK, claVarE, strM2, strM3, strM4, strM5, strM6, qlaVarC, i, rlaVarE, xlaVarG, alaVarF, glaVarD, nlaVarA, wlaVarE, elaVarC, slaVarN, mlaVarJ, klaVarJ, jlaVarD, blaVarG, hlaVarC, plaVarF);
            }
            throw new IllegalStateException("Check failed.");
        } catch (IllegalStateException e4) {
            e = e4;
            zlaVar = null;
        } catch (NullPointerException e5) {
            e = e5;
            zlaVar = null;
        } catch (NumberFormatException e6) {
            e = e6;
            zlaVar = null;
        }
    }

    public static final boolean j(sw2 sw2Var) {
        sw2Var.getClass();
        return (sw2Var.l() != vw2.F || sw2Var.e() || sw2Var.g() == null) ? false : true;
    }

    public static sxb k(sxb sxbVar, String str, String str2, int i) {
        char cCharAt;
        char cCharAt2;
        Object next;
        boolean z = (i & 4) != 0;
        if ((i & 8) != 0) {
            str2 = null;
        }
        if (!sxbVar.F) {
            String strC = sxbVar.c();
            if (isg.q0(strC, str, false) && strC.length() != str.length() && ('a' > (cCharAt = strC.charAt(str.length())) || cCharAt >= '{')) {
                if (str2 != null) {
                    return sxb.e(str2.concat(bsg.R0(strC, str)));
                }
                if (!z) {
                    return sxbVar;
                }
                String strR0 = bsg.R0(strC, str);
                if (strR0.length() != 0 && mwj.m(0, strR0)) {
                    if (strR0.length() != 1 && mwj.m(1, strR0)) {
                        Iterator it = new b79(0, strR0.length() - 1, 1).iterator();
                        while (true) {
                            a79 a79Var = (a79) it;
                            if (!a79Var.G) {
                                next = null;
                                break;
                            }
                            next = a79Var.next();
                            if (!mwj.m(((Number) next).intValue(), strR0)) {
                                break;
                            }
                        }
                        Integer num = (Integer) next;
                        if (num != null) {
                            int iIntValue = num.intValue() - 1;
                            strR0 = mwj.n(strR0.substring(0, iIntValue)).concat(strR0.substring(iIntValue));
                        } else {
                            strR0 = mwj.n(strR0);
                        }
                    } else if (strR0.length() != 0 && 'A' <= (cCharAt2 = strR0.charAt(0)) && cCharAt2 < '[') {
                        strR0 = Character.toLowerCase(cCharAt2) + strR0.substring(1);
                    }
                }
                if (sxb.f(strR0)) {
                    return sxb.e(strR0);
                }
            }
        }
        return null;
    }

    public static final String l(Activity activity) {
        activity.getClass();
        String canonicalName = activity.getClass().getCanonicalName();
        return canonicalName == null ? activity.getClass().getSimpleName() : canonicalName;
    }

    public static String m(String str) {
        return q7j.b(str, c, d);
    }
}
