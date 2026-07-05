package defpackage;

import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.analytics.events.MobileAppFeedbackEvents$FeedbackType;
import com.anthropic.claude.login.MagicLinkIntentData;
import com.anthropic.claude.models.organization.configtypes.GroveConfigStrings;
import com.anthropic.claude.tool.model.MapDisplayV0Input;
import com.anthropic.claude.tool.model.MapDisplayV0InputMarkersItem;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class xg4 implements rz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;

    public /* synthetic */ xg4(ls4 ls4Var, nwb nwbVar, String str) {
        this.E = 8;
        this.F = ls4Var;
        this.G = nwbVar;
        this.H = str;
    }

    private final Object d(Object obj, Object obj2, Object obj3) {
        fk0 fk0Var;
        float f;
        fqb fqbVar;
        float f2;
        final nn6 nn6Var = (nn6) this.F;
        lsc lscVar = nn6Var.c;
        ze0 ze0Var = (ze0) this.H;
        fk0 fk0Var2 = (fk0) this.G;
        mnc mncVar = (mnc) obj;
        ld4 ld4Var = (ld4) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        mncVar.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= ((e18) ld4Var).f(mncVar) ? 4 : 2;
        }
        e18 e18Var = (e18) ld4Var;
        if (e18Var.Q(iIntValue & 1, (iIntValue & 19) != 18)) {
            fqb fqbVar2 = fqb.E;
            iqb iqbVarL = gb9.L(gb9.I(fqbVar2, mncVar), 16.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2);
            q64 q64VarA = p64.a(ko0.c, lja.S, e18Var, 0);
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
            z80 z80Var = cd4.f;
            d4c.i0(e18Var, z80Var, q64VarA);
            z80 z80Var2 = cd4.e;
            d4c.i0(e18Var, z80Var2, hycVarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            z80 z80Var3 = cd4.g;
            d4c.i0(e18Var, z80Var3, numValueOf);
            bx bxVar = cd4.h;
            d4c.h0(e18Var, bxVar);
            z80 z80Var4 = cd4.d;
            d4c.i0(e18Var, z80Var4, iqbVarE);
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (objN == lz1Var) {
                objN = mpk.P(Boolean.FALSE);
                e18Var.k0(objN);
            }
            nwb nwbVar = (nwb) objN;
            boolean zBooleanValue = ((Boolean) nwbVar.getValue()).booleanValue();
            Object objN2 = e18Var.N();
            if (objN2 == lz1Var) {
                objN2 = new ol5(3, nwbVar);
                e18Var.k0(objN2);
            }
            kkk.a(zBooleanValue, (bz7) objN2, null, fd9.q0(781813692, new on6(nn6Var, nwbVar, 1), e18Var), e18Var, 3120, 4);
            if (nn6Var.O() instanceof ve0) {
                sq6.A(16.0f, 250478341, e18Var, e18Var, fqbVar2);
                cxe cxeVarA = axe.a(ko0.a, lja.Q, e18Var, 48);
                int iHashCode2 = Long.hashCode(e18Var.T);
                hyc hycVarL2 = e18Var.l();
                iqb iqbVarE2 = kxk.E(e18Var, fqbVar2);
                e18Var.e0();
                fk0Var = fk0Var2;
                if (e18Var.S) {
                    e18Var.k(re4Var);
                } else {
                    e18Var.n0();
                }
                d4c.i0(e18Var, z80Var, cxeVarA);
                d4c.i0(e18Var, z80Var2, hycVarL2);
                ij0.t(iHashCode2, e18Var, z80Var3, e18Var, bxVar);
                d4c.i0(e18Var, z80Var4, iqbVarE2);
                f = 16.0f;
                tjh.b("HTTPS", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var, 6, 0, 262142);
                boolean zR = x44.r((String) nn6Var.e.getValue(), "https");
                boolean zF = e18Var.f(nn6Var);
                Object objN3 = e18Var.N();
                if (zF || objN3 == lz1Var) {
                    final int i = 0;
                    objN3 = new bz7() { // from class: qn6
                        @Override // defpackage.bz7
                        public final Object invoke(Object obj4) {
                            int i2 = i;
                            iei ieiVar = iei.a;
                            nn6 nn6Var2 = nn6Var;
                            switch (i2) {
                                case 0:
                                    isc iscVar = nn6Var2.g;
                                    boolean zBooleanValue2 = ((Boolean) obj4).booleanValue();
                                    nn6Var2.e.setValue(zBooleanValue2 ? "https" : "http");
                                    if (zBooleanValue2 && iscVar.h() == 80) {
                                        nn6Var2.P(443);
                                    } else if (!zBooleanValue2 && iscVar.h() == 443) {
                                        nn6Var2.P(80);
                                    }
                                    break;
                                case 1:
                                    String str = (String) obj4;
                                    str.getClass();
                                    nn6Var2.f.setValue(str);
                                    break;
                                default:
                                    String str2 = (String) obj4;
                                    str2.getClass();
                                    Integer numR0 = isg.r0(10, str2);
                                    nn6Var2.P(numR0 != null ? numR0.intValue() : 0);
                                    break;
                            }
                            return ieiVar;
                        }
                    };
                    e18Var.k0(objN3);
                }
                q0h.a(zR, (bz7) objN3, null, false, null, e18Var, 0, 124);
                e18Var.p(true);
                kxk.g(e18Var, b.e(fqbVar2, 8.0f));
                String str = (String) nn6Var.f.getValue();
                boolean zF2 = e18Var.f(nn6Var);
                Object objN4 = e18Var.N();
                if (zF2 || objN4 == lz1Var) {
                    final int i2 = 1;
                    objN4 = new bz7() { // from class: qn6
                        @Override // defpackage.bz7
                        public final Object invoke(Object obj4) {
                            int i22 = i2;
                            iei ieiVar = iei.a;
                            nn6 nn6Var2 = nn6Var;
                            switch (i22) {
                                case 0:
                                    isc iscVar = nn6Var2.g;
                                    boolean zBooleanValue2 = ((Boolean) obj4).booleanValue();
                                    nn6Var2.e.setValue(zBooleanValue2 ? "https" : "http");
                                    if (zBooleanValue2 && iscVar.h() == 80) {
                                        nn6Var2.P(443);
                                    } else if (!zBooleanValue2 && iscVar.h() == 443) {
                                        nn6Var2.P(80);
                                    }
                                    break;
                                case 1:
                                    String str2 = (String) obj4;
                                    str2.getClass();
                                    nn6Var2.f.setValue(str2);
                                    break;
                                default:
                                    String str22 = (String) obj4;
                                    str22.getClass();
                                    Integer numR0 = isg.r0(10, str22);
                                    nn6Var2.P(numR0 != null ? numR0.intValue() : 0);
                                    break;
                            }
                            return ieiVar;
                        }
                    };
                    e18Var.k0(objN4);
                }
                kxk.d(str, (bz7) objN4, null, false, false, null, flk.e, null, null, null, null, false, null, null, null, false, 0, 0, null, null, e18Var, 1572864, 0, 0, 8388540);
                kxk.g(e18Var, b.e(fqbVar2, 8.0f));
                String strValueOf = String.valueOf(nn6Var.g.h());
                boolean zF3 = e18Var.f(nn6Var);
                Object objN5 = e18Var.N();
                if (zF3 || objN5 == lz1Var) {
                    final int i3 = 2;
                    objN5 = new bz7() { // from class: qn6
                        @Override // defpackage.bz7
                        public final Object invoke(Object obj4) {
                            int i22 = i3;
                            iei ieiVar = iei.a;
                            nn6 nn6Var2 = nn6Var;
                            switch (i22) {
                                case 0:
                                    isc iscVar = nn6Var2.g;
                                    boolean zBooleanValue2 = ((Boolean) obj4).booleanValue();
                                    nn6Var2.e.setValue(zBooleanValue2 ? "https" : "http");
                                    if (zBooleanValue2 && iscVar.h() == 80) {
                                        nn6Var2.P(443);
                                    } else if (!zBooleanValue2 && iscVar.h() == 443) {
                                        nn6Var2.P(80);
                                    }
                                    break;
                                case 1:
                                    String str2 = (String) obj4;
                                    str2.getClass();
                                    nn6Var2.f.setValue(str2);
                                    break;
                                default:
                                    String str22 = (String) obj4;
                                    str22.getClass();
                                    Integer numR0 = isg.r0(10, str22);
                                    nn6Var2.P(numR0 != null ? numR0.intValue() : 0);
                                    break;
                            }
                            return ieiVar;
                        }
                    };
                    e18Var.k0(objN5);
                }
                kxk.d(strValueOf, (bz7) objN5, null, false, false, null, flk.f, null, null, null, null, false, null, null, null, false, 0, 0, null, null, e18Var, 1572864, 0, 0, 8388540);
                e18Var.p(false);
            } else {
                fk0Var = fk0Var2;
                f = 16.0f;
                e18Var.a0(252180272);
                e18Var.p(false);
            }
            if (((Integer) lscVar.getValue()) == null) {
                e18Var.a0(252268436);
                boolean z = !x44.r((ze0) nn6Var.h.getValue(), ze0Var);
                iqb iqbVarN = gb9.N(b.c(fqbVar2, 1.0f), MTTypesetterKt.kLineSkipLimitMultiplier, f, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 13);
                boolean zF4 = e18Var.f(nn6Var);
                Object objN6 = e18Var.N();
                if (zF4 || objN6 == lz1Var) {
                    objN6 = new mn6(nn6Var, 1);
                    e18Var.k0(objN6);
                }
                dtj.a("Apply", iqbVarN, z, null, null, null, 0L, (zy7) objN6, e18Var, 54, 120);
                tjh.b("The app will restart once applied.", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).g, e18Var, 6, 0, 131070);
                e18Var.p(false);
                f2 = f;
                fqbVar = fqbVar2;
            } else {
                e18Var.a0(252880531);
                Integer num = (Integer) lscVar.getValue();
                float f3 = f;
                fqbVar = fqbVar2;
                f2 = f3;
                tjh.b("Terminating app in " + num + " seconds...", gb9.N(fqbVar2, MTTypesetterKt.kLineSkipLimitMultiplier, f3, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 13), 0L, 0L, null, null, null, 0L, qeh.c, null, 0L, 0, false, 0, 0, null, null, e18Var, 805306416, 0, 261628);
                e18Var.p(false);
            }
            iuj.e(gb9.L(fqbVar, MTTypesetterKt.kLineSkipLimitMultiplier, 32.0f, 1), MTTypesetterKt.kLineSkipLimitMultiplier, gm3.a(e18Var).M, e18Var, 6, 2);
            fk0 fk0Var3 = fk0Var;
            String str2 = (String) fk0Var3.i.getValue();
            iqb iqbVarL2 = gb9.L(fqbVar, MTTypesetterKt.kLineSkipLimitMultiplier, f2, 1);
            boolean zH = e18Var.h(fk0Var3);
            Object objN7 = e18Var.N();
            if (zH || objN7 == lz1Var) {
                objN7 = new rn6(fk0Var3, 0);
                e18Var.k0(objN7);
            }
            kxk.d(str2, (bz7) objN7, iqbVarL2, false, false, null, flk.g, null, null, null, null, false, null, null, null, false, 0, 0, null, null, e18Var, 1573248, 0, 0, 8388536);
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        return iei.a;
    }

    private final Object e(Object obj, Object obj2, Object obj3) {
        int i;
        float f;
        boolean z;
        fqb fqbVar;
        e18 e18Var;
        kdg kdgVar;
        e18 e18Var2;
        final wg7 wg7Var = (wg7) this.F;
        lsc lscVar = wg7Var.h;
        lsc lscVar2 = wg7Var.g;
        vg7 vg7Var = (vg7) this.H;
        zy7 zy7Var = (zy7) this.G;
        mnc mncVar = (mnc) obj;
        ld4 ld4Var = (ld4) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        mncVar.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= ((e18) ld4Var).f(mncVar) ? 4 : 2;
        }
        final int i2 = 1;
        final int i3 = 0;
        e18 e18Var3 = (e18) ld4Var;
        if (e18Var3.Q(iIntValue & 1, (iIntValue & 19) != 18)) {
            j9f j9fVarY = mpk.Y(e18Var3);
            fqb fqbVar2 = fqb.E;
            iqb iqbVarL = gb9.L(gb9.I(mpk.b0(fqbVar2, j9fVarY, true), mncVar), 16.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2);
            q64 q64VarA = p64.a(ko0.c, lja.S, e18Var3, 0);
            int iHashCode = Long.hashCode(e18Var3.T);
            hyc hycVarL = e18Var3.l();
            iqb iqbVarE = kxk.E(e18Var3, iqbVarL);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var3.e0();
            if (e18Var3.S) {
                e18Var3.k(re4Var);
            } else {
                e18Var3.n0();
            }
            d4c.i0(e18Var3, cd4.f, q64VarA);
            d4c.i0(e18Var3, cd4.e, hycVarL);
            d4c.i0(e18Var3, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var3, cd4.h);
            d4c.i0(e18Var3, cd4.d, iqbVarE);
            MobileAppFeedbackEvents$FeedbackType mobileAppFeedbackEvents$FeedbackType = (MobileAppFeedbackEvents$FeedbackType) lscVar2.getValue();
            boolean zH = e18Var3.h(wg7Var);
            Object objN = e18Var3.N();
            lz1 lz1Var = jd4.a;
            if (zH || objN == lz1Var) {
                objN = new bz7() { // from class: zg7
                    @Override // defpackage.bz7
                    public final Object invoke(Object obj4) {
                        int i4 = i3;
                        iei ieiVar = iei.a;
                        wg7 wg7Var2 = wg7Var;
                        switch (i4) {
                            case 0:
                                MobileAppFeedbackEvents$FeedbackType mobileAppFeedbackEvents$FeedbackType2 = (MobileAppFeedbackEvents$FeedbackType) obj4;
                                mobileAppFeedbackEvents$FeedbackType2.getClass();
                                wg7Var2.g.setValue(mobileAppFeedbackEvents$FeedbackType2);
                                break;
                            default:
                                cjh cjhVar = (cjh) obj4;
                                cjhVar.getClass();
                                wg7Var2.h.setValue(cjhVar);
                                break;
                        }
                        return ieiVar;
                    }
                };
                e18Var3.k0(objN);
            }
            dlk.f(mobileAppFeedbackEvents$FeedbackType, (bz7) objN, e18Var3, 0);
            kxk.g(e18Var3, b.e(fqbVar2, 16.0f));
            cjh cjhVar = (cjh) lscVar.getValue();
            boolean zH2 = e18Var3.h(wg7Var);
            Object objN2 = e18Var3.N();
            if (zH2 || objN2 == lz1Var) {
                objN2 = new bz7() { // from class: zg7
                    @Override // defpackage.bz7
                    public final Object invoke(Object obj4) {
                        int i4 = i2;
                        iei ieiVar = iei.a;
                        wg7 wg7Var2 = wg7Var;
                        switch (i4) {
                            case 0:
                                MobileAppFeedbackEvents$FeedbackType mobileAppFeedbackEvents$FeedbackType2 = (MobileAppFeedbackEvents$FeedbackType) obj4;
                                mobileAppFeedbackEvents$FeedbackType2.getClass();
                                wg7Var2.g.setValue(mobileAppFeedbackEvents$FeedbackType2);
                                break;
                            default:
                                cjh cjhVar2 = (cjh) obj4;
                                cjhVar2.getClass();
                                wg7Var2.h.setValue(cjhVar2);
                                break;
                        }
                        return ieiVar;
                    }
                };
                e18Var3.k0(objN2);
            }
            bz7 bz7Var = (bz7) objN2;
            int i4 = ah7.a[((MobileAppFeedbackEvents$FeedbackType) lscVar2.getValue()).ordinal()];
            if (i4 == 1) {
                i = R.string.feedback_placeholder_general;
            } else if (i4 == 2) {
                i = R.string.feedback_placeholder_bug_report;
            } else if (i4 != 3) {
                i = R.string.feedback_placeholder_other;
                if (i4 != 4 && i4 != 5) {
                    wg6.i();
                    return null;
                }
            } else {
                i = R.string.feedback_placeholder_feature_request;
            }
            dlk.e(cjhVar, bz7Var, i, e18Var3, 0);
            kxk.g(e18Var3, b.e(fqbVar2, 16.0f));
            kdg kdgVar2 = wg7Var.k;
            boolean zH3 = e18Var3.h(vg7Var);
            Object objN3 = e18Var3.N();
            if (zH3 || objN3 == lz1Var) {
                f = 16.0f;
                z = true;
                fqbVar = fqbVar2;
                e18Var = e18Var3;
                mx5 mx5Var = new mx5(0, vg7Var, vg7.class, "launch", "launch()V", 0, 7);
                e18Var.k0(mx5Var);
                objN3 = mx5Var;
            } else {
                e18Var = e18Var3;
                f = 16.0f;
                z = true;
                fqbVar = fqbVar2;
            }
            zy7 zy7Var2 = (zy7) ((jm9) objN3);
            boolean zH4 = e18Var.h(wg7Var);
            Object objN4 = e18Var.N();
            if (zH4 || objN4 == lz1Var) {
                kdgVar = kdgVar2;
                e18Var2 = e18Var;
                ty4 ty4Var = new ty4(1, wg7Var, wg7.class, "removeScreenshot", "removeScreenshot(I)V", 0, 12);
                e18Var2.k0(ty4Var);
                objN4 = ty4Var;
            } else {
                kdgVar = kdgVar2;
                e18Var2 = e18Var;
            }
            e18 e18Var4 = e18Var2;
            elk.b(kdgVar, zy7Var2, (bz7) ((jm9) objN4), null, e18Var4, 0);
            kxk.g(e18Var4, b.e(fqbVar, f));
            dlk.g(null, e18Var4, 0);
            String strP = gid.p(f, R.string.submit_button, e18Var4, e18Var4, fqbVar);
            boolean zBooleanValue = ((Boolean) wg7Var.i.getValue()).booleanValue();
            boolean z2 = !bsg.I0(((cjh) lscVar.getValue()).a.F);
            iqb iqbVarC = b.c(fqbVar, 1.0f);
            boolean zH5 = e18Var4.h(wg7Var) | e18Var4.f(zy7Var);
            Object objN5 = e18Var4.N();
            if (zH5 || objN5 == lz1Var) {
                objN5 = new w95(wg7Var, 18, zy7Var);
                e18Var4.k0(objN5);
            }
            dxj.a(strP, zBooleanValue, iqbVarC, z2, null, null, null, 0L, (zy7) objN5, e18Var4, 384, 240);
            if (((Boolean) wg7Var.j.getValue()).booleanValue()) {
                sq6.A(8.0f, 1130403013, e18Var4, e18Var4, fqbVar);
                tjh.b(d4c.j0(R.string.feedback_submit_failed, e18Var4), null, gm3.a(e18Var4).y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var4).e.E).i, e18Var4, 0, 0, 131066);
                e18Var4.p(false);
            } else {
                e18Var4.a0(1130702845);
                e18Var4.p(false);
            }
            grc.z(fqbVar, f, e18Var4, z);
        } else {
            e18Var3.T();
        }
        return iei.a;
    }

    private final Object f(Object obj, Object obj2, Object obj3) {
        koc kocVar = (koc) this.F;
        List list = (List) this.H;
        zy7 zy7Var = (zy7) this.G;
        ld4 ld4Var = (ld4) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((ia0) obj).getClass();
        e18 e18Var = (e18) ld4Var;
        if (e18Var.Q(iIntValue & 1, (iIntValue & 17) != 16)) {
            tw8.d(1 + ((isc) kocVar.d.G).h(), list.size(), zy7Var, null, e18Var, 0);
        } else {
            e18Var.T();
        }
        return iei.a;
    }

    private final Object g(Object obj, Object obj2, Object obj3) {
        List<cpc> list = (List) this.F;
        fk0 fk0Var = (fk0) this.H;
        nwb nwbVar = (nwb) this.G;
        ld4 ld4Var = (ld4) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((s64) obj).getClass();
        e18 e18Var = (e18) ld4Var;
        if (e18Var.Q(iIntValue & 1, (iIntValue & 17) != 16)) {
            for (cpc cpcVar : list) {
                String str = (String) cpcVar.E;
                ta4 ta4VarQ0 = fd9.q0(-1241791222, new yi7((String) cpcVar.F, 10), e18Var);
                boolean zH = e18Var.h(fk0Var) | e18Var.f(str);
                Object objN = e18Var.N();
                if (zH || objN == jd4.a) {
                    objN = new yg4(fk0Var, str, nwbVar, 27);
                    e18Var.k0(objN);
                }
                t30.b(ta4VarQ0, (zy7) objN, null, null, null, false, null, null, e18Var, 6, 508);
            }
        } else {
            e18Var.T();
        }
        return iei.a;
    }

    private final Object h(Object obj, Object obj2, Object obj3) {
        rz7 rz7Var = (rz7) this.F;
        pef pefVar = (pef) this.H;
        mnc mncVar = (mnc) this.G;
        ld4 ld4Var = (ld4) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((ia0) obj).getClass();
        e18 e18Var = (e18) ld4Var;
        if (e18Var.Q(iIntValue & 1, (iIntValue & 17) != 16)) {
            rz7Var.invoke(fd9.q0(384598182, new nw7(pefVar, 9, mncVar), e18Var), e18Var, 6);
        } else {
            e18Var.T();
        }
        return iei.a;
    }

    private final Object n(Object obj, Object obj2, Object obj3) {
        vt6 vt6Var = (vt6) this.F;
        bpa bpaVar = (bpa) this.H;
        MagicLinkIntentData magicLinkIntentData = (MagicLinkIntentData) this.G;
        ld4 ld4Var = (ld4) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((ia0) obj).getClass();
        e18 e18Var = (e18) ld4Var;
        if (!e18Var.Q(iIntValue & 1, (iIntValue & 17) != 16)) {
            e18Var.T();
        } else if (vt6Var != null) {
            e18Var.a0(-263220290);
            boolean zF = e18Var.f(bpaVar) | e18Var.f(magicLinkIntentData);
            Object objN = e18Var.N();
            if (zF || objN == jd4.a) {
                objN = new ft9(bpaVar, 5, magicLinkIntentData);
                e18Var.k0(objN);
            }
            uik.c(vt6Var, null, null, null, (zy7) objN, e18Var, 0, 14);
            e18Var.p(false);
        } else {
            e18Var.a0(-262978118);
            e18Var.p(false);
        }
        return iei.a;
    }

    private final Object o(Object obj, Object obj2, Object obj3) {
        MapDisplayV0Input mapDisplayV0Input = (MapDisplayV0Input) this.F;
        String str = (String) this.H;
        lvh lvhVar = (lvh) this.G;
        ld4 ld4Var = (ld4) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((mnc) obj).getClass();
        e18 e18Var = (e18) ld4Var;
        if (e18Var.Q(iIntValue & 1, (iIntValue & 17) != 16)) {
            boolean zF = e18Var.f(mapDisplayV0Input.getMarkers());
            Object objN = e18Var.N();
            if (zF || objN == jd4.a) {
                List<MapDisplayV0InputMarkersItem> markers = mapDisplayV0Input.getMarkers();
                ArrayList arrayList = new ArrayList(x44.y(markers, 10));
                for (MapDisplayV0InputMarkersItem mapDisplayV0InputMarkersItem : markers) {
                    arrayList.add(new vsa(mapDisplayV0InputMarkersItem.getTitle(), mapDisplayV0InputMarkersItem.getLatitude(), mapDisplayV0InputMarkersItem.getLongitude(), mapDisplayV0InputMarkersItem.getLabel(), null, null, null, null, null, null, 1008));
                }
                objN = x44.W(arrayList);
                e18Var.k0(objN);
            }
            ykk.d(str, (List) objN, lvhVar.e, lvhVar.f, null, null, e18Var, 0, 48);
        } else {
            e18Var.T();
        }
        return iei.a;
    }

    private final Object p(Object obj, Object obj2, Object obj3) {
        String str = (String) this.F;
        zza zzaVar = (zza) this.H;
        zy7 zy7Var = (zy7) this.G;
        ld4 ld4Var = (ld4) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((s64) obj).getClass();
        e18 e18Var = (e18) ld4Var;
        if (e18Var.Q(iIntValue & 1, (iIntValue & 17) != 16)) {
            ovk.a(str, d4c.j0(R.string.mcp_auth_required_body, e18Var), fd9.q0(594450235, new lpa(zzaVar, 5, str), e18Var), null, 0L, 0, fd9.q0(-1783134913, new lpa(zzaVar, 6, zy7Var), e18Var), e18Var, 1573248, 56);
        } else {
            e18Var.T();
        }
        return iei.a;
    }

    private final Object q(Object obj, Object obj2, Object obj3) {
        rp6 rp6Var = (rp6) this.F;
        bt7 bt7Var = (bt7) this.H;
        qi3 qi3Var = (qi3) this.G;
        ld4 ld4Var = (ld4) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((s64) obj).getClass();
        int i = 0;
        int i2 = 1;
        e18 e18Var = (e18) ld4Var;
        if (e18Var.Q(iIntValue & 1, (iIntValue & 17) != 16)) {
            cjh cjhVarS = rp6Var.S();
            boolean zF = e18Var.f(rp6Var);
            Object objN = e18Var.N();
            if (zF || objN == jd4.a) {
                pac pacVar = new pac(1, rp6Var, rp6.class, "updatePhoneNumberFieldValue", "updatePhoneNumberFieldValue(Landroidx/compose/ui/text/input/TextFieldValue;)V", 0, 13);
                e18Var.k0(pacVar);
                objN = pacVar;
            }
            jm9 jm9Var = (jm9) objN;
            String str = (String) rp6Var.r.getValue();
            String strJ0 = d4c.j0(R.string.verification_flow_phone_field_label, e18Var);
            pzi pziVar = (pzi) rp6Var.q.getValue();
            if (pziVar == null) {
                pziVar = dd8.O;
            }
            pzi pziVar2 = pziVar;
            mp9 mp9Var = new mp9(i, 3, i, 123);
            fqb fqbVar = fqb.E;
            zh4.d(cjhVarS, (bz7) jm9Var, strJ0, iv1.s(gb9.L(b.c(fqbVar, 1.0f), 24.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2), bt7Var), false, fd9.q0(-61164615, new tp6(rp6Var, qi3Var, i2), e18Var), str, pziVar2, mp9Var, null, 0L, null, 5, e18Var, 100859904, 3600);
            xrk.a(0, 0, e18Var, gb9.L(fqbVar, 24.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2), d4c.j0(R.string.verification_flow_phone_number_validation_error, e18Var), rp6Var.T());
        } else {
            e18Var.T();
        }
        return iei.a;
    }

    private final Object r(Object obj, Object obj2, Object obj3) {
        String str = (String) this.F;
        List list = (List) this.H;
        lvh lvhVar = (lvh) this.G;
        ld4 ld4Var = (ld4) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((mnc) obj).getClass();
        e18 e18Var = (e18) ld4Var;
        if (e18Var.Q(iIntValue & 1, (iIntValue & 17) != 16)) {
            ykk.d(str, list, lvhVar.e, lvhVar.f, null, null, e18Var, 0, 48);
        } else {
            e18Var.T();
        }
        return iei.a;
    }

    private final Object s(Object obj, Object obj2, Object obj3) {
        e1a e1aVar = (e1a) this.F;
        ta4 ta4Var = (ta4) this.H;
        wlg wlgVar = (wlg) this.G;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        ld4 ld4Var = (ld4) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= ((e18) ld4Var).g(zBooleanValue) ? 4 : 2;
        }
        e18 e18Var = (e18) ld4Var;
        if (e18Var.Q(iIntValue & 1, (iIntValue & 19) != 18)) {
            List list = (List) e1aVar.d.getValue();
            if (!zBooleanValue || list == null) {
                e18Var.a0(2092702510);
                xo1 xo1Var = lja.K;
                FillElement fillElement = b.c;
                o5b o5bVarD = dw1.d(xo1Var, false);
                int iHashCode = Long.hashCode(e18Var.T);
                hyc hycVarL = e18Var.l();
                iqb iqbVarE = kxk.E(e18Var, fillElement);
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
                if (((Boolean) wlgVar.getValue()).booleanValue()) {
                    e18Var.a0(1015027162);
                    ez1.a(null, vf2.J, 0L, e18Var, 48, 5);
                    e18Var.p(false);
                } else {
                    e18Var.a0(1015109808);
                    e18Var.p(false);
                }
                e18Var.p(true);
                e18Var.p(false);
            } else {
                e18Var.a0(2092966537);
                ta4Var.invoke(list, e18Var, 0);
                e18Var.p(false);
            }
        } else {
            e18Var.T();
        }
        return iei.a;
    }

    private final Object t(Object obj, Object obj2, Object obj3) {
        wz5 wz5Var;
        jgd jgdVar = (jgd) this.F;
        ybg ybgVar = (ybg) this.H;
        zy7 zy7Var = (zy7) this.G;
        mnc mncVar = (mnc) obj;
        ld4 ld4Var = (ld4) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        mncVar.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= ((e18) ld4Var).f(mncVar) ? 4 : 2;
        }
        e18 e18Var = (e18) ld4Var;
        if (e18Var.Q(iIntValue & 1, (iIntValue & 19) != 18)) {
            zy1 zy1Var = jgdVar.e;
            wz5 wz5Var2 = jgdVar.f;
            zni.g(zy1Var, ybgVar, e18Var, 48);
            j9f j9fVarY = mpk.Y(e18Var);
            fqb fqbVar = fqb.E;
            iqb iqbVarI = gb9.I(mpk.b0(fqbVar, j9fVarY, true), mncVar);
            vo1 vo1Var = lja.S;
            eo0 eo0Var = ko0.c;
            q64 q64VarA = p64.a(eo0Var, vo1Var, e18Var, 0);
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
            z80 z80Var = cd4.f;
            d4c.i0(e18Var, z80Var, q64VarA);
            z80 z80Var2 = cd4.e;
            d4c.i0(e18Var, z80Var2, hycVarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            z80 z80Var3 = cd4.g;
            d4c.i0(e18Var, z80Var3, numValueOf);
            bx bxVar = cd4.h;
            d4c.h0(e18Var, bxVar);
            z80 z80Var4 = cd4.d;
            d4c.i0(e18Var, z80Var4, iqbVarE);
            qnc qncVar = kgd.a;
            iqb iqbVarI2 = gb9.I(fqbVar, qncVar);
            q64 q64VarA2 = p64.a(eo0Var, vo1Var, e18Var, 0);
            int iHashCode2 = Long.hashCode(e18Var.T);
            hyc hycVarL2 = e18Var.l();
            iqb iqbVarE2 = kxk.E(e18Var, iqbVarI2);
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, z80Var, q64VarA2);
            d4c.i0(e18Var, z80Var2, hycVarL2);
            ij0.t(iHashCode2, e18Var, z80Var3, e18Var, bxVar);
            d4c.i0(e18Var, z80Var4, iqbVarE2);
            tjh.b(d4c.j0(R.string.privacy_data_privacy_section_title, e18Var), gb9.N(fqbVar, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 8.0f, 7), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).f, e18Var, 48, 0, 131068);
            tjh.b(d4c.j0(R.string.privacy_data_privacy_p1, e18Var), gb9.N(fqbVar, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 4.0f, 7), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).g, e18Var, 48, 0, 131068);
            tjh.c(zrk.j(R.string.privacy_data_privacy_p2, lm6.E, new ekh(new egg(gm3.a(e18Var).b0, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534), null, null, null), new CharSequence[0], e18Var, 48, 0), null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, ((jm3) gm3.c(e18Var).e.E).g, e18Var, 0, 0, 262142);
            e18Var.p(true);
            iuj.e(gb9.K(fqbVar, 16.0f, 8.0f), MTTypesetterKt.kLineSkipLimitMultiplier, 0L, e18Var, 6, 6);
            if (((Boolean) jgdVar.g.getValue()).booleanValue()) {
                e18Var.a0(-2018437298);
                o5b o5bVarD = dw1.d(lja.G, false);
                int iHashCode3 = Long.hashCode(e18Var.T);
                hyc hycVarL3 = e18Var.l();
                iqb iqbVarE3 = kxk.E(e18Var, fqbVar);
                e18Var.e0();
                wz5Var = wz5Var2;
                if (e18Var.S) {
                    e18Var.k(re4Var);
                } else {
                    e18Var.n0();
                }
                d4c.i0(e18Var, z80Var, o5bVarD);
                d4c.i0(e18Var, z80Var2, hycVarL3);
                ij0.t(iHashCode3, e18Var, z80Var3, e18Var, bxVar);
                d4c.i0(e18Var, z80Var4, iqbVarE3);
                GroveConfigStrings groveConfigStrings = (GroveConfigStrings) wz5Var.getValue();
                if (groveConfigStrings == null) {
                    sz6.p("Required value was null.");
                    return null;
                }
                jgdVar = jgdVar;
                kgd.b(jgdVar, groveConfigStrings, xn5.j0(uj5.e(fqbVar, 8.0f), MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 0.4f, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, null, false, 524283), false, e18Var, 3456, 0);
                GroveConfigStrings groveConfigStrings2 = (GroveConfigStrings) wz5Var.getValue();
                groveConfigStrings2.getClass();
                kgd.a(zy7Var, groveConfigStrings2, gb9.N(gb9.I(b.c(fqbVar, 1.0f), qncVar), MTTypesetterKt.kLineSkipLimitMultiplier, 8.0f, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 13), e18Var, 384);
                e18Var.p(true);
                e18Var.p(false);
            } else {
                wz5Var = wz5Var2;
                e18Var.a0(-2017628136);
                e18Var.p(false);
            }
            if (((Boolean) jgdVar.i.getValue()).booleanValue()) {
                e18Var.a0(-2017581388);
                GroveConfigStrings groveConfigStrings3 = (GroveConfigStrings) wz5Var.getValue();
                if (groveConfigStrings3 == null) {
                    sz6.p("Required value was null.");
                    return null;
                }
                kgd.b(jgdVar, groveConfigStrings3, null, ((Boolean) jgdVar.h.getValue()).booleanValue(), e18Var, 0, 4);
                e18Var.p(false);
            } else {
                e18Var.a0(-2017362280);
                e18Var.p(false);
            }
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        return iei.a;
    }

    private final Object u(Object obj, Object obj2, Object obj3) {
        ild ildVar = (ild) this.F;
        mnc mncVar = (mnc) this.H;
        mxd mxdVar = (mxd) this.G;
        mw1 mw1Var = (mw1) obj;
        ld4 ld4Var = (ld4) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        mw1Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= ((e18) ld4Var).f(mw1Var) ? 4 : 2;
        }
        e18 e18Var = (e18) ld4Var;
        if (e18Var.Q(iIntValue & 1, (iIntValue & 19) != 18)) {
            bxd.a.a(mxdVar, ((Boolean) ildVar.o.getValue()).booleanValue(), gb9.I(mw1Var.a(fqb.E, lja.H), mncVar), 0L, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, e18Var, 1572864);
        } else {
            e18Var.T();
        }
        return iei.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:235:0x07f1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:236:0x07f3  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.rz7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r70, java.lang.Object r71, java.lang.Object r72) {
        /*
            Method dump skipped, instruction units count: 3332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xg4.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ xg4(nwb nwbVar, nwb nwbVar2, wlg wlgVar) {
        this.E = 6;
        this.G = nwbVar;
        this.F = nwbVar2;
        this.H = wlgVar;
    }

    public /* synthetic */ xg4(nwb nwbVar, wlg wlgVar, bz7 bz7Var) {
        this.E = 9;
        this.G = nwbVar;
        this.H = wlgVar;
        this.F = bz7Var;
    }

    public /* synthetic */ xg4(Object obj, bz7 bz7Var, Object obj2, int i) {
        this.E = i;
        this.H = obj;
        this.F = bz7Var;
        this.G = obj2;
    }

    public /* synthetic */ xg4(Object obj, Object obj2, bz7 bz7Var, int i) {
        this.E = i;
        this.H = obj;
        this.G = obj2;
        this.F = bz7Var;
    }

    public /* synthetic */ xg4(Object obj, Object obj2, Object obj3, int i) {
        this.E = i;
        this.F = obj;
        this.H = obj2;
        this.G = obj3;
    }
}
