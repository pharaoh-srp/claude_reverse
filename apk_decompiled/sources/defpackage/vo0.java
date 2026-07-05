package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class vo0 extends AbstractSet {
    public final /* synthetic */ int E;
    public final /* synthetic */ Map F;

    public /* synthetic */ vo0(int i, Map map) {
        this.E = i;
        this.F = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        int i = this.E;
        Map map = this.F;
        switch (i) {
            case 2:
                Map.Entry entry = (Map.Entry) obj;
                if (contains(entry)) {
                    return false;
                }
                ((dbg) map).put((Comparable) entry.getKey(), entry.getValue());
                return true;
            case 3:
                Map.Entry entry2 = (Map.Entry) obj;
                if (contains(entry2)) {
                    return false;
                }
                ((fbg) map).put((Comparable) entry2.getKey(), entry2.getValue());
                return true;
            default:
                return super.add(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        int i = this.E;
        Map map = this.F;
        switch (i) {
            case 1:
                ((q7a) map).clear();
                break;
            case 2:
                ((dbg) map).clear();
                break;
            case 3:
                ((fbg) map).clear();
                break;
            default:
                super.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        int i = this.E;
        Map map = this.F;
        switch (i) {
            case 1:
                return ((q7a) map).containsKey(obj);
            case 2:
                Map.Entry entry = (Map.Entry) obj;
                Object obj2 = ((dbg) map).get(entry.getKey());
                Object value = entry.getValue();
                if (obj2 != value) {
                    return obj2 != null && obj2.equals(value);
                }
                return true;
            case 3:
                Map.Entry entry2 = (Map.Entry) obj;
                Object obj3 = ((fbg) map).get(entry2.getKey());
                Object value2 = entry2.getValue();
                if (obj3 != value2) {
                    return obj3 != null && obj3.equals(value2);
                }
                return true;
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        int i = this.E;
        Map map = this.F;
        switch (i) {
            case 0:
                return new yo0((bp0) map);
            case 1:
                return new n7a((q7a) map);
            case 2:
                return new lbg((dbg) map, 0);
            default:
                return new lbg((fbg) map, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int i = this.E;
        Map map = this.F;
        switch (i) {
            case 1:
                q7a q7aVar = (q7a) map;
                p7a p7aVarA = null;
                if (obj != null) {
                    try {
                        p7aVarA = q7aVar.a(obj, false);
                        break;
                    } catch (ClassCastException unused) {
                    }
                }
                if (p7aVarA != null) {
                    q7aVar.d(p7aVarA, true);
                }
                return p7aVarA != null;
            case 2:
                Map.Entry entry = (Map.Entry) obj;
                if (!contains(entry)) {
                    return false;
                }
                ((dbg) map).remove(entry.getKey());
                return true;
            case 3:
                Map.Entry entry2 = (Map.Entry) obj;
                if (!contains(entry2)) {
                    return false;
                }
                ((fbg) map).remove(entry2.getKey());
                return true;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        int i = this.E;
        Map map = this.F;
        switch (i) {
            case 0:
                return ((bp0) map).G;
            case 1:
                return ((q7a) map).H;
            case 2:
                return ((dbg) map).size();
            default:
                return ((fbg) map).size();
        }
    }
}
