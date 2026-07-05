package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Collector;
import java.util.stream.Stream;

/* JADX INFO: loaded from: classes3.dex */
public final class ck6 extends ArrayList {
    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            ((c5c) it.next()).J();
        }
        super.clear();
    }

    @Override // java.util.ArrayList
    public final Object clone() {
        ck6 ck6Var = new ck6(size());
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            ck6Var.add(((yj6) it.next()).clone());
        }
        return ck6Var;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        c5c c5cVar = (c5c) super.remove(iIndexOf);
        c5cVar.J();
        return true;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.ArrayList, java.util.Collection
    public final boolean removeIf(Predicate predicate) {
        Iterator<E> it = iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (predicate.test((c5c) it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.ArrayList, java.util.List
    public final void replaceAll(UnaryOperator unaryOperator) {
        for (int i = 0; i < size(); i++) {
            yj6 yj6Var = (yj6) ((c5c) unaryOperator.apply((c5c) get(i)));
            pqi.p(yj6Var);
            c5c c5cVar = (c5c) super.set(i, yj6Var);
            c5cVar.M(yj6Var);
        }
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        Iterator<E> it = iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (!collection.contains((c5c) it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        yj6 yj6Var = (yj6) obj;
        pqi.p(yj6Var);
        c5c c5cVar = (c5c) super.set(i, yj6Var);
        c5cVar.M(yj6Var);
        return (yj6) c5cVar;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        Stream map = stream().map(new a41(3));
        String[] strArr = xrg.a;
        return (String) map.collect(Collector.of(new trg("\n"), new urg(), new vrg(), new a41(7), new Collector.Characteristics[0]));
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        c5c c5cVar = (c5c) super.remove(i);
        c5cVar.J();
        return (yj6) c5cVar;
    }
}
