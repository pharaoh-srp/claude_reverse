package defpackage;

import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.view.Choreographer;
import android.view.Choreographer$VsyncCallback;

/* JADX INFO: loaded from: classes2.dex */
public final class pui extends nui implements Choreographer$VsyncCallback {
    public final Handler I;

    public pui(Choreographer choreographer, DisplayManager displayManager) {
        super(choreographer, displayManager);
        this.I = tpi.k(null);
    }

    @Override // defpackage.nui
    public final void a() {
        this.F.registerDisplayListener(this, tpi.k(null));
        this.E.postVsyncCallback(this);
    }

    @Override // defpackage.nui
    public final void b() {
        this.F.unregisterDisplayListener(this);
        this.I.removeCallbacksAndMessages(null);
        this.E.removeVsyncCallback(this);
        this.G = -9223372036854775807L;
        this.H = -9223372036854775807L;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        if (i == 0) {
            this.E.postVsyncCallback(this);
        }
    }

    public final void onVsync(Choreographer.FrameData frameData) {
        this.G = frameData.getFrameTimeNanos();
        Choreographer.FrameTimeline[] frameTimelines = frameData.getFrameTimelines();
        if (frameTimelines.length >= 2) {
            long expectedPresentationTimeNanos = frameTimelines[1].getExpectedPresentationTimeNanos() - frameTimelines[0].getExpectedPresentationTimeNanos();
            this.H = expectedPresentationTimeNanos != 0 ? expectedPresentationTimeNanos : -9223372036854775807L;
        } else {
            this.H = -9223372036854775807L;
        }
        this.I.postDelayed(new pya(11, this), 500L);
    }
}
