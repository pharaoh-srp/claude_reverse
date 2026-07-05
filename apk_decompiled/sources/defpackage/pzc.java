package defpackage;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes2.dex */
public final class pzc extends f3 implements Collection, nm9 {
    public l3 E;
    public Object[] F;
    public Object[] G;
    public int H;
    public vz8 I = new vz8(21);
    public Object[] J;
    public Object[] K;
    public int L;

    public pzc(l3 l3Var, Object[] objArr, Object[] objArr2, int i) {
        this.E = l3Var;
        this.F = objArr;
        this.G = objArr2;
        this.H = i;
        this.J = objArr;
        this.K = objArr2;
        this.L = l3Var.size();
    }

    public static void e(Object[] objArr, int i, Iterator it) {
        while (i < 32 && it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
    }

    public final Object[] A(int i, Object[] objArr, Object[] objArr2) {
        int iC0 = fd9.c0(size() - 1, i);
        Object[] objArrP = p(objArr);
        if (i == 5) {
            objArrP[iC0] = objArr2;
            return objArrP;
        }
        objArrP[iC0] = A(i - 5, (Object[]) objArrP[iC0], objArr2);
        return objArrP;
    }

    public final int B(bz7 bz7Var, Object[] objArr, int i, int i2, h6 h6Var, ArrayList arrayList, ArrayList arrayList2) {
        if (m(objArr)) {
            arrayList.add(objArr);
        }
        Object obj = h6Var.a;
        obj.getClass();
        Object[] objArr2 = (Object[]) obj;
        Object[] objArrR = objArr2;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj2 = objArr[i3];
            if (!((Boolean) bz7Var.invoke(obj2)).booleanValue()) {
                if (i2 == 32) {
                    objArrR = !arrayList.isEmpty() ? (Object[]) arrayList.remove(arrayList.size() - 1) : r();
                    i2 = 0;
                }
                objArrR[i2] = obj2;
                i2++;
            }
        }
        h6Var.a = objArrR;
        if (objArr2 != objArrR) {
            arrayList2.add(objArr2);
        }
        return i2;
    }

    public final int C(bz7 bz7Var, Object[] objArr, int i, h6 h6Var) {
        Object[] objArrP = objArr;
        int i2 = i;
        boolean z = false;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (((Boolean) bz7Var.invoke(obj)).booleanValue()) {
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
        h6Var.a = objArrP;
        return i2;
    }

    public final int D(bz7 bz7Var, int i, h6 h6Var) {
        int iC = C(bz7Var, this.K, i, h6Var);
        Object obj = h6Var.a;
        if (iC == i) {
            return i;
        }
        obj.getClass();
        Object[] objArr = (Object[]) obj;
        Arrays.fill(objArr, iC, i, (Object) null);
        this.K = objArr;
        this.L = size() - (i - iC);
        return iC;
    }

    public final boolean E(bz7 bz7Var) {
        int i;
        bz7 bz7Var2 = bz7Var;
        int iM = M();
        Object[] objArrT = null;
        h6 h6Var = new h6(objArrT);
        boolean z = false;
        if (this.J != null) {
            k2 k2VarO = o(0);
            int iC = 32;
            while (iC == 32 && k2VarO.hasNext()) {
                iC = C(bz7Var2, (Object[]) k2VarO.next(), 32, h6Var);
            }
            if (iC == 32) {
                int iD = D(bz7Var2, iM, h6Var);
                if (iD == 0) {
                    v(this.J, size(), this.H);
                }
                if (iD != iM) {
                }
            } else {
                int i2 = (k2VarO.E - 1) << 5;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int iB = iC;
                while (k2VarO.hasNext()) {
                    iB = B(bz7Var2, (Object[]) k2VarO.next(), 32, iB, h6Var, arrayList2, arrayList);
                    bz7Var2 = bz7Var;
                }
                int iB2 = B(bz7Var, this.K, iM, iB, h6Var, arrayList2, arrayList);
                Object obj = h6Var.a;
                obj.getClass();
                Object[] objArr = (Object[]) obj;
                Arrays.fill(objArr, iB2, 32, (Object) null);
                boolean zIsEmpty = arrayList.isEmpty();
                Object[] objArrW = this.J;
                if (zIsEmpty) {
                    objArrW.getClass();
                } else {
                    objArrW = w(objArrW, i2, this.H, arrayList.iterator());
                }
                int size = i2 + (arrayList.size() << 5);
                if ((size & 31) != 0) {
                    zad.a("invalid size");
                }
                if (size == 0) {
                    this.H = 0;
                } else {
                    int i3 = size - 1;
                    while (true) {
                        i = this.H;
                        if ((i3 >> i) != 0) {
                            break;
                        }
                        this.H = i - 5;
                        Object[] objArr2 = objArrW[0];
                        objArr2.getClass();
                        objArrW = objArr2;
                    }
                    objArrT = t(objArrW, i3, i);
                }
                this.J = objArrT;
                this.K = objArr;
                this.L = size + iB2;
            }
            z = true;
        } else if (D(bz7Var2, iM, h6Var) != iM) {
            z = true;
        }
        if (z) {
            ((AbstractList) this).modCount++;
        }
        return z;
    }

    public final Object[] F(Object[] objArr, int i, int i2, h6 h6Var) {
        int iC0 = fd9.c0(i2, i);
        if (i == 0) {
            Object obj = objArr[iC0];
            Object[] objArrP = p(objArr);
            mp0.s0(iC0, iC0 + 1, 32, objArr, objArrP);
            objArrP[31] = h6Var.a;
            h6Var.a = obj;
            return objArrP;
        }
        int iC02 = objArr[31] == null ? fd9.c0(I() - 1, i) : 31;
        Object[] objArrP2 = p(objArr);
        int i3 = i - 5;
        int i4 = iC0 + 1;
        if (i4 <= iC02) {
            while (true) {
                Object obj2 = objArrP2[iC02];
                obj2.getClass();
                objArrP2[iC02] = F((Object[]) obj2, i3, 0, h6Var);
                if (iC02 == i4) {
                    break;
                }
                iC02--;
            }
        }
        Object obj3 = objArrP2[iC0];
        obj3.getClass();
        objArrP2[iC0] = F((Object[]) obj3, i3, i2, h6Var);
        return objArrP2;
    }

    public final Object G(Object[] objArr, int i, int i2, int i3) {
        int size = size() - i;
        Object[] objArr2 = this.K;
        if (size == 1) {
            Object obj = objArr2[0];
            v(objArr, i, i2);
            return obj;
        }
        Object obj2 = objArr2[i3];
        Object[] objArrP = p(objArr2);
        mp0.s0(i3, i3 + 1, size, objArr2, objArrP);
        objArrP[size - 1] = null;
        this.J = objArr;
        this.K = objArrP;
        this.L = (i + size) - 1;
        this.H = i2;
        return obj2;
    }

    public final int I() {
        if (size() <= 32) {
            return 0;
        }
        return (size() - 1) & (-32);
    }

    public final Object[] J(Object[] objArr, int i, int i2, Object obj, h6 h6Var) {
        int iC0 = fd9.c0(i2, i);
        Object[] objArrP = p(objArr);
        if (i != 0) {
            Object obj2 = objArrP[iC0];
            obj2.getClass();
            objArrP[iC0] = J((Object[]) obj2, i - 5, i2, obj, h6Var);
            return objArrP;
        }
        if (objArrP != objArr) {
            ((AbstractList) this).modCount++;
        }
        h6Var.a = objArrP[iC0];
        objArrP[iC0] = obj;
        return objArrP;
    }

    public final void L(Collection collection, int i, Object[] objArr, int i2, Object[][] objArr2, int i3, Object[] objArr3) {
        Object[] objArrR;
        if (i3 < 1) {
            zad.a("requires at least one nullBuffer");
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

    public final int M() {
        int size = size();
        return size <= 32 ? size : size - ((size - 1) & (-32));
    }

    public final l3 a() {
        l3 cbgVar;
        Object[] objArr = this.J;
        if (objArr == this.F && this.K == this.G) {
            cbgVar = this.E;
        } else {
            this.I = new vz8(21);
            this.F = objArr;
            Object[] objArr2 = this.K;
            this.G = objArr2;
            cbgVar = objArr == null ? objArr2.length == 0 ? cbg.F : new cbg(Arrays.copyOf(objArr2, size())) : new nzc(objArr, objArr2, size(), this.H);
        }
        this.E = cbgVar;
        return cbgVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        zni.m(i, size());
        if (i == size()) {
            add(obj);
            return;
        }
        ((AbstractList) this).modCount++;
        int I = I();
        if (i >= I) {
            l(i - I, obj, this.J);
            return;
        }
        h6 h6Var = new h6(null);
        Object[] objArr = this.J;
        objArr.getClass();
        l(0, h6Var.a, k(objArr, this.H, i, obj, h6Var));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        Collection collection2;
        Object[] objArrR;
        zni.m(i, size());
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
            I();
            int i3 = i & 31;
            int size2 = ((collection.size() + i) - 1) & 31;
            Object[] objArr = this.K;
            Object[] objArrP = p(objArr);
            mp0.s0(size2 + 1, i3, M(), objArr, objArrP);
            e(objArrP, i3, collection.iterator());
            this.K = objArrP;
            this.L = collection.size() + size();
            return true;
        }
        Object[][] objArr2 = new Object[size][];
        int iM = M();
        int size3 = collection.size() + size();
        if (size3 > 32) {
            size3 -= (size3 - 1) & (-32);
        }
        if (i >= I()) {
            objArrR = r();
            collection2 = collection;
            L(collection2, i, this.K, iM, objArr2, size, objArrR);
            objArr2 = objArr2;
        } else {
            collection2 = collection;
            Object[] objArr3 = this.K;
            if (size3 > iM) {
                int i4 = size3 - iM;
                Object[] objArrQ = q(i4, objArr3);
                h(collection2, i, i4, objArr2, size, objArrQ);
                objArr2 = objArr2;
                objArrR = objArrQ;
            } else {
                objArrR = r();
                int i5 = iM - size3;
                mp0.s0(0, i5, iM, objArr3, objArrR);
                int i6 = 32 - i5;
                Object[] objArrQ2 = q(i6, this.K);
                int i7 = size - 1;
                objArr2[i7] = objArrQ2;
                h(collection2, i, i6, objArr2, i7, objArrQ2);
                collection2 = collection2;
            }
        }
        this.J = y(this.J, i2, objArr2);
        this.K = objArrR;
        this.L = collection2.size() + size();
        return true;
    }

    public final int g() {
        return ((AbstractList) this).modCount;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        Object[] objArr;
        zni.k(i, size());
        if (I() <= i) {
            objArr = this.K;
        } else {
            Object[] objArr2 = this.J;
            objArr2.getClass();
            for (int i2 = this.H; i2 > 0; i2 -= 5) {
                Object[] objArr3 = objArr2[fd9.c0(i, i2)];
                objArr3.getClass();
                objArr2 = objArr3;
            }
            objArr = objArr2;
        }
        return objArr[i & 31];
    }

    @Override // defpackage.f3
    public final int getSize() {
        return this.L;
    }

    public final void h(Collection collection, int i, int i2, Object[][] objArr, int i3, Object[] objArr2) {
        if (this.J == null) {
            sz6.j("root is null");
            return;
        }
        int i4 = i >> 5;
        k2 k2VarO = o(I() >> 5);
        int i5 = i3;
        Object[] objArrQ = objArr2;
        while (k2VarO.E - 1 != i4) {
            Object[] objArr3 = (Object[]) k2VarO.previous();
            mp0.s0(0, 32 - i2, 32, objArr3, objArrQ);
            objArrQ = q(i2, objArr3);
            i5--;
            objArr[i5] = objArrQ;
        }
        Object[] objArr4 = (Object[]) k2VarO.previous();
        int I = i3 - (((I() >> 5) - 1) - i4);
        if (I < i3) {
            objArr2 = objArr[I];
            objArr2.getClass();
        }
        L(collection, i, objArr4, 32, objArr, I, objArr2);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final Object[] k(Object[] objArr, int i, int i2, Object obj, h6 h6Var) {
        Object obj2;
        int iC0 = fd9.c0(i2, i);
        if (i == 0) {
            h6Var.a = objArr[31];
            Object[] objArrP = p(objArr);
            mp0.s0(iC0 + 1, iC0, 31, objArr, objArrP);
            objArrP[iC0] = obj;
            return objArrP;
        }
        Object[] objArrP2 = p(objArr);
        int i3 = i - 5;
        Object obj3 = objArrP2[iC0];
        obj3.getClass();
        objArrP2[iC0] = k((Object[]) obj3, i3, i2, obj, h6Var);
        while (true) {
            iC0++;
            if (iC0 >= 32 || (obj2 = objArrP2[iC0]) == null) {
                break;
            }
            objArrP2[iC0] = k((Object[]) obj2, i3, 0, h6Var.a, h6Var);
        }
        return objArrP2;
    }

    public final void l(int i, Object obj, Object[] objArr) {
        int iM = M();
        Object[] objArrP = p(this.K);
        Object[] objArr2 = this.K;
        if (iM >= 32) {
            Object obj2 = objArr2[31];
            mp0.s0(i + 1, i, 31, objArr2, objArrP);
            objArrP[i] = obj;
            z(objArr, objArrP, s(obj2));
            return;
        }
        mp0.s0(i + 1, i, iM, objArr2, objArrP);
        objArrP[i] = obj;
        this.J = objArr;
        this.K = objArrP;
        this.L = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        zni.m(i, size());
        return new tzc(this, i);
    }

    public final boolean m(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.I;
    }

    public final k2 o(int i) {
        Object[] objArr = this.J;
        if (objArr == null) {
            sz6.j("Invalid root");
            return null;
        }
        int I = I() >> 5;
        zni.m(i, I);
        int i2 = this.H;
        return i2 == 0 ? new s7g(i, objArr) : new v6i(objArr, i, I, i2 / 5);
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
        objArr[32] = this.I;
        return objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        return E(new j3(2, collection));
    }

    @Override // defpackage.f3
    public final Object removeAt(int i) {
        zni.k(i, size());
        ((AbstractList) this).modCount++;
        int I = I();
        if (i >= I) {
            return G(this.J, I, this.H, i - I);
        }
        h6 h6Var = new h6(this.K[0]);
        Object[] objArr = this.J;
        objArr.getClass();
        G(F(objArr, this.H, i, h6Var), I, this.H, 0);
        return h6Var.a;
    }

    public final Object[] s(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.I;
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        zni.k(i, size());
        if (I() > i) {
            h6 h6Var = new h6(null);
            Object[] objArr = this.J;
            objArr.getClass();
            this.J = J(objArr, this.H, i, obj, h6Var);
            return h6Var.a;
        }
        Object[] objArrP = p(this.K);
        if (objArrP != this.K) {
            ((AbstractList) this).modCount++;
        }
        int i2 = i & 31;
        Object obj2 = objArrP[i2];
        objArrP[i2] = obj;
        this.K = objArrP;
        return obj2;
    }

    public final Object[] t(Object[] objArr, int i, int i2) {
        if (i2 < 0) {
            zad.a("shift should be positive");
        }
        if (i2 == 0) {
            return objArr;
        }
        int iC0 = fd9.c0(i, i2);
        Object obj = objArr[iC0];
        obj.getClass();
        Object objT = t((Object[]) obj, i, i2 - 5);
        if (iC0 < 31) {
            int i3 = iC0 + 1;
            if (objArr[i3] != null) {
                if (m(objArr)) {
                    Arrays.fill(objArr, i3, 32, (Object) null);
                }
                Object[] objArrR = r();
                mp0.s0(0, 0, i3, objArr, objArrR);
                objArr = objArrR;
            }
        }
        if (objT == objArr[iC0]) {
            return objArr;
        }
        Object[] objArrP = p(objArr);
        objArrP[iC0] = objT;
        return objArrP;
    }

    public final Object[] u(Object[] objArr, int i, int i2, h6 h6Var) {
        Object[] objArrU;
        int iC0 = fd9.c0(i2 - 1, i);
        if (i == 5) {
            h6Var.a = objArr[iC0];
            objArrU = null;
        } else {
            Object obj = objArr[iC0];
            obj.getClass();
            objArrU = u((Object[]) obj, i - 5, i2, h6Var);
        }
        if (objArrU == null && iC0 == 0) {
            return null;
        }
        Object[] objArrP = p(objArr);
        objArrP[iC0] = objArrU;
        return objArrP;
    }

    public final void v(Object[] objArr, int i, int i2) {
        Object obj = null;
        if (i2 == 0) {
            this.J = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.K = objArr;
            this.L = i;
            this.H = i2;
            return;
        }
        h6 h6Var = new h6(obj);
        objArr.getClass();
        Object[] objArrU = u(objArr, i2, i, h6Var);
        objArrU.getClass();
        Object obj2 = h6Var.a;
        obj2.getClass();
        this.K = (Object[]) obj2;
        this.L = i;
        if (objArrU[1] == null) {
            this.J = (Object[]) objArrU[0];
            this.H = i2 - 5;
        } else {
            this.J = objArrU;
            this.H = i2;
        }
    }

    public final Object[] w(Object[] objArr, int i, int i2, Iterator it) {
        if (!it.hasNext()) {
            zad.a("invalid buffersIterator");
        }
        if (!(i2 >= 0)) {
            zad.a("negative shift");
        }
        if (i2 == 0) {
            return (Object[]) it.next();
        }
        Object[] objArrP = p(objArr);
        int iC0 = fd9.c0(i, i2);
        int i3 = i2 - 5;
        objArrP[iC0] = w((Object[]) objArrP[iC0], i, i3, it);
        while (true) {
            iC0++;
            if (iC0 >= 32 || !it.hasNext()) {
                break;
            }
            objArrP[iC0] = w((Object[]) objArrP[iC0], 0, i3, it);
        }
        return objArrP;
    }

    public final Object[] y(Object[] objArr, int i, Object[][] objArr2) {
        f2 f2Var = new f2(objArr2);
        int i2 = i >> 5;
        int i3 = this.H;
        Object[] objArrW = i2 < (1 << i3) ? w(objArr, i, i3, f2Var) : p(objArr);
        while (f2Var.hasNext()) {
            this.H += 5;
            objArrW = s(objArrW);
            int i4 = this.H;
            w(objArrW, 1 << i4, i4, f2Var);
        }
        return objArrW;
    }

    public final void z(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int size = size() >> 5;
        int i = this.H;
        if (size > (1 << i)) {
            this.J = A(this.H + 5, s(objArr), objArr2);
            this.K = objArr3;
            this.H += 5;
            this.L = size() + 1;
            return;
        }
        if (objArr == null) {
            this.J = objArr2;
            this.K = objArr3;
            this.L = size() + 1;
        } else {
            this.J = A(i, objArr, objArr2);
            this.K = objArr3;
            this.L = size() + 1;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        ((AbstractList) this).modCount++;
        int iM = M();
        if (iM < 32) {
            Object[] objArrP = p(this.K);
            objArrP[iM] = obj;
            this.K = objArrP;
            this.L = size() + 1;
        } else {
            z(this.J, this.K, s(obj));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int iM = M();
        Iterator it = collection.iterator();
        if (32 - iM >= collection.size()) {
            Object[] objArrP = p(this.K);
            e(objArrP, iM, it);
            this.K = objArrP;
            this.L = collection.size() + size();
            return true;
        }
        int size = ((collection.size() + iM) - 1) / 32;
        Object[][] objArr = new Object[size][];
        Object[] objArrP2 = p(this.K);
        e(objArrP2, iM, it);
        objArr[0] = objArrP2;
        for (int i = 1; i < size; i++) {
            Object[] objArrR = r();
            e(objArrR, 0, it);
            objArr[i] = objArrR;
        }
        this.J = y(this.J, I(), objArr);
        Object[] objArrR2 = r();
        e(objArrR2, 0, it);
        this.K = objArrR2;
        this.L = collection.size() + size();
        return true;
    }
}
