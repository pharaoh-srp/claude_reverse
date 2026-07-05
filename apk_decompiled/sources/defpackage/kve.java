package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class kve implements Iterator {
    public final a6c E;
    public m31 F;
    public int G;

    public kve(lve lveVar) {
        a6c a6cVar = new a6c(lveVar);
        this.E = a6cVar;
        this.F = new m31(a6cVar.a());
        this.G = lveVar.F;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.G > 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.F.hasNext()) {
            this.F = new m31(this.E.a());
        }
        this.G--;
        return Byte.valueOf(this.F.a());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
