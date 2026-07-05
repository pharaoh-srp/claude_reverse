package io.sentry.cache.tape;

import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements Iterator {
    public final i E;
    public final /* synthetic */ e F;

    public d(e eVar, i iVar) {
        this.F = eVar;
        this.E = iVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.E.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.F.G.b((byte[]) this.E.next());
    }

    @Override // java.util.Iterator
    public final void remove() throws IOException {
        this.E.remove();
    }
}
