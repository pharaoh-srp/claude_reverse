package defpackage;

import android.app.UiModeManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.anthropic.claude.analytics.events.SettingsEvents$SettingsHapticFeedbackToggle;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class lzf implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ izf F;

    public /* synthetic */ lzf(izf izfVar, int i) {
        this.E = i;
        this.F = izfVar;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        ek0 ek0Var;
        int i;
        int i2 = this.E;
        iei ieiVar = iei.a;
        izf izfVar = this.F;
        switch (i2) {
            case 0:
                Boolean bool = (Boolean) obj;
                boolean zBooleanValue = bool.booleanValue();
                fk0 fk0Var = izfVar.c;
                if (zBooleanValue != fk0Var.n()) {
                    fk0Var.r.setValue(bool);
                    vb7.B(fk0Var.a, "haptic_feedback_enabled", zBooleanValue);
                    izfVar.b.e(new SettingsEvents$SettingsHapticFeedbackToggle(zBooleanValue), SettingsEvents$SettingsHapticFeedbackToggle.Companion.serializer());
                }
                return ieiVar;
            case 1:
                ek0 ek0Var2 = (ek0) obj;
                ek0Var2.getClass();
                izfVar.getClass();
                fk0 fk0Var2 = izfVar.c;
                if (Build.VERSION.SDK_INT >= 31) {
                    ek0Var = (ek0) fk0Var2.q.getValue();
                } else {
                    fk0Var2.getClass();
                    ek0Var = ek0.G;
                }
                if (ek0Var2 == ek0Var) {
                    return ieiVar;
                }
                fk0Var2.q.setValue(ek0Var2);
                SharedPreferences.Editor editorEdit = fk0Var2.a.edit();
                editorEdit.putString("theme_color_mode", ek0Var2.E);
                editorEdit.apply();
                Context context = x44.d;
                if (context != null) {
                    UiModeManager uiModeManager = (UiModeManager) context.getSystemService(UiModeManager.class);
                    if (uiModeManager == null) {
                        return ieiVar;
                    }
                    int iOrdinal = ek0Var2.ordinal();
                    if (iOrdinal != 0) {
                        i = 1;
                        if (iOrdinal != 1) {
                            i = 2;
                            if (iOrdinal != 2) {
                                wg6.i();
                            }
                        }
                    } else {
                        i = 0;
                    }
                    uiModeManager.setApplicationNightMode(i);
                    return ieiVar;
                }
                sz6.j("Context not initialized");
                return null;
            default:
                dk0 dk0Var = (dk0) obj;
                dk0Var.getClass();
                izfVar.getClass();
                fk0 fk0Var3 = izfVar.c;
                if (dk0Var != ((dk0) fk0Var3.u.getValue())) {
                    fk0Var3.u.setValue(dk0Var);
                    SharedPreferences.Editor editorEdit2 = fk0Var3.a.edit();
                    editorEdit2.putString("font_style", dk0Var.E);
                    editorEdit2.apply();
                }
                return ieiVar;
        }
    }
}
