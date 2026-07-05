package io.sentry.android.core.internal.util;

/* JADX INFO: loaded from: classes3.dex */
public final class n implements Comparable {
    public final long E;
    public final long F;

    public n(long j, long j2) {
        this.E = j;
        this.F = j2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        n nVar = (n) obj;
        int iCompare = Long.compare(this.F, nVar.F);
        return iCompare != 0 ? iCompare : Long.compare(this.E, nVar.E);
    }

    public n(long j) {
        this(j, j);
    }
}
