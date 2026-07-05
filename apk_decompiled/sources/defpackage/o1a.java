package defpackage;

import com.google.crypto.tink.shaded.protobuf.o;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public final class o1a extends q3 implements r1a, RandomAccess {
    public final ArrayList F;

    static {
        new o1a(10).E = false;
    }

    public o1a(int i) {
        this(new ArrayList(i));
    }

    @Override // defpackage.r1a
    public final void T(k22 k22Var) {
        a();
        this.F.add(k22Var);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        a();
        this.F.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.q3, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        a();
        if (collection instanceof r1a) {
            collection = ((r1a) collection).c();
        }
        boolean zAddAll = this.F.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // defpackage.r1a
    public final Object b0(int i) {
        return this.F.get(i);
    }

    @Override // defpackage.r1a
    public final List c() {
        return Collections.unmodifiableList(this.F);
    }

    @Override // defpackage.q3, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        a();
        this.F.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        String str;
        ArrayList arrayList = this.F;
        Object obj = arrayList.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (!(obj instanceof k22)) {
            byte[] bArr = (byte[]) obj;
            String str2 = new String(bArr, t89.a);
            if (o.a.o(bArr, 0, bArr.length)) {
                arrayList.set(i, str2);
            }
            return str2;
        }
        k22 k22Var = (k22) obj;
        Charset charset = t89.a;
        if (k22Var.size() == 0) {
            str = "";
        } else {
            g22 g22Var = (g22) k22Var;
            str = new String(g22Var.H, g22Var.k(), g22Var.size(), charset);
        }
        g22 g22Var2 = (g22) k22Var;
        int iK = g22Var2.k();
        if (o.a.o(g22Var2.H, iK, g22Var2.size() + iK)) {
            arrayList.set(i, str);
        }
        return str;
    }

    @Override // defpackage.r1a
    public final r1a i() {
        return this.E ? new jfi(this) : this;
    }

    @Override // defpackage.p89
    public final p89 j(int i) {
        ArrayList arrayList = this.F;
        if (i < arrayList.size()) {
            mr9.y();
            return null;
        }
        ArrayList arrayList2 = new ArrayList(i);
        arrayList2.addAll(arrayList);
        return new o1a(arrayList2);
    }

    @Override // defpackage.q3, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        a();
        Object objRemove = this.F.remove(i);
        ((AbstractList) this).modCount++;
        if (objRemove instanceof String) {
            return (String) objRemove;
        }
        if (!(objRemove instanceof k22)) {
            return new String((byte[]) objRemove, t89.a);
        }
        k22 k22Var = (k22) objRemove;
        Charset charset = t89.a;
        if (k22Var.size() == 0) {
            return "";
        }
        g22 g22Var = (g22) k22Var;
        return new String(g22Var.H, g22Var.k(), g22Var.size(), charset);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        a();
        Object obj2 = this.F.set(i, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof k22)) {
            return new String((byte[]) obj2, t89.a);
        }
        k22 k22Var = (k22) obj2;
        Charset charset = t89.a;
        if (k22Var.size() == 0) {
            return "";
        }
        g22 g22Var = (g22) k22Var;
        return new String(g22Var.H, g22Var.k(), g22Var.size(), charset);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.F.size();
    }

    public o1a(ArrayList arrayList) {
        this.F = arrayList;
    }

    @Override // defpackage.q3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.F.size(), collection);
    }
}
