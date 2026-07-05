package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class hzc extends h3 implements Collection, nm9 {
    public fzc E;
    public Object F;
    public Object G;
    public final myc H;

    public hzc(fzc fzcVar) {
        fzcVar.getClass();
        this.E = fzcVar;
        this.F = fzcVar.E;
        this.G = fzcVar.F;
        iyc iycVar = fzcVar.G;
        iycVar.getClass();
        this.H = new myc(iycVar);
    }

    @Override // defpackage.h3
    public final int a() {
        return this.H.d();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        myc mycVar = this.H;
        if (mycVar.containsKey(obj)) {
            return false;
        }
        this.E = null;
        if (isEmpty()) {
            this.F = obj;
            this.G = obj;
            mycVar.put(obj, new r7a());
            return true;
        }
        Object obj2 = mycVar.get(this.G);
        obj2.getClass();
        mycVar.put(this.G, new r7a(((r7a) obj2).a, obj));
        mycVar.put(obj, new r7a(this.G));
        this.G = obj;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        myc mycVar = this.H;
        if (!mycVar.isEmpty()) {
            this.E = null;
        }
        mycVar.clear();
        a5 a5Var = a5.H;
        this.F = a5Var;
        this.G = a5Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.H.containsKey(obj);
    }

    public final fzc e() {
        fzc fzcVar = this.E;
        myc mycVar = this.H;
        if (fzcVar != null) {
            iyc iycVar = mycVar.E;
            return fzcVar;
        }
        iyc iycVar2 = mycVar.E;
        if (iycVar2 == null) {
            iycVar2 = new iyc(mycVar.G, mycVar.d());
            mycVar.E = iycVar2;
            mycVar.F = new ql8(21);
        }
        fzc fzcVar2 = new fzc(this.F, this.G, iycVar2);
        this.E = fzcVar2;
        return fzcVar2;
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (a() != set.size()) {
            return false;
        }
        boolean z = set instanceof fzc;
        myc mycVar = this.H;
        return z ? mycVar.G.g(((fzc) obj).G.E, new oua(23)) : set instanceof hzc ? mycVar.G.g(((hzc) obj).H.G, new oua(24)) : super.equals(obj);
    }

    public final myc g() {
        return this.H;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new kzc(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        myc mycVar = this.H;
        r7a r7aVar = (r7a) mycVar.remove(obj);
        if (r7aVar == null) {
            return false;
        }
        Object obj2 = r7aVar.b;
        Object obj3 = r7aVar.a;
        this.E = null;
        a5 a5Var = a5.H;
        if (obj3 != a5Var) {
            Object obj4 = mycVar.get(obj3);
            obj4.getClass();
            mycVar.put(obj3, new r7a(((r7a) obj4).a, obj2));
        } else {
            this.F = obj2;
        }
        if (obj2 == a5Var) {
            this.G = obj3;
            return true;
        }
        Object obj5 = mycVar.get(obj2);
        obj5.getClass();
        mycVar.put(obj2, new r7a(obj3, ((r7a) obj5).b));
        return true;
    }
}
