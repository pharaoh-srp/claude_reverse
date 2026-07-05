package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.WindowManager;

/* JADX INFO: loaded from: classes2.dex */
public final class t9d extends s9d {
    @Override // defpackage.cm4
    public final void d(View view, Rect rect) {
        Object systemService = view.getContext().getSystemService("window");
        systemService.getClass();
        rect.set(((WindowManager) systemService).getCurrentWindowMetrics().getBounds());
    }
}
