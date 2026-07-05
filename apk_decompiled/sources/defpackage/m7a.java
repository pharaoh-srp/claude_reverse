package defpackage;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class m7a extends AbstractSet {
    public final /* synthetic */ int E;
    public final /* synthetic */ AbstractMap F;

    public /* synthetic */ m7a(AbstractMap abstractMap, int i) {
        this.E = i;
        this.F = abstractMap;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        switch (this.E) {
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                if (contains(entry)) {
                    return false;
                }
                ((ebg) this.F).put((Comparable) entry.getKey(), entry.getValue());
                return true;
            default:
                return super.add(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        int i = this.E;
        AbstractMap abstractMap = this.F;
        switch (i) {
            case 0:
                ((q7a) abstractMap).clear();
                break;
            default:
                ((ebg) abstractMap).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        p7a p7aVarA;
        int i = this.E;
        AbstractMap abstractMap = this.F;
        switch (i) {
            case 0:
                if (obj instanceof Map.Entry) {
                    q7a q7aVar = (q7a) abstractMap;
                    Map.Entry entry = (Map.Entry) obj;
                    Object key = entry.getKey();
                    p7a p7aVar = null;
                    if (key != null) {
                        try {
                            p7aVarA = q7aVar.a(key, false);
                        } catch (ClassCastException unused) {
                            p7aVarA = null;
                        }
                        if (p7aVarA != null && Objects.equals(p7aVarA.L, entry.getValue())) {
                            p7aVar = p7aVarA;
                        }
                        if (p7aVar != null) {
                        }
                        break;
                    } else {
                        p7aVarA = null;
                        if (p7aVarA != null) {
                            p7aVar = p7aVarA;
                        }
                        if (p7aVar != null) {
                        }
                    }
                }
                break;
            default:
                Map.Entry entry2 = (Map.Entry) obj;
                Object obj2 = ((ebg) abstractMap).get(entry2.getKey());
                Object value = entry2.getValue();
                if (obj2 != value) {
                    if (obj2 == null || !obj2.equals(value)) {
                    }
                }
                break;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.E;
        AbstractMap abstractMap = this.F;
        switch (i) {
            case 0:
                return new l7a((q7a) abstractMap);
            default:
                return new mbg((ebg) abstractMap);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        p7a p7aVarA;
        int i = this.E;
        AbstractMap abstractMap = this.F;
        switch (i) {
            case 0:
                q7a q7aVar = (q7a) abstractMap;
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    Object key = entry.getKey();
                    p7a p7aVar = null;
                    if (key != null) {
                        try {
                            p7aVarA = q7aVar.a(key, false);
                        } catch (ClassCastException unused) {
                            p7aVarA = null;
                        }
                    } else {
                        p7aVarA = null;
                    }
                    if (p7aVarA != null && Objects.equals(p7aVarA.L, entry.getValue())) {
                        p7aVar = p7aVarA;
                    }
                    if (p7aVar != null) {
                        q7aVar.d(p7aVar, true);
                        break;
                    }
                    break;
                }
                break;
            default:
                Map.Entry entry2 = (Map.Entry) obj;
                if (contains(entry2)) {
                    ((ebg) abstractMap).remove(entry2.getKey());
                }
                break;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        int i = this.E;
        AbstractMap abstractMap = this.F;
        switch (i) {
            case 0:
                return ((q7a) abstractMap).H;
            default:
                return ((ebg) abstractMap).size();
        }
    }
}
