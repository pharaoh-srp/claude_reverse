package defpackage;

import android.widget.PopupWindow;

/* JADX INFO: loaded from: classes2.dex */
public final class ndb implements PopupWindow.OnDismissListener {
    public final /* synthetic */ odb E;

    public ndb(odb odbVar) {
        this.E = odbVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.E.c();
    }
}
