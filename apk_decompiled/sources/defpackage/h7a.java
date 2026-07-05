package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class h7a extends AbstractSet {
    public final /* synthetic */ int E;
    public final /* synthetic */ j7a F;

    public /* synthetic */ h7a(j7a j7aVar, int i) {
        this.E = i;
        this.F = j7aVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        int i = this.E;
        j7a j7aVar = this.F;
        switch (i) {
            case 0:
                j7aVar.clear();
                break;
            default:
                j7aVar.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        i7a i7aVarA;
        Object obj2;
        Object value;
        int i = this.E;
        j7a j7aVar = this.F;
        switch (i) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                i7a i7aVar = null;
                if (key != null) {
                    try {
                        i7aVarA = j7aVar.a(key, false);
                    } catch (ClassCastException unused) {
                        i7aVarA = null;
                    }
                    break;
                } else {
                    i7aVarA = null;
                }
                if (i7aVarA != null && ((obj2 = i7aVarA.L) == (value = entry.getValue()) || (obj2 != null && obj2.equals(value)))) {
                    i7aVar = i7aVarA;
                }
                return i7aVar != null;
            default:
                return j7aVar.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.E;
        j7a j7aVar = this.F;
        switch (i) {
            case 0:
                return new g7a(j7aVar, 0);
            default:
                return new g7a(j7aVar, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        i7a i7aVarA;
        Object obj2;
        Object value;
        int i = this.E;
        i7a i7aVarA2 = null;
        j7a j7aVar = this.F;
        switch (i) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    Object key = entry.getKey();
                    if (key != null) {
                        try {
                            i7aVarA = j7aVar.a(key, false);
                        } catch (ClassCastException unused) {
                            i7aVarA = null;
                        }
                    } else {
                        i7aVarA = null;
                    }
                    if (i7aVarA != null && ((obj2 = i7aVarA.L) == (value = entry.getValue()) || (obj2 != null && obj2.equals(value)))) {
                        i7aVarA2 = i7aVarA;
                    }
                    if (i7aVarA2 != null) {
                        j7aVar.d(i7aVarA2, true);
                        break;
                    }
                    break;
                }
                break;
            default:
                if (obj != null) {
                    try {
                        i7aVarA2 = j7aVar.a(obj, false);
                        break;
                    } catch (ClassCastException unused2) {
                    }
                }
                if (i7aVarA2 != null) {
                    j7aVar.d(i7aVarA2, true);
                }
                if (i7aVarA2 != null) {
                }
                break;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        int i = this.E;
        j7a j7aVar = this.F;
        switch (i) {
        }
        return j7aVar.H;
    }
}
