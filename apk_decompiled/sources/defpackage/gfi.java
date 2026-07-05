package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class gfi implements Iterator {
    public final /* synthetic */ int E;
    public Iterator F;

    public gfi(ifi ifiVar) {
        this.E = 1;
        this.F = ifiVar.E.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.E) {
        }
        return this.F.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.E) {
        }
        return (String) this.F.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.E) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public /* synthetic */ gfi(int i) {
        this.E = i;
    }
}
