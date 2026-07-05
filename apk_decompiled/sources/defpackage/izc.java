package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class izc extends h3 implements Collection, nm9 {
    public gzc E;
    public Object F;
    public Object G;
    public final nyc H;

    public izc(gzc gzcVar) {
        this.E = gzcVar;
        this.F = gzcVar.E;
        this.G = gzcVar.F;
        this.H = gzcVar.G.f();
    }

    @Override // defpackage.h3
    public final int a() {
        return this.H.d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        nyc nycVar = this.H;
        if (nycVar.containsKey(obj)) {
            return false;
        }
        if (isEmpty()) {
            this.F = obj;
            this.G = obj;
            nycVar.put(obj, new s7a());
            return true;
        }
        V v = nycVar.get(this.G);
        v.getClass();
        nycVar.put(this.G, new s7a(((s7a) v).a, obj));
        nycVar.put(obj, new s7a(this.G));
        this.G = obj;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.H.clear();
        zp3 zp3Var = zp3.H;
        this.F = zp3Var;
        this.G = zp3Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.H.containsKey(obj);
    }

    public final gzc e() {
        jyc jycVarG = this.H.g();
        gzc gzcVar = this.E;
        if (jycVarG != gzcVar.G) {
            gzcVar = new gzc(this.F, this.G, jycVarG);
        }
        this.E = gzcVar;
        return gzcVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new lzc(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        nyc nycVar = this.H;
        s7a s7aVar = (s7a) nycVar.remove(obj);
        if (s7aVar == null) {
            return false;
        }
        Object obj2 = s7aVar.b;
        Object obj3 = s7aVar.a;
        zp3 zp3Var = zp3.H;
        if (obj3 != zp3Var) {
            V v = nycVar.get(obj3);
            v.getClass();
            nycVar.put(obj3, new s7a(((s7a) v).a, obj2));
        } else {
            this.F = obj2;
        }
        if (obj2 == zp3Var) {
            this.G = obj3;
            return true;
        }
        V v2 = nycVar.get(obj2);
        v2.getClass();
        nycVar.put(obj2, new s7a(obj3, ((s7a) v2).b));
        return true;
    }
}
