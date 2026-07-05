package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class qvb {
    public Object[] a;
    public int b;
    public ovb c;

    public qvb(int i) {
        this.a = i == 0 ? wac.a : new Object[i];
    }

    public final void a(Object obj) {
        int i = this.b + 1;
        Object[] objArr = this.a;
        if (objArr.length < i) {
            m(i, objArr);
        }
        Object[] objArr2 = this.a;
        int i2 = this.b;
        objArr2[i2] = obj;
        this.b = i2 + 1;
    }

    public final void b(qvb qvbVar) {
        qvbVar.getClass();
        if (qvbVar.h()) {
            return;
        }
        int i = this.b + qvbVar.b;
        Object[] objArr = this.a;
        if (objArr.length < i) {
            m(i, objArr);
        }
        mp0.s0(this.b, 0, qvbVar.b, qvbVar.a, this.a);
        this.b += qvbVar.b;
    }

    public final void c(List list) {
        if (list.isEmpty()) {
            return;
        }
        int i = this.b;
        int size = list.size() + i;
        Object[] objArr = this.a;
        if (objArr.length < size) {
            m(size, objArr);
        }
        Object[] objArr2 = this.a;
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            objArr2[i2 + i] = list.get(i2);
        }
        this.b = list.size() + this.b;
    }

    public final void d() {
        mp0.z0(0, this.b, null, this.a);
        this.b = 0;
    }

    public final Object e() {
        if (!h()) {
            return this.a[0];
        }
        gtk.i("ObjectList is empty.");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof qvb) {
            qvb qvbVar = (qvb) obj;
            int i = qvbVar.b;
            int i2 = this.b;
            if (i == i2) {
                Object[] objArr = this.a;
                Object[] objArr2 = qvbVar.a;
                b79 b79VarH0 = wd6.H0(0, i2);
                int i3 = b79VarH0.E;
                int i4 = b79VarH0.F;
                if (i3 > i4) {
                    return true;
                }
                while (x44.r(objArr[i3], objArr2[i3])) {
                    if (i3 == i4) {
                        return true;
                    }
                    i3++;
                }
                return false;
            }
        }
        return false;
    }

    public final Object f(int i) {
        if (i >= 0 && i < this.b) {
            return this.a[i];
        }
        o(i);
        throw null;
    }

    public final int g(Object obj) {
        Object[] objArr = this.a;
        int i = 0;
        if (obj == null) {
            int i2 = this.b;
            while (i < i2) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int i3 = this.b;
        while (i < i3) {
            if (obj.equals(objArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final boolean h() {
        return this.b == 0;
    }

    public final int hashCode() {
        Object[] objArr = this.a;
        int i = this.b;
        int iHashCode = 0;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[i2];
            iHashCode += (obj != null ? obj.hashCode() : 0) * 31;
        }
        return iHashCode;
    }

    public final boolean i() {
        return this.b != 0;
    }

    public final boolean j(Object obj) {
        int iG = g(obj);
        if (iG < 0) {
            return false;
        }
        k(iG);
        return true;
    }

    public final Object k(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.b)) {
            o(i);
            throw null;
        }
        Object[] objArr = this.a;
        Object obj = objArr[i];
        if (i != i2 - 1) {
            mp0.s0(i, i + 1, i2, objArr, objArr);
        }
        int i3 = this.b - 1;
        this.b = i3;
        objArr[i3] = null;
        return obj;
    }

    public final void l(int i, int i2) {
        int i3;
        if (i < 0 || i > (i3 = this.b) || i2 < 0 || i2 > i3) {
            StringBuilder sbV = vb7.v("Start (", ") and end (", i, i2, ") must be in 0..");
            sbV.append(this.b);
            gtk.h(sbV.toString());
            throw null;
        }
        if (i2 < i) {
            gtk.f("Start (" + i + ") is more than end (" + i2 + ')');
            throw null;
        }
        if (i2 != i) {
            if (i2 < i3) {
                Object[] objArr = this.a;
                mp0.s0(i, i2, i3, objArr, objArr);
            }
            int i4 = this.b;
            int i5 = i4 - (i2 - i);
            mp0.z0(i5, i4, null, this.a);
            this.b = i5;
        }
    }

    public final void m(int i, Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i, (length * 3) / 2)];
        mp0.s0(0, 0, length, objArr, objArr2);
        this.a = objArr2;
    }

    public final Object n(int i, Object obj) {
        if (i < 0 || i >= this.b) {
            o(i);
            throw null;
        }
        Object[] objArr = this.a;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    public final void o(int i) {
        StringBuilder sbU = vb7.u("Index ", i, " must be in 0..");
        sbU.append(this.b - 1);
        gtk.h(sbU.toString());
        throw null;
    }

    public final String toString() {
        tl8 tl8Var = new tl8(23, this);
        StringBuilder sb = new StringBuilder("[");
        Object[] objArr = this.a;
        int i = this.b;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            Object obj = objArr[i2];
            if (i2 != 0) {
                sb.append((CharSequence) ", ");
            }
            if (i2 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            sb.append((CharSequence) tl8Var.invoke(obj));
            i2++;
        }
        sb.append((CharSequence) "]");
        return sb.toString();
    }

    public /* synthetic */ qvb() {
        this(16);
    }
}
