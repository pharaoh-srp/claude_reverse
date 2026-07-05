package defpackage;

import java.io.UnsupportedEncodingException;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class n1a extends AbstractList implements RandomAccess, t1a {
    public static final ifi F = new ifi(new n1a());
    public final ArrayList E;

    public n1a(t1a t1aVar) {
        this.E = new ArrayList(t1aVar.size());
        addAll(t1aVar);
    }

    @Override // defpackage.t1a
    public final l22 R(int i) {
        l22 obaVar;
        ArrayList arrayList = this.E;
        Object obj = arrayList.get(i);
        if (obj instanceof l22) {
            obaVar = (l22) obj;
        } else if (obj instanceof String) {
            try {
                obaVar = new oba(((String) obj).getBytes("UTF-8"));
            } catch (UnsupportedEncodingException e) {
                xh6.f("UTF-8 not supported?", e);
                return null;
            }
        } else {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length;
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArr, 0, bArr2, 0, length);
            obaVar = new oba(bArr2);
        }
        if (obaVar != obj) {
            arrayList.set(i, obaVar);
        }
        return obaVar;
    }

    @Override // defpackage.t1a
    public final void S(oba obaVar) {
        this.E.add(obaVar);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        this.E.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        if (collection instanceof t1a) {
            collection = ((t1a) collection).c();
        }
        boolean zAddAll = this.E.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // defpackage.t1a
    public final List c() {
        return Collections.unmodifiableList(this.E);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.E.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        ArrayList arrayList = this.E;
        Object obj = arrayList.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof l22) {
            l22 l22Var = (l22) obj;
            String strS = l22Var.s();
            if (l22Var.l()) {
                arrayList.set(i, strS);
            }
            return strS;
        }
        byte[] bArr = (byte[]) obj;
        String strB = v89.b(bArr);
        if (v89.a(bArr)) {
            arrayList.set(i, strB);
        }
        return strB;
    }

    @Override // defpackage.t1a
    public final ifi i() {
        return new ifi(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        Object objRemove = this.E.remove(i);
        ((AbstractList) this).modCount++;
        return objRemove instanceof String ? (String) objRemove : objRemove instanceof l22 ? ((l22) objRemove).s() : v89.b((byte[]) objRemove);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        Object obj2 = this.E.set(i, (String) obj);
        return obj2 instanceof String ? (String) obj2 : obj2 instanceof l22 ? ((l22) obj2).s() : v89.b((byte[]) obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.E.size();
    }

    public n1a() {
        this.E = new ArrayList();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.E.size(), collection);
    }
}
