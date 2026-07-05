package defpackage;

import android.media.AudioTrack;
import io.sentry.e0;

/* JADX INFO: loaded from: classes2.dex */
public final class a61 {
    public final z51 a;
    public final int b;
    public final ive c;
    public int d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;

    public a61(AudioTrack audioTrack, ive iveVar) {
        this.a = new z51(audioTrack);
        this.b = audioTrack.getSampleRate();
        this.c = iveVar;
        a(0);
    }

    public final void a(int i) {
        this.d = i;
        if (i == 0) {
            this.g = 0L;
            this.h = -1L;
            this.i = -9223372036854775807L;
            this.e = System.nanoTime() / 1000;
            this.f = 10000L;
            return;
        }
        if (i == 1) {
            this.f = 10000L;
            return;
        }
        if (i == 2 || i == 3) {
            this.f = 10000000L;
        } else if (i == 4) {
            this.f = 500000L;
        } else {
            e0.b();
        }
    }
}
