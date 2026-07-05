package androidx.media3.exoplayer.drm;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class DrmSession$DrmSessionException extends IOException {
    public final int E;

    public DrmSession$DrmSessionException(Throwable th, int i) {
        super(th);
        this.E = i;
    }
}
