package defpackage;

import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class w6g {
    public int[] E;
    public Object[] F;
    public int G;

    public w6g(int i) {
        this.E = i == 0 ? sf5.b : new int[i];
        this.F = i == 0 ? sf5.d : new Object[i << 1];
    }

    public final int a(Object obj) {
        int i = this.G * 2;
        Object[] objArr = this.F;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public final int c(int i, Object obj) {
        int i2 = this.G;
        if (i2 == 0) {
            return -1;
        }
        int iH = sf5.h(i2, i, this.E);
        if (iH < 0 || x44.r(obj, this.F[iH << 1])) {
            return iH;
        }
        int i3 = iH + 1;
        while (i3 < i2 && this.E[i3] == i) {
            if (x44.r(obj, this.F[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = iH - 1; i4 >= 0 && this.E[i4] == i; i4--) {
            if (x44.r(obj, this.F[i4 << 1])) {
                return i4;
            }
        }
        return ~i3;
    }

    public final void clear() {
        if (this.G > 0) {
            this.E = sf5.b;
            this.F = sf5.d;
            this.G = 0;
        }
        if (this.G <= 0) {
            return;
        }
        sz6.c();
    }

    public boolean containsKey(Object obj) {
        return d(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return a(obj) >= 0;
    }

    public final int d(Object obj) {
        return obj == null ? e() : c(obj.hashCode(), obj);
    }

    public final int e() {
        int i = this.G;
        if (i == 0) {
            return -1;
        }
        int iH = sf5.h(i, 0, this.E);
        if (iH < 0 || this.F[iH << 1] == null) {
            return iH;
        }
        int i2 = iH + 1;
        while (i2 < i && this.E[i2] == 0) {
            if (this.F[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = iH - 1; i3 >= 0 && this.E[i3] == 0; i3--) {
            if (this.F[i3 << 1] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof w6g) {
                int i = this.G;
                if (i != ((w6g) obj).G) {
                    return false;
                }
                w6g w6gVar = (w6g) obj;
                for (int i2 = 0; i2 < i; i2++) {
                    Object objF = f(i2);
                    Object objI = i(i2);
                    Object obj2 = w6gVar.get(objF);
                    if (objI == null) {
                        if (obj2 != null || !w6gVar.containsKey(objF)) {
                            return false;
                        }
                    } else if (!objI.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.G != ((Map) obj).size()) {
                return false;
            }
            int i3 = this.G;
            for (int i4 = 0; i4 < i3; i4++) {
                Object objF2 = f(i4);
                Object objI2 = i(i4);
                Object obj3 = ((Map) obj).get(objF2);
                if (objI2 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(objF2)) {
                        return false;
                    }
                } else if (!objI2.equals(obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final Object f(int i) {
        if (i >= 0 && i < this.G) {
            return this.F[i << 1];
        }
        gtk.f("Expected index to be within 0..size()-1, but was " + i);
        throw null;
    }

    public final Object g(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.G)) {
            gtk.f("Expected index to be within 0..size()-1, but was " + i);
            throw null;
        }
        Object[] objArr = this.F;
        int i3 = i << 1;
        Object obj = objArr[i3 + 1];
        if (i2 <= 1) {
            clear();
            return obj;
        }
        int i4 = i2 - 1;
        int[] iArr = this.E;
        if (iArr.length <= 8 || i2 >= iArr.length / 3) {
            if (i < i4) {
                int i5 = i + 1;
                mp0.r0(i, i5, i2, iArr, iArr);
                Object[] objArr2 = this.F;
                mp0.s0(i3, i5 << 1, i2 << 1, objArr2, objArr2);
            }
            Object[] objArr3 = this.F;
            int i6 = i4 << 1;
            objArr3[i6] = null;
            objArr3[i6 + 1] = null;
        } else {
            int i7 = i2 > 8 ? i2 + (i2 >> 1) : 8;
            this.E = Arrays.copyOf(iArr, i7);
            this.F = Arrays.copyOf(this.F, i7 << 1);
            if (i2 != this.G) {
                sz6.c();
                return null;
            }
            if (i > 0) {
                mp0.r0(0, 0, i, iArr, this.E);
                mp0.s0(0, 0, i3, objArr, this.F);
            }
            if (i < i4) {
                int i8 = i + 1;
                mp0.r0(i, i8, i2, iArr, this.E);
                mp0.s0(i3, i8 << 1, i2 << 1, objArr, this.F);
            }
        }
        if (i2 == this.G) {
            this.G = i4;
            return obj;
        }
        sz6.c();
        return null;
    }

    public Object get(Object obj) {
        int iD = d(obj);
        if (iD >= 0) {
            return this.F[(iD << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int iD = d(obj);
        return iD >= 0 ? this.F[(iD << 1) + 1] : obj2;
    }

    public final Object h(int i, Object obj) {
        if (i < 0 || i >= this.G) {
            gtk.f("Expected index to be within 0..size()-1, but was " + i);
            throw null;
        }
        int i2 = (i << 1) + 1;
        Object[] objArr = this.F;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    public final int hashCode() {
        int[] iArr = this.E;
        Object[] objArr = this.F;
        int i = this.G;
        int i2 = 1;
        int i3 = 0;
        int iHashCode = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            iHashCode += (obj != null ? obj.hashCode() : 0) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return iHashCode;
    }

    public final Object i(int i) {
        if (i >= 0 && i < this.G) {
            return this.F[(i << 1) + 1];
        }
        gtk.f("Expected index to be within 0..size()-1, but was " + i);
        throw null;
    }

    public final boolean isEmpty() {
        return this.G <= 0;
    }

    public final Object put(Object obj, Object obj2) {
        int i = this.G;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        int iC = obj != null ? c(iHashCode, obj) : e();
        if (iC >= 0) {
            int i2 = (iC << 1) + 1;
            Object[] objArr = this.F;
            Object obj3 = objArr[i2];
            objArr[i2] = obj2;
            return obj3;
        }
        int i3 = ~iC;
        int[] iArr = this.E;
        if (i >= iArr.length) {
            int i4 = 8;
            if (i >= 8) {
                i4 = (i >> 1) + i;
            } else if (i < 4) {
                i4 = 4;
            }
            this.E = Arrays.copyOf(iArr, i4);
            this.F = Arrays.copyOf(this.F, i4 << 1);
            if (i != this.G) {
                sz6.c();
                return null;
            }
        }
        if (i3 < i) {
            int[] iArr2 = this.E;
            int i5 = i3 + 1;
            mp0.r0(i5, i3, i, iArr2, iArr2);
            Object[] objArr2 = this.F;
            mp0.s0(i5 << 1, i3 << 1, this.G << 1, objArr2, objArr2);
        }
        int i6 = this.G;
        if (i == i6) {
            int[] iArr3 = this.E;
            if (i3 < iArr3.length) {
                iArr3[i3] = iHashCode;
                Object[] objArr3 = this.F;
                int i7 = i3 << 1;
                objArr3[i7] = obj;
                objArr3[i7 + 1] = obj2;
                this.G = i6 + 1;
                return null;
            }
        }
        sz6.c();
        return null;
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public final boolean remove(Object obj, Object obj2) {
        int iD = d(obj);
        if (iD < 0 || !x44.r(obj2, i(iD))) {
            return false;
        }
        g(iD);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int iD = d(obj);
        if (iD < 0 || !x44.r(obj2, i(iD))) {
            return false;
        }
        h(iD, obj3);
        return true;
    }

    public final int size() {
        return this.G;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.G * 28);
        sb.append('{');
        int i = this.G;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object objF = f(i2);
            if (objF != sb) {
                sb.append(objF);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object objI = i(i2);
            if (objI != sb) {
                sb.append(objI);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public Object remove(Object obj) {
        int iD = d(obj);
        if (iD >= 0) {
            return g(iD);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int iD = d(obj);
        if (iD >= 0) {
            return h(iD, obj2);
        }
        return null;
    }
}
