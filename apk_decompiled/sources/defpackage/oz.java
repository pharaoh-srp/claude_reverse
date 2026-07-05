package defpackage;

import android.os.Trace;
import android.view.MotionEvent;
import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class oz implements Runnable {
    public final /* synthetic */ int E;
    public final /* synthetic */ AndroidComposeView F;

    public /* synthetic */ oz(AndroidComposeView androidComposeView, int i) {
        this.E = i;
        this.F = androidComposeView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.E;
        AndroidComposeView androidComposeView = this.F;
        switch (i) {
            case 0:
                qo0 qo0Var = androidComposeView.M;
                Class cls = AndroidComposeView.r1;
                Trace.beginSection("AndroidOwner:outOfFrameExecutor");
                while (!qo0Var.isEmpty()) {
                    try {
                        ((zy7) qo0Var.removeLast()).a();
                    } finally {
                        Trace.endSection();
                    }
                    break;
                }
                return;
            default:
                androidComposeView.i1 = false;
                MotionEvent motionEvent = androidComposeView.a1;
                motionEvent.getClass();
                if (motionEvent.getActionMasked() == 10) {
                    androidComposeView.H(motionEvent);
                    return;
                } else {
                    sz6.j("The ACTION_HOVER_EXIT event was not cleared.");
                    return;
                }
        }
    }
}
