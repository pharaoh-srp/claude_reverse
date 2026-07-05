package defpackage;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class p2 extends AbstractMap {
    public transient n2 E;
    public transient c3 F;
    public final transient Map G;
    public final /* synthetic */ dub H;

    public p2(dub dubVar, Map map) {
        this.H = dubVar;
        this.G = map;
    }

    public final dz8 a(Map.Entry entry) {
        Object key = entry.getKey();
        List list = (List) ((Collection) entry.getValue());
        boolean z = list instanceof RandomAccess;
        dub dubVar = this.H;
        return new dz8(key, z ? new t2(dubVar, key, list, null) : new x2(dubVar, key, list, null));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        dub dubVar = this.H;
        if (this.G == dubVar.H) {
            dubVar.d();
            return;
        }
        o2 o2Var = new o2(this);
        while (o2Var.hasNext()) {
            o2Var.next();
            o2Var.remove();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map map = this.G;
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        n2 n2Var = this.E;
        if (n2Var != null) {
            return n2Var;
        }
        n2 n2Var2 = new n2(this);
        this.E = n2Var2;
        return n2Var2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        return this == obj || this.G.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        Map map = this.G;
        map.getClass();
        try {
            obj2 = map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection == null) {
            return null;
        }
        List list = (List) collection;
        boolean z = list instanceof RandomAccess;
        dub dubVar = this.H;
        return z ? new t2(dubVar, obj, list, null) : new x2(dubVar, obj, list, null);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.G.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        dub dubVar = this.H;
        Set set = dubVar.E;
        if (set != null) {
            return set;
        }
        Set setC = dubVar.c();
        dubVar.E = setC;
        return setC;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Collection collection = (Collection) this.G.remove(obj);
        if (collection == null) {
            return null;
        }
        dub dubVar = this.H;
        List list = (List) dubVar.J.get();
        list.addAll(collection);
        dubVar.I -= collection.size();
        collection.clear();
        return list;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.G.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.G.toString();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        c3 c3Var = this.F;
        if (c3Var != null) {
            return c3Var;
        }
        c3 c3Var2 = new c3(this);
        this.F = c3Var2;
        return c3Var2;
    }
}
