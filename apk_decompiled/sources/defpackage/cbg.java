package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class cbg extends l3 {
    public static final cbg F = new cbg(new Object[0]);
    public final Object[] E;

    public cbg(Object[] objArr) {
        this.E = objArr;
    }

    @Override // defpackage.l3
    public final l3 a(int i, Object obj) {
        zni.m(i, size());
        if (i == size()) {
            return e(obj);
        }
        int size = size();
        Object[] objArr = this.E;
        if (size < 32) {
            Object[] objArr2 = new Object[size() + 1];
            mp0.v0(0, i, 6, objArr, objArr2);
            mp0.s0(i + 1, i, size(), objArr, objArr2);
            objArr2[i] = obj;
            return new cbg(objArr2);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        mp0.s0(i + 1, i, size() - 1, objArr, objArrCopyOf);
        objArrCopyOf[i] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = objArr[31];
        return new nzc(objArrCopyOf, objArr3, size() + 1, 0);
    }

    @Override // defpackage.l3
    public final l3 e(Object obj) {
        int size = size();
        Object[] objArr = this.E;
        if (size < 32) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, size() + 1);
            objArrCopyOf[size()] = obj;
            return new cbg(objArrCopyOf);
        }
        Object[] objArr2 = new Object[32];
        objArr2[0] = obj;
        return new nzc(objArr, objArr2, size() + 1, 0);
    }

    @Override // defpackage.l3
    public final l3 g(Collection collection) {
        if (collection.size() + size() > 32) {
            pzc pzcVarH = h();
            pzcVarH.addAll(collection);
            return pzcVarH.a();
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.E, collection.size() + size());
        int size = size();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            objArrCopyOf[size] = it.next();
            size++;
        }
        return new cbg(objArrCopyOf);
    }

    @Override // java.util.List
    public final Object get(int i) {
        zni.k(i, size());
        return this.E[i];
    }

    @Override // defpackage.w0
    public final int getSize() {
        return this.E.length;
    }

    @Override // defpackage.l3
    public final pzc h() {
        return new pzc(this, null, this.E, 0);
    }

    @Override // defpackage.i2, java.util.List
    public final int indexOf(Object obj) {
        return mp0.J0(obj, this.E);
    }

    @Override // defpackage.l3
    public final l3 k(j3 j3Var) {
        int size = size();
        int size2 = size();
        Object[] objArr = this.E;
        Object[] objArrCopyOf = objArr;
        boolean z = false;
        for (int i = 0; i < size2; i++) {
            Object obj = objArr[i];
            if (((Boolean) j3Var.invoke(obj)).booleanValue()) {
                if (!z) {
                    objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                    z = true;
                    size = i;
                }
            } else if (z) {
                objArrCopyOf[size] = obj;
                size++;
            }
        }
        return size == size() ? this : size == 0 ? F : new cbg(mp0.y0(objArrCopyOf, 0, size));
    }

    @Override // defpackage.l3
    public final l3 l(int i) {
        zni.k(i, size());
        if (size() == 1) {
            return F;
        }
        int size = size() - 1;
        Object[] objArr = this.E;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, size);
        mp0.s0(i, i + 1, size(), objArr, objArrCopyOf);
        return new cbg(objArrCopyOf);
    }

    @Override // defpackage.i2, java.util.List
    public final int lastIndexOf(Object obj) {
        return mp0.O0(obj, this.E);
    }

    @Override // defpackage.i2, java.util.List
    public final ListIterator listIterator(int i) {
        zni.m(i, size());
        return new oy1(this.E, i, size());
    }

    @Override // defpackage.l3
    public final l3 m(int i, Object obj) {
        zni.k(i, size());
        Object[] objArr = this.E;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        objArrCopyOf[i] = obj;
        return new cbg(objArrCopyOf);
    }
}
