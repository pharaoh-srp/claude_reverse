package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class l3 extends i2 {
    public abstract l3 a(int i, Object obj);

    @Override // defpackage.w0, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // defpackage.w0, java.util.Collection, java.util.List
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public abstract l3 e(Object obj);

    public l3 g(Collection collection) {
        pzc pzcVarH = h();
        pzcVarH.addAll(collection);
        return pzcVarH.a();
    }

    public abstract pzc h();

    @Override // defpackage.i2, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public abstract l3 k(j3 j3Var);

    public abstract l3 l(int i);

    @Override // defpackage.i2, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    public abstract l3 m(int i, Object obj);

    @Override // defpackage.i2, java.util.List
    public final List subList(int i, int i2) {
        return new lz8(this, i, i2);
    }
}
