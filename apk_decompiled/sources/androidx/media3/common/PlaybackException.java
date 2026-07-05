package androidx.media3.common;

import defpackage.ebh;
import defpackage.tpi;

/* JADX INFO: loaded from: classes2.dex */
public class PlaybackException extends Exception {
    public final int E;
    public final long F;

    static {
        ebh.w(0, 1, 2, 3, 4);
        tpi.w(5);
    }

    public PlaybackException(String str, Throwable th, int i, long j) {
        super(str, th);
        this.E = i;
        this.F = j;
    }
}
