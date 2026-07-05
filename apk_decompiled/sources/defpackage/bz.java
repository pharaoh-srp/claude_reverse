package defpackage;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;

/* JADX INFO: loaded from: classes.dex */
public final class bz implements s5 {
    public final AccessibilityManager a;

    public bz(Context context) {
        Object systemService = context.getSystemService("accessibility");
        systemService.getClass();
        this.a = (AccessibilityManager) systemService;
    }
}
