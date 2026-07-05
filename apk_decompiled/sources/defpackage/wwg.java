package defpackage;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.types.a;

/* JADX INFO: loaded from: classes3.dex */
public final class wwg implements fab {
    public final fab b;
    public final a c;
    public HashMap d;
    public final u0h e;

    public wwg(fab fabVar, a aVar) {
        fabVar.getClass();
        aVar.getClass();
        this.b = fabVar;
        new u0h(new k2c(10, aVar));
        this.c = new a(qwj.i(aVar.a));
        this.e = new u0h(new k2c(9, this));
    }

    @Override // defpackage.fab
    public final Set a() {
        return this.b.a();
    }

    @Override // defpackage.fab
    public final Collection b(c06 c06Var, bz7 bz7Var) {
        c06Var.getClass();
        return (Collection) this.e.getValue();
    }

    @Override // defpackage.fab
    public final Set c() {
        return this.b.c();
    }

    @Override // defpackage.fab
    public final Collection d(sxb sxbVar, int i) {
        sxbVar.getClass();
        if (i != 0) {
            return i(this.b.d(sxbVar, i));
        }
        throw null;
    }

    @Override // defpackage.fab
    public final xh3 e(sxb sxbVar, int i) {
        sxbVar.getClass();
        if (i == 0) {
            throw null;
        }
        xh3 xh3VarE = this.b.e(sxbVar, i);
        if (xh3VarE != null) {
            return (xh3) h(xh3VarE);
        }
        return null;
    }

    @Override // defpackage.fab
    public final Set f() {
        return this.b.f();
    }

    @Override // defpackage.fab
    public final Collection g(sxb sxbVar, int i) {
        sxbVar.getClass();
        if (i != 0) {
            return i(this.b.g(sxbVar, i));
        }
        throw null;
    }

    public final bo5 h(bo5 bo5Var) {
        a aVar = this.c;
        if (aVar.a.f()) {
            return bo5Var;
        }
        if (this.d == null) {
            this.d = new HashMap();
        }
        HashMap map = this.d;
        map.getClass();
        Object objE = map.get(bo5Var);
        if (objE == null) {
            if (!(bo5Var instanceof vwg)) {
                xh6.d("Unknown descriptor in scope: ", bo5Var);
                return null;
            }
            objE = ((vwg) bo5Var).e(aVar);
            if (objE == null) {
                mr9.g(bo5Var, " substitution fails", "We expect that no conflict should happen while substitution is guaranteed to generate invariant projection, but ");
                return null;
            }
            map.put(bo5Var, objE);
        }
        return (bo5) objE;
    }

    public final Collection i(Collection collection) {
        if (this.c.a.f() || collection.isEmpty()) {
            return collection;
        }
        int size = collection.size();
        LinkedHashSet linkedHashSet = new LinkedHashSet(size >= 3 ? (size / 3) + size + 1 : 3);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(h((bo5) it.next()));
        }
        return linkedHashSet;
    }
}
