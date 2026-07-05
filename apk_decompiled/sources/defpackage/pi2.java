package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class pi2 implements Iterator, mm9 {
    public final int E;
    public final int F;
    public boolean G;
    public int H;

    public pi2(char c, char c2, int i) {
        this.E = i;
        this.F = c2;
        boolean z = false;
        if (i <= 0 ? c >= c2 : c <= c2) {
            z = true;
        }
        this.G = z;
        this.H = z ? c : c2;
    }

    public final char a() {
        int i = this.H;
        if (i != this.F) {
            this.H = this.E + i;
        } else {
            if (!this.G) {
                pmf.d();
                return (char) 0;
            }
            this.G = false;
        }
        return (char) i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.G;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return Character.valueOf(a());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
