package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class srj implements Iterator {
    public final /* synthetic */ Iterator E;

    public srj(Iterator it) {
        this.E = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.E.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return new qsj((String) this.E.next());
    }
}
