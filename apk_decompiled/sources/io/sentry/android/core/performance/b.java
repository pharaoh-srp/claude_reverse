package io.sentry.android.core.performance;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Comparable {
    public final i E = new i();
    public final i F = new i();

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        b bVar = (b) obj;
        int iCompare = Long.compare(this.E.G, bVar.E.G);
        return iCompare == 0 ? Long.compare(this.F.G, bVar.F.G) : iCompare;
    }
}
