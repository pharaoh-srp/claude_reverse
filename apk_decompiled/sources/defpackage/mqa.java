package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class mqa extends h3 {
    public final /* synthetic */ int E;
    public final lqa F;

    public /* synthetic */ mqa(lqa lqaVar, int i) {
        this.E = i;
        this.F = lqaVar;
    }

    @Override // defpackage.h3
    public final int a() {
        switch (this.E) {
        }
        return this.F.M;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.E) {
            case 0:
                ((Map.Entry) obj).getClass();
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        int i = this.E;
        collection.getClass();
        switch (i) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.E) {
            case 0:
                this.F.clear();
                break;
            default:
                this.F.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int i = this.E;
        lqa lqaVar = this.F;
        switch (i) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                lqaVar.getClass();
                int iH = lqaVar.h(entry.getKey());
                if (iH < 0) {
                    return false;
                }
                Object[] objArr = lqaVar.F;
                objArr.getClass();
                return x44.r(objArr[iH], entry.getValue());
            default:
                return lqaVar.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        switch (this.E) {
            case 0:
                collection.getClass();
                return this.F.f(collection);
            default:
                return super.containsAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        switch (this.E) {
        }
        return this.F.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.E;
        lqa lqaVar = this.F;
        switch (i) {
            case 0:
                lqaVar.getClass();
                return new jqa(lqaVar, 0);
            default:
                lqaVar.getClass();
                return new jqa(lqaVar, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i = this.E;
        lqa lqaVar = this.F;
        switch (i) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    lqaVar.getClass();
                    lqaVar.d();
                    int iH = lqaVar.h(entry.getKey());
                    if (iH >= 0) {
                        Object[] objArr = lqaVar.F;
                        objArr.getClass();
                        if (x44.r(objArr[iH], entry.getValue())) {
                            lqaVar.l(iH);
                        }
                    }
                }
                break;
            default:
                lqaVar.d();
                int iH2 = lqaVar.h(obj);
                if (iH2 >= 0) {
                    lqaVar.l(iH2);
                }
                break;
        }
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        int i = this.E;
        lqa lqaVar = this.F;
        collection.getClass();
        switch (i) {
            case 0:
                lqaVar.d();
                break;
            default:
                lqaVar.d();
                break;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        int i = this.E;
        lqa lqaVar = this.F;
        collection.getClass();
        switch (i) {
            case 0:
                lqaVar.d();
                break;
            default:
                lqaVar.d();
                break;
        }
        return super.retainAll(collection);
    }
}
