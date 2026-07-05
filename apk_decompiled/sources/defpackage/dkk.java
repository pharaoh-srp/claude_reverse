package defpackage;

import androidx.compose.foundation.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.analytics.events.VoiceEvents$FeedbackSubmitted;
import com.anthropic.claude.api.experience.ExperienceBullet;
import com.anthropic.claude.api.experience.ExperienceToggle;
import com.anthropic.claude.bell.VoiceSessionSummary;
import com.anthropic.claude.design.icon.a;
import com.pvporbit.freetype.FreeTypeConstants;
import com.squareup.wire.internal.MathMethodsKt;
import java.util.Arrays;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public abstract class dkk {
    public static final ta4 a = new ta4(142653584, false, new ob4(26));
    public static final ta4 b = new ta4(-53547001, false, new ob4(27));

    public static final void a(final String str, final int i, final zy7 zy7Var, final String str2, final zy7 zy7Var2, final String str3, iqb iqbVar, e0g e0gVar, qu1 qu1Var, long j, long j2, mnc mncVar, float f, ld4 ld4Var, final int i2) {
        final iqb iqbVar2;
        final e0g e0gVar2;
        final qu1 qu1Var2;
        final long j3;
        final long j4;
        final mnc mncVar2;
        final float f2;
        final long j5;
        iqb iqbVar3;
        final e0g e0gVar3;
        long j6;
        final float f3;
        final mnc mncVar3;
        str.getClass();
        zy7Var.getClass();
        zy7Var2.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(37275677);
        int i3 = i2 | (e18Var.f(str) ? 4 : 2) | (e18Var.d(i) ? 32 : 16) | (e18Var.h(zy7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var.f(str2) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE) | (e18Var.h(zy7Var2) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) | (e18Var.f(str3) ? 131072 : 65536) | 307757056;
        if (e18Var.Q(i3 & 1, (306783379 & i3) != 306783378)) {
            e18Var.V();
            if ((i2 & 1) == 0 || e18Var.A()) {
                vve vveVar = xve.a;
                qu1 qu1VarA = sf5.a(0.5f, gm3.a(e18Var).v);
                j5 = gm3.a(e18Var).p;
                long j7 = gm3.a(e18Var).N;
                qnc qncVar = new qnc(6.0f, 2.0f, 6.0f, 2.0f);
                float fA = csg.A(140, e18Var);
                iqbVar3 = fqb.E;
                e0gVar3 = vveVar;
                qu1Var2 = qu1VarA;
                j6 = j7;
                f3 = fA;
                mncVar3 = qncVar;
            } else {
                e18Var.T();
                iqbVar3 = iqbVar;
                e0gVar3 = e0gVar;
                qu1Var2 = qu1Var;
                j5 = j;
                j6 = j2;
                mncVar3 = mncVar;
                f3 = f;
            }
            e18Var.q();
            final iqb iqbVar4 = iqbVar3;
            j8.c(sq6.m(j6, on4.a), fd9.q0(-1592136483, new pz7() { // from class: lg3
                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    ld4 ld4Var2 = (ld4) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    e18 e18Var2 = (e18) ld4Var2;
                    if (e18Var2.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        wo1 wo1Var = lja.Q;
                        iqb iqbVar5 = iqbVar4;
                        e0g e0gVar4 = e0gVar3;
                        iqb iqbVarP = yfd.p(b.e(xn5.V(iqbVar5, e0gVar4), str2, null, str3, zy7Var2, zy7Var, 229), j5, zni.b);
                        qu1 qu1Var3 = qu1Var2;
                        iqb iqbVarI = gb9.I(androidx.compose.foundation.layout.b.v(ez1.u(iqbVarP, qu1Var3.a, qu1Var3.b, e0gVar4), MTTypesetterKt.kLineSkipLimitMultiplier, f3, 1), mncVar3);
                        cxe cxeVarA = axe.a(ko0.a, wo1Var, e18Var2, 48);
                        int iHashCode = Long.hashCode(e18Var2.T);
                        hyc hycVarL = e18Var2.l();
                        iqb iqbVarE = kxk.E(e18Var2, iqbVarI);
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
                        tjh.b(str, new hw9(1.0f, false), 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, ((jm3) gm3.c(e18Var2).e.E).i, e18Var2, 0, 24960, 110588);
                        int i4 = i;
                        if (i4 > 0) {
                            e18Var2.a0(747765691);
                            tjh.b(" +" + i4, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, ((jm3) gm3.c(e18Var2).e.E).i, e18Var2, 0, 24576, 114686);
                            e18Var2.p(false);
                        } else {
                            e18Var2.a0(747939105);
                            e18Var2.p(false);
                        }
                        e18Var2.p(true);
                    } else {
                        e18Var2.T();
                    }
                    return iei.a;
                }
            }, e18Var), e18Var, 56);
            j4 = j6;
            f2 = f3;
            mncVar2 = mncVar3;
            j3 = j5;
            iqbVar2 = iqbVar4;
            e0gVar2 = e0gVar3;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
            e0gVar2 = e0gVar;
            qu1Var2 = qu1Var;
            j3 = j;
            j4 = j2;
            mncVar2 = mncVar;
            f2 = f;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pz7(str, i, zy7Var, str2, zy7Var2, str3, iqbVar2, e0gVar2, qu1Var2, j3, j4, mncVar2, f2, i2) { // from class: mg3
                public final /* synthetic */ String E;
                public final /* synthetic */ int F;
                public final /* synthetic */ zy7 G;
                public final /* synthetic */ String H;
                public final /* synthetic */ zy7 I;
                public final /* synthetic */ String J;
                public final /* synthetic */ iqb K;
                public final /* synthetic */ e0g L;
                public final /* synthetic */ qu1 M;
                public final /* synthetic */ long N;
                public final /* synthetic */ long O;
                public final /* synthetic */ mnc P;
                public final /* synthetic */ float Q;

                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP0 = x44.p0(1);
                    dkk.a(this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, (ld4) obj, iP0);
                    return iei.a;
                }
            };
        }
    }

    public static final void b(ExperienceBullet experienceBullet, vig vigVar, boolean z, iqb iqbVar, ld4 ld4Var, int i) {
        ExperienceBullet experienceBullet2;
        int i2;
        vig vigVar2;
        vig vigVar3;
        vig vigVar4;
        wo1 wo1Var;
        iqb iqbVarJ;
        z80 z80Var;
        bx bxVar;
        z80 z80Var2;
        e18 e18Var;
        z80 z80Var3;
        int i3;
        lz1 lz1Var;
        boolean z2;
        e18 e18Var2;
        iqb iqbVarB;
        e18 e18Var3 = (e18) ld4Var;
        e18Var3.c0(-1023756855);
        if ((i & 6) == 0) {
            experienceBullet2 = experienceBullet;
            i2 = (e18Var3.f(experienceBullet2) ? 4 : 2) | i;
        } else {
            experienceBullet2 = experienceBullet;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var3.f(vigVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var3.g(z) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var3.f(iqbVar) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if (e18Var3.Q(i2 & 1, (i2 & 1171) != 1170)) {
            ExperienceToggle toggle = experienceBullet2.getToggle();
            if (toggle == null || !z) {
                toggle = null;
            }
            lz1 lz1Var2 = jd4.a;
            if (toggle == null) {
                e18Var3.a0(-177454097);
                e18Var3.p(false);
                vigVar3 = null;
            } else {
                e18Var3.a0(-177454096);
                if (vigVar == null) {
                    e18Var3.a0(-785994513);
                    boolean default_on = toggle.getDefault_on();
                    Object objN = e18Var3.N();
                    if (objN == lz1Var2) {
                        objN = new xg5(22);
                        e18Var3.k0(objN);
                    }
                    vigVar2 = new vig((bz7) objN, default_on, true);
                    e18Var3.p(false);
                } else {
                    e18Var3.a0(-785994978);
                    e18Var3.p(false);
                    vigVar2 = vigVar;
                }
                e18Var3.p(false);
                vigVar3 = vigVar2;
            }
            wo1 wo1Var2 = lja.Q;
            if (vigVar3 != null) {
                vigVar4 = vigVar3;
                wo1Var = wo1Var2;
                iqbVarJ = gb9.J(kzj.h(iqbVar, vigVar3.a, vigVar3.c, new vue(2), vigVar3.b, 8), 16.0f);
            } else {
                vigVar4 = vigVar3;
                wo1Var = wo1Var2;
                iqbVarJ = gb9.J(iqbVar, 16.0f);
            }
            cxe cxeVarA = axe.a(ko0.a, wo1Var, e18Var3, 48);
            int iHashCode = Long.hashCode(e18Var3.T);
            hyc hycVarL = e18Var3.l();
            iqb iqbVarE = kxk.E(e18Var3, iqbVarJ);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var3.e0();
            if (e18Var3.S) {
                e18Var3.k(re4Var);
            } else {
                e18Var3.n0();
            }
            z80 z80Var4 = cd4.f;
            d4c.i0(e18Var3, z80Var4, cxeVarA);
            z80 z80Var5 = cd4.e;
            d4c.i0(e18Var3, z80Var5, hycVarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            z80 z80Var6 = cd4.g;
            d4c.i0(e18Var3, z80Var6, numValueOf);
            bx bxVar2 = cd4.h;
            d4c.h0(e18Var3, bxVar2);
            z80 z80Var7 = cd4.d;
            d4c.i0(e18Var3, z80Var7, iqbVarE);
            String icon = experienceBullet2.getIcon();
            ud0 ud0Var = ud0.d;
            ud0 ud0VarW = v40.w(icon);
            if (icon == null || ud0VarW != null) {
                e18Var3.a0(-67510883);
                e18Var3.p(false);
            } else {
                e18Var3.a0(-67675214);
                boolean zF = e18Var3.f(icon);
                Object objN2 = e18Var3.N();
                if (zF || objN2 == lz1Var2) {
                    objN2 = new se2(2, null, icon);
                    e18Var3.k0(objN2);
                }
                fd9.i(e18Var3, (pz7) objN2, icon);
                e18Var3.p(false);
            }
            fqb fqbVar = fqb.E;
            if (ud0VarW != null) {
                e18Var3.a0(-67468630);
                bpc bpcVarA = a.a(ud0VarW, e18Var3);
                long j = gm3.a(e18Var3).N;
                z80Var = z80Var5;
                z80Var2 = z80Var7;
                e18Var = e18Var3;
                bxVar = bxVar2;
                z80Var3 = z80Var6;
                cv8.b(bpcVarA, null, androidx.compose.foundation.layout.b.o(fqbVar, 24.0f), j, e18Var, 440, 0);
                vb7.A(fqbVar, 12.0f, e18Var, false);
            } else {
                z80Var = z80Var5;
                bxVar = bxVar2;
                z80Var2 = z80Var7;
                e18Var = e18Var3;
                z80Var3 = z80Var6;
                e18Var.a0(-67204355);
                e18Var.p(false);
            }
            ho0 ho0Var = new ho0(2.0f, true, new sz6(1));
            hw9 hw9Var = new hw9(1.0f, true);
            q64 q64VarA = p64.a(ho0Var, lja.S, e18Var, 6);
            int iHashCode2 = Long.hashCode(e18Var.T);
            hyc hycVarL2 = e18Var.l();
            iqb iqbVarE2 = kxk.E(e18Var, hw9Var);
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, z80Var4, q64VarA);
            d4c.i0(e18Var, z80Var, hycVarL2);
            ij0.t(iHashCode2, e18Var, z80Var3, e18Var, bxVar);
            d4c.i0(e18Var, z80Var2, iqbVarE2);
            String title = experienceBullet.getTitle();
            if (title == null) {
                e18Var.a0(-722417906);
                e18Var.p(false);
                z2 = false;
                i3 = 6;
                e18Var2 = e18Var;
                lz1Var = lz1Var2;
            } else {
                e18Var.a0(-722417905);
                e18 e18Var4 = e18Var;
                i3 = 6;
                lz1Var = lz1Var2;
                z2 = false;
                tjh.b(title, null, gm3.a(e18Var).M, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).f, e18Var4, 0, 0, 131066);
                e18Var2 = e18Var4;
                e18Var2.p(false);
            }
            zb0 zb0VarH = u00.h(gm3.a(e18Var2).N, experienceBullet.getText());
            boolean z3 = (vigVar4 == null || !zb0VarH.c(zb0VarH.F.length())) ? z2 : true;
            tkh tkhVar = ((jm3) gm3.c(e18Var2).e.E).e;
            long j2 = gm3.a(e18Var2).M;
            if (z3) {
                e18Var2.a0(-721344003);
                Object objN3 = e18Var2.N();
                if (objN3 == lz1Var) {
                    objN3 = new hz6(i3);
                    e18Var2.k0(objN3);
                }
                iqbVarB = tjf.b(fqbVar, true, (bz7) objN3);
                e18Var2.p(z2);
            } else {
                e18Var2.a0(-721253917);
                e18Var2.p(z2);
                iqbVarB = fqbVar;
            }
            e18 e18Var5 = e18Var2;
            vig vigVar5 = vigVar4;
            tjh.c(zb0VarH, iqbVarB, j2, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, tkhVar, e18Var5, 0, 0, 262136);
            e18Var3 = e18Var5;
            e18Var3.p(true);
            if (vigVar5 != null) {
                ij0.r(12.0f, -65766420, e18Var3, e18Var3, fqbVar);
                zsk.d(vigVar5.a, null, vigVar5.c, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, null, null, e18Var3, 1572864, 58);
                e18Var3.p(z2);
            } else {
                e18Var3.a0(-65565571);
                e18Var3.p(z2);
            }
            e18Var3.p(true);
        } else {
            e18Var3.T();
        }
        r7e r7eVarS = e18Var3.s();
        if (r7eVarS != null) {
            r7eVarS.d = new en3(experienceBullet, vigVar, z, iqbVar, i, 5);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0372 A[LOOP:0: B:103:0x036c->B:105:0x0372, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0504  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0511  */
    /* JADX WARN: Type inference failed for: r11v12, types: [ld4] */
    /* JADX WARN: Type inference failed for: r13v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v14, types: [int] */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v21 */
    /* JADX WARN: Type inference failed for: r13v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v25 */
    /* JADX WARN: Type inference failed for: r13v29 */
    /* JADX WARN: Type inference failed for: r13v30 */
    /* JADX WARN: Type inference failed for: r13v31 */
    /* JADX WARN: Type inference failed for: r13v32 */
    /* JADX WARN: Type inference failed for: r13v9, types: [boolean] */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v19 */
    /* JADX WARN: Type inference failed for: r14v20 */
    /* JADX WARN: Type inference failed for: r14v22 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r1v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r25v4, types: [ld4] */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v44 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v34 */
    /* JADX WARN: Type inference failed for: r9v10, types: [e18] */
    /* JADX WARN: Type inference failed for: r9v11, types: [e18, ld4] */
    /* JADX WARN: Type inference failed for: r9v12, types: [e18, ld4] */
    /* JADX WARN: Type inference failed for: r9v15, types: [e18] */
    /* JADX WARN: Type inference failed for: r9v16, types: [e18] */
    /* JADX WARN: Type inference failed for: r9v17, types: [e18] */
    /* JADX WARN: Type inference failed for: r9v18, types: [e18] */
    /* JADX WARN: Type inference failed for: r9v19, types: [ld4] */
    /* JADX WARN: Type inference failed for: r9v2, types: [e18] */
    /* JADX WARN: Type inference failed for: r9v21, types: [e18] */
    /* JADX WARN: Type inference failed for: r9v22, types: [e18] */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v26 */
    /* JADX WARN: Type inference failed for: r9v27 */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference failed for: r9v29 */
    /* JADX WARN: Type inference failed for: r9v30 */
    /* JADX WARN: Type inference failed for: r9v31 */
    /* JADX WARN: Type inference failed for: r9v32 */
    /* JADX WARN: Type inference failed for: r9v33 */
    /* JADX WARN: Type inference failed for: r9v34 */
    /* JADX WARN: Type inference failed for: r9v35 */
    /* JADX WARN: Type inference failed for: r9v36 */
    /* JADX WARN: Type inference failed for: r9v37 */
    /* JADX WARN: Type inference failed for: r9v38 */
    /* JADX WARN: Type inference failed for: r9v39 */
    /* JADX WARN: Type inference failed for: r9v40 */
    /* JADX WARN: Type inference failed for: r9v41 */
    /* JADX WARN: Type inference failed for: r9v42 */
    /* JADX WARN: Type inference failed for: r9v7, types: [e18, ld4] */
    /* JADX WARN: Type inference failed for: r9v8, types: [e18] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(com.anthropic.claude.api.experience.SpotlightContent r41, defpackage.iqb r42, float r43, defpackage.mnc r44, defpackage.yw8 r45, defpackage.vig r46, defpackage.ld4 r47, int r48) {
        /*
            Method dump skipped, instruction units count: 1637
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dkk.c(com.anthropic.claude.api.experience.SpotlightContent, iqb, float, mnc, yw8, vig, ld4, int):void");
    }

    public static final void d(int i, int i2, final bz7 bz7Var, iqb iqbVar, ld4 ld4Var, int i3) {
        iqb iqbVar2;
        final byte b2;
        final int i4 = i;
        bz7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-949274587);
        int i5 = i3 | (e18Var.d(i4) ? 4 : 2) | (e18Var.d(i2) ? 32 : 16) | (e18Var.h(bz7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | 3072;
        int i6 = 1;
        if (e18Var.Q(i5 & 1, (i5 & 1171) != 1170)) {
            final int iMax = Math.max(1, i2 / 4);
            final int i7 = i2 * 4;
            ho0 ho0Var = new ho0(8.0f, true, new sz6(i6));
            wo1 wo1Var = lja.Q;
            cxe cxeVarA = axe.a(ho0Var, wo1Var, e18Var, 54);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            fqb fqbVar = fqb.E;
            iqb iqbVarE = kxk.E(e18Var, fqbVar);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            z80 z80Var = cd4.f;
            d4c.i0(e18Var, z80Var, cxeVarA);
            z80 z80Var2 = cd4.e;
            d4c.i0(e18Var, z80Var2, hycVarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            z80 z80Var3 = cd4.g;
            d4c.i0(e18Var, z80Var3, numValueOf);
            bx bxVar = cd4.h;
            d4c.h0(e18Var, bxVar);
            z80 z80Var4 = cd4.d;
            d4c.i0(e18Var, z80Var4, iqbVarE);
            tjh.b(d4c.j0(R.string.recipe_servings, e18Var), null, gm3.a(e18Var).N, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).g, e18Var, 0, 0, 131066);
            iqb iqbVarK = gb9.K(ez1.t(fqbVar, 0.5f, gm3.a(e18Var).u, xve.a(50)), 4.0f, 2.0f);
            cxe cxeVarA2 = axe.a(new ho0(MTTypesetterKt.kLineSkipLimitMultiplier, true, new sz6(1)), wo1Var, e18Var, 54);
            int iHashCode2 = Long.hashCode(e18Var.T);
            hyc hycVarL2 = e18Var.l();
            iqb iqbVarE2 = kxk.E(e18Var, iqbVarK);
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, z80Var, cxeVarA2);
            d4c.i0(e18Var, z80Var2, hycVarL2);
            ij0.t(iHashCode2, e18Var, z80Var3, e18Var, bxVar);
            d4c.i0(e18Var, z80Var4, iqbVarE2);
            i4 = i;
            boolean z = i4 > iMax;
            iqb iqbVarO = androidx.compose.foundation.layout.b.o(fqbVar, 32.0f);
            int i8 = i5 & 14;
            int i9 = i5 & 896;
            boolean zD = e18Var.d(iMax) | (i8 == 4) | (i9 == 256);
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (zD || objN == lz1Var) {
                b2 = 0;
                objN = new zy7() { // from class: g7e
                    @Override // defpackage.zy7
                    public final Object a() {
                        int i10 = b2;
                        iei ieiVar = iei.a;
                        bz7 bz7Var2 = bz7Var;
                        int i11 = iMax;
                        int i12 = i4;
                        switch (i10) {
                            case 0:
                                if (i12 > i11) {
                                    bz7Var2.invoke(Integer.valueOf(i12 - 1));
                                }
                                break;
                            default:
                                if (i12 < i11) {
                                    bz7Var2.invoke(Integer.valueOf(i12 + 1));
                                }
                                break;
                        }
                        return ieiVar;
                    }
                };
                e18Var.k0(objN);
            } else {
                b2 = 0;
            }
            ez1.e((zy7) objN, iqbVarO, z, null, null, fd9.q0(-645768321, new yd8(i4, iMax, 1, b2), e18Var), e18Var, 1572912, 56);
            tjh.b(String.valueOf(i4), gb9.L(fqbVar, 8.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2), gm3.a(e18Var).M, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).h, e18Var, 48, 0, 131064);
            e18Var = e18Var;
            boolean z2 = i4 < i7;
            iqb iqbVarO2 = androidx.compose.foundation.layout.b.o(fqbVar, 32.0f);
            boolean zD2 = e18Var.d(i7) | (i8 == 4) | (i9 == 256);
            Object objN2 = e18Var.N();
            if (zD2 || objN2 == lz1Var) {
                final int i10 = 1;
                objN2 = new zy7() { // from class: g7e
                    @Override // defpackage.zy7
                    public final Object a() {
                        int i102 = i10;
                        iei ieiVar = iei.a;
                        bz7 bz7Var2 = bz7Var;
                        int i11 = i7;
                        int i12 = i4;
                        switch (i102) {
                            case 0:
                                if (i12 > i11) {
                                    bz7Var2.invoke(Integer.valueOf(i12 - 1));
                                }
                                break;
                            default:
                                if (i12 < i11) {
                                    bz7Var2.invoke(Integer.valueOf(i12 + 1));
                                }
                                break;
                        }
                        return ieiVar;
                    }
                };
                e18Var.k0(objN2);
            }
            ez1.e((zy7) objN2, iqbVarO2, z2, null, null, fd9.q0(1073696360, new yd8(i4, i7, 2, (byte) 0), e18Var), e18Var, 1572912, 56);
            e18Var.p(true);
            e18Var.p(true);
            iqbVar2 = fqbVar;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ve2(i4, i2, bz7Var, iqbVar2, i3);
        }
    }

    public static final void e(Logger logger, c5h c5hVar, m7h m7hVar, String str) {
        logger.fine(m7hVar.b + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)) + ": " + c5hVar.a);
    }

    public static long[] f(long[]... jArr) {
        long length = 0;
        for (long[] jArr2 : jArr) {
            length += (long) jArr2.length;
        }
        int i = (int) length;
        fd9.D("the total number of elements (%s) in the arrays must fit in an int", length == ((long) i), length);
        long[] jArr3 = new long[i];
        int length2 = 0;
        for (long[] jArr4 : jArr) {
            System.arraycopy(jArr4, 0, jArr3, length2, jArr4.length);
            length2 += jArr4.length;
        }
        return jArr3;
    }

    public static final String g(long j) {
        String strR;
        if (j <= -999500000) {
            strR = grc.r((j - 500000000) / MathMethodsKt.NANOS_PER_SECOND, " s ", new StringBuilder());
        } else if (j <= -999500) {
            strR = grc.r((j - 500000) / 1000000, " ms", new StringBuilder());
        } else if (j <= 0) {
            strR = grc.r((j - 500) / 1000, " µs", new StringBuilder());
        } else if (j < 999500) {
            strR = grc.r((j + 500) / 1000, " µs", new StringBuilder());
        } else if (j < 999500000) {
            strR = grc.r((j + 500000) / 1000000, " ms", new StringBuilder());
        } else {
            strR = grc.r((j + 500000000) / MathMethodsKt.NANOS_PER_SECOND, " s ", new StringBuilder());
        }
        return String.format("%6s", Arrays.copyOf(new Object[]{strR}, 1));
    }

    public static n5 h() {
        if (n5.c == null) {
            n5.c = new n5();
        }
        n5 n5Var = n5.c;
        n5Var.getClass();
        return n5Var;
    }

    public static int i(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static final void j(qi3 qi3Var, VoiceSessionSummary voiceSessionSummary, boolean z, String str, String str2) {
        qi3Var.getClass();
        voiceSessionSummary.getClass();
        qi3Var.e(new VoiceEvents$FeedbackSubmitted(voiceSessionSummary.m563getOrganizationIdXjkXN6I(), voiceSessionSummary.m562getConversationIdRjYBDck(), voiceSessionSummary.m564getVoiceSessionId5I1JifQ(), z, voiceSessionSummary.getSessionDurationMs(), voiceSessionSummary.getNumTurns(), str, str2, voiceSessionSummary.getInputType(), voiceSessionSummary.getOutputType(), voiceSessionSummary.getActivationMode(), voiceSessionSummary.getNumFocusLosses(), voiceSessionSummary.getFocusTransientLossTotalMs()), VoiceEvents$FeedbackSubmitted.Companion.serializer());
    }
}
