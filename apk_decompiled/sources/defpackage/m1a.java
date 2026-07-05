package defpackage;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class m1a extends r3 implements s1a {
    public final ArrayList F;

    static {
        new m1a(10).E = false;
    }

    public m1a(int i) {
        this(new ArrayList(i));
    }

    @Override // defpackage.s1a
    public final void K(h22 h22Var) {
        a();
        this.F.add(h22Var);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        a();
        this.F.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.r3, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        a();
        if (collection instanceof s1a) {
            collection = ((s1a) collection).c();
        }
        boolean zAddAll = this.F.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // defpackage.r3
    public final r3 b(int i) {
        ArrayList arrayList = this.F;
        if (i < arrayList.size()) {
            mr9.y();
            return null;
        }
        ArrayList arrayList2 = new ArrayList(i);
        arrayList2.addAll(arrayList);
        return new m1a(arrayList2);
    }

    @Override // defpackage.s1a
    public final List c() {
        return Collections.unmodifiableList(this.F);
    }

    @Override // defpackage.r3, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        a();
        this.F.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        ArrayList arrayList = this.F;
        Object obj = arrayList.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (!(obj instanceof h22)) {
            byte[] bArr = (byte[]) obj;
            String str = new String(bArr, u89.a);
            if (kpi.a.l(bArr, 0, bArr.length) == 0) {
                arrayList.set(i, str);
            }
            return str;
        }
        h22 h22Var = (h22) obj;
        String str2 = h22Var.size() == 0 ? "" : new String(h22Var.F, h22Var.g(), h22Var.size(), u89.a);
        int iG = h22Var.g();
        if (kpi.a.l(h22Var.F, iG, h22Var.size() + iG) == 0) {
            arrayList.set(i, str2);
        }
        return str2;
    }

    @Override // defpackage.s1a
    public final s1a i() {
        return this.E ? new hfi(this) : this;
    }

    @Override // defpackage.r3, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        a();
        Object objRemove = this.F.remove(i);
        ((AbstractList) this).modCount++;
        if (objRemove instanceof String) {
            return (String) objRemove;
        }
        if (!(objRemove instanceof h22)) {
            return new String((byte[]) objRemove, u89.a);
        }
        h22 h22Var = (h22) objRemove;
        return h22Var.size() == 0 ? "" : new String(h22Var.F, h22Var.g(), h22Var.size(), u89.a);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        a();
        Object obj2 = this.F.set(i, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof h22)) {
            return new String((byte[]) obj2, u89.a);
        }
        h22 h22Var = (h22) obj2;
        return h22Var.size() == 0 ? "" : new String(h22Var.F, h22Var.g(), h22Var.size(), u89.a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.F.size();
    }

    public m1a(ArrayList arrayList) {
        this.F = arrayList;
    }

    @Override // defpackage.r3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.F.size(), collection);
    }
}
