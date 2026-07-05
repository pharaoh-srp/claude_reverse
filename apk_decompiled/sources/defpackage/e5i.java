package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e5i implements Iterator {
    public final Iterator E;

    public e5i(Iterator it) {
        it.getClass();
        this.E = it;
    }

    public abstract Object a(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.E.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return a(this.E.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.E.remove();
    }
}
