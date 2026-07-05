package defpackage;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class d84 extends AbstractMap implements Serializable {
    public static final Object N = new Object();
    public transient Object E;
    public transient int[] F;
    public transient Object[] G;
    public transient Object[] H;
    public transient int I;
    public transient int J;
    public transient b84 K;
    public transient b84 L;
    public transient c3 M;

    public static d84 a() {
        d84 d84Var = new d84();
        d84Var.I = Math.min(Math.max(8, 1), 1073741823);
        return d84Var;
    }

    public final Map c() {
        Object obj = this.E;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (g()) {
            return;
        }
        this.I += 32;
        Map mapC = c();
        if (mapC != null) {
            this.I = Math.min(Math.max(size(), 3), 1073741823);
            mapC.clear();
            this.E = null;
            this.J = 0;
            return;
        }
        Arrays.fill(j(), 0, this.J, (Object) null);
        Arrays.fill(k(), 0, this.J, (Object) null);
        Object obj = this.E;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(i(), 0, this.J, 0);
        this.J = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map mapC = c();
        return mapC != null ? mapC.containsKey(obj) : e(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map mapC = c();
        if (mapC != null) {
            return mapC.containsValue(obj);
        }
        for (int i = 0; i < this.J; i++) {
            if (cvk.l(obj, k()[i])) {
                return true;
            }
        }
        return false;
    }

    public final int d() {
        return (1 << (this.I & 31)) - 1;
    }

    public final int e(Object obj) {
        if (g()) {
            return -1;
        }
        int i = bsk.i(obj);
        int iD = d();
        Object obj2 = this.E;
        Objects.requireNonNull(obj2);
        int iJ = yok.j(i & iD, obj2);
        if (iJ == 0) {
            return -1;
        }
        int i2 = ~iD;
        int i3 = i & i2;
        do {
            int i4 = iJ - 1;
            int i5 = i()[i4];
            if ((i5 & i2) == i3 && cvk.l(obj, j()[i4])) {
                return i4;
            }
            iJ = i5 & iD;
        } while (iJ != 0);
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        b84 b84Var = this.L;
        if (b84Var != null) {
            return b84Var;
        }
        b84 b84Var2 = new b84(this, 0);
        this.L = b84Var2;
        return b84Var2;
    }

    public final void f(int i, int i2) {
        Object obj = this.E;
        Objects.requireNonNull(obj);
        int[] iArrI = i();
        Object[] objArrJ = j();
        Object[] objArrK = k();
        int size = size();
        int i3 = size - 1;
        if (i >= i3) {
            objArrJ[i] = null;
            objArrK[i] = null;
            iArrI[i] = 0;
            return;
        }
        Object obj2 = objArrJ[i3];
        objArrJ[i] = obj2;
        objArrK[i] = objArrK[i3];
        objArrJ[i3] = null;
        objArrK[i3] = null;
        iArrI[i] = iArrI[i3];
        iArrI[i3] = 0;
        int i4 = bsk.i(obj2) & i2;
        int iJ = yok.j(i4, obj);
        if (iJ == size) {
            yok.k(i4, obj, i + 1);
            return;
        }
        while (true) {
            int i5 = iJ - 1;
            int i6 = iArrI[i5];
            int i7 = i6 & i2;
            if (i7 == size) {
                iArrI[i5] = yok.g(i6, i + 1, i2);
                return;
            }
            iJ = i7;
        }
    }

    public final boolean g() {
        return this.E == null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map mapC = c();
        if (mapC != null) {
            return mapC.get(obj);
        }
        int iE = e(obj);
        if (iE == -1) {
            return null;
        }
        return k()[iE];
    }

    public final Object h(Object obj) {
        if (!g()) {
            int iD = d();
            Object obj2 = this.E;
            Objects.requireNonNull(obj2);
            int i = yok.i(obj, null, iD, obj2, i(), j(), null);
            if (i != -1) {
                Object obj3 = k()[i];
                f(i, iD);
                this.J--;
                this.I += 32;
                return obj3;
            }
        }
        return N;
    }

    public final int[] i() {
        int[] iArr = this.F;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    public final Object[] j() {
        Object[] objArr = this.G;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final Object[] k() {
        Object[] objArr = this.H;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        b84 b84Var = this.K;
        if (b84Var != null) {
            return b84Var;
        }
        b84 b84Var2 = new b84(this, 1);
        this.K = b84Var2;
        return b84Var2;
    }

    public final int l(int i, int i2, int i3, int i4) {
        Object objE = yok.e(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            yok.k(i3 & i5, objE, i4 + 1);
        }
        Object obj = this.E;
        Objects.requireNonNull(obj);
        int[] iArrI = i();
        for (int i6 = 0; i6 <= i; i6++) {
            int iJ = yok.j(i6, obj);
            while (iJ != 0) {
                int i7 = iJ - 1;
                int i8 = iArrI[i7];
                int i9 = ((~i) & i8) | i6;
                int i10 = i9 & i5;
                int iJ2 = yok.j(i10, objE);
                yok.k(i10, objE, iJ);
                iArrI[i7] = yok.g(i9, iJ2, i5);
                iJ = i8 & i;
            }
        }
        this.E = objE;
        this.I = yok.g(this.I, 32 - Integer.numberOfLeadingZeros(i5), 31);
        return i5;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00eb  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00fe -> B:37:0x00e4). Please report as a decompilation issue!!! */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object put(java.lang.Object r23, java.lang.Object r24) {
        /*
            Method dump skipped, instruction units count: 405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d84.put(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map mapC = c();
        if (mapC != null) {
            return mapC.remove(obj);
        }
        Object objH = h(obj);
        if (objH == N) {
            return null;
        }
        return objH;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map mapC = c();
        return mapC != null ? mapC.size() : this.J;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        c3 c3Var = this.M;
        if (c3Var != null) {
            return c3Var;
        }
        c3 c3Var2 = new c3(1, this);
        this.M = c3Var2;
        return c3Var2;
    }
}
