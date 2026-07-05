package defpackage;

import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityManager$AccessibilityServicesStateChangeListener;

/* JADX INFO: loaded from: classes2.dex */
public final class aba implements AccessibilityManager$AccessibilityServicesStateChangeListener {
    public final lsc a;
    public final lsc b;

    public aba(cba cbaVar) {
        Boolean bool = Boolean.FALSE;
        this.a = mpk.P(bool);
        this.b = mpk.P(bool);
    }

    public final void onAccessibilityServicesStateChanged(AccessibilityManager accessibilityManager) {
        this.a.setValue(Boolean.valueOf(cba.a(accessibilityManager)));
        this.b.setValue(Boolean.valueOf(cba.d(accessibilityManager)));
    }
}
