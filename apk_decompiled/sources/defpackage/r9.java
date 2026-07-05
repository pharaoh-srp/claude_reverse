package defpackage;

import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes2.dex */
public final class r9 implements Runnable {
    public final /* synthetic */ int E;
    public final /* synthetic */ ActionBarOverlayLayout F;

    public /* synthetic */ r9(ActionBarOverlayLayout actionBarOverlayLayout, int i) {
        this.E = i;
        this.F = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.E;
        ActionBarOverlayLayout actionBarOverlayLayout = this.F;
        switch (i) {
            case 0:
                actionBarOverlayLayout.c();
                actionBarOverlayLayout.d0 = actionBarOverlayLayout.H.animate().translationY(MTTypesetterKt.kLineSkipLimitMultiplier).setListener(actionBarOverlayLayout.e0);
                break;
            default:
                actionBarOverlayLayout.c();
                actionBarOverlayLayout.d0 = actionBarOverlayLayout.H.animate().translationY(-actionBarOverlayLayout.H.getHeight()).setListener(actionBarOverlayLayout.e0);
                break;
        }
    }
}
