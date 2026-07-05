package defpackage;

import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.api.common.RateLimit;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.Date;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class yx3 {
    static {
        lz1 lz1Var = uh6.F;
        zh6 zh6Var = zh6.HOURS;
        Date date = new Date(uh6.f(v40.Q(4, zh6Var)) + 1735732800000L);
        Boolean bool = Boolean.FALSE;
        new RateLimit.ExceedsLimit(date, bool, (String) null, (Map) null, 12, (mq5) null);
        new RateLimit.ApproachingLimit(new Date(uh6.f(v40.Q(4, zh6Var)) + 1735732800000L), (Integer) 4, bool, (String) null, (Map) null, 24, (mq5) null);
    }

    public static final void a(final r1e r1eVar, final iwg iwgVar, final String str, final pz7 pz7Var, ld4 ld4Var, final int i) {
        String str2;
        pz7 pz7Var2;
        r7e r7eVarS;
        pz7 pz7Var3;
        iwg iwgVar2;
        r7i r7iVar;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1276572628);
        int i2 = i | (e18Var.d(r1eVar.ordinal()) ? 4 : 2) | (e18Var.d(iwgVar.ordinal()) ? 32 : 16) | (e18Var.f(str) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var.h(pz7Var) ? 2048 : FreeTypeConstants.FT_LOAD_NO_RECURSE);
        if (e18Var.Q(i2 & 1, (i2 & 1171) != 1170)) {
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (objN == lz1Var) {
                objN = mpk.P(Boolean.FALSE);
                e18Var.k0(objN);
            }
            nwb nwbVar = (nwb) objN;
            if (((Boolean) nwbVar.getValue()).booleanValue()) {
                e18Var.a0(-1559974204);
                Object objN2 = e18Var.N();
                if (objN2 == lz1Var) {
                    objN2 = new dy2(6, nwbVar);
                    e18Var.k0(objN2);
                }
                iwgVar2 = iwgVar;
                h66.j(iwgVar2, (zy7) objN2, e18Var, ((i2 >> 3) & 14) | 48);
                e18Var.p(false);
            } else {
                iwgVar2 = iwgVar;
                e18Var.a0(-1559872338);
                e18Var.p(false);
            }
            int iOrdinal = r1eVar.ordinal();
            if (iOrdinal == 0) {
                str2 = str;
                pz7Var2 = pz7Var;
                r7iVar = new r7i(Integer.valueOf(R.string.upgrade_to_pro), str2, Boolean.TRUE);
            } else if (iOrdinal == 1) {
                str2 = str;
                pz7Var2 = pz7Var;
                r7iVar = new r7i(Integer.valueOf(R.string.upgrade_button_upsell_for_subscriptions), str2.concat("_max"), Boolean.TRUE);
            } else if (iOrdinal == 2) {
                str2 = str;
                pz7Var2 = pz7Var;
                r7iVar = new r7i(Integer.valueOf(R.string.upgrade_button_upsell_for_subscriptions), str2.concat("_max_web"), Boolean.FALSE);
            } else {
                if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        wg6.i();
                        return;
                    }
                    r7eVarS = e18Var.s();
                    if (r7eVarS != null) {
                        final int i3 = 0;
                        final iwg iwgVar3 = iwgVar2;
                        pz7Var3 = new pz7(r1eVar, iwgVar3, str, pz7Var, i, i3) { // from class: xx3
                            public final /* synthetic */ int E;
                            public final /* synthetic */ r1e F;
                            public final /* synthetic */ iwg G;
                            public final /* synthetic */ String H;
                            public final /* synthetic */ pz7 I;

                            {
                                this.E = i3;
                            }

                            @Override // defpackage.pz7
                            public final Object invoke(Object obj, Object obj2) {
                                int i4 = this.E;
                                iei ieiVar = iei.a;
                                switch (i4) {
                                    case 0:
                                        ((Integer) obj2).getClass();
                                        int iP0 = x44.p0(1);
                                        yx3.a(this.F, this.G, this.H, this.I, (ld4) obj, iP0);
                                        break;
                                    default:
                                        ((Integer) obj2).getClass();
                                        int iP02 = x44.p0(1);
                                        yx3.a(this.F, this.G, this.H, this.I, (ld4) obj, iP02);
                                        break;
                                }
                                return ieiVar;
                            }
                        };
                        r7eVarS.d = pz7Var3;
                    }
                    return;
                }
                str2 = str;
                pz7Var2 = pz7Var;
                r7iVar = new r7i(Integer.valueOf(R.string.get_more_usage), str2.concat("_more_usage_web"), Boolean.FALSE);
            }
            int iIntValue = ((Number) r7iVar.E).intValue();
            String str3 = (String) r7iVar.F;
            boolean zBooleanValue = ((Boolean) r7iVar.G).booleanValue();
            String strJ0 = d4c.j0(iIntValue, e18Var);
            boolean zF = e18Var.f(str3) | ((i2 & 7168) == 2048) | e18Var.g(zBooleanValue);
            Object objN3 = e18Var.N();
            if (zF || objN3 == lz1Var) {
                objN3 = new gt0(pz7Var2, str3, zBooleanValue, nwbVar);
                e18Var.k0(objN3);
            }
            dtj.a(strJ0, null, false, null, f12.a, y02.a, 0L, (zy7) objN3, e18Var, 221184, 78);
        } else {
            str2 = str;
            pz7Var2 = pz7Var;
            e18Var.T();
        }
        r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            final int i4 = 1;
            final String str4 = str2;
            final pz7 pz7Var4 = pz7Var2;
            pz7Var3 = new pz7(r1eVar, iwgVar, str4, pz7Var4, i, i4) { // from class: xx3
                public final /* synthetic */ int E;
                public final /* synthetic */ r1e F;
                public final /* synthetic */ iwg G;
                public final /* synthetic */ String H;
                public final /* synthetic */ pz7 I;

                {
                    this.E = i4;
                }

                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    int i42 = this.E;
                    iei ieiVar = iei.a;
                    switch (i42) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int iP0 = x44.p0(1);
                            yx3.a(this.F, this.G, this.H, this.I, (ld4) obj, iP0);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int iP02 = x44.p0(1);
                            yx3.a(this.F, this.G, this.H, this.I, (ld4) obj, iP02);
                            break;
                    }
                    return ieiVar;
                }
            };
            r7eVarS.d = pz7Var3;
        }
    }

    public static final void b(String str, String str2, r1e r1eVar, iwg iwgVar, String str3, pz7 pz7Var, iqb iqbVar, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-1338096207);
        if ((i & 6) == 0) {
            i2 = (e18Var2.f(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var2.f(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var2.d(r1eVar.ordinal()) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var2.d(iwgVar.ordinal()) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i & 24576) == 0) {
            i2 |= e18Var2.f(str3) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if ((196608 & i) == 0) {
            i2 |= e18Var2.h(pz7Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= e18Var2.f(iqbVar) ? FreeTypeConstants.FT_LOAD_COLOR : 524288;
        }
        if (e18Var2.Q(i2 & 1, (599187 & i2) != 599186)) {
            iqb iqbVarC = b.c(iqbVar, 1.0f);
            Object objN = e18Var2.N();
            if (objN == jd4.a) {
                objN = new it2(22);
                e18Var2.k0(objN);
            }
            e18Var = e18Var2;
            pzg.a(tjf.b(iqbVarC, true, (bz7) objN), xve.b(16.0f), gm3.a(e18Var2).q, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, null, fd9.q0(1826627724, new ne(r1eVar, iwgVar, str3, pz7Var, str, str2, 6), e18Var2), e18Var, 12582912, 120);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new yu(str, str2, r1eVar, iwgVar, str3, pz7Var, iqbVar, i, 2);
        }
    }

    public static final void c(final RateLimit rateLimit, final r1e r1eVar, final iwg iwgVar, final pz7 pz7Var, iqb iqbVar, long j, ld4 ld4Var, final int i) {
        final iqb iqbVar2;
        e18 e18Var;
        final long j2;
        r7e r7eVarS;
        pz7 pz7Var2;
        long jA;
        int i2;
        iqb iqbVar3;
        String strJ0;
        Date resetsAt;
        String str;
        String strK0;
        rateLimit.getClass();
        r1eVar.getClass();
        pz7Var.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-1410450315);
        int i3 = i | (e18Var2.f(rateLimit) ? 4 : 2) | (e18Var2.d(r1eVar.ordinal()) ? 32 : 16) | (e18Var2.d(iwgVar.ordinal()) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var2.h(pz7Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE) | 90112;
        if (e18Var2.Q(i3 & 1, (74899 & i3) != 74898)) {
            e18Var2.V();
            if ((i & 1) == 0 || e18Var2.A()) {
                m7f m7fVarN = sq6.n(e18Var2, -1168520582, e18Var2, -1633490746);
                boolean zF = e18Var2.f(null) | e18Var2.f(m7fVarN);
                Object objN = e18Var2.N();
                if (zF || objN == jd4.a) {
                    objN = m7fVarN.a(jce.a.b(mn5.class), null, null);
                    e18Var2.k0(objN);
                }
                e18Var2.p(false);
                e18Var2.p(false);
                jA = ((mn5) objN).a();
                i2 = i3 & (-458753);
                iqbVar3 = fqb.E;
            } else {
                e18Var2.T();
                i2 = i3 & (-458753);
                iqbVar3 = iqbVar;
                jA = j;
            }
            e18Var2.q();
            if (rateLimit.equals(RateLimit.WithinLimit.INSTANCE)) {
                e18Var2.a0(-1059820889);
                e18Var2.p(false);
                r7eVarS = e18Var2.s();
                if (r7eVarS != null) {
                    final iqb iqbVar4 = iqbVar3;
                    final long j3 = jA;
                    final int i4 = 0;
                    pz7Var2 = new pz7(rateLimit, r1eVar, iwgVar, pz7Var, iqbVar4, j3, i, i4) { // from class: wx3
                        public final /* synthetic */ int E;
                        public final /* synthetic */ RateLimit F;
                        public final /* synthetic */ r1e G;
                        public final /* synthetic */ iwg H;
                        public final /* synthetic */ pz7 I;
                        public final /* synthetic */ iqb J;
                        public final /* synthetic */ long K;

                        {
                            this.E = i4;
                        }

                        @Override // defpackage.pz7
                        public final Object invoke(Object obj, Object obj2) {
                            int i5 = this.E;
                            iei ieiVar = iei.a;
                            switch (i5) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int iP0 = x44.p0(1);
                                    yx3.c(this.F, this.G, this.H, this.I, this.J, this.K, (ld4) obj, iP0);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    int iP02 = x44.p0(1);
                                    yx3.c(this.F, this.G, this.H, this.I, this.J, this.K, (ld4) obj, iP02);
                                    break;
                            }
                            return ieiVar;
                        }
                    };
                    r7eVarS.d = pz7Var2;
                }
                return;
            }
            long j4 = jA;
            if (rateLimit instanceof RateLimit.ExceedsLimit) {
                e18Var2.a0(-1059772126);
                strJ0 = d4c.j0(R.string.rate_limit_reached, e18Var2);
                resetsAt = ((RateLimit.ExceedsLimit) rateLimit).getResetsAt();
                e18Var2.p(false);
                str = "ccr_rate_limit_exceeded";
            } else {
                if (!(rateLimit instanceof RateLimit.ApproachingLimit)) {
                    throw ebh.u(e18Var2, 1766926371, false);
                }
                e18Var2.a0(-1059560582);
                strJ0 = d4c.j0(R.string.ccr_rate_limit_approaching_title, e18Var2);
                resetsAt = ((RateLimit.ApproachingLimit) rateLimit).getResetsAt();
                e18Var2.p(false);
                str = "ccr_rate_limit_approaching";
            }
            String str2 = str;
            if (resetsAt == null) {
                strK0 = vb7.n(e18Var2, -1059338591, R.string.rate_limit_try_again_later, e18Var2, false);
            } else {
                e18Var2.a0(-1059249714);
                p1e p1eVarW = h66.w(resetsAt, j4, e18Var2);
                String str3 = p1eVarW.c;
                if (p1eVarW.a) {
                    e18Var2.a0(-1059155009);
                    strK0 = d4c.k0(R.string.rate_limit_resets_day_at_time, new Object[]{p1eVarW.b, str3}, e18Var2);
                    e18Var2.p(false);
                } else {
                    e18Var2.a0(-1059040402);
                    strK0 = d4c.k0(R.string.rate_limit_resets_at_time, new Object[]{str3}, e18Var2);
                    e18Var2.p(false);
                }
                e18Var2.p(false);
            }
            b(strJ0, strK0, r1eVar, iwgVar, str2, pz7Var, iqbVar3, e18Var2, ((i2 << 6) & 458752) | ((i2 << 3) & 8064) | 1572864);
            iqbVar2 = iqbVar3;
            e18Var = e18Var2;
            j2 = j4;
        } else {
            e18Var2.T();
            iqbVar2 = iqbVar;
            e18Var = e18Var2;
            j2 = j;
        }
        r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            final int i5 = 1;
            pz7Var2 = new pz7(rateLimit, r1eVar, iwgVar, pz7Var, iqbVar2, j2, i, i5) { // from class: wx3
                public final /* synthetic */ int E;
                public final /* synthetic */ RateLimit F;
                public final /* synthetic */ r1e G;
                public final /* synthetic */ iwg H;
                public final /* synthetic */ pz7 I;
                public final /* synthetic */ iqb J;
                public final /* synthetic */ long K;

                {
                    this.E = i5;
                }

                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    int i52 = this.E;
                    iei ieiVar = iei.a;
                    switch (i52) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int iP0 = x44.p0(1);
                            yx3.c(this.F, this.G, this.H, this.I, this.J, this.K, (ld4) obj, iP0);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int iP02 = x44.p0(1);
                            yx3.c(this.F, this.G, this.H, this.I, this.J, this.K, (ld4) obj, iP02);
                            break;
                    }
                    return ieiVar;
                }
            };
            r7eVarS.d = pz7Var2;
        }
    }
}
