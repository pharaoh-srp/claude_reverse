package defpackage;

import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.work.impl.WorkDatabase_Impl;
import com.anthropic.claude.api.account.VillageWeaverConsentState;
import com.anthropic.claude.api.chat.messages.VoiceNoteBlock;
import com.anthropic.claude.bell.VoiceSessionSummary;
import com.anthropic.claude.models.organization.configtypes.WidgetToolConfig;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class poi implements zy7 {
    public final /* synthetic */ int E;

    public /* synthetic */ poi(WorkDatabase_Impl workDatabase_Impl) {
        this.E = 6;
    }

    @Override // defpackage.zy7
    public final Object a() {
        WindowLayoutComponent windowLayoutComponentA;
        switch (this.E) {
            case 0:
                throw new IllegalStateException("No UserSession provided");
            case 1:
                return VillageWeaverConsentState._init_$_anonymous_();
            case 2:
                return VoiceNoteBlock._childSerializers$_anonymous_();
            case 3:
                return VoiceSessionSummary._childSerializers$_anonymous_();
            case 4:
                return WidgetToolConfig._childSerializers$_anonymous_();
            case 5:
                try {
                    ClassLoader classLoader = vbj.class.getClassLoader();
                    r3f r3fVar = classLoader != null ? new r3f(classLoader, new n78(classLoader)) : null;
                    if (r3fVar == null || (windowLayoutComponentA = r3fVar.a()) == null) {
                        return null;
                    }
                    n78 n78Var = new n78(classLoader);
                    int iA = hd7.a();
                    return iA >= 9 ? new fd7(windowLayoutComponentA, n78Var) : iA >= 6 ? new ed7(windowLayoutComponentA, n78Var) : iA >= 2 ? new dd7(windowLayoutComponentA, n78Var) : iA == 1 ? new cd7(windowLayoutComponentA, n78Var) : new ad7();
                } catch (Throwable unused) {
                    return null;
                }
            default:
                return new k2e(0);
        }
    }

    public /* synthetic */ poi(int i) {
        this.E = i;
    }
}
