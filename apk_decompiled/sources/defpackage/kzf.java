package defpackage;

import com.anthropic.claude.chat.share.j;
import com.anthropic.claude.settings.SettingsAppScreen;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class kzf implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ rwe F;

    public /* synthetic */ kzf(rwe rweVar, int i) {
        this.E = i;
        this.F = rweVar;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        iei ieiVar = iei.a;
        rwe rweVar = this.F;
        switch (i) {
            case 0:
                rweVar.E.m(new gyf(11, SettingsAppScreen.MobileAppFeedbackScreen.INSTANCE), new hyf(19));
                break;
            case 1:
                rweVar.E.m(new gyf(8, SettingsAppScreen.NotificationSettingsScreen.INSTANCE), new hyf(16));
                break;
            case 2:
                rweVar.E.m(new gyf(9, SettingsAppScreen.PrivacyScreen.INSTANCE), new hyf(17));
                break;
            case 3:
                rweVar.E.m(new gyf(10, SettingsAppScreen.SharedLinksScreen.INSTANCE), new hyf(18));
                break;
            case 4:
                j.b(rweVar);
                break;
            case 5:
                j.b(rweVar);
                break;
            case 6:
                j.b(rweVar);
                break;
            default:
                j.b(rweVar);
                break;
        }
        return ieiVar;
    }
}
