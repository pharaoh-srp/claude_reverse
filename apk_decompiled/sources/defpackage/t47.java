package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;

/* JADX INFO: loaded from: classes3.dex */
public final class t47 implements Queue {
    public final ConcurrentLinkedDeque E;
    public final int F = Math.max(0, 1000);

    public t47(ConcurrentLinkedDeque concurrentLinkedDeque) {
        this.E = concurrentLinkedDeque;
    }

    public final Object a() {
        return this.E.peekLast();
    }

    @Override // java.util.Queue, java.util.Collection
    public final boolean add(Object obj) {
        return offer(obj);
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        collection.getClass();
        int i = 0;
        int i2 = this.F;
        if (i2 == 0) {
            return false;
        }
        int size = collection.size();
        ConcurrentLinkedDeque concurrentLinkedDeque = this.E;
        if (size < i2) {
            int size2 = collection.size() - (i2 - concurrentLinkedDeque.size());
            while (i < size2) {
                concurrentLinkedDeque.poll();
                i++;
            }
            return concurrentLinkedDeque.addAll(collection);
        }
        clear();
        for (Object obj : collection) {
            int i3 = i + 1;
            if (i >= collection.size() - i2) {
                concurrentLinkedDeque.add(obj);
            }
            i = i3;
        }
        return true;
    }

    @Override // java.util.Collection
    public final void clear() {
        this.E.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.E.contains(obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        return this.E.containsAll(collection);
    }

    @Override // java.util.Queue
    public final Object element() {
        return this.E.element();
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.E.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        Iterator it = this.E.iterator();
        it.getClass();
        return it;
    }

    @Override // java.util.Queue
    public final boolean offer(Object obj) {
        int i = this.F;
        if (i == 0) {
            return false;
        }
        ConcurrentLinkedDeque concurrentLinkedDeque = this.E;
        if (concurrentLinkedDeque.size() >= i) {
            concurrentLinkedDeque.poll();
        }
        return concurrentLinkedDeque.offer(obj);
    }

    @Override // java.util.Queue
    public final Object peek() {
        return this.E.peek();
    }

    @Override // java.util.Queue
    public final Object poll() {
        return this.E.poll();
    }

    @Override // java.util.Queue
    public final Object remove() {
        return this.E.remove();
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        return this.E.removeAll(collection);
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        return this.E.retainAll(collection);
    }

    @Override // java.util.Collection
    public final int size() {
        return this.E.size();
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        return dch.U(this, objArr);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        return this.E.remove(obj);
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return dch.T(this);
    }
}
