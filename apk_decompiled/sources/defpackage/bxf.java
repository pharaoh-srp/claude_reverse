package defpackage;

import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes3.dex */
public final class bxf extends axf implements SortedSet {
    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return ((SortedSet) this.E).comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        Iterator it = this.E.iterator();
        it.getClass();
        hbd hbdVar = this.F;
        hbdVar.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            if (hbdVar.apply(next)) {
                return next;
            }
        }
        pmf.d();
        return null;
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return new bxf(((SortedSet) this.E).headSet(obj), this.F);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        SortedSet sortedSetHeadSet = (SortedSet) this.E;
        while (true) {
            Object objLast = sortedSetHeadSet.last();
            if (this.F.apply(objLast)) {
                return objLast;
            }
            sortedSetHeadSet = sortedSetHeadSet.headSet(objLast);
        }
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return new bxf(((SortedSet) this.E).subSet(obj, obj2), this.F);
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return new bxf(((SortedSet) this.E).tailSet(obj), this.F);
    }
}
