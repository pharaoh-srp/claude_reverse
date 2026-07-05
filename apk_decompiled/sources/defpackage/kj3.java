package defpackage;

import androidx.health.platform.client.proto.g;
import com.anthropic.claude.analytics.events.GroveEvents$GroveLocation;
import com.anthropic.claude.app.ClaudeAppOverlay;
import com.anthropic.claude.app.main.MainAppScreens;
import com.anthropic.claude.app.main.loggedin.LoggedInScreens;
import com.anthropic.claude.login.LoginScreens;
import com.anthropic.claude.login.WelcomeNotice;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kj3 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ rwe F;

    public /* synthetic */ kj3(rwe rweVar, int i) {
        this.E = i;
        this.F = rweVar;
    }

    @Override // defpackage.zy7
    public final Object a() {
        boolean z;
        int i = this.E;
        boolean z2 = false;
        iei ieiVar = iei.a;
        rwe rweVar = this.F;
        switch (i) {
            case 0:
                oj3 oj3Var = new oj3(new ClaudeAppOverlay.UpgradeToProBottomSheet((fji) null, (String) null, (String) null, 7, (mq5) null), 3);
                j83 j83Var = new j83(29);
                rweVar.getClass();
                rweVar.E.m(oj3Var, j83Var);
                return ieiVar;
            case 1:
                jx2 jx2Var = new jx2(8, ClaudeAppOverlay.CreateEnvironment.INSTANCE);
                j83 j83Var2 = new j83(23);
                rweVar.getClass();
                rweVar.E.m(jx2Var, j83Var2);
                return ieiVar;
            case 2:
                oj3 oj3Var2 = new oj3(new ClaudeAppOverlay.UpgradeToProBottomSheet((fji) null, (String) null, (String) null, 7, (mq5) null), 1);
                j83 j83Var3 = new j83(24);
                rweVar.getClass();
                rweVar.E.m(oj3Var2, j83Var3);
                return ieiVar;
            case 3:
                oj3 oj3Var3 = new oj3(new ClaudeAppOverlay.UpgradeToProBottomSheet((fji) null, (String) null, (String) null, 7, (mq5) null), 2);
                j83 j83Var4 = new j83(25);
                rweVar.getClass();
                rweVar.E.m(oj3Var3, j83Var4);
                return ieiVar;
            case 4:
                sj3 sj3Var = new sj3(new ClaudeAppOverlay.GroveNoticeBottomSheet(GroveEvents$GroveLocation.SETTINGS), 0);
                j83 j83Var5 = new j83(27);
                rweVar.getClass();
                rweVar.E.m(sj3Var, j83Var5);
                return ieiVar;
            case 5:
                jx2 jx2Var2 = new jx2(9, ClaudeAppOverlay.VoiceSettings.INSTANCE);
                j83 j83Var6 = new j83(28);
                rweVar.getClass();
                rweVar.E.m(jx2Var2, j83Var6);
                return ieiVar;
            case 6:
                sj3 sj3Var2 = new sj3(new ClaudeAppOverlay.GroveNoticeBottomSheet(GroveEvents$GroveLocation.POLICY_UPDATE_MODAL), 1);
                tj3 tj3Var = new tj3(1);
                rweVar.getClass();
                rweVar.E.m(sj3Var2, tj3Var);
                return ieiVar;
            case 7:
                jx2 jx2Var3 = new jx2(5, ClaudeAppOverlay.CreateProject.INSTANCE);
                j83 j83Var7 = new j83(18);
                rweVar.getClass();
                rweVar.E.m(jx2Var3, j83Var7);
                return ieiVar;
            case 8:
                jx2 jx2Var4 = new jx2(6, ClaudeAppOverlay.CreateEnvironment.INSTANCE);
                j83 j83Var8 = new j83(20);
                rweVar.getClass();
                rweVar.E.m(jx2Var4, j83Var8);
                return ieiVar;
            case 9:
                z = !(iv1.t(rweVar) instanceof j2g);
                break;
            case 10:
                z = iv1.t(rweVar) instanceof ClaudeAppOverlay.FeedbackSheet;
                break;
            case 11:
                rweVar.E.m(new lk3(new ClaudeAppOverlay.FeedbackSheet((String) null, 1, (mq5) null), 0), new tj3(3));
                return ieiVar;
            case 12:
                z = iv1.t(rweVar) instanceof ClaudeAppOverlay.FeedbackSheet;
                break;
            case 13:
                ClaudeAppOverlay claudeAppOverlay = (ClaudeAppOverlay) iv1.t(rweVar);
                if (!x44.r(claudeAppOverlay, ClaudeAppOverlay.None.INSTANCE) && !(claudeAppOverlay instanceof ClaudeAppOverlay.UpgradeToProBottomSheet) && !(claudeAppOverlay instanceof ClaudeAppOverlay.ExperienceSpotlightSheet) && !(claudeAppOverlay instanceof ClaudeAppOverlay.GroveNoticeBottomSheet) && !(claudeAppOverlay instanceof ClaudeAppOverlay.BellMode) && !(claudeAppOverlay instanceof ClaudeAppOverlay.ArtifactFullScreen) && !(claudeAppOverlay instanceof ClaudeAppOverlay.SharedChatFullScreen) && !x44.r(claudeAppOverlay, ClaudeAppOverlay.VoiceSettings.INSTANCE)) {
                    if (x44.r(claudeAppOverlay, ClaudeAppOverlay.CreateProject.INSTANCE) || (claudeAppOverlay instanceof ClaudeAppOverlay.MemoryPreview)) {
                        z2 = true;
                    } else if (!x44.r(claudeAppOverlay, ClaudeAppOverlay.CreateEnvironment.INSTANCE) && !(claudeAppOverlay instanceof ClaudeAppOverlay.ImageGalleryFullScreen) && !(claudeAppOverlay instanceof ClaudeAppOverlay.FeedbackSheet)) {
                        mr9.b();
                        return null;
                    }
                }
                return Boolean.valueOf(z2);
            case 14:
                rweVar.E.m(hr0.Z, new tj3(15));
                return ieiVar;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                rweVar.E.m(hr0.b0, new tj3(17));
                return ieiVar;
            case 16:
                rweVar.E.m(hr0.S, new tj3(8));
                return ieiVar;
            case g.MAX_FIELD_NUMBER /* 17 */:
                rweVar.E.m(hr0.f0, new tj3(22));
                return ieiVar;
            case g.AVG_FIELD_NUMBER /* 18 */:
                rweVar.E.m(hr0.g0, new tj3(24));
                return ieiVar;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                rweVar.E.m(hr0.T, new tj3(9));
                return ieiVar;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                rweVar.E.m(hr0.V, new tj3(11));
                return ieiVar;
            case 21:
                rweVar.E.m(hr0.W, new tj3(12));
                return ieiVar;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                rweVar.E.m(hr0.X, new tj3(13));
                return ieiVar;
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                rweVar.E.m(hr0.Y, new tj3(14));
                return ieiVar;
            case 24:
                rweVar.E.m(new jga(2, new LoggedInScreens[]{LoggedInScreens.ClaudeApp.INSTANCE}), new ae5(17));
                return ieiVar;
            case BuildConfig.VERSION_CODE /* 25 */:
                rweVar.E.m(new jga(4, new LoginScreens[]{LoginScreens.MinorBlocked.INSTANCE}), new ae5(21));
                return ieiVar;
            case 26:
                rweVar.E.m(new jga(5, new LoginScreens[]{LoginScreens.MinorBlocked.INSTANCE}), new ae5(22));
                return ieiVar;
            case 27:
                rweVar.E.m(new jga(6, new LoginScreens[]{new LoginScreens.Welcome((WelcomeNotice) null, 1, (mq5) null)}), new ae5(23));
                return ieiVar;
            case 28:
                rweVar.E.m(new jx2(17, MainAppScreens.InternalSettings.INSTANCE), new ppa(5));
                return ieiVar;
            default:
                zsk.g(rweVar, MainAppScreens.InternalSettings.INSTANCE);
                return ieiVar;
        }
        return Boolean.valueOf(z);
    }
}
