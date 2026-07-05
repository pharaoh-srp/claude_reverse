package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class dqj implements Iterator {
    public final /* synthetic */ Iterator E;
    public final /* synthetic */ Iterator F;

    public dqj(Iterator it, Iterator it2) {
        this.E = it;
        this.F = it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.E.hasNext()) {
            return true;
        }
        return this.F.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        Iterator it = this.E;
        if (it.hasNext()) {
            return new qsj(((Integer) it.next()).toString());
        }
        Iterator it2 = this.F;
        if (it2.hasNext()) {
            return new qsj((String) it2.next());
        }
        pmf.d();
        return null;
    }
}
