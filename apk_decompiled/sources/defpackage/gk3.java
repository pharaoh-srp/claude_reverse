package defpackage;

import com.anthropic.claude.app.ClaudeAppOverlay;
import com.anthropic.claude.app.i1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gk3 implements pz7 {
    public final /* synthetic */ int E = 0;
    public final /* synthetic */ zqc F;
    public final /* synthetic */ rwe G;
    public final /* synthetic */ zy7 H;
    public final /* synthetic */ iqb I;
    public final /* synthetic */ kqc J;

    public /* synthetic */ gk3(iqb iqbVar, rwe rweVar, zqc zqcVar, zy7 zy7Var, kqc kqcVar) {
        this.I = iqbVar;
        this.G = rweVar;
        this.F = zqcVar;
        this.H = zy7Var;
        this.J = kqcVar;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(1 & iIntValue, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    rwe rweVar = this.G;
                    ClaudeAppOverlay claudeAppOverlay = (ClaudeAppOverlay) iv1.t(rweVar);
                    claudeAppOverlay.getClass();
                    boolean z = claudeAppOverlay instanceof ClaudeAppOverlay.BellMode;
                    iqb iqbVar = fqb.E;
                    if (z || (claudeAppOverlay instanceof ClaudeAppOverlay.ArtifactFullScreen) || (claudeAppOverlay instanceof ClaudeAppOverlay.SharedChatFullScreen) || (claudeAppOverlay instanceof ClaudeAppOverlay.ImageGalleryFullScreen) || (claudeAppOverlay instanceof ClaudeAppOverlay.FeedbackSheet) || claudeAppOverlay.equals(ClaudeAppOverlay.VoiceSettings.INSTANCE) || claudeAppOverlay.equals(ClaudeAppOverlay.CreateEnvironment.INSTANCE)) {
                        e18Var.a0(1124647663);
                        Object objN = e18Var.N();
                        if (objN == jd4.a) {
                            objN = tjf.a(iqbVar, new a73(11));
                            e18Var.k0(objN);
                        }
                        iqbVar = (iqb) objN;
                        e18Var.p(false);
                    } else if (claudeAppOverlay.equals(ClaudeAppOverlay.None.INSTANCE) || (claudeAppOverlay instanceof ClaudeAppOverlay.UpgradeToProBottomSheet) || (claudeAppOverlay instanceof ClaudeAppOverlay.GroveNoticeBottomSheet) || (claudeAppOverlay instanceof ClaudeAppOverlay.ExperienceSpotlightSheet) || claudeAppOverlay.equals(ClaudeAppOverlay.CreateProject.INSTANCE) || (claudeAppOverlay instanceof ClaudeAppOverlay.MemoryPreview)) {
                        e18Var.a0(1124753621);
                        e18Var.p(false);
                    } else {
                        mr9.b();
                    }
                    iqb iqbVarB = this.I.B(iqbVar);
                    zqc zqcVar = this.F;
                    wk3.b(zqcVar, rweVar, this.H, iqbVarB, this.J, e18Var, 0);
                    i1.a(rweVar, zqcVar, null, null, null, null, null, null, e18Var, 0);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                wk3.b(this.F, this.G, this.H, this.I, this.J, (ld4) obj, x44.p0(1));
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ gk3(zqc zqcVar, rwe rweVar, zy7 zy7Var, iqb iqbVar, kqc kqcVar, int i) {
        this.F = zqcVar;
        this.G = rweVar;
        this.H = zy7Var;
        this.I = iqbVar;
        this.J = kqcVar;
    }
}
