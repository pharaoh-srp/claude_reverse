package io.sentry.android.replay.video;

import android.media.MediaMuxer;

/* JADX INFO: loaded from: classes3.dex */
public final class b {
    public final long a;
    public final MediaMuxer b;
    public boolean c;
    public int d;
    public int e;
    public long f;

    public b(String str, float f) {
        this.a = (long) (1000000.0f / f);
        this.b = new MediaMuxer(str, 0);
    }
}
