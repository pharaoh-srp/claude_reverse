package io.sentry.android.core.performance;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public final class i implements Comparable {
    public String E;
    public long F;
    public long G;
    public long H;

    public final long a() {
        long j = this.H;
        if (j != 0) {
            return j - this.G;
        }
        return 0L;
    }

    public final boolean b() {
        return this.G != 0;
    }

    public final void c(long j) {
        this.G = j;
        this.F = System.currentTimeMillis() - (SystemClock.uptimeMillis() - this.G);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.F, ((i) obj).F);
    }
}
