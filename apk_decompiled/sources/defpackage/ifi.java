package defpackage;

import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class ifi extends AbstractList implements RandomAccess, t1a {
    public final n1a E;

    public ifi(n1a n1aVar) {
        this.E = n1aVar;
    }

    @Override // defpackage.t1a
    public final l22 R(int i) {
        return this.E.R(i);
    }

    @Override // defpackage.t1a
    public final void S(oba obaVar) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.t1a
    public final List c() {
        return Collections.unmodifiableList(this.E.E);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return (String) this.E.get(i);
    }

    @Override // defpackage.t1a
    public final ifi i() {
        return this;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new gfi(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new ffi(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.E.size();
    }
}
