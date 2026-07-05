package defpackage;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes3.dex */
public final class ozc extends f3 implements Collection, nm9 {
    public int E;
    public k3 F;
    public ql8 G;
    public Object[] H;
    public Object[] I;
    public int J;

    public ozc(k3 k3Var, Object[] objArr, Object[] objArr2, int i) {
        objArr2.getClass();
        this.E = i;
        this.F = k3Var;
        this.G = new ql8(21);
        this.H = objArr;
        this.I = objArr2;
        this.J = k3Var.size();
    }

    public static void e(Object[] objArr, int i, Iterator it) {
        while (i < 32 && it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
    }

    public final Object[] A(int i, Object[] objArr, Object[] objArr2) {
        int iM = nuj.m(size() - 1, i);
        Object[] objArrP = p(objArr);
        if (i == 5) {
            objArrP[iM] = objArr2;
            return objArrP;
        }
        objArrP[iM] = A(i - 5, (Object[]) objArrP[iM], objArr2);
        return objArrP;
    }

    public final int B(j3 j3Var, Object[] objArr, int i, int i2, g6 g6Var, ArrayList arrayList, ArrayList arrayList2) {
        if (m(objArr)) {
            arrayList.add(objArr);
        }
        Object obj = g6Var.E;
        obj.getClass();
        Object[] objArr2 = (Object[]) obj;
        Object[] objArrR = objArr2;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj2 = objArr[i3];
            if (!((Boolean) j3Var.invoke(obj2)).booleanValue()) {
                if (i2 == 32) {
                    objArrR = !arrayList.isEmpty() ? (Object[]) arrayList.remove(arrayList.size() - 1) : r();
                    i2 = 0;
                }
                objArrR[i2] = obj2;
                i2++;
            }
        }
        g6Var.E = objArrR;
        if (objArr2 != objArrR) {
            arrayList2.add(objArr2);
        }
        return i2;
    }

    public final int C(j3 j3Var, Object[] objArr, int i, g6 g6Var) {
        Object[] objArrP = objArr;
        int i2 = i;
        boolean z = false;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (((Boolean) j3Var.invoke(obj)).booleanValue()) {
                if (!z) {
                    objArrP = p(objArr);
                    z = true;
                    i2 = i3;
                }
            } else if (z) {
                objArrP[i2] = obj;
                i2++;
            }
        }
        g6Var.E = objArrP;
        return i2;
    }

    public final int D(j3 j3Var, int i, g6 g6Var) {
        int iC = C(j3Var, this.I, i, g6Var);
        Object obj = g6Var.E;
        if (iC == i) {
            return i;
        }
        obj.getClass();
        Object[] objArr = (Object[]) obj;
        Arrays.fill(objArr, iC, i, (Object) null);
        L(objArr);
        this.J = size() - (i - iC);
        return iC;
    }

    public final Object[] E(Object[] objArr, int i, int i2, g6 g6Var) {
        int iM = nuj.m(i2, i);
        if (i == 0) {
            Object obj = objArr[iM];
            Object[] objArrP = p(objArr);
            mp0.s0(iM, iM + 1, 32, objArr, objArrP);
            objArrP[31] = g6Var.E;
            g6Var.E = obj;
            return objArrP;
        }
        int iM2 = objArr[31] == null ? nuj.m(G() - 1, i) : 31;
        Object[] objArrP2 = p(objArr);
        int i3 = i - 5;
        int i4 = iM + 1;
        if (i4 <= iM2) {
            while (true) {
                Object obj2 = objArrP2[iM2];
                obj2.getClass();
                objArrP2[iM2] = E((Object[]) obj2, i3, 0, g6Var);
                if (iM2 == i4) {
                    break;
                }
                iM2--;
            }
        }
        Object obj3 = objArrP2[iM];
        obj3.getClass();
        objArrP2[iM] = E((Object[]) obj3, i3, i2, g6Var);
        return objArrP2;
    }

    public final Object F(Object[] objArr, int i, int i2, int i3) {
        int size = size() - i;
        Object[] objArr2 = this.I;
        if (size == 1) {
            Object obj = objArr2[0];
            v(objArr, i, i2);
            return obj;
        }
        Object obj2 = objArr2[i3];
        Object[] objArrP = p(objArr2);
        mp0.s0(i3, i3 + 1, size, objArr2, objArrP);
        objArrP[size - 1] = null;
        J(objArr);
        L(objArrP);
        this.J = (i + size) - 1;
        this.E = i2;
        return obj2;
    }

    public final int G() {
        if (size() <= 32) {
            return 0;
        }
        return (size() - 1) & (-32);
    }

    public final Object[] I(Object[] objArr, int i, int i2, Object obj, g6 g6Var) {
        int iM = nuj.m(i2, i);
        Object[] objArrP = p(objArr);
        if (i != 0) {
            Object obj2 = objArrP[iM];
            obj2.getClass();
            objArrP[iM] = I((Object[]) obj2, i - 5, i2, obj, g6Var);
            return objArrP;
        }
        if (objArrP != objArr) {
            ((AbstractList) this).modCount++;
        }
        g6Var.E = objArrP[iM];
        objArrP[iM] = obj;
        return objArrP;
    }

    public final void J(Object[] objArr) {
        if (objArr != this.H) {
            this.F = null;
            this.H = objArr;
        }
    }

    public final void L(Object[] objArr) {
        if (objArr != this.I) {
            this.F = null;
            this.I = objArr;
        }
    }

    public final void M(Collection collection, int i, Object[] objArr, int i2, Object[][] objArr2, int i3, Object[] objArr3) {
        Object[] objArrR;
        if (i3 < 1) {
            sz6.j("Check failed.");
            return;
        }
        Object[] objArrP = p(objArr);
        objArr2[0] = objArrP;
        int i4 = i & 31;
        int size = ((collection.size() + i) - 1) & 31;
        int i5 = (i2 - i4) + size;
        if (i5 < 32) {
            mp0.s0(size + 1, i4, i2, objArrP, objArr3);
        } else {
            int i6 = i5 - 31;
            if (i3 == 1) {
                objArrR = objArrP;
            } else {
                objArrR = r();
                i3--;
                objArr2[i3] = objArrR;
            }
            int i7 = i2 - i6;
            mp0.s0(0, i7, i2, objArrP, objArr3);
            mp0.s0(size + 1, i4, i7, objArrP, objArrR);
            objArr3 = objArrR;
        }
        Iterator it = collection.iterator();
        e(objArrP, i4, it);
        for (int i8 = 1; i8 < i3; i8++) {
            Object[] objArrR2 = r();
            e(objArrR2, 0, it);
            objArr2[i8] = objArrR2;
        }
        e(objArr3, 0, it);
    }

    public final int N() {
        int size = size();
        return size <= 32 ? size : size - ((size - 1) & (-32));
    }

    public final k3 a() {
        k3 bbgVar = this.F;
        if (bbgVar == null) {
            Object[] objArr = this.H;
            Object[] objArr2 = this.I;
            this.G = new ql8(21);
            bbgVar = objArr == null ? objArr2.length == 0 ? bbg.F : new bbg(Arrays.copyOf(objArr2, size())) : new mzc(objArr, objArr2, size(), this.E);
            this.F = bbgVar;
        }
        return bbgVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        jwj.d(i, size());
        if (i == size()) {
            add(obj);
            return;
        }
        ((AbstractList) this).modCount++;
        int iG = G();
        if (i >= iG) {
            l(i - iG, obj, this.H);
            return;
        }
        g6 g6Var = new g6(null);
        Object[] objArr = this.H;
        objArr.getClass();
        l(0, g6Var.E, h(objArr, this.E, i, obj, g6Var));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        Collection collection2;
        Object[] objArrR;
        collection.getClass();
        jwj.d(i, size());
        if (i == size()) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i2 = (i >> 5) << 5;
        int size = ((collection.size() + (size() - i2)) - 1) / 32;
        if (size == 0) {
            G();
            int i3 = i & 31;
            int size2 = ((collection.size() + i) - 1) & 31;
            Object[] objArr = this.I;
            Object[] objArrP = p(objArr);
            mp0.s0(size2 + 1, i3, N(), objArr, objArrP);
            e(objArrP, i3, collection.iterator());
            L(objArrP);
            this.J = collection.size() + size();
            return true;
        }
        Object[][] objArr2 = new Object[size][];
        int iN = N();
        int size3 = collection.size() + size();
        if (size3 > 32) {
            size3 -= (size3 - 1) & (-32);
        }
        if (i >= G()) {
            objArrR = r();
            collection2 = collection;
            M(collection2, i, this.I, iN, objArr2, size, objArrR);
            objArr2 = objArr2;
        } else {
            collection2 = collection;
            Object[] objArr3 = this.I;
            if (size3 > iN) {
                int i4 = size3 - iN;
                Object[] objArrQ = q(i4, objArr3);
                k(collection2, i, i4, objArr2, size, objArrQ);
                objArr2 = objArr2;
                objArrR = objArrQ;
            } else {
                objArrR = r();
                int i5 = iN - size3;
                mp0.s0(0, i5, iN, objArr3, objArrR);
                int i6 = 32 - i5;
                Object[] objArrQ2 = q(i6, this.I);
                int i7 = size - 1;
                objArr2[i7] = objArrQ2;
                k(collection2, i, i6, objArr2, i7, objArrQ2);
                collection2 = collection2;
            }
        }
        J(y(this.H, i2, objArr2));
        L(objArrR);
        this.J = collection2.size() + size();
        return true;
    }

    public final int g() {
        return ((AbstractList) this).modCount;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        Object[] objArr;
        jwj.c(i, size());
        if (G() <= i) {
            objArr = this.I;
        } else {
            Object[] objArr2 = this.H;
            objArr2.getClass();
            for (int i2 = this.E; i2 > 0; i2 -= 5) {
                Object[] objArr3 = objArr2[nuj.m(i, i2)];
                objArr3.getClass();
                objArr2 = objArr3;
            }
            objArr = objArr2;
        }
        return objArr[i & 31];
    }

    @Override // defpackage.f3
    public final int getSize() {
        return this.J;
    }

    public final Object[] h(Object[] objArr, int i, int i2, Object obj, g6 g6Var) {
        Object obj2;
        int iM = nuj.m(i2, i);
        if (i == 0) {
            g6Var.E = objArr[31];
            Object[] objArrP = p(objArr);
            mp0.s0(iM + 1, iM, 31, objArr, objArrP);
            objArrP[iM] = obj;
            return objArrP;
        }
        Object[] objArrP2 = p(objArr);
        int i3 = i - 5;
        Object obj3 = objArrP2[iM];
        obj3.getClass();
        objArrP2[iM] = h((Object[]) obj3, i3, i2, obj, g6Var);
        while (true) {
            iM++;
            if (iM >= 32 || (obj2 = objArrP2[iM]) == null) {
                break;
            }
            objArrP2[iM] = h((Object[]) obj2, i3, 0, g6Var.E, g6Var);
        }
        return objArrP2;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final void k(Collection collection, int i, int i2, Object[][] objArr, int i3, Object[] objArr2) {
        if (this.H == null) {
            sz6.j("Required value was null.");
            return;
        }
        int i4 = i >> 5;
        j2 j2VarO = o(G() >> 5);
        int i5 = i3;
        Object[] objArrQ = objArr2;
        while (j2VarO.E - 1 != i4) {
            Object[] objArr3 = (Object[]) j2VarO.previous();
            mp0.s0(0, 32 - i2, 32, objArr3, objArrQ);
            objArrQ = q(i2, objArr3);
            i5--;
            objArr[i5] = objArrQ;
        }
        Object[] objArr4 = (Object[]) j2VarO.previous();
        int iG = i3 - (((G() >> 5) - 1) - i4);
        if (iG < i3) {
            objArr2 = objArr[iG];
            objArr2.getClass();
        }
        M(collection, i, objArr4, 32, objArr, iG, objArr2);
    }

    public final void l(int i, Object obj, Object[] objArr) {
        int iN = N();
        Object[] objArrP = p(this.I);
        Object[] objArr2 = this.I;
        if (iN >= 32) {
            Object obj2 = objArr2[31];
            mp0.s0(i + 1, i, 31, objArr2, objArrP);
            objArrP[i] = obj;
            z(objArr, objArrP, s(obj2));
            return;
        }
        mp0.s0(i + 1, i, iN, objArr2, objArrP);
        objArrP[i] = obj;
        J(objArr);
        L(objArrP);
        this.J = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        jwj.d(i, size());
        return new szc(this, i);
    }

    public final boolean m(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.G;
    }

    public final j2 o(int i) {
        if (this.H == null) {
            sz6.j("Required value was null.");
            return null;
        }
        int iG = G() >> 5;
        jwj.d(i, iG);
        int i2 = this.E;
        Object[] objArr = this.H;
        if (i2 == 0) {
            objArr.getClass();
            return new ny1(i, objArr);
        }
        objArr.getClass();
        return new u6i(objArr, i, iG, i2 / 5);
    }

    public final Object[] p(Object[] objArr) {
        if (objArr == null) {
            return r();
        }
        if (m(objArr)) {
            return objArr;
        }
        Object[] objArrR = r();
        int length = objArr.length;
        if (length > 32) {
            length = 32;
        }
        mp0.v0(0, length, 6, objArr, objArrR);
        return objArrR;
    }

    public final Object[] q(int i, Object[] objArr) {
        if (m(objArr)) {
            mp0.s0(i, 0, 32 - i, objArr, objArr);
            return objArr;
        }
        Object[] objArrR = r();
        mp0.s0(i, 0, 32 - i, objArr, objArrR);
        return objArrR;
    }

    public final Object[] r() {
        Object[] objArr = new Object[33];
        objArr[32] = this.G;
        return objArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0029, code lost:
    
        r2 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0059, code lost:
    
        if (r2 != r15) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
    
        if (D(r3, r15, r7) != r15) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
    
        r2 = r14;
     */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean removeAll(java.util.Collection r15) {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ozc.removeAll(java.util.Collection):boolean");
    }

    @Override // defpackage.f3
    public final Object removeAt(int i) {
        jwj.c(i, size());
        ((AbstractList) this).modCount++;
        int iG = G();
        if (i >= iG) {
            return F(this.H, iG, this.E, i - iG);
        }
        g6 g6Var = new g6(this.I[0]);
        Object[] objArr = this.H;
        objArr.getClass();
        F(E(objArr, this.E, i, g6Var), iG, this.E, 0);
        return g6Var.E;
    }

    public final Object[] s(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.G;
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        jwj.c(i, size());
        if (G() > i) {
            g6 g6Var = new g6(null);
            Object[] objArr = this.H;
            objArr.getClass();
            J(I(objArr, this.E, i, obj, g6Var));
            return g6Var.E;
        }
        Object[] objArrP = p(this.I);
        if (objArrP != this.I) {
            ((AbstractList) this).modCount++;
        }
        int i2 = i & 31;
        Object obj2 = objArrP[i2];
        objArrP[i2] = obj;
        L(objArrP);
        return obj2;
    }

    public final Object[] t(Object[] objArr, int i, int i2) {
        if (i2 < 0) {
            sz6.j("Check failed.");
            return null;
        }
        if (i2 == 0) {
            return objArr;
        }
        int iM = nuj.m(i, i2);
        Object obj = objArr[iM];
        obj.getClass();
        Object objT = t((Object[]) obj, i, i2 - 5);
        if (iM < 31) {
            int i3 = iM + 1;
            if (objArr[i3] != null) {
                if (m(objArr)) {
                    Arrays.fill(objArr, i3, 32, (Object) null);
                }
                Object[] objArrR = r();
                mp0.s0(0, 0, i3, objArr, objArrR);
                objArr = objArrR;
            }
        }
        if (objT == objArr[iM]) {
            return objArr;
        }
        Object[] objArrP = p(objArr);
        objArrP[iM] = objT;
        return objArrP;
    }

    public final Object[] u(Object[] objArr, int i, int i2, g6 g6Var) {
        Object[] objArrU;
        int iM = nuj.m(i2 - 1, i);
        if (i == 5) {
            g6Var.E = objArr[iM];
            objArrU = null;
        } else {
            Object obj = objArr[iM];
            obj.getClass();
            objArrU = u((Object[]) obj, i - 5, i2, g6Var);
        }
        if (objArrU == null && iM == 0) {
            return null;
        }
        Object[] objArrP = p(objArr);
        objArrP[iM] = objArrU;
        return objArrP;
    }

    public final void v(Object[] objArr, int i, int i2) {
        Object obj = null;
        if (i2 == 0) {
            J(null);
            if (objArr == null) {
                objArr = new Object[0];
            }
            L(objArr);
            this.J = i;
            this.E = i2;
            return;
        }
        g6 g6Var = new g6(obj);
        objArr.getClass();
        Object[] objArrU = u(objArr, i2, i, g6Var);
        objArrU.getClass();
        Object obj2 = g6Var.E;
        obj2.getClass();
        L((Object[]) obj2);
        this.J = i;
        if (objArrU[1] == null) {
            J((Object[]) objArrU[0]);
            this.E = i2 - 5;
        } else {
            J(objArrU);
            this.E = i2;
        }
    }

    public final Object[] w(Object[] objArr, int i, int i2, Iterator it) {
        if (!it.hasNext()) {
            sz6.j("Check failed.");
            return null;
        }
        if (i2 < 0) {
            sz6.j("Check failed.");
            return null;
        }
        if (i2 == 0) {
            return (Object[]) it.next();
        }
        Object[] objArrP = p(objArr);
        int iM = nuj.m(i, i2);
        int i3 = i2 - 5;
        objArrP[iM] = w((Object[]) objArrP[iM], i, i3, it);
        while (true) {
            iM++;
            if (iM >= 32 || !it.hasNext()) {
                break;
            }
            objArrP[iM] = w((Object[]) objArrP[iM], 0, i3, it);
        }
        return objArrP;
    }

    public final Object[] y(Object[] objArr, int i, Object[][] objArr2) {
        f2 f2Var = new f2(objArr2);
        int i2 = i >> 5;
        int i3 = this.E;
        Object[] objArrW = i2 < (1 << i3) ? w(objArr, i, i3, f2Var) : p(objArr);
        while (f2Var.hasNext()) {
            this.E += 5;
            objArrW = s(objArrW);
            int i4 = this.E;
            w(objArrW, 1 << i4, i4, f2Var);
        }
        return objArrW;
    }

    public final void z(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int size = size() >> 5;
        int i = this.E;
        if (size > (1 << i)) {
            J(A(this.E + 5, s(objArr), objArr2));
            L(objArr3);
            this.E += 5;
            this.J = size() + 1;
            return;
        }
        if (objArr == null) {
            J(objArr2);
            L(objArr3);
            this.J = size() + 1;
        } else {
            J(A(i, objArr, objArr2));
            L(objArr3);
            this.J = size() + 1;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        ((AbstractList) this).modCount++;
        int iN = N();
        if (iN < 32) {
            Object[] objArrP = p(this.I);
            objArrP[iN] = obj;
            L(objArrP);
            this.J = size() + 1;
        } else {
            z(this.H, this.I, s(obj));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int iN = N();
        Iterator it = collection.iterator();
        if (32 - iN >= collection.size()) {
            Object[] objArrP = p(this.I);
            e(objArrP, iN, it);
            L(objArrP);
            this.J = collection.size() + size();
            return true;
        }
        int size = ((collection.size() + iN) - 1) / 32;
        Object[][] objArr = new Object[size][];
        Object[] objArrP2 = p(this.I);
        e(objArrP2, iN, it);
        objArr[0] = objArrP2;
        for (int i = 1; i < size; i++) {
            Object[] objArrR = r();
            e(objArrR, 0, it);
            objArr[i] = objArrR;
        }
        J(y(this.H, G(), objArr));
        Object[] objArrR2 = r();
        e(objArrR2, 0, it);
        L(objArrR2);
        this.J = collection.size() + size();
        return true;
    }
}
