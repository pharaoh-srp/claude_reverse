package defpackage;

import android.view.View;
import android.widget.PopupWindow;

/* JADX INFO: loaded from: classes2.dex */
public abstract class y9a {
    public static int a(PopupWindow popupWindow, View view, int i, boolean z) {
        return popupWindow.getMaxAvailableHeight(view, i, z);
    }
}
