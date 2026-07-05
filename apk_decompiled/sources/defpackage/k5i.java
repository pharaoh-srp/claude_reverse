package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class k5i implements Iterator, mm9 {
    public final Iterator E;
    public final /* synthetic */ l5i F;

    public k5i(l5i l5iVar) {
        this.F = l5iVar;
        this.E = l5iVar.a.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.E.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.F.b.invoke(this.E.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
