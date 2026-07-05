package io.sentry.android.core;

import defpackage.eb1;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes.dex */
public final class n1 extends eb1 {
    @Override // defpackage.eb1
    public final void h(boolean z) {
        super.h(z);
        if (z) {
            a("android.webkit.WebView");
            a("android.widget.VideoView");
            a("androidx.camera.view.PreviewView");
            a("androidx.media3.ui.PlayerView");
            a("com.google.android.exoplayer2.ui.PlayerView");
            a("com.google.android.exoplayer2.ui.StyledPlayerView");
            return;
        }
        CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) this.a;
        copyOnWriteArraySet.remove("android.webkit.WebView");
        copyOnWriteArraySet.remove("android.widget.VideoView");
        copyOnWriteArraySet.remove("androidx.camera.view.PreviewView");
        copyOnWriteArraySet.remove("androidx.media3.ui.PlayerView");
        copyOnWriteArraySet.remove("com.google.android.exoplayer2.ui.PlayerView");
        copyOnWriteArraySet.remove("com.google.android.exoplayer2.ui.StyledPlayerView");
    }

    @Override // defpackage.eb1
    public final void k() {
    }
}
