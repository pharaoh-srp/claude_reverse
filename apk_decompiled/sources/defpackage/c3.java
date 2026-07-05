package defpackage;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class c3 extends AbstractCollection {
    public final /* synthetic */ int E;
    public final Object F;

    public c3(AbstractMap abstractMap) {
        this.E = 2;
        this.F = abstractMap;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        int i = this.E;
        Object obj = this.F;
        switch (i) {
            case 0:
                ((dub) obj).d();
                break;
            case 1:
                ((d84) obj).clear();
                break;
            default:
                ((AbstractMap) obj).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        int i = this.E;
        Object obj2 = this.F;
        switch (i) {
            case 0:
                Iterator it = ((dub) obj2).a().values().iterator();
                while (it.hasNext()) {
                    if (((Collection) it.next()).contains(obj)) {
                        return true;
                    }
                }
                return false;
            case 1:
            default:
                return super.contains(obj);
            case 2:
                return ((AbstractMap) obj2).containsValue(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.E) {
            case 2:
                return ((AbstractMap) this.F).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        int i = this.E;
        Object obj = this.F;
        switch (i) {
            case 0:
                return new m2((dub) obj);
            case 1:
                d84 d84Var = (d84) obj;
                Map mapC = d84Var.c();
                return mapC != null ? mapC.values().iterator() : new a84(d84Var, 2);
            default:
                return new qta(((AbstractMap) obj).entrySet().iterator());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        switch (this.E) {
            case 2:
                AbstractMap abstractMap = (AbstractMap) this.F;
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused) {
                    for (Map.Entry entry : abstractMap.entrySet()) {
                        if (cvk.l(obj, entry.getValue())) {
                            abstractMap.remove(entry.getKey());
                            return true;
                        }
                    }
                    return false;
                }
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        switch (this.E) {
            case 2:
                AbstractMap abstractMap = (AbstractMap) this.F;
                try {
                    collection.getClass();
                    return super.removeAll(collection);
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    for (Map.Entry entry : abstractMap.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return abstractMap.keySet().removeAll(hashSet);
                }
            default:
                return super.removeAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        switch (this.E) {
            case 2:
                AbstractMap abstractMap = (AbstractMap) this.F;
                try {
                    collection.getClass();
                    return super.retainAll(collection);
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    for (Map.Entry entry : abstractMap.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return abstractMap.keySet().retainAll(hashSet);
                }
            default:
                return super.retainAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        int i = this.E;
        Object obj = this.F;
        switch (i) {
            case 0:
                return ((dub) obj).I;
            case 1:
                return ((d84) obj).size();
            default:
                return ((AbstractMap) obj).size();
        }
    }

    public /* synthetic */ c3(int i, Serializable serializable) {
        this.E = i;
        this.F = serializable;
    }
}
