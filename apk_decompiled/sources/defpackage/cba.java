package defpackage;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.os.Build;
import android.view.accessibility.AccessibilityManager;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class cba implements AccessibilityManager.AccessibilityStateChangeListener, wlg {
    public final boolean E;
    public final boolean F;
    public final lsc G = mpk.P(Boolean.FALSE);
    public final bba H;
    public final aba I;

    public cba(boolean z, boolean z2, boolean z3) {
        this.E = z2;
        this.F = z3;
        aba abaVar = null;
        this.H = z ? new bba() : null;
        if ((z2 || z3) && Build.VERSION.SDK_INT >= 33) {
            abaVar = new aba(this);
        }
        this.I = abaVar;
    }

    public static boolean a(AccessibilityManager accessibilityManager) {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16);
        int size = enabledAccessibilityServiceList.size();
        for (int i = 0; i < size; i++) {
            String settingsActivityName = enabledAccessibilityServiceList.get(i).getSettingsActivityName();
            if (settingsActivityName != null && bsg.u0(settingsActivityName, "SwitchAccess", true)) {
                return true;
            }
        }
        return false;
    }

    public static boolean d(AccessibilityManager accessibilityManager) {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16);
        int size = enabledAccessibilityServiceList.size();
        for (int i = 0; i < size; i++) {
            String settingsActivityName = enabledAccessibilityServiceList.get(i).getSettingsActivityName();
            if (settingsActivityName != null && bsg.u0(settingsActivityName, "VoiceAccess", true)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    @Override // defpackage.wlg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getValue() {
        /*
            r3 = this;
            lsc r0 = r3.G
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L4e
            r0 = 1
            bba r1 = r3.H
            if (r1 == 0) goto L22
            lsc r1 = r1.E
            java.lang.Object r1 = r1.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != r0) goto L22
            goto L4f
        L22:
            boolean r1 = r3.E
            aba r2 = r3.I
            if (r1 == 0) goto L39
            if (r2 == 0) goto L39
            lsc r1 = r2.a
            java.lang.Object r1 = r1.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != r0) goto L39
            goto L4f
        L39:
            boolean r3 = r3.F
            if (r3 == 0) goto L4e
            if (r2 == 0) goto L4e
            lsc r3 = r2.b
            java.lang.Object r3 = r3.getValue()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 != r0) goto L4e
            goto L4f
        L4e:
            r0 = 0
        L4f:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cba.getValue():java.lang.Object");
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z) {
        this.G.setValue(Boolean.valueOf(z));
    }
}
