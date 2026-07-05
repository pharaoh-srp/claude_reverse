package defpackage;

import android.content.Context;
import android.net.Uri;
import androidx.compose.foundation.layout.FillElement;
import com.anthropic.claude.R;
import com.anthropic.claude.analytics.events.MobileAppFeedbackEvents$FeedbackType;
import com.anthropic.claude.app.ClaudeAppOverlay;
import com.anthropic.claude.app.h1;
import com.anthropic.claude.artifact.details.ArtifactFullScreenParams;
import com.anthropic.claude.chat.bottomsheet.ChatScreenModalBottomSheetDestination;
import com.anthropic.claude.chat.bottomsheet.x0;
import com.anthropic.claude.chat.share.k;
import com.anthropic.claude.code.remote.stores.a;
import com.anthropic.claude.code.remote.stores.b;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j93 implements sz7 {
    public final /* synthetic */ int E = 0;
    public final /* synthetic */ rwe F;
    public final /* synthetic */ l45 G;
    public final /* synthetic */ szb H;
    public final /* synthetic */ Object I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object M;
    public final /* synthetic */ Object N;

    public /* synthetic */ j93(rwe rweVar, t53 t53Var, hw2 hw2Var, op3 op3Var, l45 l45Var, ze0 ze0Var, eli eliVar, rwe rweVar2, bz7 bz7Var) {
        this.F = rweVar;
        this.I = t53Var;
        this.J = hw2Var;
        this.K = op3Var;
        this.G = l45Var;
        this.L = ze0Var;
        this.M = eliVar;
        this.H = rweVar2;
        this.N = bz7Var;
    }

    @Override // defpackage.sz7
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        boolean z;
        int i2 = this.E;
        iei ieiVar = iei.a;
        Object obj5 = this.N;
        Object obj6 = this.M;
        Object obj7 = this.L;
        Object obj8 = this.K;
        Object obj9 = this.J;
        Object obj10 = this.I;
        szb szbVar = this.H;
        switch (i2) {
            case 0:
                x0.b(this.F, (t53) obj10, (hw2) obj9, (op3) obj8, this.G, (ze0) obj7, (eli) obj6, (rwe) szbVar, (bz7) obj5, (ia0) obj, (ChatScreenModalBottomSheetDestination) obj2, (ld4) obj3, ((Integer) obj4).intValue());
                return ieiVar;
            default:
                zqc zqcVar = (zqc) szbVar;
                z93 z93Var = (z93) obj10;
                pkc pkcVar = (pkc) obj9;
                lq0 lq0Var = (lq0) obj8;
                jwf jwfVar = (jwf) obj7;
                b bVar = (b) obj6;
                a aVar = (a) obj5;
                ia0 ia0Var = (ia0) obj;
                ClaudeAppOverlay claudeAppOverlay = (ClaudeAppOverlay) obj2;
                ld4 ld4Var = (ld4) obj3;
                int iIntValue = ((Integer) obj4).intValue();
                ia0Var.getClass();
                claudeAppOverlay.getClass();
                if ((iIntValue & 6) == 0) {
                    i = ((iIntValue & 8) == 0 ? ((e18) ld4Var).f(ia0Var) : ((e18) ld4Var).h(ia0Var) ? 4 : 2) | iIntValue;
                } else {
                    i = iIntValue;
                }
                if ((iIntValue & 48) == 0) {
                    i |= (iIntValue & 64) == 0 ? ((e18) ld4Var).f(claudeAppOverlay) : ((e18) ld4Var).h(claudeAppOverlay) ? 32 : 16;
                }
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(i & 1, (i & 147) != 146)) {
                    e18Var.T();
                } else if (claudeAppOverlay.equals(ClaudeAppOverlay.None.INSTANCE)) {
                    e18Var.a0(434012048);
                    e18Var.p(false);
                } else {
                    boolean z2 = claudeAppOverlay instanceof ClaudeAppOverlay.UpgradeToProBottomSheet;
                    rwe rweVar = this.F;
                    lz1 lz1Var = jd4.a;
                    if (z2) {
                        e18Var.a0(434128453);
                        fji subtitle = ((ClaudeAppOverlay.UpgradeToProBottomSheet) claudeAppOverlay).getSubtitle();
                        boolean zH = e18Var.h(rweVar) | ((i & 112) == 32 || ((i & 64) != 0 && e18Var.h(claudeAppOverlay))) | e18Var.h(zqcVar) | e18Var.h(z93Var);
                        Object objN = e18Var.N();
                        if (zH || objN == lz1Var) {
                            z = false;
                            x70 x70Var = new x70(rweVar, claudeAppOverlay, zqcVar, z93Var, 4);
                            e18Var.k0(x70Var);
                            objN = x70Var;
                        } else {
                            z = false;
                        }
                        oe5.f((bz7) objN, null, null, subtitle, null, e18Var, 0);
                        e18Var.p(z);
                    } else if (claudeAppOverlay instanceof ClaudeAppOverlay.GroveNoticeBottomSheet) {
                        e18Var.a0(435326572);
                        boolean zH2 = e18Var.h(rweVar);
                        Object objN2 = e18Var.N();
                        if (zH2 || objN2 == lz1Var) {
                            objN2 = new kj3(rweVar, 16);
                            e18Var.k0(objN2);
                        }
                        rqk.c((zy7) objN2, ((ClaudeAppOverlay.GroveNoticeBottomSheet) claudeAppOverlay).getLocation(), null, null, e18Var, 0);
                        e18Var.p(false);
                    } else if (claudeAppOverlay instanceof ClaudeAppOverlay.ExperienceSpotlightSheet) {
                        e18Var.a0(435613818);
                        Context context = (Context) e18Var.j(w00.b);
                        String strJ0 = d4c.j0(R.string.generic_error_something_went_wrong_try_again, e18Var);
                        String experienceId = ((ClaudeAppOverlay.ExperienceSpotlightSheet) claudeAppOverlay).getExperienceId();
                        boolean zH3 = e18Var.h(pkcVar);
                        Object objN3 = e18Var.N();
                        if (zH3 || objN3 == lz1Var) {
                            objN3 = new cv(21, pkcVar);
                            e18Var.k0(objN3);
                        }
                        bz7 bz7Var = (bz7) objN3;
                        boolean zH4 = e18Var.h(rweVar) | e18Var.h(zqcVar) | e18Var.h(z93Var);
                        Object objN4 = e18Var.N();
                        if (zH4 || objN4 == lz1Var) {
                            objN4 = new nf1(rweVar, zqcVar, z93Var, 9);
                            e18Var.k0(objN4);
                        }
                        bz7 bz7Var2 = (bz7) objN4;
                        boolean zH5 = e18Var.h(context) | e18Var.f(strJ0);
                        Object objN5 = e18Var.N();
                        if (zH5 || objN5 == lz1Var) {
                            objN5 = new l80(context, 22, strJ0);
                            e18Var.k0(objN5);
                        }
                        ckk.c(experienceId, bz7Var, bz7Var2, (zy7) objN5, null, this.G, e18Var, 0);
                        e18Var.p(false);
                    } else {
                        if (claudeAppOverlay instanceof ClaudeAppOverlay.BellMode) {
                            e18Var.a0(437761436);
                            e18Var.a0(-1168520582);
                            m7f m7fVarB = gr9.b(e18Var);
                            e18Var.a0(-1633490746);
                            boolean zF = e18Var.f(null) | e18Var.f(m7fVarB);
                            Object objN6 = e18Var.N();
                            if (zF || objN6 == lz1Var) {
                                objN6 = m7fVarB.a(jce.a.b(vd3.class), null, null);
                                e18Var.k0(objN6);
                            }
                            e18Var.p(false);
                            e18Var.p(false);
                            vd3 vd3Var = (vd3) objN6;
                            m7f m7fVarN = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                            boolean zF2 = e18Var.f(null) | e18Var.f(m7fVarN);
                            Object objN7 = e18Var.N();
                            if (zF2 || objN7 == lz1Var) {
                                objN7 = m7fVarN.a(jce.a.b(f4j.class), null, null);
                                e18Var.k0(objN7);
                            }
                            e18Var.p(false);
                            e18Var.p(false);
                            f4j f4jVar = (f4j) objN7;
                            ClaudeAppOverlay.BellMode bellMode = (ClaudeAppOverlay.BellMode) claudeAppOverlay;
                            String strM476getChatIdRjYBDck = bellMode.m476getChatIdRjYBDck();
                            String strM479getProjectIdvfJkQ = bellMode.m479getProjectIdvfJkQ();
                            String strM478getModelIda6HIKFk = bellMode.m478getModelIda6HIKFk();
                            String strM477getEffort_couWBU = bellMode.m477getEffort_couWBU();
                            String strM480getThinkingModeKLP3kNA = bellMode.m480getThinkingModeKLP3kNA();
                            boolean zIsTemporary = bellMode.isTemporary();
                            a6i a6iVarA = ia0Var.a();
                            boolean zH6 = e18Var.h(f4jVar) | e18Var.h(vd3Var) | ((i & 112) == 32 || ((i & 64) != 0 && e18Var.h(claudeAppOverlay))) | e18Var.h(rweVar);
                            Object objN8 = e18Var.N();
                            if (zH6 || objN8 == lz1Var) {
                                objN8 = new f73(f4jVar, vd3Var, claudeAppOverlay, rweVar);
                                e18Var.k0(objN8);
                            }
                            com.anthropic.claude.bell.b.b(strM476getChatIdRjYBDck, strM479getProjectIdvfJkQ, strM478getModelIda6HIKFk, strM477getEffort_couWBU, strM480getThinkingModeKLP3kNA, zIsTemporary, (pz7) objN8, null, false, null, a6iVarA, null, e18Var, 0, 2944);
                            e18Var.p(false);
                        } else if (claudeAppOverlay instanceof ClaudeAppOverlay.ArtifactFullScreen) {
                            e18Var.a0(439366492);
                            ArtifactFullScreenParams params = ((ClaudeAppOverlay.ArtifactFullScreen) claudeAppOverlay).getParams();
                            boolean zH7 = e18Var.h(rweVar);
                            Object objN9 = e18Var.N();
                            if (zH7 || objN9 == lz1Var) {
                                objN9 = new kj3(rweVar, 17);
                                e18Var.k0(objN9);
                            }
                            zy7 zy7Var = (zy7) objN9;
                            boolean zH8 = e18Var.h(rweVar) | e18Var.h(zqcVar) | e18Var.h(z93Var);
                            Object objN10 = e18Var.N();
                            if (zH8 || objN10 == lz1Var) {
                                objN10 = new h1(rweVar, zqcVar, z93Var);
                                e18Var.k0(objN10);
                            }
                            ar0.a(params, zy7Var, (pz7) objN10, null, null, null, e18Var, 0);
                            e18Var.p(false);
                        } else if (claudeAppOverlay instanceof ClaudeAppOverlay.SharedChatFullScreen) {
                            e18Var.a0(440127294);
                            String strM492getSnapshotIdN1vkeFQ = ((ClaudeAppOverlay.SharedChatFullScreen) claudeAppOverlay).m492getSnapshotIdN1vkeFQ();
                            boolean zH9 = e18Var.h(lq0Var) | e18Var.h(rweVar);
                            Object objN11 = e18Var.N();
                            if (zH9 || objN11 == lz1Var) {
                                objN11 = new ow1(lq0Var, 20, rweVar);
                                e18Var.k0(objN11);
                            }
                            pz7 pz7Var = (pz7) objN11;
                            boolean zH10 = e18Var.h(rweVar);
                            Object objN12 = e18Var.N();
                            if (zH10 || objN12 == lz1Var) {
                                objN12 = new kj3(rweVar, 18);
                                e18Var.k0(objN12);
                            }
                            k.a(strM492getSnapshotIdN1vkeFQ, pz7Var, null, null, (zy7) objN12, e18Var, 0);
                            e18Var.p(false);
                        } else if (claudeAppOverlay.equals(ClaudeAppOverlay.VoiceSettings.INSTANCE)) {
                            e18Var.a0(441304984);
                            boolean zH11 = e18Var.h(rweVar);
                            Object objN13 = e18Var.N();
                            if (zH11 || objN13 == lz1Var) {
                                objN13 = new kj3(rweVar, 19);
                                e18Var.k0(objN13);
                            }
                            hkk.c((zy7) objN13, null, null, null, e18Var, 0);
                            e18Var.p(false);
                        } else if (claudeAppOverlay.equals(ClaudeAppOverlay.CreateProject.INSTANCE)) {
                            e18Var.a0(441489527);
                            boolean zH12 = e18Var.h(rweVar) | e18Var.h(zqcVar);
                            Object objN14 = e18Var.N();
                            if (zH12 || objN14 == lz1Var) {
                                objN14 = new o5(rweVar, 29, zqcVar);
                                e18Var.k0(objN14);
                            }
                            bz7 bz7Var3 = (bz7) objN14;
                            boolean zH13 = e18Var.h(rweVar);
                            Object objN15 = e18Var.N();
                            if (zH13 || objN15 == lz1Var) {
                                objN15 = new kj3(rweVar, 20);
                                e18Var.k0(objN15);
                            }
                            yuk.b(bz7Var3, (zy7) objN15, null, null, null, null, e18Var, 0);
                            e18Var.p(false);
                        } else if (claudeAppOverlay instanceof ClaudeAppOverlay.MemoryPreview) {
                            e18Var.a0(442159344);
                            ClaudeAppOverlay.MemoryPreview memoryPreview = (ClaudeAppOverlay.MemoryPreview) claudeAppOverlay;
                            String memorySynthesis = memoryPreview.getMemorySynthesis();
                            Date updatedAt = memoryPreview.getUpdatedAt();
                            String strM488getProjectIdvfJkQ = memoryPreview.m488getProjectIdvfJkQ();
                            boolean zH14 = e18Var.h(rweVar);
                            Object objN16 = e18Var.N();
                            if (zH14 || objN16 == lz1Var) {
                                objN16 = new kj3(rweVar, 21);
                                e18Var.k0(objN16);
                            }
                            sqk.c(memorySynthesis, updatedAt, strM488getProjectIdvfJkQ, (zy7) objN16, null, null, null, e18Var, 0);
                            e18Var.p(false);
                        } else if (claudeAppOverlay.equals(ClaudeAppOverlay.CreateEnvironment.INSTANCE)) {
                            e18Var.a0(442509644);
                            boolean zH15 = e18Var.h(rweVar);
                            Object objN17 = e18Var.N();
                            if (zH15 || objN17 == lz1Var) {
                                objN17 = new kj3(rweVar, 22);
                                e18Var.k0(objN17);
                            }
                            zy7 zy7Var2 = (zy7) objN17;
                            boolean zH16 = e18Var.h(rweVar);
                            Object objN18 = e18Var.N();
                            if (zH16 || objN18 == lz1Var) {
                                objN18 = new kj3(rweVar, 23);
                                e18Var.k0(objN18);
                            }
                            fwj.a(null, jwfVar, bVar, aVar, zy7Var2, (zy7) objN18, false, androidx.compose.foundation.layout.b.c, e18Var, 14159878);
                            e18Var.p(false);
                        } else if (claudeAppOverlay instanceof ClaudeAppOverlay.ImageGalleryFullScreen) {
                            e18Var.a0(443200851);
                            boolean zH17 = e18Var.h(rweVar);
                            Object objN19 = e18Var.N();
                            if (zH17 || objN19 == lz1Var) {
                                objN19 = new kj3(rweVar, 14);
                                e18Var.k0(objN19);
                            }
                            e3g.b(ia0Var, (zy7) objN19, fd9.q0(673616482, new ow1(claudeAppOverlay, 19, rweVar), e18Var), e18Var, (i & 14) | 384);
                            e18Var.p(false);
                        } else {
                            if (!(claudeAppOverlay instanceof ClaudeAppOverlay.FeedbackSheet)) {
                                throw kgh.s(e18Var, 1538029371, false);
                            }
                            e18Var.a0(443616189);
                            MobileAppFeedbackEvents$FeedbackType mobileAppFeedbackEvents$FeedbackType = MobileAppFeedbackEvents$FeedbackType.BUG_REPORT;
                            String initialScreenshotUri = ((ClaudeAppOverlay.FeedbackSheet) claudeAppOverlay).getInitialScreenshotUri();
                            Uri uri = initialScreenshotUri != null ? Uri.parse(initialScreenshotUri) : null;
                            FillElement fillElement = androidx.compose.foundation.layout.b.c;
                            boolean zH18 = e18Var.h(rweVar);
                            Object objN20 = e18Var.N();
                            if (zH18 || objN20 == lz1Var) {
                                objN20 = new kj3(rweVar, 15);
                                e18Var.k0(objN20);
                            }
                            dlk.d((zy7) objN20, fillElement, mobileAppFeedbackEvents$FeedbackType, uri, null, null, e18Var, 432, 48);
                            e18Var.p(false);
                        }
                    }
                }
                return ieiVar;
        }
    }

    public /* synthetic */ j93(rwe rweVar, zqc zqcVar, z93 z93Var, pkc pkcVar, l45 l45Var, lq0 lq0Var, jwf jwfVar, b bVar, a aVar) {
        this.F = rweVar;
        this.H = zqcVar;
        this.I = z93Var;
        this.J = pkcVar;
        this.G = l45Var;
        this.K = lq0Var;
        this.L = jwfVar;
        this.M = bVar;
        this.N = aVar;
    }
}
