package defpackage;

import android.hardware.display.DisplayManager;
import android.view.Choreographer;

/* JADX INFO: loaded from: classes2.dex */
public abstract class nui implements DisplayManager.DisplayListener {
    public final Choreographer E;
    public final DisplayManager F;
    public volatile long G = -9223372036854775807L;
    public volatile long H = -9223372036854775807L;

    public nui(Choreographer choreographer, DisplayManager displayManager) {
        this.E = choreographer;
        this.F = displayManager;
    }

    public abstract void a();

    public abstract void b();

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
    }
}
