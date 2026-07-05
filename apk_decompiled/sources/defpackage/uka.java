package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class uka implements Iterator, mm9 {
    public final long E;
    public final long F;
    public boolean G;
    public long H;

    public uka(long j, long j2, long j3) {
        this.E = j3;
        this.F = j2;
        boolean z = false;
        if (j3 <= 0 ? j >= j2 : j <= j2) {
            z = true;
        }
        this.G = z;
        this.H = z ? j : j2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.G;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return Long.valueOf(nextLong());
    }

    public final long nextLong() {
        long j = this.H;
        if (j != this.F) {
            this.H = this.E + j;
            return j;
        }
        if (this.G) {
            this.G = false;
            return j;
        }
        pmf.d();
        return 0L;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
