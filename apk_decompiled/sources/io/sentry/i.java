package io.sentry;

import defpackage.mr9;
import defpackage.pmf;
import defpackage.sz6;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Queue;

/* JADX INFO: loaded from: classes.dex */
public final class i extends AbstractCollection implements Queue, Serializable {
    public final transient Object[] E;
    public transient int F = 0;
    public transient int G = 0;
    public transient boolean H = false;
    public final int I;

    public i(int i) {
        if (i <= 0) {
            sz6.p("The size must be greater than 0");
            throw null;
        }
        Object[] objArr = new Object[i];
        this.E = objArr;
        this.I = objArr.length;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Queue
    public final boolean add(Object obj) {
        if (obj == null) {
            mr9.h("Attempted to add null object to queue");
            return false;
        }
        int size = size();
        int i = this.I;
        if (size == i) {
            remove();
        }
        int i2 = this.G;
        int i3 = i2 + 1;
        this.G = i3;
        this.E[i2] = obj;
        if (i3 >= i) {
            this.G = 0;
        }
        if (this.G == this.F) {
            this.H = true;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.H = false;
        this.F = 0;
        this.G = 0;
        Arrays.fill(this.E, (Object) null);
    }

    @Override // java.util.Queue
    public final Object element() {
        if (!isEmpty()) {
            return peek();
        }
        pmf.h("queue is empty");
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new h(this);
    }

    @Override // java.util.Queue
    public final boolean offer(Object obj) {
        add(obj);
        return true;
    }

    @Override // java.util.Queue
    public final Object peek() {
        if (isEmpty()) {
            return null;
        }
        return this.E[this.F];
    }

    @Override // java.util.Queue
    public final Object poll() {
        if (isEmpty()) {
            return null;
        }
        return remove();
    }

    @Override // java.util.Queue
    public final Object remove() {
        if (isEmpty()) {
            pmf.h("queue is empty");
            return null;
        }
        int i = this.F;
        Object[] objArr = this.E;
        Object obj = objArr[i];
        if (obj != null) {
            int i2 = i + 1;
            this.F = i2;
            objArr[i] = null;
            if (i2 >= this.I) {
                this.F = 0;
            }
            this.H = false;
        }
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        int i = this.G;
        int i2 = this.F;
        int i3 = this.I;
        if (i < i2) {
            return (i3 - i2) + i;
        }
        if (i != i2) {
            return i - i2;
        }
        if (this.H) {
            return i3;
        }
        return 0;
    }
}
