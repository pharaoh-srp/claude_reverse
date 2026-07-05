package defpackage;

import android.view.accessibility.AccessibilityManager;

/* JADX INFO: loaded from: classes2.dex */
public final class bba implements AccessibilityManager.TouchExplorationStateChangeListener {
    public final lsc E = mpk.P(Boolean.FALSE);

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        this.E.setValue(Boolean.valueOf(z));
    }
}
