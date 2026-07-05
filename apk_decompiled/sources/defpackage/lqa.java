package defpackage;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class lqa implements Map, Serializable, qm9 {
    public static final lqa R;
    public Object[] E;
    public Object[] F;
    public int[] G;
    public int[] H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public mqa N;
    public nqa O;
    public mqa P;
    public boolean Q;

    static {
        lqa lqaVar = new lqa(0);
        lqaVar.Q = true;
        R = lqaVar;
    }

    public lqa(int i) {
        if (i < 0) {
            sz6.p("capacity must be non-negative.");
            throw null;
        }
        Object[] objArr = new Object[i];
        int[] iArr = new int[i];
        int iHighestOneBit = Integer.highestOneBit((i < 1 ? 1 : i) * 3);
        this.E = objArr;
        this.F = null;
        this.G = iArr;
        this.H = new int[iHighestOneBit];
        this.I = 2;
        this.J = 0;
        this.K = Integer.numberOfLeadingZeros(iHighestOneBit) + 1;
    }

    public final int a(Object obj) {
        d();
        while (true) {
            int iJ = j(obj);
            int i = this.I * 2;
            int length = this.H.length / 2;
            if (i > length) {
                i = length;
            }
            int i2 = 0;
            while (true) {
                int[] iArr = this.H;
                int i3 = iArr[iJ];
                if (i3 == 0) {
                    int i4 = this.J;
                    Object[] objArr = this.E;
                    if (i4 < objArr.length) {
                        int i5 = i4 + 1;
                        this.J = i5;
                        objArr[i4] = obj;
                        this.G[i4] = iJ;
                        iArr[iJ] = i5;
                        this.M++;
                        this.L++;
                        if (i2 > this.I) {
                            this.I = i2;
                        }
                        return i4;
                    }
                    g(1);
                } else {
                    if (x44.r(this.E[i3 - 1], obj)) {
                        return -i3;
                    }
                    i2++;
                    if (i2 > i) {
                        k(this.H.length * 2);
                        break;
                    }
                    iJ = iJ == 0 ? this.H.length - 1 : iJ - 1;
                }
            }
        }
    }

    public final lqa c() {
        d();
        this.Q = true;
        if (this.M > 0) {
            return this;
        }
        lqa lqaVar = R;
        lqaVar.getClass();
        return lqaVar;
    }

    @Override // java.util.Map
    public final void clear() {
        d();
        int i = this.J - 1;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.G;
                int i3 = iArr[i2];
                if (i3 >= 0) {
                    this.H[i3] = 0;
                    iArr[i2] = -1;
                }
                if (i2 == i) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        csg.K(this.E, 0, this.J);
        Object[] objArr = this.F;
        if (objArr != null) {
            csg.K(objArr, 0, this.J);
        }
        this.M = 0;
        this.J = 0;
        this.L++;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return h(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return i(obj) >= 0;
    }

    public final void d() {
        if (this.Q) {
            mr9.x();
        }
    }

    public final void e(boolean z) {
        int i;
        Object[] objArr = this.F;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.J;
            if (i2 >= i) {
                break;
            }
            int[] iArr = this.G;
            int i4 = iArr[i2];
            if (i4 >= 0) {
                Object[] objArr2 = this.E;
                objArr2[i3] = objArr2[i2];
                if (objArr != null) {
                    objArr[i3] = objArr[i2];
                }
                if (z) {
                    iArr[i3] = i4;
                    this.H[i4] = i3 + 1;
                }
                i3++;
            }
            i2++;
        }
        csg.K(this.E, i3, i);
        if (objArr != null) {
            csg.K(objArr, i3, this.J);
        }
        this.J = i3;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        mqa mqaVar = this.P;
        if (mqaVar != null) {
            return mqaVar;
        }
        mqa mqaVar2 = new mqa(this, 0);
        this.P = mqaVar2;
        return mqaVar2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        return this.M == map.size() && f(map.entrySet());
    }

    public final boolean f(Collection collection) {
        boolean zR;
        collection.getClass();
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    Map.Entry entry = (Map.Entry) obj;
                    int iH = h(entry.getKey());
                    if (iH < 0) {
                        zR = false;
                    } else {
                        Object[] objArr = this.F;
                        objArr.getClass();
                        zR = x44.r(objArr[iH], entry.getValue());
                    }
                    if (!zR) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    public final void g(int i) {
        Object[] objArr = this.E;
        int length = objArr.length;
        int i2 = this.J;
        int i3 = length - i2;
        int i4 = i2 - this.M;
        if (i3 < i && i3 + i4 >= i && i4 >= objArr.length / 4) {
            e(true);
            return;
        }
        int i5 = i2 + i;
        if (i5 < 0) {
            throw new OutOfMemoryError();
        }
        if (i5 > objArr.length) {
            e2 e2Var = i2.Companion;
            int length2 = objArr.length;
            e2Var.getClass();
            int iE = e2.e(length2, i5);
            Object[] objArr2 = this.E;
            objArr2.getClass();
            this.E = Arrays.copyOf(objArr2, iE);
            Object[] objArr3 = this.F;
            this.F = objArr3 != null ? Arrays.copyOf(objArr3, iE) : null;
            this.G = Arrays.copyOf(this.G, iE);
            int iHighestOneBit = Integer.highestOneBit((iE >= 1 ? iE : 1) * 3);
            if (iHighestOneBit > this.H.length) {
                k(iHighestOneBit);
            }
        }
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int iH = h(obj);
        if (iH < 0) {
            return null;
        }
        Object[] objArr = this.F;
        objArr.getClass();
        return objArr[iH];
    }

    public final int h(Object obj) {
        int iJ = j(obj);
        int i = this.I;
        while (true) {
            int i2 = this.H[iJ];
            if (i2 == 0) {
                return -1;
            }
            int i3 = i2 - 1;
            if (x44.r(this.E[i3], obj)) {
                return i3;
            }
            i--;
            if (i < 0) {
                return -1;
            }
            iJ = iJ == 0 ? this.H.length - 1 : iJ - 1;
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        jqa jqaVar = new jqa(this, 0);
        int i = 0;
        while (jqaVar.hasNext()) {
            int i2 = jqaVar.F;
            lqa lqaVar = jqaVar.E;
            if (i2 >= lqaVar.J) {
                pmf.d();
                return 0;
            }
            jqaVar.F = i2 + 1;
            jqaVar.G = i2;
            Object obj = lqaVar.E[i2];
            int iHashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = lqaVar.F;
            objArr.getClass();
            Object obj2 = objArr[jqaVar.G];
            int iHashCode2 = obj2 != null ? obj2.hashCode() : 0;
            jqaVar.c();
            i += iHashCode ^ iHashCode2;
        }
        return i;
    }

    public final int i(Object obj) {
        int i = this.J;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.G[i] >= 0) {
                Object[] objArr = this.F;
                objArr.getClass();
                if (x44.r(objArr[i], obj)) {
                    return i;
                }
            }
        }
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.M == 0;
    }

    public final int j(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.K;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        r3[r0] = r6;
        r5.G[r2] = r0;
        r2 = r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(int r6) {
        /*
            r5 = this;
            int r0 = r5.L
            int r0 = r0 + 1
            r5.L = r0
            int r0 = r5.J
            int r1 = r5.M
            r2 = 0
            if (r0 <= r1) goto L10
            r5.e(r2)
        L10:
            int[] r0 = new int[r6]
            r5.H = r0
            int r6 = java.lang.Integer.numberOfLeadingZeros(r6)
            int r6 = r6 + 1
            r5.K = r6
        L1c:
            int r6 = r5.J
            if (r2 >= r6) goto L4d
            int r6 = r2 + 1
            java.lang.Object[] r0 = r5.E
            r0 = r0[r2]
            int r0 = r5.j(r0)
            int r1 = r5.I
        L2c:
            int[] r3 = r5.H
            r4 = r3[r0]
            if (r4 != 0) goto L3a
            r3[r0] = r6
            int[] r1 = r5.G
            r1[r2] = r0
            r2 = r6
            goto L1c
        L3a:
            int r1 = r1 + (-1)
            if (r1 < 0) goto L48
            int r4 = r0 + (-1)
            if (r0 != 0) goto L46
            int r0 = r3.length
            int r0 = r0 + (-1)
            goto L2c
        L46:
            r0 = r4
            goto L2c
        L48:
            java.lang.String r5 = "This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?"
            defpackage.sz6.j(r5)
        L4d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lqa.k(int):void");
    }

    @Override // java.util.Map
    public final Set keySet() {
        mqa mqaVar = this.N;
        if (mqaVar != null) {
            return mqaVar;
        }
        mqa mqaVar2 = new mqa(this, 1);
        this.N = mqaVar2;
        return mqaVar2;
    }

    public final void l(int i) {
        int i2;
        int i3;
        int iJ;
        int[] iArr;
        Object[] objArr = this.E;
        objArr.getClass();
        objArr[i] = null;
        Object[] objArr2 = this.F;
        if (objArr2 != null) {
            objArr2[i] = null;
        }
        int length = this.G[i];
        loop0: while (true) {
            int i4 = length;
            int i5 = 0;
            do {
                length = length == 0 ? this.H.length - 1 : length - 1;
                int[] iArr2 = this.H;
                i2 = iArr2[length];
                i5++;
                if (i5 > this.I) {
                    iArr2[i4] = 0;
                    break loop0;
                } else if (i2 == 0) {
                    iArr2[i4] = 0;
                    break loop0;
                } else {
                    i3 = i2 - 1;
                    iJ = j(this.E[i3]) - length;
                    iArr = this.H;
                }
            } while ((iJ & (iArr.length - 1)) < i5);
            iArr[i4] = i2;
            this.G[i3] = i4;
        }
        this.G[i] = -1;
        this.M--;
        this.L++;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        d();
        int iA = a(obj);
        Object[] objArr = this.F;
        if (objArr == null) {
            int length = this.E.length;
            if (length < 0) {
                sz6.p("capacity must be non-negative.");
                return null;
            }
            objArr = new Object[length];
            this.F = objArr;
        }
        if (iA >= 0) {
            objArr[iA] = obj2;
            return null;
        }
        int i = (-iA) - 1;
        Object obj3 = objArr[i];
        objArr[i] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        map.getClass();
        d();
        Set<Map.Entry> setEntrySet = map.entrySet();
        if (setEntrySet.isEmpty()) {
            return;
        }
        g(setEntrySet.size());
        for (Map.Entry entry : setEntrySet) {
            int iA = a(entry.getKey());
            Object[] objArr = this.F;
            if (objArr == null) {
                int length = this.E.length;
                if (length < 0) {
                    sz6.p("capacity must be non-negative.");
                    return;
                } else {
                    objArr = new Object[length];
                    this.F = objArr;
                }
            }
            if (iA >= 0) {
                objArr[iA] = entry.getValue();
            } else {
                int i = (-iA) - 1;
                if (!x44.r(entry.getValue(), objArr[i])) {
                    objArr[i] = entry.getValue();
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        d();
        int iH = h(obj);
        if (iH < 0) {
            return null;
        }
        Object[] objArr = this.F;
        objArr.getClass();
        Object obj2 = objArr[iH];
        l(iH);
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.M;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.M * 3) + 2);
        sb.append("{");
        int i = 0;
        jqa jqaVar = new jqa(this, 0);
        while (jqaVar.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            int i2 = jqaVar.F;
            lqa lqaVar = jqaVar.E;
            if (i2 >= lqaVar.J) {
                pmf.d();
                return null;
            }
            jqaVar.F = i2 + 1;
            jqaVar.G = i2;
            Object obj = lqaVar.E[i2];
            if (obj == lqaVar) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object[] objArr = lqaVar.F;
            objArr.getClass();
            Object obj2 = objArr[jqaVar.G];
            if (obj2 == lqaVar) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            jqaVar.c();
            i++;
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        nqa nqaVar = this.O;
        if (nqaVar != null) {
            return nqaVar;
        }
        nqa nqaVar2 = new nqa(this);
        this.O = nqaVar2;
        return nqaVar2;
    }

    public lqa() {
        this(8);
    }
}
