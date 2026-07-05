package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class pwf extends h3 implements Serializable {
    public static final pwf F = new pwf(lqa.R);
    public final lqa E;

    public pwf() {
        this.E = new lqa();
    }

    @Override // defpackage.h3
    public final int a() {
        return this.E.M;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        return this.E.a(obj) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        collection.getClass();
        this.E.d();
        return super.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.E.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.E.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.E.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        lqa lqaVar = this.E;
        lqaVar.getClass();
        return new jqa(lqaVar, 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        lqa lqaVar = this.E;
        lqaVar.d();
        int iH = lqaVar.h(obj);
        if (iH < 0) {
            return false;
        }
        lqaVar.l(iH);
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        this.E.d();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        this.E.d();
        return super.retainAll(collection);
    }

    public pwf(lqa lqaVar) {
        lqaVar.getClass();
        this.E = lqaVar;
    }

    public pwf(int i) {
        this.E = new lqa(i);
    }
}
