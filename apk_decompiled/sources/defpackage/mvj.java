package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class mvj implements Iterator {
    public Iterator E;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.E.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return (String) this.E.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
