package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: loaded from: classes2.dex */
public final class mta implements Map, mm9 {
    public final ewb E;
    public dq6 F;
    public dq6 G;
    public hri H;

    public mta(ewb ewbVar) {
        ewbVar.getClass();
        this.E = ewbVar;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object compute(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object computeIfAbsent(Object obj, Function function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.E.c(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.E.d(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        dq6 dq6Var = this.F;
        if (dq6Var != null) {
            return dq6Var;
        }
        dq6 dq6Var2 = new dq6(this.E, 0);
        this.F = dq6Var2;
        return dq6Var2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || mta.class != obj.getClass()) {
            return false;
        }
        return x44.r(this.E, ((mta) obj).E);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return this.E.g(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.E.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.E.i();
    }

    @Override // java.util.Map
    public final Set keySet() {
        dq6 dq6Var = this.G;
        if (dq6Var != null) {
            return dq6Var;
        }
        dq6 dq6Var2 = new dq6(this.E, 1);
        this.G = dq6Var2;
        return dq6Var2;
    }

    @Override // java.util.Map
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object putIfAbsent(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object replace(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void replaceAll(BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return this.E.e;
    }

    public final String toString() {
        return this.E.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        hri hriVar = this.H;
        if (hriVar != null) {
            return hriVar;
        }
        hri hriVar2 = new hri(this.E);
        this.H = hriVar2;
        return hriVar2;
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
