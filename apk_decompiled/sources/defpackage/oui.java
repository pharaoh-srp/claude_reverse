package defpackage;

import android.view.Choreographer;
import android.view.Display;

/* JADX INFO: loaded from: classes2.dex */
public final class oui extends nui implements Choreographer.FrameCallback {
    @Override // defpackage.nui
    public final void a() {
        long refreshRate;
        this.F.registerDisplayListener(this, tpi.k(null));
        this.E.postFrameCallback(this);
        Display display = this.F.getDisplay(0);
        if (display != null) {
            refreshRate = (long) (1.0E9d / ((double) display.getRefreshRate()));
        } else {
            ysj.u("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            refreshRate = -9223372036854775807L;
        }
        this.H = refreshRate;
    }

    @Override // defpackage.nui
    public final void b() {
        this.F.unregisterDisplayListener(this);
        this.E.removeFrameCallback(this);
        this.G = -9223372036854775807L;
        this.H = -9223372036854775807L;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.G = j;
        this.E.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        long refreshRate;
        if (i == 0) {
            this.E.postFrameCallback(this);
            Display display = this.F.getDisplay(0);
            if (display != null) {
                refreshRate = (long) (1.0E9d / ((double) display.getRefreshRate()));
            } else {
                ysj.u("VideoFrameReleaseHelper", "Unable to query display refresh rate");
                refreshRate = -9223372036854775807L;
            }
            this.H = refreshRate;
        }
    }
}
