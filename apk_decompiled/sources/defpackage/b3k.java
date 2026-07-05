package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class b3k extends b0k {
    public final transient Object J;

    public b3k(Object obj) {
        super(1);
        this.J = obj;
    }

    @Override // defpackage.upj
    public final int a(Object[] objArr) {
        objArr[0] = this.J;
        return 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.J.equals(obj);
    }

    @Override // defpackage.b0k, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.J.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return new c1k(this.J);
    }

    @Override // defpackage.upj
    public final efi k() {
        return new c1k(this.J);
    }

    @Override // defpackage.b0k
    public final pzj q() {
        Object[] objArr = {this.J};
        for (int i = 0; i < 1; i++) {
            fyj fyjVar = pzj.H;
            if (objArr[i] == null) {
                mr9.h(grc.p(i, "at index "));
                return null;
            }
        }
        return pzj.q(1, objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return ij0.j("[", this.J.toString(), "]");
    }
}
