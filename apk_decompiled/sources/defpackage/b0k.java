package defpackage;

import java.util.Arrays;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b0k extends upj implements Set {
    public static final /* synthetic */ int I = 0;
    public transient pzj H;

    public static b0k o(int i, Object... objArr) {
        if (i == 0) {
            return j2k.P;
        }
        if (i == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new b3k(obj);
        }
        int iP = p(i);
        Object[] objArr2 = new Object[iP];
        int i2 = iP - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object obj2 = objArr[i5];
            if (obj2 == null) {
                mr9.h(grc.p(i5, "at index "));
                return null;
            }
            int iHashCode = obj2.hashCode();
            int iRotateLeft = (int) (((long) Integer.rotateLeft((int) (((long) iHashCode) * (-862048943)), 15)) * 461845907);
            while (true) {
                int i6 = iRotateLeft & i2;
                Object obj3 = objArr2[i6];
                if (obj3 == null) {
                    objArr[i4] = obj2;
                    objArr2[i6] = obj2;
                    i3 += iHashCode;
                    i4++;
                    break;
                }
                if (!obj3.equals(obj2)) {
                    iRotateLeft++;
                }
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new b3k(obj4);
        }
        if (p(i4) < iP / 2) {
            return o(i4, objArr);
        }
        if (i4 <= 0) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new j2k(i3, i2, i4, objArr, objArr2);
    }

    public static int p(int i) {
        int iMax = Math.max(i, 2);
        if (iMax < 751619276) {
            int iHighestOneBit = Integer.highestOneBit(iMax - 1);
            do {
                iHighestOneBit += iHighestOneBit;
            } while (((double) iHighestOneBit) * 0.7d < iMax);
            return iHighestOneBit;
        }
        if (iMax < 1073741824) {
            return 1073741824;
        }
        sz6.p("collection too large");
        return 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof b0k) && (this instanceof j2k) && (((b0k) obj) instanceof j2k) && ((j2k) this).K != obj.hashCode()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        try {
            if (size() == set.size()) {
                return containsAll(set);
            }
            return false;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return tpk.l(this);
    }

    public pzj q() {
        pzj pzjVar = this.H;
        if (pzjVar != null) {
            return pzjVar;
        }
        pzj pzjVarR = r();
        this.H = pzjVarR;
        return pzjVarR;
    }

    public pzj r() {
        Object[] array = toArray(upj.G);
        fyj fyjVar = pzj.H;
        return pzj.q(array.length, array);
    }
}
