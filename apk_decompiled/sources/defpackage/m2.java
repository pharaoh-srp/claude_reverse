package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class m2 implements Iterator {
    public final Iterator E;
    public Object F = null;
    public Collection G = null;
    public Iterator H = rc9.E;
    public final /* synthetic */ dub I;

    public m2(dub dubVar) {
        this.I = dubVar;
        this.E = dubVar.H.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.E.hasNext() || this.H.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.H.hasNext()) {
            Map.Entry entry = (Map.Entry) this.E.next();
            this.F = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.G = collection;
            this.H = collection.iterator();
        }
        return this.H.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.H.remove();
        Collection collection = this.G;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.E.remove();
        }
        dub dubVar = this.I;
        dubVar.I--;
    }
}
