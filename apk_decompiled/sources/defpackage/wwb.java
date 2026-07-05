package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class wwb implements RandomAccess {
    public Object[] E;
    public vwb F;
    public int G;

    public wwb(int i, Object[] objArr) {
        this.E = objArr;
        this.G = i;
    }

    public final void a(int i, Object obj) {
        int i2 = this.G + 1;
        if (this.E.length < i2) {
            p(i2);
        }
        Object[] objArr = this.E;
        int i3 = this.G;
        if (i != i3) {
            System.arraycopy(objArr, i, objArr, i + 1, i3 - i);
        }
        objArr[i] = obj;
        this.G++;
    }

    public final void b(Object obj) {
        int i = this.G + 1;
        if (this.E.length < i) {
            p(i);
        }
        Object[] objArr = this.E;
        int i2 = this.G;
        objArr[i2] = obj;
        this.G = i2 + 1;
    }

    public final void c(int i, wwb wwbVar) {
        int i2 = wwbVar.G;
        if (i2 == 0) {
            return;
        }
        int i3 = this.G + i2;
        if (this.E.length < i3) {
            p(i3);
        }
        Object[] objArr = this.E;
        int i4 = this.G;
        if (i != i4) {
            System.arraycopy(objArr, i, objArr, i + i2, i4 - i);
        }
        System.arraycopy(wwbVar.E, 0, objArr, i, i2);
        this.G += i2;
    }

    public final void e(int i, List list) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        int i2 = this.G + size;
        if (this.E.length < i2) {
            p(i2);
        }
        Object[] objArr = this.E;
        int i3 = this.G;
        if (i != i3) {
            System.arraycopy(objArr, i, objArr, i + size, i3 - i);
        }
        int size2 = list.size();
        for (int i4 = 0; i4 < size2; i4++) {
            objArr[i + i4] = list.get(i4);
        }
        this.G += size;
    }

    public final boolean f(int i, Collection collection) {
        int i2 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        int size = collection.size();
        int i3 = this.G + size;
        if (this.E.length < i3) {
            p(i3);
        }
        Object[] objArr = this.E;
        int i4 = this.G;
        if (i != i4) {
            System.arraycopy(objArr, i, objArr, i + size, i4 - i);
        }
        for (Object obj : collection) {
            int i5 = i2 + 1;
            if (i2 < 0) {
                x44.n0();
                throw null;
            }
            objArr[i2 + i] = obj;
            i2 = i5;
        }
        this.G += size;
        return true;
    }

    public final List g() {
        vwb vwbVar = this.F;
        if (vwbVar != null) {
            return vwbVar;
        }
        vwb vwbVar2 = new vwb(this);
        this.F = vwbVar2;
        return vwbVar2;
    }

    public final void h() {
        Object[] objArr = this.E;
        int i = this.G;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.G = 0;
    }

    public final boolean i(Object obj) {
        int i = this.G - 1;
        if (i >= 0) {
            for (int i2 = 0; !x44.r(this.E[i2], obj); i2++) {
                if (i2 != i) {
                }
            }
            return true;
        }
        return false;
    }

    public final int k(Object obj) {
        Object[] objArr = this.E;
        int i = this.G;
        for (int i2 = 0; i2 < i; i2++) {
            if (x44.r(obj, objArr[i2])) {
                return i2;
            }
        }
        return -1;
    }

    public final boolean l(Object obj) {
        int iK = k(obj);
        if (iK < 0) {
            return false;
        }
        m(iK);
        return true;
    }

    public final Object m(int i) {
        Object[] objArr = this.E;
        Object obj = objArr[i];
        int i2 = this.G;
        if (i != i2 - 1) {
            int i3 = i + 1;
            System.arraycopy(objArr, i3, objArr, i, i2 - i3);
        }
        int i4 = this.G - 1;
        this.G = i4;
        objArr[i4] = null;
        return obj;
    }

    public final void o(int i, int i2) {
        if (i2 > i) {
            int i3 = this.G;
            if (i2 < i3) {
                Object[] objArr = this.E;
                System.arraycopy(objArr, i2, objArr, i, i3 - i2);
            }
            int i4 = this.G;
            int i5 = i4 - (i2 - i);
            int i6 = i4 - 1;
            if (i5 <= i6) {
                int i7 = i5;
                while (true) {
                    this.E[i7] = null;
                    if (i7 == i6) {
                        break;
                    } else {
                        i7++;
                    }
                }
            }
            this.G = i5;
        }
    }

    public final void p(int i) {
        Object[] objArr = this.E;
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i, length * 2)];
        System.arraycopy(objArr, 0, objArr2, 0, length);
        this.E = objArr2;
    }
}
