package defpackage;

import android.widget.AbsListView;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ah6 {
    public static boolean a(AbsListView absListView) {
        return absListView.isSelectedChildViewEnabled();
    }

    public static void b(AbsListView absListView, boolean z) {
        absListView.setSelectedChildViewEnabled(z);
    }
}
