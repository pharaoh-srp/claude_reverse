package defpackage;

import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes2.dex */
public final class nvb implements ListIterator, mm9 {
    public final /* synthetic */ int E;
    public final List F;
    public int G;

    public nvb(int i, int i2, List list) {
        this.E = i2;
        switch (i2) {
            case 1:
                this.F = list;
                this.G = i;
                break;
            default:
                this.F = list;
                this.G = i - 1;
                break;
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i = this.E;
        List list = this.F;
        switch (i) {
            case 0:
                int i2 = this.G + 1;
                this.G = i2;
                list.add(i2, obj);
                break;
            default:
                list.add(this.G, obj);
                this.G++;
                break;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        int i = this.E;
        List list = this.F;
        switch (i) {
            case 0:
                if (this.G < list.size() - 1) {
                }
                break;
            default:
                if (this.G < list.size()) {
                }
                break;
        }
        return true;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.E) {
            case 0:
                if (this.G >= 0) {
                }
                break;
            default:
                if (this.G > 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.E;
        List list = this.F;
        switch (i) {
            case 0:
                int i2 = this.G + 1;
                this.G = i2;
                return list.get(i2);
            default:
                int i3 = this.G;
                this.G = i3 + 1;
                return list.get(i3);
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.E) {
            case 0:
                return this.G + 1;
            default:
                return this.G;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.E;
        List list = this.F;
        switch (i) {
            case 0:
                int i2 = this.G;
                this.G = i2 - 1;
                return list.get(i2);
            default:
                int i3 = this.G - 1;
                this.G = i3;
                return list.get(i3);
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.E) {
            case 0:
                return this.G;
            default:
                return this.G - 1;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i = this.E;
        List list = this.F;
        switch (i) {
            case 0:
                list.remove(this.G);
                this.G--;
                break;
            default:
                int i2 = this.G - 1;
                this.G = i2;
                list.remove(i2);
                break;
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        int i = this.E;
        List list = this.F;
        switch (i) {
            case 0:
                list.set(this.G, obj);
                break;
            default:
                list.set(this.G, obj);
                break;
        }
    }
}
