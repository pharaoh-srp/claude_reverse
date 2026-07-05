package defpackage;

import android.animation.ValueAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.airbnb.lottie.parser.moshi.a;
import com.airbnb.lottie.parser.moshi.c;
import com.pvporbit.freetype.FreeTypeConstants;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipInputStream;
import okio.Okio;
import okio.RealBufferedSource;
import okio.RealBufferedSource$inputStream$1;

/* JADX INFO: loaded from: classes3.dex */
public abstract class jlk {
    public static final ta4 a = new ta4(-392734710, false, new pb4(25));
    public static final ta4 b = new ta4(701515094, false, new pb4(26));

    public static final void a(boolean z, zy7 zy7Var, iqb iqbVar, mxd mxdVar, final mnc mncVar, final nxd nxdVar, ta4 ta4Var, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var;
        mxd mxdVar2;
        int i3;
        mxd mxdVarD;
        boolean z2;
        mxd mxdVar3;
        zy7Var.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(61171853);
        if ((i & 6) == 0) {
            i2 = (e18Var2.g(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var2.h(zy7Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var2.f(iqbVar) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i & 24576) == 0) {
            i2 |= e18Var2.f(mncVar) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if ((196608 & i) == 0) {
            i2 |= e18Var2.d(nxdVar.ordinal()) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= e18Var2.h(ta4Var) ? FreeTypeConstants.FT_LOAD_COLOR : 524288;
        }
        if (e18Var2.Q(i2 & 1, (599187 & i2) != 599186)) {
            e18Var2.V();
            if ((i & 1) == 0 || e18Var2.A()) {
                i3 = i2 & (-7169);
                mxdVarD = fxd.d(e18Var2);
            } else {
                e18Var2.T();
                i3 = i2 & (-7169);
                mxdVarD = mxdVar;
            }
            e18Var2.q();
            boolean z3 = !ValueAnimator.areAnimatorsEnabled();
            final float f = bxd.c;
            Object objN = e18Var2.N();
            lz1 lz1Var = jd4.a;
            if (objN == lz1Var) {
                objN = Boolean.valueOf(z);
                e18Var2.k0(objN);
            }
            boolean zBooleanValue = ((Boolean) objN).booleanValue();
            Object objN2 = e18Var2.N();
            if (objN2 == lz1Var) {
                objN2 = mpk.P(zBooleanValue ? sn3.G : sn3.E);
                e18Var2.k0(objN2);
            }
            final nwb nwbVar = (nwb) objN2;
            Object objN3 = e18Var2.N();
            if (objN3 == lz1Var) {
                objN3 = mpk.P(Boolean.TRUE);
                e18Var2.k0(objN3);
            }
            nwb nwbVar2 = (nwb) objN3;
            Object objN4 = e18Var2.N();
            if (objN4 == lz1Var) {
                objN4 = vb7.g(0, e18Var2);
            }
            isc iscVar = (isc) objN4;
            Object objN5 = e18Var2.N();
            if (objN5 == lz1Var) {
                objN5 = mpk.P(Boolean.valueOf(z));
                e18Var2.k0(objN5);
            }
            nwb nwbVar3 = (nwb) objN5;
            boolean z4 = z || !((Boolean) nwbVar2.getValue()).booleanValue();
            Boolean boolValueOf = Boolean.valueOf(z);
            boolean z5 = (i3 & 14) == 4;
            Object objN6 = e18Var2.N();
            if (z5 || objN6 == lz1Var) {
                objN6 = new kk1(z, nwbVar3, iscVar, (tp4) null);
                e18Var2.k0(objN6);
            }
            fd9.i(e18Var2, (pz7) objN6, boolValueOf);
            Integer numValueOf = Integer.valueOf(iscVar.h());
            boolean zG = ((458752 & i3) == 131072) | e18Var2.g(z3);
            Object objN7 = e18Var2.N();
            if (zG || objN7 == lz1Var) {
                ln3 ln3Var = new ln3(zBooleanValue, z3, nxdVar, iscVar, nwbVar2, nwbVar, null);
                z2 = z3;
                nwbVar = nwbVar;
                e18Var2.k0(ln3Var);
                objN7 = ln3Var;
            } else {
                z2 = z3;
            }
            fd9.i(e18Var2, (pz7) objN7, numValueOf);
            Boolean boolValueOf2 = Boolean.valueOf(z4);
            boolean z6 = z4;
            boolean zG2 = e18Var2.g(z6) | e18Var2.f(mxdVarD);
            Object objN8 = e18Var2.N();
            if (zG2 || objN8 == lz1Var) {
                mxd mxdVar4 = mxdVarD;
                ku kuVar = new ku(z6, mxdVar4, nwbVar, (tp4) null, 9);
                mxdVar3 = mxdVar4;
                e18Var2.k0(kuVar);
                objN8 = kuVar;
            } else {
                mxdVar3 = mxdVarD;
            }
            fd9.i(e18Var2, (pz7) objN8, boolValueOf2);
            final mxd mxdVar5 = mxdVar3;
            final boolean z7 = z2;
            e18Var = e18Var2;
            iuj.c(z6, zy7Var, iqbVar, mxdVar5, fd9.q0(-1333837924, new rz7() { // from class: dn3
                @Override // defpackage.rz7
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    mw1 mw1Var = (mw1) obj;
                    ld4 ld4Var2 = (ld4) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    mw1Var.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= ((e18) ld4Var2).f(mw1Var) ? 4 : 2;
                    }
                    final int i4 = 1;
                    final int i5 = 0;
                    e18 e18Var3 = (e18) ld4Var2;
                    if (e18Var3.Q(iIntValue & 1, (iIntValue & 19) != 18)) {
                        final mxd mxdVar6 = mxdVar5;
                        if (mxdVar6.a() > MTTypesetterKt.kLineSkipLimitMultiplier) {
                            e18Var3.a0(672247272);
                            iqb iqbVarA = mw1Var.a(fqb.E, lja.H);
                            umg umgVar = ve4.n;
                            fu9 fu9Var = (fu9) e18Var3.j(umgVar);
                            mnc mncVar2 = mncVar;
                            iqb iqbVarN = gb9.N(iqbVarA, gb9.m(mncVar2, fu9Var), mncVar2.d(), gb9.l(mncVar2, (fu9) e18Var3.j(umgVar)), MTTypesetterKt.kLineSkipLimitMultiplier, 8);
                            int iOrdinal = nxdVar.ordinal();
                            final float f2 = f;
                            nwb nwbVar4 = nwbVar;
                            lz1 lz1Var2 = jd4.a;
                            if (iOrdinal == 0) {
                                e18Var3.a0(-1917962443);
                                boolean zC = e18Var3.c(f2) | e18Var3.f(mxdVar6);
                                Object objN9 = e18Var3.N();
                                if (zC || objN9 == lz1Var2) {
                                    objN9 = new zy7() { // from class: jn3
                                        @Override // defpackage.zy7
                                        public final Object a() {
                                            switch (i5) {
                                            }
                                            return new va6(mxdVar6.a() * f2);
                                        }
                                    };
                                    e18Var3.k0(objN9);
                                }
                                zy7 zy7Var2 = (zy7) objN9;
                                sn3 sn3Var = (sn3) nwbVar4.getValue();
                                boolean zF = e18Var3.f(mxdVar6);
                                Object objN10 = e18Var3.N();
                                if (zF || objN10 == lz1Var2) {
                                    objN10 = new kn3(mxdVar6, i5);
                                    e18Var3.k0(objN10);
                                }
                                jlk.c(zy7Var2, sn3Var, (zy7) objN10, z7, iqbVarN, e18Var3, 0);
                                e18Var3 = e18Var3;
                                e18Var3.p(false);
                            } else {
                                if (iOrdinal != 1) {
                                    throw ebh.u(e18Var3, -1917964031, false);
                                }
                                e18Var3.a0(-1917949789);
                                boolean zC2 = e18Var3.c(f2) | e18Var3.f(mxdVar6);
                                Object objN11 = e18Var3.N();
                                if (zC2 || objN11 == lz1Var2) {
                                    objN11 = new zy7() { // from class: jn3
                                        @Override // defpackage.zy7
                                        public final Object a() {
                                            switch (i4) {
                                            }
                                            return new va6(mxdVar6.a() * f2);
                                        }
                                    };
                                    e18Var3.k0(objN11);
                                }
                                zy7 zy7Var3 = (zy7) objN11;
                                sn3 sn3Var2 = (sn3) nwbVar4.getValue();
                                boolean zF2 = e18Var3.f(mxdVar6);
                                Object objN12 = e18Var3.N();
                                if (zF2 || objN12 == lz1Var2) {
                                    objN12 = new kn3(mxdVar6, i4);
                                    e18Var3.k0(objN12);
                                }
                                jlk.g(zy7Var3, sn3Var2, (zy7) objN12, iqbVarN, e18Var3, 0);
                                e18Var3.p(false);
                            }
                            e18Var3.p(false);
                        } else {
                            e18Var3.a0(673413926);
                            e18Var3.p(false);
                        }
                    } else {
                        e18Var3.T();
                    }
                    return iei.a;
                }
            }, e18Var2), null, fd9.q0(1610719262, new in3(mxdVar5, f, ta4Var, 0), e18Var2), e18Var, (i3 & 112) | 1597440 | (i3 & 896), 32);
            mxdVar2 = mxdVar5;
        } else {
            e18Var = e18Var2;
            e18Var.T();
            mxdVar2 = mxdVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new de3(z, zy7Var, iqbVar, mxdVar2, mncVar, nxdVar, ta4Var, i);
        }
    }

    public static final void b(sn3 sn3Var, zy7 zy7Var, boolean z, iqb iqbVar, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(695746243);
        if ((i & 6) == 0) {
            i2 = (e18Var.d(sn3Var.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.h(zy7Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.g(z) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var.f(iqbVar) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if (e18Var.Q(i2 & 1, (i2 & 1171) != 1170)) {
            sn3 sn3Var2 = sn3.G;
            tn3 tn3Var = sn3Var == sn3Var2 ? tn3.F : tn3.E;
            sn3 sn3Var3 = sn3.H;
            rn3 pn3Var = qn3.a;
            if (sn3Var != sn3Var3 && (sn3Var != sn3Var2 || !z)) {
                if (sn3Var == sn3Var2) {
                    pn3Var = new nn3();
                } else {
                    sn3 sn3Var4 = sn3.F;
                    if (sn3Var != sn3Var4 || !z) {
                        pn3Var = sn3Var == sn3Var4 ? on3.a : new pn3(((Number) zy7Var.a()).floatValue() * 0.5f);
                    }
                }
            }
            flk.b(tn3Var, pn3Var, iqbVar, e18Var, (i2 >> 3) & 896);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new en3(sn3Var, zy7Var, z, iqbVar, i, 0);
        }
    }

    public static final void c(zy7 zy7Var, sn3 sn3Var, zy7 zy7Var2, boolean z, iqb iqbVar, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-102685416);
        int i2 = i | (e18Var.h(zy7Var) ? 4 : 2) | (e18Var.d(sn3Var.ordinal()) ? 32 : 16) | (e18Var.h(zy7Var2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var.g(z) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE) | (e18Var.f(iqbVar) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN);
        if (e18Var.Q(i2 & 1, (i2 & 9363) != 9362)) {
            xo1 xo1Var = lja.N;
            iqb iqbVarW = xn5.W(fd9.h0(b.c(iqbVar, 1.0f), new tu(5, zy7Var)));
            long j = gm3.a(e18Var).q;
            wo8 wo8Var = zni.b;
            iqb iqbVarP = yfd.p(iqbVarW, j, wo8Var);
            Object objN = e18Var.N();
            if (objN == jd4.a) {
                objN = new it2(18);
                e18Var.k0(objN);
            }
            iqb iqbVarA = tjf.a(iqbVarP, (bz7) objN);
            o5b o5bVarD = dw1.d(xo1Var, false);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarA);
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
            nw1 nw1Var = nw1.a;
            fqb fqbVar = fqb.E;
            h((i2 >> 9) & 14, e18Var, b.w(b.e(nw1Var.a(fqbVar, xo1Var), 110.0f), lja.P, true), z);
            kxk.g(e18Var, yfd.p(b.e(b.c(fqbVar, 1.0f), 10.0f), gm3.a(e18Var).s, wo8Var));
            int i3 = i2 >> 3;
            b(sn3Var, zy7Var2, z, b.t(gb9.N(fqbVar, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 10.0f, 7), 124.0f), e18Var, (i3 & 14) | 3072 | (i3 & 112) | (i3 & 896));
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new bv(zy7Var, sn3Var, zy7Var2, z, iqbVar, i);
        }
    }

    public static final void d(j9g j9gVar, iqb iqbVar, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1570326763);
        int i2 = (e18Var.h(j9gVar) ? 4 : 2) | i | (e18Var.f(iqbVar) ? 32 : 16);
        if (e18Var.Q(i2 & 1, (i2 & 19) != 18)) {
            long j = gm3.a(e18Var).N;
            wo1 wo1Var = lja.R;
            iqb iqbVarM = b.m(iqbVar, j9gVar.d);
            cxe cxeVarA = axe.a(ko0.a, wo1Var, e18Var, 48);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarM);
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
            e18Var.a0(1212184908);
            for (i9g i9gVar : j9gVar.c) {
                float f = i9gVar.a;
                float f2 = i9gVar.b;
                fqb fqbVar = fqb.E;
                kxk.g(e18Var, b.t(fqbVar, f));
                bpc bpcVarD = u00.D(2131231195, 0, e18Var);
                hr1 hr1Var = new hr1(j, 5);
                iqb iqbVarN = sf5.N(b.e(b.t(fqbVar, 100.0f * f2), 36.0f * f2), MTTypesetterKt.kLineSkipLimitMultiplier, i9gVar.d, 1);
                boolean zF = e18Var.f(i9gVar);
                Object objN = e18Var.N();
                if (zF || objN == jd4.a) {
                    objN = new v0(29, i9gVar);
                    e18Var.k0(objN);
                }
                xn5.N(bpcVarD, null, xn5.i0(iqbVarN, (bz7) objN), null, null, MTTypesetterKt.kLineSkipLimitMultiplier, hr1Var, e18Var, 56, 56);
                j = j;
            }
            e18Var.p(false);
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new kn(j9gVar, iqbVar, i, 24);
        }
    }

    public static final void e(tkh tkhVar, ote oteVar, iqb iqbVar, ta4 ta4Var, ld4 ld4Var, int i) {
        int i2;
        tkhVar.getClass();
        oteVar.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1123311190);
        if ((i & 6) == 0) {
            i2 = (e18Var.f(tkhVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.f(oteVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.f(iqbVar) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var.h(ta4Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if (e18Var.Q(i2 & 1, (i2 & 1171) != 1170)) {
            tjh.a(tkhVar, fd9.q0(-1128108647, new cua(iqbVar, oteVar, ta4Var, 0, (byte) 0), e18Var), e18Var, (i2 & 14) | 48);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new bg6(i, 7, tkhVar, oteVar, iqbVar, ta4Var, false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(defpackage.jz0 r19, defpackage.iqb r20, defpackage.tkh r21, defpackage.s6a r22, defpackage.lt9 r23, defpackage.xta r24, defpackage.pz7 r25, defpackage.ld4 r26, int r27, int r28) {
        /*
            Method dump skipped, instruction units count: 601
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jlk.f(jz0, iqb, tkh, s6a, lt9, xta, pz7, ld4, int, int):void");
    }

    public static final void g(zy7 zy7Var, sn3 sn3Var, zy7 zy7Var2, iqb iqbVar, ld4 ld4Var, int i) {
        sn3 sn3Var2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1131664435);
        int i2 = i | (e18Var.h(zy7Var) ? 4 : 2) | (e18Var.d(sn3Var.ordinal()) ? 32 : 16) | (e18Var.h(zy7Var2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var.f(iqbVar) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE);
        if (e18Var.Q(i2 & 1, (i2 & 1171) != 1170)) {
            xo1 xo1Var = lja.N;
            iqb iqbVarW = xn5.W(fd9.h0(b.c(iqbVar, 1.0f), new tu(5, zy7Var)));
            Object objN = e18Var.N();
            if (objN == jd4.a) {
                objN = new it2(17);
                e18Var.k0(objN);
            }
            iqb iqbVarA = tjf.a(iqbVarW, (bz7) objN);
            o5b o5bVarD = dw1.d(xo1Var, false);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarA);
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
            sn3Var2 = sn3Var;
            dng.b(gm3.a(e18Var).a, gb9.N(b.w(fqb.E, lja.R, true), MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 10.0f, 7), 36.0f, m8f.F, sn3Var2 == sn3.G ? null : zy7Var2, e18Var, 3504, 0);
            e18Var.p(true);
        } else {
            sn3Var2 = sn3Var;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new fn(zy7Var, sn3Var2, zy7Var2, iqbVar, i, 16);
        }
    }

    public static final void h(int i, ld4 ld4Var, iqb iqbVar, boolean z) {
        int i2;
        e18 e18Var;
        e18 e18Var2;
        final float fFloatValue;
        e18 e18Var3 = (e18) ld4Var;
        e18Var3.c0(-222868371);
        if ((i & 6) == 0) {
            i2 = (e18Var3.g(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var3.f(iqbVar) ? 32 : 16;
        }
        if (e18Var3.Q(i2 & 1, (i2 & 19) != 18)) {
            boolean zBooleanValue = ((Boolean) e18Var3.j(p59.a)).booleanValue();
            Object objN = e18Var3.N();
            lz1 lz1Var = jd4.a;
            if (objN == lz1Var) {
                objN = new j9g(zBooleanValue ? 0L : h1e.F.i());
                e18Var3.k0(objN);
            }
            final j9g j9gVar = (j9g) objN;
            cz5 cz5Var = (cz5) e18Var3.j(ve4.h);
            final float fQ0 = cz5Var.q0(j9gVar.d);
            if (z) {
                e18Var3.a0(548241031);
                Object objN2 = e18Var3.N();
                if (objN2 == lz1Var) {
                    objN2 = Float.valueOf(j9gVar.b);
                    e18Var3.k0(objN2);
                }
                fFloatValue = ((Number) objN2).floatValue();
                e18Var3.p(false);
                e18Var2 = e18Var3;
            } else {
                e18Var3.a0(548308797);
                int iQ0 = (int) ((fQ0 / cz5Var.q0(22.0f)) * 1000.0f);
                b29 b29VarR = gb9.R("clawd-sky", e18Var3, 0);
                float f = j9gVar.b;
                e18Var2 = e18Var3;
                fFloatValue = ((Number) gb9.j(b29VarR, f, f + 1.0f, kxk.z(kxk.N(iQ0, 0, wi6.d, 2), fhe.E, 4), "clawd-sky-phase", e18Var2, 28680, 0).G.getValue()).floatValue();
                e18Var2.p(false);
            }
            e18 e18Var4 = e18Var2;
            xn5.H(xn5.W(b.e(b.c(iqbVar, 1.0f), 36.0f)), lja.J, false, fd9.q0(-648603433, new rz7() { // from class: fn3
                @Override // defpackage.rz7
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    qw1 qw1Var = (qw1) obj;
                    ld4 ld4Var2 = (ld4) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    qw1Var.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= ((e18) ld4Var2).f(qw1Var) ? 4 : 2;
                    }
                    e18 e18Var5 = (e18) ld4Var2;
                    if (e18Var5.Q(iIntValue & 1, (iIntValue & 19) != 18)) {
                        float fC = qw1Var.c();
                        j9g j9gVar2 = j9gVar;
                        int iMax = Math.max(2, ((int) (fC / j9gVar2.d)) + 2);
                        for (final int i3 = 0; i3 < iMax; i3++) {
                            boolean zD = e18Var5.d(i3);
                            final float f2 = fQ0;
                            boolean zC = zD | e18Var5.c(f2);
                            final float f3 = fFloatValue;
                            boolean zC2 = zC | e18Var5.c(f3);
                            Object objN3 = e18Var5.N();
                            if (zC2 || objN3 == jd4.a) {
                                objN3 = new bz7() { // from class: hn3
                                    @Override // defpackage.bz7
                                    public final Object invoke(Object obj4) {
                                        ((cz5) obj4).getClass();
                                        float f4 = i3;
                                        float f5 = f2;
                                        return new y69(((long) mwa.L((f4 * f5) - ((f3 % 1.0f) * f5))) << 32);
                                    }
                                };
                                e18Var5.k0(objN3);
                            }
                            jlk.d(j9gVar2, sf5.L(fqb.E, (bz7) objN3), e18Var5, 0);
                        }
                    } else {
                        e18Var5.T();
                    }
                    return iei.a;
                }
            }, e18Var2), e18Var4, 3120, 4);
            e18Var = e18Var4;
        } else {
            e18Var = e18Var3;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new gn3(i, iqbVar, z);
        }
    }

    public static si7 i(ContentResolver contentResolver, Uri uri) {
        Object hreVar;
        Object hreVar2;
        Object hreVar3;
        Cursor cursorQuery;
        Throwable th;
        int columnIndex;
        int columnIndex2;
        String str;
        contentResolver.getClass();
        uri.getClass();
        if (!x44.r(uri.getScheme(), "file")) {
            try {
                hreVar2 = contentResolver.getType(uri);
            } catch (Throwable th2) {
                hreVar2 = new hre(th2);
            }
            if (hreVar2 instanceof hre) {
                hreVar2 = null;
            }
            String strC = (String) hreVar2;
            if (strC == null) {
                List list = xah.a;
                xah.e(6, ij0.k("FileInfo.fromContentUri: null MIME → extension fallback. scheme=", uri.getScheme(), ", authority=", uri.getAuthority()), null, null);
                String lastPathSegment = uri.getLastPathSegment();
                if (lastPathSegment == null) {
                    lastPathSegment = "";
                }
                strC = ikb.c(lastPathSegment, "application/octet-stream");
            }
            String str2 = strC;
            String str3 = null;
            try {
                cursorQuery = contentResolver.query(uri, null, null, null, null);
            } catch (Throwable th3) {
                th = th3;
                str3 = str2;
            }
            try {
                if (cursorQuery != null) {
                    try {
                        columnIndex = cursorQuery.getColumnIndex("_display_name");
                        columnIndex2 = cursorQuery.getColumnIndex("_size");
                    } catch (Throwable th4) {
                        th = th4;
                        str3 = str2;
                    }
                    try {
                        if (!cursorQuery.moveToFirst() || columnIndex == -1) {
                            List list2 = xah.a;
                            xah.e(6, "FileInfo.fromContentUri: query returned no rows or missing columns. scheme=" + uri.getScheme() + ", authority=" + uri.getAuthority() + ", mime=" + str2, null, null);
                            cursorQuery.close();
                        } else {
                            String string = cursorQuery.getString(columnIndex);
                            if (string == null) {
                                try {
                                    List list3 = xah.a;
                                    xah.e(6, "FileInfo.fromContentUri: null DISPLAY_NAME → lastPathSegment fallback. scheme=" + uri.getScheme() + ", authority=" + uri.getAuthority() + ", mime=" + str2, null, null);
                                    String lastPathSegment2 = uri.getLastPathSegment();
                                    str = lastPathSegment2 != null ? lastPathSegment2 : "file";
                                } catch (Throwable th5) {
                                    th = th5;
                                    str3 = str2;
                                    throw th;
                                }
                            } else {
                                str = string;
                            }
                            str3 = str2;
                            si7 si7Var = new si7(uri, str, columnIndex2 != -1 ? cursorQuery.getLong(columnIndex2) : 0L, str3);
                            cursorQuery.close();
                            hreVar3 = si7Var;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        th = th;
                    }
                    th = th;
                    try {
                        throw th;
                    } catch (Throwable th7) {
                        wd6.Z(cursorQuery, th);
                        throw th7;
                    }
                }
                str3 = str2;
                hreVar3 = null;
            } catch (Throwable th8) {
                th = th8;
                hreVar3 = new hre(th);
            }
            Throwable thA = jre.a(hreVar3);
            if (thA != null) {
                List list4 = xah.a;
                xah.e(6, kgh.q(kgh.r("FileInfo.fromContentUri: provider threw ", thA.getClass().getSimpleName(), ". scheme=", uri.getScheme(), ", authority="), uri.getAuthority(), ", mime=", str3), null, null);
                return null;
            }
            si7 si7Var2 = (si7) hreVar3;
            if (si7Var2 == null) {
                List list5 = xah.a;
                StringBuilder sbR = kgh.r("FileInfo.fromContentUri: query() returned null. scheme=", uri.getScheme(), ", authority=", uri.getAuthority(), ", mime=");
                sbR.append(str3);
                xah.e(6, sbR.toString(), null, null);
            }
            return si7Var2;
        }
        try {
            hreVar = t9e.A(uri);
        } catch (Throwable th9) {
            hreVar = new hre(th9);
        }
        if (hreVar instanceof hre) {
            hreVar = null;
        }
        File file = (File) hreVar;
        if (file != null) {
            if (!file.exists()) {
                file = null;
            }
            if (file != null) {
                String name = file.getName();
                name.getClass();
                long length = file.length();
                String name2 = file.getName();
                name2.getClass();
                return new si7(uri, name, length, ikb.c(name2, "application/octet-stream"));
            }
        }
        return null;
    }

    public static int j(String str) {
        for (int i : sq6.H(4)) {
            if (sq6.h(i).equals(str)) {
                return i;
            }
        }
        pmf.h("Array contains no element matching the predicate.");
        return 0;
    }

    public static tbh k(qh9 qh9Var) {
        try {
            bh9 bh9VarS = qh9Var.s("architecture");
            String strM = bh9VarS != null ? bh9VarS.m() : null;
            bh9 bh9VarS2 = qh9Var.s("brand");
            String strM2 = bh9VarS2 != null ? bh9VarS2.m() : null;
            bh9 bh9VarS3 = qh9Var.s("model");
            String strM3 = bh9VarS3 != null ? bh9VarS3.m() : null;
            bh9 bh9VarS4 = qh9Var.s("logical_cpu_count");
            Number numberL = bh9VarS4 != null ? bh9VarS4.l() : null;
            bh9 bh9VarS5 = qh9Var.s("total_ram");
            Number numberL2 = bh9VarS5 != null ? bh9VarS5.l() : null;
            bh9 bh9VarS6 = qh9Var.s("is_low_ram");
            return new tbh(strM, strM2, strM3, numberL, numberL2, bh9VarS6 != null ? Boolean.valueOf(bh9VarS6.a()) : null);
        } catch (IllegalStateException e) {
            pmf.j("Unable to parse json into type Device", e);
            return null;
        } catch (NullPointerException e2) {
            pmf.j("Unable to parse json into type Device", e2);
            return null;
        } catch (NumberFormatException e3) {
            pmf.j("Unable to parse json into type Device", e3);
            return null;
        }
    }

    public static int l(int i) {
        return i >>> 3;
    }

    public static int m(int i) {
        return i & 7;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x011f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object n(android.content.Context r16, defpackage.jna r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, defpackage.vp4 r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jlk.n(android.content.Context, jna, java.lang.String, java.lang.String, java.lang.String, java.lang.String, vp4):java.lang.Object");
    }

    public static final vna o(Context context, jna jnaVar, final String str) {
        vna vnaVar;
        if (!(jnaVar instanceof jna)) {
            wg6.i();
            return null;
        }
        final int i = 1;
        final int i2 = 0;
        if (x44.r(str, "__LottieInternalDefaultCacheKey__")) {
            final int i3 = jnaVar.a;
            HashMap map = fna.a;
            final String strG = ij0.g(i3, (context.getResources().getConfiguration().uiMode & 48) == 32 ? "_night_" : "_day_", new StringBuilder("rawRes"));
            final WeakReference weakReference = new WeakReference(context);
            final Context applicationContext = context.getApplicationContext();
            Callable callable = new Callable() { // from class: dna
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    int i4 = i3;
                    Context context2 = (Context) weakReference.get();
                    if (context2 == null) {
                        context2 = applicationContext;
                    }
                    String str2 = strG;
                    bna bnaVarA = str2 == null ? null : cna.b.a(str2);
                    if (bnaVarA != null) {
                        return new tna(bnaVarA);
                    }
                    try {
                        RealBufferedSource realBufferedSource = new RealBufferedSource(Okio.g(context2.getResources().openRawResource(i4)));
                        if (fna.c(realBufferedSource, fna.c).booleanValue()) {
                            ZipInputStream zipInputStream = new ZipInputStream(new RealBufferedSource$inputStream$1(realBufferedSource));
                            try {
                                return fna.b(context2, zipInputStream, str2);
                            } finally {
                                zpi.b(zipInputStream);
                            }
                        }
                        if (!fna.c(realBufferedSource, fna.d).booleanValue()) {
                            String[] strArr = a.I;
                            return fna.a(new c(realBufferedSource), str2, true);
                        }
                        try {
                            RealBufferedSource realBufferedSource2 = new RealBufferedSource(Okio.g(new GZIPInputStream(new RealBufferedSource$inputStream$1(realBufferedSource))));
                            String[] strArr2 = a.I;
                            return fna.a(new c(realBufferedSource2), str2, true);
                        } catch (IOException e) {
                            return new tna(e);
                        }
                    } catch (Resources.NotFoundException e2) {
                        return new tna(e2);
                    }
                    return new tna(e2);
                }
            };
            HashMap map2 = fna.a;
            bna bnaVarA = cna.b.a(strG);
            vnaVar = bnaVarA != null ? new vna(bnaVarA) : null;
            if (map2.containsKey(strG)) {
                vnaVar = (vna) map2.get(strG);
            }
            if (vnaVar != null) {
                return vnaVar;
            }
            vna vnaVar2 = new vna(callable);
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            vnaVar2.b(new sna() { // from class: ena
                @Override // defpackage.sna
                public final void onResult(Object obj) {
                    int i4 = i2;
                    AtomicBoolean atomicBoolean2 = atomicBoolean;
                    String str2 = strG;
                    switch (i4) {
                        case 0:
                            HashMap map3 = fna.a;
                            map3.remove(str2);
                            atomicBoolean2.set(true);
                            if (map3.size() == 0) {
                                fna.d();
                            }
                            break;
                        default:
                            HashMap map4 = fna.a;
                            map4.remove(str2);
                            atomicBoolean2.set(true);
                            if (map4.size() == 0) {
                                fna.d();
                            }
                            break;
                    }
                }
            });
            vnaVar2.a(new sna() { // from class: ena
                @Override // defpackage.sna
                public final void onResult(Object obj) {
                    int i4 = i;
                    AtomicBoolean atomicBoolean2 = atomicBoolean;
                    String str2 = strG;
                    switch (i4) {
                        case 0:
                            HashMap map3 = fna.a;
                            map3.remove(str2);
                            atomicBoolean2.set(true);
                            if (map3.size() == 0) {
                                fna.d();
                            }
                            break;
                        default:
                            HashMap map4 = fna.a;
                            map4.remove(str2);
                            atomicBoolean2.set(true);
                            if (map4.size() == 0) {
                                fna.d();
                            }
                            break;
                    }
                }
            });
            if (!atomicBoolean.get()) {
                map2.put(strG, vnaVar2);
                if (map2.size() == 1) {
                    fna.d();
                }
            }
            return vnaVar2;
        }
        final int i4 = jnaVar.a;
        HashMap map3 = fna.a;
        final WeakReference weakReference2 = new WeakReference(context);
        final Context applicationContext2 = context.getApplicationContext();
        Callable callable2 = new Callable() { // from class: dna
            @Override // java.util.concurrent.Callable
            public final Object call() {
                int i42 = i4;
                Context context2 = (Context) weakReference2.get();
                if (context2 == null) {
                    context2 = applicationContext2;
                }
                String str2 = str;
                bna bnaVarA2 = str2 == null ? null : cna.b.a(str2);
                if (bnaVarA2 != null) {
                    return new tna(bnaVarA2);
                }
                try {
                    RealBufferedSource realBufferedSource = new RealBufferedSource(Okio.g(context2.getResources().openRawResource(i42)));
                    if (fna.c(realBufferedSource, fna.c).booleanValue()) {
                        ZipInputStream zipInputStream = new ZipInputStream(new RealBufferedSource$inputStream$1(realBufferedSource));
                        try {
                            return fna.b(context2, zipInputStream, str2);
                        } finally {
                            zpi.b(zipInputStream);
                        }
                    }
                    if (!fna.c(realBufferedSource, fna.d).booleanValue()) {
                        String[] strArr = a.I;
                        return fna.a(new c(realBufferedSource), str2, true);
                    }
                    try {
                        RealBufferedSource realBufferedSource2 = new RealBufferedSource(Okio.g(new GZIPInputStream(new RealBufferedSource$inputStream$1(realBufferedSource))));
                        String[] strArr2 = a.I;
                        return fna.a(new c(realBufferedSource2), str2, true);
                    } catch (IOException e) {
                        return new tna(e);
                    }
                } catch (Resources.NotFoundException e2) {
                    return new tna(e2);
                }
                return new tna(e2);
            }
        };
        HashMap map4 = fna.a;
        bna bnaVarA2 = str == null ? null : cna.b.a(str);
        vnaVar = bnaVarA2 != null ? new vna(bnaVarA2) : null;
        if (str != null && map4.containsKey(str)) {
            vnaVar = (vna) map4.get(str);
        }
        if (vnaVar != null) {
            return vnaVar;
        }
        vna vnaVar3 = new vna(callable2);
        if (str != null) {
            final AtomicBoolean atomicBoolean2 = new AtomicBoolean(false);
            vnaVar3.b(new sna() { // from class: ena
                @Override // defpackage.sna
                public final void onResult(Object obj) {
                    int i42 = i2;
                    AtomicBoolean atomicBoolean22 = atomicBoolean2;
                    String str2 = str;
                    switch (i42) {
                        case 0:
                            HashMap map32 = fna.a;
                            map32.remove(str2);
                            atomicBoolean22.set(true);
                            if (map32.size() == 0) {
                                fna.d();
                            }
                            break;
                        default:
                            HashMap map42 = fna.a;
                            map42.remove(str2);
                            atomicBoolean22.set(true);
                            if (map42.size() == 0) {
                                fna.d();
                            }
                            break;
                    }
                }
            });
            vnaVar3.a(new sna() { // from class: ena
                @Override // defpackage.sna
                public final void onResult(Object obj) {
                    int i42 = i;
                    AtomicBoolean atomicBoolean22 = atomicBoolean2;
                    String str2 = str;
                    switch (i42) {
                        case 0:
                            HashMap map32 = fna.a;
                            map32.remove(str2);
                            atomicBoolean22.set(true);
                            if (map32.size() == 0) {
                                fna.d();
                            }
                            break;
                        default:
                            HashMap map42 = fna.a;
                            map42.remove(str2);
                            atomicBoolean22.set(true);
                            if (map42.size() == 0) {
                                fna.d();
                            }
                            break;
                    }
                }
            });
            if (!atomicBoolean2.get()) {
                map4.put(str, vnaVar3);
                if (map4.size() == 1) {
                    fna.d();
                }
            }
        }
        return vnaVar3;
    }

    public static int p(int i, int i2) {
        return (i << 3) | i2;
    }

    public static final ina q(jna jnaVar, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.b0(-1248473602);
        ho3 ho3Var = new ho3(3, null, 4);
        Context context = (Context) e18Var.j(w00.b);
        e18Var.b0(1388713953);
        int i2 = (i & 14) ^ 6;
        boolean z = true;
        boolean z2 = (i2 > 4 && e18Var.f(jnaVar)) || (i & 6) == 4;
        Object objN = e18Var.N();
        lz1 lz1Var = jd4.a;
        if (z2 || objN == lz1Var) {
            objN = mpk.P(new ina());
            e18Var.k0(objN);
        }
        nwb nwbVar = (nwb) objN;
        e18Var.p(false);
        e18Var.b0(1388714244);
        if ((i2 <= 4 || !e18Var.f(jnaVar)) && (i & 6) != 4) {
            z = false;
        }
        boolean zF = e18Var.f("__LottieInternalDefaultCacheKey__") | z;
        Object objN2 = e18Var.N();
        if (zF || objN2 == lz1Var) {
            objN2 = o(context, jnaVar, "__LottieInternalDefaultCacheKey__");
            e18Var.k0(objN2);
        }
        e18Var.p(false);
        fd9.j(jnaVar, "__LottieInternalDefaultCacheKey__", new b24(ho3Var, context, jnaVar, nwbVar, null, 2), e18Var);
        ina inaVar = (ina) nwbVar.getValue();
        e18Var.p(false);
        return inaVar;
    }
}
