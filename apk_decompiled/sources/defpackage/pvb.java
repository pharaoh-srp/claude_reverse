package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes2.dex */
public final class pvb implements List, om9 {
    public final /* synthetic */ int E;
    public final List F;
    public final int G;
    public int H;

    public /* synthetic */ pvb(List list, int i, int i2, int i3) {
        this.E = i3;
        this.F = list;
        this.G = i;
        this.H = i2;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        int i2 = this.E;
        int i3 = this.G;
        List list = this.F;
        switch (i2) {
            case 0:
                list.add(i + i3, obj);
                this.H++;
                break;
            default:
                list.add(i + i3, obj);
                this.H++;
                break;
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        int i2 = this.E;
        int i3 = this.G;
        List list = this.F;
        switch (i2) {
            case 0:
                collection.getClass();
                list.addAll(i + i3, collection);
                this.H = collection.size() + this.H;
                if (collection.size() > 0) {
                }
                break;
            default:
                list.addAll(i + i3, collection);
                int size = collection.size();
                this.H += size;
                if (size > 0) {
                }
                break;
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        int i = this.E;
        List list = this.F;
        int i2 = this.G;
        switch (i) {
            case 0:
                int i3 = this.H - 1;
                if (i2 <= i3) {
                    while (true) {
                        list.remove(i3);
                        if (i3 != i2) {
                            i3--;
                        }
                    }
                }
                this.H = i2;
                break;
            default:
                int i4 = this.H - 1;
                if (i2 <= i4) {
                    while (true) {
                        list.remove(i4);
                        if (i4 != i2) {
                            i4--;
                        }
                    }
                }
                this.H = i2;
                break;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        int i = this.E;
        List list = this.F;
        int i2 = this.G;
        switch (i) {
            case 0:
                int i3 = this.H;
                while (i2 < i3) {
                    if (!x44.r(list.get(i2), obj)) {
                        i2++;
                    }
                    break;
                }
                break;
            default:
                int i4 = this.H;
                while (i2 < i4) {
                    if (!x44.r(list.get(i2), obj)) {
                        i2++;
                    }
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.E) {
            case 0:
                collection.getClass();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (!contains(it.next())) {
                        break;
                    }
                }
                break;
            default:
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (!contains(it2.next())) {
                        break;
                    }
                }
                break;
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.E;
        int i3 = this.G;
        List list = this.F;
        switch (i2) {
            case 0:
                wac.a(i, this);
                break;
            default:
                xwb.a(i, this);
                break;
        }
        return list.get(i + i3);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        int i = this.E;
        List list = this.F;
        int i2 = this.G;
        switch (i) {
            case 0:
                int i3 = this.H;
                for (int i4 = i2; i4 < i3; i4++) {
                    if (x44.r(list.get(i4), obj)) {
                        return i4 - i2;
                    }
                }
                return -1;
            default:
                int i5 = this.H;
                for (int i6 = i2; i6 < i5; i6++) {
                    if (x44.r(list.get(i6), obj)) {
                        return i6 - i2;
                    }
                }
                return -1;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        switch (this.E) {
            case 0:
                if (this.H == this.G) {
                }
                break;
            default:
                if (this.H == this.G) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.E) {
            case 0:
                return new nvb(0, 0, this);
            default:
                return new nvb(0, 1, this);
        }
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        int i = this.E;
        List list = this.F;
        int i2 = this.G;
        switch (i) {
            case 0:
                int i3 = this.H - 1;
                if (i2 <= i3) {
                    while (!x44.r(list.get(i3), obj)) {
                        if (i3 != i2) {
                            i3--;
                        }
                    }
                }
                break;
            default:
                int i4 = this.H - 1;
                if (i2 <= i4) {
                    while (!x44.r(list.get(i4), obj)) {
                        if (i4 != i2) {
                            i4--;
                        }
                    }
                }
                break;
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        switch (this.E) {
            case 0:
                return new nvb(0, 0, this);
            default:
                return new nvb(0, 1, this);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i = this.E;
        int i2 = this.G;
        List list = this.F;
        switch (i) {
            case 0:
                int i3 = this.H;
                while (i2 < i3) {
                    if (x44.r(list.get(i2), obj)) {
                        list.remove(i2);
                        this.H--;
                    } else {
                        i2++;
                    }
                    break;
                }
                break;
            default:
                int i4 = this.H;
                while (i2 < i4) {
                    if (x44.r(list.get(i2), obj)) {
                        list.remove(i2);
                        this.H--;
                    } else {
                        i2++;
                    }
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.E) {
            case 0:
                collection.getClass();
                int i = this.H;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    remove(it.next());
                }
                if (i != this.H) {
                }
                break;
            default:
                int i2 = this.H;
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    remove(it2.next());
                }
                if (i2 != this.H) {
                }
                break;
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i = this.E;
        int i2 = this.G;
        List list = this.F;
        switch (i) {
            case 0:
                collection.getClass();
                int i3 = this.H;
                int i4 = i3 - 1;
                if (i2 <= i4) {
                    while (true) {
                        if (!collection.contains(list.get(i4))) {
                            list.remove(i4);
                            this.H--;
                        }
                        if (i4 != i2) {
                            i4--;
                        }
                    }
                }
                if (i3 != this.H) {
                }
                break;
            default:
                int i5 = this.H;
                int i6 = i5 - 1;
                if (i2 <= i6) {
                    while (true) {
                        if (!collection.contains(list.get(i6))) {
                            list.remove(i6);
                            this.H--;
                        }
                        if (i6 != i2) {
                            i6--;
                        }
                    }
                }
                if (i5 != this.H) {
                }
                break;
        }
        return true;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        int i2 = this.E;
        int i3 = this.G;
        List list = this.F;
        switch (i2) {
            case 0:
                wac.a(i, this);
                break;
            default:
                xwb.a(i, this);
                break;
        }
        return list.set(i + i3, obj);
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        int i;
        int i2;
        switch (this.E) {
            case 0:
                i = this.H;
                i2 = this.G;
                break;
            default:
                i = this.H;
                i2 = this.G;
                break;
        }
        return i - i2;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        switch (this.E) {
            case 0:
                wac.b(i, i2, this);
                return new pvb(this, i, i2, 0);
            default:
                xwb.b(i, i2, this);
                return new pvb(this, i, i2, 1);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.E) {
            case 0:
                objArr.getClass();
                break;
        }
        return dch.U(this, objArr);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        switch (this.E) {
        }
        return dch.T(this);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        switch (this.E) {
            case 0:
                return new nvb(i, 0, this);
            default:
                return new nvb(i, 1, this);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i = this.E;
        List list = this.F;
        switch (i) {
            case 0:
                int i2 = this.H;
                this.H = i2 + 1;
                list.add(i2, obj);
                break;
            default:
                int i3 = this.H;
                this.H = i3 + 1;
                list.add(i3, obj);
                break;
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i = this.E;
        List list = this.F;
        switch (i) {
            case 0:
                collection.getClass();
                list.addAll(this.H, collection);
                this.H = collection.size() + this.H;
                if (collection.size() > 0) {
                }
                break;
            default:
                list.addAll(this.H, collection);
                int size = collection.size();
                this.H += size;
                if (size > 0) {
                }
                break;
        }
        return true;
    }

    @Override // java.util.List
    public final Object remove(int i) {
        int i2 = this.E;
        int i3 = this.G;
        List list = this.F;
        switch (i2) {
            case 0:
                wac.a(i, this);
                this.H--;
                return list.remove(i + i3);
            default:
                xwb.a(i, this);
                this.H--;
                return list.remove(i + i3);
        }
    }
}
