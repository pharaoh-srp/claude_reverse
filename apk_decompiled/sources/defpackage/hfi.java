package defpackage;

import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public final class hfi extends AbstractList implements s1a, RandomAccess {
    public final m1a E;

    public hfi(m1a m1aVar) {
        this.E = m1aVar;
    }

    @Override // defpackage.s1a
    public final void K(h22 h22Var) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.s1a
    public final List c() {
        return Collections.unmodifiableList(this.E.F);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return (String) this.E.get(i);
    }

    @Override // defpackage.s1a
    public final s1a i() {
        return this;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        gfi gfiVar = new gfi(0);
        gfiVar.F = this.E.iterator();
        return gfiVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        ffi ffiVar = new ffi(0);
        ffiVar.F = this.E.listIterator(i);
        return ffiVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.E.size();
    }
}
