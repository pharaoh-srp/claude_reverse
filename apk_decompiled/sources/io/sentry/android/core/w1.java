package io.sentry.android.core;

/* JADX INFO: loaded from: classes3.dex */
public final class w1 implements Comparable {
    public final long E;
    public final long F;
    public final long G;
    public final long H;
    public final boolean I;
    public final boolean J;
    public final long K;

    public w1(long j, long j2, long j3, long j4, boolean z, boolean z2, long j5) {
        this.E = j;
        this.F = j2;
        this.G = j3;
        this.H = j4;
        this.I = z;
        this.J = z2;
        this.K = j5;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.F, ((w1) obj).F);
    }

    public w1(long j) {
        this(j, j, 0L, 0L, false, false, 0L);
    }
}
