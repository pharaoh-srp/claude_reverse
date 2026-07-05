package defpackage;

import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public final class jfi extends AbstractList implements r1a, RandomAccess {
    public final o1a E;

    public jfi(o1a o1aVar) {
        this.E = o1aVar;
    }

    @Override // defpackage.r1a
    public final void T(k22 k22Var) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.r1a
    public final Object b0(int i) {
        return this.E.F.get(i);
    }

    @Override // defpackage.r1a
    public final List c() {
        return Collections.unmodifiableList(this.E.F);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return (String) this.E.get(i);
    }

    @Override // defpackage.r1a
    public final r1a i() {
        return this;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        gfi gfiVar = new gfi(2);
        gfiVar.F = this.E.iterator();
        return gfiVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        ffi ffiVar = new ffi(2);
        ffiVar.F = this.E.listIterator(i);
        return ffiVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.E.size();
    }
}
