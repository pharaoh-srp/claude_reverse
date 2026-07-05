package defpackage;

import java.util.Arrays;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes2.dex */
public final class nzc extends l3 {
    public final Object[] E;
    public final Object[] F;
    public final int G;
    public final int H;

    public nzc(Object[] objArr, Object[] objArr2, int i, int i2) {
        this.E = objArr;
        this.F = objArr2;
        this.G = i;
        this.H = i2;
        if (!(size() > 32)) {
            zad.a("Trie-based persistent vector should have at least 33 elements, got " + size());
        }
        size();
        size();
        int length = objArr2.length;
    }

    public static Object[] o(Object[] objArr, int i, int i2, Object obj, h6 h6Var) {
        int iC0 = fd9.c0(i2, i);
        if (i == 0) {
            Object[] objArrCopyOf = iC0 == 0 ? new Object[32] : Arrays.copyOf(objArr, 32);
            mp0.s0(iC0 + 1, iC0, 31, objArr, objArrCopyOf);
            h6Var.a = objArr[31];
            objArrCopyOf[iC0] = obj;
            return objArrCopyOf;
        }
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        int i3 = i - 5;
        Object obj2 = objArr[iC0];
        obj2.getClass();
        objArrCopyOf2[iC0] = o((Object[]) obj2, i3, i2, obj, h6Var);
        while (true) {
            iC0++;
            if (iC0 >= 32 || objArrCopyOf2[iC0] == null) {
                break;
            }
            Object obj3 = objArr[iC0];
            obj3.getClass();
            objArrCopyOf2[iC0] = o((Object[]) obj3, i3, 0, h6Var.a, h6Var);
        }
        return objArrCopyOf2;
    }

    public static Object[] q(Object[] objArr, int i, int i2, h6 h6Var) {
        Object[] objArrQ;
        int iC0 = fd9.c0(i2, i);
        if (i == 5) {
            h6Var.a = objArr[iC0];
            objArrQ = null;
        } else {
            Object obj = objArr[iC0];
            obj.getClass();
            objArrQ = q((Object[]) obj, i - 5, i2, h6Var);
        }
        if (objArrQ == null && iC0 == 0) {
            return null;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        objArrCopyOf[iC0] = objArrQ;
        return objArrCopyOf;
    }

    public static Object[] w(int i, int i2, Object obj, Object[] objArr) {
        int iC0 = fd9.c0(i2, i);
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        if (i == 0) {
            objArrCopyOf[iC0] = obj;
            return objArrCopyOf;
        }
        Object obj2 = objArrCopyOf[iC0];
        obj2.getClass();
        objArrCopyOf[iC0] = w(i - 5, i2, obj, (Object[]) obj2);
        return objArrCopyOf;
    }

    @Override // defpackage.l3
    public final l3 a(int i, Object obj) {
        zni.m(i, size());
        if (i == size()) {
            return e(obj);
        }
        int iV = v();
        Object[] objArr = this.E;
        if (i >= iV) {
            return p(i - iV, obj, objArr);
        }
        h6 h6Var = new h6(null);
        return p(0, h6Var.a, o(objArr, this.H, i, obj, h6Var));
    }

    @Override // defpackage.l3
    public final l3 e(Object obj) {
        int size = size() - v();
        Object[] objArr = this.E;
        Object[] objArr2 = this.F;
        if (size < 32) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
            objArrCopyOf[size] = obj;
            return new nzc(objArr, objArrCopyOf, size() + 1, this.H);
        }
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj;
        return r(objArr, objArr2, objArr3);
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object[] objArr;
        zni.k(i, size());
        if (v() <= i) {
            objArr = this.F;
        } else {
            Object[] objArr2 = this.E;
            for (int i2 = this.H; i2 > 0; i2 -= 5) {
                Object[] objArr3 = objArr2[fd9.c0(i, i2)];
                objArr3.getClass();
                objArr2 = objArr3;
            }
            objArr = objArr2;
        }
        return objArr[i & 31];
    }

    @Override // defpackage.w0
    public final int getSize() {
        return this.G;
    }

    @Override // defpackage.l3
    public final pzc h() {
        return new pzc(this, this.E, this.F, this.H);
    }

    @Override // defpackage.l3
    public final l3 k(j3 j3Var) {
        pzc pzcVar = new pzc(this, this.E, this.F, this.H);
        pzcVar.E(j3Var);
        return pzcVar.a();
    }

    @Override // defpackage.l3
    public final l3 l(int i) {
        zni.k(i, size());
        int iV = v();
        int i2 = this.H;
        Object[] objArr = this.E;
        return i >= iV ? u(objArr, iV, i2, i - iV) : u(t(objArr, i2, i, new h6(this.F[0])), iV, i2, 0);
    }

    @Override // defpackage.i2, java.util.List
    public final ListIterator listIterator(int i) {
        zni.m(i, size());
        return new rzc(i, size(), (this.H / 5) + 1, this.E, this.F);
    }

    @Override // defpackage.l3
    public final l3 m(int i, Object obj) {
        zni.k(i, size());
        int iV = v();
        Object[] objArr = this.E;
        Object[] objArr2 = this.F;
        int i2 = this.H;
        if (iV > i) {
            return new nzc(w(i2, i, obj, objArr), objArr2, size(), i2);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        objArrCopyOf[i & 31] = obj;
        return new nzc(objArr, objArrCopyOf, size(), i2);
    }

    public final nzc p(int i, Object obj, Object[] objArr) {
        int size = size() - v();
        Object[] objArr2 = this.F;
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        if (size < 32) {
            mp0.s0(i + 1, i, size, objArr2, objArrCopyOf);
            objArrCopyOf[i] = obj;
            return new nzc(objArr, objArrCopyOf, size() + 1, this.H);
        }
        Object obj2 = objArr2[31];
        mp0.s0(i + 1, i, size - 1, objArr2, objArrCopyOf);
        objArrCopyOf[i] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj2;
        return r(objArr, objArrCopyOf, objArr3);
    }

    public final nzc r(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int size = size() >> 5;
        int i = this.H;
        if (size <= (1 << i)) {
            return new nzc(s(i, objArr, objArr2), objArr3, size() + 1, i);
        }
        Object[] objArr4 = new Object[32];
        objArr4[0] = objArr;
        int i2 = i + 5;
        return new nzc(s(i2, objArr4, objArr2), objArr3, size() + 1, i2);
    }

    public final Object[] s(int i, Object[] objArr, Object[] objArr2) {
        int iC0 = fd9.c0(size() - 1, i);
        Object[] objArrCopyOf = objArr != null ? Arrays.copyOf(objArr, 32) : new Object[32];
        if (i == 5) {
            objArrCopyOf[iC0] = objArr2;
            return objArrCopyOf;
        }
        objArrCopyOf[iC0] = s(i - 5, (Object[]) objArrCopyOf[iC0], objArr2);
        return objArrCopyOf;
    }

    public final Object[] t(Object[] objArr, int i, int i2, h6 h6Var) {
        int iC0 = fd9.c0(i2, i);
        if (i == 0) {
            Object[] objArrCopyOf = iC0 == 0 ? new Object[32] : Arrays.copyOf(objArr, 32);
            mp0.s0(iC0, iC0 + 1, 32, objArr, objArrCopyOf);
            objArrCopyOf[31] = h6Var.a;
            h6Var.a = objArr[iC0];
            return objArrCopyOf;
        }
        int iC02 = objArr[31] == null ? fd9.c0(v() - 1, i) : 31;
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        int i3 = i - 5;
        int i4 = iC0 + 1;
        if (i4 <= iC02) {
            while (true) {
                Object obj = objArrCopyOf2[iC02];
                obj.getClass();
                objArrCopyOf2[iC02] = t((Object[]) obj, i3, 0, h6Var);
                if (iC02 == i4) {
                    break;
                }
                iC02--;
            }
        }
        Object obj2 = objArrCopyOf2[iC0];
        obj2.getClass();
        objArrCopyOf2[iC0] = t((Object[]) obj2, i3, i2, h6Var);
        return objArrCopyOf2;
    }

    public final l3 u(Object[] objArr, int i, int i2, int i3) {
        int size = size() - i;
        Object obj = null;
        if (size != 1) {
            Object[] objArr2 = this.F;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
            int i4 = size - 1;
            if (i3 < i4) {
                mp0.s0(i3, i3 + 1, size, objArr2, objArrCopyOf);
            }
            objArrCopyOf[i4] = null;
            return new nzc(objArr, objArrCopyOf, (i + size) - 1, i2);
        }
        if (i2 == 0) {
            if (objArr.length == 33) {
                objArr = Arrays.copyOf(objArr, 32);
            }
            return new cbg(objArr);
        }
        h6 h6Var = new h6(obj);
        Object[] objArrQ = q(objArr, i2, i - 1, h6Var);
        objArrQ.getClass();
        Object obj2 = h6Var.a;
        obj2.getClass();
        Object[] objArr3 = (Object[]) obj2;
        if (objArrQ[1] != null) {
            return new nzc(objArrQ, objArr3, i, i2);
        }
        Object obj3 = objArrQ[0];
        obj3.getClass();
        return new nzc((Object[]) obj3, objArr3, i, i2 - 5);
    }

    public final int v() {
        return (size() - 1) & (-32);
    }
}
